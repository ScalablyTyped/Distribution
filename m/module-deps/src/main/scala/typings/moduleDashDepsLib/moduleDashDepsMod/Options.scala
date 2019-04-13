package typings
package moduleDashDepsLib.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module-deps constructor options
  */
trait Options
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // un-documented options used by module-deps
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object mapping filenames to file objects to skip costly io
    */
  var cache: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * A custom dependency detection function. opts.detect(source) should return an array of dependency module names. By default detective is used
    */
  var detect: js.UndefOr[js.Function1[/* source */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  var expose: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An object mapping filenames to raw source to avoid reading from disk.
    */
  var fileCache: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * A function (id) to skip resolution of some module id strings. If defined,
    * opts.filter(id) should return truthy for all the ids to include and falsey for all the ids to skip.
    */
  var filter: js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Boolean]] = js.undefined
  var globalTransform: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Ignore files that failed to resolve
    */
  var ignoreMissing: js.UndefOr[scala.Boolean] = js.undefined
  var modules: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * An array of absolute paths to not parse for dependencies.
    * Use this for large dependencies like jquery or threejs which take forever to parse.
    */
  var noParse: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * An object mapping filenames to their parent package.json contents
    * for browser fields, main entries, and transforms
    */
  var packageCache: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
   // tslint:disable-line:void-return
  /**
    * Transform the parsed package.json contents before using the values.
    * opts.packageFilter(pkg, dir) should return the new pkg object to use.
    */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ PackageObject, /* dir */ java.lang.String, PackageObject]] = js.undefined
  /**
    * Array of global paths to search. Defaults to splitting on ':' in process.env.NODE_PATH
    */
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A complex cache handler that allows async and persistent caching of data.
    */
  var persistentCache: js.UndefOr[
    js.Function5[
      /* file */ java.lang.String, 
      /* id */ java.lang.String, 
      /* pkg */ PackageObject, 
      /* fallback */ js.Function2[/* dataAsString */ java.lang.String, /* cb */ CacheCallback, scala.Unit], 
      /* cb */ CacheCallback, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A function (id, file, pkg) that gets called after id has been resolved.
    * Return false to skip this file
    */
  var postFilter: js.UndefOr[
    js.Function3[
      /* id */ java.lang.String, 
      /* file */ java.lang.String, 
      /* pkg */ PackageObject, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  /**
    * Custom resolve function using the opts.resolve(id, parent, cb) signature that browser-resolve has
    */
  var resolve: js.UndefOr[
    js.Function3[
      /* id */ java.lang.String, 
      /* opts */ browserDashResolveLib.browserDashResolveMod.SyncOpts, 
      /* cb */ js.Function4[
        /* err */ js.UndefOr[stdLib.Error | scala.Null], 
        /* file */ js.UndefOr[java.lang.String], 
        /* pkg */ js.UndefOr[PackageObject], 
        /* fakePath */ js.UndefOr[js.Any], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A string or array of string transforms
    */
  var transform: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * An array path of strings showing where to look in the package.json
    * for source transformations. If falsy, don't look at the package.json at all
    */
  var transformKey: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    basedir: java.lang.String = null,
    cache: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    detect: /* source */ java.lang.String => js.Array[java.lang.String] = null,
    expose: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    extensions: js.Array[java.lang.String] = null,
    fileCache: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    filter: /* id */ java.lang.String => scala.Boolean = null,
    globalTransform: js.Array[_] = null,
    ignoreMissing: js.UndefOr[scala.Boolean] = js.undefined,
    modules: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    noParse: scala.Boolean | js.Array[java.lang.String] = null,
    packageCache: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    packageFilter: (/* pkg */ PackageObject, /* dir */ java.lang.String) => PackageObject = null,
    paths: js.Array[java.lang.String] = null,
    persistentCache: (/* file */ java.lang.String, /* id */ java.lang.String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ java.lang.String, /* cb */ CacheCallback, scala.Unit], /* cb */ CacheCallback) => scala.Unit = null,
    postFilter: (/* id */ java.lang.String, /* file */ java.lang.String, /* pkg */ PackageObject) => scala.Unit | scala.Boolean = null,
    resolve: (/* id */ java.lang.String, /* opts */ browserDashResolveLib.browserDashResolveMod.SyncOpts, /* cb */ js.Function4[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* file */ js.UndefOr[java.lang.String], 
      /* pkg */ js.UndefOr[PackageObject], 
      /* fakePath */ js.UndefOr[js.Any], 
      scala.Unit
    ]) => scala.Unit = null,
    transform: java.lang.String | js.Array[java.lang.String] = null,
    transformKey: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (detect != null) __obj.updateDynamic("detect")(js.Any.fromFunction1(detect))
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fileCache != null) __obj.updateDynamic("fileCache")(fileCache)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (globalTransform != null) __obj.updateDynamic("globalTransform")(globalTransform)
    if (!js.isUndefined(ignoreMissing)) __obj.updateDynamic("ignoreMissing")(ignoreMissing)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (noParse != null) __obj.updateDynamic("noParse")(noParse.asInstanceOf[js.Any])
    if (packageCache != null) __obj.updateDynamic("packageCache")(packageCache)
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2(packageFilter))
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (persistentCache != null) __obj.updateDynamic("persistentCache")(js.Any.fromFunction5(persistentCache))
    if (postFilter != null) __obj.updateDynamic("postFilter")(js.Any.fromFunction3(postFilter))
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction3(resolve))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformKey != null) __obj.updateDynamic("transformKey")(transformKey)
    __obj.asInstanceOf[Options]
  }
}

