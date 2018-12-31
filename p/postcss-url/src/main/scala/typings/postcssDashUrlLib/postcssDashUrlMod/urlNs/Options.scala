package typings
package postcssDashUrlLib.postcssDashUrlMod.urlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The assets files will be copied in that destination.
    *
    * @default false
    */
  var assetsPath: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Specify the base path or list of base paths where to search images from.
    */
  var basePath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The fallback method to use if the maximum size is exceeded or the URL contains a hash.
    */
  var fallback: js.UndefOr[CustomTransformFunction] = js.undefined
  /**
    * Determine wether a file should be inlined.
    */
  var filter: js.UndefOr[stdLib.RegExp | CustomFilterFunction | java.lang.String] = js.undefined
  /**
    * Hash options
    */
  var hashOptions: js.UndefOr[postcssDashUrlLib.Anon_Shrink] = js.undefined
  /**
    * Do not warn when an SVG URL with a fragment is inlined.
    * PostCSS-URL does not support partial inlining.
    * The entire SVG file will be inlined.
    * By default a warning will be issued when this occurs.
    *
    * @default false
    */
  var ignoreFragmentWarning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies whether the URL's fragment identifer value, if present, will be added to the inlined data URI.
    *
    * @default false
    */
  var includeUriFragment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the maximum file size to inline (in kilobytes).
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * URL rewriting mechanism.
    *
    * @default 'rebase'
    */
  var url: js.UndefOr[
    postcssDashUrlLib.postcssDashUrlLibStrings.copy | postcssDashUrlLib.postcssDashUrlLibStrings.`inline` | postcssDashUrlLib.postcssDashUrlLibStrings.rebase | CustomTransformFunction
  ] = js.undefined
  /**
    * Rename the path of the files by a hash name.
    *
    * @default false
    */
  var useHash: js.UndefOr[scala.Boolean] = js.undefined
}

