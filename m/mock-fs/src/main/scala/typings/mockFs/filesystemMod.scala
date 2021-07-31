package typings.mockFs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  class ^ ()
    extends StObject
       with FileSystem {
    def this(options: Options) = this()
    
    /**
      * Get a file system item.
      *
      * @param filepath Path to item.
      * @return The item (or null if not found).
      */
    /* CompleteClass */
    override def getItem(filepath: String): typings.mockFs.itemMod.^ = js.native
    
    /** Get the root directory. */
    /* CompleteClass */
    override def getRoot(): typings.mockFs.directoryMod.^ = js.native
  }
  @JSImport("mock-fs/lib/filesystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def create(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FileSystem]
  @scala.inline
  def create(paths: Unit, options: Options): FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileSystem]
  @scala.inline
  def create(paths: DirectoryItems): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(paths.asInstanceOf[js.Any]).asInstanceOf[FileSystem]
  @scala.inline
  def create(paths: DirectoryItems, options: Options): FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileSystem]
  
  /**
    * Generate a factory for new symbolic links.
    *
    * @param config File config.
    * @return Factory that creates a new symbolic link.
    */
  /* static member */
  @scala.inline
  def directory(): js.Function0[typings.mockFs.directoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")().asInstanceOf[js.Function0[typings.mockFs.directoryMod.^]]
  @scala.inline
  def directory(config: DirectoryOptions): js.Function0[typings.mockFs.directoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.directoryMod.^]]
  
  /**
    * Generate a factory for new files.
    *
    * @param config File config.
    * @return Factory that creates a new file.
    */
  /* static member */
  @scala.inline
  def file(): js.Function0[typings.mockFs.fileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Function0[typings.mockFs.fileMod.^]]
  @scala.inline
  def file(config: FileOptions): js.Function0[typings.mockFs.fileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.fileMod.^]]
  
  @scala.inline
  def getPathParts(filepath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParts")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Generate a factory for new directories.
    *
    * @param config File config.
    * @return Factory that creates a new directory.
    */
  /* static member */
  @scala.inline
  def symlink(config: SymlinkOptions): js.Function0[typings.mockFs.symlinkMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.symlinkMod.^]]
  
  type DirectoryItem = String | Buffer | (js.Function0[
    typings.mockFs.fileMod.^ | typings.mockFs.directoryMod.^ | typings.mockFs.symlinkMod.^
  ]) | DirectoryItems
  
  trait DirectoryItems
    extends StObject
       with /* name */ StringDictionary[DirectoryItem]
  object DirectoryItems {
    
    @scala.inline
    def apply(): DirectoryItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryItems]
    }
  }
  
  trait DirectoryOptions extends StObject {
    
    /**
      * The last directory access time. Defaults to `new Date()`.
      */
    var atime: js.UndefOr[Date] = js.undefined
    
    /**
      * The time of directory creation. Defaults to `new Date()`.
      */
    var birthtime: js.UndefOr[Date] = js.undefined
    
    /**
      * The last directory change time. Defaults to `new Date()`. Updated
      * when owner or permissions change.
      */
    var ctime: js.UndefOr[Date] = js.undefined
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      * Directory contents. Members will generate additional files,
      * directories, or symlinks.
      */
    var items: js.UndefOr[DirectoryItems] = js.undefined
    
    /** Directory mode (permission and sticky bits). Defaults to `0777`. */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * The last directory modification time. Defaults to `new Date()`.
      * Updated when an item is added, removed, or renamed.
      */
    var mtime: js.UndefOr[Date] = js.undefined
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.undefined
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
  
  trait FileOptions extends StObject {
    
    /**
      * The last file access time. Defaults to `new Date()`. Updated when
      * file contents are accessed.
      */
    var atime: js.UndefOr[Date] = js.undefined
    
    /**
      * The time of file creation. Defaults to `new Date()`.
      */
    var birthtime: js.UndefOr[Date] = js.undefined
    
    /** File contents */
    var content: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * The last file change time. Defaults to `new Date()`. Updated when
      * file owner or permissions change.
      */
    var ctime: js.UndefOr[Date] = js.undefined
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.undefined
    
    /** File mode (permission and sticky bits). Defaults to `0666`. */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * The last file modification time. Defaults to `new Date()`. Updated
      * when file contents change.
      */
    var mtime: js.UndefOr[Date] = js.undefined
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.undefined
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
  
  trait FileSystem extends StObject {
    
    /**
      * Get a file system item.
      *
      * @param filepath Path to item.
      * @return The item (or null if not found).
      */
    def getItem(filepath: String): typings.mockFs.itemMod.^
    
    /** Get the root directory. */
    def getRoot(): typings.mockFs.directoryMod.^
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
  
  trait LoaderOptions extends StObject {
    
    /** File content isn't loaded until explicitly read. */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /** Load all files and directories recursively. */
    var recursive: js.UndefOr[Boolean] = js.undefined
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
  
  trait Options extends StObject {
    
    /**
      * Create a directory for `process.cwd()`. This is `true` by default.
      */
    var createCwd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Create a directory for `os.tmpdir()`. This is `true` by default.
      */
    var createTmp: js.UndefOr[Boolean] = js.undefined
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
  
  trait SymlinkOptions extends StObject {
    
    /** The last symlink access time. Defaults to `new Date()`. */
    var atime: js.UndefOr[Date] = js.undefined
    
    /** The time of symlink creation. Defaults to `new Date()`. */
    var birthtime: js.UndefOr[Date] = js.undefined
    
    /** The last symlink change time. Defaults to `new Date()`. */
    var ctime: js.UndefOr[Date] = js.undefined
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.undefined
    
    /** Symlink mode (permission and sticky bits). Defaults to `0666`. */
    var mode: js.UndefOr[Double] = js.undefined
    
    /** The last symlink modification time. Defaults to `new Date()`. */
    var mtime: js.UndefOr[Date] = js.undefined
    
    /** Path to the source (required). */
    var path: String
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.undefined
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
