package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackProps extends StObject {
  
  /**
    * The zero-based index of the measure at which playback should start.
    */
  var index: Double
  
  /**
    * The offset in quarter notes from the beginning of the start measure at which playback is to start.
    * This value may range from zero to the number of quarter notes in the measure.
    */
  var offset: Double
}
object PlaybackProps {
  
  inline def apply(index: Double, offset: Double): PlaybackProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackProps]
  }
  
  extension [Self <: PlaybackProps](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
