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
import typings.monacoEditor.monacoEditorStrings.inherit
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
    * Options for pressing backspace near quotes or bracket pairs.
    */
  var autoClosingDelete: js.UndefOr[EditorAutoClosingEditStrategy] = js.undefined
  
  /**
    * Options for typing over closing quotes or brackets.
    */
  var autoClosingOvertype: js.UndefOr[EditorAutoClosingEditStrategy] = js.undefined
  
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
    * Configures bracket pair colorization (disabled by default).
    */
  var bracketPairColorization: js.UndefOr[IBracketPairColorizationOptions] = js.undefined
  
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
    * Code lens font family. Defaults to editor font family.
    */
  var codeLensFontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Code lens font size. Default to 90% of the editor font size
    */
  var codeLensFontSize: js.UndefOr[Double] = js.undefined
  
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
    * Should the textarea used for input use the DOM `readonly` attribute.
    * Defaults to false.
    */
  var domReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if the editor should allow to move selections via drag and drop.
    * Defaults to false.
    */
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls dropping into the editor from an external source.
    *
    * When enabled, this shows a preview of the drop location and triggers an `onDropIntoEditor` event.
    */
  var dropIntoEditor: js.UndefOr[IDropIntoEditorOptions] = js.undefined
  
  /**
    * Copying without a selection copies the current line.
    */
  var emptySelectionClipboard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control the behavior of experimental options
    */
  var experimental: js.UndefOr[IEditorExperimentalOptions] = js.undefined
  
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
    * Auto fold imports folding regions.
    * Defaults to true.
    */
  var foldingImportsByDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of foldable regions.
    * Defaults to 5000.
    */
  var foldingMaximumRegions: js.UndefOr[Double] = js.undefined
  
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
    * Controls the behavior of editor guides.
    */
  var guides: js.UndefOr[IGuidesOptions] = js.undefined
  
  /**
    * Should the cursor be hidden in the overview ruler.
    * Defaults to false.
    */
  var hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configure the editor's hover.
    */
  var hover: js.UndefOr[IEditorHoverOptions] = js.undefined
  
  /**
    * This editor is used inside a diff editor.
    */
  var inDiffEditor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control the behavior and rendering of the inline hints.
    */
  var inlayHints: js.UndefOr[IEditorInlayHintsOptions] = js.undefined
  
  var inlineSuggest: js.UndefOr[IInlineSuggestOptions] = js.undefined
  
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
    * Otherwise, if it is a truthy, line numbers will be rendered normally (equivalent of using an identity function).
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
    * Enable linked editing.
    * Defaults to false.
    */
  var linkedEditing: js.UndefOr[Boolean] = js.undefined
  
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
    * Should the editor be read only. See also `domReadOnly`.
    * Defaults to false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * deprecated, use linkedEditing instead
    */
  var renameOnType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable rendering of control characters.
    * Defaults to true.
    */
  var renderControlCharacters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render last line number when the file ends with a newline.
    * Defaults to true.
    */
  var renderFinalNewline: js.UndefOr[Boolean] = js.undefined
  
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
    * Defaults to 'selection'.
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
  var showFoldingControls: js.UndefOr[always | never | mouseover] = js.undefined
  
  /**
    * Controls fading out of unused variables.
    */
  var showUnused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Smart select options.
    */
  var smartSelect: js.UndefOr[ISmartSelectOptions] = js.undefined
  
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
    * Emulate selection behaviour of tab characters when using spaces for indentation.
    * This means selection will stick to tab stops.
    */
  var stickyTabStops: js.UndefOr[Boolean] = js.undefined
  
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
    * Controls the behavior of the unicode highlight feature
    * (by default, ambiguous and invisible characters are highlighted).
    */
  var unicodeHighlight: js.UndefOr[IUnicodeHighlightOptions] = js.undefined
  
  /**
    * Remove unusual line terminators like LINE SEPARATOR (LS), PARAGRAPH SEPARATOR (PS).
    * Defaults to 'prompt'.
    */
  var unusualLineTerminators: js.UndefOr[auto | off | prompt] = js.undefined
  
  /**
    * Control if the editor should use shadow DOM.
    */
  var useShadowDOM: js.UndefOr[Boolean] = js.undefined
  
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
    */
  var wordWrapBreakAfterCharacters: js.UndefOr[String] = js.undefined
  
  /**
    * Configure word wrapping characters. A break will be introduced before these characters.
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
    * Override the `wordWrap` setting.
    */
  var wordWrapOverride1: js.UndefOr[off | on | inherit] = js.undefined
  
  /**
    * Override the `wordWrapOverride1` setting.
    */
  var wordWrapOverride2: js.UndefOr[off | on | inherit] = js.undefined
  
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
  
  inline def apply(): IEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setAcceptSuggestionOnCommitCharacter(value: Boolean): Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
    
    inline def setAcceptSuggestionOnCommitCharacterUndefined: Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", js.undefined)
    
    inline def setAcceptSuggestionOnEnter(value: on | smart | off): Self = StObject.set(x, "acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
    
    inline def setAcceptSuggestionOnEnterUndefined: Self = StObject.set(x, "acceptSuggestionOnEnter", js.undefined)
    
    inline def setAccessibilityPageSize(value: Double): Self = StObject.set(x, "accessibilityPageSize", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPageSizeUndefined: Self = StObject.set(x, "accessibilityPageSize", js.undefined)
    
    inline def setAccessibilitySupport(value: auto | off | on): Self = StObject.set(x, "accessibilitySupport", value.asInstanceOf[js.Any])
    
    inline def setAccessibilitySupportUndefined: Self = StObject.set(x, "accessibilitySupport", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAutoClosingBrackets(value: EditorAutoClosingStrategy): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
    
    inline def setAutoClosingDelete(value: EditorAutoClosingEditStrategy): Self = StObject.set(x, "autoClosingDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingDeleteUndefined: Self = StObject.set(x, "autoClosingDelete", js.undefined)
    
    inline def setAutoClosingOvertype(value: EditorAutoClosingEditStrategy): Self = StObject.set(x, "autoClosingOvertype", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingOvertypeUndefined: Self = StObject.set(x, "autoClosingOvertype", js.undefined)
    
    inline def setAutoClosingQuotes(value: EditorAutoClosingStrategy): Self = StObject.set(x, "autoClosingQuotes", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingQuotesUndefined: Self = StObject.set(x, "autoClosingQuotes", js.undefined)
    
    inline def setAutoIndent(value: none | keep | brackets | advanced | full): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    inline def setAutoSurround(value: EditorAutoSurroundStrategy): Self = StObject.set(x, "autoSurround", value.asInstanceOf[js.Any])
    
    inline def setAutoSurroundUndefined: Self = StObject.set(x, "autoSurround", js.undefined)
    
    inline def setAutomaticLayout(value: Boolean): Self = StObject.set(x, "automaticLayout", value.asInstanceOf[js.Any])
    
    inline def setAutomaticLayoutUndefined: Self = StObject.set(x, "automaticLayout", js.undefined)
    
    inline def setBracketPairColorization(value: IBracketPairColorizationOptions): Self = StObject.set(x, "bracketPairColorization", value.asInstanceOf[js.Any])
    
    inline def setBracketPairColorizationUndefined: Self = StObject.set(x, "bracketPairColorization", js.undefined)
    
    inline def setCodeActionsOnSaveTimeout(value: Double): Self = StObject.set(x, "codeActionsOnSaveTimeout", value.asInstanceOf[js.Any])
    
    inline def setCodeActionsOnSaveTimeoutUndefined: Self = StObject.set(x, "codeActionsOnSaveTimeout", js.undefined)
    
    inline def setCodeLens(value: Boolean): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
    
    inline def setCodeLensFontFamily(value: String): Self = StObject.set(x, "codeLensFontFamily", value.asInstanceOf[js.Any])
    
    inline def setCodeLensFontFamilyUndefined: Self = StObject.set(x, "codeLensFontFamily", js.undefined)
    
    inline def setCodeLensFontSize(value: Double): Self = StObject.set(x, "codeLensFontSize", value.asInstanceOf[js.Any])
    
    inline def setCodeLensFontSizeUndefined: Self = StObject.set(x, "codeLensFontSize", js.undefined)
    
    inline def setCodeLensUndefined: Self = StObject.set(x, "codeLens", js.undefined)
    
    inline def setColorDecorators(value: Boolean): Self = StObject.set(x, "colorDecorators", value.asInstanceOf[js.Any])
    
    inline def setColorDecoratorsUndefined: Self = StObject.set(x, "colorDecorators", js.undefined)
    
    inline def setColumnSelection(value: Boolean): Self = StObject.set(x, "columnSelection", value.asInstanceOf[js.Any])
    
    inline def setColumnSelectionUndefined: Self = StObject.set(x, "columnSelection", js.undefined)
    
    inline def setComments(value: IEditorCommentsOptions): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setContextmenu(value: Boolean): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    inline def setCopyWithSyntaxHighlighting(value: Boolean): Self = StObject.set(x, "copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
    
    inline def setCopyWithSyntaxHighlightingUndefined: Self = StObject.set(x, "copyWithSyntaxHighlighting", js.undefined)
    
    inline def setCursorBlinking(value: blink | smooth | phase | expand | solid): Self = StObject.set(x, "cursorBlinking", value.asInstanceOf[js.Any])
    
    inline def setCursorBlinkingUndefined: Self = StObject.set(x, "cursorBlinking", js.undefined)
    
    inline def setCursorSmoothCaretAnimation(value: Boolean): Self = StObject.set(x, "cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
    
    inline def setCursorSmoothCaretAnimationUndefined: Self = StObject.set(x, "cursorSmoothCaretAnimation", js.undefined)
    
    inline def setCursorStyle(value: line | block | underline | `line-thin` | `block-outline` | `underline-thin`): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    inline def setCursorSurroundingLines(value: Double): Self = StObject.set(x, "cursorSurroundingLines", value.asInstanceOf[js.Any])
    
    inline def setCursorSurroundingLinesStyle(value: default | all): Self = StObject.set(x, "cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorSurroundingLinesStyleUndefined: Self = StObject.set(x, "cursorSurroundingLinesStyle", js.undefined)
    
    inline def setCursorSurroundingLinesUndefined: Self = StObject.set(x, "cursorSurroundingLines", js.undefined)
    
    inline def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
    
    inline def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
    
    inline def setDefinitionLinkOpensInPeek(value: Boolean): Self = StObject.set(x, "definitionLinkOpensInPeek", value.asInstanceOf[js.Any])
    
    inline def setDefinitionLinkOpensInPeekUndefined: Self = StObject.set(x, "definitionLinkOpensInPeek", js.undefined)
    
    inline def setDisableLayerHinting(value: Boolean): Self = StObject.set(x, "disableLayerHinting", value.asInstanceOf[js.Any])
    
    inline def setDisableLayerHintingUndefined: Self = StObject.set(x, "disableLayerHinting", js.undefined)
    
    inline def setDisableMonospaceOptimizations(value: Boolean): Self = StObject.set(x, "disableMonospaceOptimizations", value.asInstanceOf[js.Any])
    
    inline def setDisableMonospaceOptimizationsUndefined: Self = StObject.set(x, "disableMonospaceOptimizations", js.undefined)
    
    inline def setDomReadOnly(value: Boolean): Self = StObject.set(x, "domReadOnly", value.asInstanceOf[js.Any])
    
    inline def setDomReadOnlyUndefined: Self = StObject.set(x, "domReadOnly", js.undefined)
    
    inline def setDragAndDrop(value: Boolean): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
    
    inline def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
    
    inline def setDropIntoEditor(value: IDropIntoEditorOptions): Self = StObject.set(x, "dropIntoEditor", value.asInstanceOf[js.Any])
    
    inline def setDropIntoEditorUndefined: Self = StObject.set(x, "dropIntoEditor", js.undefined)
    
    inline def setEmptySelectionClipboard(value: Boolean): Self = StObject.set(x, "emptySelectionClipboard", value.asInstanceOf[js.Any])
    
    inline def setEmptySelectionClipboardUndefined: Self = StObject.set(x, "emptySelectionClipboard", js.undefined)
    
    inline def setExperimental(value: IEditorExperimentalOptions): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setExtraEditorClassName(value: String): Self = StObject.set(x, "extraEditorClassName", value.asInstanceOf[js.Any])
    
    inline def setExtraEditorClassNameUndefined: Self = StObject.set(x, "extraEditorClassName", js.undefined)
    
    inline def setFastScrollSensitivity(value: Double): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setFastScrollSensitivityUndefined: Self = StObject.set(x, "fastScrollSensitivity", js.undefined)
    
    inline def setFind(value: IEditorFindOptions): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFixedOverflowWidgets(value: Boolean): Self = StObject.set(x, "fixedOverflowWidgets", value.asInstanceOf[js.Any])
    
    inline def setFixedOverflowWidgetsUndefined: Self = StObject.set(x, "fixedOverflowWidgets", js.undefined)
    
    inline def setFolding(value: Boolean): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
    
    inline def setFoldingHighlight(value: Boolean): Self = StObject.set(x, "foldingHighlight", value.asInstanceOf[js.Any])
    
    inline def setFoldingHighlightUndefined: Self = StObject.set(x, "foldingHighlight", js.undefined)
    
    inline def setFoldingImportsByDefault(value: Boolean): Self = StObject.set(x, "foldingImportsByDefault", value.asInstanceOf[js.Any])
    
    inline def setFoldingImportsByDefaultUndefined: Self = StObject.set(x, "foldingImportsByDefault", js.undefined)
    
    inline def setFoldingMaximumRegions(value: Double): Self = StObject.set(x, "foldingMaximumRegions", value.asInstanceOf[js.Any])
    
    inline def setFoldingMaximumRegionsUndefined: Self = StObject.set(x, "foldingMaximumRegions", js.undefined)
    
    inline def setFoldingStrategy(value: auto | indentation): Self = StObject.set(x, "foldingStrategy", value.asInstanceOf[js.Any])
    
    inline def setFoldingStrategyUndefined: Self = StObject.set(x, "foldingStrategy", js.undefined)
    
    inline def setFoldingUndefined: Self = StObject.set(x, "folding", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontLigatures(value: Boolean | String): Self = StObject.set(x, "fontLigatures", value.asInstanceOf[js.Any])
    
    inline def setFontLigaturesUndefined: Self = StObject.set(x, "fontLigatures", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFormatOnPaste(value: Boolean): Self = StObject.set(x, "formatOnPaste", value.asInstanceOf[js.Any])
    
    inline def setFormatOnPasteUndefined: Self = StObject.set(x, "formatOnPaste", js.undefined)
    
    inline def setFormatOnType(value: Boolean): Self = StObject.set(x, "formatOnType", value.asInstanceOf[js.Any])
    
    inline def setFormatOnTypeUndefined: Self = StObject.set(x, "formatOnType", js.undefined)
    
    inline def setGlyphMargin(value: Boolean): Self = StObject.set(x, "glyphMargin", value.asInstanceOf[js.Any])
    
    inline def setGlyphMarginUndefined: Self = StObject.set(x, "glyphMargin", js.undefined)
    
    inline def setGotoLocation(value: IGotoLocationOptions): Self = StObject.set(x, "gotoLocation", value.asInstanceOf[js.Any])
    
    inline def setGotoLocationUndefined: Self = StObject.set(x, "gotoLocation", js.undefined)
    
    inline def setGuides(value: IGuidesOptions): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
    
    inline def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
    
    inline def setHideCursorInOverviewRuler(value: Boolean): Self = StObject.set(x, "hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
    
    inline def setHideCursorInOverviewRulerUndefined: Self = StObject.set(x, "hideCursorInOverviewRuler", js.undefined)
    
    inline def setHover(value: IEditorHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setInDiffEditor(value: Boolean): Self = StObject.set(x, "inDiffEditor", value.asInstanceOf[js.Any])
    
    inline def setInDiffEditorUndefined: Self = StObject.set(x, "inDiffEditor", js.undefined)
    
    inline def setInlayHints(value: IEditorInlayHintsOptions): Self = StObject.set(x, "inlayHints", value.asInstanceOf[js.Any])
    
    inline def setInlayHintsUndefined: Self = StObject.set(x, "inlayHints", js.undefined)
    
    inline def setInlineSuggest(value: IInlineSuggestOptions): Self = StObject.set(x, "inlineSuggest", value.asInstanceOf[js.Any])
    
    inline def setInlineSuggestUndefined: Self = StObject.set(x, "inlineSuggest", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLightbulb(value: IEditorLightbulbOptions): Self = StObject.set(x, "lightbulb", value.asInstanceOf[js.Any])
    
    inline def setLightbulbUndefined: Self = StObject.set(x, "lightbulb", js.undefined)
    
    inline def setLineDecorationsWidth(value: Double | String): Self = StObject.set(x, "lineDecorationsWidth", value.asInstanceOf[js.Any])
    
    inline def setLineDecorationsWidthUndefined: Self = StObject.set(x, "lineDecorationsWidth", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineNumbers(value: LineNumbersType): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersFunction1(value: /* lineNumber */ Double => String): Self = StObject.set(x, "lineNumbers", js.Any.fromFunction1(value))
    
    inline def setLineNumbersMinChars(value: Double): Self = StObject.set(x, "lineNumbersMinChars", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersMinCharsUndefined: Self = StObject.set(x, "lineNumbersMinChars", js.undefined)
    
    inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    inline def setLinkedEditing(value: Boolean): Self = StObject.set(x, "linkedEditing", value.asInstanceOf[js.Any])
    
    inline def setLinkedEditingUndefined: Self = StObject.set(x, "linkedEditing", js.undefined)
    
    inline def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setMatchBrackets(value: never | near | always): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
    
    inline def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
    
    inline def setMinimap(value: IEditorMinimapOptions): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
    
    inline def setMinimapUndefined: Self = StObject.set(x, "minimap", js.undefined)
    
    inline def setMouseStyle(value: text | default | copy): Self = StObject.set(x, "mouseStyle", value.asInstanceOf[js.Any])
    
    inline def setMouseStyleUndefined: Self = StObject.set(x, "mouseStyle", js.undefined)
    
    inline def setMouseWheelScrollSensitivity(value: Double): Self = StObject.set(x, "mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelScrollSensitivityUndefined: Self = StObject.set(x, "mouseWheelScrollSensitivity", js.undefined)
    
    inline def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
    
    inline def setMultiCursorMergeOverlapping(value: Boolean): Self = StObject.set(x, "multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
    
    inline def setMultiCursorMergeOverlappingUndefined: Self = StObject.set(x, "multiCursorMergeOverlapping", js.undefined)
    
    inline def setMultiCursorModifier(value: ctrlCmd | alt): Self = StObject.set(x, "multiCursorModifier", value.asInstanceOf[js.Any])
    
    inline def setMultiCursorModifierUndefined: Self = StObject.set(x, "multiCursorModifier", js.undefined)
    
    inline def setMultiCursorPaste(value: spread | full): Self = StObject.set(x, "multiCursorPaste", value.asInstanceOf[js.Any])
    
    inline def setMultiCursorPasteUndefined: Self = StObject.set(x, "multiCursorPaste", js.undefined)
    
    inline def setOccurrencesHighlight(value: Boolean): Self = StObject.set(x, "occurrencesHighlight", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesHighlightUndefined: Self = StObject.set(x, "occurrencesHighlight", js.undefined)
    
    inline def setOverviewRulerBorder(value: Boolean): Self = StObject.set(x, "overviewRulerBorder", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerBorderUndefined: Self = StObject.set(x, "overviewRulerBorder", js.undefined)
    
    inline def setOverviewRulerLanes(value: Double): Self = StObject.set(x, "overviewRulerLanes", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerLanesUndefined: Self = StObject.set(x, "overviewRulerLanes", js.undefined)
    
    inline def setPadding(value: IEditorPaddingOptions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setParameterHints(value: IEditorParameterHintOptions): Self = StObject.set(x, "parameterHints", value.asInstanceOf[js.Any])
    
    inline def setParameterHintsUndefined: Self = StObject.set(x, "parameterHints", js.undefined)
    
    inline def setPeekWidgetDefaultFocus(value: tree | typings.monacoEditor.monacoEditorStrings.editor): Self = StObject.set(x, "peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
    
    inline def setPeekWidgetDefaultFocusUndefined: Self = StObject.set(x, "peekWidgetDefaultFocus", js.undefined)
    
    inline def setQuickSuggestions(value: Boolean | IQuickSuggestionsOptions): Self = StObject.set(x, "quickSuggestions", value.asInstanceOf[js.Any])
    
    inline def setQuickSuggestionsDelay(value: Double): Self = StObject.set(x, "quickSuggestionsDelay", value.asInstanceOf[js.Any])
    
    inline def setQuickSuggestionsDelayUndefined: Self = StObject.set(x, "quickSuggestionsDelay", js.undefined)
    
    inline def setQuickSuggestionsUndefined: Self = StObject.set(x, "quickSuggestions", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRenameOnType(value: Boolean): Self = StObject.set(x, "renameOnType", value.asInstanceOf[js.Any])
    
    inline def setRenameOnTypeUndefined: Self = StObject.set(x, "renameOnType", js.undefined)
    
    inline def setRenderControlCharacters(value: Boolean): Self = StObject.set(x, "renderControlCharacters", value.asInstanceOf[js.Any])
    
    inline def setRenderControlCharactersUndefined: Self = StObject.set(x, "renderControlCharacters", js.undefined)
    
    inline def setRenderFinalNewline(value: Boolean): Self = StObject.set(x, "renderFinalNewline", value.asInstanceOf[js.Any])
    
    inline def setRenderFinalNewlineUndefined: Self = StObject.set(x, "renderFinalNewline", js.undefined)
    
    inline def setRenderLineHighlight(value: none | gutter | line | all): Self = StObject.set(x, "renderLineHighlight", value.asInstanceOf[js.Any])
    
    inline def setRenderLineHighlightOnlyWhenFocus(value: Boolean): Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", value.asInstanceOf[js.Any])
    
    inline def setRenderLineHighlightOnlyWhenFocusUndefined: Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", js.undefined)
    
    inline def setRenderLineHighlightUndefined: Self = StObject.set(x, "renderLineHighlight", js.undefined)
    
    inline def setRenderValidationDecorations(value: editable | on | off): Self = StObject.set(x, "renderValidationDecorations", value.asInstanceOf[js.Any])
    
    inline def setRenderValidationDecorationsUndefined: Self = StObject.set(x, "renderValidationDecorations", js.undefined)
    
    inline def setRenderWhitespace(value: none | boundary | selection | trailing | all): Self = StObject.set(x, "renderWhitespace", value.asInstanceOf[js.Any])
    
    inline def setRenderWhitespaceUndefined: Self = StObject.set(x, "renderWhitespace", js.undefined)
    
    inline def setRevealHorizontalRightPadding(value: Double): Self = StObject.set(x, "revealHorizontalRightPadding", value.asInstanceOf[js.Any])
    
    inline def setRevealHorizontalRightPaddingUndefined: Self = StObject.set(x, "revealHorizontalRightPadding", js.undefined)
    
    inline def setRoundedSelection(value: Boolean): Self = StObject.set(x, "roundedSelection", value.asInstanceOf[js.Any])
    
    inline def setRoundedSelectionUndefined: Self = StObject.set(x, "roundedSelection", js.undefined)
    
    inline def setRulers(value: js.Array[Double | IRulerOption]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
    
    inline def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
    
    inline def setRulersVarargs(value: (Double | IRulerOption)*): Self = StObject.set(x, "rulers", js.Array(value*))
    
    inline def setScrollBeyondLastColumn(value: Double): Self = StObject.set(x, "scrollBeyondLastColumn", value.asInstanceOf[js.Any])
    
    inline def setScrollBeyondLastColumnUndefined: Self = StObject.set(x, "scrollBeyondLastColumn", js.undefined)
    
    inline def setScrollBeyondLastLine(value: Boolean): Self = StObject.set(x, "scrollBeyondLastLine", value.asInstanceOf[js.Any])
    
    inline def setScrollBeyondLastLineUndefined: Self = StObject.set(x, "scrollBeyondLastLine", js.undefined)
    
    inline def setScrollPredominantAxis(value: Boolean): Self = StObject.set(x, "scrollPredominantAxis", value.asInstanceOf[js.Any])
    
    inline def setScrollPredominantAxisUndefined: Self = StObject.set(x, "scrollPredominantAxis", js.undefined)
    
    inline def setScrollbar(value: IEditorScrollbarOptions): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setSelectOnLineNumbers(value: Boolean): Self = StObject.set(x, "selectOnLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setSelectOnLineNumbersUndefined: Self = StObject.set(x, "selectOnLineNumbers", js.undefined)
    
    inline def setSelectionClipboard(value: Boolean): Self = StObject.set(x, "selectionClipboard", value.asInstanceOf[js.Any])
    
    inline def setSelectionClipboardUndefined: Self = StObject.set(x, "selectionClipboard", js.undefined)
    
    inline def setSelectionHighlight(value: Boolean): Self = StObject.set(x, "selectionHighlight", value.asInstanceOf[js.Any])
    
    inline def setSelectionHighlightUndefined: Self = StObject.set(x, "selectionHighlight", js.undefined)
    
    inline def setShowDeprecated(value: Boolean): Self = StObject.set(x, "showDeprecated", value.asInstanceOf[js.Any])
    
    inline def setShowDeprecatedUndefined: Self = StObject.set(x, "showDeprecated", js.undefined)
    
    inline def setShowFoldingControls(value: always | never | mouseover): Self = StObject.set(x, "showFoldingControls", value.asInstanceOf[js.Any])
    
    inline def setShowFoldingControlsUndefined: Self = StObject.set(x, "showFoldingControls", js.undefined)
    
    inline def setShowUnused(value: Boolean): Self = StObject.set(x, "showUnused", value.asInstanceOf[js.Any])
    
    inline def setShowUnusedUndefined: Self = StObject.set(x, "showUnused", js.undefined)
    
    inline def setSmartSelect(value: ISmartSelectOptions): Self = StObject.set(x, "smartSelect", value.asInstanceOf[js.Any])
    
    inline def setSmartSelectUndefined: Self = StObject.set(x, "smartSelect", js.undefined)
    
    inline def setSmoothScrolling(value: Boolean): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
    
    inline def setSmoothScrollingUndefined: Self = StObject.set(x, "smoothScrolling", js.undefined)
    
    inline def setSnippetSuggestions(value: top | bottom | `inline` | none): Self = StObject.set(x, "snippetSuggestions", value.asInstanceOf[js.Any])
    
    inline def setSnippetSuggestionsUndefined: Self = StObject.set(x, "snippetSuggestions", js.undefined)
    
    inline def setStickyTabStops(value: Boolean): Self = StObject.set(x, "stickyTabStops", value.asInstanceOf[js.Any])
    
    inline def setStickyTabStopsUndefined: Self = StObject.set(x, "stickyTabStops", js.undefined)
    
    inline def setStopRenderingLineAfter(value: Double): Self = StObject.set(x, "stopRenderingLineAfter", value.asInstanceOf[js.Any])
    
    inline def setStopRenderingLineAfterUndefined: Self = StObject.set(x, "stopRenderingLineAfter", js.undefined)
    
    inline def setSuggest(value: ISuggestOptions): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestFontSize(value: Double): Self = StObject.set(x, "suggestFontSize", value.asInstanceOf[js.Any])
    
    inline def setSuggestFontSizeUndefined: Self = StObject.set(x, "suggestFontSize", js.undefined)
    
    inline def setSuggestLineHeight(value: Double): Self = StObject.set(x, "suggestLineHeight", value.asInstanceOf[js.Any])
    
    inline def setSuggestLineHeightUndefined: Self = StObject.set(x, "suggestLineHeight", js.undefined)
    
    inline def setSuggestOnTriggerCharacters(value: Boolean): Self = StObject.set(x, "suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setSuggestOnTriggerCharactersUndefined: Self = StObject.set(x, "suggestOnTriggerCharacters", js.undefined)
    
    inline def setSuggestSelection(value: first | recentlyUsed | recentlyUsedByPrefix): Self = StObject.set(x, "suggestSelection", value.asInstanceOf[js.Any])
    
    inline def setSuggestSelectionUndefined: Self = StObject.set(x, "suggestSelection", js.undefined)
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setTabCompletion(value: on | off | onlySnippets): Self = StObject.set(x, "tabCompletion", value.asInstanceOf[js.Any])
    
    inline def setTabCompletionUndefined: Self = StObject.set(x, "tabCompletion", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setUnfoldOnClickAfterEndOfLine(value: Boolean): Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", value.asInstanceOf[js.Any])
    
    inline def setUnfoldOnClickAfterEndOfLineUndefined: Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", js.undefined)
    
    inline def setUnicodeHighlight(value: IUnicodeHighlightOptions): Self = StObject.set(x, "unicodeHighlight", value.asInstanceOf[js.Any])
    
    inline def setUnicodeHighlightUndefined: Self = StObject.set(x, "unicodeHighlight", js.undefined)
    
    inline def setUnusualLineTerminators(value: auto | off | prompt): Self = StObject.set(x, "unusualLineTerminators", value.asInstanceOf[js.Any])
    
    inline def setUnusualLineTerminatorsUndefined: Self = StObject.set(x, "unusualLineTerminators", js.undefined)
    
    inline def setUseShadowDOM(value: Boolean): Self = StObject.set(x, "useShadowDOM", value.asInstanceOf[js.Any])
    
    inline def setUseShadowDOMUndefined: Self = StObject.set(x, "useShadowDOM", js.undefined)
    
    inline def setUseTabStops(value: Boolean): Self = StObject.set(x, "useTabStops", value.asInstanceOf[js.Any])
    
    inline def setUseTabStopsUndefined: Self = StObject.set(x, "useTabStops", js.undefined)
    
    inline def setWordSeparators(value: String): Self = StObject.set(x, "wordSeparators", value.asInstanceOf[js.Any])
    
    inline def setWordSeparatorsUndefined: Self = StObject.set(x, "wordSeparators", js.undefined)
    
    inline def setWordWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapBreakAfterCharacters(value: String): Self = StObject.set(x, "wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
    
    inline def setWordWrapBreakAfterCharactersUndefined: Self = StObject.set(x, "wordWrapBreakAfterCharacters", js.undefined)
    
    inline def setWordWrapBreakBeforeCharacters(value: String): Self = StObject.set(x, "wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
    
    inline def setWordWrapBreakBeforeCharactersUndefined: Self = StObject.set(x, "wordWrapBreakBeforeCharacters", js.undefined)
    
    inline def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
    
    inline def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    
    inline def setWordWrapOverride1(value: off | on | inherit): Self = StObject.set(x, "wordWrapOverride1", value.asInstanceOf[js.Any])
    
    inline def setWordWrapOverride1Undefined: Self = StObject.set(x, "wordWrapOverride1", js.undefined)
    
    inline def setWordWrapOverride2(value: off | on | inherit): Self = StObject.set(x, "wordWrapOverride2", value.asInstanceOf[js.Any])
    
    inline def setWordWrapOverride2Undefined: Self = StObject.set(x, "wordWrapOverride2", js.undefined)
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    
    inline def setWrappingIndent(value: none | same | indent | deepIndent): Self = StObject.set(x, "wrappingIndent", value.asInstanceOf[js.Any])
    
    inline def setWrappingIndentUndefined: Self = StObject.set(x, "wrappingIndent", js.undefined)
    
    inline def setWrappingStrategy(value: simple | advanced): Self = StObject.set(x, "wrappingStrategy", value.asInstanceOf[js.Any])
    
    inline def setWrappingStrategyUndefined: Self = StObject.set(x, "wrappingStrategy", js.undefined)
  }
}
