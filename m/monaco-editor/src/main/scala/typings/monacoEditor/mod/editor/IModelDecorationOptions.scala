package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDecorationOptions extends js.Object {
  /**
    * If set, the decoration will be rendered after the text with this CSS class name.
    */
  var afterContentClassName: js.UndefOr[String | Null] = js.undefined
  /**
    * If set, the decoration will be rendered before the text with this CSS class name.
    */
  var beforeContentClassName: js.UndefOr[String | Null] = js.undefined
  /**
    * CSS class name describing the decoration.
    */
  var className: js.UndefOr[String | Null] = js.undefined
  /**
    * If set, the decoration will be rendered in the glyph margin with this CSS class name.
    */
  var glyphMarginClassName: js.UndefOr[String | Null] = js.undefined
  /**
    * Message to be rendered when hovering over the glyph margin decoration.
    */
  var glyphMarginHoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.undefined
  /**
    * Array of MarkdownString to render as the decoration message.
    */
  var hoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.undefined
  /**
    * If set, the decoration will be rendered inline with the text with this CSS class name.
    * Please use this only for CSS rules that must impact the text. For example, use `className`
    * to have a background color decoration.
    */
  var inlineClassName: js.UndefOr[String | Null] = js.undefined
  /**
    * If there is an `inlineClassName` which affects letter spacing.
    */
  var inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the decoration expand to encompass a whole line.
    */
  var isWholeLine: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, the decoration will be rendered in the lines decorations with this CSS class name.
    */
  var linesDecorationsClassName: js.UndefOr[String | Null] = js.undefined
  /**
    * If set, the decoration will be rendered in the margin (covering its full width) with this CSS class name.
    */
  var marginClassName: js.UndefOr[String | Null] = js.undefined
  /**
    * If set, render this decoration in the minimap.
    */
  var minimap: js.UndefOr[IModelDecorationMinimapOptions | Null] = js.undefined
  /**
    * If set, render this decoration in the overview ruler.
    */
  var overviewRuler: js.UndefOr[IModelDecorationOverviewRulerOptions | Null] = js.undefined
  /**
    * Customize the growing behavior of the decoration when typing at the edges of the decoration.
    * Defaults to TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges
    */
  var stickiness: js.UndefOr[TrackedRangeStickiness] = js.undefined
  /**
    * Specifies the stack order of a decoration.
    * A decoration with greater stack order is always in front of a decoration with a lower stack order.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IModelDecorationOptions {
  @scala.inline
  def apply(
    afterContentClassName: js.UndefOr[Null | String] = js.undefined,
    beforeContentClassName: js.UndefOr[Null | String] = js.undefined,
    className: js.UndefOr[Null | String] = js.undefined,
    glyphMarginClassName: js.UndefOr[Null | String] = js.undefined,
    glyphMarginHoverMessage: js.UndefOr[Null | IMarkdownString | js.Array[IMarkdownString]] = js.undefined,
    hoverMessage: js.UndefOr[Null | IMarkdownString | js.Array[IMarkdownString]] = js.undefined,
    inlineClassName: js.UndefOr[Null | String] = js.undefined,
    inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.undefined,
    isWholeLine: js.UndefOr[Boolean] = js.undefined,
    linesDecorationsClassName: js.UndefOr[Null | String] = js.undefined,
    marginClassName: js.UndefOr[Null | String] = js.undefined,
    minimap: js.UndefOr[Null | IModelDecorationMinimapOptions] = js.undefined,
    overviewRuler: js.UndefOr[Null | IModelDecorationOverviewRulerOptions] = js.undefined,
    stickiness: TrackedRangeStickiness = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IModelDecorationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(afterContentClassName)) __obj.updateDynamic("afterContentClassName")(afterContentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeContentClassName)) __obj.updateDynamic("beforeContentClassName")(beforeContentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphMarginClassName)) __obj.updateDynamic("glyphMarginClassName")(glyphMarginClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphMarginHoverMessage)) __obj.updateDynamic("glyphMarginHoverMessage")(glyphMarginHoverMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverMessage)) __obj.updateDynamic("hoverMessage")(hoverMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineClassName)) __obj.updateDynamic("inlineClassName")(inlineClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineClassNameAffectsLetterSpacing)) __obj.updateDynamic("inlineClassNameAffectsLetterSpacing")(inlineClassNameAffectsLetterSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isWholeLine)) __obj.updateDynamic("isWholeLine")(isWholeLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linesDecorationsClassName)) __obj.updateDynamic("linesDecorationsClassName")(linesDecorationsClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(marginClassName)) __obj.updateDynamic("marginClassName")(marginClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(minimap)) __obj.updateDynamic("minimap")(minimap.asInstanceOf[js.Any])
    if (!js.isUndefined(overviewRuler)) __obj.updateDynamic("overviewRuler")(overviewRuler.asInstanceOf[js.Any])
    if (stickiness != null) __obj.updateDynamic("stickiness")(stickiness.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationOptions]
  }
}

