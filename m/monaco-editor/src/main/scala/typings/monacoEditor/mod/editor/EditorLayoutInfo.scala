package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorLayoutInfo extends js.Object {
  
  /**
    * Left position for the content (actual text)
    */
  val contentLeft: Double = js.native
  
  /**
    * The width of the content (actual text)
    */
  val contentWidth: Double = js.native
  
  /**
    * Left position for the line decorations.
    */
  val decorationsLeft: Double = js.native
  
  /**
    * The width of the line decorations.
    */
  val decorationsWidth: Double = js.native
  
  /**
    * Left position for the glyph margin.
    */
  val glyphMarginLeft: Double = js.native
  
  /**
    * The width of the glyph margin.
    */
  val glyphMarginWidth: Double = js.native
  
  /**
    * Full editor height.
    */
  val height: Double = js.native
  
  /**
    * The height of the horizontal scrollbar.
    */
  val horizontalScrollbarHeight: Double = js.native
  
  val isViewportWrapping: Boolean = js.native
  
  val isWordWrapMinified: Boolean = js.native
  
  /**
    * Left position for the line numbers.
    */
  val lineNumbersLeft: Double = js.native
  
  /**
    * The width of the line numbers.
    */
  val lineNumbersWidth: Double = js.native
  
  /**
    * Layout information for the minimap
    */
  val minimap: EditorMinimapLayoutInfo = js.native
  
  /**
    * The position of the overview ruler.
    */
  val overviewRuler: OverviewRulerPosition = js.native
  
  /**
    * The width of the vertical scrollbar.
    */
  val verticalScrollbarWidth: Double = js.native
  
  /**
    * The number of columns (of typical characters) fitting on a viewport line.
    */
  val viewportColumn: Double = js.native
  
  /**
    * Full editor width.
    */
  val width: Double = js.native
  
  val wrappingColumn: Double = js.native
}
object EditorLayoutInfo {
  
  @scala.inline
  def apply(
    contentLeft: Double,
    contentWidth: Double,
    decorationsLeft: Double,
    decorationsWidth: Double,
    glyphMarginLeft: Double,
    glyphMarginWidth: Double,
    height: Double,
    horizontalScrollbarHeight: Double,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    lineNumbersLeft: Double,
    lineNumbersWidth: Double,
    minimap: EditorMinimapLayoutInfo,
    overviewRuler: OverviewRulerPosition,
    verticalScrollbarWidth: Double,
    viewportColumn: Double,
    width: Double,
    wrappingColumn: Double
  ): EditorLayoutInfo = {
    val __obj = js.Dynamic.literal(contentLeft = contentLeft.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], decorationsLeft = decorationsLeft.asInstanceOf[js.Any], decorationsWidth = decorationsWidth.asInstanceOf[js.Any], glyphMarginLeft = glyphMarginLeft.asInstanceOf[js.Any], glyphMarginWidth = glyphMarginWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontalScrollbarHeight = horizontalScrollbarHeight.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], lineNumbersLeft = lineNumbersLeft.asInstanceOf[js.Any], lineNumbersWidth = lineNumbersWidth.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], overviewRuler = overviewRuler.asInstanceOf[js.Any], verticalScrollbarWidth = verticalScrollbarWidth.asInstanceOf[js.Any], viewportColumn = viewportColumn.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorLayoutInfo]
  }
  
  @scala.inline
  implicit class EditorLayoutInfoOps[Self <: EditorLayoutInfo] (val x: Self) extends AnyVal {
    
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
    def setContentLeft(value: Double): Self = this.set("contentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidth(value: Double): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationsLeft(value: Double): Self = this.set("decorationsLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationsWidth(value: Double): Self = this.set("decorationsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphMarginLeft(value: Double): Self = this.set("glyphMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphMarginWidth(value: Double): Self = this.set("glyphMarginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollbarHeight(value: Double): Self = this.set("horizontalScrollbarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsViewportWrapping(value: Boolean): Self = this.set("isViewportWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWordWrapMinified(value: Boolean): Self = this.set("isWordWrapMinified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbersLeft(value: Double): Self = this.set("lineNumbersLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbersWidth(value: Double): Self = this.set("lineNumbersWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimap(value: EditorMinimapLayoutInfo): Self = this.set("minimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewRuler(value: OverviewRulerPosition): Self = this.set("overviewRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollbarWidth(value: Double): Self = this.set("verticalScrollbarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportColumn(value: Double): Self = this.set("viewportColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappingColumn(value: Double): Self = this.set("wrappingColumn", value.asInstanceOf[js.Any])
  }
}
