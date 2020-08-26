package typings.nivoAnnotations.mod

import typings.nivoAnnotations.nivoAnnotationsStrings.circle
import typings.nivoAnnotations.nivoAnnotationsStrings.dot
import typings.nivoAnnotations.nivoAnnotationsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoAnnotations.mod.CircleAnnotationProps
  - typings.nivoAnnotations.mod.DotAnnotationProps
  - typings.nivoAnnotations.mod.RectAnnotationProps
*/
trait AnnotationProps extends js.Object

object AnnotationProps {
  @scala.inline
  def CircleAnnotationProps(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    size: Double,
    `type`: circle,
    x: Double,
    y: Double
  ): AnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
  @scala.inline
  def DotAnnotationProps(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    `type`: dot,
    x: Double,
    y: Double
  ): AnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
  @scala.inline
  def RectAnnotationProps(
    containerHeight: Double,
    containerWidth: Double,
    height: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    `type`: rect,
    width: Double,
    x: Double,
    y: Double
  ): AnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
}

