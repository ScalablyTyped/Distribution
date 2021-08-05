package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipsLevelSnippet extends StObject {
  
  /** The id of the channel that's offering channel memberships. */
  var creatorChannelId: js.UndefOr[String] = js.undefined
  
  /** Details about the pricing level. */
  var levelDetails: js.UndefOr[LevelDetails] = js.undefined
}
object MembershipsLevelSnippet {
  
  inline def apply(): MembershipsLevelSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsLevelSnippet]
  }
  
  extension [Self <: MembershipsLevelSnippet](x: Self) {
    
    inline def setCreatorChannelId(value: String): Self = StObject.set(x, "creatorChannelId", value.asInstanceOf[js.Any])
    
    inline def setCreatorChannelIdUndefined: Self = StObject.set(x, "creatorChannelId", js.undefined)
    
    inline def setLevelDetails(value: LevelDetails): Self = StObject.set(x, "levelDetails", value.asInstanceOf[js.Any])
    
    inline def setLevelDetailsUndefined: Self = StObject.set(x, "levelDetails", js.undefined)
  }
}
