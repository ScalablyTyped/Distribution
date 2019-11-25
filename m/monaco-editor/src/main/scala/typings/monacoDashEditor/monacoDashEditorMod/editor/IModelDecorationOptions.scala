package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IMarkdownString
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
    afterContentClassName: String = null,
    beforeContentClassName: String = null,
    className: String = null,
    glyphMarginClassName: String = null,
    glyphMarginHoverMessage: IMarkdownString | js.Array[IMarkdownString] = null,
    hoverMessage: IMarkdownString | js.Array[IMarkdownString] = null,
    inlineClassName: String = null,
    inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.undefined,
    isWholeLine: js.UndefOr[Boolean] = js.undefined,
    linesDecorationsClassName: String = null,
    marginClassName: String = null,
    minimap: IModelDecorationMinimapOptions = null,
    overviewRuler: IModelDecorationOverviewRulerOptions = null,
    stickiness: TrackedRangeStickiness = null,
    zIndex: Int | Double = null
  ): IModelDecorationOptions = {
    val __obj = js.Dynamic.literal()
    if (afterContentClassName != null) __obj.updateDynamic("afterContentClassName")(afterContentClassName.asInstanceOf[js.Any])
    if (beforeContentClassName != null) __obj.updateDynamic("beforeContentClassName")(beforeContentClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (glyphMarginClassName != null) __obj.updateDynamic("glyphMarginClassName")(glyphMarginClassName.asInstanceOf[js.Any])
    if (glyphMarginHoverMessage != null) __obj.updateDynamic("glyphMarginHoverMessage")(glyphMarginHoverMessage.asInstanceOf[js.Any])
    if (hoverMessage != null) __obj.updateDynamic("hoverMessage")(hoverMessage.asInstanceOf[js.Any])
    if (inlineClassName != null) __obj.updateDynamic("inlineClassName")(inlineClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineClassNameAffectsLetterSpacing)) __obj.updateDynamic("inlineClassNameAffectsLetterSpacing")(inlineClassNameAffectsLetterSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(isWholeLine)) __obj.updateDynamic("isWholeLine")(isWholeLine.asInstanceOf[js.Any])
    if (linesDecorationsClassName != null) __obj.updateDynamic("linesDecorationsClassName")(linesDecorationsClassName.asInstanceOf[js.Any])
    if (marginClassName != null) __obj.updateDynamic("marginClassName")(marginClassName.asInstanceOf[js.Any])
    if (minimap != null) __obj.updateDynamic("minimap")(minimap.asInstanceOf[js.Any])
    if (overviewRuler != null) __obj.updateDynamic("overviewRuler")(overviewRuler.asInstanceOf[js.Any])
    if (stickiness != null) __obj.updateDynamic("stickiness")(stickiness.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationOptions]
  }
}

