package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edits extends js.Object {
  var annotationPosition: Boolean
  var annotationTail: Boolean
  var annotationText: Boolean
  var axisTitleText: Boolean
  var colorbarPosition: Boolean
  var colorbarTitleText: Boolean
  var legendPosition: Boolean
  var legendText: Boolean
  var shapePosition: Boolean
  var titleText: Boolean
}

object Edits {
  @scala.inline
  def apply(
    annotationPosition: Boolean,
    annotationTail: Boolean,
    annotationText: Boolean,
    axisTitleText: Boolean,
    colorbarPosition: Boolean,
    colorbarTitleText: Boolean,
    legendPosition: Boolean,
    legendText: Boolean,
    shapePosition: Boolean,
    titleText: Boolean
  ): Edits = {
    val __obj = js.Dynamic.literal(annotationPosition = annotationPosition, annotationTail = annotationTail, annotationText = annotationText, axisTitleText = axisTitleText, colorbarPosition = colorbarPosition, colorbarTitleText = colorbarTitleText, legendPosition = legendPosition, legendText = legendText, shapePosition = shapePosition, titleText = titleText)
  
    __obj.asInstanceOf[Edits]
  }
}

