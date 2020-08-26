package typings.postcssUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbsolutePath extends js.Object {
  /**
    * Absolute path to asset.
    */
  var absolutePath: js.UndefOr[String] = js.native
  /**
    * Hash from URL.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * URL pathname.
    */
  var pathname: js.UndefOr[String] = js.native
  /**
    * Current relative path to asset.
    */
  var relativePath: js.UndefOr[String] = js.native
  /**
    * Querystring from URL.
    */
  var search: js.UndefOr[String] = js.native
  /**
    * Original URL.
    */
  var url: String = js.native
}

object AbsolutePath {
  @scala.inline
  def apply(url: String): AbsolutePath = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePath]
  }
  @scala.inline
  implicit class AbsolutePathOps[Self <: AbsolutePath] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsolutePath(value: String): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
  
}

