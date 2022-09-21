package typings.nivoAnnotations

import org.scalablytyped.runtime.TopLevel
import typings.nivoAnnotations.anon.Abs
import typings.nivoAnnotations.anon.ComputedAnnotationInstructions
import typings.nivoAnnotations.anon.DatumX
import typings.nivoAnnotations.anon.Match
import typings.nivoAnnotations.anon.Theme
import typings.nivoAnnotations.anon.Width
import typings.nivoAnnotations.anon.XY
import typings.nivoAnnotations.anon.Y
import typings.nivoAnnotations.nivoAnnotationsStrings.circle
import typings.nivoAnnotations.nivoAnnotationsStrings.dot
import typings.nivoAnnotations.nivoAnnotationsStrings.rect
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnnotationDimensionsGetter[Datum] = js.Function1[/* datum */ Datum, Width]
  
  trait AnnotationInstructions extends StObject {
    
    var angle: Double
    
    var points: js.Array[js.Tuple2[Double, Double]]
    
    var text: js.Tuple2[Double, Double]
  }
  object AnnotationInstructions {
    
    inline def apply(angle: Double, points: js.Array[js.Tuple2[Double, Double]], text: js.Tuple2[Double, Double]): AnnotationInstructions = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationInstructions]
    }
    
    extension [Self <: AnnotationInstructions](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setText(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type AnnotationMatcher[Datum] = AnnotationSpec[Datum] & Match[Datum]
  
  type AnnotationPositionGetter[Datum] = js.Function1[/* datum */ Datum, Y]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoAnnotations.typesMod.CircleAnnotationSpec[Datum]
    - typings.nivoAnnotations.typesMod.DotAnnotationSpec[Datum]
    - typings.nivoAnnotations.typesMod.RectAnnotationSpec[Datum]
  */
  trait AnnotationSpec[Datum] extends StObject
  object AnnotationSpec {
    
    inline def CircleAnnotationSpec[Datum](note: Note[Datum], noteX: RelativeOrAbsolutePosition, noteY: RelativeOrAbsolutePosition): typings.nivoAnnotations.typesMod.CircleAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("circle")
      __obj.asInstanceOf[typings.nivoAnnotations.typesMod.CircleAnnotationSpec[Datum]]
    }
    
    inline def DotAnnotationSpec[Datum](
      note: Note[Datum],
      noteX: RelativeOrAbsolutePosition,
      noteY: RelativeOrAbsolutePosition,
      size: Double
    ): typings.nivoAnnotations.typesMod.DotAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dot")
      __obj.asInstanceOf[typings.nivoAnnotations.typesMod.DotAnnotationSpec[Datum]]
    }
    
    inline def RectAnnotationSpec[Datum](note: Note[Datum], noteX: RelativeOrAbsolutePosition, noteY: RelativeOrAbsolutePosition): typings.nivoAnnotations.typesMod.RectAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rect")
      __obj.asInstanceOf[typings.nivoAnnotations.typesMod.RectAnnotationSpec[Datum]]
    }
  }
  
  /* Inlined @nivo/annotations.@nivo/annotations/dist/types/types.AnnotationSpec<unknown>['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.nivoAnnotations.nivoAnnotationsStrings.circle
    - typings.nivoAnnotations.nivoAnnotationsStrings.dot
    - typings.nivoAnnotations.nivoAnnotationsStrings.rect
  */
  trait AnnotationType extends StObject
  object AnnotationType {
    
    inline def circle: typings.nivoAnnotations.nivoAnnotationsStrings.circle = "circle".asInstanceOf[typings.nivoAnnotations.nivoAnnotationsStrings.circle]
    
    inline def dot: typings.nivoAnnotations.nivoAnnotationsStrings.dot = "dot".asInstanceOf[typings.nivoAnnotations.nivoAnnotationsStrings.dot]
    
    inline def rect: typings.nivoAnnotations.nivoAnnotationsStrings.rect = "rect".asInstanceOf[typings.nivoAnnotations.nivoAnnotationsStrings.rect]
  }
  
  trait BaseAnnotationSpec[Datum] extends StObject {
    
    var note: Note[Datum]
    
    var noteTextOffset: js.UndefOr[Double] = js.undefined
    
    var noteWidth: js.UndefOr[Double] = js.undefined
    
    var noteX: RelativeOrAbsolutePosition
    
    var noteY: RelativeOrAbsolutePosition
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object BaseAnnotationSpec {
    
    inline def apply[Datum](note: Note[Datum], noteX: RelativeOrAbsolutePosition, noteY: RelativeOrAbsolutePosition): BaseAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAnnotationSpec[Datum]]
    }
    
    extension [Self <: BaseAnnotationSpec[?], Datum](x: Self & BaseAnnotationSpec[Datum]) {
      
      inline def setNote(value: Note[Datum]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteFunction1(value: /* props */ DatumX[Datum] => Element): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
      
      inline def setNoteFunction2(value: (/* ctx */ CanvasRenderingContext2D, /* props */ Theme[Datum]) => Unit): Self = StObject.set(x, "note", js.Any.fromFunction2(value))
      
      inline def setNoteTextOffset(value: Double): Self = StObject.set(x, "noteTextOffset", value.asInstanceOf[js.Any])
      
      inline def setNoteTextOffsetUndefined: Self = StObject.set(x, "noteTextOffset", js.undefined)
      
      inline def setNoteWidth(value: Double): Self = StObject.set(x, "noteWidth", value.asInstanceOf[js.Any])
      
      inline def setNoteWidthUndefined: Self = StObject.set(x, "noteWidth", js.undefined)
      
      inline def setNoteX(value: RelativeOrAbsolutePosition): Self = StObject.set(x, "noteX", value.asInstanceOf[js.Any])
      
      inline def setNoteY(value: RelativeOrAbsolutePosition): Self = StObject.set(x, "noteY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type BoundAnnotation[Datum] = Required[AnnotationSpec[Datum]] & XY[Datum]
  
  trait CircleAnnotationSpec[Datum]
    extends StObject
       with BaseAnnotationSpec[Datum]
       with AnnotationSpec[Datum] {
    
    var height: js.UndefOr[scala.Nothing] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: circle
    
    var width: js.UndefOr[scala.Nothing] = js.undefined
  }
  object CircleAnnotationSpec {
    
    inline def apply[Datum](note: Note[Datum], noteX: RelativeOrAbsolutePosition, noteY: RelativeOrAbsolutePosition): CircleAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("circle")
      __obj.asInstanceOf[CircleAnnotationSpec[Datum]]
    }
    
    extension [Self <: CircleAnnotationSpec[?], Datum](x: Self & CircleAnnotationSpec[Datum]) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ComputedAnnotation[Datum] = BoundAnnotation[Datum] & ComputedAnnotationInstructions
  
  trait DotAnnotationSpec[Datum]
    extends StObject
       with BaseAnnotationSpec[Datum]
       with AnnotationSpec[Datum] {
    
    var height: js.UndefOr[scala.Nothing] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var size: Double
    
    var `type`: dot
    
    var width: js.UndefOr[scala.Nothing] = js.undefined
  }
  object DotAnnotationSpec {
    
    inline def apply[Datum](
      note: Note[Datum],
      noteX: RelativeOrAbsolutePosition,
      noteY: RelativeOrAbsolutePosition,
      size: Double
    ): DotAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dot")
      __obj.asInstanceOf[DotAnnotationSpec[Datum]]
    }
    
    extension [Self <: DotAnnotationSpec[?], Datum](x: Self & DotAnnotationSpec[Datum]) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: dot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type IterateeShorthand[T] = PropertyName | (js.Tuple2[PropertyName, Any]) | PartialShallow[T]
  
  type ListIterateeCustom[T, TResult] = (ListIterator[T, TResult]) | IterateeShorthand[T]
  
  type ListIterator[T, TResult] = js.Function3[/* value */ T, /* index */ Double, /* collection */ ArrayLike[T], TResult]
  
  type Note[Datum] = NoteSvg[Datum] | NoteCanvas[Datum]
  
  type NoteCanvas[Datum] = String | NoteCanvasRenderer[Datum]
  
  type NoteCanvasRenderer[Datum] = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ Theme[Datum], Unit]
  
  type NoteComponent[Datum] = js.Function1[/* props */ DatumX[Datum], Element]
  
  type NoteSvg[Datum] = String | ReactElement | NoteComponent[Datum]
  
  type PartialShallow[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends object? object : T[P]}
    */ typings.nivoAnnotations.nivoAnnotationsStrings.PartialShallow & TopLevel[Any]
  
  type PropertyName = String | Double | js.Symbol
  
  trait RectAnnotationSpec[Datum]
    extends StObject
       with BaseAnnotationSpec[Datum]
       with AnnotationSpec[Datum] {
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[scala.Nothing] = js.undefined
    
    var `type`: rect
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object RectAnnotationSpec {
    
    inline def apply[Datum](note: Note[Datum], noteX: RelativeOrAbsolutePosition, noteY: RelativeOrAbsolutePosition): RectAnnotationSpec[Datum] = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rect")
      __obj.asInstanceOf[RectAnnotationSpec[Datum]]
    }
    
    extension [Self <: RectAnnotationSpec[?], Datum](x: Self & RectAnnotationSpec[Datum]) {
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type RelativeOrAbsolutePosition = Double | Abs
}
