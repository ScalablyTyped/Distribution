package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistContentDetails extends StObject {
  
  /** The number of videos in the playlist. */
  var itemCount: js.UndefOr[Double] = js.undefined
}
object PlaylistContentDetails {
  
  @scala.inline
  def apply(): PlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistContentDetails]
  }
  
  @scala.inline
  implicit class PlaylistContentDetailsMutableBuilder[Self <: PlaylistContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
  }
}
