package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edits extends js.Object {
  var annotationPosition: scala.Boolean
  var annotationTail: scala.Boolean
  var annotationText: scala.Boolean
  var axisTitleText: scala.Boolean
  var colorbarPosition: scala.Boolean
  var colorbarTitleText: scala.Boolean
  var legendPosition: scala.Boolean
  var legendText: scala.Boolean
  var shapePosition: scala.Boolean
  var titleText: scala.Boolean
}

object Edits {
  @scala.inline
  def apply(
    annotationPosition: scala.Boolean,
    annotationTail: scala.Boolean,
    annotationText: scala.Boolean,
    axisTitleText: scala.Boolean,
    colorbarPosition: scala.Boolean,
    colorbarTitleText: scala.Boolean,
    legendPosition: scala.Boolean,
    legendText: scala.Boolean,
    shapePosition: scala.Boolean,
    titleText: scala.Boolean
  ): Edits = {
    val __obj = js.Dynamic.literal(annotationPosition = annotationPosition, annotationTail = annotationTail, annotationText = annotationText, axisTitleText = axisTitleText, colorbarPosition = colorbarPosition, colorbarTitleText = colorbarTitleText, legendPosition = legendPosition, legendText = legendText, shapePosition = shapePosition, titleText = titleText)
  
    __obj.asInstanceOf[Edits]
  }
}

