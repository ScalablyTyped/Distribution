package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditorOption extends js.Object
@JSImport("monaco-editor", "editor.EditorOption")
@js.native
object EditorOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorOption with Double] = js.native
  
  @js.native
  sealed trait acceptSuggestionOnCommitCharacter extends EditorOption
  /* 0 */ @js.native
  object acceptSuggestionOnCommitCharacter extends TopLevel[acceptSuggestionOnCommitCharacter with Double]
  
  @js.native
  sealed trait acceptSuggestionOnEnter extends EditorOption
  /* 1 */ @js.native
  object acceptSuggestionOnEnter extends TopLevel[acceptSuggestionOnEnter with Double]
  
  @js.native
  sealed trait accessibilityPageSize extends EditorOption
  /* 3 */ @js.native
  object accessibilityPageSize extends TopLevel[accessibilityPageSize with Double]
  
  @js.native
  sealed trait accessibilitySupport extends EditorOption
  /* 2 */ @js.native
  object accessibilitySupport extends TopLevel[accessibilitySupport with Double]
  
  @js.native
  sealed trait ariaLabel extends EditorOption
  /* 4 */ @js.native
  object ariaLabel extends TopLevel[ariaLabel with Double]
  
  @js.native
  sealed trait autoClosingBrackets extends EditorOption
  /* 5 */ @js.native
  object autoClosingBrackets extends TopLevel[autoClosingBrackets with Double]
  
  @js.native
  sealed trait autoClosingOvertype extends EditorOption
  /* 6 */ @js.native
  object autoClosingOvertype extends TopLevel[autoClosingOvertype with Double]
  
  @js.native
  sealed trait autoClosingQuotes extends EditorOption
  /* 7 */ @js.native
  object autoClosingQuotes extends TopLevel[autoClosingQuotes with Double]
  
  @js.native
  sealed trait autoIndent extends EditorOption
  /* 8 */ @js.native
  object autoIndent extends TopLevel[autoIndent with Double]
  
  @js.native
  sealed trait autoSurround extends EditorOption
  /* 10 */ @js.native
  object autoSurround extends TopLevel[autoSurround with Double]
  
  @js.native
  sealed trait automaticLayout extends EditorOption
  /* 9 */ @js.native
  object automaticLayout extends TopLevel[automaticLayout with Double]
  
  @js.native
  sealed trait codeLens extends EditorOption
  /* 11 */ @js.native
  object codeLens extends TopLevel[codeLens with Double]
  
  @js.native
  sealed trait colorDecorators extends EditorOption
  /* 12 */ @js.native
  object colorDecorators extends TopLevel[colorDecorators with Double]
  
  @js.native
  sealed trait columnSelection extends EditorOption
  /* 13 */ @js.native
  object columnSelection extends TopLevel[columnSelection with Double]
  
  @js.native
  sealed trait comments extends EditorOption
  /* 14 */ @js.native
  object comments extends TopLevel[comments with Double]
  
  @js.native
  sealed trait contextmenu extends EditorOption
  /* 15 */ @js.native
  object contextmenu extends TopLevel[contextmenu with Double]
  
  @js.native
  sealed trait copyWithSyntaxHighlighting extends EditorOption
  /* 16 */ @js.native
  object copyWithSyntaxHighlighting extends TopLevel[copyWithSyntaxHighlighting with Double]
  
  @js.native
  sealed trait cursorBlinking extends EditorOption
  /* 17 */ @js.native
  object cursorBlinking extends TopLevel[cursorBlinking with Double]
  
  @js.native
  sealed trait cursorSmoothCaretAnimation extends EditorOption
  /* 18 */ @js.native
  object cursorSmoothCaretAnimation extends TopLevel[cursorSmoothCaretAnimation with Double]
  
  @js.native
  sealed trait cursorStyle extends EditorOption
  /* 19 */ @js.native
  object cursorStyle extends TopLevel[cursorStyle with Double]
  
  @js.native
  sealed trait cursorSurroundingLines extends EditorOption
  /* 20 */ @js.native
  object cursorSurroundingLines extends TopLevel[cursorSurroundingLines with Double]
  
  @js.native
  sealed trait cursorSurroundingLinesStyle extends EditorOption
  /* 21 */ @js.native
  object cursorSurroundingLinesStyle extends TopLevel[cursorSurroundingLinesStyle with Double]
  
  @js.native
  sealed trait cursorWidth extends EditorOption
  /* 22 */ @js.native
  object cursorWidth extends TopLevel[cursorWidth with Double]
  
  @js.native
  sealed trait definitionLinkOpensInPeek extends EditorOption
  /* 69 */ @js.native
  object definitionLinkOpensInPeek extends TopLevel[definitionLinkOpensInPeek with Double]
  
  @js.native
  sealed trait disableLayerHinting extends EditorOption
  /* 23 */ @js.native
  object disableLayerHinting extends TopLevel[disableLayerHinting with Double]
  
  @js.native
  sealed trait disableMonospaceOptimizations extends EditorOption
  /* 24 */ @js.native
  object disableMonospaceOptimizations extends TopLevel[disableMonospaceOptimizations with Double]
  
  @js.native
  sealed trait dragAndDrop extends EditorOption
  /* 25 */ @js.native
  object dragAndDrop extends TopLevel[dragAndDrop with Double]
  
  @js.native
  sealed trait editorClassName extends EditorOption
  /* 114 */ @js.native
  object editorClassName extends TopLevel[editorClassName with Double]
  
  @js.native
  sealed trait emptySelectionClipboard extends EditorOption
  /* 26 */ @js.native
  object emptySelectionClipboard extends TopLevel[emptySelectionClipboard with Double]
  
  @js.native
  sealed trait extraEditorClassName extends EditorOption
  /* 27 */ @js.native
  object extraEditorClassName extends TopLevel[extraEditorClassName with Double]
  
  @js.native
  sealed trait fastScrollSensitivity extends EditorOption
  /* 28 */ @js.native
  object fastScrollSensitivity extends TopLevel[fastScrollSensitivity with Double]
  
  @js.native
  sealed trait find extends EditorOption
  /* 29 */ @js.native
  object find extends TopLevel[find with Double]
  
  @js.native
  sealed trait fixedOverflowWidgets extends EditorOption
  /* 30 */ @js.native
  object fixedOverflowWidgets extends TopLevel[fixedOverflowWidgets with Double]
  
  @js.native
  sealed trait folding extends EditorOption
  /* 31 */ @js.native
  object folding extends TopLevel[folding with Double]
  
  @js.native
  sealed trait foldingHighlight extends EditorOption
  /* 33 */ @js.native
  object foldingHighlight extends TopLevel[foldingHighlight with Double]
  
  @js.native
  sealed trait foldingStrategy extends EditorOption
  /* 32 */ @js.native
  object foldingStrategy extends TopLevel[foldingStrategy with Double]
  
  @js.native
  sealed trait fontFamily extends EditorOption
  /* 35 */ @js.native
  object fontFamily extends TopLevel[fontFamily with Double]
  
  @js.native
  sealed trait fontInfo extends EditorOption
  /* 36 */ @js.native
  object fontInfo extends TopLevel[fontInfo with Double]
  
  @js.native
  sealed trait fontLigatures extends EditorOption
  /* 37 */ @js.native
  object fontLigatures extends TopLevel[fontLigatures with Double]
  
  @js.native
  sealed trait fontSize extends EditorOption
  /* 38 */ @js.native
  object fontSize extends TopLevel[fontSize with Double]
  
  @js.native
  sealed trait fontWeight extends EditorOption
  /* 39 */ @js.native
  object fontWeight extends TopLevel[fontWeight with Double]
  
  @js.native
  sealed trait formatOnPaste extends EditorOption
  /* 40 */ @js.native
  object formatOnPaste extends TopLevel[formatOnPaste with Double]
  
  @js.native
  sealed trait formatOnType extends EditorOption
  /* 41 */ @js.native
  object formatOnType extends TopLevel[formatOnType with Double]
  
  @js.native
  sealed trait glyphMargin extends EditorOption
  /* 42 */ @js.native
  object glyphMargin extends TopLevel[glyphMargin with Double]
  
  @js.native
  sealed trait gotoLocation extends EditorOption
  /* 43 */ @js.native
  object gotoLocation extends TopLevel[gotoLocation with Double]
  
  @js.native
  sealed trait hideCursorInOverviewRuler extends EditorOption
  /* 44 */ @js.native
  object hideCursorInOverviewRuler extends TopLevel[hideCursorInOverviewRuler with Double]
  
  @js.native
  sealed trait highlightActiveIndentGuide extends EditorOption
  /* 45 */ @js.native
  object highlightActiveIndentGuide extends TopLevel[highlightActiveIndentGuide with Double]
  
  @js.native
  sealed trait hover extends EditorOption
  /* 46 */ @js.native
  object hover extends TopLevel[hover with Double]
  
  @js.native
  sealed trait inDiffEditor extends EditorOption
  /* 47 */ @js.native
  object inDiffEditor extends TopLevel[inDiffEditor with Double]
  
  @js.native
  sealed trait layoutInfo extends EditorOption
  /* 117 */ @js.native
  object layoutInfo extends TopLevel[layoutInfo with Double]
  
  @js.native
  sealed trait letterSpacing extends EditorOption
  /* 48 */ @js.native
  object letterSpacing extends TopLevel[letterSpacing with Double]
  
  @js.native
  sealed trait lightbulb extends EditorOption
  /* 49 */ @js.native
  object lightbulb extends TopLevel[lightbulb with Double]
  
  @js.native
  sealed trait lineDecorationsWidth extends EditorOption
  /* 50 */ @js.native
  object lineDecorationsWidth extends TopLevel[lineDecorationsWidth with Double]
  
  @js.native
  sealed trait lineHeight extends EditorOption
  /* 51 */ @js.native
  object lineHeight extends TopLevel[lineHeight with Double]
  
  @js.native
  sealed trait lineNumbers extends EditorOption
  /* 52 */ @js.native
  object lineNumbers extends TopLevel[lineNumbers with Double]
  
  @js.native
  sealed trait lineNumbersMinChars extends EditorOption
  /* 53 */ @js.native
  object lineNumbersMinChars extends TopLevel[lineNumbersMinChars with Double]
  
  @js.native
  sealed trait links extends EditorOption
  /* 54 */ @js.native
  object links extends TopLevel[links with Double]
  
  @js.native
  sealed trait matchBrackets extends EditorOption
  /* 55 */ @js.native
  object matchBrackets extends TopLevel[matchBrackets with Double]
  
  @js.native
  sealed trait minimap extends EditorOption
  /* 56 */ @js.native
  object minimap extends TopLevel[minimap with Double]
  
  @js.native
  sealed trait mouseStyle extends EditorOption
  /* 57 */ @js.native
  object mouseStyle extends TopLevel[mouseStyle with Double]
  
  @js.native
  sealed trait mouseWheelScrollSensitivity extends EditorOption
  /* 58 */ @js.native
  object mouseWheelScrollSensitivity extends TopLevel[mouseWheelScrollSensitivity with Double]
  
  @js.native
  sealed trait mouseWheelZoom extends EditorOption
  /* 59 */ @js.native
  object mouseWheelZoom extends TopLevel[mouseWheelZoom with Double]
  
  @js.native
  sealed trait multiCursorMergeOverlapping extends EditorOption
  /* 60 */ @js.native
  object multiCursorMergeOverlapping extends TopLevel[multiCursorMergeOverlapping with Double]
  
  @js.native
  sealed trait multiCursorModifier extends EditorOption
  /* 61 */ @js.native
  object multiCursorModifier extends TopLevel[multiCursorModifier with Double]
  
  @js.native
  sealed trait multiCursorPaste extends EditorOption
  /* 62 */ @js.native
  object multiCursorPaste extends TopLevel[multiCursorPaste with Double]
  
  @js.native
  sealed trait occurrencesHighlight extends EditorOption
  /* 63 */ @js.native
  object occurrencesHighlight extends TopLevel[occurrencesHighlight with Double]
  
  @js.native
  sealed trait overviewRulerBorder extends EditorOption
  /* 64 */ @js.native
  object overviewRulerBorder extends TopLevel[overviewRulerBorder with Double]
  
  @js.native
  sealed trait overviewRulerLanes extends EditorOption
  /* 65 */ @js.native
  object overviewRulerLanes extends TopLevel[overviewRulerLanes with Double]
  
  @js.native
  sealed trait padding extends EditorOption
  /* 66 */ @js.native
  object padding extends TopLevel[padding with Double]
  
  @js.native
  sealed trait parameterHints extends EditorOption
  /* 67 */ @js.native
  object parameterHints extends TopLevel[parameterHints with Double]
  
  @js.native
  sealed trait peekWidgetDefaultFocus extends EditorOption
  /* 68 */ @js.native
  object peekWidgetDefaultFocus extends TopLevel[peekWidgetDefaultFocus with Double]
  
  @js.native
  sealed trait pixelRatio extends EditorOption
  /* 115 */ @js.native
  object pixelRatio extends TopLevel[pixelRatio with Double]
  
  @js.native
  sealed trait quickSuggestions extends EditorOption
  /* 70 */ @js.native
  object quickSuggestions extends TopLevel[quickSuggestions with Double]
  
  @js.native
  sealed trait quickSuggestionsDelay extends EditorOption
  /* 71 */ @js.native
  object quickSuggestionsDelay extends TopLevel[quickSuggestionsDelay with Double]
  
  @js.native
  sealed trait readOnly extends EditorOption
  /* 72 */ @js.native
  object readOnly extends TopLevel[readOnly with Double]
  
  @js.native
  sealed trait renameOnType extends EditorOption
  /* 73 */ @js.native
  object renameOnType extends TopLevel[renameOnType with Double]
  
  @js.native
  sealed trait renderControlCharacters extends EditorOption
  /* 74 */ @js.native
  object renderControlCharacters extends TopLevel[renderControlCharacters with Double]
  
  @js.native
  sealed trait renderFinalNewline extends EditorOption
  /* 76 */ @js.native
  object renderFinalNewline extends TopLevel[renderFinalNewline with Double]
  
  @js.native
  sealed trait renderIndentGuides extends EditorOption
  /* 75 */ @js.native
  object renderIndentGuides extends TopLevel[renderIndentGuides with Double]
  
  @js.native
  sealed trait renderLineHighlight extends EditorOption
  /* 77 */ @js.native
  object renderLineHighlight extends TopLevel[renderLineHighlight with Double]
  
  @js.native
  sealed trait renderLineHighlightOnlyWhenFocus extends EditorOption
  /* 78 */ @js.native
  object renderLineHighlightOnlyWhenFocus extends TopLevel[renderLineHighlightOnlyWhenFocus with Double]
  
  @js.native
  sealed trait renderValidationDecorations extends EditorOption
  /* 79 */ @js.native
  object renderValidationDecorations extends TopLevel[renderValidationDecorations with Double]
  
  @js.native
  sealed trait renderWhitespace extends EditorOption
  /* 80 */ @js.native
  object renderWhitespace extends TopLevel[renderWhitespace with Double]
  
  @js.native
  sealed trait revealHorizontalRightPadding extends EditorOption
  /* 81 */ @js.native
  object revealHorizontalRightPadding extends TopLevel[revealHorizontalRightPadding with Double]
  
  @js.native
  sealed trait roundedSelection extends EditorOption
  /* 82 */ @js.native
  object roundedSelection extends TopLevel[roundedSelection with Double]
  
  @js.native
  sealed trait rulers extends EditorOption
  /* 83 */ @js.native
  object rulers extends TopLevel[rulers with Double]
  
  @js.native
  sealed trait scrollBeyondLastColumn extends EditorOption
  /* 85 */ @js.native
  object scrollBeyondLastColumn extends TopLevel[scrollBeyondLastColumn with Double]
  
  @js.native
  sealed trait scrollBeyondLastLine extends EditorOption
  /* 86 */ @js.native
  object scrollBeyondLastLine extends TopLevel[scrollBeyondLastLine with Double]
  
  @js.native
  sealed trait scrollPredominantAxis extends EditorOption
  /* 87 */ @js.native
  object scrollPredominantAxis extends TopLevel[scrollPredominantAxis with Double]
  
  @js.native
  sealed trait scrollbar extends EditorOption
  /* 84 */ @js.native
  object scrollbar extends TopLevel[scrollbar with Double]
  
  @js.native
  sealed trait selectOnLineNumbers extends EditorOption
  /* 90 */ @js.native
  object selectOnLineNumbers extends TopLevel[selectOnLineNumbers with Double]
  
  @js.native
  sealed trait selectionClipboard extends EditorOption
  /* 88 */ @js.native
  object selectionClipboard extends TopLevel[selectionClipboard with Double]
  
  @js.native
  sealed trait selectionHighlight extends EditorOption
  /* 89 */ @js.native
  object selectionHighlight extends TopLevel[selectionHighlight with Double]
  
  @js.native
  sealed trait showDeprecated extends EditorOption
  /* 113 */ @js.native
  object showDeprecated extends TopLevel[showDeprecated with Double]
  
  @js.native
  sealed trait showFoldingControls extends EditorOption
  /* 91 */ @js.native
  object showFoldingControls extends TopLevel[showFoldingControls with Double]
  
  @js.native
  sealed trait showUnused extends EditorOption
  /* 92 */ @js.native
  object showUnused extends TopLevel[showUnused with Double]
  
  @js.native
  sealed trait smoothScrolling extends EditorOption
  /* 94 */ @js.native
  object smoothScrolling extends TopLevel[smoothScrolling with Double]
  
  @js.native
  sealed trait snippetSuggestions extends EditorOption
  /* 93 */ @js.native
  object snippetSuggestions extends TopLevel[snippetSuggestions with Double]
  
  @js.native
  sealed trait stopRenderingLineAfter extends EditorOption
  /* 95 */ @js.native
  object stopRenderingLineAfter extends TopLevel[stopRenderingLineAfter with Double]
  
  @js.native
  sealed trait suggest extends EditorOption
  /* 96 */ @js.native
  object suggest extends TopLevel[suggest with Double]
  
  @js.native
  sealed trait suggestFontSize extends EditorOption
  /* 97 */ @js.native
  object suggestFontSize extends TopLevel[suggestFontSize with Double]
  
  @js.native
  sealed trait suggestLineHeight extends EditorOption
  /* 98 */ @js.native
  object suggestLineHeight extends TopLevel[suggestLineHeight with Double]
  
  @js.native
  sealed trait suggestOnTriggerCharacters extends EditorOption
  /* 99 */ @js.native
  object suggestOnTriggerCharacters extends TopLevel[suggestOnTriggerCharacters with Double]
  
  @js.native
  sealed trait suggestSelection extends EditorOption
  /* 100 */ @js.native
  object suggestSelection extends TopLevel[suggestSelection with Double]
  
  @js.native
  sealed trait tabCompletion extends EditorOption
  /* 101 */ @js.native
  object tabCompletion extends TopLevel[tabCompletion with Double]
  
  @js.native
  sealed trait tabFocusMode extends EditorOption
  /* 116 */ @js.native
  object tabFocusMode extends TopLevel[tabFocusMode with Double]
  
  @js.native
  sealed trait tabIndex extends EditorOption
  /* 102 */ @js.native
  object tabIndex extends TopLevel[tabIndex with Double]
  
  @js.native
  sealed trait unfoldOnClickAfterEndOfLine extends EditorOption
  /* 34 */ @js.native
  object unfoldOnClickAfterEndOfLine extends TopLevel[unfoldOnClickAfterEndOfLine with Double]
  
  @js.native
  sealed trait unusualLineTerminators extends EditorOption
  /* 103 */ @js.native
  object unusualLineTerminators extends TopLevel[unusualLineTerminators with Double]
  
  @js.native
  sealed trait useTabStops extends EditorOption
  /* 104 */ @js.native
  object useTabStops extends TopLevel[useTabStops with Double]
  
  @js.native
  sealed trait wordSeparators extends EditorOption
  /* 105 */ @js.native
  object wordSeparators extends TopLevel[wordSeparators with Double]
  
  @js.native
  sealed trait wordWrap extends EditorOption
  /* 106 */ @js.native
  object wordWrap extends TopLevel[wordWrap with Double]
  
  @js.native
  sealed trait wordWrapBreakAfterCharacters extends EditorOption
  /* 107 */ @js.native
  object wordWrapBreakAfterCharacters extends TopLevel[wordWrapBreakAfterCharacters with Double]
  
  @js.native
  sealed trait wordWrapBreakBeforeCharacters extends EditorOption
  /* 108 */ @js.native
  object wordWrapBreakBeforeCharacters extends TopLevel[wordWrapBreakBeforeCharacters with Double]
  
  @js.native
  sealed trait wordWrapColumn extends EditorOption
  /* 109 */ @js.native
  object wordWrapColumn extends TopLevel[wordWrapColumn with Double]
  
  @js.native
  sealed trait wordWrapMinified extends EditorOption
  /* 110 */ @js.native
  object wordWrapMinified extends TopLevel[wordWrapMinified with Double]
  
  @js.native
  sealed trait wrappingIndent extends EditorOption
  /* 111 */ @js.native
  object wrappingIndent extends TopLevel[wrappingIndent with Double]
  
  @js.native
  sealed trait wrappingInfo extends EditorOption
  /* 118 */ @js.native
  object wrappingInfo extends TopLevel[wrappingInfo with Double]
  
  @js.native
  sealed trait wrappingStrategy extends EditorOption
  /* 112 */ @js.native
  object wrappingStrategy extends TopLevel[wrappingStrategy with Double]
}
