package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedPlaybackDuration extends StObject {
  
  var hours: Double
  
  var minutes: Double
}
object FormattedPlaybackDuration {
  
  inline def apply(hours: Double, minutes: Double): FormattedPlaybackDuration = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedPlaybackDuration]
  }
  
  extension [Self <: FormattedPlaybackDuration](x: Self) {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
