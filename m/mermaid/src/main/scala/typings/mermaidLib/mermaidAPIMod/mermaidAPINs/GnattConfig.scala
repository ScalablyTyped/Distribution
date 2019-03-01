package typings
package mermaidLib.mermaidAPIMod.mermaidAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GnattConfig extends js.Object {
  /**
    * **axisFormat** - datetime format of the axis, this might need adjustment to match your locale and preferences
    * default: '%Y-%m-%d'
    */
  var axisFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * **barGap** - the margin between the different activities in the gantt diagram
    * default: 4
    */
  var barGap: js.UndefOr[scala.Double] = js.undefined
  /**
    * **barHeight** - the height of the bars in the graph
    * default: 20
    */
  var barHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * **fontFamily** - font family ...
    * default:  '"Open-Sans", "sans-serif"'
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  **fontSize** - font size ...
    * default: 11
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *  **gridLineStartPadding** - Vertical starting position of the grid lines
    * default: 35
    */
  var gridLineStartPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    *  **leftPadding** - the space allocated for the section name to the left of the activities.
    * default: 75
    */
  var leftPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * **numberSectionStyles** - the number of alternating section styles
    * default: 4
    */
  var numberSectionStyles: js.UndefOr[scala.Double] = js.undefined
  /**
    * **titleTopMargin** - margin top for the text over the gantt diagram
    * default: 25
    */
  var titleTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *  **topPadding** - margin between title and gantt diagram and between axis and gantt diagram.
    * default: 50
    */
  var topPadding: js.UndefOr[scala.Double] = js.undefined
}

object GnattConfig {
  @scala.inline
  def apply(
    axisFormat: java.lang.String = null,
    barGap: scala.Int | scala.Double = null,
    barHeight: scala.Int | scala.Double = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    gridLineStartPadding: scala.Int | scala.Double = null,
    leftPadding: scala.Int | scala.Double = null,
    numberSectionStyles: scala.Int | scala.Double = null,
    titleTopMargin: scala.Int | scala.Double = null,
    topPadding: scala.Int | scala.Double = null
  ): GnattConfig = {
    val __obj = js.Dynamic.literal()
    if (axisFormat != null) __obj.updateDynamic("axisFormat")(axisFormat)
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (gridLineStartPadding != null) __obj.updateDynamic("gridLineStartPadding")(gridLineStartPadding.asInstanceOf[js.Any])
    if (leftPadding != null) __obj.updateDynamic("leftPadding")(leftPadding.asInstanceOf[js.Any])
    if (numberSectionStyles != null) __obj.updateDynamic("numberSectionStyles")(numberSectionStyles.asInstanceOf[js.Any])
    if (titleTopMargin != null) __obj.updateDynamic("titleTopMargin")(titleTopMargin.asInstanceOf[js.Any])
    if (topPadding != null) __obj.updateDynamic("topPadding")(topPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GnattConfig]
  }
}

