package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidation extends js.Object {
  var RegularExpression: String
  var VBScript: String
  def Clone(): IValidation
}

object IValidation {
  @scala.inline
  def apply(Clone: () => IValidation, RegularExpression: String, VBScript: String): IValidation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), RegularExpression = RegularExpression.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidation]
  }
}

