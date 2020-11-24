package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignaturePromptInfoSelectable extends js.Object {
  
  def Clone(): ISignaturePromptInfoSelectable = js.native
  
  var PromptInfos: ISignaturePromptInfos = js.native
}
object ISignaturePromptInfoSelectable {
  
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfoSelectable, PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PromptInfos = PromptInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
  
  @scala.inline
  implicit class ISignaturePromptInfoSelectableOps[Self <: ISignaturePromptInfoSelectable] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => ISignaturePromptInfoSelectable): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPromptInfos(value: ISignaturePromptInfos): Self = this.set("PromptInfos", value.asInstanceOf[js.Any])
  }
}
