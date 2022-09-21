package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMembershipGiftingDetails extends StObject {
  
  /** The number of gift memberships purchased by the user. */
  var giftMembershipsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the level of the gift memberships purchased by the user. The Level names are defined by the YouTube channel offering the Membership. In some situations this field isn't
    * filled.
    */
  var giftMembershipsLevelName: js.UndefOr[String] = js.undefined
}
object LiveChatMembershipGiftingDetails {
  
  inline def apply(): LiveChatMembershipGiftingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMembershipGiftingDetails]
  }
  
  extension [Self <: LiveChatMembershipGiftingDetails](x: Self) {
    
    inline def setGiftMembershipsCount(value: Double): Self = StObject.set(x, "giftMembershipsCount", value.asInstanceOf[js.Any])
    
    inline def setGiftMembershipsCountUndefined: Self = StObject.set(x, "giftMembershipsCount", js.undefined)
    
    inline def setGiftMembershipsLevelName(value: String): Self = StObject.set(x, "giftMembershipsLevelName", value.asInstanceOf[js.Any])
    
    inline def setGiftMembershipsLevelNameUndefined: Self = StObject.set(x, "giftMembershipsLevelName", js.undefined)
  }
}
