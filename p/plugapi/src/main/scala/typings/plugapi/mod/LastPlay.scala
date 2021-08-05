package typings.plugapi.mod

import typings.plugapi.mod.User.DJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastPlay extends StObject {
  
  var dj: DJ
  
  var media: Media
  
  var score: Score
}
object LastPlay {
  
  inline def apply(dj: DJ, media: Media, score: Score): LastPlay = {
    val __obj = js.Dynamic.literal(dj = dj.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastPlay]
  }
  
  extension [Self <: LastPlay](x: Self) {
    
    inline def setDj(value: DJ): Self = StObject.set(x, "dj", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
