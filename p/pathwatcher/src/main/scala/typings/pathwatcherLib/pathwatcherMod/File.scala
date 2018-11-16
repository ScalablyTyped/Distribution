package typings
package pathwatcherLib.pathwatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathwatcher", "File")
@js.native
class File protected () extends js.Object {
  // Construction
  /** Configures a new File instance, no files are accessed. */
  def this(filePath: java.lang.String) = this()
  // Construction
  /** Configures a new File instance, no files are accessed. */
  def this(filePath: java.lang.String, symlink: scala.Boolean) = this()
  var path: java.lang.String = js.native
  // Properties
  var realPath: java.lang.String | scala.Null = js.native
  var symlink: scala.Boolean = js.native
  /**
       *  Creates the file on disk that corresponds to ::getPath() if no such file
       *  already exists.
       */
  def create(): stdLib.Promise[scala.Boolean] = js.native
  /** Returns a stream to read the content of the file. */
  def createReadStream(): nodeLib.fsMod.ReadStream = js.native
  /** Returns a stream to write content to the file. */
  def createWriteStream(): nodeLib.fsMod.WriteStream = js.native
  /**
       *  Returns a promise that resolves to a boolean, true if the file exists,
       *  false otherwise.
       */
  def exists(): stdLib.Promise[scala.Boolean] = js.native
  /** Returns a boolean, true if the file exists, false otherwise. */
  def existsSync(): scala.Boolean = js.native
  /** Return the string filename without any directory information. */
  def getBaseName(): java.lang.String = js.native
  /** Get the SHA-1 digest of this file. */
  def getDigest(): stdLib.Promise[java.lang.String] = js.native
  /** Get the SHA-1 digest of this file. */
  def getDigestSync(): java.lang.String = js.native
  /** Returns the string encoding name for this file (default: "utf8"). */
  def getEncoding(): java.lang.String = js.native
  // Traversing
  /** Return the Directory that contains this file. */
  def getParent(): Directory = js.native
  // Managing Paths
  /** Returns the string path for the file. */
  def getPath(): java.lang.String = js.native
  /**
       *  Returns a promise that resolves to the file's completely resolved
       *  string path.
       */
  def getRealPath(): stdLib.Promise[java.lang.String] = js.native
  /** Returns this file's completely resolved string path. */
  def getRealPathSync(): java.lang.String = js.native
  /** Returns a boolean, always false. */
  def isDirectory(): scala.Boolean = js.native
  // File Metadata
  /** Returns a boolean, always true. */
  def isFile(): scala.Boolean = js.native
  /** Returns a boolean indicating whether or not this is a symbolic link. */
  def isSymbolicLink(): scala.Boolean = js.native
  // Event Subscription
  /** Invoke the given callback when the file's contents change. */
  def onDidChange(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when the file is deleted. */
  def onDidDelete(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when the file's path changes. */
  def onDidRename(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
       *  Invoke the given callback when there is an error with the watch. When
       *  your callback has been invoked, the file will have unsubscribed from the
       *  file watches.
       */
  def onWillThrowWatchError(callback: js.Function1[/* errorObject */ PathWatchErrorThrownEvent, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  // Reading and Writing
  /** Reads the contents of the file. */
  def read(): stdLib.Promise[java.lang.String] = js.native
  // Reading and Writing
  /** Reads the contents of the file. */
  def read(flushCache: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
  /** Sets the file's character set encoding name. */
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  /** Overwrites the file with the given text. */
  def write(text: java.lang.String): stdLib.Promise[js.UndefOr[scala.Nothing]] = js.native
  /** Overwrites the file with the given text. */
  def writeSync(text: java.lang.String): js.UndefOr[scala.Nothing] = js.native
}

