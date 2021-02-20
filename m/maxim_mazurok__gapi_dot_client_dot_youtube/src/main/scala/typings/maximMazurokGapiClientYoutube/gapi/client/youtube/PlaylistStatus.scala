package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistStatus extends StObject {
  
  /** The playlist's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.native
}
object PlaylistStatus {
  
  @scala.inline
  def apply(): PlaylistStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistStatus]
  }
  
  @scala.inline
  implicit class PlaylistStatusMutableBuilder[Self <: PlaylistStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
