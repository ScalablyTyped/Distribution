package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbsolutePath extends js.Object {
  var absolutePath: String = js.native
  var cacheable: Boolean = js.native
  var content: js.UndefOr[String] = js.native
  var hash: String = js.native
  var sourceMapUrl: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object AbsolutePath {
  @scala.inline
  def apply(absolutePath: String, cacheable: Boolean, hash: String, `type`: String): AbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setAbsolutePath(value: String): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheable(value: Boolean): Self = this.set("cacheable", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setSourceMapUrl(value: String): Self = this.set("sourceMapUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapUrl: Self = this.set("sourceMapUrl", js.undefined)
  }
  
}

