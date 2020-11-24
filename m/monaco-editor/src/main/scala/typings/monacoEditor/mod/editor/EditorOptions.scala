package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.EditorOption.fontLigatures
import typings.monacoEditor.monacoEditorStrings.`inline`
import typings.monacoEditor.monacoEditorStrings.advanced
import typings.monacoEditor.monacoEditorStrings.all
import typings.monacoEditor.monacoEditorStrings.altKey
import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.bottom
import typings.monacoEditor.monacoEditorStrings.boundary
import typings.monacoEditor.monacoEditorStrings.bounded
import typings.monacoEditor.monacoEditorStrings.copy
import typings.monacoEditor.monacoEditorStrings.ctrlKey
import typings.monacoEditor.monacoEditorStrings.default
import typings.monacoEditor.monacoEditorStrings.editable
import typings.monacoEditor.monacoEditorStrings.first
import typings.monacoEditor.monacoEditorStrings.full
import typings.monacoEditor.monacoEditorStrings.gutter
import typings.monacoEditor.monacoEditorStrings.indentation
import typings.monacoEditor.monacoEditorStrings.line
import typings.monacoEditor.monacoEditorStrings.metaKey
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.near
import typings.monacoEditor.monacoEditorStrings.never
import typings.monacoEditor.monacoEditorStrings.none
import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.on
import typings.monacoEditor.monacoEditorStrings.onlySnippets
import typings.monacoEditor.monacoEditorStrings.prompt
import typings.monacoEditor.monacoEditorStrings.recentlyUsed
import typings.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typings.monacoEditor.monacoEditorStrings.selection
import typings.monacoEditor.monacoEditorStrings.simple
import typings.monacoEditor.monacoEditorStrings.smart
import typings.monacoEditor.monacoEditorStrings.spread
import typings.monacoEditor.monacoEditorStrings.text
import typings.monacoEditor.monacoEditorStrings.top
import typings.monacoEditor.monacoEditorStrings.trailing
import typings.monacoEditor.monacoEditorStrings.tree
import typings.monacoEditor.monacoEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.EditorOptions")
@js.native
object EditorOptions extends js.Object {
  
  var acceptSuggestionOnCommitCharacter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
    Boolean
  ] = js.native
  
  var acceptSuggestionOnEnter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
    on | off | smart
  ] = js.native
  
  var accessibilityPageSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double] = js.native
  
  var accessibilitySupport: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
    AccessibilitySupport
  ] = js.native
  
  var ariaLabel: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.ariaLabel, String] = js.native
  
  var autoClosingBrackets: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
    EditorAutoClosingStrategy
  ] = js.native
  
  var autoClosingOvertype: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
    EditorAutoClosingOvertypeStrategy
  ] = js.native
  
  var autoClosingQuotes: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
    EditorAutoClosingStrategy
  ] = js.native
  
  var autoIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.autoIndent, EditorAutoIndentStrategy] = js.native
  
  var autoSurround: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoSurround, 
    EditorAutoSurroundStrategy
  ] = js.native
  
  var automaticLayout: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean] = js.native
  
  var codeLens: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLens, Boolean] = js.native
  
  var colorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean] = js.native
  
  var columnSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean] = js.native
  
  var comments: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.comments, EditorCommentsOptions] = js.native
  
  var contextmenu: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean] = js.native
  
  var copyWithSyntaxHighlighting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, Boolean] = js.native
  
  var cursorBlinking: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
    TextEditorCursorBlinkingStyle
  ] = js.native
  
  var cursorSmoothCaretAnimation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, Boolean] = js.native
  
  var cursorStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorStyle, TextEditorCursorStyle] = js.native
  
  var cursorSurroundingLines: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double] = js.native
  
  var cursorSurroundingLinesStyle: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
    default | all
  ] = js.native
  
  var cursorWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorWidth, Double] = js.native
  
  var definitionLinkOpensInPeek: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, Boolean] = js.native
  
  var disableLayerHinting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean] = js.native
  
  var disableMonospaceOptimizations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
    Boolean
  ] = js.native
  
  var dragAndDrop: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean] = js.native
  
  var editorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.editorClassName, String] = js.native
  
  var emptySelectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, Boolean] = js.native
  
  var extraEditorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String] = js.native
  
  var fastScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double] = js.native
  
  var find: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.find, EditorFindOptions] = js.native
  
  var fixedOverflowWidgets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean] = js.native
  
  var folding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.folding, Boolean] = js.native
  
  var foldingHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean] = js.native
  
  var foldingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingStrategy, auto | indentation] = js.native
  
  var fontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontFamily, String] = js.native
  
  var fontInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo] = js.native
  
  var fontLigatures2: IEditorOption[fontLigatures, String] = js.native
  
  var fontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontSize, Double] = js.native
  
  var fontWeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontWeight, String] = js.native
  
  var formatOnPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean] = js.native
  
  var formatOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean] = js.native
  
  var glyphMargin: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean] = js.native
  
  var gotoLocation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.gotoLocation, GoToLocationOptions] = js.native
  
  var hideCursorInOverviewRuler: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, Boolean] = js.native
  
  var highlightActiveIndentGuide: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide, Boolean] = js.native
  
  var hover: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hover, EditorHoverOptions] = js.native
  
  var inDiffEditor: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean] = js.native
  
  var layoutInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo] = js.native
  
  var letterSpacing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.letterSpacing, Double] = js.native
  
  var lightbulb: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lightbulb, EditorLightbulbOptions] = js.native
  
  var lineDecorationsWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, String | Double] = js.native
  
  var lineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineHeight, Double] = js.native
  
  var lineNumbers: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.lineNumbers, 
    InternalEditorRenderLineNumbersOptions
  ] = js.native
  
  var lineNumbersMinChars: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double] = js.native
  
  var links: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.links, Boolean] = js.native
  
  var matchBrackets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.matchBrackets, always | never | near] = js.native
  
  var minimap: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.minimap, EditorMinimapOptions] = js.native
  
  var mouseStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseStyle, default | text | copy] = js.native
  
  var mouseWheelScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, Double] = js.native
  
  var mouseWheelZoom: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean] = js.native
  
  var multiCursorMergeOverlapping: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, Boolean] = js.native
  
  var multiCursorModifier: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
    altKey | metaKey | ctrlKey
  ] = js.native
  
  var multiCursorPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full] = js.native
  
  var occurrencesHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean] = js.native
  
  var overviewRulerBorder: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean] = js.native
  
  var overviewRulerLanes: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double] = js.native
  
  var padding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.padding, InternalEditorPaddingOptions] = js.native
  
  var parameterHints: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.parameterHints, 
    InternalParameterHintOptions
  ] = js.native
  
  var peekWidgetDefaultFocus: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
    tree | typings.monacoEditor.monacoEditorStrings.editor
  ] = js.native
  
  var pixelRatio: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.pixelRatio, Double] = js.native
  
  var quickSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
    ValidQuickSuggestionsOptions
  ] = js.native
  
  var quickSuggestionsDelay: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double] = js.native
  
  var readOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.readOnly, Boolean] = js.native
  
  var renameOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean] = js.native
  
  var renderControlCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters, Boolean] = js.native
  
  var renderFinalNewline: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean] = js.native
  
  var renderIndentGuides: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderIndentGuides, Boolean] = js.native
  
  var renderLineHighlight: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
    all | line | none | gutter
  ] = js.native
  
  var renderLineHighlightOnlyWhenFocus: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
    Boolean
  ] = js.native
  
  var renderValidationDecorations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
    on | off | editable
  ] = js.native
  
  var renderWhitespace: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
    all | none | boundary | selection | trailing
  ] = js.native
  
  var revealHorizontalRightPadding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, Double] = js.native
  
  var roundedSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean] = js.native
  
  var rulers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.rulers, js.Object] = js.native
  
  var scrollBeyondLastColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double] = js.native
  
  var scrollBeyondLastLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean] = js.native
  
  var scrollPredominantAxis: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, Boolean] = js.native
  
  var scrollbar: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.scrollbar, 
    InternalEditorScrollbarOptions
  ] = js.native
  
  var selectOnLineNumbers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean] = js.native
  
  var selectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean] = js.native
  
  var selectionHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean] = js.native
  
  var showDeprecated: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean] = js.native
  
  var showFoldingControls: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
    always | mouseover
  ] = js.native
  
  var showUnused: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showUnused, Boolean] = js.native
  
  var smoothScrolling: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean] = js.native
  
  var snippetSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
    none | top | bottom | `inline`
  ] = js.native
  
  var stopRenderingLineAfter: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double] = js.native
  
  var suggest: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggest, InternalSuggestOptions] = js.native
  
  var suggestFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double] = js.native
  
  var suggestLineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double] = js.native
  
  var suggestOnTriggerCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, Boolean] = js.native
  
  var suggestSelection: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.suggestSelection, 
    first | recentlyUsed | recentlyUsedByPrefix
  ] = js.native
  
  var tabCompletion: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.tabCompletion, 
    on | off | onlySnippets
  ] = js.native
  
  var tabFocusMode: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean] = js.native
  
  var tabIndex: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabIndex, Double] = js.native
  
  var unfoldOnClickAfterEndOfLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, Boolean] = js.native
  
  var unusualLineTerminators: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
    off | prompt | auto
  ] = js.native
  
  var useTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean] = js.native
  
  var wordSeparators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordSeparators, String] = js.native
  
  var wordWrap: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.wordWrap, 
    on | off | wordWrapColumn | bounded
  ] = js.native
  
  var wordWrapBreakAfterCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, String] = js.native
  
  var wordWrapBreakBeforeCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, String] = js.native
  
  var wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double] = js.native
  
  var wordWrapMinified: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapMinified, Boolean] = js.native
  
  var wrappingIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent] = js.native
  
  var wrappingInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingInfo, EditorWrappingInfo] = js.native
  
  var wrappingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy, simple | advanced] = js.native
}
