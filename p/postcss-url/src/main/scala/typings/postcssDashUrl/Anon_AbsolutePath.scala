package typings.postcssDashUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsolutePath extends js.Object {
  /**
    * Absolute path to asset.
    */
  var absolutePath: js.UndefOr[String] = js.undefined
  /**
    * Hash from URL.
    */
  var hash: js.UndefOr[String] = js.undefined
  /**
    * URL pathname.
    */
  var pathname: js.UndefOr[String] = js.undefined
  /**
    * Current relative path to asset.
    */
  var relativePath: js.UndefOr[String] = js.undefined
  /**
    * Querystring from URL.
    */
  var search: js.UndefOr[String] = js.undefined
  /**
    * Original URL.
    */
  var url: String
}

object Anon_AbsolutePath {
  @scala.inline
  def apply(
    url: String,
    absolutePath: String = null,
    hash: String = null,
    pathname: String = null,
    relativePath: String = null,
    search: String = null
  ): Anon_AbsolutePath = {
    val __obj = js.Dynamic.literal(url = url)
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Anon_AbsolutePath]
  }
}

