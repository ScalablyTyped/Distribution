package typings.pathwatcher

import typings.eventKit.mod.Disposable
import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pathwatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pathwatcher", "Directory")
  @js.native
  open class Directory protected () extends StObject {
    // Construction
    /** Configures a new Directory instance, no files are accessed. */
    def this(directoryPath: String) = this()
    def this(directoryPath: String, symlink: Boolean) = this()
    
    /**
      *  Determines if the given path (real or symbolic) is inside this directory. This
      *  method does not actually check if the path exists, it just checks if the path
      *  is under this directory.
      */
    def contains(pathToCheck: String): Boolean = js.native
    
    /**
      *  Creates the directory on disk that corresponds to ::getPath() if no such
      *  directory already exists.
      */
    def create(): js.Promise[Boolean] = js.native
    def create(mode: Double): js.Promise[Boolean] = js.native
    
    /**
      *  Returns a promise that resolves to a boolean, true if the directory
      *  exists, false otherwise.
      */
    def exists(): js.Promise[Boolean] = js.native
    
    /** Returns a boolean, true if the directory exists, false otherwise. */
    def existsSync(): Boolean = js.native
    
    /** Returns the string basename of the directory. */
    def getBaseName(): String = js.native
    
    /** Reads file entries in this directory from disk asynchronously. */
    def getEntries(callback: js.Function2[/* error */ js.Error, /* entries */ js.Array[File | this.type], Unit]): Unit = js.native
    
    /** Reads file entries in this directory from disk synchronously. */
    def getEntriesSync(): js.Array[File | Directory] = js.native
    
    /**
      *  Traverse within this Directory to a child File. This method doesn't actually
      *  check to see if the File exists, it just creates the File object.
      */
    def getFile(filename: String): File = js.native
    
    // Traversing
    /** Traverse to the parent directory. */
    def getParent(): Directory = js.native
    
    // Managing Paths
    /**
      *  This may include unfollowed symlinks or relative directory entries.
      *  Or it may be fully resolved, it depends on what you give it.
      */
    def getPath(): String = js.native
    
    /**
      *  All relative directory entries are removed and symlinks are resolved to
      *  their final destination.
      */
    def getRealPathSync(): String = js.native
    
    /**
      *  Traverse within this a Directory to a child Directory. This method doesn't actually
      *  check to see if the Directory exists, it just creates the Directory object.
      */
    def getSubdirectory(dirname: String): Directory = js.native
    
    /** Returns a roolean, always true. */
    def isDirectory(): Boolean = js.native
    
    // Directory Metadata
    /** Returns a boolean, always false. */
    def isFile(): Boolean = js.native
    
    /**
      *  Return a boolean, true if this Directory is the root directory of the
      *  filesystem, or false if it isn't.
      */
    def isRoot(): Boolean = js.native
    
    /** Returns a boolean indicating whether or not this is a symbolic link. */
    def isSymbolicLink(): Boolean = js.native
    
    // Event Subscription
    /** Invoke the given callback when the directory's contents change. */
    def onDidChange(callback: js.Function0[Unit]): Disposable = js.native
    
    var path: String = js.native
    
    // Properties
    var realPath: String | Null = js.native
    
    /** Returns the relative string path to the given path from this directory. */
    def relativize(fullPath: String): String = js.native
    
    var symlink: Boolean = js.native
  }
  
  @JSImport("pathwatcher", "File")
  @js.native
  open class File protected () extends StObject {
    // Construction
    /** Configures a new File instance, no files are accessed. */
    def this(filePath: String) = this()
    def this(filePath: String, symlink: Boolean) = this()
    
    /**
      *  Creates the file on disk that corresponds to ::getPath() if no such file
      *  already exists.
      */
    def create(): js.Promise[Boolean] = js.native
    
    /** Returns a stream to read the content of the file. */
    def createReadStream(): ReadStream = js.native
    
    /** Returns a stream to write content to the file. */
    def createWriteStream(): WriteStream = js.native
    
    /**
      *  Returns a promise that resolves to a boolean, true if the file exists,
      *  false otherwise.
      */
    def exists(): js.Promise[Boolean] = js.native
    
    /** Returns a boolean, true if the file exists, false otherwise. */
    def existsSync(): Boolean = js.native
    
    /** Return the string filename without any directory information. */
    def getBaseName(): String = js.native
    
    /** Get the SHA-1 digest of this file. */
    def getDigest(): js.Promise[String] = js.native
    
    /** Get the SHA-1 digest of this file. */
    def getDigestSync(): String = js.native
    
    /** Returns the string encoding name for this file (default: "utf8"). */
    def getEncoding(): String = js.native
    
    // Traversing
    /** Return the Directory that contains this file. */
    def getParent(): Directory = js.native
    
    // Managing Paths
    /** Returns the string path for the file. */
    def getPath(): String = js.native
    
    /**
      *  Returns a promise that resolves to the file's completely resolved
      *  string path.
      */
    def getRealPath(): js.Promise[String] = js.native
    
    /** Returns this file's completely resolved string path. */
    def getRealPathSync(): String = js.native
    
    /** Returns a boolean, always false. */
    def isDirectory(): Boolean = js.native
    
    // File Metadata
    /** Returns a boolean, always true. */
    def isFile(): Boolean = js.native
    
    /** Returns a boolean indicating whether or not this is a symbolic link. */
    def isSymbolicLink(): Boolean = js.native
    
    // Event Subscription
    /** Invoke the given callback when the file's contents change. */
    def onDidChange(callback: js.Function0[Unit]): Disposable = js.native
    
    /** Invoke the given callback when the file is deleted. */
    def onDidDelete(callback: js.Function0[Unit]): Disposable = js.native
    
    /** Invoke the given callback when the file's path changes. */
    def onDidRename(callback: js.Function0[Unit]): Disposable = js.native
    
    /**
      *  Invoke the given callback when there is an error with the watch. When
      *  your callback has been invoked, the file will have unsubscribed from the
      *  file watches.
      */
    def onWillThrowWatchError(callback: js.Function1[/* errorObject */ PathWatchErrorThrownEvent, Unit]): Disposable = js.native
    
    var path: String = js.native
    
    // Reading and Writing
    /** Reads the contents of the file. */
    def read(): js.Promise[String] = js.native
    def read(flushCache: Boolean): js.Promise[String] = js.native
    
    // Properties
    var realPath: String | Null = js.native
    
    /** Sets the file's character set encoding name. */
    def setEncoding(encoding: String): Unit = js.native
    
    var symlink: Boolean = js.native
    
    /** Overwrites the file with the given text. */
    def write(text: String): js.Promise[Unit] = js.native
    
    /** Overwrites the file with the given text. */
    def writeSync(text: String): Unit = js.native
  }
  
  inline def closeAllWatchers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAllWatchers")().asInstanceOf[Unit]
  
  inline def getWatchedPaths(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWatchedPaths")().asInstanceOf[js.Array[String]]
  
  inline def watch(): PathWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")().asInstanceOf[PathWatcher]
  
  trait PathWatchErrorThrownEvent extends StObject {
    
    /** The error object. */
    var error: js.Error
    
    /**
      *  Call this function to indicate you have handled the error.
      *  The error will not be thrown if this function is called.
      */
    def handle(): Unit
  }
  object PathWatchErrorThrownEvent {
    
    inline def apply(error: js.Error, handle: () => Unit): PathWatchErrorThrownEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
      __obj.asInstanceOf[PathWatchErrorThrownEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathWatchErrorThrownEvent] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: () => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction0(value))
    }
  }
  
  trait PathWatcher extends StObject {
    
    def close(): Unit
    
    def onDidChange(callback: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit]): Disposable
  }
  object PathWatcher {
    
    inline def apply(
      close: () => Unit,
      onDidChange: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit] => Disposable
    ): PathWatcher = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onDidChange = js.Any.fromFunction1(onDidChange))
      __obj.asInstanceOf[PathWatcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathWatcher] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOnDidChange(value: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidChange", js.Any.fromFunction1(value))
    }
  }
  
  trait WatchedFilePathChangedEvent extends StObject {
    
    var event: String
    
    var newFilePath: String
  }
  object WatchedFilePathChangedEvent {
    
    inline def apply(event: String, newFilePath: String): WatchedFilePathChangedEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], newFilePath = newFilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchedFilePathChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchedFilePathChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNewFilePath(value: String): Self = StObject.set(x, "newFilePath", value.asInstanceOf[js.Any])
    }
  }
}
