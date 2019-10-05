package typings.atNivoAnnotations

import typings.atNivoAnnotations.atNivoAnnotationsMod.AnnotationProps
import typings.atNivoAnnotations.atNivoAnnotationsMod.CircleAnnotationProps
import typings.atNivoAnnotations.atNivoAnnotationsMod.CommonAnnotationProps
import typings.atNivoAnnotations.atNivoAnnotationsMod.DotAnnotationProps
import typings.atNivoAnnotations.atNivoAnnotationsMod.RectAnnotationProps
import typings.atNivoCore.atNivoCoreMod.MotionProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nivo/annotations", JSImport.Namespace)
@js.native
object atNivoAnnotationsMod extends js.Object {
  @js.native
  class Annotation ()
    extends Component[AnnotationProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.atNivoAnnotations.atNivoAnnotationsStrings.circle
    - typings.atNivoAnnotations.atNivoAnnotationsStrings.dot
    - typings.atNivoAnnotations.atNivoAnnotationsStrings.rect
  */
  trait AnnotationType extends js.Object
  
  type AnnotationProps = CircleAnnotationProps | DotAnnotationProps | RectAnnotationProps
  type CircleAnnotationProps = CommonAnnotationProps with Anon_Circle
  type CommonAnnotationProps = Anon_ContainerHeight with MotionProps
  type DotAnnotationProps = CommonAnnotationProps with Anon_Dot
  type NoteCoordinate = Double | Anon_Abs
  type RectAnnotationProps = CommonAnnotationProps with Anon_Height
}

