package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfoMetadataBased extends js.Object {
  var IsReferencedBySignatureObject: Boolean
  var MeaningPropertyID: Double
  var PromptInfoLookupPropertyID: Double
  var ReasonPropertyID: Double
  def Clone(): ISignaturePromptInfoMetadataBased
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsReferencedBySignatureObject = IsReferencedBySignatureObject, MeaningPropertyID = MeaningPropertyID, PromptInfoLookupPropertyID = PromptInfoLookupPropertyID, ReasonPropertyID = ReasonPropertyID)
  
    __obj.asInstanceOf[ISignaturePromptInfoMetadataBased]
  }
}

