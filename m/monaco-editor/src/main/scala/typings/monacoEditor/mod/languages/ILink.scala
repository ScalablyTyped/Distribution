package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILink extends js.Object {
  var range: IRange = js.native
  var tooltip: js.UndefOr[String] = js.native
  var url: js.UndefOr[Uri | String] = js.native
}

object ILink {
  @scala.inline
  def apply(range: IRange): ILink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILink]
  }
  @scala.inline
  implicit class ILinkOps[Self <: ILink] (val x: Self) extends AnyVal {
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
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUrl(value: Uri | String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

