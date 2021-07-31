package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMarkdownString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecorationOptions extends StObject {
  
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
    * If set, the decoration will be rendered in the lines decorations with this CSS class name, but only for the first line in case of line wrapping.
    */
  var firstLineDecorationClassName: js.UndefOr[String | Null] = js.undefined
  
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
  def apply(): IModelDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelDecorationOptions]
  }
  
  @scala.inline
  implicit class IModelDecorationOptionsMutableBuilder[Self <: IModelDecorationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterContentClassName(value: String): Self = StObject.set(x, "afterContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterContentClassNameNull: Self = StObject.set(x, "afterContentClassName", null)
    
    @scala.inline
    def setAfterContentClassNameUndefined: Self = StObject.set(x, "afterContentClassName", js.undefined)
    
    @scala.inline
    def setBeforeContentClassName(value: String): Self = StObject.set(x, "beforeContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeContentClassNameNull: Self = StObject.set(x, "beforeContentClassName", null)
    
    @scala.inline
    def setBeforeContentClassNameUndefined: Self = StObject.set(x, "beforeContentClassName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setFirstLineDecorationClassName(value: String): Self = StObject.set(x, "firstLineDecorationClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineDecorationClassNameNull: Self = StObject.set(x, "firstLineDecorationClassName", null)
    
    @scala.inline
    def setFirstLineDecorationClassNameUndefined: Self = StObject.set(x, "firstLineDecorationClassName", js.undefined)
    
    @scala.inline
    def setGlyphMarginClassName(value: String): Self = StObject.set(x, "glyphMarginClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphMarginClassNameNull: Self = StObject.set(x, "glyphMarginClassName", null)
    
    @scala.inline
    def setGlyphMarginClassNameUndefined: Self = StObject.set(x, "glyphMarginClassName", js.undefined)
    
    @scala.inline
    def setGlyphMarginHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = StObject.set(x, "glyphMarginHoverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphMarginHoverMessageNull: Self = StObject.set(x, "glyphMarginHoverMessage", null)
    
    @scala.inline
    def setGlyphMarginHoverMessageUndefined: Self = StObject.set(x, "glyphMarginHoverMessage", js.undefined)
    
    @scala.inline
    def setGlyphMarginHoverMessageVarargs(value: IMarkdownString*): Self = StObject.set(x, "glyphMarginHoverMessage", js.Array(value :_*))
    
    @scala.inline
    def setHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = StObject.set(x, "hoverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverMessageNull: Self = StObject.set(x, "hoverMessage", null)
    
    @scala.inline
    def setHoverMessageUndefined: Self = StObject.set(x, "hoverMessage", js.undefined)
    
    @scala.inline
    def setHoverMessageVarargs(value: IMarkdownString*): Self = StObject.set(x, "hoverMessage", js.Array(value :_*))
    
    @scala.inline
    def setInlineClassName(value: String): Self = StObject.set(x, "inlineClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineClassNameAffectsLetterSpacing(value: Boolean): Self = StObject.set(x, "inlineClassNameAffectsLetterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineClassNameAffectsLetterSpacingUndefined: Self = StObject.set(x, "inlineClassNameAffectsLetterSpacing", js.undefined)
    
    @scala.inline
    def setInlineClassNameNull: Self = StObject.set(x, "inlineClassName", null)
    
    @scala.inline
    def setInlineClassNameUndefined: Self = StObject.set(x, "inlineClassName", js.undefined)
    
    @scala.inline
    def setIsWholeLine(value: Boolean): Self = StObject.set(x, "isWholeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWholeLineUndefined: Self = StObject.set(x, "isWholeLine", js.undefined)
    
    @scala.inline
    def setLinesDecorationsClassName(value: String): Self = StObject.set(x, "linesDecorationsClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesDecorationsClassNameNull: Self = StObject.set(x, "linesDecorationsClassName", null)
    
    @scala.inline
    def setLinesDecorationsClassNameUndefined: Self = StObject.set(x, "linesDecorationsClassName", js.undefined)
    
    @scala.inline
    def setMarginClassName(value: String): Self = StObject.set(x, "marginClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginClassNameNull: Self = StObject.set(x, "marginClassName", null)
    
    @scala.inline
    def setMarginClassNameUndefined: Self = StObject.set(x, "marginClassName", js.undefined)
    
    @scala.inline
    def setMinimap(value: IModelDecorationMinimapOptions): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapNull: Self = StObject.set(x, "minimap", null)
    
    @scala.inline
    def setMinimapUndefined: Self = StObject.set(x, "minimap", js.undefined)
    
    @scala.inline
    def setOverviewRuler(value: IModelDecorationOverviewRulerOptions): Self = StObject.set(x, "overviewRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewRulerNull: Self = StObject.set(x, "overviewRuler", null)
    
    @scala.inline
    def setOverviewRulerUndefined: Self = StObject.set(x, "overviewRuler", js.undefined)
    
    @scala.inline
    def setStickiness(value: TrackedRangeStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
