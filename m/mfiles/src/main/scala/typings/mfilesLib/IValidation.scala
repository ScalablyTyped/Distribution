package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidation extends js.Object {
  var RegularExpression: java.lang.String
  var VBScript: java.lang.String
  def Clone(): IValidation
}

object IValidation {
  @scala.inline
  def apply(Clone: () => IValidation, RegularExpression: java.lang.String, VBScript: java.lang.String): IValidation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), RegularExpression = RegularExpression, VBScript = VBScript)
  
    __obj.asInstanceOf[IValidation]
  }
}

