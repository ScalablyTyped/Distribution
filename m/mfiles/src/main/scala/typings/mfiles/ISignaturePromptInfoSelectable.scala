package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfoSelectable extends js.Object {
  var PromptInfos: ISignaturePromptInfos
  def Clone(): ISignaturePromptInfoSelectable
}

object ISignaturePromptInfoSelectable {
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfoSelectable, PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PromptInfos = PromptInfos)
  
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
}

