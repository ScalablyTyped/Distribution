package typings.pathwatcher.pathwatcherMod

import typings.eventDashKit.eventDashKitMod.Disposable
import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathwatcher", "File")
@js.native
class File protected () extends js.Object {
  // Construction
  /** Configures a new File instance, no files are accessed. */
  def this(filePath: String) = this()
  def this(filePath: String, symlink: Boolean) = this()
  var path: String = js.native
  // Properties
  var realPath: String | Null = js.native
  var symlink: Boolean = js.native
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
  // Reading and Writing
  /** Reads the contents of the file. */
  def read(): js.Promise[String] = js.native
  def read(flushCache: Boolean): js.Promise[String] = js.native
  /** Sets the file's character set encoding name. */
  def setEncoding(encoding: String): Unit = js.native
  /** Overwrites the file with the given text. */
  def write(text: String): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  /** Overwrites the file with the given text. */
  def writeSync(text: String): js.UndefOr[scala.Nothing] = js.native
}

