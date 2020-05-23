package typings.postcssUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsolutePath extends js.Object {
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

object AbsolutePath {
  @scala.inline
  def apply(
    url: String,
    absolutePath: String = null,
    hash: String = null,
    pathname: String = null,
    relativePath: String = null,
    search: String = null
  ): AbsolutePath = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePath]
  }
}

