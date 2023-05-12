package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.ReadonlyRequiredIBracketP
import typings.monacoEditor.anon.ReadonlyRequiredIDropInto
import typings.monacoEditor.anon.ReadonlyRequiredIEditorCo
import typings.monacoEditor.anon.ReadonlyRequiredIEditorFi
import typings.monacoEditor.anon.ReadonlyRequiredIEditorHo
import typings.monacoEditor.anon.ReadonlyRequiredIEditorIn
import typings.monacoEditor.anon.ReadonlyRequiredIEditorLi
import typings.monacoEditor.anon.ReadonlyRequiredIEditorMi
import typings.monacoEditor.anon.ReadonlyRequiredIEditorPa
import typings.monacoEditor.anon.ReadonlyRequiredIEditorPaCycle
import typings.monacoEditor.anon.ReadonlyRequiredIEditorSt
import typings.monacoEditor.anon.ReadonlyRequiredIGotoLoca
import typings.monacoEditor.anon.ReadonlyRequiredIGuidesOp
import typings.monacoEditor.anon.ReadonlyRequiredIInlineSu
import typings.monacoEditor.anon.ReadonlyRequiredISmartSel
import typings.monacoEditor.anon.ReadonlyRequiredISuggestO
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import typings.monacoEditor.mod.editor.EditorOption.ariaLabel
import typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import typings.monacoEditor.mod.editor.EditorOption.autoClosingDelete
import typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import typings.monacoEditor.mod.editor.EditorOption.autoIndent
import typings.monacoEditor.mod.editor.EditorOption.autoSurround
import typings.monacoEditor.mod.editor.EditorOption.automaticLayout
import typings.monacoEditor.mod.editor.EditorOption.bracketPairColorization
import typings.monacoEditor.mod.editor.EditorOption.codeLens
import typings.monacoEditor.mod.editor.EditorOption.codeLensFontFamily
import typings.monacoEditor.mod.editor.EditorOption.codeLensFontSize
import typings.monacoEditor.mod.editor.EditorOption.colorDecorators
import typings.monacoEditor.mod.editor.EditorOption.colorDecoratorsLimit
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
import typings.monacoEditor.mod.editor.EditorOption.defaultColorDecorators
import typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek
import typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import typings.monacoEditor.mod.editor.EditorOption.domReadOnly
import typings.monacoEditor.mod.editor.EditorOption.dragAndDrop
import typings.monacoEditor.mod.editor.EditorOption.dropIntoEditor
import typings.monacoEditor.mod.editor.EditorOption.editorClassName
import typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.experimentalWhitespaceRendering
import typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.find
import typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import typings.monacoEditor.mod.editor.EditorOption.folding
import typings.monacoEditor.mod.editor.EditorOption.foldingHighlight
import typings.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault
import typings.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions
import typings.monacoEditor.mod.editor.EditorOption.foldingStrategy
import typings.monacoEditor.mod.editor.EditorOption.fontFamily
import typings.monacoEditor.mod.editor.EditorOption.fontInfo
import typings.monacoEditor.mod.editor.EditorOption.fontLigatures
import typings.monacoEditor.mod.editor.EditorOption.fontSize
import typings.monacoEditor.mod.editor.EditorOption.fontVariations
import typings.monacoEditor.mod.editor.EditorOption.fontWeight
import typings.monacoEditor.mod.editor.EditorOption.formatOnPaste
import typings.monacoEditor.mod.editor.EditorOption.formatOnType
import typings.monacoEditor.mod.editor.EditorOption.glyphMargin
import typings.monacoEditor.mod.editor.EditorOption.gotoLocation
import typings.monacoEditor.mod.editor.EditorOption.guides
import typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import typings.monacoEditor.mod.editor.EditorOption.hover
import typings.monacoEditor.mod.editor.EditorOption.inDiffEditor
import typings.monacoEditor.mod.editor.EditorOption.inlayHints
import typings.monacoEditor.mod.editor.EditorOption.inlineSuggest
import typings.monacoEditor.mod.editor.EditorOption.layoutInfo
import typings.monacoEditor.mod.editor.EditorOption.letterSpacing
import typings.monacoEditor.mod.editor.EditorOption.lightbulb
import typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import typings.monacoEditor.mod.editor.EditorOption.lineHeight
import typings.monacoEditor.mod.editor.EditorOption.lineNumbers
import typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import typings.monacoEditor.mod.editor.EditorOption.linkedEditing
import typings.monacoEditor.mod.editor.EditorOption.links
import typings.monacoEditor.mod.editor.EditorOption.matchBrackets
import typings.monacoEditor.mod.editor.EditorOption.minimap
import typings.monacoEditor.mod.editor.EditorOption.mouseStyle
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import typings.monacoEditor.mod.editor.EditorOption.multiCursorLimit
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
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus
import typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import typings.monacoEditor.mod.editor.EditorOption.renderWhitespace
import typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import typings.monacoEditor.mod.editor.EditorOption.roundedSelection
import typings.monacoEditor.mod.editor.EditorOption.rulers
import typings.monacoEditor.mod.editor.EditorOption.screenReaderAnnounceInlineSuggestion
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
import typings.monacoEditor.mod.editor.EditorOption.smartSelect
import typings.monacoEditor.mod.editor.EditorOption.smoothScrolling
import typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import typings.monacoEditor.mod.editor.EditorOption.stickyScroll
import typings.monacoEditor.mod.editor.EditorOption.stickyTabStops
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
import typings.monacoEditor.mod.editor.EditorOption.unicodeHighlighting
import typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators
import typings.monacoEditor.mod.editor.EditorOption.useShadowDOM
import typings.monacoEditor.mod.editor.EditorOption.useTabStops
import typings.monacoEditor.mod.editor.EditorOption.wordBreak
import typings.monacoEditor.mod.editor.EditorOption.wordSeparators
import typings.monacoEditor.mod.editor.EditorOption.wordWrap
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride1
import typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride2
import typings.monacoEditor.mod.editor.EditorOption.wrappingIndent
import typings.monacoEditor.mod.editor.EditorOption.wrappingInfo
import typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy
import typings.monacoEditor.monacoEditorStrings.`inline`
import typings.monacoEditor.monacoEditorStrings.advanced
import typings.monacoEditor.monacoEditorStrings.all
import typings.monacoEditor.monacoEditorStrings.altKey
import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.beforeWhitespace
import typings.monacoEditor.monacoEditorStrings.bottom
import typings.monacoEditor.monacoEditorStrings.boundary
import typings.monacoEditor.monacoEditorStrings.bounded
import typings.monacoEditor.monacoEditorStrings.brackets
import typings.monacoEditor.monacoEditorStrings.copy
import typings.monacoEditor.monacoEditorStrings.ctrlKey
import typings.monacoEditor.monacoEditorStrings.default
import typings.monacoEditor.monacoEditorStrings.dimmed
import typings.monacoEditor.monacoEditorStrings.editable
import typings.monacoEditor.monacoEditorStrings.explicit
import typings.monacoEditor.monacoEditorStrings.first
import typings.monacoEditor.monacoEditorStrings.font
import typings.monacoEditor.monacoEditorStrings.full
import typings.monacoEditor.monacoEditorStrings.gutter
import typings.monacoEditor.monacoEditorStrings.indentation
import typings.monacoEditor.monacoEditorStrings.inherit
import typings.monacoEditor.monacoEditorStrings.keepAll
import typings.monacoEditor.monacoEditorStrings.languageDefined
import typings.monacoEditor.monacoEditorStrings.line
import typings.monacoEditor.monacoEditorStrings.metaKey
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.near
import typings.monacoEditor.monacoEditorStrings.never
import typings.monacoEditor.monacoEditorStrings.none
import typings.monacoEditor.monacoEditorStrings.normal
import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.on
import typings.monacoEditor.monacoEditorStrings.onlySnippets
import typings.monacoEditor.monacoEditorStrings.prompt
import typings.monacoEditor.monacoEditorStrings.quotes
import typings.monacoEditor.monacoEditorStrings.recentlyUsed
import typings.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typings.monacoEditor.monacoEditorStrings.selection
import typings.monacoEditor.monacoEditorStrings.simple
import typings.monacoEditor.monacoEditorStrings.smart
import typings.monacoEditor.monacoEditorStrings.spread
import typings.monacoEditor.monacoEditorStrings.svg
import typings.monacoEditor.monacoEditorStrings.text
import typings.monacoEditor.monacoEditorStrings.top
import typings.monacoEditor.monacoEditorStrings.trailing
import typings.monacoEditor.monacoEditorStrings.tree
import typings.monacoEditor.monacoEditorStrings.wordWrapColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditorOptions {
  
  @JSImport("monaco-editor", "editor.EditorOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.acceptSuggestionOnCommitCharacter")
  @js.native
  def acceptSuggestionOnCommitCharacter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
    Boolean
  ] = js.native
  inline def acceptSuggestionOnCommitCharacter_=(x: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnCommitCharacter")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.acceptSuggestionOnEnter")
  @js.native
  def acceptSuggestionOnEnter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
    on | off | smart
  ] = js.native
  inline def acceptSuggestionOnEnter_=(x: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnEnter")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.accessibilityPageSize")
  @js.native
  def accessibilityPageSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double] = js.native
  inline def accessibilityPageSize_=(x: IEditorOption[accessibilityPageSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityPageSize")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.accessibilitySupport")
  @js.native
  def accessibilitySupport: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
    AccessibilitySupport
  ] = js.native
  inline def accessibilitySupport_=(x: IEditorOption[accessibilitySupport, AccessibilitySupport]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilitySupport")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.ariaLabel")
  @js.native
  def ariaLabel: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.ariaLabel, String] = js.native
  inline def ariaLabel_=(x: IEditorOption[ariaLabel, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingBrackets")
  @js.native
  def autoClosingBrackets: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
    always | languageDefined | beforeWhitespace | never
  ] = js.native
  inline def autoClosingBrackets_=(x: IEditorOption[autoClosingBrackets, always | languageDefined | beforeWhitespace | never]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingDelete")
  @js.native
  def autoClosingDelete: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingDelete, 
    always | never | auto
  ] = js.native
  inline def autoClosingDelete_=(x: IEditorOption[autoClosingDelete, always | never | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingDelete")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingOvertype")
  @js.native
  def autoClosingOvertype: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
    always | never | auto
  ] = js.native
  inline def autoClosingOvertype_=(x: IEditorOption[autoClosingOvertype, always | never | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingOvertype")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingQuotes")
  @js.native
  def autoClosingQuotes: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
    always | languageDefined | beforeWhitespace | never
  ] = js.native
  inline def autoClosingQuotes_=(x: IEditorOption[autoClosingQuotes, always | languageDefined | beforeWhitespace | never]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingQuotes")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoIndent")
  @js.native
  def autoIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.autoIndent, EditorAutoIndentStrategy] = js.native
  inline def autoIndent_=(x: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoSurround")
  @js.native
  def autoSurround: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoSurround, 
    languageDefined | never | quotes | brackets
  ] = js.native
  inline def autoSurround_=(x: IEditorOption[autoSurround, languageDefined | never | quotes | brackets]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoSurround")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.automaticLayout")
  @js.native
  def automaticLayout: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean] = js.native
  inline def automaticLayout_=(x: IEditorOption[automaticLayout, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("automaticLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.bracketPairColorization")
  @js.native
  def bracketPairColorization: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.bracketPairColorization, 
    ReadonlyRequiredIBracketP
  ] = js.native
  inline def bracketPairColorization_=(x: IEditorOption[bracketPairColorization, ReadonlyRequiredIBracketP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketPairColorization")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.bracketPairGuides")
  @js.native
  def bracketPairGuides: IEditorOption[guides, ReadonlyRequiredIGuidesOp] = js.native
  inline def bracketPairGuides_=(x: IEditorOption[guides, ReadonlyRequiredIGuidesOp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketPairGuides")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.codeLens")
  @js.native
  def codeLens: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLens, Boolean] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.codeLensFontFamily")
  @js.native
  def codeLensFontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLensFontFamily, String] = js.native
  inline def codeLensFontFamily_=(x: IEditorOption[codeLensFontFamily, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLensFontFamily")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.codeLensFontSize")
  @js.native
  def codeLensFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLensFontSize, Double] = js.native
  inline def codeLensFontSize_=(x: IEditorOption[codeLensFontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLensFontSize")(x.asInstanceOf[js.Any])
  
  inline def codeLens_=(x: IEditorOption[codeLens, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.colorDecorators")
  @js.native
  def colorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.colorDecoratorsLimit")
  @js.native
  def colorDecoratorsLimit: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecoratorsLimit, Double] = js.native
  inline def colorDecoratorsLimit_=(x: IEditorOption[colorDecoratorsLimit, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorDecoratorsLimit")(x.asInstanceOf[js.Any])
  
  inline def colorDecorators_=(x: IEditorOption[colorDecorators, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorDecorators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.columnSelection")
  @js.native
  def columnSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean] = js.native
  inline def columnSelection_=(x: IEditorOption[columnSelection, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columnSelection")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.comments")
  @js.native
  def comments: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.comments, ReadonlyRequiredIEditorCo] = js.native
  inline def comments_=(x: IEditorOption[comments, ReadonlyRequiredIEditorCo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comments")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.contextmenu")
  @js.native
  def contextmenu: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean] = js.native
  inline def contextmenu_=(x: IEditorOption[contextmenu, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.copyWithSyntaxHighlighting")
  @js.native
  def copyWithSyntaxHighlighting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, Boolean] = js.native
  inline def copyWithSyntaxHighlighting_=(x: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copyWithSyntaxHighlighting")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorBlinking")
  @js.native
  def cursorBlinking: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
    TextEditorCursorBlinkingStyle
  ] = js.native
  inline def cursorBlinking_=(x: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinking")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorSmoothCaretAnimation")
  @js.native
  def cursorSmoothCaretAnimation: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, 
    on | off | explicit
  ] = js.native
  inline def cursorSmoothCaretAnimation_=(x: IEditorOption[cursorSmoothCaretAnimation, on | off | explicit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSmoothCaretAnimation")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorStyle")
  @js.native
  def cursorStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorStyle, TextEditorCursorStyle] = js.native
  inline def cursorStyle_=(x: IEditorOption[cursorStyle, TextEditorCursorStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorSurroundingLines")
  @js.native
  def cursorSurroundingLines: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorSurroundingLinesStyle")
  @js.native
  def cursorSurroundingLinesStyle: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
    default | all
  ] = js.native
  inline def cursorSurroundingLinesStyle_=(x: IEditorOption[cursorSurroundingLinesStyle, default | all]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLinesStyle")(x.asInstanceOf[js.Any])
  
  inline def cursorSurroundingLines_=(x: IEditorOption[cursorSurroundingLines, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLines")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorWidth")
  @js.native
  def cursorWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorWidth, Double] = js.native
  inline def cursorWidth_=(x: IEditorOption[cursorWidth, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.defaultColorDecorators")
  @js.native
  def defaultColorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.defaultColorDecorators, Boolean] = js.native
  inline def defaultColorDecorators_=(x: IEditorOption[defaultColorDecorators, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultColorDecorators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.definitionLinkOpensInPeek")
  @js.native
  def definitionLinkOpensInPeek: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, Boolean] = js.native
  inline def definitionLinkOpensInPeek_=(x: IEditorOption[definitionLinkOpensInPeek, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionLinkOpensInPeek")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.disableLayerHinting")
  @js.native
  def disableLayerHinting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean] = js.native
  inline def disableLayerHinting_=(x: IEditorOption[disableLayerHinting, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableLayerHinting")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.disableMonospaceOptimizations")
  @js.native
  def disableMonospaceOptimizations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
    Boolean
  ] = js.native
  inline def disableMonospaceOptimizations_=(x: IEditorOption[disableMonospaceOptimizations, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableMonospaceOptimizations")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.domReadOnly")
  @js.native
  def domReadOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.domReadOnly, Boolean] = js.native
  inline def domReadOnly_=(x: IEditorOption[domReadOnly, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.dragAndDrop")
  @js.native
  def dragAndDrop: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean] = js.native
  inline def dragAndDrop_=(x: IEditorOption[dragAndDrop, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.dropIntoEditor")
  @js.native
  def dropIntoEditor: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.dropIntoEditor, 
    ReadonlyRequiredIDropInto
  ] = js.native
  inline def dropIntoEditor_=(x: IEditorOption[dropIntoEditor, ReadonlyRequiredIDropInto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropIntoEditor")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.editorClassName")
  @js.native
  def editorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.editorClassName, String] = js.native
  inline def editorClassName_=(x: IEditorOption[editorClassName, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.emptySelectionClipboard")
  @js.native
  def emptySelectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, Boolean] = js.native
  inline def emptySelectionClipboard_=(x: IEditorOption[emptySelectionClipboard, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySelectionClipboard")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.experimentalWhitespaceRendering")
  @js.native
  def experimentalWhitespaceRendering: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.experimentalWhitespaceRendering, 
    off | svg | font
  ] = js.native
  inline def experimentalWhitespaceRendering_=(x: IEditorOption[experimentalWhitespaceRendering, off | svg | font]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalWhitespaceRendering")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.extraEditorClassName")
  @js.native
  def extraEditorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String] = js.native
  inline def extraEditorClassName_=(x: IEditorOption[extraEditorClassName, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraEditorClassName")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fastScrollSensitivity")
  @js.native
  def fastScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double] = js.native
  inline def fastScrollSensitivity_=(x: IEditorOption[fastScrollSensitivity, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.find")
  @js.native
  def find: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.find, ReadonlyRequiredIEditorFi] = js.native
  inline def find_=(x: IEditorOption[find, ReadonlyRequiredIEditorFi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("find")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fixedOverflowWidgets")
  @js.native
  def fixedOverflowWidgets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean] = js.native
  inline def fixedOverflowWidgets_=(x: IEditorOption[fixedOverflowWidgets, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedOverflowWidgets")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.folding")
  @js.native
  def folding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.folding, Boolean] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.foldingHighlight")
  @js.native
  def foldingHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean] = js.native
  inline def foldingHighlight_=(x: IEditorOption[foldingHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.foldingImportsByDefault")
  @js.native
  def foldingImportsByDefault: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault, Boolean] = js.native
  inline def foldingImportsByDefault_=(x: IEditorOption[foldingImportsByDefault, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingImportsByDefault")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.foldingMaximumRegions")
  @js.native
  def foldingMaximumRegions: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions, Double] = js.native
  inline def foldingMaximumRegions_=(x: IEditorOption[foldingMaximumRegions, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingMaximumRegions")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.foldingStrategy")
  @js.native
  def foldingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingStrategy, auto | indentation] = js.native
  inline def foldingStrategy_=(x: IEditorOption[foldingStrategy, auto | indentation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingStrategy")(x.asInstanceOf[js.Any])
  
  inline def folding_=(x: IEditorOption[folding, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("folding")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontFamily")
  @js.native
  def fontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontFamily, String] = js.native
  inline def fontFamily_=(x: IEditorOption[fontFamily, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontInfo")
  @js.native
  def fontInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo] = js.native
  inline def fontInfo_=(x: IEditorOption[fontInfo, FontInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontLigatures2")
  @js.native
  def fontLigatures2: IEditorOption[fontLigatures, String] = js.native
  inline def fontLigatures2_=(x: IEditorOption[fontLigatures, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontLigatures2")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontSize")
  @js.native
  def fontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontSize, Double] = js.native
  inline def fontSize_=(x: IEditorOption[fontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontVariations")
  @js.native
  def fontVariations: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontVariations, String] = js.native
  inline def fontVariations_=(x: IEditorOption[fontVariations, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontVariations")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontWeight")
  @js.native
  def fontWeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontWeight, String] = js.native
  inline def fontWeight_=(x: IEditorOption[fontWeight, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.formatOnPaste")
  @js.native
  def formatOnPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean] = js.native
  inline def formatOnPaste_=(x: IEditorOption[formatOnPaste, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatOnPaste")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.formatOnType")
  @js.native
  def formatOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean] = js.native
  inline def formatOnType_=(x: IEditorOption[formatOnType, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatOnType")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.glyphMargin")
  @js.native
  def glyphMargin: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean] = js.native
  inline def glyphMargin_=(x: IEditorOption[glyphMargin, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glyphMargin")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.gotoLocation")
  @js.native
  def gotoLocation: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.gotoLocation, 
    ReadonlyRequiredIGotoLoca
  ] = js.native
  inline def gotoLocation_=(x: IEditorOption[gotoLocation, ReadonlyRequiredIGotoLoca]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gotoLocation")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.hideCursorInOverviewRuler")
  @js.native
  def hideCursorInOverviewRuler: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, Boolean] = js.native
  inline def hideCursorInOverviewRuler_=(x: IEditorOption[hideCursorInOverviewRuler, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideCursorInOverviewRuler")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.hover")
  @js.native
  def hover: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hover, ReadonlyRequiredIEditorHo] = js.native
  inline def hover_=(x: IEditorOption[hover, ReadonlyRequiredIEditorHo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.inDiffEditor")
  @js.native
  def inDiffEditor: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean] = js.native
  inline def inDiffEditor_=(x: IEditorOption[inDiffEditor, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inDiffEditor")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.inlayHints")
  @js.native
  def inlayHints: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inlayHints, ReadonlyRequiredIEditorIn] = js.native
  inline def inlayHints_=(x: IEditorOption[inlayHints, ReadonlyRequiredIEditorIn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlayHints")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.inlineSuggest")
  @js.native
  def inlineSuggest: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.inlineSuggest, 
    ReadonlyRequiredIInlineSu
  ] = js.native
  inline def inlineSuggest_=(x: IEditorOption[inlineSuggest, ReadonlyRequiredIInlineSu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineSuggest")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.layoutInfo")
  @js.native
  def layoutInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo] = js.native
  inline def layoutInfo_=(x: IEditorOption[layoutInfo, EditorLayoutInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layoutInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.letterSpacing")
  @js.native
  def letterSpacing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.letterSpacing, Double] = js.native
  inline def letterSpacing_=(x: IEditorOption[letterSpacing, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lightbulb")
  @js.native
  def lightbulb: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lightbulb, ReadonlyRequiredIEditorLi] = js.native
  inline def lightbulb_=(x: IEditorOption[lightbulb, ReadonlyRequiredIEditorLi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightbulb")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineDecorationsWidth")
  @js.native
  def lineDecorationsWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, Double] = js.native
  inline def lineDecorationsWidth_=(x: IEditorOption[lineDecorationsWidth, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineDecorationsWidth")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineHeight")
  @js.native
  def lineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineHeight, Double] = js.native
  inline def lineHeight_=(x: IEditorOption[lineHeight, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineNumbers")
  @js.native
  def lineNumbers: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.lineNumbers, 
    InternalEditorRenderLineNumbersOptions
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineNumbersMinChars")
  @js.native
  def lineNumbersMinChars: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double] = js.native
  inline def lineNumbersMinChars_=(x: IEditorOption[lineNumbersMinChars, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersMinChars")(x.asInstanceOf[js.Any])
  
  inline def lineNumbers_=(x: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.linkedEditing")
  @js.native
  def linkedEditing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.linkedEditing, Boolean] = js.native
  inline def linkedEditing_=(x: IEditorOption[linkedEditing, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkedEditing")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.links")
  @js.native
  def links: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.links, Boolean] = js.native
  inline def links_=(x: IEditorOption[links, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("links")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.matchBrackets")
  @js.native
  def matchBrackets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.matchBrackets, always | never | near] = js.native
  inline def matchBrackets_=(x: IEditorOption[matchBrackets, always | never | near]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.minimap")
  @js.native
  def minimap: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.minimap, ReadonlyRequiredIEditorMi] = js.native
  inline def minimap_=(x: IEditorOption[minimap, ReadonlyRequiredIEditorMi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimap")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.mouseStyle")
  @js.native
  def mouseStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseStyle, default | text | copy] = js.native
  inline def mouseStyle_=(x: IEditorOption[mouseStyle, default | text | copy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.mouseWheelScrollSensitivity")
  @js.native
  def mouseWheelScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, Double] = js.native
  inline def mouseWheelScrollSensitivity_=(x: IEditorOption[mouseWheelScrollSensitivity, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelScrollSensitivity")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.mouseWheelZoom")
  @js.native
  def mouseWheelZoom: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean] = js.native
  inline def mouseWheelZoom_=(x: IEditorOption[mouseWheelZoom, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorLimit")
  @js.native
  def multiCursorLimit: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorLimit, Double] = js.native
  inline def multiCursorLimit_=(x: IEditorOption[multiCursorLimit, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorLimit")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorMergeOverlapping")
  @js.native
  def multiCursorMergeOverlapping: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, Boolean] = js.native
  inline def multiCursorMergeOverlapping_=(x: IEditorOption[multiCursorMergeOverlapping, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorMergeOverlapping")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorModifier")
  @js.native
  def multiCursorModifier: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
    altKey | metaKey | ctrlKey
  ] = js.native
  inline def multiCursorModifier_=(x: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorModifier")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorPaste")
  @js.native
  def multiCursorPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full] = js.native
  inline def multiCursorPaste_=(x: IEditorOption[multiCursorPaste, spread | full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorPaste")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.occurrencesHighlight")
  @js.native
  def occurrencesHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean] = js.native
  inline def occurrencesHighlight_=(x: IEditorOption[occurrencesHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("occurrencesHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.overviewRulerBorder")
  @js.native
  def overviewRulerBorder: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean] = js.native
  inline def overviewRulerBorder_=(x: IEditorOption[overviewRulerBorder, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerBorder")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.overviewRulerLanes")
  @js.native
  def overviewRulerLanes: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double] = js.native
  inline def overviewRulerLanes_=(x: IEditorOption[overviewRulerLanes, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLanes")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.padding")
  @js.native
  def padding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.padding, ReadonlyRequiredIEditorPa] = js.native
  inline def padding_=(x: IEditorOption[padding, ReadonlyRequiredIEditorPa]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.parameterHints")
  @js.native
  def parameterHints: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.parameterHints, 
    ReadonlyRequiredIEditorPaCycle
  ] = js.native
  inline def parameterHints_=(x: IEditorOption[parameterHints, ReadonlyRequiredIEditorPaCycle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameterHints")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.peekWidgetDefaultFocus")
  @js.native
  def peekWidgetDefaultFocus: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
    tree | typings.monacoEditor.monacoEditorStrings.editor
  ] = js.native
  inline def peekWidgetDefaultFocus_=(x: IEditorOption[peekWidgetDefaultFocus, tree | typings.monacoEditor.monacoEditorStrings.editor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peekWidgetDefaultFocus")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.pixelRatio")
  @js.native
  def pixelRatio: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.pixelRatio, Double] = js.native
  inline def pixelRatio_=(x: IEditorOption[pixelRatio, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.quickSuggestions")
  @js.native
  def quickSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
    InternalQuickSuggestionsOptions
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.quickSuggestionsDelay")
  @js.native
  def quickSuggestionsDelay: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double] = js.native
  inline def quickSuggestionsDelay_=(x: IEditorOption[quickSuggestionsDelay, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestionsDelay")(x.asInstanceOf[js.Any])
  
  inline def quickSuggestions_=(x: IEditorOption[quickSuggestions, InternalQuickSuggestionsOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestions")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.readOnly")
  @js.native
  def readOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.readOnly, Boolean] = js.native
  inline def readOnly_=(x: IEditorOption[readOnly, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renameOnType")
  @js.native
  def renameOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean] = js.native
  inline def renameOnType_=(x: IEditorOption[renameOnType, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameOnType")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderControlCharacters")
  @js.native
  def renderControlCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters, Boolean] = js.native
  inline def renderControlCharacters_=(x: IEditorOption[renderControlCharacters, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderControlCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderFinalNewline")
  @js.native
  def renderFinalNewline: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline, on | off | dimmed] = js.native
  inline def renderFinalNewline_=(x: IEditorOption[renderFinalNewline, on | off | dimmed]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderFinalNewline")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderLineHighlight")
  @js.native
  def renderLineHighlight: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
    all | line | none | gutter
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderLineHighlightOnlyWhenFocus")
  @js.native
  def renderLineHighlightOnlyWhenFocus: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
    Boolean
  ] = js.native
  inline def renderLineHighlightOnlyWhenFocus_=(x: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlightOnlyWhenFocus")(x.asInstanceOf[js.Any])
  
  inline def renderLineHighlight_=(x: IEditorOption[renderLineHighlight, all | line | none | gutter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderValidationDecorations")
  @js.native
  def renderValidationDecorations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
    on | off | editable
  ] = js.native
  inline def renderValidationDecorations_=(x: IEditorOption[renderValidationDecorations, on | off | editable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderValidationDecorations")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderWhitespace")
  @js.native
  def renderWhitespace: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
    all | none | boundary | selection | trailing
  ] = js.native
  inline def renderWhitespace_=(x: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderWhitespace")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.revealHorizontalRightPadding")
  @js.native
  def revealHorizontalRightPadding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, Double] = js.native
  inline def revealHorizontalRightPadding_=(x: IEditorOption[revealHorizontalRightPadding, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revealHorizontalRightPadding")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.roundedSelection")
  @js.native
  def roundedSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean] = js.native
  inline def roundedSelection_=(x: IEditorOption[roundedSelection, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundedSelection")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.rulers")
  @js.native
  def rulers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.rulers, js.Object] = js.native
  inline def rulers_=(x: IEditorOption[rulers, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rulers")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.screenReaderAnnounceInlineSuggestion")
  @js.native
  def screenReaderAnnounceInlineSuggestion: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.screenReaderAnnounceInlineSuggestion, 
    Boolean
  ] = js.native
  inline def screenReaderAnnounceInlineSuggestion_=(x: IEditorOption[screenReaderAnnounceInlineSuggestion, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenReaderAnnounceInlineSuggestion")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollBeyondLastColumn")
  @js.native
  def scrollBeyondLastColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double] = js.native
  inline def scrollBeyondLastColumn_=(x: IEditorOption[scrollBeyondLastColumn, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastColumn")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollBeyondLastLine")
  @js.native
  def scrollBeyondLastLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean] = js.native
  inline def scrollBeyondLastLine_=(x: IEditorOption[scrollBeyondLastLine, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastLine")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollPredominantAxis")
  @js.native
  def scrollPredominantAxis: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, Boolean] = js.native
  inline def scrollPredominantAxis_=(x: IEditorOption[scrollPredominantAxis, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPredominantAxis")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollbar")
  @js.native
  def scrollbar: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.scrollbar, 
    InternalEditorScrollbarOptions
  ] = js.native
  inline def scrollbar_=(x: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.selectOnLineNumbers")
  @js.native
  def selectOnLineNumbers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean] = js.native
  inline def selectOnLineNumbers_=(x: IEditorOption[selectOnLineNumbers, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectOnLineNumbers")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.selectionClipboard")
  @js.native
  def selectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean] = js.native
  inline def selectionClipboard_=(x: IEditorOption[selectionClipboard, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionClipboard")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.selectionHighlight")
  @js.native
  def selectionHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean] = js.native
  inline def selectionHighlight_=(x: IEditorOption[selectionHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.showDeprecated")
  @js.native
  def showDeprecated: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean] = js.native
  inline def showDeprecated_=(x: IEditorOption[showDeprecated, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDeprecated")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.showFoldingControls")
  @js.native
  def showFoldingControls: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
    always | never | mouseover
  ] = js.native
  inline def showFoldingControls_=(x: IEditorOption[showFoldingControls, always | never | mouseover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showFoldingControls")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.showUnused")
  @js.native
  def showUnused: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showUnused, Boolean] = js.native
  inline def showUnused_=(x: IEditorOption[showUnused, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showUnused")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.smartSelect")
  @js.native
  def smartSelect: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.smartSelect, 
    ReadonlyRequiredISmartSel
  ] = js.native
  inline def smartSelect_=(x: IEditorOption[smartSelect, ReadonlyRequiredISmartSel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartSelect")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.smoothScrolling")
  @js.native
  def smoothScrolling: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean] = js.native
  inline def smoothScrolling_=(x: IEditorOption[smoothScrolling, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.snippetSuggestions")
  @js.native
  def snippetSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
    none | top | bottom | `inline`
  ] = js.native
  inline def snippetSuggestions_=(x: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snippetSuggestions")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.stickyScroll")
  @js.native
  def stickyScroll: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.stickyScroll, 
    ReadonlyRequiredIEditorSt
  ] = js.native
  inline def stickyScroll_=(x: IEditorOption[stickyScroll, ReadonlyRequiredIEditorSt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyScroll")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.stickyTabStops")
  @js.native
  def stickyTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stickyTabStops, Boolean] = js.native
  inline def stickyTabStops_=(x: IEditorOption[stickyTabStops, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyTabStops")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.stopRenderingLineAfter")
  @js.native
  def stopRenderingLineAfter: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double] = js.native
  inline def stopRenderingLineAfter_=(x: IEditorOption[stopRenderingLineAfter, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopRenderingLineAfter")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggest")
  @js.native
  def suggest: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggest, ReadonlyRequiredISuggestO] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestFontSize")
  @js.native
  def suggestFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double] = js.native
  inline def suggestFontSize_=(x: IEditorOption[suggestFontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestFontSize")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestLineHeight")
  @js.native
  def suggestLineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double] = js.native
  inline def suggestLineHeight_=(x: IEditorOption[suggestLineHeight, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestLineHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestOnTriggerCharacters")
  @js.native
  def suggestOnTriggerCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, Boolean] = js.native
  inline def suggestOnTriggerCharacters_=(x: IEditorOption[suggestOnTriggerCharacters, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestOnTriggerCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestSelection")
  @js.native
  def suggestSelection: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.suggestSelection, 
    first | recentlyUsed | recentlyUsedByPrefix
  ] = js.native
  inline def suggestSelection_=(x: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestSelection")(x.asInstanceOf[js.Any])
  
  inline def suggest_=(x: IEditorOption[suggest, ReadonlyRequiredISuggestO]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.tabCompletion")
  @js.native
  def tabCompletion: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.tabCompletion, 
    on | off | onlySnippets
  ] = js.native
  inline def tabCompletion_=(x: IEditorOption[tabCompletion, on | off | onlySnippets]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabCompletion")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.tabFocusMode")
  @js.native
  def tabFocusMode: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean] = js.native
  inline def tabFocusMode_=(x: IEditorOption[tabFocusMode, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabFocusMode")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.tabIndex")
  @js.native
  def tabIndex: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabIndex, Double] = js.native
  inline def tabIndex_=(x: IEditorOption[tabIndex, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.unfoldOnClickAfterEndOfLine")
  @js.native
  def unfoldOnClickAfterEndOfLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, Boolean] = js.native
  inline def unfoldOnClickAfterEndOfLine_=(x: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unfoldOnClickAfterEndOfLine")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.unicodeHighlight")
  @js.native
  def unicodeHighlight: IEditorOption[unicodeHighlighting, Any] = js.native
  inline def unicodeHighlight_=(x: IEditorOption[unicodeHighlighting, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.unusualLineTerminators")
  @js.native
  def unusualLineTerminators: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
    auto | off | prompt
  ] = js.native
  inline def unusualLineTerminators_=(x: IEditorOption[unusualLineTerminators, auto | off | prompt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unusualLineTerminators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.useShadowDOM")
  @js.native
  def useShadowDOM: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useShadowDOM, Boolean] = js.native
  inline def useShadowDOM_=(x: IEditorOption[useShadowDOM, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useShadowDOM")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.useTabStops")
  @js.native
  def useTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean] = js.native
  inline def useTabStops_=(x: IEditorOption[useTabStops, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useTabStops")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordBreak")
  @js.native
  def wordBreak: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordBreak, normal | keepAll] = js.native
  inline def wordBreak_=(x: IEditorOption[wordBreak, normal | keepAll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordBreak")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordSeparators")
  @js.native
  def wordSeparators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordSeparators, String] = js.native
  inline def wordSeparators_=(x: IEditorOption[wordSeparators, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordSeparators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrap")
  @js.native
  def wordWrap: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.wordWrap, 
    on | off | wordWrapColumn | bounded
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapBreakAfterCharacters")
  @js.native
  def wordWrapBreakAfterCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, String] = js.native
  inline def wordWrapBreakAfterCharacters_=(x: IEditorOption[wordWrapBreakAfterCharacters, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakAfterCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapBreakBeforeCharacters")
  @js.native
  def wordWrapBreakBeforeCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, String] = js.native
  inline def wordWrapBreakBeforeCharacters_=(x: IEditorOption[wordWrapBreakBeforeCharacters, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakBeforeCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapColumn")
  @js.native
  def wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double] = js.native
  inline def wordWrapColumn_=(x: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapOverride1")
  @js.native
  def wordWrapOverride1: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride1, on | off | inherit] = js.native
  inline def wordWrapOverride1_=(x: IEditorOption[wordWrapOverride1, on | off | inherit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapOverride1")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapOverride2")
  @js.native
  def wordWrapOverride2: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride2, on | off | inherit] = js.native
  inline def wordWrapOverride2_=(x: IEditorOption[wordWrapOverride2, on | off | inherit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapOverride2")(x.asInstanceOf[js.Any])
  
  inline def wordWrap_=(x: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wrappingIndent")
  @js.native
  def wrappingIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent] = js.native
  inline def wrappingIndent_=(x: IEditorOption[wrappingIndent, WrappingIndent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingIndent")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wrappingInfo")
  @js.native
  def wrappingInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingInfo, EditorWrappingInfo] = js.native
  inline def wrappingInfo_=(x: IEditorOption[wrappingInfo, EditorWrappingInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wrappingStrategy")
  @js.native
  def wrappingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy, simple | advanced] = js.native
  inline def wrappingStrategy_=(x: IEditorOption[wrappingStrategy, simple | advanced]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingStrategy")(x.asInstanceOf[js.Any])
}
