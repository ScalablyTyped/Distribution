package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.NoteSvg
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note[Datum] extends StObject {
  
  var datum: Datum
  
  var note: NoteSvg[Datum]
  
  var x: Double
  
  var y: Double
}
object Note {
  
  inline def apply[Datum](datum: Datum, note: NoteSvg[Datum], x: Double, y: Double): Note[Datum] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note[Datum]]
  }
  
  extension [Self <: Note[?], Datum](x: Self & Note[Datum]) {
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setNote(value: NoteSvg[Datum]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteFunction1(value: /* props */ XY[Datum] => Element): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
