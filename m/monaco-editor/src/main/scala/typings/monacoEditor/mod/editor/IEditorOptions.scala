package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.`block-outline`
import typings.monacoEditor.monacoEditorStrings.`inline`
import typings.monacoEditor.monacoEditorStrings.`line-thin`
import typings.monacoEditor.monacoEditorStrings.`underline-thin`
import typings.monacoEditor.monacoEditorStrings.advanced
import typings.monacoEditor.monacoEditorStrings.all
import typings.monacoEditor.monacoEditorStrings.alt
import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.blink
import typings.monacoEditor.monacoEditorStrings.block
import typings.monacoEditor.monacoEditorStrings.bottom
import typings.monacoEditor.monacoEditorStrings.boundary
import typings.monacoEditor.monacoEditorStrings.bounded
import typings.monacoEditor.monacoEditorStrings.brackets
import typings.monacoEditor.monacoEditorStrings.copy
import typings.monacoEditor.monacoEditorStrings.ctrlCmd
import typings.monacoEditor.monacoEditorStrings.deepIndent
import typings.monacoEditor.monacoEditorStrings.default
import typings.monacoEditor.monacoEditorStrings.editable
import typings.monacoEditor.monacoEditorStrings.expand
import typings.monacoEditor.monacoEditorStrings.first
import typings.monacoEditor.monacoEditorStrings.full
import typings.monacoEditor.monacoEditorStrings.gutter
import typings.monacoEditor.monacoEditorStrings.indent
import typings.monacoEditor.monacoEditorStrings.indentation
import typings.monacoEditor.monacoEditorStrings.keep
import typings.monacoEditor.monacoEditorStrings.line
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.near
import typings.monacoEditor.monacoEditorStrings.never
import typings.monacoEditor.monacoEditorStrings.none
import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.on
import typings.monacoEditor.monacoEditorStrings.onlySnippets
import typings.monacoEditor.monacoEditorStrings.phase
import typings.monacoEditor.monacoEditorStrings.prompt
import typings.monacoEditor.monacoEditorStrings.recentlyUsed
import typings.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typings.monacoEditor.monacoEditorStrings.same
import typings.monacoEditor.monacoEditorStrings.selection
import typings.monacoEditor.monacoEditorStrings.simple
import typings.monacoEditor.monacoEditorStrings.smart
import typings.monacoEditor.monacoEditorStrings.smooth
import typings.monacoEditor.monacoEditorStrings.solid
import typings.monacoEditor.monacoEditorStrings.spread
import typings.monacoEditor.monacoEditorStrings.text
import typings.monacoEditor.monacoEditorStrings.top
import typings.monacoEditor.monacoEditorStrings.trailing
import typings.monacoEditor.monacoEditorStrings.tree
import typings.monacoEditor.monacoEditorStrings.underline
import typings.monacoEditor.monacoEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorOptions extends js.Object {
  
  /**
    * Accept suggestions on provider defined characters.
    * Defaults to true.
    */
  var acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.native
  
  /**
    * Accept suggestions on ENTER.
    * Defaults to 'on'.
    */
  var acceptSuggestionOnEnter: js.UndefOr[on | smart | off] = js.native
  
  /**
    * Controls the number of lines in the editor that can be read out by a screen reader
    */
  var accessibilityPageSize: js.UndefOr[Double] = js.native
  
  /**
    * Configure the editor's accessibility support.
    * Defaults to 'auto'. It is best to leave this to 'auto'.
    */
  var accessibilitySupport: js.UndefOr[auto | off | on] = js.native
  
  /**
    * The aria label for the editor's textarea (when it is focused).
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Options for auto closing brackets.
    * Defaults to language defined behavior.
    */
  var autoClosingBrackets: js.UndefOr[EditorAutoClosingStrategy] = js.native
  
  /**
    * Options for typing over closing quotes or brackets.
    */
  var autoClosingOvertype: js.UndefOr[EditorAutoClosingOvertypeStrategy] = js.native
  
  /**
    * Options for auto closing quotes.
    * Defaults to language defined behavior.
    */
  var autoClosingQuotes: js.UndefOr[EditorAutoClosingStrategy] = js.native
  
  /**
    * Controls whether the editor should automatically adjust the indentation when users type, paste, move or indent lines.
    * Defaults to advanced.
    */
  var autoIndent: js.UndefOr[none | keep | brackets | advanced | full] = js.native
  
  /**
    * Options for auto surrounding.
    * Defaults to always allowing auto surrounding.
    */
  var autoSurround: js.UndefOr[EditorAutoSurroundStrategy] = js.native
  
  /**
    * Enable that the editor will install an interval to check if its container dom node size has changed.
    * Enabling this might have a severe performance impact.
    * Defaults to false.
    */
  var automaticLayout: js.UndefOr[Boolean] = js.native
  
  /**
    * Timeout for running code actions on save.
    */
  var codeActionsOnSaveTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Show code lens
    * Defaults to true.
    */
  var codeLens: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable inline color decorators and color picker rendering.
    */
  var colorDecorators: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable that the selection with the mouse and keys is doing column selection.
    * Defaults to false.
    */
  var columnSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Control the behaviour of comments in the editor.
    */
  var comments: js.UndefOr[IEditorCommentsOptions] = js.native
  
  /**
    * Enable custom contextmenu.
    * Defaults to true.
    */
  var contextmenu: js.UndefOr[Boolean] = js.native
  
  /**
    * Syntax highlighting is copied.
    */
  var copyWithSyntaxHighlighting: js.UndefOr[Boolean] = js.native
  
  /**
    * Control the cursor animation style, possible values are 'blink', 'smooth', 'phase', 'expand' and 'solid'.
    * Defaults to 'blink'.
    */
  var cursorBlinking: js.UndefOr[blink | smooth | phase | expand | solid] = js.native
  
  /**
    * Enable smooth caret animation.
    * Defaults to false.
    */
  var cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.native
  
  /**
    * Control the cursor style, either 'block' or 'line'.
    * Defaults to 'line'.
    */
  var cursorStyle: js.UndefOr[line | block | underline | `line-thin` | `block-outline` | `underline-thin`] = js.native
  
  /**
    * Controls the minimal number of visible leading and trailing lines surrounding the cursor.
    * Defaults to 0.
    */
  var cursorSurroundingLines: js.UndefOr[Double] = js.native
  
  /**
    * Controls when `cursorSurroundingLines` should be enforced
    * Defaults to `default`, `cursorSurroundingLines` is not enforced when cursor position is changed
    * by mouse.
    */
  var cursorSurroundingLinesStyle: js.UndefOr[default | all] = js.native
  
  /**
    * Control the width of the cursor when cursorStyle is set to 'line'
    */
  var cursorWidth: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether the definition link opens element in the peek widget.
    * Defaults to false.
    */
  var definitionLinkOpensInPeek: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the use of `transform: translate3d(0px, 0px, 0px)` for the editor margin and lines layers.
    * The usage of `transform: translate3d(0px, 0px, 0px)` acts as a hint for browsers to create an extra layer.
    * Defaults to false.
    */
  var disableLayerHinting: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the optimizations for monospace fonts.
    * Defaults to false.
    */
  var disableMonospaceOptimizations: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if the editor should allow to move selections via drag and drop.
    * Defaults to false.
    */
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  
  /**
    * Copying without a selection copies the current line.
    */
  var emptySelectionClipboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Class name to be added to the editor.
    */
  var extraEditorClassName: js.UndefOr[String] = js.native
  
  /**
    * FastScrolling mulitplier speed when pressing `Alt`
    * Defaults to 5.
    */
  var fastScrollSensitivity: js.UndefOr[Double] = js.native
  
  /**
    * Control the behavior of the find widget.
    */
  var find: js.UndefOr[IEditorFindOptions] = js.native
  
  /**
    * Display overflow widgets as `fixed`.
    * Defaults to `false`.
    */
  var fixedOverflowWidgets: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable code folding.
    * Defaults to true.
    */
  var folding: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable highlight for folded regions.
    * Defaults to true.
    */
  var foldingHighlight: js.UndefOr[Boolean] = js.native
  
  /**
    * Selects the folding strategy. 'auto' uses the strategies contributed for the current document, 'indentation' uses the indentation based folding strategy.
    * Defaults to 'auto'.
    */
  var foldingStrategy: js.UndefOr[auto | indentation] = js.native
  
  /**
    * The font family
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Enable font ligatures.
    * Defaults to false.
    */
  var fontLigatures: js.UndefOr[Boolean | String] = js.native
  
  /**
    * The font size
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * The font weight
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /**
    * Enable format on paste.
    * Defaults to false.
    */
  var formatOnPaste: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable format on type.
    * Defaults to false.
    */
  var formatOnType: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the rendering of the glyph margin.
    * Defaults to true in vscode and to false in monaco-editor.
    */
  var glyphMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    */
  var gotoLocation: js.UndefOr[IGotoLocationOptions] = js.native
  
  /**
    * Should the cursor be hidden in the overview ruler.
    * Defaults to false.
    */
  var hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable highlighting of the active indent guide.
    * Defaults to true.
    */
  var highlightActiveIndentGuide: js.UndefOr[Boolean] = js.native
  
  /**
    * Configure the editor's hover.
    */
  var hover: js.UndefOr[IEditorHoverOptions] = js.native
  
  /**
    * This editor is used inside a diff editor.
    */
  var inDiffEditor: js.UndefOr[Boolean] = js.native
  
  /**
    * The letter spacing
    */
  var letterSpacing: js.UndefOr[Double] = js.native
  
  /**
    * Control the behavior and rendering of the code action lightbulb.
    */
  var lightbulb: js.UndefOr[IEditorLightbulbOptions] = js.native
  
  /**
    * The width reserved for line decorations (in px).
    * Line decorations are placed between line numbers and the editor content.
    * You can pass in a string in the format floating point followed by "ch". e.g. 1.3ch.
    * Defaults to 10.
    */
  var lineDecorationsWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * The line height
    */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /**
    * Control the rendering of line numbers.
    * If it is a function, it will be invoked when rendering a line number and the return value will be rendered.
    * Otherwise, if it is a truey, line numbers will be rendered normally (equivalent of using an identity function).
    * Otherwise, line numbers will not be rendered.
    * Defaults to `on`.
    */
  var lineNumbers: js.UndefOr[LineNumbersType] = js.native
  
  /**
    * Control the width of line numbers, by reserving horizontal space for rendering at least an amount of digits.
    * Defaults to 5.
    */
  var lineNumbersMinChars: js.UndefOr[Double] = js.native
  
  /**
    * Enable detecting links and making them clickable.
    * Defaults to true.
    */
  var links: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable highlighting of matching brackets.
    * Defaults to 'always'.
    */
  var matchBrackets: js.UndefOr[never | near | always] = js.native
  
  /**
    * Control the behavior and rendering of the minimap.
    */
  var minimap: js.UndefOr[IEditorMinimapOptions] = js.native
  
  /**
    * Control the mouse pointer style, either 'text' or 'default' or 'copy'
    * Defaults to 'text'
    */
  var mouseStyle: js.UndefOr[text | default | copy] = js.native
  
  /**
    * A multiplier to be used on the `deltaX` and `deltaY` of mouse wheel scroll events.
    * Defaults to 1.
    */
  var mouseWheelScrollSensitivity: js.UndefOr[Double] = js.native
  
  /**
    * Zoom the font in the editor when using the mouse wheel in combination with holding Ctrl.
    * Defaults to false.
    */
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * Merge overlapping selections.
    * Defaults to true
    */
  var multiCursorMergeOverlapping: js.UndefOr[Boolean] = js.native
  
  /**
    * The modifier to be used to add multiple cursors with the mouse.
    * Defaults to 'alt'
    */
  var multiCursorModifier: js.UndefOr[ctrlCmd | alt] = js.native
  
  /**
    * Configure the behaviour when pasting a text with the line count equal to the cursor count.
    * Defaults to 'spread'.
    */
  var multiCursorPaste: js.UndefOr[spread | full] = js.native
  
  /**
    * Enable semantic occurrences highlight.
    * Defaults to true.
    */
  var occurrencesHighlight: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a border should be drawn around the overview ruler.
    * Defaults to `true`.
    */
  var overviewRulerBorder: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of vertical lanes the overview ruler should render.
    * Defaults to 3.
    */
  var overviewRulerLanes: js.UndefOr[Double] = js.native
  
  /**
    * Controls the spacing around the editor.
    */
  var padding: js.UndefOr[IEditorPaddingOptions] = js.native
  
  /**
    * Parameter hint options.
    */
  var parameterHints: js.UndefOr[IEditorParameterHintOptions] = js.native
  
  /**
    * Controls whether to focus the inline editor in the peek widget by default.
    * Defaults to false.
    */
  var peekWidgetDefaultFocus: js.UndefOr[tree | typings.monacoEditor.monacoEditorStrings.editor] = js.native
  
  /**
    * Enable quick suggestions (shadow suggestions)
    * Defaults to true.
    */
  var quickSuggestions: js.UndefOr[Boolean | IQuickSuggestionsOptions] = js.native
  
  /**
    * Quick suggestions show delay (in ms)
    * Defaults to 10 (ms)
    */
  var quickSuggestionsDelay: js.UndefOr[Double] = js.native
  
  /**
    * Should the editor be read only.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Rename matching regions on type.
    * Defaults to false.
    */
  var renameOnType: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable rendering of control characters.
    * Defaults to false.
    */
  var renderControlCharacters: js.UndefOr[Boolean] = js.native
  
  /**
    * Render last line number when the file ends with a newline.
    * Defaults to true.
    */
  var renderFinalNewline: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable rendering of indent guides.
    * Defaults to true.
    */
  var renderIndentGuides: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable rendering of current line highlight.
    * Defaults to all.
    */
  var renderLineHighlight: js.UndefOr[none | gutter | line | all] = js.native
  
  /**
    * Control if the current line highlight should be rendered only the editor is focused.
    * Defaults to false.
    */
  var renderLineHighlightOnlyWhenFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the editor render validation decorations.
    * Defaults to editable.
    */
  var renderValidationDecorations: js.UndefOr[editable | on | off] = js.native
  
  /**
    * Enable rendering of whitespace.
    * Defaults to none.
    */
  var renderWhitespace: js.UndefOr[none | boundary | selection | trailing | all] = js.native
  
  /**
    * When revealing the cursor, a virtual padding (px) is added to the cursor, turning it into a rectangle.
    * This virtual padding ensures that the cursor gets revealed before hitting the edge of the viewport.
    * Defaults to 30 (px).
    */
  var revealHorizontalRightPadding: js.UndefOr[Double] = js.native
  
  /**
    * Render the editor selection with rounded borders.
    * Defaults to true.
    */
  var roundedSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Render vertical lines at the specified columns.
    * Defaults to empty array.
    */
  var rulers: js.UndefOr[js.Array[Double | IRulerOption]] = js.native
  
  /**
    * Enable that scrolling can go beyond the last column by a number of columns.
    * Defaults to 5.
    */
  var scrollBeyondLastColumn: js.UndefOr[Double] = js.native
  
  /**
    * Enable that scrolling can go one screen size after the last line.
    * Defaults to true.
    */
  var scrollBeyondLastLine: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable that the editor scrolls only the predominant axis. Prevents horizontal drift when scrolling vertically on a trackpad.
    * Defaults to true.
    */
  var scrollPredominantAxis: js.UndefOr[Boolean] = js.native
  
  /**
    * Control the behavior and rendering of the scrollbars.
    */
  var scrollbar: js.UndefOr[IEditorScrollbarOptions] = js.native
  
  /**
    * Should the corresponding line be selected when clicking on the line number?
    * Defaults to true.
    */
  var selectOnLineNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable Linux primary clipboard.
    * Defaults to true.
    */
  var selectionClipboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable selection highlight.
    * Defaults to true.
    */
  var selectionHighlight: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls strikethrough deprecated variables.
    */
  var showDeprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether the fold actions in the gutter stay always visible or hide unless the mouse is over the gutter.
    * Defaults to 'mouseover'.
    */
  var showFoldingControls: js.UndefOr[always | mouseover] = js.native
  
  /**
    * Controls fading out of unused variables.
    */
  var showUnused: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable that the editor animates scrolling to a position.
    * Defaults to false.
    */
  var smoothScrolling: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable snippet suggestions. Default to 'true'.
    */
  var snippetSuggestions: js.UndefOr[top | bottom | `inline` | none] = js.native
  
  /**
    * Performance guard: Stop rendering a line after x characters.
    * Defaults to 10000.
    * Use -1 to never stop rendering
    */
  var stopRenderingLineAfter: js.UndefOr[Double] = js.native
  
  /**
    * Suggest options.
    */
  var suggest: js.UndefOr[ISuggestOptions] = js.native
  
  /**
    * The font size for the suggest widget.
    * Defaults to the editor font size.
    */
  var suggestFontSize: js.UndefOr[Double] = js.native
  
  /**
    * The line height for the suggest widget.
    * Defaults to the editor line height.
    */
  var suggestLineHeight: js.UndefOr[Double] = js.native
  
  /**
    * Enable the suggestion box to pop-up on trigger characters.
    * Defaults to true.
    */
  var suggestOnTriggerCharacters: js.UndefOr[Boolean] = js.native
  
  /**
    * The history mode for suggestions.
    */
  var suggestSelection: js.UndefOr[first | recentlyUsed | recentlyUsedByPrefix] = js.native
  
  /**
    * Enable tab completion.
    */
  var tabCompletion: js.UndefOr[on | off | onlySnippets] = js.native
  
  /**
    * The `tabindex` property of the editor's textarea
    */
  var tabIndex: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether clicking on the empty content after a folded line will unfold the line.
    * Defaults to false.
    */
  var unfoldOnClickAfterEndOfLine: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove unusual line terminators like LINE SEPARATOR (LS), PARAGRAPH SEPARATOR (PS).
    * Defaults to 'prompt'.
    */
  var unusualLineTerminators: js.UndefOr[off | prompt | auto] = js.native
  
  /**
    * Inserting and deleting whitespace follows tab stops.
    */
  var useTabStops: js.UndefOr[Boolean] = js.native
  
  /**
    * A string containing the word separators used when doing word navigation.
    * Defaults to `~!@#$%^&*()-=+[{]}\\|;:\'",.<>/?
    */
  var wordSeparators: js.UndefOr[String] = js.native
  
  /**
    * Control the wrapping of the editor.
    * When `wordWrap` = "off", the lines will never wrap.
    * When `wordWrap` = "on", the lines will wrap at the viewport width.
    * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
    * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
    * Defaults to "off".
    */
  var wordWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.native
  
  /**
    * Configure word wrapping characters. A break will be introduced after these characters.
    * Defaults to ' \t})]?|/&.,;¢°′″‰℃、。｡､￠，．：；？！％・･ゝゞヽヾーァィゥェォッャュョヮヵヶぁぃぅぇぉっゃゅょゎゕゖㇰㇱㇲㇳㇴㇵㇶㇷㇸㇹㇺㇻㇼㇽㇾㇿ々〻ｧｨｩｪｫｬｭｮｯｰ”〉》」』】〕）］｝｣'.
    */
  var wordWrapBreakAfterCharacters: js.UndefOr[String] = js.native
  
  /**
    * Configure word wrapping characters. A break will be introduced before these characters.
    * Defaults to '([{‘“〈《「『【〔（［｛｢£¥＄￡￥+＋'.
    */
  var wordWrapBreakBeforeCharacters: js.UndefOr[String] = js.native
  
  /**
    * Control the wrapping of the editor.
    * When `wordWrap` = "off", the lines will never wrap.
    * When `wordWrap` = "on", the lines will wrap at the viewport width.
    * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
    * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
    * Defaults to 80.
    */
  var wordWrapColumn: js.UndefOr[Double] = js.native
  
  /**
    * Force word wrapping when the text appears to be of a minified/generated file.
    * Defaults to true.
    */
  var wordWrapMinified: js.UndefOr[Boolean] = js.native
  
  /**
    * Control indentation of wrapped lines. Can be: 'none', 'same', 'indent' or 'deepIndent'.
    * Defaults to 'same' in vscode and to 'none' in monaco-editor.
    */
  var wrappingIndent: js.UndefOr[none | same | indent | deepIndent] = js.native
  
  /**
    * Controls the wrapping strategy to use.
    * Defaults to 'simple'.
    */
  var wrappingStrategy: js.UndefOr[simple | advanced] = js.native
}
object IEditorOptions {
  
  @scala.inline
  def apply(): IEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorOptions]
  }
  
  @scala.inline
  implicit class IEditorOptionsOps[Self <: IEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptSuggestionOnCommitCharacter(value: Boolean): Self = this.set("acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptSuggestionOnCommitCharacter: Self = this.set("acceptSuggestionOnCommitCharacter", js.undefined)
    
    @scala.inline
    def setAcceptSuggestionOnEnter(value: on | smart | off): Self = this.set("acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptSuggestionOnEnter: Self = this.set("acceptSuggestionOnEnter", js.undefined)
    
    @scala.inline
    def setAccessibilityPageSize(value: Double): Self = this.set("accessibilityPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityPageSize: Self = this.set("accessibilityPageSize", js.undefined)
    
    @scala.inline
    def setAccessibilitySupport(value: auto | off | on): Self = this.set("accessibilitySupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilitySupport: Self = this.set("accessibilitySupport", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAutoClosingBrackets(value: EditorAutoClosingStrategy): Self = this.set("autoClosingBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClosingBrackets: Self = this.set("autoClosingBrackets", js.undefined)
    
    @scala.inline
    def setAutoClosingOvertype(value: EditorAutoClosingOvertypeStrategy): Self = this.set("autoClosingOvertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClosingOvertype: Self = this.set("autoClosingOvertype", js.undefined)
    
    @scala.inline
    def setAutoClosingQuotes(value: EditorAutoClosingStrategy): Self = this.set("autoClosingQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClosingQuotes: Self = this.set("autoClosingQuotes", js.undefined)
    
    @scala.inline
    def setAutoIndent(value: none | keep | brackets | advanced | full): Self = this.set("autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIndent: Self = this.set("autoIndent", js.undefined)
    
    @scala.inline
    def setAutoSurround(value: EditorAutoSurroundStrategy): Self = this.set("autoSurround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSurround: Self = this.set("autoSurround", js.undefined)
    
    @scala.inline
    def setAutomaticLayout(value: Boolean): Self = this.set("automaticLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticLayout: Self = this.set("automaticLayout", js.undefined)
    
    @scala.inline
    def setCodeActionsOnSaveTimeout(value: Double): Self = this.set("codeActionsOnSaveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeActionsOnSaveTimeout: Self = this.set("codeActionsOnSaveTimeout", js.undefined)
    
    @scala.inline
    def setCodeLens(value: Boolean): Self = this.set("codeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeLens: Self = this.set("codeLens", js.undefined)
    
    @scala.inline
    def setColorDecorators(value: Boolean): Self = this.set("colorDecorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorDecorators: Self = this.set("colorDecorators", js.undefined)
    
    @scala.inline
    def setColumnSelection(value: Boolean): Self = this.set("columnSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSelection: Self = this.set("columnSelection", js.undefined)
    
    @scala.inline
    def setComments(value: IEditorCommentsOptions): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setContextmenu(value: Boolean): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setCopyWithSyntaxHighlighting(value: Boolean): Self = this.set("copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyWithSyntaxHighlighting: Self = this.set("copyWithSyntaxHighlighting", js.undefined)
    
    @scala.inline
    def setCursorBlinking(value: blink | smooth | phase | expand | solid): Self = this.set("cursorBlinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorBlinking: Self = this.set("cursorBlinking", js.undefined)
    
    @scala.inline
    def setCursorSmoothCaretAnimation(value: Boolean): Self = this.set("cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorSmoothCaretAnimation: Self = this.set("cursorSmoothCaretAnimation", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: line | block | underline | `line-thin` | `block-outline` | `underline-thin`): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorStyle: Self = this.set("cursorStyle", js.undefined)
    
    @scala.inline
    def setCursorSurroundingLines(value: Double): Self = this.set("cursorSurroundingLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorSurroundingLines: Self = this.set("cursorSurroundingLines", js.undefined)
    
    @scala.inline
    def setCursorSurroundingLinesStyle(value: default | all): Self = this.set("cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorSurroundingLinesStyle: Self = this.set("cursorSurroundingLinesStyle", js.undefined)
    
    @scala.inline
    def setCursorWidth(value: Double): Self = this.set("cursorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorWidth: Self = this.set("cursorWidth", js.undefined)
    
    @scala.inline
    def setDefinitionLinkOpensInPeek(value: Boolean): Self = this.set("definitionLinkOpensInPeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionLinkOpensInPeek: Self = this.set("definitionLinkOpensInPeek", js.undefined)
    
    @scala.inline
    def setDisableLayerHinting(value: Boolean): Self = this.set("disableLayerHinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLayerHinting: Self = this.set("disableLayerHinting", js.undefined)
    
    @scala.inline
    def setDisableMonospaceOptimizations(value: Boolean): Self = this.set("disableMonospaceOptimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMonospaceOptimizations: Self = this.set("disableMonospaceOptimizations", js.undefined)
    
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = this.set("dragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragAndDrop: Self = this.set("dragAndDrop", js.undefined)
    
    @scala.inline
    def setEmptySelectionClipboard(value: Boolean): Self = this.set("emptySelectionClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptySelectionClipboard: Self = this.set("emptySelectionClipboard", js.undefined)
    
    @scala.inline
    def setExtraEditorClassName(value: String): Self = this.set("extraEditorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraEditorClassName: Self = this.set("extraEditorClassName", js.undefined)
    
    @scala.inline
    def setFastScrollSensitivity(value: Double): Self = this.set("fastScrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastScrollSensitivity: Self = this.set("fastScrollSensitivity", js.undefined)
    
    @scala.inline
    def setFind(value: IEditorFindOptions): Self = this.set("find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setFixedOverflowWidgets(value: Boolean): Self = this.set("fixedOverflowWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedOverflowWidgets: Self = this.set("fixedOverflowWidgets", js.undefined)
    
    @scala.inline
    def setFolding(value: Boolean): Self = this.set("folding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolding: Self = this.set("folding", js.undefined)
    
    @scala.inline
    def setFoldingHighlight(value: Boolean): Self = this.set("foldingHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldingHighlight: Self = this.set("foldingHighlight", js.undefined)
    
    @scala.inline
    def setFoldingStrategy(value: auto | indentation): Self = this.set("foldingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldingStrategy: Self = this.set("foldingStrategy", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontLigatures(value: Boolean | String): Self = this.set("fontLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontLigatures: Self = this.set("fontLigatures", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setFormatOnPaste(value: Boolean): Self = this.set("formatOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOnPaste: Self = this.set("formatOnPaste", js.undefined)
    
    @scala.inline
    def setFormatOnType(value: Boolean): Self = this.set("formatOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOnType: Self = this.set("formatOnType", js.undefined)
    
    @scala.inline
    def setGlyphMargin(value: Boolean): Self = this.set("glyphMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphMargin: Self = this.set("glyphMargin", js.undefined)
    
    @scala.inline
    def setGotoLocation(value: IGotoLocationOptions): Self = this.set("gotoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGotoLocation: Self = this.set("gotoLocation", js.undefined)
    
    @scala.inline
    def setHideCursorInOverviewRuler(value: Boolean): Self = this.set("hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideCursorInOverviewRuler: Self = this.set("hideCursorInOverviewRuler", js.undefined)
    
    @scala.inline
    def setHighlightActiveIndentGuide(value: Boolean): Self = this.set("highlightActiveIndentGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightActiveIndentGuide: Self = this.set("highlightActiveIndentGuide", js.undefined)
    
    @scala.inline
    def setHover(value: IEditorHoverOptions): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setInDiffEditor(value: Boolean): Self = this.set("inDiffEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInDiffEditor: Self = this.set("inDiffEditor", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLightbulb(value: IEditorLightbulbOptions): Self = this.set("lightbulb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightbulb: Self = this.set("lightbulb", js.undefined)
    
    @scala.inline
    def setLineDecorationsWidth(value: Double | String): Self = this.set("lineDecorationsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDecorationsWidth: Self = this.set("lineDecorationsWidth", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLineNumbersFunction1(value: /* lineNumber */ Double => String): Self = this.set("lineNumbers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLineNumbers(value: LineNumbersType): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    
    @scala.inline
    def setLineNumbersMinChars(value: Double): Self = this.set("lineNumbersMinChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumbersMinChars: Self = this.set("lineNumbersMinChars", js.undefined)
    
    @scala.inline
    def setLinks(value: Boolean): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setMatchBrackets(value: never | near | always): Self = this.set("matchBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBrackets: Self = this.set("matchBrackets", js.undefined)
    
    @scala.inline
    def setMinimap(value: IEditorMinimapOptions): Self = this.set("minimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimap: Self = this.set("minimap", js.undefined)
    
    @scala.inline
    def setMouseStyle(value: text | default | copy): Self = this.set("mouseStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseStyle: Self = this.set("mouseStyle", js.undefined)
    
    @scala.inline
    def setMouseWheelScrollSensitivity(value: Double): Self = this.set("mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelScrollSensitivity: Self = this.set("mouseWheelScrollSensitivity", js.undefined)
    
    @scala.inline
    def setMouseWheelZoom(value: Boolean): Self = this.set("mouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelZoom: Self = this.set("mouseWheelZoom", js.undefined)
    
    @scala.inline
    def setMultiCursorMergeOverlapping(value: Boolean): Self = this.set("multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiCursorMergeOverlapping: Self = this.set("multiCursorMergeOverlapping", js.undefined)
    
    @scala.inline
    def setMultiCursorModifier(value: ctrlCmd | alt): Self = this.set("multiCursorModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiCursorModifier: Self = this.set("multiCursorModifier", js.undefined)
    
    @scala.inline
    def setMultiCursorPaste(value: spread | full): Self = this.set("multiCursorPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiCursorPaste: Self = this.set("multiCursorPaste", js.undefined)
    
    @scala.inline
    def setOccurrencesHighlight(value: Boolean): Self = this.set("occurrencesHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrencesHighlight: Self = this.set("occurrencesHighlight", js.undefined)
    
    @scala.inline
    def setOverviewRulerBorder(value: Boolean): Self = this.set("overviewRulerBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverviewRulerBorder: Self = this.set("overviewRulerBorder", js.undefined)
    
    @scala.inline
    def setOverviewRulerLanes(value: Double): Self = this.set("overviewRulerLanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverviewRulerLanes: Self = this.set("overviewRulerLanes", js.undefined)
    
    @scala.inline
    def setPadding(value: IEditorPaddingOptions): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setParameterHints(value: IEditorParameterHintOptions): Self = this.set("parameterHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterHints: Self = this.set("parameterHints", js.undefined)
    
    @scala.inline
    def setPeekWidgetDefaultFocus(value: tree | typings.monacoEditor.monacoEditorStrings.editor): Self = this.set("peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeekWidgetDefaultFocus: Self = this.set("peekWidgetDefaultFocus", js.undefined)
    
    @scala.inline
    def setQuickSuggestions(value: Boolean | IQuickSuggestionsOptions): Self = this.set("quickSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSuggestions: Self = this.set("quickSuggestions", js.undefined)
    
    @scala.inline
    def setQuickSuggestionsDelay(value: Double): Self = this.set("quickSuggestionsDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSuggestionsDelay: Self = this.set("quickSuggestionsDelay", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRenameOnType(value: Boolean): Self = this.set("renameOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameOnType: Self = this.set("renameOnType", js.undefined)
    
    @scala.inline
    def setRenderControlCharacters(value: Boolean): Self = this.set("renderControlCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderControlCharacters: Self = this.set("renderControlCharacters", js.undefined)
    
    @scala.inline
    def setRenderFinalNewline(value: Boolean): Self = this.set("renderFinalNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFinalNewline: Self = this.set("renderFinalNewline", js.undefined)
    
    @scala.inline
    def setRenderIndentGuides(value: Boolean): Self = this.set("renderIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderIndentGuides: Self = this.set("renderIndentGuides", js.undefined)
    
    @scala.inline
    def setRenderLineHighlight(value: none | gutter | line | all): Self = this.set("renderLineHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderLineHighlight: Self = this.set("renderLineHighlight", js.undefined)
    
    @scala.inline
    def setRenderLineHighlightOnlyWhenFocus(value: Boolean): Self = this.set("renderLineHighlightOnlyWhenFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderLineHighlightOnlyWhenFocus: Self = this.set("renderLineHighlightOnlyWhenFocus", js.undefined)
    
    @scala.inline
    def setRenderValidationDecorations(value: editable | on | off): Self = this.set("renderValidationDecorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderValidationDecorations: Self = this.set("renderValidationDecorations", js.undefined)
    
    @scala.inline
    def setRenderWhitespace(value: none | boundary | selection | trailing | all): Self = this.set("renderWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderWhitespace: Self = this.set("renderWhitespace", js.undefined)
    
    @scala.inline
    def setRevealHorizontalRightPadding(value: Double): Self = this.set("revealHorizontalRightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevealHorizontalRightPadding: Self = this.set("revealHorizontalRightPadding", js.undefined)
    
    @scala.inline
    def setRoundedSelection(value: Boolean): Self = this.set("roundedSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundedSelection: Self = this.set("roundedSelection", js.undefined)
    
    @scala.inline
    def setRulersVarargs(value: (Double | IRulerOption)*): Self = this.set("rulers", js.Array(value :_*))
    
    @scala.inline
    def setRulers(value: js.Array[Double | IRulerOption]): Self = this.set("rulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulers: Self = this.set("rulers", js.undefined)
    
    @scala.inline
    def setScrollBeyondLastColumn(value: Double): Self = this.set("scrollBeyondLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollBeyondLastColumn: Self = this.set("scrollBeyondLastColumn", js.undefined)
    
    @scala.inline
    def setScrollBeyondLastLine(value: Boolean): Self = this.set("scrollBeyondLastLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollBeyondLastLine: Self = this.set("scrollBeyondLastLine", js.undefined)
    
    @scala.inline
    def setScrollPredominantAxis(value: Boolean): Self = this.set("scrollPredominantAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPredominantAxis: Self = this.set("scrollPredominantAxis", js.undefined)
    
    @scala.inline
    def setScrollbar(value: IEditorScrollbarOptions): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    
    @scala.inline
    def setSelectOnLineNumbers(value: Boolean): Self = this.set("selectOnLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnLineNumbers: Self = this.set("selectOnLineNumbers", js.undefined)
    
    @scala.inline
    def setSelectionClipboard(value: Boolean): Self = this.set("selectionClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionClipboard: Self = this.set("selectionClipboard", js.undefined)
    
    @scala.inline
    def setSelectionHighlight(value: Boolean): Self = this.set("selectionHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionHighlight: Self = this.set("selectionHighlight", js.undefined)
    
    @scala.inline
    def setShowDeprecated(value: Boolean): Self = this.set("showDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeprecated: Self = this.set("showDeprecated", js.undefined)
    
    @scala.inline
    def setShowFoldingControls(value: always | mouseover): Self = this.set("showFoldingControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFoldingControls: Self = this.set("showFoldingControls", js.undefined)
    
    @scala.inline
    def setShowUnused(value: Boolean): Self = this.set("showUnused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUnused: Self = this.set("showUnused", js.undefined)
    
    @scala.inline
    def setSmoothScrolling(value: Boolean): Self = this.set("smoothScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothScrolling: Self = this.set("smoothScrolling", js.undefined)
    
    @scala.inline
    def setSnippetSuggestions(value: top | bottom | `inline` | none): Self = this.set("snippetSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetSuggestions: Self = this.set("snippetSuggestions", js.undefined)
    
    @scala.inline
    def setStopRenderingLineAfter(value: Double): Self = this.set("stopRenderingLineAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopRenderingLineAfter: Self = this.set("stopRenderingLineAfter", js.undefined)
    
    @scala.inline
    def setSuggest(value: ISuggestOptions): Self = this.set("suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    
    @scala.inline
    def setSuggestFontSize(value: Double): Self = this.set("suggestFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestFontSize: Self = this.set("suggestFontSize", js.undefined)
    
    @scala.inline
    def setSuggestLineHeight(value: Double): Self = this.set("suggestLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestLineHeight: Self = this.set("suggestLineHeight", js.undefined)
    
    @scala.inline
    def setSuggestOnTriggerCharacters(value: Boolean): Self = this.set("suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestOnTriggerCharacters: Self = this.set("suggestOnTriggerCharacters", js.undefined)
    
    @scala.inline
    def setSuggestSelection(value: first | recentlyUsed | recentlyUsedByPrefix): Self = this.set("suggestSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestSelection: Self = this.set("suggestSelection", js.undefined)
    
    @scala.inline
    def setTabCompletion(value: on | off | onlySnippets): Self = this.set("tabCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabCompletion: Self = this.set("tabCompletion", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setUnfoldOnClickAfterEndOfLine(value: Boolean): Self = this.set("unfoldOnClickAfterEndOfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnfoldOnClickAfterEndOfLine: Self = this.set("unfoldOnClickAfterEndOfLine", js.undefined)
    
    @scala.inline
    def setUnusualLineTerminators(value: off | prompt | auto): Self = this.set("unusualLineTerminators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnusualLineTerminators: Self = this.set("unusualLineTerminators", js.undefined)
    
    @scala.inline
    def setUseTabStops(value: Boolean): Self = this.set("useTabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTabStops: Self = this.set("useTabStops", js.undefined)
    
    @scala.inline
    def setWordSeparators(value: String): Self = this.set("wordSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSeparators: Self = this.set("wordSeparators", js.undefined)
    
    @scala.inline
    def setWordWrap(value: off | on | wordWrapColumn | bounded): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
    
    @scala.inline
    def setWordWrapBreakAfterCharacters(value: String): Self = this.set("wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapBreakAfterCharacters: Self = this.set("wordWrapBreakAfterCharacters", js.undefined)
    
    @scala.inline
    def setWordWrapBreakBeforeCharacters(value: String): Self = this.set("wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapBreakBeforeCharacters: Self = this.set("wordWrapBreakBeforeCharacters", js.undefined)
    
    @scala.inline
    def setWordWrapColumn(value: Double): Self = this.set("wordWrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapColumn: Self = this.set("wordWrapColumn", js.undefined)
    
    @scala.inline
    def setWordWrapMinified(value: Boolean): Self = this.set("wordWrapMinified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapMinified: Self = this.set("wordWrapMinified", js.undefined)
    
    @scala.inline
    def setWrappingIndent(value: none | same | indent | deepIndent): Self = this.set("wrappingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrappingIndent: Self = this.set("wrappingIndent", js.undefined)
    
    @scala.inline
    def setWrappingStrategy(value: simple | advanced): Self = this.set("wrappingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrappingStrategy: Self = this.set("wrappingStrategy", js.undefined)
  }
}
