package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignaturePromptInfoMetadataBased extends js.Object {
  
  def Clone(): ISignaturePromptInfoMetadataBased = js.native
  
  var IsReferencedBySignatureObject: Boolean = js.native
  
  var MeaningPropertyID: Double = js.native
  
  var PromptInfoLookupPropertyID: Double = js.native
  
  var ReasonPropertyID: Double = js.native
}
object ISignaturePromptInfoMetadataBased {
  
  @scala.inline
  def apply(
    Clone: () => ISignaturePromptInfoMetadataBased,
    IsReferencedBySignatureObject: Boolean,
    MeaningPropertyID: Double,
    PromptInfoLookupPropertyID: Double,
    ReasonPropertyID: Double
  ): ISignaturePromptInfoMetadataBased = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsReferencedBySignatureObject = IsReferencedBySignatureObject.asInstanceOf[js.Any], MeaningPropertyID = MeaningPropertyID.asInstanceOf[js.Any], PromptInfoLookupPropertyID = PromptInfoLookupPropertyID.asInstanceOf[js.Any], ReasonPropertyID = ReasonPropertyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoMetadataBased]
  }
  
  @scala.inline
  implicit class ISignaturePromptInfoMetadataBasedOps[Self <: ISignaturePromptInfoMetadataBased] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => ISignaturePromptInfoMetadataBased): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReferencedBySignatureObject(value: Boolean): Self = this.set("IsReferencedBySignatureObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningPropertyID(value: Double): Self = this.set("MeaningPropertyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptInfoLookupPropertyID(value: Double): Self = this.set("PromptInfoLookupPropertyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonPropertyID(value: Double): Self = this.set("ReasonPropertyID", value.asInstanceOf[js.Any])
  }
}
