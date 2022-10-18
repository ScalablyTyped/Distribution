package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.AnnotationInstructions
import typings.nivoAnnotations.distTypesTypesMod.RelativeOrAbsolutePosition
import typings.nivoAnnotations.nivoAnnotationsStrings.rect
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height[Datum] extends StObject {
  
  var borderRadius: Double
  
  var computed: AnnotationInstructions
  
  var datum: Datum
  
  var height: Double
  
  var note: typings.nivoAnnotations.distTypesTypesMod.Note[Datum]
  
  var noteTextOffset: Double
  
  var noteWidth: Double
  
  var noteX: RelativeOrAbsolutePosition
  
  var noteY: RelativeOrAbsolutePosition
  
  var offset: Double
  
  var `type`: rect
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object Height {
  
  inline def apply[Datum](
    borderRadius: Double,
    computed: AnnotationInstructions,
    datum: Datum,
    height: Double,
    note: typings.nivoAnnotations.distTypesTypesMod.Note[Datum],
    noteTextOffset: Double,
    noteWidth: Double,
    noteX: RelativeOrAbsolutePosition,
    noteY: RelativeOrAbsolutePosition,
    offset: Double,
    width: Double,
    x: Double,
    y: Double
  ): Height[Datum] = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], noteTextOffset = noteTextOffset.asInstanceOf[js.Any], noteWidth = noteWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[Height[Datum]]
  }
  
  extension [Self <: Height[?], Datum](x: Self & Height[Datum]) {
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: AnnotationInstructions): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNote(value: typings.nivoAnnotations.distTypesTypesMod.Note[Datum]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteFunction1(value: /* props */ XY[Datum] => Element): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
    
    inline def setNoteFunction2(value: (/* ctx */ CanvasRenderingContext2D, /* props */ Theme[Datum]) => Unit): Self = StObject.set(x, "note", js.Any.fromFunction2(value))
    
    inline def setNoteTextOffset(value: Double): Self = StObject.set(x, "noteTextOffset", value.asInstanceOf[js.Any])
    
    inline def setNoteWidth(value: Double): Self = StObject.set(x, "noteWidth", value.asInstanceOf[js.Any])
    
    inline def setNoteX(value: RelativeOrAbsolutePosition): Self = StObject.set(x, "noteX", value.asInstanceOf[js.Any])
    
    inline def setNoteY(value: RelativeOrAbsolutePosition): Self = StObject.set(x, "noteY", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
