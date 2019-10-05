package typings.ngDashCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogsPromptResult extends js.Object {
  var buttonIndex: Double
  var input1: String
}

object IDialogsPromptResult {
  @scala.inline
  def apply(buttonIndex: Double, input1: String): IDialogsPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex, input1 = input1)
  
    __obj.asInstanceOf[IDialogsPromptResult]
  }
}

