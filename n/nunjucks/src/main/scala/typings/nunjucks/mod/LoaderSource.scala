package typings.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderSource extends js.Object {
  var noCache: Boolean = js.native
  var path: String = js.native
  var src: String = js.native
}

object LoaderSource {
  @scala.inline
  def apply(noCache: Boolean, path: String, src: String): LoaderSource = {
    val __obj = js.Dynamic.literal(noCache = noCache.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderSource]
  }
  @scala.inline
  implicit class LoaderSourceOps[Self <: LoaderSource] (val x: Self) extends AnyVal {
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
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
  
}

