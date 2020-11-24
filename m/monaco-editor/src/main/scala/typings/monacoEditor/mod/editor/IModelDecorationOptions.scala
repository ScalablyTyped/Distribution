package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDecorationOptions extends js.Object {
  
  /**
    * If set, the decoration will be rendered after the text with this CSS class name.
    */
  var afterContentClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * If set, the decoration will be rendered before the text with this CSS class name.
    */
  var beforeContentClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * CSS class name describing the decoration.
    */
  var className: js.UndefOr[String | Null] = js.native
  
  /**
    * If set, the decoration will be rendered in the lines decorations with this CSS class name, but only for the first line in case of line wrapping.
    */
  var firstLineDecorationClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * If set, the decoration will be rendered in the glyph margin with this CSS class name.
    */
  var glyphMarginClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * Message to be rendered when hovering over the glyph margin decoration.
    */
  var glyphMarginHoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.native
  
  /**
    * Array of MarkdownString to render as the decoration message.
    */
  var hoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.native
  
  /**
    * If set, the decoration will be rendered inline with the text with this CSS class name.
    * Please use this only for CSS rules that must impact the text. For example, use `className`
    * to have a background color decoration.
    */
  var inlineClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * If there is an `inlineClassName` which affects letter spacing.
    */
  var inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the decoration expand to encompass a whole line.
    */
  var isWholeLine: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, the decoration will be rendered in the lines decorations with this CSS class name.
    */
  var linesDecorationsClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * If set, the decoration will be rendered in the margin (covering its full width) with this CSS class name.
    */
  var marginClassName: js.UndefOr[String | Null] = js.native
  
  /**
    * If set, render this decoration in the minimap.
    */
  var minimap: js.UndefOr[IModelDecorationMinimapOptions | Null] = js.native
  
  /**
    * If set, render this decoration in the overview ruler.
    */
  var overviewRuler: js.UndefOr[IModelDecorationOverviewRulerOptions | Null] = js.native
  
  /**
    * Customize the growing behavior of the decoration when typing at the edges of the decoration.
    * Defaults to TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges
    */
  var stickiness: js.UndefOr[TrackedRangeStickiness] = js.native
  
  /**
    * Specifies the stack order of a decoration.
    * A decoration with greater stack order is always in front of a decoration with a lower stack order.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object IModelDecorationOptions {
  
  @scala.inline
  def apply(): IModelDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelDecorationOptions]
  }
  
  @scala.inline
  implicit class IModelDecorationOptionsOps[Self <: IModelDecorationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterContentClassName(value: String): Self = this.set("afterContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterContentClassName: Self = this.set("afterContentClassName", js.undefined)
    
    @scala.inline
    def setAfterContentClassNameNull: Self = this.set("afterContentClassName", null)
    
    @scala.inline
    def setBeforeContentClassName(value: String): Self = this.set("beforeContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeContentClassName: Self = this.set("beforeContentClassName", js.undefined)
    
    @scala.inline
    def setBeforeContentClassNameNull: Self = this.set("beforeContentClassName", null)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    
    @scala.inline
    def setFirstLineDecorationClassName(value: String): Self = this.set("firstLineDecorationClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineDecorationClassName: Self = this.set("firstLineDecorationClassName", js.undefined)
    
    @scala.inline
    def setFirstLineDecorationClassNameNull: Self = this.set("firstLineDecorationClassName", null)
    
    @scala.inline
    def setGlyphMarginClassName(value: String): Self = this.set("glyphMarginClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphMarginClassName: Self = this.set("glyphMarginClassName", js.undefined)
    
    @scala.inline
    def setGlyphMarginClassNameNull: Self = this.set("glyphMarginClassName", null)
    
    @scala.inline
    def setGlyphMarginHoverMessageVarargs(value: IMarkdownString*): Self = this.set("glyphMarginHoverMessage", js.Array(value :_*))
    
    @scala.inline
    def setGlyphMarginHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = this.set("glyphMarginHoverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphMarginHoverMessage: Self = this.set("glyphMarginHoverMessage", js.undefined)
    
    @scala.inline
    def setGlyphMarginHoverMessageNull: Self = this.set("glyphMarginHoverMessage", null)
    
    @scala.inline
    def setHoverMessageVarargs(value: IMarkdownString*): Self = this.set("hoverMessage", js.Array(value :_*))
    
    @scala.inline
    def setHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = this.set("hoverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMessage: Self = this.set("hoverMessage", js.undefined)
    
    @scala.inline
    def setHoverMessageNull: Self = this.set("hoverMessage", null)
    
    @scala.inline
    def setInlineClassName(value: String): Self = this.set("inlineClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineClassName: Self = this.set("inlineClassName", js.undefined)
    
    @scala.inline
    def setInlineClassNameNull: Self = this.set("inlineClassName", null)
    
    @scala.inline
    def setInlineClassNameAffectsLetterSpacing(value: Boolean): Self = this.set("inlineClassNameAffectsLetterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineClassNameAffectsLetterSpacing: Self = this.set("inlineClassNameAffectsLetterSpacing", js.undefined)
    
    @scala.inline
    def setIsWholeLine(value: Boolean): Self = this.set("isWholeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWholeLine: Self = this.set("isWholeLine", js.undefined)
    
    @scala.inline
    def setLinesDecorationsClassName(value: String): Self = this.set("linesDecorationsClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesDecorationsClassName: Self = this.set("linesDecorationsClassName", js.undefined)
    
    @scala.inline
    def setLinesDecorationsClassNameNull: Self = this.set("linesDecorationsClassName", null)
    
    @scala.inline
    def setMarginClassName(value: String): Self = this.set("marginClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginClassName: Self = this.set("marginClassName", js.undefined)
    
    @scala.inline
    def setMarginClassNameNull: Self = this.set("marginClassName", null)
    
    @scala.inline
    def setMinimap(value: IModelDecorationMinimapOptions): Self = this.set("minimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimap: Self = this.set("minimap", js.undefined)
    
    @scala.inline
    def setMinimapNull: Self = this.set("minimap", null)
    
    @scala.inline
    def setOverviewRuler(value: IModelDecorationOverviewRulerOptions): Self = this.set("overviewRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverviewRuler: Self = this.set("overviewRuler", js.undefined)
    
    @scala.inline
    def setOverviewRulerNull: Self = this.set("overviewRuler", null)
    
    @scala.inline
    def setStickiness(value: TrackedRangeStickiness): Self = this.set("stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickiness: Self = this.set("stickiness", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
