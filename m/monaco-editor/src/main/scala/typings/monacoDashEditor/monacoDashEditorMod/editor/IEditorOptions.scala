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

trait IEditorOptions extends js.Object {
  /**
    * Accept suggestions on provider defined characters.
    * Defaults to true.
    */
  var acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept suggestions on ENTER.
    * Defaults to 'on'.
    */
  var acceptSuggestionOnEnter: js.UndefOr[Boolean | on | smart | off] = js.undefined
  /**
    * Configure the editor's accessibility support.
    * Defaults to 'auto'. It is best to leave this to 'auto'.
    */
  var accessibilitySupport: js.UndefOr[auto | off | on] = js.undefined
  /**
    * The aria label for the editor's textarea (when it is focused).
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Options for auto closing brackets.
    * Defaults to language defined behavior.
    */
  var autoClosingBrackets: js.UndefOr[EditorAutoClosingStrategy] = js.undefined
  /**
    * Options for typing over closing quotes or brackets.
    */
  var autoClosingOvertype: js.UndefOr[EditorAutoClosingOvertypeStrategy] = js.undefined
  /**
    * Options for auto closing quotes.
    * Defaults to language defined behavior.
    */
  var autoClosingQuotes: js.UndefOr[EditorAutoClosingStrategy] = js.undefined
  /**
    * Enable auto indentation adjustment.
    * Defaults to false.
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  /**
    * Options for auto surrounding.
    * Defaults to always allowing auto surrounding.
    */
  var autoSurround: js.UndefOr[EditorAutoSurroundStrategy] = js.undefined
  /**
    * Enable that the editor will install an interval to check if its container dom node size has changed.
    * Enabling this might have a severe performance impact.
    * Defaults to false.
    */
  var automaticLayout: js.UndefOr[Boolean] = js.undefined
  /**
    * Code action kinds to be run on save.
    */
  var codeActionsOnSave: js.UndefOr[ICodeActionsOnSaveOptions] = js.undefined
  /**
    * Timeout for running code actions on save.
    */
  var codeActionsOnSaveTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Show code lens
    * Defaults to true.
    */
  var codeLens: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable inline color decorators and color picker rendering.
    */
  var colorDecorators: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable custom contextmenu.
    * Defaults to true.
    */
  var contextmenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Syntax highlighting is copied.
    */
  var copyWithSyntaxHighlighting: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the cursor animation style, possible values are 'blink', 'smooth', 'phase', 'expand' and 'solid'.
    * Defaults to 'blink'.
    */
  var cursorBlinking: js.UndefOr[String] = js.undefined
  /**
    * Enable smooth caret animation.
    * Defaults to false.
    */
  var cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the cursor style, either 'block' or 'line'.
    * Defaults to 'line'.
    */
  var cursorStyle: js.UndefOr[String] = js.undefined
  /**
    * Controls the minimal number of visible leading and trailing lines surrounding the cursor.
    * Defaults to 0.
    */
  var cursorSurroundingLines: js.UndefOr[Double] = js.undefined
  /**
    * Control the width of the cursor when cursorStyle is set to 'line'
    */
  var cursorWidth: js.UndefOr[Double] = js.undefined
  /**
    * Disable the use of `will-change` for the editor margin and lines layers.
    * The usage of `will-change` acts as a hint for browsers to create an extra layer.
    * Defaults to false.
    */
  var disableLayerHinting: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the optimizations for monospace fonts.
    * Defaults to false.
    */
  var disableMonospaceOptimizations: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if the editor should allow to move selections via drag and drop.
    * Defaults to false.
    */
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  /**
    * Copying without a selection copies the current line.
    */
  var emptySelectionClipboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name to be added to the editor.
    */
  var extraEditorClassName: js.UndefOr[String] = js.undefined
  /**
    * FastScrolling mulitplier speed when pressing `Alt`
    * Defaults to 5.
    */
  var fastScrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * Control the behavior of the find widget.
    */
  var find: js.UndefOr[IEditorFindOptions] = js.undefined
  /**
    * Display overflow widgets as `fixed`.
    * Defaults to `false`.
    */
  var fixedOverflowWidgets: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable code folding
    * Defaults to true.
    */
  var folding: js.UndefOr[Boolean] = js.undefined
  /**
    * Selects the folding strategy. 'auto' uses the strategies contributed for the current document, 'indentation' uses the indentation based folding strategy.
    * Defaults to 'auto'.
    */
  var foldingStrategy: js.UndefOr[auto | indentation] = js.undefined
  /**
    * The font family
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Enable font ligatures.
    * Defaults to false.
    */
  var fontLigatures: js.UndefOr[Boolean] = js.undefined
  /**
    * The font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * The font weight
    */
  var fontWeight: js.UndefOr[
    normal | bold | bolder | lighter | initial | inherit | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  /**
    * Enable format on paste.
    * Defaults to false.
    */
  var formatOnPaste: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable format on type.
    * Defaults to false.
    */
  var formatOnType: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable the rendering of the glyph margin.
    * Defaults to true in vscode and to false in monaco-editor.
    */
  var glyphMargin: js.UndefOr[Boolean] = js.undefined
  /**
    *
    */
  var gotoLocation: js.UndefOr[IGotoLocationOptions] = js.undefined
  /**
    * Should the cursor be hidden in the overview ruler.
    * Defaults to false.
    */
  var hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable highlighting of the active indent guide.
    * Defaults to true.
    */
  var highlightActiveIndentGuide: js.UndefOr[Boolean] = js.undefined
  /**
    * Configure the editor's hover.
    */
  var hover: js.UndefOr[IEditorHoverOptions] = js.undefined
  /**
    * The letter spacing
    */
  var letterSpacing: js.UndefOr[Double] = js.undefined
  /**
    * Control the behavior and rendering of the code action lightbulb.
    */
  var lightbulb: js.UndefOr[IEditorLightbulbOptions] = js.undefined
  /**
    * The width reserved for line decorations (in px).
    * Line decorations are placed between line numbers and the editor content.
    * You can pass in a string in the format floating point followed by "ch". e.g. 1.3ch.
    * Defaults to 10.
    */
  var lineDecorationsWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * The line height
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  /**
    * Control the rendering of line numbers.
    * If it is a function, it will be invoked when rendering a line number and the return value will be rendered.
    * Otherwise, if it is a truey, line numbers will be rendered normally (equivalent of using an identity function).
    * Otherwise, line numbers will not be rendered.
    * Defaults to true.
    */
  var lineNumbers: js.UndefOr[on | off | relative | interval | (js.Function1[/* lineNumber */ Double, String])] = js.undefined
  /**
    * Control the width of line numbers, by reserving horizontal space for rendering at least an amount of digits.
    * Defaults to 5.
    */
  var lineNumbersMinChars: js.UndefOr[Double] = js.undefined
  /**
    * Enable detecting links and making them clickable.
    * Defaults to true.
    */
  var links: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable highlighting of matching brackets.
    * Defaults to true.
    */
  var matchBrackets: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the behavior and rendering of the minimap.
    */
  var minimap: js.UndefOr[IEditorMinimapOptions] = js.undefined
  /**
    * A multiplier to be used on the `deltaX` and `deltaY` of mouse wheel scroll events.
    * Defaults to 1.
    */
  var mouseWheelScrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * Zoom the font in the editor when using the mouse wheel in combination with holding Ctrl.
    * Defaults to false.
    */
  var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * Merge overlapping selections.
    * Defaults to true
    */
  var multiCursorMergeOverlapping: js.UndefOr[Boolean] = js.undefined
  /**
    * The modifier to be used to add multiple cursors with the mouse.
    * Defaults to 'alt'
    */
  var multiCursorModifier: js.UndefOr[ctrlCmd | alt] = js.undefined
  /**
    * Enable semantic occurrences highlight.
    * Defaults to true.
    */
  var occurrencesHighlight: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a border should be drawn around the overview ruler.
    * Defaults to `true`.
    */
  var overviewRulerBorder: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of vertical lanes the overview ruler should render.
    * Defaults to 2.
    */
  var overviewRulerLanes: js.UndefOr[Double] = js.undefined
  /**
    * Parameter hint options.
    */
  var parameterHints: js.UndefOr[IEditorParameterHintOptions] = js.undefined
  /**
    * Enable quick suggestions (shadow suggestions)
    * Defaults to true.
    */
  var quickSuggestions: js.UndefOr[Boolean | Anon_Comments] = js.undefined
  /**
    * Quick suggestions show delay (in ms)
    * Defaults to 500 (ms)
    */
  var quickSuggestionsDelay: js.UndefOr[Double] = js.undefined
  /**
    * Should the editor be read only.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable rendering of control characters.
    * Defaults to false.
    */
  var renderControlCharacters: js.UndefOr[Boolean] = js.undefined
  /**
    * Render last line number when the file ends with a newline.
    * Defaults to true.
    */
  var renderFinalNewline: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable rendering of indent guides.
    * Defaults to true.
    */
  var renderIndentGuides: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable rendering of current line highlight.
    * Defaults to all.
    */
  var renderLineHighlight: js.UndefOr[none | gutter | line | all] = js.undefined
  /**
    * Enable rendering of whitespace.
    * Defaults to none.
    */
  var renderWhitespace: js.UndefOr[none | boundary | selection | all] = js.undefined
  /**
    * When revealing the cursor, a virtual padding (px) is added to the cursor, turning it into a rectangle.
    * This virtual padding ensures that the cursor gets revealed before hitting the edge of the viewport.
    * Defaults to 30 (px).
    */
  var revealHorizontalRightPadding: js.UndefOr[Double] = js.undefined
  /**
    * Render the editor selection with rounded borders.
    * Defaults to true.
    */
  var roundedSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Render vertical lines at the specified columns.
    * Defaults to empty array.
    */
  var rulers: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Enable that scrolling can go beyond the last column by a number of columns.
    * Defaults to 5.
    */
  var scrollBeyondLastColumn: js.UndefOr[Double] = js.undefined
  /**
    * Enable that scrolling can go one screen size after the last line.
    * Defaults to true.
    */
  var scrollBeyondLastLine: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the behavior and rendering of the scrollbars.
    */
  var scrollbar: js.UndefOr[IEditorScrollbarOptions] = js.undefined
  /**
    * Should the corresponding line be selected when clicking on the line number?
    * Defaults to true.
    */
  var selectOnLineNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable Linux primary clipboard.
    * Defaults to true.
    */
  var selectionClipboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable selection highlight.
    * Defaults to true.
    */
  var selectionHighlight: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether the fold actions in the gutter stay always visible or hide unless the mouse is over the gutter.
    * Defaults to 'mouseover'.
    */
  var showFoldingControls: js.UndefOr[always | mouseover] = js.undefined
  /**
    * Controls fading out of unused variables.
    */
  var showUnused: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable that the editor animates scrolling to a position.
    * Defaults to false.
    */
  var smoothScrolling: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable snippet suggestions. Default to 'true'.
    */
  var snippetSuggestions: js.UndefOr[top | bottom | `inline` | none] = js.undefined
  /**
    * Performance guard: Stop rendering a line after x characters.
    * Defaults to 10000.
    * Use -1 to never stop rendering
    */
  var stopRenderingLineAfter: js.UndefOr[Double] = js.undefined
  /**
    * Suggest options.
    */
  var suggest: js.UndefOr[ISuggestOptions] = js.undefined
  /**
    * The font size for the suggest widget.
    * Defaults to the editor font size.
    */
  var suggestFontSize: js.UndefOr[Double] = js.undefined
  /**
    * The line height for the suggest widget.
    * Defaults to the editor line height.
    */
  var suggestLineHeight: js.UndefOr[Double] = js.undefined
  /**
    * Enable the suggestion box to pop-up on trigger characters.
    * Defaults to true.
    */
  var suggestOnTriggerCharacters: js.UndefOr[Boolean] = js.undefined
  /**
    * The history mode for suggestions.
    */
  var suggestSelection: js.UndefOr[first | recentlyUsed | recentlyUsedByPrefix] = js.undefined
  /**
    * Enable tab completion.
    */
  var tabCompletion: js.UndefOr[Boolean | on | off | onlySnippets] = js.undefined
  /**
    * Inserting and deleting whitespace follows tab stops.
    */
  var useTabStops: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable word based suggestions. Defaults to 'true'
    */
  var wordBasedSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * A string containing the word separators used when doing word navigation.
    * Defaults to `~!@#$%^&*()-=+[{]}\\|;:\'",.<>/?
    */
  var wordSeparators: js.UndefOr[String] = js.undefined
  /**
    * Control the wrapping of the editor.
    * When `wordWrap` = "off", the lines will never wrap.
    * When `wordWrap` = "on", the lines will wrap at the viewport width.
    * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
    * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
    * Defaults to "off".
    */
  var wordWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
  /**
    * Configure word wrapping characters. A break will be introduced after these characters.
    * Defaults to ' \t})]?|&,;'.
    */
  var wordWrapBreakAfterCharacters: js.UndefOr[String] = js.undefined
  /**
    * Configure word wrapping characters. A break will be introduced before these characters.
    * Defaults to '{([+'.
    */
  var wordWrapBreakBeforeCharacters: js.UndefOr[String] = js.undefined
  /**
    * Configure word wrapping characters. A break will be introduced after these characters only if no `wordWrapBreakBeforeCharacters` or `wordWrapBreakAfterCharacters` were found.
    * Defaults to '.'.
    */
  var wordWrapBreakObtrusiveCharacters: js.UndefOr[String] = js.undefined
  /**
    * Control the wrapping of the editor.
    * When `wordWrap` = "off", the lines will never wrap.
    * When `wordWrap` = "on", the lines will wrap at the viewport width.
    * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
    * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
    * Defaults to 80.
    */
  var wordWrapColumn: js.UndefOr[Double] = js.undefined
  /**
    * Force word wrapping when the text appears to be of a minified/generated file.
    * Defaults to true.
    */
  var wordWrapMinified: js.UndefOr[Boolean] = js.undefined
  /**
    * Control indentation of wrapped lines. Can be: 'none', 'same', 'indent' or 'deepIndent'.
    * Defaults to 'same' in vscode and to 'none' in monaco-editor.
    */
  var wrappingIndent: js.UndefOr[String] = js.undefined
}

object IEditorOptions {
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
    overviewRulerBorder: js.UndefOr[Boolean] = js.undefined,
    overviewRulerLanes: Int | Double = null,
    parameterHints: IEditorParameterHintOptions = null,
    quickSuggestions: Boolean | Anon_Comments = null,
    quickSuggestionsDelay: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderControlCharacters: js.UndefOr[Boolean] = js.undefined,
    renderFinalNewline: js.UndefOr[Boolean] = js.undefined,
    renderIndentGuides: js.UndefOr[Boolean] = js.undefined,
    renderLineHighlight: none | gutter | line | all = null,
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
  ): IEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptSuggestionOnCommitCharacter)) __obj.updateDynamic("acceptSuggestionOnCommitCharacter")(acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any])
    if (acceptSuggestionOnEnter != null) __obj.updateDynamic("acceptSuggestionOnEnter")(acceptSuggestionOnEnter.asInstanceOf[js.Any])
    if (accessibilitySupport != null) __obj.updateDynamic("accessibilitySupport")(accessibilitySupport.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoClosingBrackets != null) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets.asInstanceOf[js.Any])
    if (autoClosingOvertype != null) __obj.updateDynamic("autoClosingOvertype")(autoClosingOvertype.asInstanceOf[js.Any])
    if (autoClosingQuotes != null) __obj.updateDynamic("autoClosingQuotes")(autoClosingQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent.asInstanceOf[js.Any])
    if (autoSurround != null) __obj.updateDynamic("autoSurround")(autoSurround.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticLayout)) __obj.updateDynamic("automaticLayout")(automaticLayout.asInstanceOf[js.Any])
    if (codeActionsOnSave != null) __obj.updateDynamic("codeActionsOnSave")(codeActionsOnSave.asInstanceOf[js.Any])
    if (codeActionsOnSaveTimeout != null) __obj.updateDynamic("codeActionsOnSaveTimeout")(codeActionsOnSaveTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(codeLens)) __obj.updateDynamic("codeLens")(codeLens.asInstanceOf[js.Any])
    if (!js.isUndefined(colorDecorators)) __obj.updateDynamic("colorDecorators")(colorDecorators.asInstanceOf[js.Any])
    if (!js.isUndefined(contextmenu)) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (!js.isUndefined(copyWithSyntaxHighlighting)) __obj.updateDynamic("copyWithSyntaxHighlighting")(copyWithSyntaxHighlighting.asInstanceOf[js.Any])
    if (cursorBlinking != null) __obj.updateDynamic("cursorBlinking")(cursorBlinking.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorSmoothCaretAnimation)) __obj.updateDynamic("cursorSmoothCaretAnimation")(cursorSmoothCaretAnimation.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (cursorSurroundingLines != null) __obj.updateDynamic("cursorSurroundingLines")(cursorSurroundingLines.asInstanceOf[js.Any])
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLayerHinting)) __obj.updateDynamic("disableLayerHinting")(disableLayerHinting.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMonospaceOptimizations)) __obj.updateDynamic("disableMonospaceOptimizations")(disableMonospaceOptimizations.asInstanceOf[js.Any])
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(emptySelectionClipboard)) __obj.updateDynamic("emptySelectionClipboard")(emptySelectionClipboard.asInstanceOf[js.Any])
    if (extraEditorClassName != null) __obj.updateDynamic("extraEditorClassName")(extraEditorClassName.asInstanceOf[js.Any])
    if (fastScrollSensitivity != null) __obj.updateDynamic("fastScrollSensitivity")(fastScrollSensitivity.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedOverflowWidgets)) __obj.updateDynamic("fixedOverflowWidgets")(fixedOverflowWidgets.asInstanceOf[js.Any])
    if (!js.isUndefined(folding)) __obj.updateDynamic("folding")(folding.asInstanceOf[js.Any])
    if (foldingStrategy != null) __obj.updateDynamic("foldingStrategy")(foldingStrategy.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontLigatures)) __obj.updateDynamic("fontLigatures")(fontLigatures.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnPaste)) __obj.updateDynamic("formatOnPaste")(formatOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnType)) __obj.updateDynamic("formatOnType")(formatOnType.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphMargin)) __obj.updateDynamic("glyphMargin")(glyphMargin.asInstanceOf[js.Any])
    if (gotoLocation != null) __obj.updateDynamic("gotoLocation")(gotoLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursorInOverviewRuler)) __obj.updateDynamic("hideCursorInOverviewRuler")(hideCursorInOverviewRuler.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveIndentGuide)) __obj.updateDynamic("highlightActiveIndentGuide")(highlightActiveIndentGuide.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightbulb != null) __obj.updateDynamic("lightbulb")(lightbulb.asInstanceOf[js.Any])
    if (lineDecorationsWidth != null) __obj.updateDynamic("lineDecorationsWidth")(lineDecorationsWidth.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineNumbers != null) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (lineNumbersMinChars != null) __obj.updateDynamic("lineNumbersMinChars")(lineNumbersMinChars.asInstanceOf[js.Any])
    if (!js.isUndefined(links)) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (minimap != null) __obj.updateDynamic("minimap")(minimap.asInstanceOf[js.Any])
    if (mouseWheelScrollSensitivity != null) __obj.updateDynamic("mouseWheelScrollSensitivity")(mouseWheelScrollSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(multiCursorMergeOverlapping)) __obj.updateDynamic("multiCursorMergeOverlapping")(multiCursorMergeOverlapping.asInstanceOf[js.Any])
    if (multiCursorModifier != null) __obj.updateDynamic("multiCursorModifier")(multiCursorModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(occurrencesHighlight)) __obj.updateDynamic("occurrencesHighlight")(occurrencesHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(overviewRulerBorder)) __obj.updateDynamic("overviewRulerBorder")(overviewRulerBorder.asInstanceOf[js.Any])
    if (overviewRulerLanes != null) __obj.updateDynamic("overviewRulerLanes")(overviewRulerLanes.asInstanceOf[js.Any])
    if (parameterHints != null) __obj.updateDynamic("parameterHints")(parameterHints.asInstanceOf[js.Any])
    if (quickSuggestions != null) __obj.updateDynamic("quickSuggestions")(quickSuggestions.asInstanceOf[js.Any])
    if (quickSuggestionsDelay != null) __obj.updateDynamic("quickSuggestionsDelay")(quickSuggestionsDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(renderControlCharacters)) __obj.updateDynamic("renderControlCharacters")(renderControlCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFinalNewline)) __obj.updateDynamic("renderFinalNewline")(renderFinalNewline.asInstanceOf[js.Any])
    if (!js.isUndefined(renderIndentGuides)) __obj.updateDynamic("renderIndentGuides")(renderIndentGuides.asInstanceOf[js.Any])
    if (renderLineHighlight != null) __obj.updateDynamic("renderLineHighlight")(renderLineHighlight.asInstanceOf[js.Any])
    if (renderWhitespace != null) __obj.updateDynamic("renderWhitespace")(renderWhitespace.asInstanceOf[js.Any])
    if (revealHorizontalRightPadding != null) __obj.updateDynamic("revealHorizontalRightPadding")(revealHorizontalRightPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedSelection)) __obj.updateDynamic("roundedSelection")(roundedSelection.asInstanceOf[js.Any])
    if (rulers != null) __obj.updateDynamic("rulers")(rulers.asInstanceOf[js.Any])
    if (scrollBeyondLastColumn != null) __obj.updateDynamic("scrollBeyondLastColumn")(scrollBeyondLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollBeyondLastLine)) __obj.updateDynamic("scrollBeyondLastLine")(scrollBeyondLastLine.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnLineNumbers)) __obj.updateDynamic("selectOnLineNumbers")(selectOnLineNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionClipboard)) __obj.updateDynamic("selectionClipboard")(selectionClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionHighlight)) __obj.updateDynamic("selectionHighlight")(selectionHighlight.asInstanceOf[js.Any])
    if (showFoldingControls != null) __obj.updateDynamic("showFoldingControls")(showFoldingControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnused)) __obj.updateDynamic("showUnused")(showUnused.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling.asInstanceOf[js.Any])
    if (snippetSuggestions != null) __obj.updateDynamic("snippetSuggestions")(snippetSuggestions.asInstanceOf[js.Any])
    if (stopRenderingLineAfter != null) __obj.updateDynamic("stopRenderingLineAfter")(stopRenderingLineAfter.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (suggestFontSize != null) __obj.updateDynamic("suggestFontSize")(suggestFontSize.asInstanceOf[js.Any])
    if (suggestLineHeight != null) __obj.updateDynamic("suggestLineHeight")(suggestLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestOnTriggerCharacters)) __obj.updateDynamic("suggestOnTriggerCharacters")(suggestOnTriggerCharacters.asInstanceOf[js.Any])
    if (suggestSelection != null) __obj.updateDynamic("suggestSelection")(suggestSelection.asInstanceOf[js.Any])
    if (tabCompletion != null) __obj.updateDynamic("tabCompletion")(tabCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabStops)) __obj.updateDynamic("useTabStops")(useTabStops.asInstanceOf[js.Any])
    if (!js.isUndefined(wordBasedSuggestions)) __obj.updateDynamic("wordBasedSuggestions")(wordBasedSuggestions.asInstanceOf[js.Any])
    if (wordSeparators != null) __obj.updateDynamic("wordSeparators")(wordSeparators.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    if (wordWrapBreakAfterCharacters != null) __obj.updateDynamic("wordWrapBreakAfterCharacters")(wordWrapBreakAfterCharacters.asInstanceOf[js.Any])
    if (wordWrapBreakBeforeCharacters != null) __obj.updateDynamic("wordWrapBreakBeforeCharacters")(wordWrapBreakBeforeCharacters.asInstanceOf[js.Any])
    if (wordWrapBreakObtrusiveCharacters != null) __obj.updateDynamic("wordWrapBreakObtrusiveCharacters")(wordWrapBreakObtrusiveCharacters.asInstanceOf[js.Any])
    if (wordWrapColumn != null) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapMinified)) __obj.updateDynamic("wordWrapMinified")(wordWrapMinified.asInstanceOf[js.Any])
    if (wrappingIndent != null) __obj.updateDynamic("wrappingIndent")(wrappingIndent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorOptions]
  }
}

