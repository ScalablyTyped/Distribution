package typings.moduleDeps.mod

import org.scalablytyped.runtime.StringDictionary
import typings.browserResolve.mod.SyncOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * module-deps constructor options
  */
@js.native
trait Options
  extends /* prop */ StringDictionary[js.Any] {
  
  // un-documented options used by module-deps
  var basedir: js.UndefOr[String] = js.native
  
  /**
    * An object mapping filenames to file objects to skip costly io
    */
  var cache: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * A custom dependency detection function. opts.detect(source) should return an array of dependency module names. By default detective is used
    */
  var detect: js.UndefOr[js.Function1[/* source */ String, js.Array[String]]] = js.native
  
  var expose: js.UndefOr[StringDictionary[String]] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An object mapping filenames to raw source to avoid reading from disk.
    */
  var fileCache: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A function (id) to skip resolution of some module id strings. If defined,
    * opts.filter(id) should return truthy for all the ids to include and falsey for all the ids to skip.
    */
  var filter: js.UndefOr[js.Function1[/* id */ String, Boolean]] = js.native
  
  var globalTransform: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Ignore files that failed to resolve
    */
  var ignoreMissing: js.UndefOr[Boolean] = js.native
  
  var modules: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * An array of absolute paths to not parse for dependencies.
    * Use this for large dependencies like jquery or threejs which take forever to parse.
    */
  var noParse: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * An object mapping filenames to their parent package.json contents
    * for browser fields, main entries, and transforms
    */
  var packageCache: js.UndefOr[StringDictionary[js.Any]] = js.native
  
   // tslint:disable-line:void-return
  /**
    * Transform the parsed package.json contents before using the values.
    * opts.packageFilter(pkg, dir) should return the new pkg object to use.
    */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ PackageObject, /* dir */ String, PackageObject]] = js.native
  
  /**
    * Array of global paths to search. Defaults to splitting on ':' in process.env.NODE_PATH
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A complex cache handler that allows async and persistent caching of data.
    */
  var persistentCache: js.UndefOr[
    js.Function5[
      /* file */ String, 
      /* id */ String, 
      /* pkg */ PackageObject, 
      /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], 
      /* cb */ CacheCallback, 
      Unit
    ]
  ] = js.native
  
  /**
    * A function (id, file, pkg) that gets called after id has been resolved.
    * Return false to skip this file
    */
  var postFilter: js.UndefOr[
    js.Function3[/* id */ String, /* file */ String, /* pkg */ PackageObject, Unit | Boolean]
  ] = js.native
  
  /**
    * Custom resolve function using the opts.resolve(id, parent, cb) signature that browser-resolve has
    */
  var resolve: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* opts */ SyncOpts, 
      /* cb */ js.Function4[
        /* err */ js.UndefOr[Error | Null], 
        /* file */ js.UndefOr[String], 
        /* pkg */ js.UndefOr[PackageObject], 
        /* fakePath */ js.UndefOr[js.Any], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * A string or array of string transforms
    */
  var transform: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * An array path of strings showing where to look in the package.json
    * for source transformations. If falsy, don't look at the package.json at all
    */
  var transformKey: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    
    @scala.inline
    def setCache(value: StringDictionary[js.Any]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setDetect(value: /* source */ String => js.Array[String]): Self = this.set("detect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetect: Self = this.set("detect", js.undefined)
    
    @scala.inline
    def setExpose(value: StringDictionary[String]): Self = this.set("expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFileCache(value: StringDictionary[String]): Self = this.set("fileCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileCache: Self = this.set("fileCache", js.undefined)
    
    @scala.inline
    def setFilter(value: /* id */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGlobalTransformVarargs(value: js.Any*): Self = this.set("globalTransform", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTransform(value: js.Array[_]): Self = this.set("globalTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTransform: Self = this.set("globalTransform", js.undefined)
    
    @scala.inline
    def setIgnoreMissing(value: Boolean): Self = this.set("ignoreMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMissing: Self = this.set("ignoreMissing", js.undefined)
    
    @scala.inline
    def setModules(value: StringDictionary[js.Any]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setNoParseVarargs(value: String*): Self = this.set("noParse", js.Array(value :_*))
    
    @scala.inline
    def setNoParse(value: Boolean | js.Array[String]): Self = this.set("noParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoParse: Self = this.set("noParse", js.undefined)
    
    @scala.inline
    def setPackageCache(value: StringDictionary[js.Any]): Self = this.set("packageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageCache: Self = this.set("packageCache", js.undefined)
    
    @scala.inline
    def setPackageFilter(value: (/* pkg */ PackageObject, /* dir */ String) => PackageObject): Self = this.set("packageFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePackageFilter: Self = this.set("packageFilter", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPersistentCache(
      value: (/* file */ String, /* id */ String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], /* cb */ CacheCallback) => Unit
    ): Self = this.set("persistentCache", js.Any.fromFunction5(value))
    
    @scala.inline
    def deletePersistentCache: Self = this.set("persistentCache", js.undefined)
    
    @scala.inline
    def setPostFilter(value: (/* id */ String, /* file */ String, /* pkg */ PackageObject) => Unit | Boolean): Self = this.set("postFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePostFilter: Self = this.set("postFilter", js.undefined)
    
    @scala.inline
    def setResolve(
      value: (/* id */ String, /* opts */ SyncOpts, /* cb */ js.Function4[
          /* err */ js.UndefOr[Error | Null], 
          /* file */ js.UndefOr[String], 
          /* pkg */ js.UndefOr[PackageObject], 
          /* fakePath */ js.UndefOr[js.Any], 
          Unit
        ]) => Unit
    ): Self = this.set("resolve", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: String*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: String | js.Array[String]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformKeyVarargs(value: String*): Self = this.set("transformKey", js.Array(value :_*))
    
    @scala.inline
    def setTransformKey(value: js.Array[String]): Self = this.set("transformKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformKey: Self = this.set("transformKey", js.undefined)
  }
}
