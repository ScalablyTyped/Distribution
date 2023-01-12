package typings.noteflightClient

import typings.noteflightClient.noteflightClientStrings.aeolian
import typings.noteflightClient.noteflightClientStrings.dorian
import typings.noteflightClient.noteflightClientStrings.ionian
import typings.noteflightClient.noteflightClientStrings.locrian
import typings.noteflightClient.noteflightClientStrings.lydian
import typings.noteflightClient.noteflightClientStrings.major
import typings.noteflightClient.noteflightClientStrings.minor
import typings.noteflightClient.noteflightClientStrings.mixolydian
import typings.noteflightClient.noteflightClientStrings.phrygian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySignature extends StObject {
  
  /**
    * The key signature's distance from C major / A minor by fifths, expressed as a number between -7 and 7.
    * If positive, equal to the number of sharps in the key signature; if negative, equal to the number of flats.
    */
  var fifths: Double
  
  /**
    * 	the mode of the key signature: one of "major", "minor", "ionian", "dorian", "phrygian", "lydian", "mixolydian", "aeolian", or "locrian". Left undefined if the score's mode is unknown.
    */
  var mode: js.UndefOr[
    major | minor | ionian | dorian | phrygian | lydian | mixolydian | aeolian | locrian
  ] = js.undefined
  
  /**
    * the first note of the key signature's scale. Left undefined if the score's mode is unknown.
    */
  var tonic: String
}
object KeySignature {
  
  inline def apply(fifths: Double, tonic: String): KeySignature = {
    val __obj = js.Dynamic.literal(fifths = fifths.asInstanceOf[js.Any], tonic = tonic.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySignature] (val x: Self) extends AnyVal {
    
    inline def setFifths(value: Double): Self = StObject.set(x, "fifths", value.asInstanceOf[js.Any])
    
    inline def setMode(value: major | minor | ionian | dorian | phrygian | lydian | mixolydian | aeolian | locrian): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTonic(value: String): Self = StObject.set(x, "tonic", value.asInstanceOf[js.Any])
  }
}
