package typings
package moduleDashDepsLib.moduleDashDepsMod.moduleDepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * module-deps constructor options
     */

trait Options
  extends /* prop */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  // un-documented options used by module-deps
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  /**
           * An object mapping filenames to file objects to skip costly io
           */
  var cache: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
           * A custom dependency detection function. opts.detect(source) should return an array of dependency module names. By default detective is used
           */
  var detect: js.UndefOr[js.Function1[/* source */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  var expose: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * An object mapping filenames to raw source to avoid reading from disk.
           */
  var fileCache: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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
  var modules: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
           * An array of absolute paths to not parse for dependencies.
           * Use this for large dependencies like jquery or threejs which take forever to parse.
           */
  var noParse: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
           * An object mapping filenames to their parent package.json contents
           * for browser fields, main entries, and transforms
           */
  var packageCache: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
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
      /* opts */ browserDashResolveLib.browserDashResolveMod.browserResolveNs.SyncOpts, 
      /* cb */ js.Function4[
        /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
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

