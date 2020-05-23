package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttConfig extends js.Object {
  /**
    * **axisFormat** - datetime format of the axis, this might need adjustment to match your locale and preferences
    * default: '%Y-%m-%d'
    */
  var axisFormat: js.UndefOr[String] = js.undefined
  /**
    * **barGap** - the margin between the different activities in the gantt diagram
    * default: 4
    */
  var barGap: js.UndefOr[Double] = js.undefined
  /**
    * **barHeight** - the height of the bars in the graph
    * default: 20
    */
  var barHeight: js.UndefOr[Double] = js.undefined
  /**
    * **fontFamily** - font family ...
    * default:  '"Open-Sans", "sans-serif"'
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    *  **fontSize** - font size ...
    * default: 11
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    *  **gridLineStartPadding** - Vertical starting position of the grid lines
    * default: 35
    */
  var gridLineStartPadding: js.UndefOr[Double] = js.undefined
  /**
    *  **leftPadding** - the space allocated for the section name to the left of the activities.
    * default: 75
    */
  var leftPadding: js.UndefOr[Double] = js.undefined
  /**
    * **numberSectionStyles** - the number of alternating section styles
    * default: 4
    */
  var numberSectionStyles: js.UndefOr[Double] = js.undefined
  /**
    * **titleTopMargin** - margin top for the text over the gantt diagram
    * default: 25
    */
  var titleTopMargin: js.UndefOr[Double] = js.undefined
  /**
    *  **topPadding** - margin between title and gantt diagram and between axis and gantt diagram.
    * default: 50
    */
  var topPadding: js.UndefOr[Double] = js.undefined
}

object GanttConfig {
  @scala.inline
  def apply(
    axisFormat: String = null,
    barGap: js.UndefOr[Double] = js.undefined,
    barHeight: js.UndefOr[Double] = js.undefined,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    gridLineStartPadding: js.UndefOr[Double] = js.undefined,
    leftPadding: js.UndefOr[Double] = js.undefined,
    numberSectionStyles: js.UndefOr[Double] = js.undefined,
    titleTopMargin: js.UndefOr[Double] = js.undefined,
    topPadding: js.UndefOr[Double] = js.undefined
  ): GanttConfig = {
    val __obj = js.Dynamic.literal()
    if (axisFormat != null) __obj.updateDynamic("axisFormat")(axisFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(barGap)) __obj.updateDynamic("barGap")(barGap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barHeight)) __obj.updateDynamic("barHeight")(barHeight.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLineStartPadding)) __obj.updateDynamic("gridLineStartPadding")(gridLineStartPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftPadding)) __obj.updateDynamic("leftPadding")(leftPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberSectionStyles)) __obj.updateDynamic("numberSectionStyles")(numberSectionStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleTopMargin)) __obj.updateDynamic("titleTopMargin")(titleTopMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topPadding)) __obj.updateDynamic("topPadding")(topPadding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttConfig]
  }
}

