package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogsPromptResult extends js.Object {
  var buttonIndex: Double = js.native
  var input1: String = js.native
}

object IDialogsPromptResult {
  @scala.inline
  def apply(buttonIndex: Double, input1: String): IDialogsPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], input1 = input1.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogsPromptResult]
  }
  @scala.inline
  implicit class IDialogsPromptResultOps[Self <: IDialogsPromptResult] (val x: Self) extends AnyVal {
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
    def setButtonIndex(value: Double): Self = this.set("buttonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput1(value: String): Self = this.set("input1", value.asInstanceOf[js.Any])
  }
  
}

