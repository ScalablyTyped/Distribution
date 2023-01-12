package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buyer extends StObject {
  
  /** Output only. The number of creatives that this buyer submitted via the API or bid with in the last 30 days. This is counted against the maximum number of active creatives. */
  var activeCreativeCount: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name of the bidder resource that is responsible for receiving bidding traffic for this account. The bidder name must follow the pattern `bidders/{bidderAccountId}`,
    * where `{bidderAccountId}` is the account ID of the bidder receiving traffic for this buyer.
    */
  var bidder: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A list of billing IDs associated with this account. These IDs appear on: 1. A bid request, to signal which buyers are eligible to bid on a given opportunity, and which
    * pretargeting configurations were matched for each eligible buyer. 2. The bid response, to attribute a winning impression to a specific account for billing, reporting, policy and
    * publisher block enforcement.
    */
  var billingIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The diplay name associated with this buyer account, as visible to sellers. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The maximum number of active creatives that this buyer can have. */
  var maximumActiveCreativeCount: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Name of the buyer resource that must follow the pattern `buyers/{buyerAccountId}`, where `{buyerAccountId}` is the account ID of the buyer account whose information is
    * to be received. One can get their account ID on the Authorized Buyers or Open Bidding UI, or by contacting their Google account manager.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Buyer {
  
  inline def apply(): Buyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buyer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buyer] (val x: Self) extends AnyVal {
    
    inline def setActiveCreativeCount(value: String): Self = StObject.set(x, "activeCreativeCount", value.asInstanceOf[js.Any])
    
    inline def setActiveCreativeCountUndefined: Self = StObject.set(x, "activeCreativeCount", js.undefined)
    
    inline def setBidder(value: String): Self = StObject.set(x, "bidder", value.asInstanceOf[js.Any])
    
    inline def setBidderUndefined: Self = StObject.set(x, "bidder", js.undefined)
    
    inline def setBillingIds(value: js.Array[String]): Self = StObject.set(x, "billingIds", value.asInstanceOf[js.Any])
    
    inline def setBillingIdsUndefined: Self = StObject.set(x, "billingIds", js.undefined)
    
    inline def setBillingIdsVarargs(value: String*): Self = StObject.set(x, "billingIds", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMaximumActiveCreativeCount(value: String): Self = StObject.set(x, "maximumActiveCreativeCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumActiveCreativeCountUndefined: Self = StObject.set(x, "maximumActiveCreativeCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
