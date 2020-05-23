package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Edits> */
trait PartialEdits extends js.Object {
  var annotationPosition: js.UndefOr[Boolean] = js.undefined
  var annotationTail: js.UndefOr[Boolean] = js.undefined
  var annotationText: js.UndefOr[Boolean] = js.undefined
  var axisTitleText: js.UndefOr[Boolean] = js.undefined
  var colorbarPosition: js.UndefOr[Boolean] = js.undefined
  var colorbarTitleText: js.UndefOr[Boolean] = js.undefined
  var legendPosition: js.UndefOr[Boolean] = js.undefined
  var legendText: js.UndefOr[Boolean] = js.undefined
  var shapePosition: js.UndefOr[Boolean] = js.undefined
  var titleText: js.UndefOr[Boolean] = js.undefined
}

object PartialEdits {
  @scala.inline
  def apply(
    annotationPosition: js.UndefOr[Boolean] = js.undefined,
    annotationTail: js.UndefOr[Boolean] = js.undefined,
    annotationText: js.UndefOr[Boolean] = js.undefined,
    axisTitleText: js.UndefOr[Boolean] = js.undefined,
    colorbarPosition: js.UndefOr[Boolean] = js.undefined,
    colorbarTitleText: js.UndefOr[Boolean] = js.undefined,
    legendPosition: js.UndefOr[Boolean] = js.undefined,
    legendText: js.UndefOr[Boolean] = js.undefined,
    shapePosition: js.UndefOr[Boolean] = js.undefined,
    titleText: js.UndefOr[Boolean] = js.undefined
  ): PartialEdits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotationPosition)) __obj.updateDynamic("annotationPosition")(annotationPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(annotationTail)) __obj.updateDynamic("annotationTail")(annotationTail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(annotationText)) __obj.updateDynamic("annotationText")(annotationText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisTitleText)) __obj.updateDynamic("axisTitleText")(axisTitleText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorbarPosition)) __obj.updateDynamic("colorbarPosition")(colorbarPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorbarTitleText)) __obj.updateDynamic("colorbarTitleText")(colorbarTitleText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(legendPosition)) __obj.updateDynamic("legendPosition")(legendPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(legendText)) __obj.updateDynamic("legendText")(legendText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shapePosition)) __obj.updateDynamic("shapePosition")(shapePosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleText)) __obj.updateDynamic("titleText")(titleText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEdits]
  }
}

