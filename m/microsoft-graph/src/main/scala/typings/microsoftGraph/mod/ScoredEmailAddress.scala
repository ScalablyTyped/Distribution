package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoredEmailAddress extends js.Object {
  
  // The email address.
  var address: js.UndefOr[NullableOption[String]] = js.native
  
  var itemId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned
    * results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s
    * communication and collaboration patterns and business relationships.
    */
  var relevanceScore: js.UndefOr[NullableOption[Double]] = js.native
  
  var selectionLikelihood: js.UndefOr[NullableOption[SelectionLikelihoodInfo]] = js.native
}
object ScoredEmailAddress {
  
  @scala.inline
  def apply(): ScoredEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoredEmailAddress]
  }
  
  @scala.inline
  implicit class ScoredEmailAddressOps[Self <: ScoredEmailAddress] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: NullableOption[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setItemId(value: NullableOption[String]): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setItemIdNull: Self = this.set("itemId", null)
    
    @scala.inline
    def setRelevanceScore(value: NullableOption[Double]): Self = this.set("relevanceScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevanceScore: Self = this.set("relevanceScore", js.undefined)
    
    @scala.inline
    def setRelevanceScoreNull: Self = this.set("relevanceScore", null)
    
    @scala.inline
    def setSelectionLikelihood(value: NullableOption[SelectionLikelihoodInfo]): Self = this.set("selectionLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionLikelihood: Self = this.set("selectionLikelihood", js.undefined)
    
    @scala.inline
    def setSelectionLikelihoodNull: Self = this.set("selectionLikelihood", null)
  }
}
