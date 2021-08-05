package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoredEmailAddress extends StObject {
  
  // The email address.
  var address: js.UndefOr[NullableOption[String]] = js.undefined
  
  var itemId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned
    * results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s
    * communication and collaboration patterns and business relationships.
    */
  var relevanceScore: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var selectionLikelihood: js.UndefOr[NullableOption[SelectionLikelihoodInfo]] = js.undefined
}
object ScoredEmailAddress {
  
  inline def apply(): ScoredEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoredEmailAddress]
  }
  
  extension [Self <: ScoredEmailAddress](x: Self) {
    
    inline def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setItemId(value: NullableOption[String]): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setRelevanceScore(value: NullableOption[Double]): Self = StObject.set(x, "relevanceScore", value.asInstanceOf[js.Any])
    
    inline def setRelevanceScoreNull: Self = StObject.set(x, "relevanceScore", null)
    
    inline def setRelevanceScoreUndefined: Self = StObject.set(x, "relevanceScore", js.undefined)
    
    inline def setSelectionLikelihood(value: NullableOption[SelectionLikelihoodInfo]): Self = StObject.set(x, "selectionLikelihood", value.asInstanceOf[js.Any])
    
    inline def setSelectionLikelihoodNull: Self = StObject.set(x, "selectionLikelihood", null)
    
    inline def setSelectionLikelihoodUndefined: Self = StObject.set(x, "selectionLikelihood", js.undefined)
  }
}
