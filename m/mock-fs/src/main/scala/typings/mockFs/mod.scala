package typings.mockFs

import typings.mockFs.filesystemMod.DirectoryItem
import typings.mockFs.filesystemMod.DirectoryItems
import typings.mockFs.filesystemMod.DirectoryOptions
import typings.mockFs.filesystemMod.FileOptions
import typings.mockFs.filesystemMod.LoaderOptions
import typings.mockFs.filesystemMod.Options
import typings.mockFs.filesystemMod.SymlinkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(config: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(config: DirectoryItems): Unit = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(config: DirectoryItems, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mock-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Temporarily bypass the mocked file system and load directly from the real file system.
    *
    * @example
    * const filePath = '/path/file.json';
    * const data = mock.bypass(() => fs.readFileSync(filePath, 'utf-8'));
    */
  @scala.inline
  def bypass[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("bypass")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Create a directory factory.
    */
  @scala.inline
  def directory(): js.Function0[typings.mockFs.directoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")().asInstanceOf[js.Function0[typings.mockFs.directoryMod.^]]
  @scala.inline
  def directory(config: DirectoryOptions): js.Function0[typings.mockFs.directoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.directoryMod.^]]
  
  /**
    * Create a file factory.
    */
  @scala.inline
  def file(): js.Function0[typings.mockFs.fileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Function0[typings.mockFs.fileMod.^]]
  @scala.inline
  def file(config: FileOptions): js.Function0[typings.mockFs.fileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.fileMod.^]]
  
  /**
    * Get hold of the mocked filesystem's 'root'
    * If fs hasn't currently been replaced, this will return an empty object
    */
  @scala.inline
  def getMockRoot(): typings.mockFs.directoryMod.^ | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getMockRoot")().asInstanceOf[typings.mockFs.directoryMod.^ | js.Object]
  
  /**
    * Load a real file/folder into the mock file system.
    */
  @scala.inline
  def load(path: String): DirectoryItem = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[DirectoryItem]
  @scala.inline
  def load(path: String, options: LoaderOptions): DirectoryItem = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DirectoryItem]
  
  /**
    * Restore the fs bindings for the real file system.
    */
  @scala.inline
  def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  
  /**
    * Create a symbolic link factory.
    */
  @scala.inline
  def symlink(config: SymlinkOptions): js.Function0[typings.mockFs.symlinkMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.symlinkMod.^]]
}
