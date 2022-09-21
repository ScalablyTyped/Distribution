package typings.nivoAnnotations

import typings.nivoAnnotations.anon.AnnotationsArray
import typings.nivoAnnotations.anon.Computed
import typings.nivoAnnotations.anon.GetDimensions
import typings.nivoAnnotations.anon.Height
import typings.nivoAnnotations.anon.NoteTextOffset
import typings.nivoAnnotations.typesMod.AnnotationInstructions
import typings.nivoAnnotations.typesMod.BoundAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/annotations/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnnotations[Datum](hasDataAnnotationsGetPositionGetDimensions: GetDimensions[Datum]): js.Array[BoundAnnotation[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnnotations")(hasDataAnnotationsGetPositionGetDimensions.asInstanceOf[js.Any]).asInstanceOf[js.Array[BoundAnnotation[Datum]]]
  
  inline def useComputedAnnotation[Datum](annotation: BoundAnnotation[Datum]): AnnotationInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputedAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[AnnotationInstructions]
  
  inline def useComputedAnnotations[Datum](hasAnnotations: AnnotationsArray[Datum]): js.Array[Computed[Datum] | NoteTextOffset[Datum] | Height[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputedAnnotations")(hasAnnotations.asInstanceOf[js.Any]).asInstanceOf[js.Array[Computed[Datum] | NoteTextOffset[Datum] | Height[Datum]]]
}
