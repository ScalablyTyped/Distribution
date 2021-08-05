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
  
  inline def apply(): IModelDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelDecorationOptions]
  }
  
  extension [Self <: IModelDecorationOptions](x: Self) {
    
    inline def setAfterContentClassName(value: String): Self = StObject.set(x, "afterContentClassName", value.asInstanceOf[js.Any])
    
    inline def setAfterContentClassNameNull: Self = StObject.set(x, "afterContentClassName", null)
    
    inline def setAfterContentClassNameUndefined: Self = StObject.set(x, "afterContentClassName", js.undefined)
    
    inline def setBeforeContentClassName(value: String): Self = StObject.set(x, "beforeContentClassName", value.asInstanceOf[js.Any])
    
    inline def setBeforeContentClassNameNull: Self = StObject.set(x, "beforeContentClassName", null)
    
    inline def setBeforeContentClassNameUndefined: Self = StObject.set(x, "beforeContentClassName", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setFirstLineDecorationClassName(value: String): Self = StObject.set(x, "firstLineDecorationClassName", value.asInstanceOf[js.Any])
    
    inline def setFirstLineDecorationClassNameNull: Self = StObject.set(x, "firstLineDecorationClassName", null)
    
    inline def setFirstLineDecorationClassNameUndefined: Self = StObject.set(x, "firstLineDecorationClassName", js.undefined)
    
    inline def setGlyphMarginClassName(value: String): Self = StObject.set(x, "glyphMarginClassName", value.asInstanceOf[js.Any])
    
    inline def setGlyphMarginClassNameNull: Self = StObject.set(x, "glyphMarginClassName", null)
    
    inline def setGlyphMarginClassNameUndefined: Self = StObject.set(x, "glyphMarginClassName", js.undefined)
    
    inline def setGlyphMarginHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = StObject.set(x, "glyphMarginHoverMessage", value.asInstanceOf[js.Any])
    
    inline def setGlyphMarginHoverMessageNull: Self = StObject.set(x, "glyphMarginHoverMessage", null)
    
    inline def setGlyphMarginHoverMessageUndefined: Self = StObject.set(x, "glyphMarginHoverMessage", js.undefined)
    
    inline def setGlyphMarginHoverMessageVarargs(value: IMarkdownString*): Self = StObject.set(x, "glyphMarginHoverMessage", js.Array(value :_*))
    
    inline def setHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = StObject.set(x, "hoverMessage", value.asInstanceOf[js.Any])
    
    inline def setHoverMessageNull: Self = StObject.set(x, "hoverMessage", null)
    
    inline def setHoverMessageUndefined: Self = StObject.set(x, "hoverMessage", js.undefined)
    
    inline def setHoverMessageVarargs(value: IMarkdownString*): Self = StObject.set(x, "hoverMessage", js.Array(value :_*))
    
    inline def setInlineClassName(value: String): Self = StObject.set(x, "inlineClassName", value.asInstanceOf[js.Any])
    
    inline def setInlineClassNameAffectsLetterSpacing(value: Boolean): Self = StObject.set(x, "inlineClassNameAffectsLetterSpacing", value.asInstanceOf[js.Any])
    
    inline def setInlineClassNameAffectsLetterSpacingUndefined: Self = StObject.set(x, "inlineClassNameAffectsLetterSpacing", js.undefined)
    
    inline def setInlineClassNameNull: Self = StObject.set(x, "inlineClassName", null)
    
    inline def setInlineClassNameUndefined: Self = StObject.set(x, "inlineClassName", js.undefined)
    
    inline def setIsWholeLine(value: Boolean): Self = StObject.set(x, "isWholeLine", value.asInstanceOf[js.Any])
    
    inline def setIsWholeLineUndefined: Self = StObject.set(x, "isWholeLine", js.undefined)
    
    inline def setLinesDecorationsClassName(value: String): Self = StObject.set(x, "linesDecorationsClassName", value.asInstanceOf[js.Any])
    
    inline def setLinesDecorationsClassNameNull: Self = StObject.set(x, "linesDecorationsClassName", null)
    
    inline def setLinesDecorationsClassNameUndefined: Self = StObject.set(x, "linesDecorationsClassName", js.undefined)
    
    inline def setMarginClassName(value: String): Self = StObject.set(x, "marginClassName", value.asInstanceOf[js.Any])
    
    inline def setMarginClassNameNull: Self = StObject.set(x, "marginClassName", null)
    
    inline def setMarginClassNameUndefined: Self = StObject.set(x, "marginClassName", js.undefined)
    
    inline def setMinimap(value: IModelDecorationMinimapOptions): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
    
    inline def setMinimapNull: Self = StObject.set(x, "minimap", null)
    
    inline def setMinimapUndefined: Self = StObject.set(x, "minimap", js.undefined)
    
    inline def setOverviewRuler(value: IModelDecorationOverviewRulerOptions): Self = StObject.set(x, "overviewRuler", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerNull: Self = StObject.set(x, "overviewRuler", null)
    
    inline def setOverviewRulerUndefined: Self = StObject.set(x, "overviewRuler", js.undefined)
    
    inline def setStickiness(value: TrackedRangeStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    inline def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
