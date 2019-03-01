package typings
package postcssDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsolutePath extends js.Object {
  /**
    * Absolute path to asset.
    */
  var absolutePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Hash from URL.
    */
  var hash: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL pathname.
    */
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Current relative path to asset.
    */
  var relativePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Querystring from URL.
    */
  var search: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Original URL.
    */
  var url: java.lang.String
}

object Anon_AbsolutePath {
  @scala.inline
  def apply(
    url: java.lang.String,
    absolutePath: java.lang.String = null,
    hash: java.lang.String = null,
    pathname: java.lang.String = null,
    relativePath: java.lang.String = null,
    search: java.lang.String = null
  ): Anon_AbsolutePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Anon_AbsolutePath]
  }
}

