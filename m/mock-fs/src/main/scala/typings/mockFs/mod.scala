package typings.mockFs

import typings.mockFs.directoryMod.^
import typings.mockFs.filesystemMod.DirectoryItem
import typings.mockFs.filesystemMod.DirectoryItems
import typings.mockFs.filesystemMod.DirectoryOptions
import typings.mockFs.filesystemMod.FileOptions
import typings.mockFs.filesystemMod.LoaderOptions
import typings.mockFs.filesystemMod.Options
import typings.mockFs.filesystemMod.SymlinkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-fs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Swap out the fs bindings for a mock file system.
    *
    * _Note:_ Import this file _before_ any other modules that import the `fs`
    * module.
    *
    * @param config Mock file system configuration.
    * @param options Any filesystem options.
    * @param options.createCwd Create a directory for `process.cwd()` (defaults to
    *                          `true`).
    * @param options.createTmp Create a directory for `os.tmpdir()` (defaults to
    *                          `true`).
    */
  def apply(): Unit = js.native
  def apply(config: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(config: DirectoryItems): Unit = js.native
  def apply(config: DirectoryItems, options: Options): Unit = js.native
  
  /**
    * Temporarily bypass the mocked file system and load directly from the real file system.
    *
    * @example
    * const filePath = '/path/file.json';
    * const data = mock.bypass(() => fs.readFileSync(filePath, 'utf-8'));
    */
  def bypass[T](fn: js.Function0[T]): T = js.native
  
  /**
    * Create a directory factory.
    */
  def directory(): js.Function0[^] = js.native
  def directory(config: DirectoryOptions): js.Function0[^] = js.native
  
  /**
    * Create a file factory.
    */
  def file(): js.Function0[typings.mockFs.fileMod.^] = js.native
  def file(config: FileOptions): js.Function0[typings.mockFs.fileMod.^] = js.native
  
  /**
    * Get hold of the mocked filesystem's 'root'
    * If fs hasn't currently been replaced, this will return an empty object
    */
  def getMockRoot(): ^  | js.Object = js.native
  
  /**
    * Load a real file/folder into the mock file system.
    */
  def load(path: String): DirectoryItem = js.native
  def load(path: String, options: LoaderOptions): DirectoryItem = js.native
  
  /**
    * Restore the fs bindings for the real file system.
    */
  def restore(): Unit = js.native
  
  /**
    * Create a symbolic link factory.
    */
  def symlink(config: SymlinkOptions): js.Function0[typings.mockFs.symlinkMod.^] = js.native
}
