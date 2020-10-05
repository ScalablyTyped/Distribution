package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var buttonLabel: js.UndefOr[String] = js.native
  var buttonLabels: js.UndefOr[js.Array[String]] = js.native
  var callback: js.UndefOr[js.Any] = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var messageHTML: js.UndefOr[String] = js.native
  var modifier: js.UndefOr[String] = js.native
  var primaryButtonIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
}

object AlertOptions {
  @scala.inline
  def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  @scala.inline
  implicit class AlertOptionsOps[Self <: AlertOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setButtonLabel(value: String): Self = this.set("buttonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLabel: Self = this.set("buttonLabel", js.undefined)
    @scala.inline
    def setButtonLabelsVarargs(value: String*): Self = this.set("buttonLabels", js.Array(value :_*))
    @scala.inline
    def setButtonLabels(value: js.Array[String]): Self = this.set("buttonLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLabels: Self = this.set("buttonLabels", js.undefined)
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageHTML(value: String): Self = this.set("messageHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageHTML: Self = this.set("messageHTML", js.undefined)
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setPrimaryButtonIndex(value: Double): Self = this.set("primaryButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryButtonIndex: Self = this.set("primaryButtonIndex", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

