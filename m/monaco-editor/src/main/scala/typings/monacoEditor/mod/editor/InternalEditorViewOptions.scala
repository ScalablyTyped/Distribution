package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.all
import typings.monacoEditor.monacoEditorStrings.boundary
import typings.monacoEditor.monacoEditorStrings.gutter
import typings.monacoEditor.monacoEditorStrings.line
import typings.monacoEditor.monacoEditorStrings.none
import typings.monacoEditor.monacoEditorStrings.selection
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
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], fontLigatures = fontLigatures.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineNumbers = renderLineNumbers.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any])
    if (renderCustomLineNumbers != null) __obj.updateDynamic("renderCustomLineNumbers")(js.Any.fromFunction1(renderCustomLineNumbers))
    __obj.asInstanceOf[InternalEditorViewOptions]
  }
}

