package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteSet extends StObject {
  
  /**
    * Flag indicating whether this note has a beam extending to the following note.
    */
  var beam: Boolean
  
  /**
    * The fractional duration of this note set expressed in quarter notes
    */
  var duration: Double
  
  /**
    * an array of Objects representing the notes in a note set.
    * If empty, this indicates that the note set is a rest. If one element is present, indicates a regular note.
    * If multiple elements, indicates a chord.
    */
  var notes: js.Array[Note]
  
  /**
    * The fractional offset of this note set from measure start in quarter notes.
    */
  var position: Double
  
  /**
    * The index of the voice to which this note set belongs, where zero indicates the top voice in a polyphonic score.
    */
  var voice: Double
}
object NoteSet {
  
  inline def apply(beam: Boolean, duration: Double, notes: js.Array[Note], position: Double, voice: Double): NoteSet = {
    val __obj = js.Dynamic.literal(beam = beam.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteSet] (val x: Self) extends AnyVal {
    
    inline def setBeam(value: Boolean): Self = StObject.set(x, "beam", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setVoice(value: Double): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
  }
}
