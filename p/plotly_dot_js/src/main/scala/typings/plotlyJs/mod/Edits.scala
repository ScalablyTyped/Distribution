package typings.plotlyJs.mod

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
    val __obj = js.Dynamic.literal(annotationPosition = annotationPosition.asInstanceOf[js.Any], annotationTail = annotationTail.asInstanceOf[js.Any], annotationText = annotationText.asInstanceOf[js.Any], axisTitleText = axisTitleText.asInstanceOf[js.Any], colorbarPosition = colorbarPosition.asInstanceOf[js.Any], colorbarTitleText = colorbarTitleText.asInstanceOf[js.Any], legendPosition = legendPosition.asInstanceOf[js.Any], legendText = legendText.asInstanceOf[js.Any], shapePosition = shapePosition.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Edits]
  }
}

