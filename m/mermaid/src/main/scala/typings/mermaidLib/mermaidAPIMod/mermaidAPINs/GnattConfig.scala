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

