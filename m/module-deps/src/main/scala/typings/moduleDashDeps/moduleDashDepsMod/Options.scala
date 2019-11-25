package typings.moduleDashDeps.moduleDashDepsMod

import org.scalablytyped.runtime.StringDictionary
import typings.browserDashResolve.browserDashResolveMod.SyncOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module-deps constructor options
  */
trait Options
  extends /* prop */ StringDictionary[js.Any] {
  // un-documented options used by module-deps
  var basedir: js.UndefOr[String] = js.undefined
  /**
    * An object mapping filenames to file objects to skip costly io
    */
  var cache: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
  var globalTransform: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Ignore files that failed to resolve
    */
  var ignoreMissing: js.UndefOr[Boolean] = js.undefined
  var modules: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * An array of absolute paths to not parse for dependencies.
    * Use this for large dependencies like jquery or threejs which take forever to parse.
    */
  var noParse: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * An object mapping filenames to their parent package.json contents
    * for browser fields, main entries, and transforms
    */
  var packageCache: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
      /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], 
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
  ] = js.undefined
  /**
    * A string or array of string transforms
    */
  var transform: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * An array path of strings showing where to look in the package.json
    * for source transformations. If falsy, don't look at the package.json at all
    */
  var transformKey: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    basedir: String = null,
    cache: StringDictionary[js.Any] = null,
    detect: /* source */ String => js.Array[String] = null,
    expose: StringDictionary[String] = null,
    extensions: js.Array[String] = null,
    fileCache: StringDictionary[String] = null,
    filter: /* id */ String => Boolean = null,
    globalTransform: js.Array[_] = null,
    ignoreMissing: js.UndefOr[Boolean] = js.undefined,
    modules: StringDictionary[js.Any] = null,
    noParse: Boolean | js.Array[String] = null,
    packageCache: StringDictionary[js.Any] = null,
    packageFilter: (/* pkg */ PackageObject, /* dir */ String) => PackageObject = null,
    paths: js.Array[String] = null,
    persistentCache: (/* file */ String, /* id */ String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], /* cb */ CacheCallback) => Unit = null,
    postFilter: (/* id */ String, /* file */ String, /* pkg */ PackageObject) => Unit | Boolean = null,
    resolve: (/* id */ String, /* opts */ SyncOpts, /* cb */ js.Function4[
      /* err */ js.UndefOr[Error | Null], 
      /* file */ js.UndefOr[String], 
      /* pkg */ js.UndefOr[PackageObject], 
      /* fakePath */ js.UndefOr[js.Any], 
      Unit
    ]) => Unit = null,
    transform: String | js.Array[String] = null,
    transformKey: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (detect != null) __obj.updateDynamic("detect")(js.Any.fromFunction1(detect))
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fileCache != null) __obj.updateDynamic("fileCache")(fileCache.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (globalTransform != null) __obj.updateDynamic("globalTransform")(globalTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMissing)) __obj.updateDynamic("ignoreMissing")(ignoreMissing.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (noParse != null) __obj.updateDynamic("noParse")(noParse.asInstanceOf[js.Any])
    if (packageCache != null) __obj.updateDynamic("packageCache")(packageCache.asInstanceOf[js.Any])
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2(packageFilter))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (persistentCache != null) __obj.updateDynamic("persistentCache")(js.Any.fromFunction5(persistentCache))
    if (postFilter != null) __obj.updateDynamic("postFilter")(js.Any.fromFunction3(postFilter))
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction3(resolve))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformKey != null) __obj.updateDynamic("transformKey")(transformKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

