package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatFanFundingEventDetails extends StObject {
  
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[String] = js.native
  
  /** The amount of the fund. */
  var amountMicros: js.UndefOr[String] = js.native
  
  /** The currency in which the fund was made. */
  var currency: js.UndefOr[String] = js.native
  
  /** The comment added by the user to this fan funding event. */
  var userComment: js.UndefOr[String] = js.native
}
object LiveChatFanFundingEventDetails {
  
  @scala.inline
  def apply(): LiveChatFanFundingEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatFanFundingEventDetails]
  }
  
  @scala.inline
  implicit class LiveChatFanFundingEventDetailsMutableBuilder[Self <: LiveChatFanFundingEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
    
    @scala.inline
    def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
