package typings.nivoAnnotations.anon

import typings.nivoAnnotations.nivoAnnotationsStrings.circle
import typings.nivoAnnotations.typesMod.AnnotationInstructions
import typings.nivoAnnotations.typesMod.RelativeOrAbsolutePosition
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computed[Datum] extends StObject {
  
  var computed: AnnotationInstructions
  
  var datum: Datum
  
  var note: typings.nivoAnnotations.typesMod.Note[Datum]
  
  var noteTextOffset: Double
  
  var noteWidth: Double
  
  var noteX: RelativeOrAbsolutePosition
  
  var noteY: RelativeOrAbsolutePosition
  
  var offset: Double
  
  var size: Double
  
  var `type`: circle
  
  var x: Double
  
  var y: Double
}
object Computed {
  
  inline def apply[Datum](
    computed: AnnotationInstructions,
    datum: Datum,
    note: typings.nivoAnnotations.typesMod.Note[Datum],
    noteTextOffset: Double,
    noteWidth: Double,
    noteX: RelativeOrAbsolutePosition,
    noteY: RelativeOrAbsolutePosition,
    offset: Double,
    size: Double,
    x: Double,
    y: Double
  ): Computed[Datum] = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], noteTextOffset = noteTextOffset.asInstanceOf[js.Any], noteWidth = noteWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[Computed[Datum]]
  }
  
  extension [Self <: Computed[?], Datum](x: Self & Computed[Datum]) {
    
    inline def setComputed(value: AnnotationInstructions): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setNote(value: typings.nivoAnnotations.typesMod.Note[Datum]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteFunction1(value: /* props */ DatumX[Datum] => Element): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
    
    inline def setNoteFunction2(value: (/* ctx */ CanvasRenderingContext2D, /* props */ Theme[Datum]) => Unit): Self = StObject.set(x, "note", js.Any.fromFunction2(value))
    
    inline def setNoteTextOffset(value: Double): Self = StObject.set(x, "noteTextOffset", value.asInstanceOf[js.Any])
    
    inline def setNoteWidth(value: Double): Self = StObject.set(x, "noteWidth", value.asInstanceOf[js.Any])
    
    inline def setNoteX(value: RelativeOrAbsolutePosition): Self = StObject.set(x, "noteX", value.asInstanceOf[js.Any])
    
    inline def setNoteY(value: RelativeOrAbsolutePosition): Self = StObject.set(x, "noteY", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
