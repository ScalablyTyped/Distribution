package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part extends StObject {
  
  /**
    * Forces selection of an alternate enharmonic key signature in a transposed part, if one is available.
    */
  var alternateKey: Boolean
  
  /**
    * Per-part volume adjustment, with 0 corresponding to no adjustment.
    */
  var gain: Double
  
  /**
    * Whether the part is muted and will be left out during playback.
    */
  var muted: Boolean
  
  /**
    * The full name of the instrument.
    */
  var name: String
  
  /**
    * Number of octaves above concert pitch by which the part's notation is transposed.
    */
  var octaveShift: Double
  
  /**
    * Instrument's left or right pan when playing.
    */
  var pan: Double
  
  /**
    * Transposition of the part's score relative to concert pitch, measured in semitones upward.
    */
  var transposition: Double
  
  /**
    * Whether the part is shown in the score.
    */
  var visible: Boolean
}
object Part {
  
  inline def apply(
    alternateKey: Boolean,
    gain: Double,
    muted: Boolean,
    name: String,
    octaveShift: Double,
    pan: Double,
    transposition: Double,
    visible: Boolean
  ): Part = {
    val __obj = js.Dynamic.literal(alternateKey = alternateKey.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], octaveShift = octaveShift.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], transposition = transposition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Part] (val x: Self) extends AnyVal {
    
    inline def setAlternateKey(value: Boolean): Self = StObject.set(x, "alternateKey", value.asInstanceOf[js.Any])
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOctaveShift(value: Double): Self = StObject.set(x, "octaveShift", value.asInstanceOf[js.Any])
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setTransposition(value: Double): Self = StObject.set(x, "transposition", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
