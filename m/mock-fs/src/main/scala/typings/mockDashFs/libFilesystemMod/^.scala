package typings.mockDashFs.libFilesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs/lib/filesystem", JSImport.Namespace)
@js.native
/**
  * Create a new file system.
  *
  * @param options Any filesystem options.
  * @param options.createCwd Create a directory for `process.cwd()` (defaults
  *                          to `true`).
  * @param options.createTmp Create a directory for `os.tmpdir()` (defaults
  *                          to `true`).
  */
class ^ () extends FileSystem {
  def this(options: Options) = this()
  /**
    * Get a file system item.
    *
    * @param filepath Path to item.
    * @return The item (or null if not found).
    */
  /* CompleteClass */
  override def getItem(filepath: String): typings.mockDashFs.libItemMod.^ = js.native
  /** Get the root directory. */
  /* CompleteClass */
  override def getRoot(): typings.mockDashFs.libDirectoryMod.^ = js.native
}

@JSImport("mock-fs/lib/filesystem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Configure a mock file system.
    *
    * @param paths Config object.
    * @param options Any filesystem options.
    * @param options.createCwd Create a directory for `process.cwd()` (defaults
    *                          to `true`).
    * @param options.createTmp Create a directory for `os.tmpdir()` (defaults
    *                          to `true`).
    * @return Mock file system.
    */
  def create(): FileSystem = js.native
  def create(paths: DirectoryItems): FileSystem = js.native
  def create(paths: DirectoryItems, options: Options): FileSystem = js.native
  /**
    * Generate a factory for new symbolic links.
    *
    * @param config File config.
    * @return Factory that creates a new symbolic link.
    */
  def directory(): js.Function0[this.type] = js.native
  def directory(config: DirectoryOptions): js.Function0[this.type] = js.native
  /**
    * Generate a factory for new files.
    *
    * @param config File config.
    * @return Factory that creates a new file.
    */
  def file(): js.Function0[this.type] = js.native
  def file(config: FileOptions): js.Function0[this.type] = js.native
  /**
    * Generate a factory for new directories.
    *
    * @param config File config.
    * @return Factory that creates a new directory.
    */
  def symlink(config: SymlinkOptions): js.Function0[this.type] = js.native
}

