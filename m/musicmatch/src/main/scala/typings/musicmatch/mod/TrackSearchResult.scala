package typings.musicmatch.mod

import typings.musicmatch.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSearchResult extends StObject {
  
  var message: Body
}
object TrackSearchResult {
  
  @scala.inline
  def apply(message: Body): TrackSearchResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSearchResult]
  }
  
  @scala.inline
  implicit class TrackSearchResultMutableBuilder[Self <: TrackSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Body): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
