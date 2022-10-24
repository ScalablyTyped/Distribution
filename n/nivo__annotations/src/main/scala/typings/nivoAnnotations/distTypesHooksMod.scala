package typings.nivoAnnotations

import typings.nivoAnnotations.anon.AnnotationsArray
import typings.nivoAnnotations.anon.Computed
import typings.nivoAnnotations.anon.GetDimensions
import typings.nivoAnnotations.anon.Height
import typings.nivoAnnotations.anon.NoteTextOffset
import typings.nivoAnnotations.distTypesTypesMod.AnnotationInstructions
import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/annotations/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnnotations[Datum](param0: GetDimensions[Datum]): js.Array[BoundAnnotation[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnnotations")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[BoundAnnotation[Datum]]]
  
  inline def useComputedAnnotation[Datum](annotation: BoundAnnotation[Datum]): AnnotationInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputedAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[AnnotationInstructions]
  
  inline def useComputedAnnotations[Datum](param0: AnnotationsArray[Datum]): js.Array[Computed[Datum] | NoteTextOffset[Datum] | Height[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputedAnnotations")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Computed[Datum] | NoteTextOffset[Datum] | Height[Datum]]]
}
