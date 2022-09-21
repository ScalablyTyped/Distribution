package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatNewSponsorDetails extends StObject {
  
  /** If the viewer just had upgraded from a lower level. For viewers that were not members at the time of purchase, this field is false. */
  var isUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the Level that the viewer just had joined. The Level names are defined by the YouTube channel offering the Membership. In some situations this field isn't filled. */
  var memberLevelName: js.UndefOr[String] = js.undefined
}
object LiveChatNewSponsorDetails {
  
  inline def apply(): LiveChatNewSponsorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatNewSponsorDetails]
  }
  
  extension [Self <: LiveChatNewSponsorDetails](x: Self) {
    
    inline def setIsUpgrade(value: Boolean): Self = StObject.set(x, "isUpgrade", value.asInstanceOf[js.Any])
    
    inline def setIsUpgradeUndefined: Self = StObject.set(x, "isUpgrade", js.undefined)
    
    inline def setMemberLevelName(value: String): Self = StObject.set(x, "memberLevelName", value.asInstanceOf[js.Any])
    
    inline def setMemberLevelNameUndefined: Self = StObject.set(x, "memberLevelName", js.undefined)
  }
}
