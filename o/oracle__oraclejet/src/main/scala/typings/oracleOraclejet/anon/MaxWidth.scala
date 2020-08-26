package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxWidth[K2, D2] extends js.Object {
  var label: js.UndefOr[`7`[K2, D2]] = js.native
  var maxWidth: js.UndefOr[String] = js.native
  var rendered: js.UndefOr[on | off] = js.native
  var width: js.UndefOr[String] = js.native
}

object MaxWidth {
  @scala.inline
  def apply[K2, D2](): MaxWidth[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth[K2, D2]]
  }
  @scala.inline
  implicit class MaxWidthOps[Self <: MaxWidth[_, _], K2, D2] (val x: Self with (MaxWidth[K2, D2])) extends AnyVal {
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
    def setLabel(value: `7`[K2, D2]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMaxWidth(value: String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setRendered(value: on | off): Self = this.set("rendered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

