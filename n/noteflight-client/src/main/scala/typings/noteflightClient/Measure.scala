package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measure extends StObject {
  
  /**
    * an array of Objects representing the note sets in each measure. Each note set represents a rest, a note or a chord in the measure.
    */
  var noteSets: js.Array[NoteSet]
}
object Measure {
  
  inline def apply(noteSets: js.Array[NoteSet]): Measure = {
    val __obj = js.Dynamic.literal(noteSets = noteSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure]
  }
  
  extension [Self <: Measure](x: Self) {
    
    inline def setNoteSets(value: js.Array[NoteSet]): Self = StObject.set(x, "noteSets", value.asInstanceOf[js.Any])
    
    inline def setNoteSetsVarargs(value: NoteSet*): Self = StObject.set(x, "noteSets", js.Array(value*))
  }
}
