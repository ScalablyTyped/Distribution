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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorOptions extends StObject {
  
  /**
    * Accept suggestions on provider defined characters.
    * Defaults to true.
    */
  var acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Accept suggestions on ENTER.
    * Defaults to 'on'.
    */
  var acceptSuggestionOnEnter: js.UndefOr[on | smart | off] = js.undefined
  
  /**
    * Controls the number of lines in the editor that can be read out by a screen reader
    */
  var accessibilityPageSize: js.UndefOr[Double] = js.undefined
  
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
    * Controls whether the editor should automatically adjust the indentation when users type, paste, move or indent lines.
    * Defaults to advanced.
    */
  var autoIndent: js.UndefOr[none | keep | brackets | advanced | full] = js.undefined
  
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
    * Enable that the selection with the mouse and keys is doing column selection.
    * Defaults to false.
    */
  var columnSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control the behaviour of comments in the editor.
    */
  var comments: js.UndefOr[IEditorCommentsOptions] = js.undefined
  
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
  var cursorBlinking: js.UndefOr[blink | smooth | phase | expand | solid] = js.undefined
  
  /**
    * Enable smooth caret animation.
    * Defaults to false.
    */
  var cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control the cursor style, either 'block' or 'line'.
    * Defaults to 'line'.
    */
  var cursorStyle: js.UndefOr[line | block | underline | `line-thin` | `block-outline` | `underline-thin`] = js.undefined
  
  /**
    * Controls the minimal number of visible leading and trailing lines surrounding the cursor.
    * Defaults to 0.
    */
  var cursorSurroundingLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls when `cursorSurroundingLines` should be enforced
    * Defaults to `default`, `cursorSurroundingLines` is not enforced when cursor position is changed
    * by mouse.
    */
  var cursorSurroundingLinesStyle: js.UndefOr[default | all] = js.undefined
  
  /**
    * Control the width of the cursor when cursorStyle is set to 'line'
    */
  var cursorWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the definition link opens element in the peek widget.
    * Defaults to false.
    */
  var definitionLinkOpensInPeek: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the use of `transform: translate3d(0px, 0px, 0px)` for the editor margin and lines layers.
    * The usage of `transform: translate3d(0px, 0px, 0px)` acts as a hint for browsers to create an extra layer.
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
    * Enable code folding.
    * Defaults to true.
    */
  var folding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable highlight for folded regions.
    * Defaults to true.
    */
  var foldingHighlight: js.UndefOr[Boolean] = js.undefined
  
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
  var fontLigatures: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * The font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The font weight
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
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
    * This editor is used inside a diff editor.
    */
  var inDiffEditor: js.UndefOr[Boolean] = js.undefined
  
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
    * Defaults to `on`.
    */
  var lineNumbers: js.UndefOr[LineNumbersType] = js.undefined
  
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
    * Defaults to 'always'.
    */
  var matchBrackets: js.UndefOr[never | near | always] = js.undefined
  
  /**
    * Control the behavior and rendering of the minimap.
    */
  var minimap: js.UndefOr[IEditorMinimapOptions] = js.undefined
  
  /**
    * Control the mouse pointer style, either 'text' or 'default' or 'copy'
    * Defaults to 'text'
    */
  var mouseStyle: js.UndefOr[text | default | copy] = js.undefined
  
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
    * Configure the behaviour when pasting a text with the line count equal to the cursor count.
    * Defaults to 'spread'.
    */
  var multiCursorPaste: js.UndefOr[spread | full] = js.undefined
  
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
    * Defaults to 3.
    */
  var overviewRulerLanes: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the spacing around the editor.
    */
  var padding: js.UndefOr[IEditorPaddingOptions] = js.undefined
  
  /**
    * Parameter hint options.
    */
  var parameterHints: js.UndefOr[IEditorParameterHintOptions] = js.undefined
  
  /**
    * Controls whether to focus the inline editor in the peek widget by default.
    * Defaults to false.
    */
  var peekWidgetDefaultFocus: js.UndefOr[tree | typings.monacoEditor.monacoEditorStrings.editor] = js.undefined
  
  /**
    * Enable quick suggestions (shadow suggestions)
    * Defaults to true.
    */
  var quickSuggestions: js.UndefOr[Boolean | IQuickSuggestionsOptions] = js.undefined
  
  /**
    * Quick suggestions show delay (in ms)
    * Defaults to 10 (ms)
    */
  var quickSuggestionsDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Should the editor be read only.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Rename matching regions on type.
    * Defaults to false.
    */
  var renameOnType: js.UndefOr[Boolean] = js.undefined
  
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
    * Control if the current line highlight should be rendered only the editor is focused.
    * Defaults to false.
    */
  var renderLineHighlightOnlyWhenFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the editor render validation decorations.
    * Defaults to editable.
    */
  var renderValidationDecorations: js.UndefOr[editable | on | off] = js.undefined
  
  /**
    * Enable rendering of whitespace.
    * Defaults to none.
    */
  var renderWhitespace: js.UndefOr[none | boundary | selection | trailing | all] = js.undefined
  
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
  var rulers: js.UndefOr[js.Array[Double | IRulerOption]] = js.undefined
  
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
    * Enable that the editor scrolls only the predominant axis. Prevents horizontal drift when scrolling vertically on a trackpad.
    * Defaults to true.
    */
  var scrollPredominantAxis: js.UndefOr[Boolean] = js.undefined
  
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
    * Controls strikethrough deprecated variables.
    */
  var showDeprecated: js.UndefOr[Boolean] = js.undefined
  
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
  var tabCompletion: js.UndefOr[on | off | onlySnippets] = js.undefined
  
  /**
    * The `tabindex` property of the editor's textarea
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether clicking on the empty content after a folded line will unfold the line.
    * Defaults to false.
    */
  var unfoldOnClickAfterEndOfLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove unusual line terminators like LINE SEPARATOR (LS), PARAGRAPH SEPARATOR (PS).
    * Defaults to 'prompt'.
    */
  var unusualLineTerminators: js.UndefOr[off | prompt | auto] = js.undefined
  
  /**
    * Inserting and deleting whitespace follows tab stops.
    */
  var useTabStops: js.UndefOr[Boolean] = js.undefined
  
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
    * Defaults to ' \t})]?|/&.,;¢°′″‰℃、。｡､￠，．：；？！％・･ゝゞヽヾーァィゥェォッャュョヮヵヶぁぃぅぇぉっゃゅょゎゕゖㇰㇱㇲㇳㇴㇵㇶㇷㇸㇹㇺㇻㇼㇽㇾㇿ々〻ｧｨｩｪｫｬｭｮｯｰ”〉》」』】〕）］｝｣'.
    */
  var wordWrapBreakAfterCharacters: js.UndefOr[String] = js.undefined
  
  /**
    * Configure word wrapping characters. A break will be introduced before these characters.
    * Defaults to '([{‘“〈《「『【〔（［｛｢£¥＄￡￥+＋'.
    */
  var wordWrapBreakBeforeCharacters: js.UndefOr[String] = js.undefined
  
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
  var wrappingIndent: js.UndefOr[none | same | indent | deepIndent] = js.undefined
  
  /**
    * Controls the wrapping strategy to use.
    * Defaults to 'simple'.
    */
  var wrappingStrategy: js.UndefOr[simple | advanced] = js.undefined
}
object IEditorOptions {
  
  @scala.inline
  def apply(): IEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorOptions]
  }
  
  @scala.inline
  implicit class IEditorOptionsMutableBuilder[Self <: IEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptSuggestionOnCommitCharacter(value: Boolean): Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptSuggestionOnCommitCharacterUndefined: Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", js.undefined)
    
    @scala.inline
    def setAcceptSuggestionOnEnter(value: on | smart | off): Self = StObject.set(x, "acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptSuggestionOnEnterUndefined: Self = StObject.set(x, "acceptSuggestionOnEnter", js.undefined)
    
    @scala.inline
    def setAccessibilityPageSize(value: Double): Self = StObject.set(x, "accessibilityPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityPageSizeUndefined: Self = StObject.set(x, "accessibilityPageSize", js.undefined)
    
    @scala.inline
    def setAccessibilitySupport(value: auto | off | on): Self = StObject.set(x, "accessibilitySupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilitySupportUndefined: Self = StObject.set(x, "accessibilitySupport", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setAutoClosingBrackets(value: EditorAutoClosingStrategy): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
    
    @scala.inline
    def setAutoClosingOvertype(value: EditorAutoClosingOvertypeStrategy): Self = StObject.set(x, "autoClosingOvertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClosingOvertypeUndefined: Self = StObject.set(x, "autoClosingOvertype", js.undefined)
    
    @scala.inline
    def setAutoClosingQuotes(value: EditorAutoClosingStrategy): Self = StObject.set(x, "autoClosingQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClosingQuotesUndefined: Self = StObject.set(x, "autoClosingQuotes", js.undefined)
    
    @scala.inline
    def setAutoIndent(value: none | keep | brackets | advanced | full): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    @scala.inline
    def setAutoSurround(value: EditorAutoSurroundStrategy): Self = StObject.set(x, "autoSurround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSurroundUndefined: Self = StObject.set(x, "autoSurround", js.undefined)
    
    @scala.inline
    def setAutomaticLayout(value: Boolean): Self = StObject.set(x, "automaticLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticLayoutUndefined: Self = StObject.set(x, "automaticLayout", js.undefined)
    
    @scala.inline
    def setCodeActionsOnSaveTimeout(value: Double): Self = StObject.set(x, "codeActionsOnSaveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionsOnSaveTimeoutUndefined: Self = StObject.set(x, "codeActionsOnSaveTimeout", js.undefined)
    
    @scala.inline
    def setCodeLens(value: Boolean): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeLensUndefined: Self = StObject.set(x, "codeLens", js.undefined)
    
    @scala.inline
    def setColorDecorators(value: Boolean): Self = StObject.set(x, "colorDecorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDecoratorsUndefined: Self = StObject.set(x, "colorDecorators", js.undefined)
    
    @scala.inline
    def setColumnSelection(value: Boolean): Self = StObject.set(x, "columnSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSelectionUndefined: Self = StObject.set(x, "columnSelection", js.undefined)
    
    @scala.inline
    def setComments(value: IEditorCommentsOptions): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setContextmenu(value: Boolean): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    @scala.inline
    def setCopyWithSyntaxHighlighting(value: Boolean): Self = StObject.set(x, "copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyWithSyntaxHighlightingUndefined: Self = StObject.set(x, "copyWithSyntaxHighlighting", js.undefined)
    
    @scala.inline
    def setCursorBlinking(value: blink | smooth | phase | expand | solid): Self = StObject.set(x, "cursorBlinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorBlinkingUndefined: Self = StObject.set(x, "cursorBlinking", js.undefined)
    
    @scala.inline
    def setCursorSmoothCaretAnimation(value: Boolean): Self = StObject.set(x, "cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorSmoothCaretAnimationUndefined: Self = StObject.set(x, "cursorSmoothCaretAnimation", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: line | block | underline | `line-thin` | `block-outline` | `underline-thin`): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    @scala.inline
    def setCursorSurroundingLines(value: Double): Self = StObject.set(x, "cursorSurroundingLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorSurroundingLinesStyle(value: default | all): Self = StObject.set(x, "cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorSurroundingLinesStyleUndefined: Self = StObject.set(x, "cursorSurroundingLinesStyle", js.undefined)
    
    @scala.inline
    def setCursorSurroundingLinesUndefined: Self = StObject.set(x, "cursorSurroundingLines", js.undefined)
    
    @scala.inline
    def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
    
    @scala.inline
    def setDefinitionLinkOpensInPeek(value: Boolean): Self = StObject.set(x, "definitionLinkOpensInPeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionLinkOpensInPeekUndefined: Self = StObject.set(x, "definitionLinkOpensInPeek", js.undefined)
    
    @scala.inline
    def setDisableLayerHinting(value: Boolean): Self = StObject.set(x, "disableLayerHinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLayerHintingUndefined: Self = StObject.set(x, "disableLayerHinting", js.undefined)
    
    @scala.inline
    def setDisableMonospaceOptimizations(value: Boolean): Self = StObject.set(x, "disableMonospaceOptimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMonospaceOptimizationsUndefined: Self = StObject.set(x, "disableMonospaceOptimizations", js.undefined)
    
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
    
    @scala.inline
    def setEmptySelectionClipboard(value: Boolean): Self = StObject.set(x, "emptySelectionClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptySelectionClipboardUndefined: Self = StObject.set(x, "emptySelectionClipboard", js.undefined)
    
    @scala.inline
    def setExtraEditorClassName(value: String): Self = StObject.set(x, "extraEditorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraEditorClassNameUndefined: Self = StObject.set(x, "extraEditorClassName", js.undefined)
    
    @scala.inline
    def setFastScrollSensitivity(value: Double): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastScrollSensitivityUndefined: Self = StObject.set(x, "fastScrollSensitivity", js.undefined)
    
    @scala.inline
    def setFind(value: IEditorFindOptions): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    @scala.inline
    def setFixedOverflowWidgets(value: Boolean): Self = StObject.set(x, "fixedOverflowWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedOverflowWidgetsUndefined: Self = StObject.set(x, "fixedOverflowWidgets", js.undefined)
    
    @scala.inline
    def setFolding(value: Boolean): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingHighlight(value: Boolean): Self = StObject.set(x, "foldingHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingHighlightUndefined: Self = StObject.set(x, "foldingHighlight", js.undefined)
    
    @scala.inline
    def setFoldingStrategy(value: auto | indentation): Self = StObject.set(x, "foldingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingStrategyUndefined: Self = StObject.set(x, "foldingStrategy", js.undefined)
    
    @scala.inline
    def setFoldingUndefined: Self = StObject.set(x, "folding", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontLigatures(value: Boolean | String): Self = StObject.set(x, "fontLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontLigaturesUndefined: Self = StObject.set(x, "fontLigatures", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setFormatOnPaste(value: Boolean): Self = StObject.set(x, "formatOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOnPasteUndefined: Self = StObject.set(x, "formatOnPaste", js.undefined)
    
    @scala.inline
    def setFormatOnType(value: Boolean): Self = StObject.set(x, "formatOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOnTypeUndefined: Self = StObject.set(x, "formatOnType", js.undefined)
    
    @scala.inline
    def setGlyphMargin(value: Boolean): Self = StObject.set(x, "glyphMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphMarginUndefined: Self = StObject.set(x, "glyphMargin", js.undefined)
    
    @scala.inline
    def setGotoLocation(value: IGotoLocationOptions): Self = StObject.set(x, "gotoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGotoLocationUndefined: Self = StObject.set(x, "gotoLocation", js.undefined)
    
    @scala.inline
    def setHideCursorInOverviewRuler(value: Boolean): Self = StObject.set(x, "hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideCursorInOverviewRulerUndefined: Self = StObject.set(x, "hideCursorInOverviewRuler", js.undefined)
    
    @scala.inline
    def setHighlightActiveIndentGuide(value: Boolean): Self = StObject.set(x, "highlightActiveIndentGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightActiveIndentGuideUndefined: Self = StObject.set(x, "highlightActiveIndentGuide", js.undefined)
    
    @scala.inline
    def setHover(value: IEditorHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setInDiffEditor(value: Boolean): Self = StObject.set(x, "inDiffEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDiffEditorUndefined: Self = StObject.set(x, "inDiffEditor", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLightbulb(value: IEditorLightbulbOptions): Self = StObject.set(x, "lightbulb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightbulbUndefined: Self = StObject.set(x, "lightbulb", js.undefined)
    
    @scala.inline
    def setLineDecorationsWidth(value: Double | String): Self = StObject.set(x, "lineDecorationsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDecorationsWidthUndefined: Self = StObject.set(x, "lineDecorationsWidth", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLineNumbers(value: LineNumbersType): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbersFunction1(value: /* lineNumber */ Double => String): Self = StObject.set(x, "lineNumbers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLineNumbersMinChars(value: Double): Self = StObject.set(x, "lineNumbersMinChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbersMinCharsUndefined: Self = StObject.set(x, "lineNumbersMinChars", js.undefined)
    
    @scala.inline
    def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    @scala.inline
    def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setMatchBrackets(value: never | near | always): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
    
    @scala.inline
    def setMinimap(value: IEditorMinimapOptions): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapUndefined: Self = StObject.set(x, "minimap", js.undefined)
    
    @scala.inline
    def setMouseStyle(value: text | default | copy): Self = StObject.set(x, "mouseStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseStyleUndefined: Self = StObject.set(x, "mouseStyle", js.undefined)
    
    @scala.inline
    def setMouseWheelScrollSensitivity(value: Double): Self = StObject.set(x, "mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelScrollSensitivityUndefined: Self = StObject.set(x, "mouseWheelScrollSensitivity", js.undefined)
    
    @scala.inline
    def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
    
    @scala.inline
    def setMultiCursorMergeOverlapping(value: Boolean): Self = StObject.set(x, "multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiCursorMergeOverlappingUndefined: Self = StObject.set(x, "multiCursorMergeOverlapping", js.undefined)
    
    @scala.inline
    def setMultiCursorModifier(value: ctrlCmd | alt): Self = StObject.set(x, "multiCursorModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiCursorModifierUndefined: Self = StObject.set(x, "multiCursorModifier", js.undefined)
    
    @scala.inline
    def setMultiCursorPaste(value: spread | full): Self = StObject.set(x, "multiCursorPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiCursorPasteUndefined: Self = StObject.set(x, "multiCursorPaste", js.undefined)
    
    @scala.inline
    def setOccurrencesHighlight(value: Boolean): Self = StObject.set(x, "occurrencesHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesHighlightUndefined: Self = StObject.set(x, "occurrencesHighlight", js.undefined)
    
    @scala.inline
    def setOverviewRulerBorder(value: Boolean): Self = StObject.set(x, "overviewRulerBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewRulerBorderUndefined: Self = StObject.set(x, "overviewRulerBorder", js.undefined)
    
    @scala.inline
    def setOverviewRulerLanes(value: Double): Self = StObject.set(x, "overviewRulerLanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewRulerLanesUndefined: Self = StObject.set(x, "overviewRulerLanes", js.undefined)
    
    @scala.inline
    def setPadding(value: IEditorPaddingOptions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setParameterHints(value: IEditorParameterHintOptions): Self = StObject.set(x, "parameterHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterHintsUndefined: Self = StObject.set(x, "parameterHints", js.undefined)
    
    @scala.inline
    def setPeekWidgetDefaultFocus(value: tree | typings.monacoEditor.monacoEditorStrings.editor): Self = StObject.set(x, "peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeekWidgetDefaultFocusUndefined: Self = StObject.set(x, "peekWidgetDefaultFocus", js.undefined)
    
    @scala.inline
    def setQuickSuggestions(value: Boolean | IQuickSuggestionsOptions): Self = StObject.set(x, "quickSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSuggestionsDelay(value: Double): Self = StObject.set(x, "quickSuggestionsDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSuggestionsDelayUndefined: Self = StObject.set(x, "quickSuggestionsDelay", js.undefined)
    
    @scala.inline
    def setQuickSuggestionsUndefined: Self = StObject.set(x, "quickSuggestions", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRenameOnType(value: Boolean): Self = StObject.set(x, "renameOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameOnTypeUndefined: Self = StObject.set(x, "renameOnType", js.undefined)
    
    @scala.inline
    def setRenderControlCharacters(value: Boolean): Self = StObject.set(x, "renderControlCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderControlCharactersUndefined: Self = StObject.set(x, "renderControlCharacters", js.undefined)
    
    @scala.inline
    def setRenderFinalNewline(value: Boolean): Self = StObject.set(x, "renderFinalNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFinalNewlineUndefined: Self = StObject.set(x, "renderFinalNewline", js.undefined)
    
    @scala.inline
    def setRenderIndentGuides(value: Boolean): Self = StObject.set(x, "renderIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderIndentGuidesUndefined: Self = StObject.set(x, "renderIndentGuides", js.undefined)
    
    @scala.inline
    def setRenderLineHighlight(value: none | gutter | line | all): Self = StObject.set(x, "renderLineHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLineHighlightOnlyWhenFocus(value: Boolean): Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLineHighlightOnlyWhenFocusUndefined: Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", js.undefined)
    
    @scala.inline
    def setRenderLineHighlightUndefined: Self = StObject.set(x, "renderLineHighlight", js.undefined)
    
    @scala.inline
    def setRenderValidationDecorations(value: editable | on | off): Self = StObject.set(x, "renderValidationDecorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderValidationDecorationsUndefined: Self = StObject.set(x, "renderValidationDecorations", js.undefined)
    
    @scala.inline
    def setRenderWhitespace(value: none | boundary | selection | trailing | all): Self = StObject.set(x, "renderWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderWhitespaceUndefined: Self = StObject.set(x, "renderWhitespace", js.undefined)
    
    @scala.inline
    def setRevealHorizontalRightPadding(value: Double): Self = StObject.set(x, "revealHorizontalRightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealHorizontalRightPaddingUndefined: Self = StObject.set(x, "revealHorizontalRightPadding", js.undefined)
    
    @scala.inline
    def setRoundedSelection(value: Boolean): Self = StObject.set(x, "roundedSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedSelectionUndefined: Self = StObject.set(x, "roundedSelection", js.undefined)
    
    @scala.inline
    def setRulers(value: js.Array[Double | IRulerOption]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
    
    @scala.inline
    def setRulersVarargs(value: (Double | IRulerOption)*): Self = StObject.set(x, "rulers", js.Array(value :_*))
    
    @scala.inline
    def setScrollBeyondLastColumn(value: Double): Self = StObject.set(x, "scrollBeyondLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollBeyondLastColumnUndefined: Self = StObject.set(x, "scrollBeyondLastColumn", js.undefined)
    
    @scala.inline
    def setScrollBeyondLastLine(value: Boolean): Self = StObject.set(x, "scrollBeyondLastLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollBeyondLastLineUndefined: Self = StObject.set(x, "scrollBeyondLastLine", js.undefined)
    
    @scala.inline
    def setScrollPredominantAxis(value: Boolean): Self = StObject.set(x, "scrollPredominantAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPredominantAxisUndefined: Self = StObject.set(x, "scrollPredominantAxis", js.undefined)
    
    @scala.inline
    def setScrollbar(value: IEditorScrollbarOptions): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    @scala.inline
    def setSelectOnLineNumbers(value: Boolean): Self = StObject.set(x, "selectOnLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnLineNumbersUndefined: Self = StObject.set(x, "selectOnLineNumbers", js.undefined)
    
    @scala.inline
    def setSelectionClipboard(value: Boolean): Self = StObject.set(x, "selectionClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionClipboardUndefined: Self = StObject.set(x, "selectionClipboard", js.undefined)
    
    @scala.inline
    def setSelectionHighlight(value: Boolean): Self = StObject.set(x, "selectionHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionHighlightUndefined: Self = StObject.set(x, "selectionHighlight", js.undefined)
    
    @scala.inline
    def setShowDeprecated(value: Boolean): Self = StObject.set(x, "showDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeprecatedUndefined: Self = StObject.set(x, "showDeprecated", js.undefined)
    
    @scala.inline
    def setShowFoldingControls(value: always | mouseover): Self = StObject.set(x, "showFoldingControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFoldingControlsUndefined: Self = StObject.set(x, "showFoldingControls", js.undefined)
    
    @scala.inline
    def setShowUnused(value: Boolean): Self = StObject.set(x, "showUnused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnusedUndefined: Self = StObject.set(x, "showUnused", js.undefined)
    
    @scala.inline
    def setSmoothScrolling(value: Boolean): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothScrollingUndefined: Self = StObject.set(x, "smoothScrolling", js.undefined)
    
    @scala.inline
    def setSnippetSuggestions(value: top | bottom | `inline` | none): Self = StObject.set(x, "snippetSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetSuggestionsUndefined: Self = StObject.set(x, "snippetSuggestions", js.undefined)
    
    @scala.inline
    def setStopRenderingLineAfter(value: Double): Self = StObject.set(x, "stopRenderingLineAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopRenderingLineAfterUndefined: Self = StObject.set(x, "stopRenderingLineAfter", js.undefined)
    
    @scala.inline
    def setSuggest(value: ISuggestOptions): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestFontSize(value: Double): Self = StObject.set(x, "suggestFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestFontSizeUndefined: Self = StObject.set(x, "suggestFontSize", js.undefined)
    
    @scala.inline
    def setSuggestLineHeight(value: Double): Self = StObject.set(x, "suggestLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestLineHeightUndefined: Self = StObject.set(x, "suggestLineHeight", js.undefined)
    
    @scala.inline
    def setSuggestOnTriggerCharacters(value: Boolean): Self = StObject.set(x, "suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestOnTriggerCharactersUndefined: Self = StObject.set(x, "suggestOnTriggerCharacters", js.undefined)
    
    @scala.inline
    def setSuggestSelection(value: first | recentlyUsed | recentlyUsedByPrefix): Self = StObject.set(x, "suggestSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestSelectionUndefined: Self = StObject.set(x, "suggestSelection", js.undefined)
    
    @scala.inline
    def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    @scala.inline
    def setTabCompletion(value: on | off | onlySnippets): Self = StObject.set(x, "tabCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabCompletionUndefined: Self = StObject.set(x, "tabCompletion", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setUnfoldOnClickAfterEndOfLine(value: Boolean): Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfoldOnClickAfterEndOfLineUndefined: Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", js.undefined)
    
    @scala.inline
    def setUnusualLineTerminators(value: off | prompt | auto): Self = StObject.set(x, "unusualLineTerminators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusualLineTerminatorsUndefined: Self = StObject.set(x, "unusualLineTerminators", js.undefined)
    
    @scala.inline
    def setUseTabStops(value: Boolean): Self = StObject.set(x, "useTabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTabStopsUndefined: Self = StObject.set(x, "useTabStops", js.undefined)
    
    @scala.inline
    def setWordSeparators(value: String): Self = StObject.set(x, "wordSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSeparatorsUndefined: Self = StObject.set(x, "wordSeparators", js.undefined)
    
    @scala.inline
    def setWordWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapBreakAfterCharacters(value: String): Self = StObject.set(x, "wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapBreakAfterCharactersUndefined: Self = StObject.set(x, "wordWrapBreakAfterCharacters", js.undefined)
    
    @scala.inline
    def setWordWrapBreakBeforeCharacters(value: String): Self = StObject.set(x, "wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapBreakBeforeCharactersUndefined: Self = StObject.set(x, "wordWrapBreakBeforeCharacters", js.undefined)
    
    @scala.inline
    def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    
    @scala.inline
    def setWordWrapMinified(value: Boolean): Self = StObject.set(x, "wordWrapMinified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapMinifiedUndefined: Self = StObject.set(x, "wordWrapMinified", js.undefined)
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    
    @scala.inline
    def setWrappingIndent(value: none | same | indent | deepIndent): Self = StObject.set(x, "wrappingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappingIndentUndefined: Self = StObject.set(x, "wrappingIndent", js.undefined)
    
    @scala.inline
    def setWrappingStrategy(value: simple | advanced): Self = StObject.set(x, "wrappingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappingStrategyUndefined: Self = StObject.set(x, "wrappingStrategy", js.undefined)
  }
}
