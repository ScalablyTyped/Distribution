package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.Anon_Comments
import typings.monacoDashEditor.monacoDashEditorStrings.`100`
import typings.monacoDashEditor.monacoDashEditorStrings.`200`
import typings.monacoDashEditor.monacoDashEditorStrings.`300`
import typings.monacoDashEditor.monacoDashEditorStrings.`400`
import typings.monacoDashEditor.monacoDashEditorStrings.`500`
import typings.monacoDashEditor.monacoDashEditorStrings.`600`
import typings.monacoDashEditor.monacoDashEditorStrings.`700`
import typings.monacoDashEditor.monacoDashEditorStrings.`800`
import typings.monacoDashEditor.monacoDashEditorStrings.`900`
import typings.monacoDashEditor.monacoDashEditorStrings.`inline`
import typings.monacoDashEditor.monacoDashEditorStrings.all
import typings.monacoDashEditor.monacoDashEditorStrings.alt
import typings.monacoDashEditor.monacoDashEditorStrings.always
import typings.monacoDashEditor.monacoDashEditorStrings.auto
import typings.monacoDashEditor.monacoDashEditorStrings.bold
import typings.monacoDashEditor.monacoDashEditorStrings.bolder
import typings.monacoDashEditor.monacoDashEditorStrings.bottom
import typings.monacoDashEditor.monacoDashEditorStrings.boundary
import typings.monacoDashEditor.monacoDashEditorStrings.bounded
import typings.monacoDashEditor.monacoDashEditorStrings.ctrlCmd
import typings.monacoDashEditor.monacoDashEditorStrings.first
import typings.monacoDashEditor.monacoDashEditorStrings.gutter
import typings.monacoDashEditor.monacoDashEditorStrings.indentation
import typings.monacoDashEditor.monacoDashEditorStrings.inherit
import typings.monacoDashEditor.monacoDashEditorStrings.initial
import typings.monacoDashEditor.monacoDashEditorStrings.interval
import typings.monacoDashEditor.monacoDashEditorStrings.lighter
import typings.monacoDashEditor.monacoDashEditorStrings.line
import typings.monacoDashEditor.monacoDashEditorStrings.mouseover
import typings.monacoDashEditor.monacoDashEditorStrings.none
import typings.monacoDashEditor.monacoDashEditorStrings.normal
import typings.monacoDashEditor.monacoDashEditorStrings.off
import typings.monacoDashEditor.monacoDashEditorStrings.on
import typings.monacoDashEditor.monacoDashEditorStrings.onlySnippets
import typings.monacoDashEditor.monacoDashEditorStrings.recentlyUsed
import typings.monacoDashEditor.monacoDashEditorStrings.recentlyUsedByPrefix
import typings.monacoDashEditor.monacoDashEditorStrings.relative
import typings.monacoDashEditor.monacoDashEditorStrings.selection
import typings.monacoDashEditor.monacoDashEditorStrings.smart
import typings.monacoDashEditor.monacoDashEditorStrings.top
import typings.monacoDashEditor.monacoDashEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffEditorConstructionOptions extends IDiffEditorOptions {
  /**
    * Initial theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`
    */
  var theme: js.UndefOr[String] = js.undefined
}

object IDiffEditorConstructionOptions {
  @scala.inline
  def apply(
    acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.undefined,
    acceptSuggestionOnEnter: Boolean | on | smart | off = null,
    accessibilitySupport: auto | off | on = null,
    ariaLabel: String = null,
    autoClosingBrackets: EditorAutoClosingStrategy = null,
    autoClosingOvertype: EditorAutoClosingOvertypeStrategy = null,
    autoClosingQuotes: EditorAutoClosingStrategy = null,
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    autoSurround: EditorAutoSurroundStrategy = null,
    automaticLayout: js.UndefOr[Boolean] = js.undefined,
    codeActionsOnSave: ICodeActionsOnSaveOptions = null,
    codeActionsOnSaveTimeout: Int | Double = null,
    codeLens: js.UndefOr[Boolean] = js.undefined,
    colorDecorators: js.UndefOr[Boolean] = js.undefined,
    contextmenu: js.UndefOr[Boolean] = js.undefined,
    copyWithSyntaxHighlighting: js.UndefOr[Boolean] = js.undefined,
    cursorBlinking: String = null,
    cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: String = null,
    cursorSurroundingLines: Int | Double = null,
    cursorWidth: Int | Double = null,
    disableLayerHinting: js.UndefOr[Boolean] = js.undefined,
    disableMonospaceOptimizations: js.UndefOr[Boolean] = js.undefined,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    emptySelectionClipboard: js.UndefOr[Boolean] = js.undefined,
    enableSplitViewResizing: js.UndefOr[Boolean] = js.undefined,
    extraEditorClassName: String = null,
    fastScrollSensitivity: Int | Double = null,
    find: IEditorFindOptions = null,
    fixedOverflowWidgets: js.UndefOr[Boolean] = js.undefined,
    folding: js.UndefOr[Boolean] = js.undefined,
    foldingStrategy: auto | indentation = null,
    fontFamily: String = null,
    fontLigatures: js.UndefOr[Boolean] = js.undefined,
    fontSize: Int | Double = null,
    fontWeight: normal | bold | bolder | lighter | initial | inherit | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null,
    formatOnPaste: js.UndefOr[Boolean] = js.undefined,
    formatOnType: js.UndefOr[Boolean] = js.undefined,
    glyphMargin: js.UndefOr[Boolean] = js.undefined,
    gotoLocation: IGotoLocationOptions = null,
    hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.undefined,
    highlightActiveIndentGuide: js.UndefOr[Boolean] = js.undefined,
    hover: IEditorHoverOptions = null,
    ignoreTrimWhitespace: js.UndefOr[Boolean] = js.undefined,
    letterSpacing: Int | Double = null,
    lightbulb: IEditorLightbulbOptions = null,
    lineDecorationsWidth: Double | String = null,
    lineHeight: Int | Double = null,
    lineNumbers: on | off | relative | interval | (js.Function1[/* lineNumber */ Double, String]) = null,
    lineNumbersMinChars: Int | Double = null,
    links: js.UndefOr[Boolean] = js.undefined,
    matchBrackets: js.UndefOr[Boolean] = js.undefined,
    minimap: IEditorMinimapOptions = null,
    mouseWheelScrollSensitivity: Int | Double = null,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    multiCursorMergeOverlapping: js.UndefOr[Boolean] = js.undefined,
    multiCursorModifier: ctrlCmd | alt = null,
    occurrencesHighlight: js.UndefOr[Boolean] = js.undefined,
    originalEditable: js.UndefOr[Boolean] = js.undefined,
    overviewRulerBorder: js.UndefOr[Boolean] = js.undefined,
    overviewRulerLanes: Int | Double = null,
    parameterHints: IEditorParameterHintOptions = null,
    quickSuggestions: Boolean | Anon_Comments = null,
    quickSuggestionsDelay: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderControlCharacters: js.UndefOr[Boolean] = js.undefined,
    renderFinalNewline: js.UndefOr[Boolean] = js.undefined,
    renderIndentGuides: js.UndefOr[Boolean] = js.undefined,
    renderIndicators: js.UndefOr[Boolean] = js.undefined,
    renderLineHighlight: none | gutter | line | all = null,
    renderSideBySide: js.UndefOr[Boolean] = js.undefined,
    renderWhitespace: none | boundary | selection | all = null,
    revealHorizontalRightPadding: Int | Double = null,
    roundedSelection: js.UndefOr[Boolean] = js.undefined,
    rulers: js.Array[Double] = null,
    scrollBeyondLastColumn: Int | Double = null,
    scrollBeyondLastLine: js.UndefOr[Boolean] = js.undefined,
    scrollbar: IEditorScrollbarOptions = null,
    selectOnLineNumbers: js.UndefOr[Boolean] = js.undefined,
    selectionClipboard: js.UndefOr[Boolean] = js.undefined,
    selectionHighlight: js.UndefOr[Boolean] = js.undefined,
    showFoldingControls: always | mouseover = null,
    showUnused: js.UndefOr[Boolean] = js.undefined,
    smoothScrolling: js.UndefOr[Boolean] = js.undefined,
    snippetSuggestions: top | bottom | `inline` | none = null,
    stopRenderingLineAfter: Int | Double = null,
    suggest: ISuggestOptions = null,
    suggestFontSize: Int | Double = null,
    suggestLineHeight: Int | Double = null,
    suggestOnTriggerCharacters: js.UndefOr[Boolean] = js.undefined,
    suggestSelection: first | recentlyUsed | recentlyUsedByPrefix = null,
    tabCompletion: Boolean | on | off | onlySnippets = null,
    theme: String = null,
    useTabStops: js.UndefOr[Boolean] = js.undefined,
    wordBasedSuggestions: js.UndefOr[Boolean] = js.undefined,
    wordSeparators: String = null,
    wordWrap: off | on | wordWrapColumn | bounded = null,
    wordWrapBreakAfterCharacters: String = null,
    wordWrapBreakBeforeCharacters: String = null,
    wordWrapBreakObtrusiveCharacters: String = null,
    wordWrapColumn: Int | Double = null,
    wordWrapMinified: js.UndefOr[Boolean] = js.undefined,
    wrappingIndent: String = null
  ): IDiffEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptSuggestionOnCommitCharacter)) __obj.updateDynamic("acceptSuggestionOnCommitCharacter")(acceptSuggestionOnCommitCharacter)
    if (acceptSuggestionOnEnter != null) __obj.updateDynamic("acceptSuggestionOnEnter")(acceptSuggestionOnEnter.asInstanceOf[js.Any])
    if (accessibilitySupport != null) __obj.updateDynamic("accessibilitySupport")(accessibilitySupport.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (autoClosingBrackets != null) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets)
    if (autoClosingOvertype != null) __obj.updateDynamic("autoClosingOvertype")(autoClosingOvertype)
    if (autoClosingQuotes != null) __obj.updateDynamic("autoClosingQuotes")(autoClosingQuotes)
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (autoSurround != null) __obj.updateDynamic("autoSurround")(autoSurround)
    if (!js.isUndefined(automaticLayout)) __obj.updateDynamic("automaticLayout")(automaticLayout)
    if (codeActionsOnSave != null) __obj.updateDynamic("codeActionsOnSave")(codeActionsOnSave)
    if (codeActionsOnSaveTimeout != null) __obj.updateDynamic("codeActionsOnSaveTimeout")(codeActionsOnSaveTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(codeLens)) __obj.updateDynamic("codeLens")(codeLens)
    if (!js.isUndefined(colorDecorators)) __obj.updateDynamic("colorDecorators")(colorDecorators)
    if (!js.isUndefined(contextmenu)) __obj.updateDynamic("contextmenu")(contextmenu)
    if (!js.isUndefined(copyWithSyntaxHighlighting)) __obj.updateDynamic("copyWithSyntaxHighlighting")(copyWithSyntaxHighlighting)
    if (cursorBlinking != null) __obj.updateDynamic("cursorBlinking")(cursorBlinking)
    if (!js.isUndefined(cursorSmoothCaretAnimation)) __obj.updateDynamic("cursorSmoothCaretAnimation")(cursorSmoothCaretAnimation)
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle)
    if (cursorSurroundingLines != null) __obj.updateDynamic("cursorSurroundingLines")(cursorSurroundingLines.asInstanceOf[js.Any])
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLayerHinting)) __obj.updateDynamic("disableLayerHinting")(disableLayerHinting)
    if (!js.isUndefined(disableMonospaceOptimizations)) __obj.updateDynamic("disableMonospaceOptimizations")(disableMonospaceOptimizations)
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop)
    if (!js.isUndefined(emptySelectionClipboard)) __obj.updateDynamic("emptySelectionClipboard")(emptySelectionClipboard)
    if (!js.isUndefined(enableSplitViewResizing)) __obj.updateDynamic("enableSplitViewResizing")(enableSplitViewResizing)
    if (extraEditorClassName != null) __obj.updateDynamic("extraEditorClassName")(extraEditorClassName)
    if (fastScrollSensitivity != null) __obj.updateDynamic("fastScrollSensitivity")(fastScrollSensitivity.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find)
    if (!js.isUndefined(fixedOverflowWidgets)) __obj.updateDynamic("fixedOverflowWidgets")(fixedOverflowWidgets)
    if (!js.isUndefined(folding)) __obj.updateDynamic("folding")(folding)
    if (foldingStrategy != null) __obj.updateDynamic("foldingStrategy")(foldingStrategy.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (!js.isUndefined(fontLigatures)) __obj.updateDynamic("fontLigatures")(fontLigatures)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnPaste)) __obj.updateDynamic("formatOnPaste")(formatOnPaste)
    if (!js.isUndefined(formatOnType)) __obj.updateDynamic("formatOnType")(formatOnType)
    if (!js.isUndefined(glyphMargin)) __obj.updateDynamic("glyphMargin")(glyphMargin)
    if (gotoLocation != null) __obj.updateDynamic("gotoLocation")(gotoLocation)
    if (!js.isUndefined(hideCursorInOverviewRuler)) __obj.updateDynamic("hideCursorInOverviewRuler")(hideCursorInOverviewRuler)
    if (!js.isUndefined(highlightActiveIndentGuide)) __obj.updateDynamic("highlightActiveIndentGuide")(highlightActiveIndentGuide)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (!js.isUndefined(ignoreTrimWhitespace)) __obj.updateDynamic("ignoreTrimWhitespace")(ignoreTrimWhitespace)
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightbulb != null) __obj.updateDynamic("lightbulb")(lightbulb)
    if (lineDecorationsWidth != null) __obj.updateDynamic("lineDecorationsWidth")(lineDecorationsWidth.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineNumbers != null) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (lineNumbersMinChars != null) __obj.updateDynamic("lineNumbersMinChars")(lineNumbersMinChars.asInstanceOf[js.Any])
    if (!js.isUndefined(links)) __obj.updateDynamic("links")(links)
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets)
    if (minimap != null) __obj.updateDynamic("minimap")(minimap)
    if (mouseWheelScrollSensitivity != null) __obj.updateDynamic("mouseWheelScrollSensitivity")(mouseWheelScrollSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom)
    if (!js.isUndefined(multiCursorMergeOverlapping)) __obj.updateDynamic("multiCursorMergeOverlapping")(multiCursorMergeOverlapping)
    if (multiCursorModifier != null) __obj.updateDynamic("multiCursorModifier")(multiCursorModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(occurrencesHighlight)) __obj.updateDynamic("occurrencesHighlight")(occurrencesHighlight)
    if (!js.isUndefined(originalEditable)) __obj.updateDynamic("originalEditable")(originalEditable)
    if (!js.isUndefined(overviewRulerBorder)) __obj.updateDynamic("overviewRulerBorder")(overviewRulerBorder)
    if (overviewRulerLanes != null) __obj.updateDynamic("overviewRulerLanes")(overviewRulerLanes.asInstanceOf[js.Any])
    if (parameterHints != null) __obj.updateDynamic("parameterHints")(parameterHints)
    if (quickSuggestions != null) __obj.updateDynamic("quickSuggestions")(quickSuggestions.asInstanceOf[js.Any])
    if (quickSuggestionsDelay != null) __obj.updateDynamic("quickSuggestionsDelay")(quickSuggestionsDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(renderControlCharacters)) __obj.updateDynamic("renderControlCharacters")(renderControlCharacters)
    if (!js.isUndefined(renderFinalNewline)) __obj.updateDynamic("renderFinalNewline")(renderFinalNewline)
    if (!js.isUndefined(renderIndentGuides)) __obj.updateDynamic("renderIndentGuides")(renderIndentGuides)
    if (!js.isUndefined(renderIndicators)) __obj.updateDynamic("renderIndicators")(renderIndicators)
    if (renderLineHighlight != null) __obj.updateDynamic("renderLineHighlight")(renderLineHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(renderSideBySide)) __obj.updateDynamic("renderSideBySide")(renderSideBySide)
    if (renderWhitespace != null) __obj.updateDynamic("renderWhitespace")(renderWhitespace.asInstanceOf[js.Any])
    if (revealHorizontalRightPadding != null) __obj.updateDynamic("revealHorizontalRightPadding")(revealHorizontalRightPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedSelection)) __obj.updateDynamic("roundedSelection")(roundedSelection)
    if (rulers != null) __obj.updateDynamic("rulers")(rulers)
    if (scrollBeyondLastColumn != null) __obj.updateDynamic("scrollBeyondLastColumn")(scrollBeyondLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollBeyondLastLine)) __obj.updateDynamic("scrollBeyondLastLine")(scrollBeyondLastLine)
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar)
    if (!js.isUndefined(selectOnLineNumbers)) __obj.updateDynamic("selectOnLineNumbers")(selectOnLineNumbers)
    if (!js.isUndefined(selectionClipboard)) __obj.updateDynamic("selectionClipboard")(selectionClipboard)
    if (!js.isUndefined(selectionHighlight)) __obj.updateDynamic("selectionHighlight")(selectionHighlight)
    if (showFoldingControls != null) __obj.updateDynamic("showFoldingControls")(showFoldingControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnused)) __obj.updateDynamic("showUnused")(showUnused)
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling)
    if (snippetSuggestions != null) __obj.updateDynamic("snippetSuggestions")(snippetSuggestions.asInstanceOf[js.Any])
    if (stopRenderingLineAfter != null) __obj.updateDynamic("stopRenderingLineAfter")(stopRenderingLineAfter.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(suggest)
    if (suggestFontSize != null) __obj.updateDynamic("suggestFontSize")(suggestFontSize.asInstanceOf[js.Any])
    if (suggestLineHeight != null) __obj.updateDynamic("suggestLineHeight")(suggestLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestOnTriggerCharacters)) __obj.updateDynamic("suggestOnTriggerCharacters")(suggestOnTriggerCharacters)
    if (suggestSelection != null) __obj.updateDynamic("suggestSelection")(suggestSelection.asInstanceOf[js.Any])
    if (tabCompletion != null) __obj.updateDynamic("tabCompletion")(tabCompletion.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useTabStops)) __obj.updateDynamic("useTabStops")(useTabStops)
    if (!js.isUndefined(wordBasedSuggestions)) __obj.updateDynamic("wordBasedSuggestions")(wordBasedSuggestions)
    if (wordSeparators != null) __obj.updateDynamic("wordSeparators")(wordSeparators)
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    if (wordWrapBreakAfterCharacters != null) __obj.updateDynamic("wordWrapBreakAfterCharacters")(wordWrapBreakAfterCharacters)
    if (wordWrapBreakBeforeCharacters != null) __obj.updateDynamic("wordWrapBreakBeforeCharacters")(wordWrapBreakBeforeCharacters)
    if (wordWrapBreakObtrusiveCharacters != null) __obj.updateDynamic("wordWrapBreakObtrusiveCharacters")(wordWrapBreakObtrusiveCharacters)
    if (wordWrapColumn != null) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapMinified)) __obj.updateDynamic("wordWrapMinified")(wordWrapMinified)
    if (wrappingIndent != null) __obj.updateDynamic("wrappingIndent")(wrappingIndent)
    __obj.asInstanceOf[IDiffEditorConstructionOptions]
  }
}

