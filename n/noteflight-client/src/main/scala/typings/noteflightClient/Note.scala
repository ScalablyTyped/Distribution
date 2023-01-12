package typings.noteflightClient

import typings.noteflightClient.noteflightClientStrings.cross
import typings.noteflightClient.noteflightClientStrings.diamond
import typings.noteflightClient.noteflightClientStrings.harmonic
import typings.noteflightClient.noteflightClientStrings.hit
import typings.noteflightClient.noteflightClientStrings.normal
import typings.noteflightClient.noteflightClientStrings.slash
import typings.noteflightClient.noteflightClientStrings.square
import typings.noteflightClient.noteflightClientStrings.stemless
import typings.noteflightClient.noteflightClientStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  /**
    * 	A string indicating the type of accidental shown visually for this note, or null if none is specified. Values include "flat", "sharp", "natural", "doubleFlat" and "doubleSharp".
    */
  var accidental: String
  
  /**
    * The number of half steps distance this note lies from the unaltered step.
    */
  var alteration: Double
  
  /**
    * Type of note head: normal, stemless, slash, hit, cross, square, diamond, triangle, or harmonic.
    */
  var noteHead: normal | stemless | slash | hit | cross | square | diamond | triangle | harmonic
  
  /**
    * The ordinal of this pitch in the standard MIDI chromatic scale numbering, at concert pitch. The number may be negative.
    */
  var pitch: Double
  
  /**
    * A number between 0 and 6 corresponding to the note spellings C, D, E, F, G, A, B respectively.
    */
  var step: Double
  
  /**
    * Flag indicating whether this note is tied to the following note.
    */
  var tied: Boolean
}
object Note {
  
  inline def apply(
    accidental: String,
    alteration: Double,
    noteHead: normal | stemless | slash | hit | cross | square | diamond | triangle | harmonic,
    pitch: Double,
    step: Double,
    tied: Boolean
  ): Note = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], alteration = alteration.asInstanceOf[js.Any], noteHead = noteHead.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tied = tied.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    inline def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setAlteration(value: Double): Self = StObject.set(x, "alteration", value.asInstanceOf[js.Any])
    
    inline def setNoteHead(value: normal | stemless | slash | hit | cross | square | diamond | triangle | harmonic): Self = StObject.set(x, "noteHead", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setTied(value: Boolean): Self = StObject.set(x, "tied", value.asInstanceOf[js.Any])
  }
}
