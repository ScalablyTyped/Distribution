package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignaturePromptInfoMetadataBased extends StObject {
  
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
  implicit class ISignaturePromptInfoMetadataBasedMutableBuilder[Self <: ISignaturePromptInfoMetadataBased] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISignaturePromptInfoMetadataBased): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReferencedBySignatureObject(value: Boolean): Self = StObject.set(x, "IsReferencedBySignatureObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningPropertyID(value: Double): Self = StObject.set(x, "MeaningPropertyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptInfoLookupPropertyID(value: Double): Self = StObject.set(x, "PromptInfoLookupPropertyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonPropertyID(value: Double): Self = StObject.set(x, "ReasonPropertyID", value.asInstanceOf[js.Any])
  }
}
