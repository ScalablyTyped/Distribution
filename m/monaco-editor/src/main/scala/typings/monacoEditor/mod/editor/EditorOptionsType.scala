package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import typings.monacoEditor.mod.editor.EditorOption.ariaLabel
import typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import typings.monacoEditor.mod.editor.EditorOption.autoIndent
import typings.monacoEditor.mod.editor.EditorOption.autoSurround
import typings.monacoEditor.mod.editor.EditorOption.automaticLayout
import typings.monacoEditor.mod.editor.EditorOption.codeLens
import typings.monacoEditor.mod.editor.EditorOption.colorDecorators
import typings.monacoEditor.mod.editor.EditorOption.columnSelection
import typings.monacoEditor.mod.editor.EditorOption.comments
import typings.monacoEditor.mod.editor.EditorOption.contextmenu
import typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting
import typings.monacoEditor.mod.editor.EditorOption.cursorBlinking
import typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation
import typings.monacoEditor.mod.editor.EditorOption.cursorStyle
import typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines
import typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle
import typings.monacoEditor.mod.editor.EditorOption.cursorWidth
import typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek
import typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import typings.monacoEditor.mod.editor.EditorOption.dragAndDrop
import typings.monacoEditor.mod.editor.EditorOption.editorClassName
import typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.find
import typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import typings.monacoEditor.mod.editor.EditorOption.folding
import typings.monacoEditor.mod.editor.EditorOption.foldingHighlight
import typings.monacoEditor.mod.editor.EditorOption.foldingStrategy
import typings.monacoEditor.mod.editor.EditorOption.fontFamily
import typings.monacoEditor.mod.editor.EditorOption.fontInfo
import typings.monacoEditor.mod.editor.EditorOption.fontLigatures
import typings.monacoEditor.mod.editor.EditorOption.fontSize
import typings.monacoEditor.mod.editor.EditorOption.fontWeight
import typings.monacoEditor.mod.editor.EditorOption.formatOnPaste
import typings.monacoEditor.mod.editor.EditorOption.formatOnType
import typings.monacoEditor.mod.editor.EditorOption.glyphMargin
import typings.monacoEditor.mod.editor.EditorOption.gotoLocation
import typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import typings.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide
import typings.monacoEditor.mod.editor.EditorOption.hover
import typings.monacoEditor.mod.editor.EditorOption.inDiffEditor
import typings.monacoEditor.mod.editor.EditorOption.layoutInfo
import typings.monacoEditor.mod.editor.EditorOption.letterSpacing
import typings.monacoEditor.mod.editor.EditorOption.lightbulb
import typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import typings.monacoEditor.mod.editor.EditorOption.lineHeight
import typings.monacoEditor.mod.editor.EditorOption.lineNumbers
import typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import typings.monacoEditor.mod.editor.EditorOption.links
import typings.monacoEditor.mod.editor.EditorOption.matchBrackets
import typings.monacoEditor.mod.editor.EditorOption.minimap
import typings.monacoEditor.mod.editor.EditorOption.mouseStyle
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping
import typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier
import typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste
import typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight
import typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder
import typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes
import typings.monacoEditor.mod.editor.EditorOption.padding
import typings.monacoEditor.mod.editor.EditorOption.parameterHints
import typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus
import typings.monacoEditor.mod.editor.EditorOption.pixelRatio
import typings.monacoEditor.mod.editor.EditorOption.quickSuggestions
import typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay
import typings.monacoEditor.mod.editor.EditorOption.readOnly
import typings.monacoEditor.mod.editor.EditorOption.renameOnType
import typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters
import typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline
import typings.monacoEditor.mod.editor.EditorOption.renderIndentGuides
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus
import typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import typings.monacoEditor.mod.editor.EditorOption.renderWhitespace
import typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import typings.monacoEditor.mod.editor.EditorOption.roundedSelection
import typings.monacoEditor.mod.editor.EditorOption.rulers
import typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn
import typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine
import typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis
import typings.monacoEditor.mod.editor.EditorOption.scrollbar
import typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers
import typings.monacoEditor.mod.editor.EditorOption.selectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.selectionHighlight
import typings.monacoEditor.mod.editor.EditorOption.showDeprecated
import typings.monacoEditor.mod.editor.EditorOption.showFoldingControls
import typings.monacoEditor.mod.editor.EditorOption.showUnused
import typings.monacoEditor.mod.editor.EditorOption.smoothScrolling
import typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter
import typings.monacoEditor.mod.editor.EditorOption.suggest
import typings.monacoEditor.mod.editor.EditorOption.suggestFontSize
import typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight
import typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters
import typings.monacoEditor.mod.editor.EditorOption.suggestSelection
import typings.monacoEditor.mod.editor.EditorOption.tabCompletion
import typings.monacoEditor.mod.editor.EditorOption.tabFocusMode
import typings.monacoEditor.mod.editor.EditorOption.tabIndex
import typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine
import typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators
import typings.monacoEditor.mod.editor.EditorOption.useTabStops
import typings.monacoEditor.mod.editor.EditorOption.wordSeparators
import typings.monacoEditor.mod.editor.EditorOption.wordWrap
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapMinified
import typings.monacoEditor.mod.editor.EditorOption.wrappingIndent
import typings.monacoEditor.mod.editor.EditorOption.wrappingInfo
import typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptionsType extends StObject {
  
  var acceptSuggestionOnCommitCharacter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
    Boolean
  ]
  
  var acceptSuggestionOnEnter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
    on | off | smart
  ]
  
  var accessibilityPageSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double]
  
  var accessibilitySupport: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
    AccessibilitySupport
  ]
  
  var ariaLabel: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.ariaLabel, String]
  
  var autoClosingBrackets: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
    EditorAutoClosingStrategy
  ]
  
  var autoClosingOvertype: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
    EditorAutoClosingOvertypeStrategy
  ]
  
  var autoClosingQuotes: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
    EditorAutoClosingStrategy
  ]
  
  var autoIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.autoIndent, EditorAutoIndentStrategy]
  
  var autoSurround: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoSurround, 
    EditorAutoSurroundStrategy
  ]
  
  var automaticLayout: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean]
  
  var codeLens: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLens, Boolean]
  
  var colorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean]
  
  var columnSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean]
  
  var comments: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.comments, EditorCommentsOptions]
  
  var contextmenu: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean]
  
  var copyWithSyntaxHighlighting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, Boolean]
  
  var cursorBlinking: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
    TextEditorCursorBlinkingStyle
  ]
  
  var cursorSmoothCaretAnimation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, Boolean]
  
  var cursorStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorStyle, TextEditorCursorStyle]
  
  var cursorSurroundingLines: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double]
  
  var cursorSurroundingLinesStyle: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
    default | all
  ]
  
  var cursorWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorWidth, Double]
  
  var definitionLinkOpensInPeek: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, Boolean]
  
  var disableLayerHinting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean]
  
  var disableMonospaceOptimizations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
    Boolean
  ]
  
  var dragAndDrop: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean]
  
  var editorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.editorClassName, String]
  
  var emptySelectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, Boolean]
  
  var extraEditorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String]
  
  var fastScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double]
  
  var find: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.find, EditorFindOptions]
  
  var fixedOverflowWidgets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean]
  
  var folding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.folding, Boolean]
  
  var foldingHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean]
  
  var foldingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingStrategy, auto | indentation]
  
  var fontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontFamily, String]
  
  var fontInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo]
  
  var fontLigatures2: IEditorOption[fontLigatures, String]
  
  var fontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontSize, Double]
  
  var fontWeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontWeight, String]
  
  var formatOnPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean]
  
  var formatOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean]
  
  var glyphMargin: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean]
  
  var gotoLocation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.gotoLocation, GoToLocationOptions]
  
  var hideCursorInOverviewRuler: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, Boolean]
  
  var highlightActiveIndentGuide: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide, Boolean]
  
  var hover: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hover, EditorHoverOptions]
  
  var inDiffEditor: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean]
  
  var layoutInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo]
  
  var letterSpacing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.letterSpacing, Double]
  
  var lightbulb: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lightbulb, EditorLightbulbOptions]
  
  var lineDecorationsWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, String | Double]
  
  var lineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineHeight, Double]
  
  var lineNumbers: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.lineNumbers, 
    InternalEditorRenderLineNumbersOptions
  ]
  
  var lineNumbersMinChars: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double]
  
  var links: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.links, Boolean]
  
  var matchBrackets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.matchBrackets, always | never | near]
  
  var minimap: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.minimap, EditorMinimapOptions]
  
  var mouseStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseStyle, default | text | copy]
  
  var mouseWheelScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, Double]
  
  var mouseWheelZoom: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean]
  
  var multiCursorMergeOverlapping: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, Boolean]
  
  var multiCursorModifier: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
    altKey | metaKey | ctrlKey
  ]
  
  var multiCursorPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full]
  
  var occurrencesHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean]
  
  var overviewRulerBorder: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean]
  
  var overviewRulerLanes: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double]
  
  var padding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.padding, InternalEditorPaddingOptions]
  
  var parameterHints: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.parameterHints, 
    InternalParameterHintOptions
  ]
  
  var peekWidgetDefaultFocus: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
    tree | typings.monacoEditor.monacoEditorStrings.editor
  ]
  
  var pixelRatio: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.pixelRatio, Double]
  
  var quickSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
    ValidQuickSuggestionsOptions
  ]
  
  var quickSuggestionsDelay: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double]
  
  var readOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.readOnly, Boolean]
  
  var renameOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean]
  
  var renderControlCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters, Boolean]
  
  var renderFinalNewline: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean]
  
  var renderIndentGuides: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderIndentGuides, Boolean]
  
  var renderLineHighlight: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
    all | line | none | gutter
  ]
  
  var renderLineHighlightOnlyWhenFocus: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
    Boolean
  ]
  
  var renderValidationDecorations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
    on | off | editable
  ]
  
  var renderWhitespace: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
    all | none | boundary | selection | trailing
  ]
  
  var revealHorizontalRightPadding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, Double]
  
  var roundedSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean]
  
  var rulers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.rulers, js.Object]
  
  var scrollBeyondLastColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double]
  
  var scrollBeyondLastLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean]
  
  var scrollPredominantAxis: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, Boolean]
  
  var scrollbar: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.scrollbar, 
    InternalEditorScrollbarOptions
  ]
  
  var selectOnLineNumbers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean]
  
  var selectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean]
  
  var selectionHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean]
  
  var showDeprecated: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean]
  
  var showFoldingControls: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
    always | mouseover
  ]
  
  var showUnused: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showUnused, Boolean]
  
  var smoothScrolling: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean]
  
  var snippetSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
    none | top | bottom | `inline`
  ]
  
  var stopRenderingLineAfter: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double]
  
  var suggest: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggest, InternalSuggestOptions]
  
  var suggestFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double]
  
  var suggestLineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double]
  
  var suggestOnTriggerCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, Boolean]
  
  var suggestSelection: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.suggestSelection, 
    first | recentlyUsed | recentlyUsedByPrefix
  ]
  
  var tabCompletion: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.tabCompletion, 
    on | off | onlySnippets
  ]
  
  var tabFocusMode: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean]
  
  var tabIndex: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabIndex, Double]
  
  var unfoldOnClickAfterEndOfLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, Boolean]
  
  var unusualLineTerminators: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
    off | prompt | auto
  ]
  
  var useTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean]
  
  var wordSeparators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordSeparators, String]
  
  var wordWrap: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.wordWrap, 
    on | off | wordWrapColumn | bounded
  ]
  
  var wordWrapBreakAfterCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, String]
  
  var wordWrapBreakBeforeCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, String]
  
  var wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]
  
  var wordWrapMinified: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapMinified, Boolean]
  
  var wrappingIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent]
  
  var wrappingInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingInfo, EditorWrappingInfo]
  
  var wrappingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy, simple | advanced]
}
object EditorOptionsType {
  
  inline def apply(
    acceptSuggestionOnCommitCharacter: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean],
    acceptSuggestionOnEnter: IEditorOption[acceptSuggestionOnEnter, on | off | smart],
    accessibilityPageSize: IEditorOption[accessibilityPageSize, Double],
    accessibilitySupport: IEditorOption[accessibilitySupport, AccessibilitySupport],
    ariaLabel: IEditorOption[ariaLabel, String],
    autoClosingBrackets: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy],
    autoClosingOvertype: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy],
    autoClosingQuotes: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy],
    autoIndent: IEditorOption[autoIndent, EditorAutoIndentStrategy],
    autoSurround: IEditorOption[autoSurround, EditorAutoSurroundStrategy],
    automaticLayout: IEditorOption[automaticLayout, Boolean],
    codeLens: IEditorOption[codeLens, Boolean],
    colorDecorators: IEditorOption[colorDecorators, Boolean],
    columnSelection: IEditorOption[columnSelection, Boolean],
    comments: IEditorOption[comments, EditorCommentsOptions],
    contextmenu: IEditorOption[contextmenu, Boolean],
    copyWithSyntaxHighlighting: IEditorOption[copyWithSyntaxHighlighting, Boolean],
    cursorBlinking: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle],
    cursorSmoothCaretAnimation: IEditorOption[cursorSmoothCaretAnimation, Boolean],
    cursorStyle: IEditorOption[cursorStyle, TextEditorCursorStyle],
    cursorSurroundingLines: IEditorOption[cursorSurroundingLines, Double],
    cursorSurroundingLinesStyle: IEditorOption[cursorSurroundingLinesStyle, default | all],
    cursorWidth: IEditorOption[cursorWidth, Double],
    definitionLinkOpensInPeek: IEditorOption[definitionLinkOpensInPeek, Boolean],
    disableLayerHinting: IEditorOption[disableLayerHinting, Boolean],
    disableMonospaceOptimizations: IEditorOption[disableMonospaceOptimizations, Boolean],
    dragAndDrop: IEditorOption[dragAndDrop, Boolean],
    editorClassName: IEditorOption[editorClassName, String],
    emptySelectionClipboard: IEditorOption[emptySelectionClipboard, Boolean],
    extraEditorClassName: IEditorOption[extraEditorClassName, String],
    fastScrollSensitivity: IEditorOption[fastScrollSensitivity, Double],
    find: IEditorOption[find, EditorFindOptions],
    fixedOverflowWidgets: IEditorOption[fixedOverflowWidgets, Boolean],
    folding: IEditorOption[folding, Boolean],
    foldingHighlight: IEditorOption[foldingHighlight, Boolean],
    foldingStrategy: IEditorOption[foldingStrategy, auto | indentation],
    fontFamily: IEditorOption[fontFamily, String],
    fontInfo: IEditorOption[fontInfo, FontInfo],
    fontLigatures2: IEditorOption[fontLigatures, String],
    fontSize: IEditorOption[fontSize, Double],
    fontWeight: IEditorOption[fontWeight, String],
    formatOnPaste: IEditorOption[formatOnPaste, Boolean],
    formatOnType: IEditorOption[formatOnType, Boolean],
    glyphMargin: IEditorOption[glyphMargin, Boolean],
    gotoLocation: IEditorOption[gotoLocation, GoToLocationOptions],
    hideCursorInOverviewRuler: IEditorOption[hideCursorInOverviewRuler, Boolean],
    highlightActiveIndentGuide: IEditorOption[highlightActiveIndentGuide, Boolean],
    hover: IEditorOption[hover, EditorHoverOptions],
    inDiffEditor: IEditorOption[inDiffEditor, Boolean],
    layoutInfo: IEditorOption[layoutInfo, EditorLayoutInfo],
    letterSpacing: IEditorOption[letterSpacing, Double],
    lightbulb: IEditorOption[lightbulb, EditorLightbulbOptions],
    lineDecorationsWidth: IEditorOption[lineDecorationsWidth, String | Double],
    lineHeight: IEditorOption[lineHeight, Double],
    lineNumbers: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions],
    lineNumbersMinChars: IEditorOption[lineNumbersMinChars, Double],
    links: IEditorOption[links, Boolean],
    matchBrackets: IEditorOption[matchBrackets, always | never | near],
    minimap: IEditorOption[minimap, EditorMinimapOptions],
    mouseStyle: IEditorOption[mouseStyle, default | text | copy],
    mouseWheelScrollSensitivity: IEditorOption[mouseWheelScrollSensitivity, Double],
    mouseWheelZoom: IEditorOption[mouseWheelZoom, Boolean],
    multiCursorMergeOverlapping: IEditorOption[multiCursorMergeOverlapping, Boolean],
    multiCursorModifier: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey],
    multiCursorPaste: IEditorOption[multiCursorPaste, spread | full],
    occurrencesHighlight: IEditorOption[occurrencesHighlight, Boolean],
    overviewRulerBorder: IEditorOption[overviewRulerBorder, Boolean],
    overviewRulerLanes: IEditorOption[overviewRulerLanes, Double],
    padding: IEditorOption[padding, InternalEditorPaddingOptions],
    parameterHints: IEditorOption[parameterHints, InternalParameterHintOptions],
    peekWidgetDefaultFocus: IEditorOption[peekWidgetDefaultFocus, tree | typings.monacoEditor.monacoEditorStrings.editor],
    pixelRatio: IEditorOption[pixelRatio, Double],
    quickSuggestions: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions],
    quickSuggestionsDelay: IEditorOption[quickSuggestionsDelay, Double],
    readOnly: IEditorOption[readOnly, Boolean],
    renameOnType: IEditorOption[renameOnType, Boolean],
    renderControlCharacters: IEditorOption[renderControlCharacters, Boolean],
    renderFinalNewline: IEditorOption[renderFinalNewline, Boolean],
    renderIndentGuides: IEditorOption[renderIndentGuides, Boolean],
    renderLineHighlight: IEditorOption[renderLineHighlight, all | line | none | gutter],
    renderLineHighlightOnlyWhenFocus: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean],
    renderValidationDecorations: IEditorOption[renderValidationDecorations, on | off | editable],
    renderWhitespace: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing],
    revealHorizontalRightPadding: IEditorOption[revealHorizontalRightPadding, Double],
    roundedSelection: IEditorOption[roundedSelection, Boolean],
    rulers: IEditorOption[rulers, js.Object],
    scrollBeyondLastColumn: IEditorOption[scrollBeyondLastColumn, Double],
    scrollBeyondLastLine: IEditorOption[scrollBeyondLastLine, Boolean],
    scrollPredominantAxis: IEditorOption[scrollPredominantAxis, Boolean],
    scrollbar: IEditorOption[scrollbar, InternalEditorScrollbarOptions],
    selectOnLineNumbers: IEditorOption[selectOnLineNumbers, Boolean],
    selectionClipboard: IEditorOption[selectionClipboard, Boolean],
    selectionHighlight: IEditorOption[selectionHighlight, Boolean],
    showDeprecated: IEditorOption[showDeprecated, Boolean],
    showFoldingControls: IEditorOption[showFoldingControls, always | mouseover],
    showUnused: IEditorOption[showUnused, Boolean],
    smoothScrolling: IEditorOption[smoothScrolling, Boolean],
    snippetSuggestions: IEditorOption[snippetSuggestions, none | top | bottom | `inline`],
    stopRenderingLineAfter: IEditorOption[stopRenderingLineAfter, Double],
    suggest: IEditorOption[suggest, InternalSuggestOptions],
    suggestFontSize: IEditorOption[suggestFontSize, Double],
    suggestLineHeight: IEditorOption[suggestLineHeight, Double],
    suggestOnTriggerCharacters: IEditorOption[suggestOnTriggerCharacters, Boolean],
    suggestSelection: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix],
    tabCompletion: IEditorOption[tabCompletion, on | off | onlySnippets],
    tabFocusMode: IEditorOption[tabFocusMode, Boolean],
    tabIndex: IEditorOption[tabIndex, Double],
    unfoldOnClickAfterEndOfLine: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean],
    unusualLineTerminators: IEditorOption[unusualLineTerminators, off | prompt | auto],
    useTabStops: IEditorOption[useTabStops, Boolean],
    wordSeparators: IEditorOption[wordSeparators, String],
    wordWrap: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded],
    wordWrapBreakAfterCharacters: IEditorOption[wordWrapBreakAfterCharacters, String],
    wordWrapBreakBeforeCharacters: IEditorOption[wordWrapBreakBeforeCharacters, String],
    wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double],
    wordWrapMinified: IEditorOption[wordWrapMinified, Boolean],
    wrappingIndent: IEditorOption[wrappingIndent, WrappingIndent],
    wrappingInfo: IEditorOption[wrappingInfo, EditorWrappingInfo],
    wrappingStrategy: IEditorOption[wrappingStrategy, simple | advanced]
  ): EditorOptionsType = {
    val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], accessibilityPageSize = accessibilityPageSize.asInstanceOf[js.Any], accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], automaticLayout = automaticLayout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], columnSelection = columnSelection.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorSurroundingLinesStyle = cursorSurroundingLinesStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], definitionLinkOpensInPeek = definitionLinkOpensInPeek.asInstanceOf[js.Any], disableLayerHinting = disableLayerHinting.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingHighlight = foldingHighlight.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], fontLigatures2 = fontLigatures2.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDiffEditor = inDiffEditor.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightbulb = lightbulb.asInstanceOf[js.Any], lineDecorationsWidth = lineDecorationsWidth.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineNumbersMinChars = lineNumbersMinChars.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseStyle = mouseStyle.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], multiCursorPaste = multiCursorPaste.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], peekWidgetDefaultFocus = peekWidgetDefaultFocus.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renameOnType = renameOnType.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineHighlightOnlyWhenFocus = renderLineHighlightOnlyWhenFocus.asInstanceOf[js.Any], renderValidationDecorations = renderValidationDecorations.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollPredominantAxis = scrollPredominantAxis.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showDeprecated = showDeprecated.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], showUnused = showUnused.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], snippetSuggestions = snippetSuggestions.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], unfoldOnClickAfterEndOfLine = unfoldOnClickAfterEndOfLine.asInstanceOf[js.Any], unusualLineTerminators = unusualLineTerminators.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any], wordWrapMinified = wordWrapMinified.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any], wrappingStrategy = wrappingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptionsType]
  }
  
  extension [Self <: EditorOptionsType](x: Self) {
    
    inline def setAcceptSuggestionOnCommitCharacter(value: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
    
    inline def setAcceptSuggestionOnEnter(value: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Self = StObject.set(x, "acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPageSize(value: IEditorOption[accessibilityPageSize, Double]): Self = StObject.set(x, "accessibilityPageSize", value.asInstanceOf[js.Any])
    
    inline def setAccessibilitySupport(value: IEditorOption[accessibilitySupport, AccessibilitySupport]): Self = StObject.set(x, "accessibilitySupport", value.asInstanceOf[js.Any])
    
    inline def setAriaLabel(value: IEditorOption[ariaLabel, String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingBrackets(value: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy]): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingOvertype(value: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy]): Self = StObject.set(x, "autoClosingOvertype", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingQuotes(value: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy]): Self = StObject.set(x, "autoClosingQuotes", value.asInstanceOf[js.Any])
    
    inline def setAutoIndent(value: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoSurround(value: IEditorOption[autoSurround, EditorAutoSurroundStrategy]): Self = StObject.set(x, "autoSurround", value.asInstanceOf[js.Any])
    
    inline def setAutomaticLayout(value: IEditorOption[automaticLayout, Boolean]): Self = StObject.set(x, "automaticLayout", value.asInstanceOf[js.Any])
    
    inline def setCodeLens(value: IEditorOption[codeLens, Boolean]): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
    
    inline def setColorDecorators(value: IEditorOption[colorDecorators, Boolean]): Self = StObject.set(x, "colorDecorators", value.asInstanceOf[js.Any])
    
    inline def setColumnSelection(value: IEditorOption[columnSelection, Boolean]): Self = StObject.set(x, "columnSelection", value.asInstanceOf[js.Any])
    
    inline def setComments(value: IEditorOption[comments, EditorCommentsOptions]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setContextmenu(value: IEditorOption[contextmenu, Boolean]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setCopyWithSyntaxHighlighting(value: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Self = StObject.set(x, "copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
    
    inline def setCursorBlinking(value: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Self = StObject.set(x, "cursorBlinking", value.asInstanceOf[js.Any])
    
    inline def setCursorSmoothCaretAnimation(value: IEditorOption[cursorSmoothCaretAnimation, Boolean]): Self = StObject.set(x, "cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
    
    inline def setCursorStyle(value: IEditorOption[cursorStyle, TextEditorCursorStyle]): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorSurroundingLines(value: IEditorOption[cursorSurroundingLines, Double]): Self = StObject.set(x, "cursorSurroundingLines", value.asInstanceOf[js.Any])
    
    inline def setCursorSurroundingLinesStyle(value: IEditorOption[cursorSurroundingLinesStyle, default | all]): Self = StObject.set(x, "cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorWidth(value: IEditorOption[cursorWidth, Double]): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
    
    inline def setDefinitionLinkOpensInPeek(value: IEditorOption[definitionLinkOpensInPeek, Boolean]): Self = StObject.set(x, "definitionLinkOpensInPeek", value.asInstanceOf[js.Any])
    
    inline def setDisableLayerHinting(value: IEditorOption[disableLayerHinting, Boolean]): Self = StObject.set(x, "disableLayerHinting", value.asInstanceOf[js.Any])
    
    inline def setDisableMonospaceOptimizations(value: IEditorOption[disableMonospaceOptimizations, Boolean]): Self = StObject.set(x, "disableMonospaceOptimizations", value.asInstanceOf[js.Any])
    
    inline def setDragAndDrop(value: IEditorOption[dragAndDrop, Boolean]): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
    
    inline def setEditorClassName(value: IEditorOption[editorClassName, String]): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
    
    inline def setEmptySelectionClipboard(value: IEditorOption[emptySelectionClipboard, Boolean]): Self = StObject.set(x, "emptySelectionClipboard", value.asInstanceOf[js.Any])
    
    inline def setExtraEditorClassName(value: IEditorOption[extraEditorClassName, String]): Self = StObject.set(x, "extraEditorClassName", value.asInstanceOf[js.Any])
    
    inline def setFastScrollSensitivity(value: IEditorOption[fastScrollSensitivity, Double]): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setFind(value: IEditorOption[find, EditorFindOptions]): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFixedOverflowWidgets(value: IEditorOption[fixedOverflowWidgets, Boolean]): Self = StObject.set(x, "fixedOverflowWidgets", value.asInstanceOf[js.Any])
    
    inline def setFolding(value: IEditorOption[folding, Boolean]): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
    
    inline def setFoldingHighlight(value: IEditorOption[foldingHighlight, Boolean]): Self = StObject.set(x, "foldingHighlight", value.asInstanceOf[js.Any])
    
    inline def setFoldingStrategy(value: IEditorOption[foldingStrategy, auto | indentation]): Self = StObject.set(x, "foldingStrategy", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: IEditorOption[fontFamily, String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontInfo(value: IEditorOption[fontInfo, FontInfo]): Self = StObject.set(x, "fontInfo", value.asInstanceOf[js.Any])
    
    inline def setFontLigatures2(value: IEditorOption[fontLigatures, String]): Self = StObject.set(x, "fontLigatures2", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: IEditorOption[fontSize, Double]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: IEditorOption[fontWeight, String]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFormatOnPaste(value: IEditorOption[formatOnPaste, Boolean]): Self = StObject.set(x, "formatOnPaste", value.asInstanceOf[js.Any])
    
    inline def setFormatOnType(value: IEditorOption[formatOnType, Boolean]): Self = StObject.set(x, "formatOnType", value.asInstanceOf[js.Any])
    
    inline def setGlyphMargin(value: IEditorOption[glyphMargin, Boolean]): Self = StObject.set(x, "glyphMargin", value.asInstanceOf[js.Any])
    
    inline def setGotoLocation(value: IEditorOption[gotoLocation, GoToLocationOptions]): Self = StObject.set(x, "gotoLocation", value.asInstanceOf[js.Any])
    
    inline def setHideCursorInOverviewRuler(value: IEditorOption[hideCursorInOverviewRuler, Boolean]): Self = StObject.set(x, "hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
    
    inline def setHighlightActiveIndentGuide(value: IEditorOption[highlightActiveIndentGuide, Boolean]): Self = StObject.set(x, "highlightActiveIndentGuide", value.asInstanceOf[js.Any])
    
    inline def setHover(value: IEditorOption[hover, EditorHoverOptions]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setInDiffEditor(value: IEditorOption[inDiffEditor, Boolean]): Self = StObject.set(x, "inDiffEditor", value.asInstanceOf[js.Any])
    
    inline def setLayoutInfo(value: IEditorOption[layoutInfo, EditorLayoutInfo]): Self = StObject.set(x, "layoutInfo", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: IEditorOption[letterSpacing, Double]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLightbulb(value: IEditorOption[lightbulb, EditorLightbulbOptions]): Self = StObject.set(x, "lightbulb", value.asInstanceOf[js.Any])
    
    inline def setLineDecorationsWidth(value: IEditorOption[lineDecorationsWidth, String | Double]): Self = StObject.set(x, "lineDecorationsWidth", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: IEditorOption[lineHeight, Double]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineNumbers(value: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersMinChars(value: IEditorOption[lineNumbersMinChars, Double]): Self = StObject.set(x, "lineNumbersMinChars", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: IEditorOption[links, Boolean]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMatchBrackets(value: IEditorOption[matchBrackets, always | never | near]): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
    
    inline def setMinimap(value: IEditorOption[minimap, EditorMinimapOptions]): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
    
    inline def setMouseStyle(value: IEditorOption[mouseStyle, default | text | copy]): Self = StObject.set(x, "mouseStyle", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelScrollSensitivity(value: IEditorOption[mouseWheelScrollSensitivity, Double]): Self = StObject.set(x, "mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelZoom(value: IEditorOption[mouseWheelZoom, Boolean]): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
    
    inline def setMultiCursorMergeOverlapping(value: IEditorOption[multiCursorMergeOverlapping, Boolean]): Self = StObject.set(x, "multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
    
    inline def setMultiCursorModifier(value: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Self = StObject.set(x, "multiCursorModifier", value.asInstanceOf[js.Any])
    
    inline def setMultiCursorPaste(value: IEditorOption[multiCursorPaste, spread | full]): Self = StObject.set(x, "multiCursorPaste", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesHighlight(value: IEditorOption[occurrencesHighlight, Boolean]): Self = StObject.set(x, "occurrencesHighlight", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerBorder(value: IEditorOption[overviewRulerBorder, Boolean]): Self = StObject.set(x, "overviewRulerBorder", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerLanes(value: IEditorOption[overviewRulerLanes, Double]): Self = StObject.set(x, "overviewRulerLanes", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: IEditorOption[padding, InternalEditorPaddingOptions]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setParameterHints(value: IEditorOption[parameterHints, InternalParameterHintOptions]): Self = StObject.set(x, "parameterHints", value.asInstanceOf[js.Any])
    
    inline def setPeekWidgetDefaultFocus(
      value: IEditorOption[peekWidgetDefaultFocus, tree | typings.monacoEditor.monacoEditorStrings.editor]
    ): Self = StObject.set(x, "peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: IEditorOption[pixelRatio, Double]): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setQuickSuggestions(value: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions]): Self = StObject.set(x, "quickSuggestions", value.asInstanceOf[js.Any])
    
    inline def setQuickSuggestionsDelay(value: IEditorOption[quickSuggestionsDelay, Double]): Self = StObject.set(x, "quickSuggestionsDelay", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: IEditorOption[readOnly, Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setRenameOnType(value: IEditorOption[renameOnType, Boolean]): Self = StObject.set(x, "renameOnType", value.asInstanceOf[js.Any])
    
    inline def setRenderControlCharacters(value: IEditorOption[renderControlCharacters, Boolean]): Self = StObject.set(x, "renderControlCharacters", value.asInstanceOf[js.Any])
    
    inline def setRenderFinalNewline(value: IEditorOption[renderFinalNewline, Boolean]): Self = StObject.set(x, "renderFinalNewline", value.asInstanceOf[js.Any])
    
    inline def setRenderIndentGuides(value: IEditorOption[renderIndentGuides, Boolean]): Self = StObject.set(x, "renderIndentGuides", value.asInstanceOf[js.Any])
    
    inline def setRenderLineHighlight(value: IEditorOption[renderLineHighlight, all | line | none | gutter]): Self = StObject.set(x, "renderLineHighlight", value.asInstanceOf[js.Any])
    
    inline def setRenderLineHighlightOnlyWhenFocus(value: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean]): Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", value.asInstanceOf[js.Any])
    
    inline def setRenderValidationDecorations(value: IEditorOption[renderValidationDecorations, on | off | editable]): Self = StObject.set(x, "renderValidationDecorations", value.asInstanceOf[js.Any])
    
    inline def setRenderWhitespace(value: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing]): Self = StObject.set(x, "renderWhitespace", value.asInstanceOf[js.Any])
    
    inline def setRevealHorizontalRightPadding(value: IEditorOption[revealHorizontalRightPadding, Double]): Self = StObject.set(x, "revealHorizontalRightPadding", value.asInstanceOf[js.Any])
    
    inline def setRoundedSelection(value: IEditorOption[roundedSelection, Boolean]): Self = StObject.set(x, "roundedSelection", value.asInstanceOf[js.Any])
    
    inline def setRulers(value: IEditorOption[rulers, js.Object]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
    
    inline def setScrollBeyondLastColumn(value: IEditorOption[scrollBeyondLastColumn, Double]): Self = StObject.set(x, "scrollBeyondLastColumn", value.asInstanceOf[js.Any])
    
    inline def setScrollBeyondLastLine(value: IEditorOption[scrollBeyondLastLine, Boolean]): Self = StObject.set(x, "scrollBeyondLastLine", value.asInstanceOf[js.Any])
    
    inline def setScrollPredominantAxis(value: IEditorOption[scrollPredominantAxis, Boolean]): Self = StObject.set(x, "scrollPredominantAxis", value.asInstanceOf[js.Any])
    
    inline def setScrollbar(value: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setSelectOnLineNumbers(value: IEditorOption[selectOnLineNumbers, Boolean]): Self = StObject.set(x, "selectOnLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setSelectionClipboard(value: IEditorOption[selectionClipboard, Boolean]): Self = StObject.set(x, "selectionClipboard", value.asInstanceOf[js.Any])
    
    inline def setSelectionHighlight(value: IEditorOption[selectionHighlight, Boolean]): Self = StObject.set(x, "selectionHighlight", value.asInstanceOf[js.Any])
    
    inline def setShowDeprecated(value: IEditorOption[showDeprecated, Boolean]): Self = StObject.set(x, "showDeprecated", value.asInstanceOf[js.Any])
    
    inline def setShowFoldingControls(value: IEditorOption[showFoldingControls, always | mouseover]): Self = StObject.set(x, "showFoldingControls", value.asInstanceOf[js.Any])
    
    inline def setShowUnused(value: IEditorOption[showUnused, Boolean]): Self = StObject.set(x, "showUnused", value.asInstanceOf[js.Any])
    
    inline def setSmoothScrolling(value: IEditorOption[smoothScrolling, Boolean]): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
    
    inline def setSnippetSuggestions(value: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Self = StObject.set(x, "snippetSuggestions", value.asInstanceOf[js.Any])
    
    inline def setStopRenderingLineAfter(value: IEditorOption[stopRenderingLineAfter, Double]): Self = StObject.set(x, "stopRenderingLineAfter", value.asInstanceOf[js.Any])
    
    inline def setSuggest(value: IEditorOption[suggest, InternalSuggestOptions]): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestFontSize(value: IEditorOption[suggestFontSize, Double]): Self = StObject.set(x, "suggestFontSize", value.asInstanceOf[js.Any])
    
    inline def setSuggestLineHeight(value: IEditorOption[suggestLineHeight, Double]): Self = StObject.set(x, "suggestLineHeight", value.asInstanceOf[js.Any])
    
    inline def setSuggestOnTriggerCharacters(value: IEditorOption[suggestOnTriggerCharacters, Boolean]): Self = StObject.set(x, "suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setSuggestSelection(value: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Self = StObject.set(x, "suggestSelection", value.asInstanceOf[js.Any])
    
    inline def setTabCompletion(value: IEditorOption[tabCompletion, on | off | onlySnippets]): Self = StObject.set(x, "tabCompletion", value.asInstanceOf[js.Any])
    
    inline def setTabFocusMode(value: IEditorOption[tabFocusMode, Boolean]): Self = StObject.set(x, "tabFocusMode", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: IEditorOption[tabIndex, Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setUnfoldOnClickAfterEndOfLine(value: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean]): Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", value.asInstanceOf[js.Any])
    
    inline def setUnusualLineTerminators(value: IEditorOption[unusualLineTerminators, off | prompt | auto]): Self = StObject.set(x, "unusualLineTerminators", value.asInstanceOf[js.Any])
    
    inline def setUseTabStops(value: IEditorOption[useTabStops, Boolean]): Self = StObject.set(x, "useTabStops", value.asInstanceOf[js.Any])
    
    inline def setWordSeparators(value: IEditorOption[wordSeparators, String]): Self = StObject.set(x, "wordSeparators", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapBreakAfterCharacters(value: IEditorOption[wordWrapBreakAfterCharacters, String]): Self = StObject.set(x, "wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
    
    inline def setWordWrapBreakBeforeCharacters(value: IEditorOption[wordWrapBreakBeforeCharacters, String]): Self = StObject.set(x, "wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
    
    inline def setWordWrapColumn(value: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
    
    inline def setWordWrapMinified(value: IEditorOption[wordWrapMinified, Boolean]): Self = StObject.set(x, "wordWrapMinified", value.asInstanceOf[js.Any])
    
    inline def setWrappingIndent(value: IEditorOption[wrappingIndent, WrappingIndent]): Self = StObject.set(x, "wrappingIndent", value.asInstanceOf[js.Any])
    
    inline def setWrappingInfo(value: IEditorOption[wrappingInfo, EditorWrappingInfo]): Self = StObject.set(x, "wrappingInfo", value.asInstanceOf[js.Any])
    
    inline def setWrappingStrategy(value: IEditorOption[wrappingStrategy, simple | advanced]): Self = StObject.set(x, "wrappingStrategy", value.asInstanceOf[js.Any])
  }
}
