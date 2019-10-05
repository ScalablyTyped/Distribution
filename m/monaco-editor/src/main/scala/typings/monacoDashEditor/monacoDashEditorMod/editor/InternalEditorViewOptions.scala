package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorStrings.all
import typings.monacoDashEditor.monacoDashEditorStrings.boundary
import typings.monacoDashEditor.monacoDashEditorStrings.gutter
import typings.monacoDashEditor.monacoDashEditorStrings.line
import typings.monacoDashEditor.monacoDashEditorStrings.none
import typings.monacoDashEditor.monacoDashEditorStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorViewOptions extends js.Object {
  val ariaLabel: String
  val cursorBlinking: TextEditorCursorBlinkingStyle
  val cursorSmoothCaretAnimation: Boolean
  val cursorStyle: TextEditorCursorStyle
  val cursorSurroundingLines: Double
  val cursorWidth: Double
  val disableMonospaceOptimizations: Boolean
  val extraEditorClassName: String
  val fixedOverflowWidgets: Boolean
  val fontLigatures: Boolean
  val glyphMargin: Boolean
  val hideCursorInOverviewRuler: Boolean
  val highlightActiveIndentGuide: Boolean
  val minimap: InternalEditorMinimapOptions
  val mouseWheelZoom: Boolean
  val overviewRulerBorder: Boolean
  val overviewRulerLanes: Double
  val renderControlCharacters: Boolean
  val renderCustomLineNumbers: (js.Function1[/* lineNumber */ Double, String]) | Null
  val renderFinalNewline: Boolean
  val renderIndentGuides: Boolean
  val renderLineHighlight: none | gutter | line | all
  val renderLineNumbers: RenderLineNumbersType
  val renderWhitespace: none | boundary | selection | all
  val revealHorizontalRightPadding: Double
  val roundedSelection: Boolean
  val rulers: js.Array[Double]
  val scrollBeyondLastColumn: Double
  val scrollBeyondLastLine: Boolean
  val scrollbar: InternalEditorScrollbarOptions
  val selectOnLineNumbers: Boolean
  val smoothScrolling: Boolean
  val stopRenderingLineAfter: Double
}

object InternalEditorViewOptions {
  @scala.inline
  def apply(
    ariaLabel: String,
    cursorBlinking: TextEditorCursorBlinkingStyle,
    cursorSmoothCaretAnimation: Boolean,
    cursorStyle: TextEditorCursorStyle,
    cursorSurroundingLines: Double,
    cursorWidth: Double,
    disableMonospaceOptimizations: Boolean,
    extraEditorClassName: String,
    fixedOverflowWidgets: Boolean,
    fontLigatures: Boolean,
    glyphMargin: Boolean,
    hideCursorInOverviewRuler: Boolean,
    highlightActiveIndentGuide: Boolean,
    minimap: InternalEditorMinimapOptions,
    mouseWheelZoom: Boolean,
    overviewRulerBorder: Boolean,
    overviewRulerLanes: Double,
    renderControlCharacters: Boolean,
    renderFinalNewline: Boolean,
    renderIndentGuides: Boolean,
    renderLineHighlight: none | gutter | line | all,
    renderLineNumbers: RenderLineNumbersType,
    renderWhitespace: none | boundary | selection | all,
    revealHorizontalRightPadding: Double,
    roundedSelection: Boolean,
    rulers: js.Array[Double],
    scrollBeyondLastColumn: Double,
    scrollBeyondLastLine: Boolean,
    scrollbar: InternalEditorScrollbarOptions,
    selectOnLineNumbers: Boolean,
    smoothScrolling: Boolean,
    stopRenderingLineAfter: Double,
    renderCustomLineNumbers: /* lineNumber */ Double => String = null
  ): InternalEditorViewOptions = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel, cursorBlinking = cursorBlinking, cursorSmoothCaretAnimation = cursorSmoothCaretAnimation, cursorStyle = cursorStyle, cursorSurroundingLines = cursorSurroundingLines, cursorWidth = cursorWidth, disableMonospaceOptimizations = disableMonospaceOptimizations, extraEditorClassName = extraEditorClassName, fixedOverflowWidgets = fixedOverflowWidgets, fontLigatures = fontLigatures, glyphMargin = glyphMargin, hideCursorInOverviewRuler = hideCursorInOverviewRuler, highlightActiveIndentGuide = highlightActiveIndentGuide, minimap = minimap, mouseWheelZoom = mouseWheelZoom, overviewRulerBorder = overviewRulerBorder, overviewRulerLanes = overviewRulerLanes, renderControlCharacters = renderControlCharacters, renderFinalNewline = renderFinalNewline, renderIndentGuides = renderIndentGuides, renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineNumbers = renderLineNumbers, renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding, roundedSelection = roundedSelection, rulers = rulers, scrollBeyondLastColumn = scrollBeyondLastColumn, scrollBeyondLastLine = scrollBeyondLastLine, scrollbar = scrollbar, selectOnLineNumbers = selectOnLineNumbers, smoothScrolling = smoothScrolling, stopRenderingLineAfter = stopRenderingLineAfter)
    if (renderCustomLineNumbers != null) __obj.updateDynamic("renderCustomLineNumbers")(js.Any.fromFunction1(renderCustomLineNumbers))
    __obj.asInstanceOf[InternalEditorViewOptions]
  }
}

