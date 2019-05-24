package typings
package atNivoAnnotationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoAnnotationsMod {
  type AnnotationProps = CircleAnnotationProps | DotAnnotationProps | RectAnnotationProps
  type CircleAnnotationProps = CommonAnnotationProps with atNivoAnnotationsLib.Anon_Circle
  type CommonAnnotationProps = atNivoAnnotationsLib.Anon_ContainerHeight with atNivoCoreLib.atNivoCoreMod.MotionProps
  type DotAnnotationProps = CommonAnnotationProps with atNivoAnnotationsLib.Anon_Dot
  type NoteCoordinate = scala.Double | atNivoAnnotationsLib.Anon_Abs
  type RectAnnotationProps = CommonAnnotationProps with atNivoAnnotationsLib.Anon_Height
}
