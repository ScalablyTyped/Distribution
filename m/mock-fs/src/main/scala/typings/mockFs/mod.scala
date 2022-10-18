package typings.mockFs

import typings.mockFs.libFilesystemMod.DirectoryItem
import typings.mockFs.libFilesystemMod.DirectoryItems
import typings.mockFs.libFilesystemMod.DirectoryOptions
import typings.mockFs.libFilesystemMod.FileOptions
import typings.mockFs.libFilesystemMod.LoaderOptions
import typings.mockFs.libFilesystemMod.Options
import typings.mockFs.libFilesystemMod.SymlinkOptions
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
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(config: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: DirectoryItems): Unit = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(config: DirectoryItems, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def bypass[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("bypass")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Create a directory factory.
    */
  inline def directory(): js.Function0[typings.mockFs.libDirectoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")().asInstanceOf[js.Function0[typings.mockFs.libDirectoryMod.^]]
  inline def directory(config: DirectoryOptions): js.Function0[typings.mockFs.libDirectoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.libDirectoryMod.^]]
  
  /**
    * Create a file factory.
    */
  inline def file(): js.Function0[typings.mockFs.libFileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Function0[typings.mockFs.libFileMod.^]]
  inline def file(config: FileOptions): js.Function0[typings.mockFs.libFileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.libFileMod.^]]
  
  /**
    * Get hold of the mocked filesystem's 'root'
    * If fs hasn't currently been replaced, this will return an empty object
    */
  inline def getMockRoot(): typings.mockFs.libDirectoryMod.^ | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getMockRoot")().asInstanceOf[typings.mockFs.libDirectoryMod.^ | js.Object]
  
  /**
    * Load a real file/folder into the mock file system.
    */
  inline def load(path: String): DirectoryItem = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[DirectoryItem]
  inline def load(path: String, options: LoaderOptions): DirectoryItem = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DirectoryItem]
  
  /**
    * Restore the fs bindings for the real file system.
    */
  inline def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  
  /**
    * Create a symbolic link factory.
    */
  inline def symlink(config: SymlinkOptions): js.Function0[typings.mockFs.libSymlinkMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.libSymlinkMod.^]]
}
