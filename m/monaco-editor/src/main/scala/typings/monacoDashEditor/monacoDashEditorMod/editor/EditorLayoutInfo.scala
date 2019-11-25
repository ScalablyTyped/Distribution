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
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], contentLeft = contentLeft.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], decorationsHeight = decorationsHeight.asInstanceOf[js.Any], decorationsLeft = decorationsLeft.asInstanceOf[js.Any], decorationsWidth = decorationsWidth.asInstanceOf[js.Any], glyphMarginHeight = glyphMarginHeight.asInstanceOf[js.Any], glyphMarginLeft = glyphMarginLeft.asInstanceOf[js.Any], glyphMarginWidth = glyphMarginWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontalScrollbarHeight = horizontalScrollbarHeight.asInstanceOf[js.Any], lineNumbersHeight = lineNumbersHeight.asInstanceOf[js.Any], lineNumbersLeft = lineNumbersLeft.asInstanceOf[js.Any], lineNumbersWidth = lineNumbersWidth.asInstanceOf[js.Any], minimapLeft = minimapLeft.asInstanceOf[js.Any], minimapWidth = minimapWidth.asInstanceOf[js.Any], overviewRuler = overviewRuler.asInstanceOf[js.Any], renderMinimap = renderMinimap.asInstanceOf[js.Any], verticalScrollbarWidth = verticalScrollbarWidth.asInstanceOf[js.Any], viewportColumn = viewportColumn.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorLayoutInfo]
  }
}

