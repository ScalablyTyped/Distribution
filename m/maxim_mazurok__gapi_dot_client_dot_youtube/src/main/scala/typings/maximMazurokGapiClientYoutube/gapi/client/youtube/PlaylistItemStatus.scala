package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItemStatus extends StObject {
  
  /** This resource's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.undefined
}
object PlaylistItemStatus {
  
  @scala.inline
  def apply(): PlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItemStatus]
  }
  
  @scala.inline
  implicit class PlaylistItemStatusMutableBuilder[Self <: PlaylistItemStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
