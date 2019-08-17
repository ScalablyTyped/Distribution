package typings.atNivoAnnotations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoAnnotationsMod {
  import typings.atNivoAnnotations.Anon_Abs
  import typings.atNivoAnnotations.Anon_Circle
  import typings.atNivoAnnotations.Anon_ContainerHeight
  import typings.atNivoAnnotations.Anon_Dot
  import typings.atNivoAnnotations.Anon_Height
  import typings.atNivoCore.atNivoCoreMod.MotionProps

  type AnnotationProps = CircleAnnotationProps | DotAnnotationProps | RectAnnotationProps
  type CircleAnnotationProps = CommonAnnotationProps with Anon_Circle
  type CommonAnnotationProps = Anon_ContainerHeight with MotionProps
  type DotAnnotationProps = CommonAnnotationProps with Anon_Dot
  type NoteCoordinate = Double | Anon_Abs
  type RectAnnotationProps = CommonAnnotationProps with Anon_Height
}
