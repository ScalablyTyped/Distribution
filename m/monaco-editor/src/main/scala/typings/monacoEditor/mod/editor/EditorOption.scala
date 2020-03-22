package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditorOption extends js.Object

@JSImport("monaco-editor", "editor.EditorOption")
@js.native
object EditorOption extends js.Object {
  @js.native
  sealed trait acceptSuggestionOnCommitCharacter extends EditorOption
  
  @js.native
  sealed trait acceptSuggestionOnEnter extends EditorOption
  
  @js.native
  sealed trait accessibilityPageSize extends EditorOption
  
  @js.native
  sealed trait accessibilitySupport extends EditorOption
  
  @js.native
  sealed trait ariaLabel extends EditorOption
  
  @js.native
  sealed trait autoClosingBrackets extends EditorOption
  
  @js.native
  sealed trait autoClosingOvertype extends EditorOption
  
  @js.native
  sealed trait autoClosingQuotes extends EditorOption
  
  @js.native
  sealed trait autoIndent extends EditorOption
  
  @js.native
  sealed trait autoSurround extends EditorOption
  
  @js.native
  sealed trait automaticLayout extends EditorOption
  
  @js.native
  sealed trait codeLens extends EditorOption
  
  @js.native
  sealed trait colorDecorators extends EditorOption
  
  @js.native
  sealed trait comments extends EditorOption
  
  @js.native
  sealed trait contextmenu extends EditorOption
  
  @js.native
  sealed trait copyWithSyntaxHighlighting extends EditorOption
  
  @js.native
  sealed trait cursorBlinking extends EditorOption
  
  @js.native
  sealed trait cursorSmoothCaretAnimation extends EditorOption
  
  @js.native
  sealed trait cursorStyle extends EditorOption
  
  @js.native
  sealed trait cursorSurroundingLines extends EditorOption
  
  @js.native
  sealed trait cursorSurroundingLinesStyle extends EditorOption
  
  @js.native
  sealed trait cursorWidth extends EditorOption
  
  @js.native
  sealed trait disableLayerHinting extends EditorOption
  
  @js.native
  sealed trait disableMonospaceOptimizations extends EditorOption
  
  @js.native
  sealed trait dragAndDrop extends EditorOption
  
  @js.native
  sealed trait editorClassName extends EditorOption
  
  @js.native
  sealed trait emptySelectionClipboard extends EditorOption
  
  @js.native
  sealed trait extraEditorClassName extends EditorOption
  
  @js.native
  sealed trait fastScrollSensitivity extends EditorOption
  
  @js.native
  sealed trait find extends EditorOption
  
  @js.native
  sealed trait fixedOverflowWidgets extends EditorOption
  
  @js.native
  sealed trait folding extends EditorOption
  
  @js.native
  sealed trait foldingHighlight extends EditorOption
  
  @js.native
  sealed trait foldingStrategy extends EditorOption
  
  @js.native
  sealed trait fontFamily extends EditorOption
  
  @js.native
  sealed trait fontInfo extends EditorOption
  
  @js.native
  sealed trait fontLigatures extends EditorOption
  
  @js.native
  sealed trait fontSize extends EditorOption
  
  @js.native
  sealed trait fontWeight extends EditorOption
  
  @js.native
  sealed trait formatOnPaste extends EditorOption
  
  @js.native
  sealed trait formatOnType extends EditorOption
  
  @js.native
  sealed trait glyphMargin extends EditorOption
  
  @js.native
  sealed trait gotoLocation extends EditorOption
  
  @js.native
  sealed trait hideCursorInOverviewRuler extends EditorOption
  
  @js.native
  sealed trait highlightActiveIndentGuide extends EditorOption
  
  @js.native
  sealed trait hover extends EditorOption
  
  @js.native
  sealed trait inDiffEditor extends EditorOption
  
  @js.native
  sealed trait layoutInfo extends EditorOption
  
  @js.native
  sealed trait letterSpacing extends EditorOption
  
  @js.native
  sealed trait lightbulb extends EditorOption
  
  @js.native
  sealed trait lineDecorationsWidth extends EditorOption
  
  @js.native
  sealed trait lineHeight extends EditorOption
  
  @js.native
  sealed trait lineNumbers extends EditorOption
  
  @js.native
  sealed trait lineNumbersMinChars extends EditorOption
  
  @js.native
  sealed trait links extends EditorOption
  
  @js.native
  sealed trait matchBrackets extends EditorOption
  
  @js.native
  sealed trait minimap extends EditorOption
  
  @js.native
  sealed trait mouseStyle extends EditorOption
  
  @js.native
  sealed trait mouseWheelScrollSensitivity extends EditorOption
  
  @js.native
  sealed trait mouseWheelZoom extends EditorOption
  
  @js.native
  sealed trait multiCursorMergeOverlapping extends EditorOption
  
  @js.native
  sealed trait multiCursorModifier extends EditorOption
  
  @js.native
  sealed trait multiCursorPaste extends EditorOption
  
  @js.native
  sealed trait occurrencesHighlight extends EditorOption
  
  @js.native
  sealed trait overviewRulerBorder extends EditorOption
  
  @js.native
  sealed trait overviewRulerLanes extends EditorOption
  
  @js.native
  sealed trait parameterHints extends EditorOption
  
  @js.native
  sealed trait peekWidgetDefaultFocus extends EditorOption
  
  @js.native
  sealed trait pixelRatio extends EditorOption
  
  @js.native
  sealed trait quickSuggestions extends EditorOption
  
  @js.native
  sealed trait quickSuggestionsDelay extends EditorOption
  
  @js.native
  sealed trait readOnly extends EditorOption
  
  @js.native
  sealed trait renderControlCharacters extends EditorOption
  
  @js.native
  sealed trait renderFinalNewline extends EditorOption
  
  @js.native
  sealed trait renderIndentGuides extends EditorOption
  
  @js.native
  sealed trait renderLineHighlight extends EditorOption
  
  @js.native
  sealed trait renderValidationDecorations extends EditorOption
  
  @js.native
  sealed trait renderWhitespace extends EditorOption
  
  @js.native
  sealed trait revealHorizontalRightPadding extends EditorOption
  
  @js.native
  sealed trait roundedSelection extends EditorOption
  
  @js.native
  sealed trait rulers extends EditorOption
  
  @js.native
  sealed trait scrollBeyondLastColumn extends EditorOption
  
  @js.native
  sealed trait scrollBeyondLastLine extends EditorOption
  
  @js.native
  sealed trait scrollbar extends EditorOption
  
  @js.native
  sealed trait selectOnLineNumbers extends EditorOption
  
  @js.native
  sealed trait selectionClipboard extends EditorOption
  
  @js.native
  sealed trait selectionHighlight extends EditorOption
  
  @js.native
  sealed trait showFoldingControls extends EditorOption
  
  @js.native
  sealed trait showUnused extends EditorOption
  
  @js.native
  sealed trait smoothScrolling extends EditorOption
  
  @js.native
  sealed trait snippetSuggestions extends EditorOption
  
  @js.native
  sealed trait stopRenderingLineAfter extends EditorOption
  
  @js.native
  sealed trait suggest extends EditorOption
  
  @js.native
  sealed trait suggestFontSize extends EditorOption
  
  @js.native
  sealed trait suggestLineHeight extends EditorOption
  
  @js.native
  sealed trait suggestOnTriggerCharacters extends EditorOption
  
  @js.native
  sealed trait suggestSelection extends EditorOption
  
  @js.native
  sealed trait tabCompletion extends EditorOption
  
  @js.native
  sealed trait tabFocusMode extends EditorOption
  
  @js.native
  sealed trait useTabStops extends EditorOption
  
  @js.native
  sealed trait wordSeparators extends EditorOption
  
  @js.native
  sealed trait wordWrap extends EditorOption
  
  @js.native
  sealed trait wordWrapBreakAfterCharacters extends EditorOption
  
  @js.native
  sealed trait wordWrapBreakBeforeCharacters extends EditorOption
  
  @js.native
  sealed trait wordWrapColumn extends EditorOption
  
  @js.native
  sealed trait wordWrapMinified extends EditorOption
  
  @js.native
  sealed trait wrappingIndent extends EditorOption
  
  @js.native
  sealed trait wrappingInfo extends EditorOption
  
  @js.native
  sealed trait wrappingStrategy extends EditorOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorOption with Double] = js.native
  /* 0 */ @js.native
  object acceptSuggestionOnCommitCharacter extends TopLevel[acceptSuggestionOnCommitCharacter with Double]
  
  /* 1 */ @js.native
  object acceptSuggestionOnEnter extends TopLevel[acceptSuggestionOnEnter with Double]
  
  /* 3 */ @js.native
  object accessibilityPageSize extends TopLevel[accessibilityPageSize with Double]
  
  /* 2 */ @js.native
  object accessibilitySupport extends TopLevel[accessibilitySupport with Double]
  
  /* 4 */ @js.native
  object ariaLabel extends TopLevel[ariaLabel with Double]
  
  /* 5 */ @js.native
  object autoClosingBrackets extends TopLevel[autoClosingBrackets with Double]
  
  /* 6 */ @js.native
  object autoClosingOvertype extends TopLevel[autoClosingOvertype with Double]
  
  /* 7 */ @js.native
  object autoClosingQuotes extends TopLevel[autoClosingQuotes with Double]
  
  /* 8 */ @js.native
  object autoIndent extends TopLevel[autoIndent with Double]
  
  /* 10 */ @js.native
  object autoSurround extends TopLevel[autoSurround with Double]
  
  /* 9 */ @js.native
  object automaticLayout extends TopLevel[automaticLayout with Double]
  
  /* 11 */ @js.native
  object codeLens extends TopLevel[codeLens with Double]
  
  /* 12 */ @js.native
  object colorDecorators extends TopLevel[colorDecorators with Double]
  
  /* 13 */ @js.native
  object comments extends TopLevel[comments with Double]
  
  /* 14 */ @js.native
  object contextmenu extends TopLevel[contextmenu with Double]
  
  /* 15 */ @js.native
  object copyWithSyntaxHighlighting extends TopLevel[copyWithSyntaxHighlighting with Double]
  
  /* 16 */ @js.native
  object cursorBlinking extends TopLevel[cursorBlinking with Double]
  
  /* 17 */ @js.native
  object cursorSmoothCaretAnimation extends TopLevel[cursorSmoothCaretAnimation with Double]
  
  /* 18 */ @js.native
  object cursorStyle extends TopLevel[cursorStyle with Double]
  
  /* 19 */ @js.native
  object cursorSurroundingLines extends TopLevel[cursorSurroundingLines with Double]
  
  /* 20 */ @js.native
  object cursorSurroundingLinesStyle extends TopLevel[cursorSurroundingLinesStyle with Double]
  
  /* 21 */ @js.native
  object cursorWidth extends TopLevel[cursorWidth with Double]
  
  /* 22 */ @js.native
  object disableLayerHinting extends TopLevel[disableLayerHinting with Double]
  
  /* 23 */ @js.native
  object disableMonospaceOptimizations extends TopLevel[disableMonospaceOptimizations with Double]
  
  /* 24 */ @js.native
  object dragAndDrop extends TopLevel[dragAndDrop with Double]
  
  /* 104 */ @js.native
  object editorClassName extends TopLevel[editorClassName with Double]
  
  /* 25 */ @js.native
  object emptySelectionClipboard extends TopLevel[emptySelectionClipboard with Double]
  
  /* 26 */ @js.native
  object extraEditorClassName extends TopLevel[extraEditorClassName with Double]
  
  /* 27 */ @js.native
  object fastScrollSensitivity extends TopLevel[fastScrollSensitivity with Double]
  
  /* 28 */ @js.native
  object find extends TopLevel[find with Double]
  
  /* 29 */ @js.native
  object fixedOverflowWidgets extends TopLevel[fixedOverflowWidgets with Double]
  
  /* 30 */ @js.native
  object folding extends TopLevel[folding with Double]
  
  /* 32 */ @js.native
  object foldingHighlight extends TopLevel[foldingHighlight with Double]
  
  /* 31 */ @js.native
  object foldingStrategy extends TopLevel[foldingStrategy with Double]
  
  /* 33 */ @js.native
  object fontFamily extends TopLevel[fontFamily with Double]
  
  /* 34 */ @js.native
  object fontInfo extends TopLevel[fontInfo with Double]
  
  /* 35 */ @js.native
  object fontLigatures extends TopLevel[fontLigatures with Double]
  
  /* 36 */ @js.native
  object fontSize extends TopLevel[fontSize with Double]
  
  /* 37 */ @js.native
  object fontWeight extends TopLevel[fontWeight with Double]
  
  /* 38 */ @js.native
  object formatOnPaste extends TopLevel[formatOnPaste with Double]
  
  /* 39 */ @js.native
  object formatOnType extends TopLevel[formatOnType with Double]
  
  /* 40 */ @js.native
  object glyphMargin extends TopLevel[glyphMargin with Double]
  
  /* 41 */ @js.native
  object gotoLocation extends TopLevel[gotoLocation with Double]
  
  /* 42 */ @js.native
  object hideCursorInOverviewRuler extends TopLevel[hideCursorInOverviewRuler with Double]
  
  /* 43 */ @js.native
  object highlightActiveIndentGuide extends TopLevel[highlightActiveIndentGuide with Double]
  
  /* 44 */ @js.native
  object hover extends TopLevel[hover with Double]
  
  /* 45 */ @js.native
  object inDiffEditor extends TopLevel[inDiffEditor with Double]
  
  /* 107 */ @js.native
  object layoutInfo extends TopLevel[layoutInfo with Double]
  
  /* 46 */ @js.native
  object letterSpacing extends TopLevel[letterSpacing with Double]
  
  /* 47 */ @js.native
  object lightbulb extends TopLevel[lightbulb with Double]
  
  /* 48 */ @js.native
  object lineDecorationsWidth extends TopLevel[lineDecorationsWidth with Double]
  
  /* 49 */ @js.native
  object lineHeight extends TopLevel[lineHeight with Double]
  
  /* 50 */ @js.native
  object lineNumbers extends TopLevel[lineNumbers with Double]
  
  /* 51 */ @js.native
  object lineNumbersMinChars extends TopLevel[lineNumbersMinChars with Double]
  
  /* 52 */ @js.native
  object links extends TopLevel[links with Double]
  
  /* 53 */ @js.native
  object matchBrackets extends TopLevel[matchBrackets with Double]
  
  /* 54 */ @js.native
  object minimap extends TopLevel[minimap with Double]
  
  /* 55 */ @js.native
  object mouseStyle extends TopLevel[mouseStyle with Double]
  
  /* 56 */ @js.native
  object mouseWheelScrollSensitivity extends TopLevel[mouseWheelScrollSensitivity with Double]
  
  /* 57 */ @js.native
  object mouseWheelZoom extends TopLevel[mouseWheelZoom with Double]
  
  /* 58 */ @js.native
  object multiCursorMergeOverlapping extends TopLevel[multiCursorMergeOverlapping with Double]
  
  /* 59 */ @js.native
  object multiCursorModifier extends TopLevel[multiCursorModifier with Double]
  
  /* 60 */ @js.native
  object multiCursorPaste extends TopLevel[multiCursorPaste with Double]
  
  /* 61 */ @js.native
  object occurrencesHighlight extends TopLevel[occurrencesHighlight with Double]
  
  /* 62 */ @js.native
  object overviewRulerBorder extends TopLevel[overviewRulerBorder with Double]
  
  /* 63 */ @js.native
  object overviewRulerLanes extends TopLevel[overviewRulerLanes with Double]
  
  /* 64 */ @js.native
  object parameterHints extends TopLevel[parameterHints with Double]
  
  /* 65 */ @js.native
  object peekWidgetDefaultFocus extends TopLevel[peekWidgetDefaultFocus with Double]
  
  /* 105 */ @js.native
  object pixelRatio extends TopLevel[pixelRatio with Double]
  
  /* 66 */ @js.native
  object quickSuggestions extends TopLevel[quickSuggestions with Double]
  
  /* 67 */ @js.native
  object quickSuggestionsDelay extends TopLevel[quickSuggestionsDelay with Double]
  
  /* 68 */ @js.native
  object readOnly extends TopLevel[readOnly with Double]
  
  /* 69 */ @js.native
  object renderControlCharacters extends TopLevel[renderControlCharacters with Double]
  
  /* 71 */ @js.native
  object renderFinalNewline extends TopLevel[renderFinalNewline with Double]
  
  /* 70 */ @js.native
  object renderIndentGuides extends TopLevel[renderIndentGuides with Double]
  
  /* 72 */ @js.native
  object renderLineHighlight extends TopLevel[renderLineHighlight with Double]
  
  /* 73 */ @js.native
  object renderValidationDecorations extends TopLevel[renderValidationDecorations with Double]
  
  /* 74 */ @js.native
  object renderWhitespace extends TopLevel[renderWhitespace with Double]
  
  /* 75 */ @js.native
  object revealHorizontalRightPadding extends TopLevel[revealHorizontalRightPadding with Double]
  
  /* 76 */ @js.native
  object roundedSelection extends TopLevel[roundedSelection with Double]
  
  /* 77 */ @js.native
  object rulers extends TopLevel[rulers with Double]
  
  /* 79 */ @js.native
  object scrollBeyondLastColumn extends TopLevel[scrollBeyondLastColumn with Double]
  
  /* 80 */ @js.native
  object scrollBeyondLastLine extends TopLevel[scrollBeyondLastLine with Double]
  
  /* 78 */ @js.native
  object scrollbar extends TopLevel[scrollbar with Double]
  
  /* 83 */ @js.native
  object selectOnLineNumbers extends TopLevel[selectOnLineNumbers with Double]
  
  /* 81 */ @js.native
  object selectionClipboard extends TopLevel[selectionClipboard with Double]
  
  /* 82 */ @js.native
  object selectionHighlight extends TopLevel[selectionHighlight with Double]
  
  /* 84 */ @js.native
  object showFoldingControls extends TopLevel[showFoldingControls with Double]
  
  /* 85 */ @js.native
  object showUnused extends TopLevel[showUnused with Double]
  
  /* 87 */ @js.native
  object smoothScrolling extends TopLevel[smoothScrolling with Double]
  
  /* 86 */ @js.native
  object snippetSuggestions extends TopLevel[snippetSuggestions with Double]
  
  /* 88 */ @js.native
  object stopRenderingLineAfter extends TopLevel[stopRenderingLineAfter with Double]
  
  /* 89 */ @js.native
  object suggest extends TopLevel[suggest with Double]
  
  /* 90 */ @js.native
  object suggestFontSize extends TopLevel[suggestFontSize with Double]
  
  /* 91 */ @js.native
  object suggestLineHeight extends TopLevel[suggestLineHeight with Double]
  
  /* 92 */ @js.native
  object suggestOnTriggerCharacters extends TopLevel[suggestOnTriggerCharacters with Double]
  
  /* 93 */ @js.native
  object suggestSelection extends TopLevel[suggestSelection with Double]
  
  /* 94 */ @js.native
  object tabCompletion extends TopLevel[tabCompletion with Double]
  
  /* 106 */ @js.native
  object tabFocusMode extends TopLevel[tabFocusMode with Double]
  
  /* 95 */ @js.native
  object useTabStops extends TopLevel[useTabStops with Double]
  
  /* 96 */ @js.native
  object wordSeparators extends TopLevel[wordSeparators with Double]
  
  /* 97 */ @js.native
  object wordWrap extends TopLevel[wordWrap with Double]
  
  /* 98 */ @js.native
  object wordWrapBreakAfterCharacters extends TopLevel[wordWrapBreakAfterCharacters with Double]
  
  /* 99 */ @js.native
  object wordWrapBreakBeforeCharacters extends TopLevel[wordWrapBreakBeforeCharacters with Double]
  
  /* 100 */ @js.native
  object wordWrapColumn extends TopLevel[wordWrapColumn with Double]
  
  /* 101 */ @js.native
  object wordWrapMinified extends TopLevel[wordWrapMinified with Double]
  
  /* 102 */ @js.native
  object wrappingIndent extends TopLevel[wrappingIndent with Double]
  
  /* 108 */ @js.native
  object wrappingInfo extends TopLevel[wrappingInfo with Double]
  
  /* 103 */ @js.native
  object wrappingStrategy extends TopLevel[wrappingStrategy with Double]
  
}

