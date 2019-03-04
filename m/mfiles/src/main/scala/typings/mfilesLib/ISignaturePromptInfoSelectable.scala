package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfoSelectable extends js.Object {
  var PromptInfos: ISignaturePromptInfos
  def Clone(): ISignaturePromptInfoSelectable
}

object ISignaturePromptInfoSelectable {
  @scala.inline
  def apply(Clone: js.Function0[ISignaturePromptInfoSelectable], PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = Clone, PromptInfos = PromptInfos)
  
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
}

