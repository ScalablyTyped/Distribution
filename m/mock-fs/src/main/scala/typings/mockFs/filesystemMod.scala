package typings.mockFs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesystemMod {
  
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
  }
  
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
  /* static member */
  @JSImport("mock-fs/lib/filesystem", "create")
  @js.native
  def create(): FileSystem = js.native
  @JSImport("mock-fs/lib/filesystem", "create")
  @js.native
  def create(paths: js.UndefOr[scala.Nothing], options: Options): FileSystem = js.native
  @JSImport("mock-fs/lib/filesystem", "create")
  @js.native
  def create(paths: DirectoryItems): FileSystem = js.native
  @JSImport("mock-fs/lib/filesystem", "create")
  @js.native
  def create(paths: DirectoryItems, options: Options): FileSystem = js.native
  
  /**
    * Generate a factory for new symbolic links.
    *
    * @param config File config.
    * @return Factory that creates a new symbolic link.
    */
  /* static member */
  @JSImport("mock-fs/lib/filesystem", "directory")
  @js.native
  def directory(): js.Function0[typings.mockFs.directoryMod.^] = js.native
  @JSImport("mock-fs/lib/filesystem", "directory")
  @js.native
  def directory(config: DirectoryOptions): js.Function0[typings.mockFs.directoryMod.^] = js.native
  
  /**
    * Generate a factory for new files.
    *
    * @param config File config.
    * @return Factory that creates a new file.
    */
  /* static member */
  @JSImport("mock-fs/lib/filesystem", "file")
  @js.native
  def file(): js.Function0[typings.mockFs.fileMod.^] = js.native
  @JSImport("mock-fs/lib/filesystem", "file")
  @js.native
  def file(config: FileOptions): js.Function0[typings.mockFs.fileMod.^] = js.native
  
  @JSImport("mock-fs/lib/filesystem", "getPathParts")
  @js.native
  def getPathParts(filepath: String): js.Array[String] = js.native
  
  /**
    * Generate a factory for new directories.
    *
    * @param config File config.
    * @return Factory that creates a new directory.
    */
  /* static member */
  @JSImport("mock-fs/lib/filesystem", "symlink")
  @js.native
  def symlink(config: SymlinkOptions): js.Function0[typings.mockFs.symlinkMod.^] = js.native
  
  type DirectoryItem = String | Buffer | (js.Function0[
    typings.mockFs.fileMod.^ | typings.mockFs.directoryMod.^ | typings.mockFs.symlinkMod.^
  ]) | DirectoryItems
  
  @js.native
  trait DirectoryItems extends /* name */ StringDictionary[DirectoryItem]
  object DirectoryItems {
    
    @scala.inline
    def apply(): DirectoryItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryItems]
    }
  }
  
  @js.native
  trait DirectoryOptions extends StObject {
    
    /**
      * The last directory access time. Defaults to `new Date()`.
      */
    var atime: js.UndefOr[Date] = js.native
    
    /**
      * The time of directory creation. Defaults to `new Date()`.
      */
    var birthtime: js.UndefOr[Date] = js.native
    
    /**
      * The last directory change time. Defaults to `new Date()`. Updated
      * when owner or permissions change.
      */
    var ctime: js.UndefOr[Date] = js.native
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.native
    
    /**
      * Directory contents. Members will generate additional files,
      * directories, or symlinks.
      */
    var items: js.UndefOr[DirectoryItems] = js.native
    
    /** Directory mode (permission and sticky bits). Defaults to `0777`. */
    var mode: js.UndefOr[Double] = js.native
    
    /**
      * The last directory modification time. Defaults to `new Date()`.
      * Updated when an item is added, removed, or renamed.
      */
    var mtime: js.UndefOr[Date] = js.native
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.native
  }
  object DirectoryOptions {
    
    @scala.inline
    def apply(): DirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    @scala.inline
    implicit class DirectoryOptionsMutableBuilder[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      @scala.inline
      def setBirthtime(value: Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthtimeUndefined: Self = StObject.set(x, "birthtime", js.undefined)
      
      @scala.inline
      def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setItems(value: DirectoryItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  @js.native
  trait FileOptions extends StObject {
    
    /**
      * The last file access time. Defaults to `new Date()`. Updated when
      * file contents are accessed.
      */
    var atime: js.UndefOr[Date] = js.native
    
    /**
      * The time of file creation. Defaults to `new Date()`.
      */
    var birthtime: js.UndefOr[Date] = js.native
    
    /** File contents */
    var content: js.UndefOr[String | Buffer] = js.native
    
    /**
      * The last file change time. Defaults to `new Date()`. Updated when
      * file owner or permissions change.
      */
    var ctime: js.UndefOr[Date] = js.native
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.native
    
    /** File mode (permission and sticky bits). Defaults to `0666`. */
    var mode: js.UndefOr[Double] = js.native
    
    /**
      * The last file modification time. Defaults to `new Date()`. Updated
      * when file contents change.
      */
    var mtime: js.UndefOr[Date] = js.native
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.native
  }
  object FileOptions {
    
    @scala.inline
    def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      @scala.inline
      def setBirthtime(value: Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthtimeUndefined: Self = StObject.set(x, "birthtime", js.undefined)
      
      @scala.inline
      def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  @js.native
  trait FileSystem extends StObject {
    
    /**
      * Get a file system item.
      *
      * @param filepath Path to item.
      * @return The item (or null if not found).
      */
    def getItem(filepath: String): typings.mockFs.itemMod.^ = js.native
    
    /** Get the root directory. */
    def getRoot(): typings.mockFs.directoryMod.^ = js.native
  }
  object FileSystem {
    
    @scala.inline
    def apply(getItem: String => typings.mockFs.itemMod.^, getRoot: () => typings.mockFs.directoryMod.^): FileSystem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getRoot = js.Any.fromFunction0(getRoot))
      __obj.asInstanceOf[FileSystem]
    }
    
    @scala.inline
    implicit class FileSystemMutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => typings.mockFs.itemMod.^): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRoot(value: () => typings.mockFs.directoryMod.^): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LoaderOptions extends StObject {
    
    /** File content isn't loaded until explicitly read. */
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    /** Load all files and directories recursively. */
    var recursive: js.UndefOr[Boolean] = js.native
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Create a directory for `process.cwd()`. This is `true` by default.
      */
    var createCwd: js.UndefOr[Boolean] = js.native
    
    /**
      * Create a directory for `os.tmpdir()`. This is `true` by default.
      */
    var createTmp: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateCwd(value: Boolean): Self = StObject.set(x, "createCwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateCwdUndefined: Self = StObject.set(x, "createCwd", js.undefined)
      
      @scala.inline
      def setCreateTmp(value: Boolean): Self = StObject.set(x, "createTmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTmpUndefined: Self = StObject.set(x, "createTmp", js.undefined)
    }
  }
  
  @js.native
  trait SymlinkOptions extends StObject {
    
    /** The last symlink access time. Defaults to `new Date()`. */
    var atime: js.UndefOr[Date] = js.native
    
    /** The time of symlink creation. Defaults to `new Date()`. */
    var birthtime: js.UndefOr[Date] = js.native
    
    /** The last symlink change time. Defaults to `new Date()`. */
    var ctime: js.UndefOr[Date] = js.native
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.native
    
    /** Symlink mode (permission and sticky bits). Defaults to `0666`. */
    var mode: js.UndefOr[Double] = js.native
    
    /** The last symlink modification time. Defaults to `new Date()`. */
    var mtime: js.UndefOr[Date] = js.native
    
    /** Path to the source (required). */
    var path: String = js.native
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.native
  }
  object SymlinkOptions {
    
    @scala.inline
    def apply(path: String): SymlinkOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymlinkOptions]
    }
    
    @scala.inline
    implicit class SymlinkOptionsMutableBuilder[Self <: SymlinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      @scala.inline
      def setBirthtime(value: Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthtimeUndefined: Self = StObject.set(x, "birthtime", js.undefined)
      
      @scala.inline
      def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
