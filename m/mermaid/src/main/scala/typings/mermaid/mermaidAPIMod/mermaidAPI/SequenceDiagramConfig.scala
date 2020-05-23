package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceDiagramConfig extends js.Object {
  /**
    * **actorMargin** - Margin between actors
    * default: 10
    */
  var actorMargin: js.UndefOr[Double] = js.undefined
  /**
    * **bottomMarginAdj** - Depending on css styling this might need adjustment.
    * Prolongs the edge of the diagram downwards
    * default: 1
    */
  var bottomMarginAdj: js.UndefOr[Double] = js.undefined
  /**
    * **boxMargin** - Margin around loop boxes
    * default: 10
    */
  var boxMargin: js.UndefOr[Double] = js.undefined
  /**
    * **boxTextMargin** - margin around the text in loop/alt/opt boxes
    * default: 5
    */
  var boxTextMargin: js.UndefOr[Double] = js.undefined
  /**
    * **diagramMarginX** - margin to the right and left of the sequence diagram
    * default: 50
    */
  var diagramMarginX: js.UndefOr[Double] = js.undefined
  /**
    * **diagramMarginY** - margin to the over and under the sequence diagram
    * default: 10
    */
  var diagramMarginY: js.UndefOr[Double] = js.undefined
  /**
    * **height** - Height of actor boxes
    * default: 65
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * **messageMargin** - Space between messages
    * default: 35
    */
  var messageMargin: js.UndefOr[Double] = js.undefined
  /**
    * **mirrorActors** - mirror actors under diagram
    * default: true
    */
  var mirrorActors: js.UndefOr[Boolean] = js.undefined
  /**
    * **noteMargin** - margin around notes
    * default: 10
    */
  var noteMargin: js.UndefOr[Double] = js.undefined
  /**
    * **useMaxWidth** - when this flag is set the height and width is set to 100% and is then scaling with the
    * available space if not the absolute space required is used
    * default: true
    */
  var useMaxWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * **width** - Width of actor boxes
    * default: 150
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SequenceDiagramConfig {
  @scala.inline
  def apply(
    actorMargin: js.UndefOr[Double] = js.undefined,
    bottomMarginAdj: js.UndefOr[Double] = js.undefined,
    boxMargin: js.UndefOr[Double] = js.undefined,
    boxTextMargin: js.UndefOr[Double] = js.undefined,
    diagramMarginX: js.UndefOr[Double] = js.undefined,
    diagramMarginY: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    messageMargin: js.UndefOr[Double] = js.undefined,
    mirrorActors: js.UndefOr[Boolean] = js.undefined,
    noteMargin: js.UndefOr[Double] = js.undefined,
    useMaxWidth: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SequenceDiagramConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actorMargin)) __obj.updateDynamic("actorMargin")(actorMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomMarginAdj)) __obj.updateDynamic("bottomMarginAdj")(bottomMarginAdj.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxMargin)) __obj.updateDynamic("boxMargin")(boxMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxTextMargin)) __obj.updateDynamic("boxTextMargin")(boxTextMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diagramMarginX)) __obj.updateDynamic("diagramMarginX")(diagramMarginX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diagramMarginY)) __obj.updateDynamic("diagramMarginY")(diagramMarginY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageMargin)) __obj.updateDynamic("messageMargin")(messageMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrorActors)) __obj.updateDynamic("mirrorActors")(mirrorActors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noteMargin)) __obj.updateDynamic("noteMargin")(noteMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaxWidth)) __obj.updateDynamic("useMaxWidth")(useMaxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceDiagramConfig]
  }
}

