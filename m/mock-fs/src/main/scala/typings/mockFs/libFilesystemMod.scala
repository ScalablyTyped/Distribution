package typings.mockFs

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilesystemMod {
  
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
  open class ^ ()
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
    override def getItem(filepath: String): typings.mockFs.libItemMod.^ = js.native
    
    /** Get the root directory. */
    /* CompleteClass */
    override def getRoot(): typings.mockFs.libDirectoryMod.^ = js.native
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
  inline def create(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FileSystem]
  inline def create(paths: Unit, options: Options): FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileSystem]
  inline def create(paths: DirectoryItems): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(paths.asInstanceOf[js.Any]).asInstanceOf[FileSystem]
  inline def create(paths: DirectoryItems, options: Options): FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileSystem]
  
  /**
    * Generate a factory for new symbolic links.
    *
    * @param config File config.
    * @return Factory that creates a new symbolic link.
    */
  /* static member */
  inline def directory(): js.Function0[typings.mockFs.libDirectoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")().asInstanceOf[js.Function0[typings.mockFs.libDirectoryMod.^]]
  inline def directory(config: DirectoryOptions): js.Function0[typings.mockFs.libDirectoryMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.libDirectoryMod.^]]
  
  /**
    * Generate a factory for new files.
    *
    * @param config File config.
    * @return Factory that creates a new file.
    */
  /* static member */
  inline def file(): js.Function0[typings.mockFs.libFileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Function0[typings.mockFs.libFileMod.^]]
  inline def file(config: FileOptions): js.Function0[typings.mockFs.libFileMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.libFileMod.^]]
  
  inline def getPathParts(filepath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParts")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Generate a factory for new directories.
    *
    * @param config File config.
    * @return Factory that creates a new directory.
    */
  /* static member */
  inline def symlink(config: SymlinkOptions): js.Function0[typings.mockFs.libSymlinkMod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.mockFs.libSymlinkMod.^]]
  
  type DirectoryItem = String | Buffer | (js.Function0[
    typings.mockFs.libFileMod.^ | typings.mockFs.libDirectoryMod.^ | typings.mockFs.libSymlinkMod.^
  ]) | DirectoryItems
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DirectoryItems = {[name: string] : mock-fs.mock-fs/lib/filesystem.DirectoryItem}
  }}}
  to avoid circular code involving: 
  - mock-fs.mock-fs/lib/filesystem.DirectoryItem
  - mock-fs.mock-fs/lib/filesystem.DirectoryItems
  */
  trait DirectoryItems
    extends StObject
       with /* name */ StringDictionary[DirectoryItem]
  object DirectoryItems {
    
    inline def apply(): DirectoryItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryItems]
    }
  }
  
  trait DirectoryOptions extends StObject {
    
    /**
      * The last directory access time. Defaults to `new Date()`.
      */
    var atime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The time of directory creation. Defaults to `new Date()`.
      */
    var birthtime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The last directory change time. Defaults to `new Date()`. Updated
      * when owner or permissions change.
      */
    var ctime: js.UndefOr[js.Date] = js.undefined
    
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
    var mtime: js.UndefOr[js.Date] = js.undefined
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.undefined
  }
  object DirectoryOptions {
    
    inline def apply(): DirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBirthtimeUndefined: Self = StObject.set(x, "birthtime", js.undefined)
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setItems(value: DirectoryItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait FileOptions extends StObject {
    
    /**
      * The last file access time. Defaults to `new Date()`. Updated when
      * file contents are accessed.
      */
    var atime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The time of file creation. Defaults to `new Date()`.
      */
    var birthtime: js.UndefOr[js.Date] = js.undefined
    
    /** File contents */
    var content: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * The last file change time. Defaults to `new Date()`. Updated when
      * file owner or permissions change.
      */
    var ctime: js.UndefOr[js.Date] = js.undefined
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.undefined
    
    /** File mode (permission and sticky bits). Defaults to `0666`. */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * The last file modification time. Defaults to `new Date()`. Updated
      * when file contents change.
      */
    var mtime: js.UndefOr[js.Date] = js.undefined
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBirthtimeUndefined: Self = StObject.set(x, "birthtime", js.undefined)
      
      inline def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait FileSystem extends StObject {
    
    /**
      * Get a file system item.
      *
      * @param filepath Path to item.
      * @return The item (or null if not found).
      */
    def getItem(filepath: String): typings.mockFs.libItemMod.^
    
    /** Get the root directory. */
    def getRoot(): typings.mockFs.libDirectoryMod.^
  }
  object FileSystem {
    
    inline def apply(getItem: String => typings.mockFs.libItemMod.^, getRoot: () => typings.mockFs.libDirectoryMod.^): FileSystem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getRoot = js.Any.fromFunction0(getRoot))
      __obj.asInstanceOf[FileSystem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
      
      inline def setGetItem(value: String => typings.mockFs.libItemMod.^): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setGetRoot(value: () => typings.mockFs.libDirectoryMod.^): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
    }
  }
  
  trait LoaderOptions extends StObject {
    
    /** File content isn't loaded until explicitly read. */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /** Load all files and directories recursively. */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object LoaderOptions {
    
    inline def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCreateCwd(value: Boolean): Self = StObject.set(x, "createCwd", value.asInstanceOf[js.Any])
      
      inline def setCreateCwdUndefined: Self = StObject.set(x, "createCwd", js.undefined)
      
      inline def setCreateTmp(value: Boolean): Self = StObject.set(x, "createTmp", value.asInstanceOf[js.Any])
      
      inline def setCreateTmpUndefined: Self = StObject.set(x, "createTmp", js.undefined)
    }
  }
  
  trait SymlinkOptions extends StObject {
    
    /** The last symlink access time. Defaults to `new Date()`. */
    var atime: js.UndefOr[js.Date] = js.undefined
    
    /** The time of symlink creation. Defaults to `new Date()`. */
    var birthtime: js.UndefOr[js.Date] = js.undefined
    
    /** The last symlink change time. Defaults to `new Date()`. */
    var ctime: js.UndefOr[js.Date] = js.undefined
    
    /** The group id. Defaults to `process.getgid()`. */
    var gid: js.UndefOr[Double] = js.undefined
    
    /** Symlink mode (permission and sticky bits). Defaults to `0666`. */
    var mode: js.UndefOr[Double] = js.undefined
    
    /** The last symlink modification time. Defaults to `new Date()`. */
    var mtime: js.UndefOr[js.Date] = js.undefined
    
    /** Path to the source (required). */
    var path: String
    
    /** The user id. Defaults to `process.getuid()`. */
    var uid: js.UndefOr[Double] = js.undefined
  }
  object SymlinkOptions {
    
    inline def apply(path: String): SymlinkOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymlinkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SymlinkOptions] (val x: Self) extends AnyVal {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBirthtimeUndefined: Self = StObject.set(x, "birthtime", js.undefined)
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
