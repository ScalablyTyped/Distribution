package typings.mermaid.mermaidAPIMod.mermaidAPINs

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
    actorMargin: Int | Double = null,
    bottomMarginAdj: Int | Double = null,
    boxMargin: Int | Double = null,
    boxTextMargin: Int | Double = null,
    diagramMarginX: Int | Double = null,
    diagramMarginY: Int | Double = null,
    height: Int | Double = null,
    messageMargin: Int | Double = null,
    mirrorActors: js.UndefOr[Boolean] = js.undefined,
    noteMargin: Int | Double = null,
    useMaxWidth: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): SequenceDiagramConfig = {
    val __obj = js.Dynamic.literal()
    if (actorMargin != null) __obj.updateDynamic("actorMargin")(actorMargin.asInstanceOf[js.Any])
    if (bottomMarginAdj != null) __obj.updateDynamic("bottomMarginAdj")(bottomMarginAdj.asInstanceOf[js.Any])
    if (boxMargin != null) __obj.updateDynamic("boxMargin")(boxMargin.asInstanceOf[js.Any])
    if (boxTextMargin != null) __obj.updateDynamic("boxTextMargin")(boxTextMargin.asInstanceOf[js.Any])
    if (diagramMarginX != null) __obj.updateDynamic("diagramMarginX")(diagramMarginX.asInstanceOf[js.Any])
    if (diagramMarginY != null) __obj.updateDynamic("diagramMarginY")(diagramMarginY.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messageMargin != null) __obj.updateDynamic("messageMargin")(messageMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrorActors)) __obj.updateDynamic("mirrorActors")(mirrorActors)
    if (noteMargin != null) __obj.updateDynamic("noteMargin")(noteMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaxWidth)) __obj.updateDynamic("useMaxWidth")(useMaxWidth)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceDiagramConfig]
  }
}

