package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfo extends js.Object {
  var Meaning: String
  var Reason: String
  def Clone(): ISignaturePromptInfo
}

object ISignaturePromptInfo {
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfo, Meaning: String, Reason: String): ISignaturePromptInfo = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Meaning = Meaning, Reason = Reason)
  
    __obj.asInstanceOf[ISignaturePromptInfo]
  }
}

