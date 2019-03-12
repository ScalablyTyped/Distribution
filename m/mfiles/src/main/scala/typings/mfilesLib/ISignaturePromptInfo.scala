package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfo extends js.Object {
  var Meaning: java.lang.String
  var Reason: java.lang.String
  def Clone(): ISignaturePromptInfo
}

object ISignaturePromptInfo {
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfo, Meaning: java.lang.String, Reason: java.lang.String): ISignaturePromptInfo = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Meaning = Meaning, Reason = Reason)
  
    __obj.asInstanceOf[ISignaturePromptInfo]
  }
}

