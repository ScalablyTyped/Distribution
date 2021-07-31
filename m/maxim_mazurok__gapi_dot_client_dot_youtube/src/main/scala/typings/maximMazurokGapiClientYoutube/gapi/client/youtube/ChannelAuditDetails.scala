package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelAuditDetails extends StObject {
  
  /** Whether or not the channel respects the community guidelines. */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not the channel has any unresolved claims. */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not the channel has any copyright strikes. */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.undefined
}
object ChannelAuditDetails {
  
  @scala.inline
  def apply(): ChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelAuditDetails]
  }
  
  @scala.inline
  implicit class ChannelAuditDetailsMutableBuilder[Self <: ChannelAuditDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommunityGuidelinesGoodStanding(value: Boolean): Self = StObject.set(x, "communityGuidelinesGoodStanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunityGuidelinesGoodStandingUndefined: Self = StObject.set(x, "communityGuidelinesGoodStanding", js.undefined)
    
    @scala.inline
    def setContentIdClaimsGoodStanding(value: Boolean): Self = StObject.set(x, "contentIdClaimsGoodStanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdClaimsGoodStandingUndefined: Self = StObject.set(x, "contentIdClaimsGoodStanding", js.undefined)
    
    @scala.inline
    def setCopyrightStrikesGoodStanding(value: Boolean): Self = StObject.set(x, "copyrightStrikesGoodStanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightStrikesGoodStandingUndefined: Self = StObject.set(x, "copyrightStrikesGoodStanding", js.undefined)
  }
}
