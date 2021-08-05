package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistStatus extends StObject {
  
  /** The playlist's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.undefined
}
object PlaylistStatus {
  
  inline def apply(): PlaylistStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistStatus]
  }
  
  extension [Self <: PlaylistStatus](x: Self) {
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
