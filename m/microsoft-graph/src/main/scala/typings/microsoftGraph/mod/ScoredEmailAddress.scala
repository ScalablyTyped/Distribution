package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoredEmailAddress extends StObject {
  
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
  implicit class ScoredEmailAddressMutableBuilder[Self <: ScoredEmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setItemId(value: NullableOption[String]): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setRelevanceScore(value: NullableOption[Double]): Self = StObject.set(x, "relevanceScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceScoreNull: Self = StObject.set(x, "relevanceScore", null)
    
    @scala.inline
    def setRelevanceScoreUndefined: Self = StObject.set(x, "relevanceScore", js.undefined)
    
    @scala.inline
    def setSelectionLikelihood(value: NullableOption[SelectionLikelihoodInfo]): Self = StObject.set(x, "selectionLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionLikelihoodNull: Self = StObject.set(x, "selectionLikelihood", null)
    
    @scala.inline
    def setSelectionLikelihoodUndefined: Self = StObject.set(x, "selectionLikelihood", js.undefined)
  }
}
