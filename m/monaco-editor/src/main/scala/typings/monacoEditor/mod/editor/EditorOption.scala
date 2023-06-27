package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditorOption extends StObject
@JSImport("monaco-editor", "editor.EditorOption")
@js.native
object EditorOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorOption & Double] = js.native
  
  @js.native
  sealed trait acceptSuggestionOnCommitCharacter
    extends StObject
       with EditorOption
  /* 0 */ val acceptSuggestionOnCommitCharacter: typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter & Double = js.native
  
  @js.native
  sealed trait acceptSuggestionOnEnter
    extends StObject
       with EditorOption
  /* 1 */ val acceptSuggestionOnEnter: typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter & Double = js.native
  
  @js.native
  sealed trait accessibilityPageSize
    extends StObject
       with EditorOption
  /* 3 */ val accessibilityPageSize: typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize & Double = js.native
  
  @js.native
  sealed trait accessibilitySupport
    extends StObject
       with EditorOption
  /* 2 */ val accessibilitySupport: typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport & Double = js.native
  
  @js.native
  sealed trait ariaLabel
    extends StObject
       with EditorOption
  /* 4 */ val ariaLabel: typings.monacoEditor.mod.editor.EditorOption.ariaLabel & Double = js.native
  
  @js.native
  sealed trait autoClosingBrackets
    extends StObject
       with EditorOption
  /* 5 */ val autoClosingBrackets: typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets & Double = js.native
  
  @js.native
  sealed trait autoClosingDelete
    extends StObject
       with EditorOption
  /* 7 */ val autoClosingDelete: typings.monacoEditor.mod.editor.EditorOption.autoClosingDelete & Double = js.native
  
  @js.native
  sealed trait autoClosingOvertype
    extends StObject
       with EditorOption
  /* 8 */ val autoClosingOvertype: typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype & Double = js.native
  
  @js.native
  sealed trait autoClosingQuotes
    extends StObject
       with EditorOption
  /* 9 */ val autoClosingQuotes: typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes & Double = js.native
  
  @js.native
  sealed trait autoIndent
    extends StObject
       with EditorOption
  /* 10 */ val autoIndent: typings.monacoEditor.mod.editor.EditorOption.autoIndent & Double = js.native
  
  @js.native
  sealed trait autoSurround
    extends StObject
       with EditorOption
  /* 12 */ val autoSurround: typings.monacoEditor.mod.editor.EditorOption.autoSurround & Double = js.native
  
  @js.native
  sealed trait automaticLayout
    extends StObject
       with EditorOption
  /* 11 */ val automaticLayout: typings.monacoEditor.mod.editor.EditorOption.automaticLayout & Double = js.native
  
  @js.native
  sealed trait bracketPairColorization
    extends StObject
       with EditorOption
  /* 13 */ val bracketPairColorization: typings.monacoEditor.mod.editor.EditorOption.bracketPairColorization & Double = js.native
  
  @js.native
  sealed trait codeLens
    extends StObject
       with EditorOption
  /* 15 */ val codeLens: typings.monacoEditor.mod.editor.EditorOption.codeLens & Double = js.native
  
  @js.native
  sealed trait codeLensFontFamily
    extends StObject
       with EditorOption
  /* 16 */ val codeLensFontFamily: typings.monacoEditor.mod.editor.EditorOption.codeLensFontFamily & Double = js.native
  
  @js.native
  sealed trait codeLensFontSize
    extends StObject
       with EditorOption
  /* 17 */ val codeLensFontSize: typings.monacoEditor.mod.editor.EditorOption.codeLensFontSize & Double = js.native
  
  @js.native
  sealed trait colorDecorators
    extends StObject
       with EditorOption
  /* 18 */ val colorDecorators: typings.monacoEditor.mod.editor.EditorOption.colorDecorators & Double = js.native
  
  @js.native
  sealed trait colorDecoratorsLimit
    extends StObject
       with EditorOption
  /* 19 */ val colorDecoratorsLimit: typings.monacoEditor.mod.editor.EditorOption.colorDecoratorsLimit & Double = js.native
  
  @js.native
  sealed trait columnSelection
    extends StObject
       with EditorOption
  /* 20 */ val columnSelection: typings.monacoEditor.mod.editor.EditorOption.columnSelection & Double = js.native
  
  @js.native
  sealed trait comments
    extends StObject
       with EditorOption
  /* 21 */ val comments: typings.monacoEditor.mod.editor.EditorOption.comments & Double = js.native
  
  @js.native
  sealed trait contextmenu
    extends StObject
       with EditorOption
  /* 22 */ val contextmenu: typings.monacoEditor.mod.editor.EditorOption.contextmenu & Double = js.native
  
  @js.native
  sealed trait copyWithSyntaxHighlighting
    extends StObject
       with EditorOption
  /* 23 */ val copyWithSyntaxHighlighting: typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting & Double = js.native
  
  @js.native
  sealed trait cursorBlinking
    extends StObject
       with EditorOption
  /* 24 */ val cursorBlinking: typings.monacoEditor.mod.editor.EditorOption.cursorBlinking & Double = js.native
  
  @js.native
  sealed trait cursorSmoothCaretAnimation
    extends StObject
       with EditorOption
  /* 25 */ val cursorSmoothCaretAnimation: typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation & Double = js.native
  
  @js.native
  sealed trait cursorStyle
    extends StObject
       with EditorOption
  /* 26 */ val cursorStyle: typings.monacoEditor.mod.editor.EditorOption.cursorStyle & Double = js.native
  
  @js.native
  sealed trait cursorSurroundingLines
    extends StObject
       with EditorOption
  /* 27 */ val cursorSurroundingLines: typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines & Double = js.native
  
  @js.native
  sealed trait cursorSurroundingLinesStyle
    extends StObject
       with EditorOption
  /* 28 */ val cursorSurroundingLinesStyle: typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle & Double = js.native
  
  @js.native
  sealed trait cursorWidth
    extends StObject
       with EditorOption
  /* 29 */ val cursorWidth: typings.monacoEditor.mod.editor.EditorOption.cursorWidth & Double = js.native
  
  @js.native
  sealed trait defaultColorDecorators
    extends StObject
       with EditorOption
  /* 142 */ val defaultColorDecorators: typings.monacoEditor.mod.editor.EditorOption.defaultColorDecorators & Double = js.native
  
  @js.native
  sealed trait definitionLinkOpensInPeek
    extends StObject
       with EditorOption
  /* 85 */ val definitionLinkOpensInPeek: typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek & Double = js.native
  
  @js.native
  sealed trait disableLayerHinting
    extends StObject
       with EditorOption
  /* 30 */ val disableLayerHinting: typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting & Double = js.native
  
  @js.native
  sealed trait disableMonospaceOptimizations
    extends StObject
       with EditorOption
  /* 31 */ val disableMonospaceOptimizations: typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations & Double = js.native
  
  @js.native
  sealed trait domReadOnly
    extends StObject
       with EditorOption
  /* 32 */ val domReadOnly: typings.monacoEditor.mod.editor.EditorOption.domReadOnly & Double = js.native
  
  @js.native
  sealed trait dragAndDrop
    extends StObject
       with EditorOption
  /* 33 */ val dragAndDrop: typings.monacoEditor.mod.editor.EditorOption.dragAndDrop & Double = js.native
  
  @js.native
  sealed trait dropIntoEditor
    extends StObject
       with EditorOption
  /* 34 */ val dropIntoEditor: typings.monacoEditor.mod.editor.EditorOption.dropIntoEditor & Double = js.native
  
  @js.native
  sealed trait editorClassName
    extends StObject
       with EditorOption
  /* 137 */ val editorClassName: typings.monacoEditor.mod.editor.EditorOption.editorClassName & Double = js.native
  
  @js.native
  sealed trait emptySelectionClipboard
    extends StObject
       with EditorOption
  /* 35 */ val emptySelectionClipboard: typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard & Double = js.native
  
  @js.native
  sealed trait experimentalWhitespaceRendering
    extends StObject
       with EditorOption
  /* 36 */ val experimentalWhitespaceRendering: typings.monacoEditor.mod.editor.EditorOption.experimentalWhitespaceRendering & Double = js.native
  
  @js.native
  sealed trait extraEditorClassName
    extends StObject
       with EditorOption
  /* 37 */ val extraEditorClassName: typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName & Double = js.native
  
  @js.native
  sealed trait fastScrollSensitivity
    extends StObject
       with EditorOption
  /* 38 */ val fastScrollSensitivity: typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity & Double = js.native
  
  @js.native
  sealed trait find
    extends StObject
       with EditorOption
  /* 39 */ val find: typings.monacoEditor.mod.editor.EditorOption.find & Double = js.native
  
  @js.native
  sealed trait fixedOverflowWidgets
    extends StObject
       with EditorOption
  /* 40 */ val fixedOverflowWidgets: typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets & Double = js.native
  
  @js.native
  sealed trait folding
    extends StObject
       with EditorOption
  /* 41 */ val folding: typings.monacoEditor.mod.editor.EditorOption.folding & Double = js.native
  
  @js.native
  sealed trait foldingHighlight
    extends StObject
       with EditorOption
  /* 43 */ val foldingHighlight: typings.monacoEditor.mod.editor.EditorOption.foldingHighlight & Double = js.native
  
  @js.native
  sealed trait foldingImportsByDefault
    extends StObject
       with EditorOption
  /* 44 */ val foldingImportsByDefault: typings.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault & Double = js.native
  
  @js.native
  sealed trait foldingMaximumRegions
    extends StObject
       with EditorOption
  /* 45 */ val foldingMaximumRegions: typings.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions & Double = js.native
  
  @js.native
  sealed trait foldingStrategy
    extends StObject
       with EditorOption
  /* 42 */ val foldingStrategy: typings.monacoEditor.mod.editor.EditorOption.foldingStrategy & Double = js.native
  
  @js.native
  sealed trait fontFamily
    extends StObject
       with EditorOption
  /* 47 */ val fontFamily: typings.monacoEditor.mod.editor.EditorOption.fontFamily & Double = js.native
  
  @js.native
  sealed trait fontInfo
    extends StObject
       with EditorOption
  /* 48 */ val fontInfo: typings.monacoEditor.mod.editor.EditorOption.fontInfo & Double = js.native
  
  @js.native
  sealed trait fontLigatures
    extends StObject
       with EditorOption
  /* 49 */ val fontLigatures: typings.monacoEditor.mod.editor.EditorOption.fontLigatures & Double = js.native
  
  @js.native
  sealed trait fontSize
    extends StObject
       with EditorOption
  /* 50 */ val fontSize: typings.monacoEditor.mod.editor.EditorOption.fontSize & Double = js.native
  
  @js.native
  sealed trait fontVariations
    extends StObject
       with EditorOption
  /* 52 */ val fontVariations: typings.monacoEditor.mod.editor.EditorOption.fontVariations & Double = js.native
  
  @js.native
  sealed trait fontWeight
    extends StObject
       with EditorOption
  /* 51 */ val fontWeight: typings.monacoEditor.mod.editor.EditorOption.fontWeight & Double = js.native
  
  @js.native
  sealed trait formatOnPaste
    extends StObject
       with EditorOption
  /* 53 */ val formatOnPaste: typings.monacoEditor.mod.editor.EditorOption.formatOnPaste & Double = js.native
  
  @js.native
  sealed trait formatOnType
    extends StObject
       with EditorOption
  /* 54 */ val formatOnType: typings.monacoEditor.mod.editor.EditorOption.formatOnType & Double = js.native
  
  @js.native
  sealed trait glyphMargin
    extends StObject
       with EditorOption
  /* 55 */ val glyphMargin: typings.monacoEditor.mod.editor.EditorOption.glyphMargin & Double = js.native
  
  @js.native
  sealed trait gotoLocation
    extends StObject
       with EditorOption
  /* 56 */ val gotoLocation: typings.monacoEditor.mod.editor.EditorOption.gotoLocation & Double = js.native
  
  @js.native
  sealed trait guides
    extends StObject
       with EditorOption
  /* 14 */ val guides: typings.monacoEditor.mod.editor.EditorOption.guides & Double = js.native
  
  @js.native
  sealed trait hideCursorInOverviewRuler
    extends StObject
       with EditorOption
  /* 57 */ val hideCursorInOverviewRuler: typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler & Double = js.native
  
  @js.native
  sealed trait hover
    extends StObject
       with EditorOption
  /* 58 */ val hover: typings.monacoEditor.mod.editor.EditorOption.hover & Double = js.native
  
  @js.native
  sealed trait inDiffEditor
    extends StObject
       with EditorOption
  /* 59 */ val inDiffEditor: typings.monacoEditor.mod.editor.EditorOption.inDiffEditor & Double = js.native
  
  @js.native
  sealed trait inlayHints
    extends StObject
       with EditorOption
  /* 136 */ val inlayHints: typings.monacoEditor.mod.editor.EditorOption.inlayHints & Double = js.native
  
  @js.native
  sealed trait inlineSuggest
    extends StObject
       with EditorOption
  /* 60 */ val inlineSuggest: typings.monacoEditor.mod.editor.EditorOption.inlineSuggest & Double = js.native
  
  @js.native
  sealed trait layoutInfo
    extends StObject
       with EditorOption
  /* 140 */ val layoutInfo: typings.monacoEditor.mod.editor.EditorOption.layoutInfo & Double = js.native
  
  @js.native
  sealed trait letterSpacing
    extends StObject
       with EditorOption
  /* 61 */ val letterSpacing: typings.monacoEditor.mod.editor.EditorOption.letterSpacing & Double = js.native
  
  @js.native
  sealed trait lightbulb
    extends StObject
       with EditorOption
  /* 62 */ val lightbulb: typings.monacoEditor.mod.editor.EditorOption.lightbulb & Double = js.native
  
  @js.native
  sealed trait lineDecorationsWidth
    extends StObject
       with EditorOption
  /* 63 */ val lineDecorationsWidth: typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth & Double = js.native
  
  @js.native
  sealed trait lineHeight
    extends StObject
       with EditorOption
  /* 64 */ val lineHeight: typings.monacoEditor.mod.editor.EditorOption.lineHeight & Double = js.native
  
  @js.native
  sealed trait lineNumbers
    extends StObject
       with EditorOption
  /* 65 */ val lineNumbers: typings.monacoEditor.mod.editor.EditorOption.lineNumbers & Double = js.native
  
  @js.native
  sealed trait lineNumbersMinChars
    extends StObject
       with EditorOption
  /* 66 */ val lineNumbersMinChars: typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars & Double = js.native
  
  @js.native
  sealed trait linkedEditing
    extends StObject
       with EditorOption
  /* 67 */ val linkedEditing: typings.monacoEditor.mod.editor.EditorOption.linkedEditing & Double = js.native
  
  @js.native
  sealed trait links
    extends StObject
       with EditorOption
  /* 68 */ val links: typings.monacoEditor.mod.editor.EditorOption.links & Double = js.native
  
  @js.native
  sealed trait matchBrackets
    extends StObject
       with EditorOption
  /* 69 */ val matchBrackets: typings.monacoEditor.mod.editor.EditorOption.matchBrackets & Double = js.native
  
  @js.native
  sealed trait minimap
    extends StObject
       with EditorOption
  /* 70 */ val minimap: typings.monacoEditor.mod.editor.EditorOption.minimap & Double = js.native
  
  @js.native
  sealed trait mouseStyle
    extends StObject
       with EditorOption
  /* 71 */ val mouseStyle: typings.monacoEditor.mod.editor.EditorOption.mouseStyle & Double = js.native
  
  @js.native
  sealed trait mouseWheelScrollSensitivity
    extends StObject
       with EditorOption
  /* 72 */ val mouseWheelScrollSensitivity: typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity & Double = js.native
  
  @js.native
  sealed trait mouseWheelZoom
    extends StObject
       with EditorOption
  /* 73 */ val mouseWheelZoom: typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom & Double = js.native
  
  @js.native
  sealed trait multiCursorLimit
    extends StObject
       with EditorOption
  /* 77 */ val multiCursorLimit: typings.monacoEditor.mod.editor.EditorOption.multiCursorLimit & Double = js.native
  
  @js.native
  sealed trait multiCursorMergeOverlapping
    extends StObject
       with EditorOption
  /* 74 */ val multiCursorMergeOverlapping: typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping & Double = js.native
  
  @js.native
  sealed trait multiCursorModifier
    extends StObject
       with EditorOption
  /* 75 */ val multiCursorModifier: typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier & Double = js.native
  
  @js.native
  sealed trait multiCursorPaste
    extends StObject
       with EditorOption
  /* 76 */ val multiCursorPaste: typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste & Double = js.native
  
  @js.native
  sealed trait occurrencesHighlight
    extends StObject
       with EditorOption
  /* 78 */ val occurrencesHighlight: typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight & Double = js.native
  
  @js.native
  sealed trait overviewRulerBorder
    extends StObject
       with EditorOption
  /* 79 */ val overviewRulerBorder: typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder & Double = js.native
  
  @js.native
  sealed trait overviewRulerLanes
    extends StObject
       with EditorOption
  /* 80 */ val overviewRulerLanes: typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes & Double = js.native
  
  @js.native
  sealed trait padding
    extends StObject
       with EditorOption
  /* 81 */ val padding: typings.monacoEditor.mod.editor.EditorOption.padding & Double = js.native
  
  @js.native
  sealed trait parameterHints
    extends StObject
       with EditorOption
  /* 83 */ val parameterHints: typings.monacoEditor.mod.editor.EditorOption.parameterHints & Double = js.native
  
  @js.native
  sealed trait pasteAs
    extends StObject
       with EditorOption
  /* 82 */ val pasteAs: typings.monacoEditor.mod.editor.EditorOption.pasteAs & Double = js.native
  
  @js.native
  sealed trait peekWidgetDefaultFocus
    extends StObject
       with EditorOption
  /* 84 */ val peekWidgetDefaultFocus: typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus & Double = js.native
  
  @js.native
  sealed trait pixelRatio
    extends StObject
       with EditorOption
  /* 138 */ val pixelRatio: typings.monacoEditor.mod.editor.EditorOption.pixelRatio & Double = js.native
  
  @js.native
  sealed trait quickSuggestions
    extends StObject
       with EditorOption
  /* 86 */ val quickSuggestions: typings.monacoEditor.mod.editor.EditorOption.quickSuggestions & Double = js.native
  
  @js.native
  sealed trait quickSuggestionsDelay
    extends StObject
       with EditorOption
  /* 87 */ val quickSuggestionsDelay: typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay & Double = js.native
  
  @js.native
  sealed trait readOnly
    extends StObject
       with EditorOption
  /* 88 */ val readOnly: typings.monacoEditor.mod.editor.EditorOption.readOnly & Double = js.native
  
  @js.native
  sealed trait renameOnType
    extends StObject
       with EditorOption
  /* 89 */ val renameOnType: typings.monacoEditor.mod.editor.EditorOption.renameOnType & Double = js.native
  
  @js.native
  sealed trait renderControlCharacters
    extends StObject
       with EditorOption
  /* 90 */ val renderControlCharacters: typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters & Double = js.native
  
  @js.native
  sealed trait renderFinalNewline
    extends StObject
       with EditorOption
  /* 91 */ val renderFinalNewline: typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline & Double = js.native
  
  @js.native
  sealed trait renderLineHighlight
    extends StObject
       with EditorOption
  /* 92 */ val renderLineHighlight: typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight & Double = js.native
  
  @js.native
  sealed trait renderLineHighlightOnlyWhenFocus
    extends StObject
       with EditorOption
  /* 93 */ val renderLineHighlightOnlyWhenFocus: typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus & Double = js.native
  
  @js.native
  sealed trait renderValidationDecorations
    extends StObject
       with EditorOption
  /* 94 */ val renderValidationDecorations: typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations & Double = js.native
  
  @js.native
  sealed trait renderWhitespace
    extends StObject
       with EditorOption
  /* 95 */ val renderWhitespace: typings.monacoEditor.mod.editor.EditorOption.renderWhitespace & Double = js.native
  
  @js.native
  sealed trait revealHorizontalRightPadding
    extends StObject
       with EditorOption
  /* 96 */ val revealHorizontalRightPadding: typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding & Double = js.native
  
  @js.native
  sealed trait roundedSelection
    extends StObject
       with EditorOption
  /* 97 */ val roundedSelection: typings.monacoEditor.mod.editor.EditorOption.roundedSelection & Double = js.native
  
  @js.native
  sealed trait rulers
    extends StObject
       with EditorOption
  /* 98 */ val rulers: typings.monacoEditor.mod.editor.EditorOption.rulers & Double = js.native
  
  @js.native
  sealed trait screenReaderAnnounceInlineSuggestion
    extends StObject
       with EditorOption
  /* 6 */ val screenReaderAnnounceInlineSuggestion: typings.monacoEditor.mod.editor.EditorOption.screenReaderAnnounceInlineSuggestion & Double = js.native
  
  @js.native
  sealed trait scrollBeyondLastColumn
    extends StObject
       with EditorOption
  /* 100 */ val scrollBeyondLastColumn: typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn & Double = js.native
  
  @js.native
  sealed trait scrollBeyondLastLine
    extends StObject
       with EditorOption
  /* 101 */ val scrollBeyondLastLine: typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine & Double = js.native
  
  @js.native
  sealed trait scrollPredominantAxis
    extends StObject
       with EditorOption
  /* 102 */ val scrollPredominantAxis: typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis & Double = js.native
  
  @js.native
  sealed trait scrollbar
    extends StObject
       with EditorOption
  /* 99 */ val scrollbar: typings.monacoEditor.mod.editor.EditorOption.scrollbar & Double = js.native
  
  @js.native
  sealed trait selectOnLineNumbers
    extends StObject
       with EditorOption
  /* 105 */ val selectOnLineNumbers: typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers & Double = js.native
  
  @js.native
  sealed trait selectionClipboard
    extends StObject
       with EditorOption
  /* 103 */ val selectionClipboard: typings.monacoEditor.mod.editor.EditorOption.selectionClipboard & Double = js.native
  
  @js.native
  sealed trait selectionHighlight
    extends StObject
       with EditorOption
  /* 104 */ val selectionHighlight: typings.monacoEditor.mod.editor.EditorOption.selectionHighlight & Double = js.native
  
  @js.native
  sealed trait showDeprecated
    extends StObject
       with EditorOption
  /* 135 */ val showDeprecated: typings.monacoEditor.mod.editor.EditorOption.showDeprecated & Double = js.native
  
  @js.native
  sealed trait showFoldingControls
    extends StObject
       with EditorOption
  /* 106 */ val showFoldingControls: typings.monacoEditor.mod.editor.EditorOption.showFoldingControls & Double = js.native
  
  @js.native
  sealed trait showUnused
    extends StObject
       with EditorOption
  /* 107 */ val showUnused: typings.monacoEditor.mod.editor.EditorOption.showUnused & Double = js.native
  
  @js.native
  sealed trait smartSelect
    extends StObject
       with EditorOption
  /* 109 */ val smartSelect: typings.monacoEditor.mod.editor.EditorOption.smartSelect & Double = js.native
  
  @js.native
  sealed trait smoothScrolling
    extends StObject
       with EditorOption
  /* 110 */ val smoothScrolling: typings.monacoEditor.mod.editor.EditorOption.smoothScrolling & Double = js.native
  
  @js.native
  sealed trait snippetSuggestions
    extends StObject
       with EditorOption
  /* 108 */ val snippetSuggestions: typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions & Double = js.native
  
  @js.native
  sealed trait stickyScroll
    extends StObject
       with EditorOption
  /* 111 */ val stickyScroll: typings.monacoEditor.mod.editor.EditorOption.stickyScroll & Double = js.native
  
  @js.native
  sealed trait stickyTabStops
    extends StObject
       with EditorOption
  /* 112 */ val stickyTabStops: typings.monacoEditor.mod.editor.EditorOption.stickyTabStops & Double = js.native
  
  @js.native
  sealed trait stopRenderingLineAfter
    extends StObject
       with EditorOption
  /* 113 */ val stopRenderingLineAfter: typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter & Double = js.native
  
  @js.native
  sealed trait suggest
    extends StObject
       with EditorOption
  /* 114 */ val suggest: typings.monacoEditor.mod.editor.EditorOption.suggest & Double = js.native
  
  @js.native
  sealed trait suggestFontSize
    extends StObject
       with EditorOption
  /* 115 */ val suggestFontSize: typings.monacoEditor.mod.editor.EditorOption.suggestFontSize & Double = js.native
  
  @js.native
  sealed trait suggestLineHeight
    extends StObject
       with EditorOption
  /* 116 */ val suggestLineHeight: typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight & Double = js.native
  
  @js.native
  sealed trait suggestOnTriggerCharacters
    extends StObject
       with EditorOption
  /* 117 */ val suggestOnTriggerCharacters: typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters & Double = js.native
  
  @js.native
  sealed trait suggestSelection
    extends StObject
       with EditorOption
  /* 118 */ val suggestSelection: typings.monacoEditor.mod.editor.EditorOption.suggestSelection & Double = js.native
  
  @js.native
  sealed trait tabCompletion
    extends StObject
       with EditorOption
  /* 119 */ val tabCompletion: typings.monacoEditor.mod.editor.EditorOption.tabCompletion & Double = js.native
  
  @js.native
  sealed trait tabFocusMode
    extends StObject
       with EditorOption
  /* 139 */ val tabFocusMode: typings.monacoEditor.mod.editor.EditorOption.tabFocusMode & Double = js.native
  
  @js.native
  sealed trait tabIndex
    extends StObject
       with EditorOption
  /* 120 */ val tabIndex: typings.monacoEditor.mod.editor.EditorOption.tabIndex & Double = js.native
  
  @js.native
  sealed trait unfoldOnClickAfterEndOfLine
    extends StObject
       with EditorOption
  /* 46 */ val unfoldOnClickAfterEndOfLine: typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine & Double = js.native
  
  @js.native
  sealed trait unicodeHighlighting
    extends StObject
       with EditorOption
  /* 121 */ val unicodeHighlighting: typings.monacoEditor.mod.editor.EditorOption.unicodeHighlighting & Double = js.native
  
  @js.native
  sealed trait unusualLineTerminators
    extends StObject
       with EditorOption
  /* 122 */ val unusualLineTerminators: typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators & Double = js.native
  
  @js.native
  sealed trait useShadowDOM
    extends StObject
       with EditorOption
  /* 123 */ val useShadowDOM: typings.monacoEditor.mod.editor.EditorOption.useShadowDOM & Double = js.native
  
  @js.native
  sealed trait useTabStops
    extends StObject
       with EditorOption
  /* 124 */ val useTabStops: typings.monacoEditor.mod.editor.EditorOption.useTabStops & Double = js.native
  
  @js.native
  sealed trait wordBreak
    extends StObject
       with EditorOption
  /* 125 */ val wordBreak: typings.monacoEditor.mod.editor.EditorOption.wordBreak & Double = js.native
  
  @js.native
  sealed trait wordSeparators
    extends StObject
       with EditorOption
  /* 126 */ val wordSeparators: typings.monacoEditor.mod.editor.EditorOption.wordSeparators & Double = js.native
  
  @js.native
  sealed trait wordWrap
    extends StObject
       with EditorOption
  /* 127 */ val wordWrap: typings.monacoEditor.mod.editor.EditorOption.wordWrap & Double = js.native
  
  @js.native
  sealed trait wordWrapBreakAfterCharacters
    extends StObject
       with EditorOption
  /* 128 */ val wordWrapBreakAfterCharacters: typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters & Double = js.native
  
  @js.native
  sealed trait wordWrapBreakBeforeCharacters
    extends StObject
       with EditorOption
  /* 129 */ val wordWrapBreakBeforeCharacters: typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters & Double = js.native
  
  @js.native
  sealed trait wordWrapColumn
    extends StObject
       with EditorOption
  /* 130 */ val wordWrapColumn: typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn & Double = js.native
  
  @js.native
  sealed trait wordWrapOverride1
    extends StObject
       with EditorOption
  /* 131 */ val wordWrapOverride1: typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride1 & Double = js.native
  
  @js.native
  sealed trait wordWrapOverride2
    extends StObject
       with EditorOption
  /* 132 */ val wordWrapOverride2: typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride2 & Double = js.native
  
  @js.native
  sealed trait wrappingIndent
    extends StObject
       with EditorOption
  /* 133 */ val wrappingIndent: typings.monacoEditor.mod.editor.EditorOption.wrappingIndent & Double = js.native
  
  @js.native
  sealed trait wrappingInfo
    extends StObject
       with EditorOption
  /* 141 */ val wrappingInfo: typings.monacoEditor.mod.editor.EditorOption.wrappingInfo & Double = js.native
  
  @js.native
  sealed trait wrappingStrategy
    extends StObject
       with EditorOption
  /* 134 */ val wrappingStrategy: typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy & Double = js.native
}
