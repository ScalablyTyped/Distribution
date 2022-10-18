package typings.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import typings.moduleDeps.anon.Basedir
import typings.moduleDeps.anon.Builtin
import typings.moduleDeps.anon.Dictprop
import typings.moduleDeps.anon.Entry
import typings.moduleDeps.anon.Modules
import typings.moduleDeps.anon.PackageObjectdirnamestrin
import typings.moduleDeps.anon.PartialParentObjectidstri
import typings.moduleDeps.moduleDepsStrings._package
import typings.moduleDeps.moduleDepsStrings.error
import typings.moduleDeps.moduleDepsStrings.file
import typings.moduleDeps.moduleDepsStrings.missing
import typings.moduleDeps.moduleDepsStrings.transform
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return an object transform stream 'd' that expects entry filenames or '{ id: ..., file: ... }' objects
    * as input and produces objects for every dependency from a recursive module traversal as output.
    */
  inline def apply(): ModuleDepsObject = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ModuleDepsObject]
  inline def apply(opts: Options): ModuleDepsObject = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ModuleDepsObject]
  
  @JSImport("module-deps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CacheCallback = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[PersistentCacheItem], Unit]
  
  trait InputRow extends StObject {
    
    var entry: js.UndefOr[Boolean] = js.undefined
    
    var expose: String
    
    var file: String
    
    var id: String
    
    var noparse: js.UndefOr[Boolean] = js.undefined
  }
  object InputRow {
    
    inline def apply(expose: String, file: String, id: String): InputRow = {
      val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputRow]
    }
    
    extension [Self <: InputRow](x: Self) {
      
      inline def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNoparse(value: Boolean): Self = StObject.set(x, "noparse", value.asInstanceOf[js.Any])
      
      inline def setNoparseUndefined: Self = StObject.set(x, "noparse", js.undefined)
    }
  }
  
  trait InputTransform extends StObject {
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var options: Any
    
    var transform: String | js.Function0[Any]
  }
  object InputTransform {
    
    inline def apply(options: Any, transform: String | js.Function0[Any]): InputTransform = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputTransform]
    }
    
    extension [Self <: InputTransform](x: Self) {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: String | js.Function0[Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformFunction0(value: () => Any): Self = StObject.set(x, "transform", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ModuleDepsObject
    extends StObject
       with ReadWriteStream {
    
    def _flush(): Unit = js.native
    
    def _isTopLevel(file: String): Boolean = js.native
    
    def _transform(row: String, enc: String, next: js.Function0[Unit]): Unit = js.native
    def _transform(row: InputRow, enc: String, next: js.Function0[Unit]): Unit = js.native
    def _transform(row: InputTransform, enc: String, next: js.Function0[Unit]): Unit = js.native
    
    def getTransforms(file: String, pkg: PackageObject): ReadWriteStream = js.native
    def getTransforms(file: String, pkg: PackageObject, opts: Builtin): ReadWriteStream = js.native
    
    def lookupPackage(file: String, cb: js.Function3[/* a */ Any, /* b */ Any, /* c */ js.UndefOr[Any], Any]): Unit = js.native
    
    /**
      * When a transform stream emits an error it is passed along to this stream an an 'error' event.
      */
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Any, Any]): this.type = js.native
    /**
      * Every time a file is read, this event fires with the file path.
      */
    @JSName("on")
    def on_file(event: file, listener: js.Function2[/* file */ String, /* id */ String, Any]): this.type = js.native
    /**
      * When opts.ignoreMissing is enabled, this event fires for each missing package.
      */
    @JSName("on")
    def on_missing(event: missing, listener: js.Function2[/* id */ String, /* parent */ Dictprop, Any]): this.type = js.native
    /**
      * Every time a package is read, this event fires. The directory name of the package is available in pkg.__dirname.
      */
    @JSName("on")
    def on_package(event: _package, listener: js.Function1[/* package */ PackageObject, Any]): this.type = js.native
    /**
      * Every time a transform is applied to a file, a 'transform' event fires with the instantiated transform stream tr.
      */
    @JSName("on")
    def on_transform(event: transform, listener: js.Function2[/* tr */ ReadableStream, /* file */ String, Any]): this.type = js.native
    
    def parseDeps(file: String, src: String, cb: Any): js.Array[Any] = js.native
    
    def readFile(file: String): ReadableStream = js.native
    def readFile(file: String, id: Any): ReadableStream = js.native
    def readFile(file: String, id: Any, pkg: PackageObject): ReadableStream = js.native
    def readFile(file: String, id: Unit, pkg: PackageObject): ReadableStream = js.native
    
    def resolve(
      id: String,
      parent: PartialParentObjectidstri,
      cb: js.Function4[
          /* err */ js.Error | Null, 
          /* file */ js.UndefOr[String], 
          /* pkg */ js.UndefOr[PackageObject], 
          /* fakePath */ js.UndefOr[Any], 
          Any
        ]
    ): Any = js.native
    
    def walk(
      id: String,
      parent: Modules,
      cb: js.Function2[/* err */ js.Error | Null, /* file */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def walk(
      id: Entry,
      parent: Modules,
      cb: js.Function2[/* err */ js.Error | Null, /* file */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  /**
    * module-deps constructor options
    */
  trait Options
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    // un-documented options used by module-deps
    var basedir: js.UndefOr[String] = js.undefined
    
    /**
      * An object mapping filenames to file objects to skip costly io
      */
    var cache: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * A custom dependency detection function. opts.detect(source) should return an array of dependency module names. By default detective is used
      */
    var detect: js.UndefOr[js.Function1[/* source */ String, js.Array[String]]] = js.undefined
    
    var expose: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An object mapping filenames to raw source to avoid reading from disk.
      */
    var fileCache: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * A function (id) to skip resolution of some module id strings. If defined,
      * opts.filter(id) should return truthy for all the ids to include and falsey for all the ids to skip.
      */
    var filter: js.UndefOr[js.Function1[/* id */ String, Boolean]] = js.undefined
    
    var globalTransform: js.UndefOr[Transform | js.Array[Transform]] = js.undefined
    
    /**
      * Ignore files that failed to resolve
      */
    var ignoreMissing: js.UndefOr[Boolean] = js.undefined
    
    var modules: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * An array of absolute paths to not parse for dependencies.
      * Use this for large dependencies like jquery or threejs which take forever to parse.
      */
    var noParse: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * An object mapping filenames to their parent package.json contents
      * for browser fields, main entries, and transforms
      */
    var packageCache: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    // tslint:disable-line:void-return
    /**
      * Transform the parsed package.json contents before using the values.
      * opts.packageFilter(pkg, dir) should return the new pkg object to use.
      */
    var packageFilter: js.UndefOr[js.Function2[/* pkg */ PackageObject, /* dir */ String, PackageObject]] = js.undefined
    
    /**
      * Array of global paths to search. Defaults to splitting on ':' in process.env.NODE_PATH
      */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A complex cache handler that allows async and persistent caching of data.
      */
    var persistentCache: js.UndefOr[
        js.Function5[
          /* file */ String, 
          /* id */ String, 
          /* pkg */ PackageObject, 
          /* fallback */ js.Function2[/* dataAsString */ js.UndefOr[String | Null], /* cb */ CacheCallback, Unit], 
          /* cb */ CacheCallback, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function (id, file, pkg) that gets called after id has been resolved.
      * Return false to skip this file
      */
    var postFilter: js.UndefOr[
        js.Function3[/* id */ String, /* file */ String, /* pkg */ PackageObject, Unit | Boolean]
      ] = js.undefined
    
    /**
      * Custom resolve function using the opts.resolve(id, parent, cb) signature that browser-resolve has
      */
    var resolve: js.UndefOr[
        js.Function3[
          /* id */ String, 
          /* opts */ ParentObject, 
          /* cb */ js.Function4[
            /* err */ js.UndefOr[js.Error | Null], 
            /* file */ js.UndefOr[String], 
            /* pkg */ js.UndefOr[PackageObject], 
            /* fakePath */ js.UndefOr[Any], 
            Unit
          ], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A string or array of string transforms
      */
    var transform: js.UndefOr[Transform | js.Array[Transform]] = js.undefined
    
    /**
      * An array path of strings showing where to look in the package.json
      * for source transformations. If falsy, don't look at the package.json at all
      */
    var transformKey: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setCache(value: StringDictionary[Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDetect(value: /* source */ String => js.Array[String]): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
      
      inline def setDetectUndefined: Self = StObject.set(x, "detect", js.undefined)
      
      inline def setExpose(value: StringDictionary[String]): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFileCache(value: StringDictionary[String]): Self = StObject.set(x, "fileCache", value.asInstanceOf[js.Any])
      
      inline def setFileCacheUndefined: Self = StObject.set(x, "fileCache", js.undefined)
      
      inline def setFilter(value: /* id */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGlobalTransform(value: Transform | js.Array[Transform]): Self = StObject.set(x, "globalTransform", value.asInstanceOf[js.Any])
      
      inline def setGlobalTransformFunction2(value: (/* file */ String, /* opts */ Basedir) => ReadWriteStream): Self = StObject.set(x, "globalTransform", js.Any.fromFunction2(value))
      
      inline def setGlobalTransformUndefined: Self = StObject.set(x, "globalTransform", js.undefined)
      
      inline def setGlobalTransformVarargs(value: Transform*): Self = StObject.set(x, "globalTransform", js.Array(value*))
      
      inline def setIgnoreMissing(value: Boolean): Self = StObject.set(x, "ignoreMissing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingUndefined: Self = StObject.set(x, "ignoreMissing", js.undefined)
      
      inline def setModules(value: StringDictionary[Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setNoParse(value: Boolean | js.Array[String]): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
      
      inline def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
      
      inline def setNoParseVarargs(value: String*): Self = StObject.set(x, "noParse", js.Array(value*))
      
      inline def setPackageCache(value: StringDictionary[Any]): Self = StObject.set(x, "packageCache", value.asInstanceOf[js.Any])
      
      inline def setPackageCacheUndefined: Self = StObject.set(x, "packageCache", js.undefined)
      
      inline def setPackageFilter(value: (/* pkg */ PackageObject, /* dir */ String) => PackageObject): Self = StObject.set(x, "packageFilter", js.Any.fromFunction2(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPersistentCache(
        value: (/* file */ String, /* id */ String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ js.UndefOr[String | Null], /* cb */ CacheCallback, Unit], /* cb */ CacheCallback) => Unit
      ): Self = StObject.set(x, "persistentCache", js.Any.fromFunction5(value))
      
      inline def setPersistentCacheUndefined: Self = StObject.set(x, "persistentCache", js.undefined)
      
      inline def setPostFilter(value: (/* id */ String, /* file */ String, /* pkg */ PackageObject) => Unit | Boolean): Self = StObject.set(x, "postFilter", js.Any.fromFunction3(value))
      
      inline def setPostFilterUndefined: Self = StObject.set(x, "postFilter", js.undefined)
      
      inline def setResolve(
        value: (/* id */ String, /* opts */ ParentObject, /* cb */ js.Function4[
              /* err */ js.UndefOr[js.Error | Null], 
              /* file */ js.UndefOr[String], 
              /* pkg */ js.UndefOr[PackageObject], 
              /* fakePath */ js.UndefOr[Any], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setTransform(value: Transform | js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformFunction2(value: (/* file */ String, /* opts */ Basedir) => ReadWriteStream): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformKey(value: js.Array[String]): Self = StObject.set(x, "transformKey", value.asInstanceOf[js.Any])
      
      inline def setTransformKeyUndefined: Self = StObject.set(x, "transformKey", js.undefined)
      
      inline def setTransformKeyVarargs(value: String*): Self = StObject.set(x, "transformKey", js.Array(value*))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
    }
  }
  
  /**
    * Parsed package.json file data, as obtained from running JSON.parse on the file.
    *
    * Placeholder, feel free to redefine or put in a pull request to improve
    */
  type PackageObject = StringDictionary[Any]
  
  trait ParentObject extends StObject {
    
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    var basedir: String
    
    // undocumented, see 'Options' interface
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var filename: String
    
    var id: String
    
    var inNodeModules: js.UndefOr[Boolean] = js.undefined
    
    var modules: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var packageFilter: js.UndefOr[js.Function2[/* p */ PackageObject, /* x */ String, PackageObjectdirnamestrin]] = js.undefined
    
    var paths: js.Array[String]
  }
  object ParentObject {
    
    inline def apply(basedir: String, filename: String, id: String, paths: js.Array[String]): ParentObject = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentObject]
    }
    
    extension [Self <: ParentObject](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInNodeModules(value: Boolean): Self = StObject.set(x, "inNodeModules", value.asInstanceOf[js.Any])
      
      inline def setInNodeModulesUndefined: Self = StObject.set(x, "inNodeModules", js.undefined)
      
      inline def setModules(value: StringDictionary[Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setPackageFilter(value: (/* p */ PackageObject, /* x */ String) => PackageObjectdirnamestrin): Self = StObject.set(x, "packageFilter", js.Any.fromFunction2(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  trait PersistentCacheItem extends StObject {
    
    @JSName("package")
    var _package: PackageObject
    
    var deps: StringDictionary[Boolean]
    
    var source: String
  }
  object PersistentCacheItem {
    
    inline def apply(_package: PackageObject, deps: StringDictionary[Boolean], source: String): PersistentCacheItem = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistentCacheItem]
    }
    
    extension [Self <: PersistentCacheItem](x: Self) {
      
      inline def setDeps(value: StringDictionary[Boolean]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def set_package(value: PackageObject): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  type Transform = String | (js.Function2[/* file */ String, /* opts */ Basedir, ReadWriteStream])
  
  trait TransformObject extends StObject {
    
    var deps: StringDictionary[Any]
    
    var entry: Boolean
    
    var expose: String
    
    var file: String
    
    var id: String
    
    var source: String
  }
  object TransformObject {
    
    inline def apply(
      deps: StringDictionary[Any],
      entry: Boolean,
      expose: String,
      file: String,
      id: String,
      source: String
    ): TransformObject = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformObject]
    }
    
    extension [Self <: TransformObject](x: Self) {
      
      inline def setDeps(value: StringDictionary[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
