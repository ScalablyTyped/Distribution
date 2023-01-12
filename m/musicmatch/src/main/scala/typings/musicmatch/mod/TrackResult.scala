package typings.musicmatch.mod

import typings.musicmatch.anon.Albumid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackResult extends StObject {
  
  var track: Albumid
}
object TrackResult {
  
  inline def apply(track: Albumid): TrackResult = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackResult] (val x: Self) extends AnyVal {
    
    inline def setTrack(value: Albumid): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
