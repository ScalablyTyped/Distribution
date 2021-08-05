package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelStatus extends StObject {
  
  /** If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity. */
  var isLinked: js.UndefOr[Boolean] = js.undefined
  
  /** The long uploads status of this channel. See https://support.google.com/youtube/answer/71673 for more information. */
  var longUploadsStatus: js.UndefOr[String] = js.undefined
  
  var madeForKids: js.UndefOr[Boolean] = js.undefined
  
  /** Privacy status of the channel. */
  var privacyStatus: js.UndefOr[String] = js.undefined
  
  var selfDeclaredMadeForKids: js.UndefOr[Boolean] = js.undefined
}
object ChannelStatus {
  
  inline def apply(): ChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatus]
  }
  
  extension [Self <: ChannelStatus](x: Self) {
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
    
    inline def setIsLinkedUndefined: Self = StObject.set(x, "isLinked", js.undefined)
    
    inline def setLongUploadsStatus(value: String): Self = StObject.set(x, "longUploadsStatus", value.asInstanceOf[js.Any])
    
    inline def setLongUploadsStatusUndefined: Self = StObject.set(x, "longUploadsStatus", js.undefined)
    
    inline def setMadeForKids(value: Boolean): Self = StObject.set(x, "madeForKids", value.asInstanceOf[js.Any])
    
    inline def setMadeForKidsUndefined: Self = StObject.set(x, "madeForKids", js.undefined)
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    inline def setSelfDeclaredMadeForKids(value: Boolean): Self = StObject.set(x, "selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    inline def setSelfDeclaredMadeForKidsUndefined: Self = StObject.set(x, "selfDeclaredMadeForKids", js.undefined)
  }
}
