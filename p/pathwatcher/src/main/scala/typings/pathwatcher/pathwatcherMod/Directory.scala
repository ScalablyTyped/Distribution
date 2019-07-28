package typings.pathwatcher.pathwatcherMod

import typings.eventDashKit.eventDashKitMod.Disposable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathwatcher", "Directory")
@js.native
class Directory protected () extends js.Object {
  // Construction
  /** Configures a new Directory instance, no files are accessed. */
  def this(directoryPath: String) = this()
  def this(directoryPath: String, symlink: Boolean) = this()
  var path: String = js.native
  // Properties
  var realPath: String | Null = js.native
  var symlink: Boolean = js.native
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
  def getEntries(callback: js.Function2[/* error */ Error, /* entries */ js.Array[File | this.type], Unit]): Unit = js.native
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
  /** Returns the relative string path to the given path from this directory. */
  def relativize(fullPath: String): String = js.native
}

