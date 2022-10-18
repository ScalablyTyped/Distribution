package typings.nivoAnnotations

import typings.nivoAnnotations.distTypesTypesMod.AnnotationSpec
import typings.nivoAnnotations.distTypesTypesMod.Note
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMod {
  
  @JSImport("@nivo/annotations/dist/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCanvasNote[Datum](note: Note[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteCanvas<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanvasNote")(note.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteCanvas<Datum> */ Boolean]
  
  inline def isCircleAnnotation[Datum](annotationSpec: AnnotationSpec[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.CircleAnnotationSpec<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCircleAnnotation")(annotationSpec.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.CircleAnnotationSpec<Datum> */ Boolean]
  
  inline def isDotAnnotation[Datum](annotationSpec: AnnotationSpec[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.DotAnnotationSpec<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDotAnnotation")(annotationSpec.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.DotAnnotationSpec<Datum> */ Boolean]
  
  inline def isRectAnnotation[Datum](annotationSpec: AnnotationSpec[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.RectAnnotationSpec<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRectAnnotation")(annotationSpec.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.RectAnnotationSpec<Datum> */ Boolean]
  
  inline def isSvgNote[Datum](note: Note[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteSvg<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSvgNote")(note.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteSvg<Datum> */ Boolean]
}
