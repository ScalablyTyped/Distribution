package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSnippetParams extends StObject {
  
  var track_id: Double
}
object TrackSnippetParams {
  
  inline def apply(track_id: Double): TrackSnippetParams = {
    val __obj = js.Dynamic.literal(track_id = track_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSnippetParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackSnippetParams] (val x: Self) extends AnyVal {
    
    inline def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
  }
}
