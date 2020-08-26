package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorCommentOptions extends js.Object {
  var hint: js.UndefOr[String] = js.native
  var limit: js.UndefOr[scala.Double] = js.native
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var skip: js.UndefOr[scala.Double] = js.native
}

object CursorCommentOptions {
  @scala.inline
  def apply(): CursorCommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorCommentOptions]
  }
  @scala.inline
  implicit class CursorCommentOptionsOps[Self <: CursorCommentOptions] (val x: Self) extends AnyVal {
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
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setLimit(value: scala.Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setSkip(value: scala.Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
  
}

