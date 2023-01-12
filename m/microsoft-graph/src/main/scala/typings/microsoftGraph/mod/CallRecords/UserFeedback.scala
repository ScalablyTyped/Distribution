package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserFeedback extends StObject {
  
  /**
    * The rating provided by the user of this endpoint about the quality of this Session. Possible values are: notRated, bad,
    * poor, fair, good, excellent, unknownFutureValue.
    */
  var rating: js.UndefOr[UserFeedbackRating] = js.undefined
  
  // The feedback text provided by the user of this endpoint for the session.
  var text: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties.
    * The property names should not be relied upon since they may change depending on what tokens are offered to the user.
    */
  var tokens: js.UndefOr[NullableOption[FeedbackTokenSet]] = js.undefined
}
object UserFeedback {
  
  inline def apply(): UserFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFeedback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserFeedback] (val x: Self) extends AnyVal {
    
    inline def setRating(value: UserFeedbackRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTokens(value: NullableOption[FeedbackTokenSet]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensNull: Self = StObject.set(x, "tokens", null)
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
  }
}
