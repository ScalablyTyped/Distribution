package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorLayoutInfo extends js.Object {
  /**
    * The height of the content (actual height)
    */
  val contentHeight: Double
  /**
    * Left position for the content (actual text)
    */
  val contentLeft: Double
  /**
    * The width of the content (actual text)
    */
  val contentWidth: Double
  /**
    * The height of the line decorations.
    */
  val decorationsHeight: Double
  /**
    * Left position for the line decorations.
    */
  val decorationsLeft: Double
  /**
    * The width of the line decorations.
    */
  val decorationsWidth: Double
  /**
    * The height of the glyph margin.
    */
  val glyphMarginHeight: Double
  /**
    * Left position for the glyph margin.
    */
  val glyphMarginLeft: Double
  /**
    * The width of the glyph margin.
    */
  val glyphMarginWidth: Double
  /**
    * Full editor height.
    */
  val height: Double
  /**
    * The height of the horizontal scrollbar.
    */
  val horizontalScrollbarHeight: Double
  /**
    * The height of the line numbers.
    */
  val lineNumbersHeight: Double
  /**
    * Left position for the line numbers.
    */
  val lineNumbersLeft: Double
  /**
    * The width of the line numbers.
    */
  val lineNumbersWidth: Double
  /**
    * The position for the minimap
    */
  val minimapLeft: Double
  /**
    * The width of the minimap
    */
  val minimapWidth: Double
  /**
    * The position of the overview ruler.
    */
  val overviewRuler: OverviewRulerPosition
  /**
    * Minimap render type
    */
  val renderMinimap: RenderMinimap
  /**
    * The width of the vertical scrollbar.
    */
  val verticalScrollbarWidth: Double
  /**
    * The number of columns (of typical characters) fitting on a viewport line.
    */
  val viewportColumn: Double
  /**
    * Full editor width.
    */
  val width: Double
}

object EditorLayoutInfo {
  @scala.inline
  def apply(
    contentHeight: Double,
    contentLeft: Double,
    contentWidth: Double,
    decorationsHeight: Double,
    decorationsLeft: Double,
    decorationsWidth: Double,
    glyphMarginHeight: Double,
    glyphMarginLeft: Double,
    glyphMarginWidth: Double,
    height: Double,
    horizontalScrollbarHeight: Double,
    lineNumbersHeight: Double,
    lineNumbersLeft: Double,
    lineNumbersWidth: Double,
    minimapLeft: Double,
    minimapWidth: Double,
    overviewRuler: OverviewRulerPosition,
    renderMinimap: RenderMinimap,
    verticalScrollbarWidth: Double,
    viewportColumn: Double,
    width: Double
  ): EditorLayoutInfo = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight, contentLeft = contentLeft, contentWidth = contentWidth, decorationsHeight = decorationsHeight, decorationsLeft = decorationsLeft, decorationsWidth = decorationsWidth, glyphMarginHeight = glyphMarginHeight, glyphMarginLeft = glyphMarginLeft, glyphMarginWidth = glyphMarginWidth, height = height, horizontalScrollbarHeight = horizontalScrollbarHeight, lineNumbersHeight = lineNumbersHeight, lineNumbersLeft = lineNumbersLeft, lineNumbersWidth = lineNumbersWidth, minimapLeft = minimapLeft, minimapWidth = minimapWidth, overviewRuler = overviewRuler, renderMinimap = renderMinimap, verticalScrollbarWidth = verticalScrollbarWidth, viewportColumn = viewportColumn, width = width)
  
    __obj.asInstanceOf[EditorLayoutInfo]
  }
}

