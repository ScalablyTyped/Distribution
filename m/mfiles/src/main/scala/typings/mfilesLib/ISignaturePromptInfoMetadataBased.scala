package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfoMetadataBased extends js.Object {
  var IsReferencedBySignatureObject: scala.Boolean
  var MeaningPropertyID: scala.Double
  var PromptInfoLookupPropertyID: scala.Double
  var ReasonPropertyID: scala.Double
  def Clone(): ISignaturePromptInfoMetadataBased
}

object ISignaturePromptInfoMetadataBased {
  @scala.inline
  def apply(
    Clone: js.Function0[ISignaturePromptInfoMetadataBased],
    IsReferencedBySignatureObject: scala.Boolean,
    MeaningPropertyID: scala.Double,
    PromptInfoLookupPropertyID: scala.Double,
    ReasonPropertyID: scala.Double
  ): ISignaturePromptInfoMetadataBased = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("IsReferencedBySignatureObject")(IsReferencedBySignatureObject)
    __obj.updateDynamic("MeaningPropertyID")(MeaningPropertyID)
    __obj.updateDynamic("PromptInfoLookupPropertyID")(PromptInfoLookupPropertyID)
    __obj.updateDynamic("ReasonPropertyID")(ReasonPropertyID)
    __obj.asInstanceOf[ISignaturePromptInfoMetadataBased]
  }
}

