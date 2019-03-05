package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor")
@js.native
object editorNs extends js.Object {
  @js.native
  class BareFontInfo () extends js.Object {
    val _bareFontInfoBrand: scala.Unit = js.native
    val fontFamily: java.lang.String = js.native
    val fontSize: scala.Double = js.native
    val fontWeight: java.lang.String = js.native
    val letterSpacing: scala.Double = js.native
    val lineHeight: scala.Double = js.native
    val zoomLevel: scala.Double = js.native
  }
  
  trait BuiltinTheme extends js.Object
  
  @js.native
  sealed trait ContentWidgetPositionPreference extends js.Object
  
  @js.native
  sealed trait CursorChangeReason extends js.Object
  
  @js.native
  sealed trait DefaultEndOfLine extends js.Object
  
  trait EditorAutoClosingStrategy extends js.Object
  
  trait EditorAutoSurroundStrategy extends js.Object
  
  trait EditorContribOptions extends js.Object {
    val acceptSuggestionOnCommitCharacter: scala.Boolean
    val acceptSuggestionOnEnter: monacoDashEditorLib.monacoDashEditorLibStrings.on | monacoDashEditorLib.monacoDashEditorLibStrings.smart | monacoDashEditorLib.monacoDashEditorLibStrings.off
    val codeActionsOnSave: ICodeActionsOnSaveOptions
    val codeActionsOnSaveTimeout: scala.Double
    val codeLens: scala.Boolean
    val colorDecorators: scala.Boolean
    val contextmenu: scala.Boolean
    val find: InternalEditorFindOptions
    val folding: scala.Boolean
    val foldingStrategy: monacoDashEditorLib.monacoDashEditorLibStrings.auto | monacoDashEditorLib.monacoDashEditorLibStrings.indentation
    val formatOnPaste: scala.Boolean
    val formatOnType: scala.Boolean
    val hover: InternalEditorHoverOptions
    val iconsInSuggestions: scala.Boolean
    val lightbulbEnabled: scala.Boolean
    val links: scala.Boolean
    val matchBrackets: scala.Boolean
    val occurrencesHighlight: scala.Boolean
    val parameterHints: InternalParameterHintOptions
    val quickSuggestions: scala.Boolean | monacoDashEditorLib.Anon_Comments
    val quickSuggestionsDelay: scala.Double
    val selectionClipboard: scala.Boolean
    val selectionHighlight: scala.Boolean
    val showFoldingControls: monacoDashEditorLib.monacoDashEditorLibStrings.always | monacoDashEditorLib.monacoDashEditorLibStrings.mouseover
    val suggest: InternalSuggestOptions
    val suggestFontSize: scala.Double
    val suggestLineHeight: scala.Double
    val suggestOnTriggerCharacters: scala.Boolean
    val suggestSelection: monacoDashEditorLib.monacoDashEditorLibStrings.first | monacoDashEditorLib.monacoDashEditorLibStrings.recentlyUsed | monacoDashEditorLib.monacoDashEditorLibStrings.recentlyUsedByPrefix
    val tabCompletion: monacoDashEditorLib.monacoDashEditorLibStrings.on | monacoDashEditorLib.monacoDashEditorLibStrings.off | monacoDashEditorLib.monacoDashEditorLibStrings.onlySnippets
    val wordBasedSuggestions: scala.Boolean
  }
  
  trait EditorLayoutInfo extends js.Object {
    /**
      * The height of the content (actual height)
      */
    val contentHeight: scala.Double
    /**
      * Left position for the content (actual text)
      */
    val contentLeft: scala.Double
    /**
      * The width of the content (actual text)
      */
    val contentWidth: scala.Double
    /**
      * The height of the line decorations.
      */
    val decorationsHeight: scala.Double
    /**
      * Left position for the line decorations.
      */
    val decorationsLeft: scala.Double
    /**
      * The width of the line decorations.
      */
    val decorationsWidth: scala.Double
    /**
      * The height of the glyph margin.
      */
    val glyphMarginHeight: scala.Double
    /**
      * Left position for the glyph margin.
      */
    val glyphMarginLeft: scala.Double
    /**
      * The width of the glyph margin.
      */
    val glyphMarginWidth: scala.Double
    /**
      * Full editor height.
      */
    val height: scala.Double
    /**
      * The height of the horizontal scrollbar.
      */
    val horizontalScrollbarHeight: scala.Double
    /**
      * The height of the line numbers.
      */
    val lineNumbersHeight: scala.Double
    /**
      * Left position for the line numbers.
      */
    val lineNumbersLeft: scala.Double
    /**
      * The width of the line numbers.
      */
    val lineNumbersWidth: scala.Double
    /**
      * The position for the minimap
      */
    val minimapLeft: scala.Double
    /**
      * The width of the minimap
      */
    val minimapWidth: scala.Double
    /**
      * The position of the overview ruler.
      */
    val overviewRuler: OverviewRulerPosition
    /**
      * Minimap render type
      */
    val renderMinimap: RenderMinimap
    /**
      * The width of the vertical scrollbar.
      */
    val verticalScrollbarWidth: scala.Double
    /**
      * The number of columns (of typical characters) fitting on a viewport line.
      */
    val viewportColumn: scala.Double
    /**
      * Full editor width.
      */
    val width: scala.Double
  }
  
  trait EditorWrappingInfo extends js.Object {
    val inDiffEditor: scala.Boolean
    val isDominatedByLongLines: scala.Boolean
    val isViewportWrapping: scala.Boolean
    val isWordWrapMinified: scala.Boolean
    val wordWrapBreakAfterCharacters: java.lang.String
    val wordWrapBreakBeforeCharacters: java.lang.String
    val wordWrapBreakObtrusiveCharacters: java.lang.String
    val wrappingColumn: scala.Double
    val wrappingIndent: WrappingIndent
  }
  
  @js.native
  sealed trait EndOfLinePreference extends js.Object
  
  @js.native
  sealed trait EndOfLineSequence extends js.Object
  
  @js.native
  class FindMatch () extends js.Object {
    var _findMatchBrand: scala.Unit = js.native
    val matches: js.Array[java.lang.String] | scala.Null = js.native
    val range: monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  }
  
  @js.native
  class FontInfo () extends BareFontInfo {
    val _editorStylingBrand: scala.Unit = js.native
    val canUseHalfwidthRightwardsArrow: scala.Boolean = js.native
    val isMonospace: scala.Boolean = js.native
    val isTrusted: scala.Boolean = js.native
    val maxDigitWidth: scala.Double = js.native
    val spaceWidth: scala.Double = js.native
    val typicalFullwidthCharacterWidth: scala.Double = js.native
    val typicalHalfwidthCharacterWidth: scala.Double = js.native
  }
  
  trait IActionDescriptor extends js.Object {
    /**
      * Control if the action should show up in the context menu and where.
      * The context menu of the editor has these default:
      *   navigation - The navigation group comes first in all cases.
      *   1_modification - This group comes next and contains commands that modify your code.
      *   9_cutcopypaste - The last default group with the basic editing commands.
      * You can also create your own group.
      * Defaults to null (don't show in context menu).
      */
    var contextMenuGroupId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Control the order in the context menu group.
      */
    var contextMenuOrder: js.UndefOr[scala.Double] = js.undefined
    /**
      * An unique identifier of the contributed action.
      */
    var id: java.lang.String
    /**
      * The keybinding rule (condition on top of precondition).
      */
    var keybindingContext: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of keybindings for the action.
      */
    var keybindings: js.UndefOr[js.Array[scala.Double]] = js.undefined
    /**
      * A label of the action that will be presented to the user.
      */
    var label: java.lang.String
    /**
      * Precondition rule.
      */
    var precondition: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Method that will be executed when the action is triggered.
      * @param editor The editor instance is passed in as a convenience
      */
    def run(editor: ICodeEditor): scala.Unit | js.Promise[scala.Unit]
  }
  
  trait IChange extends js.Object {
    val modifiedEndLineNumber: scala.Double
    val modifiedStartLineNumber: scala.Double
    val originalEndLineNumber: scala.Double
    val originalStartLineNumber: scala.Double
  }
  
  trait ICharChange extends IChange {
    val modifiedEndColumn: scala.Double
    val modifiedStartColumn: scala.Double
    val originalEndColumn: scala.Double
    val originalStartColumn: scala.Double
  }
  
  trait ICodeActionsOnSaveOptions
    extends /* kind */ org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  @js.native
  trait ICodeEditor extends IEditor {
    /**
      * Add a content widget. Widgets must have unique ids, otherwise they will be overwritten.
      */
    def addContentWidget(widget: IContentWidget): scala.Unit = js.native
    /**
      * Add an overlay widget. Widgets must have unique ids, otherwise they will be overwritten.
      */
    def addOverlayWidget(widget: IOverlayWidget): scala.Unit = js.native
    /**
      * Apply the same font settings as the editor to `target`.
      */
    def applyFontInfo(target: stdLib.HTMLElement): scala.Unit = js.native
    /**
      * Change the view zones. View zones are lost when a new model is attached to the editor.
      */
    def changeViewZones(callback: js.Function1[/* accessor */ IViewZoneChangeAccessor, scala.Unit]): scala.Unit = js.native
    /**
      * All decorations added through this call will get the ownerId of this editor.
      * @see `ITextModel.deltaDecorations`
      */
    def deltaDecorations(oldDecorations: js.Array[java.lang.String], newDecorations: js.Array[IModelDeltaDecoration]): js.Array[java.lang.String] = js.native
    /**
      * Execute a command on the editor.
      * The edits will land on the undo-redo stack, but no "undo stop" will be pushed.
      * @param source The source of the call.
      * @param command The command to execute
      */
    def executeCommand(source: java.lang.String, command: ICommand): scala.Unit = js.native
    /**
      * Execute multiple (concomitant) commands on the editor.
      * @param source The source of the call.
      * @param command The commands to execute
      */
    def executeCommands(source: java.lang.String, commands: js.Array[ICommand | scala.Null]): scala.Unit = js.native
    /**
      * Execute edits on the editor.
      * The edits will land on the undo-redo stack, but no "undo stop" will be pushed.
      * @param source The source of the call.
      * @param edits The edits to execute.
      * @param endCursorState Cursor state after the edits were applied.
      */
    def executeEdits(source: java.lang.String, edits: js.Array[IIdentifiedSingleEditOperation]): scala.Boolean = js.native
    def executeEdits(
      source: java.lang.String,
      edits: js.Array[IIdentifiedSingleEditOperation],
      endCursorState: js.Array[monacoDashEditorLib.monacoDashEditorMod.Selection]
    ): scala.Boolean = js.native
    /**
      * Get an action that is a contribution to this editor.
      * @id Unique identifier of the contribution.
      * @return The action or null if action not found.
      */
    def getAction(id: java.lang.String): IEditorAction = js.native
    /**
      * Returns the current editor's configuration
      */
    def getConfiguration(): InternalEditorOptions = js.native
    /**
      * Get a contribution of this editor.
      * @id Unique identifier of the contribution.
      * @return The contribution or null if contribution not found.
      */
    def getContribution[T /* <: IEditorContribution */](id: java.lang.String): T = js.native
    /**
      * Returns the editor's dom node
      */
    def getDomNode(): stdLib.HTMLElement | scala.Null = js.native
    /**
      * Get the layout info for the editor.
      */
    def getLayoutInfo(): EditorLayoutInfo = js.native
    /**
      * Get all the decorations on a line (filtering out decorations from other editors).
      */
    def getLineDecorations(lineNumber: scala.Double): js.Array[IModelDecoration] | scala.Null = js.native
    /**
      * Get the horizontal position (left offset) for the column w.r.t to the beginning of the line.
      * This method works only if the line `lineNumber` is currently rendered (in the editor's viewport).
      * Use this method with caution.
      */
    def getOffsetForColumn(lineNumber: scala.Double, column: scala.Double): scala.Double = js.native
    /**
      * Get the scrollHeight of the editor's viewport.
      */
    def getScrollHeight(): scala.Double = js.native
    /**
      * Get the scrollLeft of the editor's viewport.
      */
    def getScrollLeft(): scala.Double = js.native
    /**
      * Get the scrollTop of the editor's viewport.
      */
    def getScrollTop(): scala.Double = js.native
    /**
      * Get the scrollWidth of the editor's viewport.
      */
    def getScrollWidth(): scala.Double = js.native
    /**
      * Get the visible position for `position`.
      * The result position takes scrolling into account and is relative to the top left corner of the editor.
      * Explanation 1: the results of this method will change for the same `position` if the user scrolls the editor.
      * Explanation 2: the results of this method will not change if the container of the editor gets repositioned.
      * Warning: the results of this method are inaccurate for positions that are outside the current editor viewport.
      */
    def getScrolledVisiblePosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): monacoDashEditorLib.Anon_Height | scala.Null = js.native
    /**
      * Get the hit test target at coordinates `clientX` and `clientY`.
      * The coordinates are relative to the top-left of the viewport.
      *
      * @returns Hit test target or null if the coordinates fall outside the editor or the editor has no model.
      */
    def getTargetAtClientPoint(clientX: scala.Double, clientY: scala.Double): IMouseTarget | scala.Null = js.native
    /**
      * Get the vertical position (top offset) for the line w.r.t. to the first line.
      */
    def getTopForLineNumber(lineNumber: scala.Double): scala.Double = js.native
    /**
      * Get the vertical position (top offset) for the position w.r.t. to the first line.
      */
    def getTopForPosition(lineNumber: scala.Double, column: scala.Double): scala.Double = js.native
    /**
      * Get value of the current model attached to this editor.
      * @see `ITextModel.getValue`
      */
    def getValue(): java.lang.String = js.native
    def getValue(options: monacoDashEditorLib.Anon_LineEnding): java.lang.String = js.native
    /**
      * Returns the ranges that are currently visible.
      * Does not account for horizontal scrolling.
      */
    def getVisibleRanges(): js.Array[monacoDashEditorLib.monacoDashEditorMod.Range] = js.native
    /**
      * Returns true if the text inside this editor or an editor widget has focus.
      */
    def hasWidgetFocus(): scala.Boolean = js.native
    /**
      * Layout/Reposition a content widget. This is a ping to the editor to call widget.getPosition()
      * and update appropriately.
      */
    def layoutContentWidget(widget: IContentWidget): scala.Unit = js.native
    /**
      * Layout/Reposition an overlay widget. This is a ping to the editor to call widget.getPosition()
      * and update appropriately.
      */
    def layoutOverlayWidget(widget: IOverlayWidget): scala.Unit = js.native
    /**
      * An event emitted after composition has ended.
      */
    def onCompositionEnd(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted after composition has started.
      */
    def onCompositionStart(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "contextmenu".
      * @event
      */
    def onContextMenu(listener: js.Function1[/* e */ IEditorMouseEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the text inside this editor lost focus (i.e. cursor stops blinking).
      * @event
      */
    def onDidBlurEditorText(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the text inside this editor or an editor widget lost focus.
      * @event
      */
    def onDidBlurEditorWidget(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the configuration of the editor has changed. (e.g. `editor.updateOptions()`)
      * @event
      */
    def onDidChangeConfiguration(listener: js.Function1[/* e */ IConfigurationChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the cursor position has changed.
      * @event
      */
    def onDidChangeCursorPosition(listener: js.Function1[/* e */ ICursorPositionChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the cursor selection has changed.
      * @event
      */
    def onDidChangeCursorSelection(listener: js.Function1[/* e */ ICursorSelectionChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the model of this editor has changed (e.g. `editor.setModel()`).
      * @event
      */
    def onDidChangeModel(listener: js.Function1[/* e */ IModelChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the content of the current model has changed.
      * @event
      */
    def onDidChangeModelContent(listener: js.Function1[/* e */ IModelContentChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the decorations of the current model have changed.
      * @event
      */
    def onDidChangeModelDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the language of the current model has changed.
      * @event
      */
    def onDidChangeModelLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the language configuration of the current model has changed.
      * @event
      */
    def onDidChangeModelLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the options of the current model has changed.
      * @event
      */
    def onDidChangeModelOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the text inside this editor gained focus (i.e. cursor starts blinking).
      * @event
      */
    def onDidFocusEditorText(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the text inside this editor or an editor widget gained focus.
      * @event
      */
    def onDidFocusEditorWidget(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the layout of the editor has changed.
      * @event
      */
    def onDidLayoutChange(listener: js.Function1[/* e */ EditorLayoutInfo, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the scroll in the editor has changed.
      * @event
      */
    def onDidScrollChange(listener: js.Function1[/* e */ monacoDashEditorLib.monacoDashEditorMod.IScrollEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "keydown".
      * @event
      */
    def onKeyDown(listener: js.Function1[/* e */ monacoDashEditorLib.monacoDashEditorMod.IKeyboardEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "keyup".
      * @event
      */
    def onKeyUp(listener: js.Function1[/* e */ monacoDashEditorLib.monacoDashEditorMod.IKeyboardEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "mousedown".
      * @event
      */
    def onMouseDown(listener: js.Function1[/* e */ IEditorMouseEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "mouseleave".
      * @event
      */
    def onMouseLeave(listener: js.Function1[/* e */ IPartialEditorMouseEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "mousemove".
      * @event
      */
    def onMouseMove(listener: js.Function1[/* e */ IEditorMouseEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted on a "mouseup".
      * @event
      */
    def onMouseUp(listener: js.Function1[/* e */ IEditorMouseEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * Push an "undo stop" in the undo-redo stack.
      */
    def pushUndoStop(): scala.Boolean = js.native
    /**
      * Remove a content widget.
      */
    def removeContentWidget(widget: IContentWidget): scala.Unit = js.native
    /**
      * Remove an overlay widget.
      */
    def removeOverlayWidget(widget: IOverlayWidget): scala.Unit = js.native
    /**
      * Force an editor render now.
      */
    def render(): scala.Unit = js.native
    def render(forceRedraw: scala.Boolean): scala.Unit = js.native
    /**
      * Restores the view state of the editor from a serializable object generated by `saveViewState`.
      */
    def restoreViewState(state: ICodeEditorViewState): scala.Unit = js.native
    /**
      * Sets the current model attached to this editor.
      * If the previous model was created by the editor via the value key in the options
      * literal object, it will be destroyed. Otherwise, if the previous model was set
      * via setModel, or the model key in the options literal object, the previous model
      * will not be destroyed.
      * It is safe to call setModel(null) to simply detach the current model from the editor.
      */
    def setModel(model: ITextModel): scala.Unit = js.native
    /**
      * Change the scrollLeft of the editor's viewport.
      */
    def setScrollLeft(newScrollLeft: scala.Double): scala.Unit = js.native
    /**
      * Change the scroll position of the editor's viewport.
      */
    def setScrollPosition(position: INewScrollPosition): scala.Unit = js.native
    /**
      * Change the scrollTop of the editor's viewport.
      */
    def setScrollTop(newScrollTop: scala.Double): scala.Unit = js.native
    /**
      * Set the value of the current model attached to this editor.
      * @see `ITextModel.setValue`
      */
    def setValue(newValue: java.lang.String): scala.Unit = js.native
  }
  
  trait ICodeEditorViewState extends IEditorViewState {
    var contributionsState: org.scalablytyped.runtime.StringDictionary[js.Any]
    var cursorState: js.Array[ICursorState]
    var viewState: IViewState
  }
  
  trait IColorizerElementOptions extends IColorizerOptions {
    var mimeType: js.UndefOr[java.lang.String] = js.undefined
    var theme: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IColorizerOptions extends js.Object {
    var tabSize: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IColors
    extends /* colorId */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  trait ICommand extends js.Object {
    /**
      * Compute the cursor state after the edit operations were applied.
      * @param model The model the command has executed on.
      * @param helper A helper to get inverse edit operations and to get previously tracked selections.
      * @return The cursor state after the command executed.
      */
    def computeCursorState(model: ITextModel, helper: ICursorStateComputerData): monacoDashEditorLib.monacoDashEditorMod.Selection
    /**
      * Get the edit operations needed to execute this command.
      * @param model The model the command will execute on.
      * @param builder A helper to collect the needed edit operations and to track selections.
      */
    def getEditOperations(model: ITextModel, builder: IEditOperationBuilder): scala.Unit
  }
  
  trait IConfigurationChangedEvent extends js.Object {
    val accessibilitySupport: scala.Boolean
    val autoClosingBrackets: scala.Boolean
    val autoClosingQuotes: scala.Boolean
    val autoIndent: scala.Boolean
    val autoSurround: scala.Boolean
    val canUseLayerHinting: scala.Boolean
    val contribInfo: scala.Boolean
    val copyWithSyntaxHighlighting: scala.Boolean
    val dragAndDrop: scala.Boolean
    val editorClassName: scala.Boolean
    val emptySelectionClipboard: scala.Boolean
    val fontInfo: scala.Boolean
    val layoutInfo: scala.Boolean
    val lineHeight: scala.Boolean
    val multiCursorMergeOverlapping: scala.Boolean
    val multiCursorModifier: scala.Boolean
    val pixelRatio: scala.Boolean
    val readOnly: scala.Boolean
    val tabFocusMode: scala.Boolean
    val useTabStops: scala.Boolean
    val viewInfo: scala.Boolean
    val wordSeparators: scala.Boolean
    val wrappingInfo: scala.Boolean
  }
  
  trait IContentWidget extends js.Object {
    /**
      * Render this content widget in a location where it could overflow the editor's view dom node.
      */
    var allowEditorOverflow: js.UndefOr[scala.Boolean] = js.undefined
    var suppressMouseDown: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Get the dom node of the content widget.
      */
    def getDomNode(): stdLib.HTMLElement
    /**
      * Get a unique identifier of the content widget.
      */
    def getId(): java.lang.String
    /**
      * Get the placement of the content widget.
      * If null is returned, the content widget will be placed off screen.
      */
    def getPosition(): IContentWidgetPosition | scala.Null
  }
  
  trait IContentWidgetPosition extends js.Object {
    /**
      * Desired position for the content widget.
      * `preference` will also affect the placement.
      */
    var position: monacoDashEditorLib.monacoDashEditorMod.IPosition | scala.Null
    /**
      * Placement preference for position, in order of preference.
      */
    var preference: js.Array[ContentWidgetPositionPreference]
    /**
      * Optionally, a range can be provided to further
      * define the position of the content widget.
      */
    var range: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.IRange | scala.Null] = js.undefined
  }
  
  trait IContextKey[T] extends js.Object {
    def get(): js.UndefOr[T]
    def reset(): scala.Unit
    def set(value: T): scala.Unit
  }
  
  trait ICursorPositionChangedEvent extends js.Object {
    /**
      * Primary cursor's position.
      */
    val position: monacoDashEditorLib.monacoDashEditorMod.Position
    /**
      * Reason.
      */
    val reason: CursorChangeReason
    /**
      * Secondary cursors' position.
      */
    val secondaryPositions: js.Array[monacoDashEditorLib.monacoDashEditorMod.Position]
    /**
      * Source of the call that caused the event.
      */
    val source: java.lang.String
  }
  
  trait ICursorSelectionChangedEvent extends js.Object {
    /**
      * Reason.
      */
    val reason: CursorChangeReason
    /**
      * The secondary selections.
      */
    val secondarySelections: js.Array[monacoDashEditorLib.monacoDashEditorMod.Selection]
    /**
      * The primary selection.
      */
    val selection: monacoDashEditorLib.monacoDashEditorMod.Selection
    /**
      * Source of the call that caused the event.
      */
    val source: java.lang.String
  }
  
  trait ICursorState extends js.Object {
    var inSelectionMode: scala.Boolean
    var position: monacoDashEditorLib.monacoDashEditorMod.IPosition
    var selectionStart: monacoDashEditorLib.monacoDashEditorMod.IPosition
  }
  
  trait ICursorStateComputerData extends js.Object {
    /**
      * Get the inverse edit operations of the added edit operations.
      */
    def getInverseEditOperations(): js.Array[IIdentifiedSingleEditOperation]
    /**
      * Get a previously tracked selection.
      * @param id The unique identifier returned by `trackSelection`.
      * @return The selection.
      */
    def getTrackedSelection(id: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.Selection
  }
  
  @js.native
  trait IDiffEditor extends IEditor {
    /**
      * Get information based on computed diff about a line number from the modified model.
      * If the diff computation is not finished or the model is missing, will return null.
      */
    def getDiffLineInformationForModified(lineNumber: scala.Double): IDiffLineInformation | scala.Null = js.native
    /**
      * Get information based on computed diff about a line number from the original model.
      * If the diff computation is not finished or the model is missing, will return null.
      */
    def getDiffLineInformationForOriginal(lineNumber: scala.Double): IDiffLineInformation | scala.Null = js.native
    /**
      * @see ICodeEditor.getDomNode
      */
    def getDomNode(): stdLib.HTMLElement = js.native
    /**
      * Get the computed diff information.
      */
    def getLineChanges(): js.Array[ILineChange] | scala.Null = js.native
    /**
      * Get the `modified` editor.
      */
    def getModifiedEditor(): ICodeEditor = js.native
    /**
      * Get the `original` editor.
      */
    def getOriginalEditor(): ICodeEditor = js.native
    /**
      * An event emitted when the diff information computed by this diff editor has been updated.
      * @event
      */
    def onDidUpdateDiff(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * Restores the view state of the editor from a serializable object generated by `saveViewState`.
      */
    def restoreViewState(state: IDiffEditorViewState): scala.Unit = js.native
    /**
      * Sets the current model attached to this editor.
      * If the previous model was created by the editor via the value key in the options
      * literal object, it will be destroyed. Otherwise, if the previous model was set
      * via setModel, or the model key in the options literal object, the previous model
      * will not be destroyed.
      * It is safe to call setModel(null) to simply detach the current model from the editor.
      */
    def setModel(model: IDiffEditorModel): scala.Unit = js.native
  }
  
  trait IDiffEditorConstructionOptions extends IDiffEditorOptions {
    /**
      * Initial theme to be used for rendering.
      * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
      * You can create custom themes via `monaco.editor.defineTheme`.
      * To switch a theme, use `monaco.editor.setTheme`
      */
    var theme: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IDiffEditorModel extends IEditorModel {
    /**
      * Modified model.
      */
    var modified: ITextModel
    /**
      * Original model.
      */
    var original: ITextModel
  }
  
  trait IDiffEditorOptions extends IEditorOptions {
    /**
      * Allow the user to resize the diff editor split view.
      * Defaults to true.
      */
    var enableSplitViewResizing: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Compute the diff by ignoring leading/trailing whitespace
      * Defaults to true.
      */
    var ignoreTrimWhitespace: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Original model should be editable?
      * Defaults to false.
      */
    var originalEditable: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Render +/- indicators for added/deleted changes.
      * Defaults to true.
      */
    var renderIndicators: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Render the differences in two side-by-side editors.
      * Defaults to true.
      */
    var renderSideBySide: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IDiffEditorViewState extends IEditorViewState {
    var modified: ICodeEditorViewState | scala.Null
    var original: ICodeEditorViewState | scala.Null
  }
  
  trait IDiffLineInformation extends js.Object {
    val equivalentLineNumber: scala.Double
  }
  
  trait IDiffNavigator extends js.Object {
    def canNavigate(): scala.Boolean
    def dispose(): scala.Unit
    def next(): scala.Unit
    def previous(): scala.Unit
  }
  
  trait IDiffNavigatorOptions extends js.Object {
    val alwaysRevealFirst: js.UndefOr[scala.Boolean] = js.undefined
    val followsCaret: js.UndefOr[scala.Boolean] = js.undefined
    val ignoreCharChanges: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IDimension extends js.Object {
    var height: scala.Double
    var width: scala.Double
  }
  
  @js.native
  trait IEditOperationBuilder extends js.Object {
    def addEditOperation(range: monacoDashEditorLib.monacoDashEditorMod.Range): scala.Unit = js.native
    /**
      * Add a new edit operation (a replace operation).
      * @param range The range to replace (delete). May be empty to represent a simple insert.
      * @param text The text to replace with. May be null to represent a simple delete.
      */
    def addEditOperation(range: monacoDashEditorLib.monacoDashEditorMod.Range, text: java.lang.String): scala.Unit = js.native
    def addTrackedEditOperation(range: monacoDashEditorLib.monacoDashEditorMod.Range): scala.Unit = js.native
    /**
      * Add a new edit operation (a replace operation).
      * The inverse edits will be accessible in `ICursorStateComputerData.getInverseEditOperations()`
      * @param range The range to replace (delete). May be empty to represent a simple insert.
      * @param text The text to replace with. May be null to represent a simple delete.
      */
    def addTrackedEditOperation(range: monacoDashEditorLib.monacoDashEditorMod.Range, text: java.lang.String): scala.Unit = js.native
    /**
      * Track `selection` when applying edit operations.
      * A best effort will be made to not grow/expand the selection.
      * An empty selection will clamp to a nearby character.
      * @param selection The selection to track.
      * @param trackPreviousOnEmpty If set, and the selection is empty, indicates whether the selection
      *           should clamp to the previous or the next character.
      * @return A unique identifier.
      */
    def trackSelection(selection: monacoDashEditorLib.monacoDashEditorMod.Selection): java.lang.String = js.native
    def trackSelection(selection: monacoDashEditorLib.monacoDashEditorMod.Selection, trackPreviousOnEmpty: scala.Boolean): java.lang.String = js.native
  }
  
  @js.native
  trait IEditor extends js.Object {
    /**
      * Dispose the editor.
      */
    def dispose(): scala.Unit = js.native
    /**
      * Brings browser focus to the editor text
      */
    def focus(): scala.Unit = js.native
    /**
      * Get the editor type. Please see `EditorType`.
      * This is to avoid an instanceof check
      */
    def getEditorType(): java.lang.String = js.native
    /**
      * Get a unique id for this editor instance.
      */
    def getId(): java.lang.String = js.native
    /**
      * Gets the current model attached to this editor.
      */
    def getModel(): IEditorModel | scala.Null = js.native
    /**
      * Returns the primary position of the cursor.
      */
    def getPosition(): monacoDashEditorLib.monacoDashEditorMod.Position | scala.Null = js.native
    /**
      * Returns the primary selection of the editor.
      */
    def getSelection(): monacoDashEditorLib.monacoDashEditorMod.Selection | scala.Null = js.native
    /**
      * Returns all the selections of the editor.
      */
    def getSelections(): js.Array[monacoDashEditorLib.monacoDashEditorMod.Selection] | scala.Null = js.native
    /**
      * Returns all actions associated with this editor.
      */
    def getSupportedActions(): js.Array[IEditorAction] = js.native
    /**
      * Given a position, returns a column number that takes tab-widths into account.
      */
    def getVisibleColumnFromPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): scala.Double = js.native
    /**
      * Returns true if the text inside this editor is focused (i.e. cursor is blinking).
      */
    def hasTextFocus(): scala.Boolean = js.native
    /**
      * Instructs the editor to remeasure its container. This method should
      * be called when the container of the editor gets resized.
      */
    def layout(): scala.Unit = js.native
    def layout(dimension: IDimension): scala.Unit = js.native
    /**
      * An event emitted when the editor has been disposed.
      * @event
      */
    def onDidDispose(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * Restores the view state of the editor from a serializable object generated by `saveViewState`.
      */
    def restoreViewState(state: IEditorViewState): scala.Unit = js.native
    /**
      * Scroll vertically as necessary and reveal a line.
      */
    def revealLine(lineNumber: scala.Double): scala.Unit = js.native
    def revealLine(lineNumber: scala.Double, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically as necessary and reveal a line centered vertically.
      */
    def revealLineInCenter(lineNumber: scala.Double): scala.Unit = js.native
    def revealLineInCenter(lineNumber: scala.Double, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically as necessary and reveal a line centered vertically only if it lies outside the viewport.
      */
    def revealLineInCenterIfOutsideViewport(lineNumber: scala.Double): scala.Unit = js.native
    def revealLineInCenterIfOutsideViewport(lineNumber: scala.Double, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically as necessary and reveal lines.
      */
    def revealLines(startLineNumber: scala.Double, endLineNumber: scala.Double): scala.Unit = js.native
    def revealLines(startLineNumber: scala.Double, endLineNumber: scala.Double, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically as necessary and reveal lines centered vertically.
      */
    def revealLinesInCenter(lineNumber: scala.Double, endLineNumber: scala.Double): scala.Unit = js.native
    def revealLinesInCenter(lineNumber: scala.Double, endLineNumber: scala.Double, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically as necessary and reveal lines centered vertically only if it lies outside the viewport.
      */
    def revealLinesInCenterIfOutsideViewport(lineNumber: scala.Double, endLineNumber: scala.Double): scala.Unit = js.native
    def revealLinesInCenterIfOutsideViewport(lineNumber: scala.Double, endLineNumber: scala.Double, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a position.
      */
    def revealPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): scala.Unit = js.native
    def revealPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a position centered vertically.
      */
    def revealPositionInCenter(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): scala.Unit = js.native
    def revealPositionInCenter(position: monacoDashEditorLib.monacoDashEditorMod.IPosition, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a position centered vertically only if it lies outside the viewport.
      */
    def revealPositionInCenterIfOutsideViewport(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): scala.Unit = js.native
    def revealPositionInCenterIfOutsideViewport(position: monacoDashEditorLib.monacoDashEditorMod.IPosition, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range.
      */
    def revealRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Unit = js.native
    def revealRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range at the top of the viewport.
      */
    def revealRangeAtTop(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Unit = js.native
    def revealRangeAtTop(range: monacoDashEditorLib.monacoDashEditorMod.IRange, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range centered vertically.
      */
    def revealRangeInCenter(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Unit = js.native
    def revealRangeInCenter(range: monacoDashEditorLib.monacoDashEditorMod.IRange, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range centered vertically only if it lies outside the viewport.
      */
    def revealRangeInCenterIfOutsideViewport(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Unit = js.native
    def revealRangeInCenterIfOutsideViewport(range: monacoDashEditorLib.monacoDashEditorMod.IRange, scrollType: ScrollType): scala.Unit = js.native
    /**
      * Saves current view state of the editor in a serializable object.
      */
    def saveViewState(): IEditorViewState | scala.Null = js.native
    def setModel(): scala.Unit = js.native
    /**
      * Sets the current model attached to this editor.
      * If the previous model was created by the editor via the value key in the options
      * literal object, it will be destroyed. Otherwise, if the previous model was set
      * via setModel, or the model key in the options literal object, the previous model
      * will not be destroyed.
      * It is safe to call setModel(null) to simply detach the current model from the editor.
      */
    def setModel(model: IEditorModel): scala.Unit = js.native
    /**
      * Set the primary position of the cursor. This will remove any secondary cursors.
      * @param position New primary cursor's position
      */
    def setPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): scala.Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: monacoDashEditorLib.monacoDashEditorMod.ISelection): scala.Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: monacoDashEditorLib.monacoDashEditorMod.Range): scala.Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: monacoDashEditorLib.monacoDashEditorMod.Selection): scala.Unit = js.native
    /**
      * Set the selections for all the cursors of the editor.
      * Cursors will be removed or added, as necessary.
      */
    def setSelections(selections: js.Array[monacoDashEditorLib.monacoDashEditorMod.ISelection]): scala.Unit = js.native
    /**
      * Directly trigger a handler or an editor action.
      * @param source The source of the call.
      * @param handlerId The id of the handler or the id of a contribution.
      * @param payload Extra data to be sent to the handler.
      */
    def trigger(source: java.lang.String, handlerId: java.lang.String, payload: js.Any): scala.Unit = js.native
    /**
      * Update the editor's options after the editor has been created.
      */
    def updateOptions(newOptions: IEditorOptions): scala.Unit = js.native
  }
  
  trait IEditorAction extends js.Object {
    val alias: java.lang.String
    val id: java.lang.String
    val label: java.lang.String
    def isSupported(): scala.Boolean
    def run(): js.Promise[scala.Unit]
  }
  
  trait IEditorConstructionOptions extends IEditorOptions {
    /**
      * An URL to open when Ctrl+H (Windows and Linux) or Cmd+H (OSX) is pressed in
      * the accessibility help dialog in the editor.
      *
      * Defaults to "https://go.microsoft.com/fwlink/?linkid=852450"
      */
    var accessibilityHelpUrl: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The initial language of the auto created model in the editor.
      * To not create automatically a model, use `model: null`.
      */
    var language: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The initial model associated with this code editor.
      */
    var model: js.UndefOr[ITextModel | scala.Null] = js.undefined
    /**
      * Initial theme to be used for rendering.
      * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
      * You can create custom themes via `monaco.editor.defineTheme`.
      * To switch a theme, use `monaco.editor.setTheme`
      */
    var theme: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The initial value of the auto created model in the editor.
      * To not create automatically a model, use `model: null`.
      */
    var value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IEditorContribution extends js.Object {
    /**
      * Restore view state.
      */
    var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, scala.Unit]] = js.undefined
    /**
      * Store view state.
      */
    var saveViewState: js.UndefOr[js.Function0[_]] = js.undefined
    /**
      * Dispose this contribution.
      */
    def dispose(): scala.Unit
    /**
      * Get a unique identifier for this contribution.
      */
    def getId(): java.lang.String
  }
  
  trait IEditorFindOptions extends js.Object {
    var addExtraSpaceOnTop: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Controls if Find in Selection flag is turned on when multiple lines of text are selected in the editor.
      */
    var autoFindInSelection: scala.Boolean
    /**
      * Controls if we seed search string in the Find Widget with editor selection.
      */
    var seedSearchStringFromSelection: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IEditorHoverOptions extends js.Object {
    /**
      * Delay for showing the hover.
      * Defaults to 300.
      */
    var delay: js.UndefOr[scala.Double] = js.undefined
    /**
      * Enable the hover.
      * Defaults to true.
      */
    var enabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Is the hover sticky such that it can be clicked and its contents selected?
      * Defaults to true.
      */
    var sticky: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IEditorLightbulbOptions extends js.Object {
    /**
      * Enable the lightbulb code action.
      * Defaults to true.
      */
    var enabled: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IEditorMinimapOptions extends js.Object {
    /**
      * Enable the rendering of the minimap.
      * Defaults to true.
      */
    var enabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Limit the width of the minimap to render at most a certain number of columns.
      * Defaults to 120.
      */
    var maxColumn: js.UndefOr[scala.Double] = js.undefined
    /**
      * Render the actual text on a line (as opposed to color blocks).
      * Defaults to true.
      */
    var renderCharacters: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Control the rendering of the minimap slider.
      * Defaults to 'mouseover'.
      */
    var showSlider: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.always | monacoDashEditorLib.monacoDashEditorLibStrings.mouseover
      ] = js.undefined
    /**
      * Control the side of the minimap in editor.
      * Defaults to 'right'.
      */
    var side: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.right | monacoDashEditorLib.monacoDashEditorLibStrings.left
      ] = js.undefined
  }
  
  trait IEditorModel extends js.Object
  
  trait IEditorMouseEvent extends js.Object {
    val event: monacoDashEditorLib.monacoDashEditorMod.IMouseEvent
    val target: IMouseTarget
  }
  
  trait IEditorOptions extends js.Object {
    /**
      * Accept suggestions on provider defined characters.
      * Defaults to true.
      */
    var acceptSuggestionOnCommitCharacter: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Accept suggestions on ENTER.
      * Defaults to 'on'.
      */
    var acceptSuggestionOnEnter: js.UndefOr[
        scala.Boolean | monacoDashEditorLib.monacoDashEditorLibStrings.on | monacoDashEditorLib.monacoDashEditorLibStrings.smart | monacoDashEditorLib.monacoDashEditorLibStrings.off
      ] = js.undefined
    /**
      * Configure the editor's accessibility support.
      * Defaults to 'auto'. It is best to leave this to 'auto'.
      */
    var accessibilitySupport: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.auto | monacoDashEditorLib.monacoDashEditorLibStrings.off | monacoDashEditorLib.monacoDashEditorLibStrings.on
      ] = js.undefined
    /**
      * The aria label for the editor's textarea (when it is focused).
      */
    var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Options for auto closing brackets.
      * Defaults to language defined behavior.
      */
    var autoClosingBrackets: js.UndefOr[EditorAutoClosingStrategy] = js.undefined
    /**
      * Options for auto closing quotes.
      * Defaults to language defined behavior.
      */
    var autoClosingQuotes: js.UndefOr[EditorAutoClosingStrategy] = js.undefined
    /**
      * Enable auto indentation adjustment.
      * Defaults to false.
      */
    var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
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
    var automaticLayout: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Code action kinds to be run on save.
      */
    var codeActionsOnSave: js.UndefOr[ICodeActionsOnSaveOptions] = js.undefined
    /**
      * Timeout for running code actions on save.
      */
    var codeActionsOnSaveTimeout: js.UndefOr[scala.Double] = js.undefined
    /**
      * Show code lens
      * Defaults to true.
      */
    var codeLens: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable inline color decorators and color picker rendering.
      */
    var colorDecorators: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable custom contextmenu.
      * Defaults to true.
      */
    var contextmenu: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Syntax highlighting is copied.
      */
    var copyWithSyntaxHighlighting: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Control the cursor animation style, possible values are 'blink', 'smooth', 'phase', 'expand' and 'solid'.
      * Defaults to 'blink'.
      */
    var cursorBlinking: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Enable smooth caret animation.
      * Defaults to false.
      */
    var cursorSmoothCaretAnimation: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Control the cursor style, either 'block' or 'line'.
      * Defaults to 'line'.
      */
    var cursorStyle: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Control the width of the cursor when cursorStyle is set to 'line'
      */
    var cursorWidth: js.UndefOr[scala.Double] = js.undefined
    /**
      * Disable the use of `will-change` for the editor margin and lines layers.
      * The usage of `will-change` acts as a hint for browsers to create an extra layer.
      * Defaults to false.
      */
    var disableLayerHinting: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Disable the optimizations for monospace fonts.
      * Defaults to false.
      */
    var disableMonospaceOptimizations: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Controls if the editor should allow to move selections via drag and drop.
      * Defaults to false.
      */
    var dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Copying without a selection copies the current line.
      */
    var emptySelectionClipboard: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Class name to be added to the editor.
      */
    var extraEditorClassName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * FastScrolling mulitplier speed when pressing `Alt`
      * Defaults to 5.
      */
    var fastScrollSensitivity: js.UndefOr[scala.Double] = js.undefined
    /**
      * Control the behavior of the find widget.
      */
    var find: js.UndefOr[IEditorFindOptions] = js.undefined
    /**
      * Display overflow widgets as `fixed`.
      * Defaults to `false`.
      */
    var fixedOverflowWidgets: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable code folding
      * Defaults to true.
      */
    var folding: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Selects the folding strategy. 'auto' uses the strategies contributed for the current document, 'indentation' uses the indentation based folding strategy.
      * Defaults to 'auto'.
      */
    var foldingStrategy: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.auto | monacoDashEditorLib.monacoDashEditorLibStrings.indentation
      ] = js.undefined
    /**
      * The font family
      */
    var fontFamily: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Enable font ligatures.
      * Defaults to false.
      */
    var fontLigatures: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The font size
      */
    var fontSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The font weight
      */
    var fontWeight: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.normal | monacoDashEditorLib.monacoDashEditorLibStrings.bold | monacoDashEditorLib.monacoDashEditorLibStrings.bolder | monacoDashEditorLib.monacoDashEditorLibStrings.lighter | monacoDashEditorLib.monacoDashEditorLibStrings.initial | monacoDashEditorLib.monacoDashEditorLibStrings.inherit | monacoDashEditorLib.monacoDashEditorLibStrings.`100` | monacoDashEditorLib.monacoDashEditorLibStrings.`200` | monacoDashEditorLib.monacoDashEditorLibStrings.`300` | monacoDashEditorLib.monacoDashEditorLibStrings.`400` | monacoDashEditorLib.monacoDashEditorLibStrings.`500` | monacoDashEditorLib.monacoDashEditorLibStrings.`600` | monacoDashEditorLib.monacoDashEditorLibStrings.`700` | monacoDashEditorLib.monacoDashEditorLibStrings.`800` | monacoDashEditorLib.monacoDashEditorLibStrings.`900`
      ] = js.undefined
    /**
      * Enable format on paste.
      * Defaults to false.
      */
    var formatOnPaste: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable format on type.
      * Defaults to false.
      */
    var formatOnType: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable the rendering of the glyph margin.
      * Defaults to true in vscode and to false in monaco-editor.
      */
    var glyphMargin: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Should the cursor be hidden in the overview ruler.
      * Defaults to false.
      */
    var hideCursorInOverviewRuler: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable highlighting of the active indent guide.
      * Defaults to true.
      */
    var highlightActiveIndentGuide: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Configure the editor's hover.
      */
    var hover: js.UndefOr[IEditorHoverOptions] = js.undefined
    /**
      * Render icons in suggestions box.
      * Defaults to true.
      */
    var iconsInSuggestions: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The letter spacing
      */
    var letterSpacing: js.UndefOr[scala.Double] = js.undefined
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
    var lineDecorationsWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    /**
      * The line height
      */
    var lineHeight: js.UndefOr[scala.Double] = js.undefined
    /**
      * Control the rendering of line numbers.
      * If it is a function, it will be invoked when rendering a line number and the return value will be rendered.
      * Otherwise, if it is a truey, line numbers will be rendered normally (equivalent of using an identity function).
      * Otherwise, line numbers will not be rendered.
      * Defaults to true.
      */
    var lineNumbers: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.on | monacoDashEditorLib.monacoDashEditorLibStrings.off | monacoDashEditorLib.monacoDashEditorLibStrings.relative | monacoDashEditorLib.monacoDashEditorLibStrings.interval | (js.Function1[/* lineNumber */ scala.Double, java.lang.String])
      ] = js.undefined
    /**
      * Control the width of line numbers, by reserving horizontal space for rendering at least an amount of digits.
      * Defaults to 5.
      */
    var lineNumbersMinChars: js.UndefOr[scala.Double] = js.undefined
    /**
      * Enable detecting links and making them clickable.
      * Defaults to true.
      */
    var links: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable highlighting of matching brackets.
      * Defaults to true.
      */
    var matchBrackets: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Control the behavior and rendering of the minimap.
      */
    var minimap: js.UndefOr[IEditorMinimapOptions] = js.undefined
    /**
      * A multiplier to be used on the `deltaX` and `deltaY` of mouse wheel scroll events.
      * Defaults to 1.
      */
    var mouseWheelScrollSensitivity: js.UndefOr[scala.Double] = js.undefined
    /**
      * Zoom the font in the editor when using the mouse wheel in combination with holding Ctrl.
      * Defaults to false.
      */
    var mouseWheelZoom: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Merge overlapping selections.
      * Defaults to true
      */
    var multiCursorMergeOverlapping: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The modifier to be used to add multiple cursors with the mouse.
      * Defaults to 'alt'
      */
    var multiCursorModifier: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.ctrlCmd | monacoDashEditorLib.monacoDashEditorLibStrings.alt
      ] = js.undefined
    /**
      * Enable semantic occurrences highlight.
      * Defaults to true.
      */
    var occurrencesHighlight: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Controls if a border should be drawn around the overview ruler.
      * Defaults to `true`.
      */
    var overviewRulerBorder: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The number of vertical lanes the overview ruler should render.
      * Defaults to 2.
      */
    var overviewRulerLanes: js.UndefOr[scala.Double] = js.undefined
    /**
      * Parameter hint options.
      */
    var parameterHints: js.UndefOr[IEditorParameterHintOptions] = js.undefined
    /**
      * Enable quick suggestions (shadow suggestions)
      * Defaults to true.
      */
    var quickSuggestions: js.UndefOr[scala.Boolean | monacoDashEditorLib.Anon_Comments] = js.undefined
    /**
      * Quick suggestions show delay (in ms)
      * Defaults to 500 (ms)
      */
    var quickSuggestionsDelay: js.UndefOr[scala.Double] = js.undefined
    /**
      * Should the editor be read only.
      * Defaults to false.
      */
    var readOnly: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable rendering of control characters.
      * Defaults to false.
      */
    var renderControlCharacters: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Render last line number when the file ends with a newline.
      * Defaults to true on Windows/Mac and to false on Linux.
      */
    var renderFinalNewline: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable rendering of indent guides.
      * Defaults to true.
      */
    var renderIndentGuides: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable rendering of current line highlight.
      * Defaults to all.
      */
    var renderLineHighlight: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.none | monacoDashEditorLib.monacoDashEditorLibStrings.gutter | monacoDashEditorLib.monacoDashEditorLibStrings.line | monacoDashEditorLib.monacoDashEditorLibStrings.all
      ] = js.undefined
    /**
      * Enable rendering of whitespace.
      * Defaults to none.
      */
    var renderWhitespace: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.none | monacoDashEditorLib.monacoDashEditorLibStrings.boundary | monacoDashEditorLib.monacoDashEditorLibStrings.all
      ] = js.undefined
    /**
      * When revealing the cursor, a virtual padding (px) is added to the cursor, turning it into a rectangle.
      * This virtual padding ensures that the cursor gets revealed before hitting the edge of the viewport.
      * Defaults to 30 (px).
      */
    var revealHorizontalRightPadding: js.UndefOr[scala.Double] = js.undefined
    /**
      * Render the editor selection with rounded borders.
      * Defaults to true.
      */
    var roundedSelection: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Render vertical lines at the specified columns.
      * Defaults to empty array.
      */
    var rulers: js.UndefOr[js.Array[scala.Double]] = js.undefined
    /**
      * Enable that scrolling can go beyond the last column by a number of columns.
      * Defaults to 5.
      */
    var scrollBeyondLastColumn: js.UndefOr[scala.Double] = js.undefined
    /**
      * Enable that scrolling can go one screen size after the last line.
      * Defaults to true.
      */
    var scrollBeyondLastLine: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Control the behavior and rendering of the scrollbars.
      */
    var scrollbar: js.UndefOr[IEditorScrollbarOptions] = js.undefined
    /**
      * Should the corresponding line be selected when clicking on the line number?
      * Defaults to true.
      */
    var selectOnLineNumbers: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable Linux primary clipboard.
      * Defaults to true.
      */
    var selectionClipboard: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable selection highlight.
      * Defaults to true.
      */
    var selectionHighlight: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Controls whether the fold actions in the gutter stay always visible or hide unless the mouse is over the gutter.
      * Defaults to 'mouseover'.
      */
    var showFoldingControls: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.always | monacoDashEditorLib.monacoDashEditorLibStrings.mouseover
      ] = js.undefined
    /**
      * Controls fading out of unused variables.
      */
    var showUnused: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable that the editor animates scrolling to a position.
      * Defaults to false.
      */
    var smoothScrolling: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable snippet suggestions. Default to 'true'.
      */
    var snippetSuggestions: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.top | monacoDashEditorLib.monacoDashEditorLibStrings.bottom | monacoDashEditorLib.monacoDashEditorLibStrings.`inline` | monacoDashEditorLib.monacoDashEditorLibStrings.none
      ] = js.undefined
    /**
      * Performance guard: Stop rendering a line after x characters.
      * Defaults to 10000.
      * Use -1 to never stop rendering
      */
    var stopRenderingLineAfter: js.UndefOr[scala.Double] = js.undefined
    /**
      * Suggest options.
      */
    var suggest: js.UndefOr[ISuggestOptions] = js.undefined
    /**
      * The font size for the suggest widget.
      * Defaults to the editor font size.
      */
    var suggestFontSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The line height for the suggest widget.
      * Defaults to the editor line height.
      */
    var suggestLineHeight: js.UndefOr[scala.Double] = js.undefined
    /**
      * Enable the suggestion box to pop-up on trigger characters.
      * Defaults to true.
      */
    var suggestOnTriggerCharacters: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The history mode for suggestions.
      */
    var suggestSelection: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.first | monacoDashEditorLib.monacoDashEditorLibStrings.recentlyUsed | monacoDashEditorLib.monacoDashEditorLibStrings.recentlyUsedByPrefix
      ] = js.undefined
    /**
      * Enable tab completion.
      */
    var tabCompletion: js.UndefOr[
        scala.Boolean | monacoDashEditorLib.monacoDashEditorLibStrings.on | monacoDashEditorLib.monacoDashEditorLibStrings.off | monacoDashEditorLib.monacoDashEditorLibStrings.onlySnippets
      ] = js.undefined
    /**
      * Inserting and deleting whitespace follows tab stops.
      */
    var useTabStops: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable word based suggestions. Defaults to 'true'
      */
    var wordBasedSuggestions: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A string containing the word separators used when doing word navigation.
      * Defaults to `~!@#$%^&*()-=+[{]}\\|;:\'",.<>/?
      */
    var wordSeparators: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Control the wrapping of the editor.
      * When `wordWrap` = "off", the lines will never wrap.
      * When `wordWrap` = "on", the lines will wrap at the viewport width.
      * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
      * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
      * Defaults to "off".
      */
    var wordWrap: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.off | monacoDashEditorLib.monacoDashEditorLibStrings.on | monacoDashEditorLib.monacoDashEditorLibStrings.wordWrapColumn | monacoDashEditorLib.monacoDashEditorLibStrings.bounded
      ] = js.undefined
    /**
      * Configure word wrapping characters. A break will be introduced after these characters.
      * Defaults to ' \t})]?|&,;'.
      */
    var wordWrapBreakAfterCharacters: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Configure word wrapping characters. A break will be introduced before these characters.
      * Defaults to '{([+'.
      */
    var wordWrapBreakBeforeCharacters: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Configure word wrapping characters. A break will be introduced after these characters only if no `wordWrapBreakBeforeCharacters` or `wordWrapBreakAfterCharacters` were found.
      * Defaults to '.'.
      */
    var wordWrapBreakObtrusiveCharacters: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Control the wrapping of the editor.
      * When `wordWrap` = "off", the lines will never wrap.
      * When `wordWrap` = "on", the lines will wrap at the viewport width.
      * When `wordWrap` = "wordWrapColumn", the lines will wrap at `wordWrapColumn`.
      * When `wordWrap` = "bounded", the lines will wrap at min(viewport width, wordWrapColumn).
      * Defaults to 80.
      */
    var wordWrapColumn: js.UndefOr[scala.Double] = js.undefined
    /**
      * Force word wrapping when the text appears to be of a minified/generated file.
      * Defaults to true.
      */
    var wordWrapMinified: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Control indentation of wrapped lines. Can be: 'none', 'same', 'indent' or 'deepIndent'.
      * Defaults to 'same' in vscode and to 'none' in monaco-editor.
      */
    var wrappingIndent: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IEditorOverrideServices
    extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any]
  
  trait IEditorParameterHintOptions extends js.Object {
    /**
      * Enable cycling of parameter hints.
      * Defaults to false.
      */
    var cycle: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable parameter hints.
      * Defaults to true.
      */
    var enabled: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IEditorScrollbarOptions extends js.Object {
    /**
      * The size of arrows (if displayed).
      * Defaults to 11.
      */
    var arrowSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * Listen to mouse wheel events and react to them by scrolling.
      * Defaults to true.
      */
    var handleMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Render horizontal scrollbar.
      * Defaults to 'auto'.
      */
    var horizontal: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.auto | monacoDashEditorLib.monacoDashEditorLibStrings.visible | monacoDashEditorLib.monacoDashEditorLibStrings.hidden
      ] = js.undefined
    /**
      * Render arrows at the left and right of the horizontal scrollbar.
      * Defaults to false.
      */
    var horizontalHasArrows: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Height in pixels for the horizontal scrollbar.
      * Defaults to 10 (px).
      */
    var horizontalScrollbarSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * Height in pixels for the horizontal slider.
      * Defaults to `horizontalScrollbarSize`.
      */
    var horizontalSliderSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * Cast horizontal and vertical shadows when the content is scrolled.
      * Defaults to true.
      */
    var useShadows: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Render vertical scrollbar.
      * Defaults to 'auto'.
      */
    var vertical: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorLibStrings.auto | monacoDashEditorLib.monacoDashEditorLibStrings.visible | monacoDashEditorLib.monacoDashEditorLibStrings.hidden
      ] = js.undefined
    /**
      * Render arrows at the top and bottom of the vertical scrollbar.
      * Defaults to false.
      */
    var verticalHasArrows: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Width in pixels for the vertical scrollbar.
      * Defaults to 10 (px).
      */
    var verticalScrollbarSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * Width in pixels for the vertical slider.
      * Defaults to `verticalScrollbarSize`.
      */
    var verticalSliderSize: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IEditorViewState extends js.Object
  
  trait IIdentifiedSingleEditOperation extends js.Object {
    /**
      * This indicates that this operation has "insert" semantics.
      * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
      */
    var forceMoveMarkers: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The range to replace. This can be empty to emulate a simple insert.
      */
    var range: monacoDashEditorLib.monacoDashEditorMod.Range
    /**
      * The text to replace with. This can be null to emulate a simple delete.
      */
    var text: java.lang.String | scala.Null
  }
  
  trait ILineChange extends IChange {
    val charChanges: js.UndefOr[js.Array[ICharChange]]
  }
  
  trait IMarker extends js.Object {
    var code: js.UndefOr[java.lang.String] = js.undefined
    var endColumn: scala.Double
    var endLineNumber: scala.Double
    var message: java.lang.String
    var owner: java.lang.String
    var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.undefined
    var resource: monacoDashEditorLib.monacoDashEditorMod.Uri
    var severity: monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity
    var source: js.UndefOr[java.lang.String] = js.undefined
    var startColumn: scala.Double
    var startLineNumber: scala.Double
    var tags: js.UndefOr[js.Array[monacoDashEditorLib.monacoDashEditorMod.MarkerTag]] = js.undefined
  }
  
  trait IMarkerData extends js.Object {
    var code: js.UndefOr[java.lang.String] = js.undefined
    var endColumn: scala.Double
    var endLineNumber: scala.Double
    var message: java.lang.String
    var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.undefined
    var severity: monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity
    var source: js.UndefOr[java.lang.String] = js.undefined
    var startColumn: scala.Double
    var startLineNumber: scala.Double
    var tags: js.UndefOr[js.Array[monacoDashEditorLib.monacoDashEditorMod.MarkerTag]] = js.undefined
  }
  
  trait IModelChangedEvent extends js.Object {
    /**
      * The `uri` of the new model or null.
      */
    val newModelUrl: monacoDashEditorLib.monacoDashEditorMod.Uri | scala.Null
    /**
      * The `uri` of the previous model or null.
      */
    val oldModelUrl: monacoDashEditorLib.monacoDashEditorMod.Uri | scala.Null
  }
  
  trait IModelContentChange extends js.Object {
    /**
      * The range that got replaced.
      */
    val range: monacoDashEditorLib.monacoDashEditorMod.IRange
    /**
      * The length of the range that got replaced.
      */
    val rangeLength: scala.Double
    /**
      * The offset of the range that got replaced.
      */
    val rangeOffset: scala.Double
    /**
      * The new text for the range.
      */
    val text: java.lang.String
  }
  
  trait IModelContentChangedEvent extends js.Object {
    val changes: js.Array[IModelContentChange]
    /**
      * The (new) end-of-line character.
      */
    val eol: java.lang.String
    /**
      * Flag that indicates that all decorations were lost with this edit.
      * The model has been reset to a new value.
      */
    val isFlush: scala.Boolean
    /**
      * Flag that indicates that this event was generated while redoing.
      */
    val isRedoing: scala.Boolean
    /**
      * Flag that indicates that this event was generated while undoing.
      */
    val isUndoing: scala.Boolean
    /**
      * The new version id the model has transitioned to.
      */
    val versionId: scala.Double
  }
  
  trait IModelDecoration extends js.Object {
    /**
      * Identifier for a decoration.
      */
    val id: java.lang.String
    /**
      * Options associated with this decoration.
      */
    val options: IModelDecorationOptions
    /**
      * Identifier for a decoration's owner.
      */
    val ownerId: scala.Double
    /**
      * Range that this decoration covers.
      */
    val range: monacoDashEditorLib.monacoDashEditorMod.Range
  }
  
  trait IModelDecorationOptions extends js.Object {
    /**
      * If set, the decoration will be rendered after the text with this CSS class name.
      */
    var afterContentClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * If set, the decoration will be rendered before the text with this CSS class name.
      */
    var beforeContentClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * CSS class name describing the decoration.
      */
    var className: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * If set, the decoration will be rendered in the glyph margin with this CSS class name.
      */
    var glyphMarginClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * Message to be rendered when hovering over the glyph margin decoration.
      */
    var glyphMarginHoverMessage: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.IMarkdownString | js.Array[monacoDashEditorLib.monacoDashEditorMod.IMarkdownString] | scala.Null
      ] = js.undefined
    /**
      * Array of MarkdownString to render as the decoration message.
      */
    var hoverMessage: js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.IMarkdownString | js.Array[monacoDashEditorLib.monacoDashEditorMod.IMarkdownString] | scala.Null
      ] = js.undefined
    /**
      * If set, the decoration will be rendered inline with the text with this CSS class name.
      * Please use this only for CSS rules that must impact the text. For example, use `className`
      * to have a background color decoration.
      */
    var inlineClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * If there is an `inlineClassName` which affects letter spacing.
      */
    var inlineClassNameAffectsLetterSpacing: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Should the decoration expand to encompass a whole line.
      */
    var isWholeLine: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * If set, the decoration will be rendered in the lines decorations with this CSS class name.
      */
    var linesDecorationsClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * If set, the decoration will be rendered in the margin (covering its full width) with this CSS class name.
      */
    var marginClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * If set, render this decoration in the overview ruler.
      */
    var overviewRuler: js.UndefOr[IModelDecorationOverviewRulerOptions | scala.Null] = js.undefined
    /**
      * Customize the growing behavior of the decoration when typing at the edges of the decoration.
      * Defaults to TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges
      */
    var stickiness: js.UndefOr[TrackedRangeStickiness] = js.undefined
    /**
      * Specifies the stack order of a decoration.
      * A decoration with greater stack order is always in front of a decoration with a lower stack order.
      */
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IModelDecorationOverviewRulerOptions extends js.Object {
    /**
      * CSS color to render in the overview ruler.
      * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
      */
    var color: js.UndefOr[java.lang.String | ThemeColor]
    /**
      * CSS color to render in the overview ruler.
      * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
      */
    var darkColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
    /**
      * The position in the overview ruler.
      */
    var position: OverviewRulerLane
  }
  
  trait IModelDecorationsChangedEvent extends js.Object
  
  trait IModelDeltaDecoration extends js.Object {
    /**
      * Options associated with this decoration.
      */
    var options: IModelDecorationOptions
    /**
      * Range that this decoration covers.
      */
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
  }
  
  trait IModelLanguageChangedEvent extends js.Object {
    /**
      * New language
      */
    val newLanguage: java.lang.String
    /**
      * Previous language
      */
    val oldLanguage: java.lang.String
  }
  
  trait IModelLanguageConfigurationChangedEvent extends js.Object
  
  trait IModelOptionsChangedEvent extends js.Object {
    val indentSize: scala.Boolean
    val insertSpaces: scala.Boolean
    val tabSize: scala.Boolean
    val trimAutoWhitespace: scala.Boolean
  }
  
  trait IModelTokensChangedEvent extends js.Object {
    val ranges: js.Array[monacoDashEditorLib.Anon_FromLineNumber]
    val tokenizationSupportChanged: scala.Boolean
  }
  
  trait IMouseTarget extends js.Object {
    /**
      * Some extra detail.
      */
    val detail: js.Any
    /**
      * The target element
      */
    val element: stdLib.Element | scala.Null
    /**
      * Desired mouse column (e.g. when position.column gets clamped to text length -- clicking after text on a line).
      */
    val mouseColumn: scala.Double
    /**
      * The 'approximate' editor position
      */
    val position: monacoDashEditorLib.monacoDashEditorMod.Position | scala.Null
    /**
      * The 'approximate' editor range
      */
    val range: monacoDashEditorLib.monacoDashEditorMod.Range | scala.Null
    /**
      * The target type
      */
    val `type`: MouseTargetType
  }
  
  trait INewScrollPosition extends js.Object {
    var scrollLeft: js.UndefOr[scala.Double] = js.undefined
    var scrollTop: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IOverlayWidget extends js.Object {
    /**
      * Get the dom node of the overlay widget.
      */
    def getDomNode(): stdLib.HTMLElement
    /**
      * Get a unique identifier of the overlay widget.
      */
    def getId(): java.lang.String
    /**
      * Get the placement of the overlay widget.
      * If null is returned, the overlay widget is responsible to place itself.
      */
    def getPosition(): IOverlayWidgetPosition | scala.Null
  }
  
  trait IOverlayWidgetPosition extends js.Object {
    /**
      * The position preference for the overlay widget.
      */
    var preference: OverlayWidgetPositionPreference | scala.Null
  }
  
  trait IPartialEditorMouseEvent extends js.Object {
    val event: monacoDashEditorLib.monacoDashEditorMod.IMouseEvent
    val target: IMouseTarget | scala.Null
  }
  
  trait IRelatedInformation extends js.Object {
    var endColumn: scala.Double
    var endLineNumber: scala.Double
    var message: java.lang.String
    var resource: monacoDashEditorLib.monacoDashEditorMod.Uri
    var startColumn: scala.Double
    var startLineNumber: scala.Double
  }
  
  trait ISingleEditOperation extends js.Object {
    /**
      * This indicates that this operation has "insert" semantics.
      * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
      */
    var forceMoveMarkers: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The range to replace. This can be empty to emulate a simple insert.
      */
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
    /**
      * The text to replace with. This can be null to emulate a simple delete.
      */
    var text: java.lang.String
  }
  
  trait ISingleEditOperationIdentifier extends js.Object {
    /**
      * Identifier major
      */
    var major: scala.Double
    /**
      * Identifier minor
      */
    var minor: scala.Double
  }
  
  @js.native
  trait IStandaloneCodeEditor extends ICodeEditor {
    def addAction(descriptor: IActionDescriptor): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    def addCommand(keybinding: scala.Double, handler: ICommandHandler): java.lang.String | scala.Null = js.native
    def addCommand(keybinding: scala.Double, handler: ICommandHandler, context: java.lang.String): java.lang.String | scala.Null = js.native
    def createContextKey[T](key: java.lang.String, defaultValue: T): IContextKey[T] = js.native
  }
  
  @js.native
  trait IStandaloneDiffEditor extends IDiffEditor {
    def addAction(descriptor: IActionDescriptor): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    def addCommand(keybinding: scala.Double, handler: ICommandHandler): java.lang.String | scala.Null = js.native
    def addCommand(keybinding: scala.Double, handler: ICommandHandler, context: java.lang.String): java.lang.String | scala.Null = js.native
    def createContextKey[T](key: java.lang.String, defaultValue: T): IContextKey[T] = js.native
  }
  
  trait IStandaloneThemeData extends js.Object {
    var base: BuiltinTheme
    var colors: IColors
    var encodedTokensColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var inherit: scala.Boolean
    var rules: js.Array[ITokenThemeRule]
  }
  
  trait ISuggestOptions extends js.Object {
    /**
      * Enable graceful matching. Defaults to true.
      */
    var filterGraceful: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Favours words that appear close to the cursor.
      */
    var localityBonus: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Enable using global storage for remembering suggestions.
      */
    var shareSuggestSelections: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Prevent quick suggestions when a snippet is active. Defaults to true.
      */
    var snippetsPreventQuickSuggestions: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  trait ITextModel extends IEditorModel {
    /**
      * A unique identifier associated with this model.
      */
    val id: java.lang.String = js.native
    /**
      * Gets the resource associated with this editor model.
      */
    val uri: monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
    /**
      * Edit the model without adding the edits to the undo stack.
      * This can have dire consequences on the undo stack! See @pushEditOperations for the preferred way.
      * @param operations The edit operations.
      * @return The inverse edit operations, that, when applied, will bring the model back to the previous state.
      */
    def applyEdits(operations: js.Array[IIdentifiedSingleEditOperation]): js.Array[IIdentifiedSingleEditOperation] = js.native
    /**
      * Perform a minimum amount of operations, in order to transform the decorations
      * identified by `oldDecorations` to the decorations described by `newDecorations`
      * and returns the new identifiers associated with the resulting decorations.
      *
      * @param oldDecorations Array containing previous decorations identifiers.
      * @param newDecorations Array describing what decorations should result after the call.
      * @param ownerId Identifies the editor id in which these decorations should appear. If no `ownerId` is provided, the decorations will appear in all editors that attach this model.
      * @return An array containing the new decorations identifiers.
      */
    def deltaDecorations(oldDecorations: js.Array[java.lang.String], newDecorations: js.Array[IModelDeltaDecoration]): js.Array[java.lang.String] = js.native
    def deltaDecorations(
      oldDecorations: js.Array[java.lang.String],
      newDecorations: js.Array[IModelDeltaDecoration],
      ownerId: scala.Double
    ): js.Array[java.lang.String] = js.native
    /**
      * Detect the indentation options for this model from its content.
      */
    def detectIndentation(defaultInsertSpaces: scala.Boolean, defaultTabSize: scala.Double): scala.Unit = js.native
    /**
      * Destroy this model. This will unbind the model from the mode
      * and make all necessary clean-up to release this object to the GC.
      */
    def dispose(): scala.Unit = js.native
    /**
      * Search the model.
      * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
      * @param searchOnlyEditableRange Limit the searching to only search inside the editable range of the model.
      * @param isRegex Used to indicate that `searchString` is a regular expression.
      * @param matchCase Force the matching to match lower/upper case exactly.
      * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
      * @param captureMatches The result will contain the captured groups.
      * @param limitResultCount Limit the number of results
      * @return The ranges where the matches are. It is empty if not matches have been found.
      */
    def findMatches(
      searchString: java.lang.String,
      searchOnlyEditableRange: scala.Boolean,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: java.lang.String,
      captureMatches: scala.Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: java.lang.String,
      searchOnlyEditableRange: scala.Boolean,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: java.lang.String,
      captureMatches: scala.Boolean,
      limitResultCount: scala.Double
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: java.lang.String,
      searchOnlyEditableRange: scala.Boolean,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: scala.Null,
      captureMatches: scala.Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: java.lang.String,
      searchOnlyEditableRange: scala.Boolean,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: scala.Null,
      captureMatches: scala.Boolean,
      limitResultCount: scala.Double
    ): js.Array[FindMatch] = js.native
    /**
      * Search the model.
      * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
      * @param searchScope Limit the searching to only search inside this range.
      * @param isRegex Used to indicate that `searchString` is a regular expression.
      * @param matchCase Force the matching to match lower/upper case exactly.
      * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
      * @param captureMatches The result will contain the captured groups.
      * @param limitResultCount Limit the number of results
      * @return The ranges where the matches are. It is empty if no matches have been found.
      */
    def findMatches(
      searchString: java.lang.String,
      searchScope: monacoDashEditorLib.monacoDashEditorMod.IRange,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: java.lang.String,
      captureMatches: scala.Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: java.lang.String,
      searchScope: monacoDashEditorLib.monacoDashEditorMod.IRange,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: java.lang.String,
      captureMatches: scala.Boolean,
      limitResultCount: scala.Double
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: java.lang.String,
      searchScope: monacoDashEditorLib.monacoDashEditorMod.IRange,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: scala.Null,
      captureMatches: scala.Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: java.lang.String,
      searchScope: monacoDashEditorLib.monacoDashEditorMod.IRange,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: scala.Null,
      captureMatches: scala.Boolean,
      limitResultCount: scala.Double
    ): js.Array[FindMatch] = js.native
    /**
      * Search the model for the next match. Loops to the beginning of the model if needed.
      * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
      * @param searchStart Start the searching at the specified position.
      * @param isRegex Used to indicate that `searchString` is a regular expression.
      * @param matchCase Force the matching to match lower/upper case exactly.
      * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
      * @param captureMatches The result will contain the captured groups.
      * @return The range where the next match is. It is null if no next match has been found.
      */
    def findNextMatch(
      searchString: java.lang.String,
      searchStart: monacoDashEditorLib.monacoDashEditorMod.IPosition,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: java.lang.String,
      captureMatches: scala.Boolean
    ): FindMatch | scala.Null = js.native
    def findNextMatch(
      searchString: java.lang.String,
      searchStart: monacoDashEditorLib.monacoDashEditorMod.IPosition,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: scala.Null,
      captureMatches: scala.Boolean
    ): FindMatch | scala.Null = js.native
    /**
      * Search the model for the previous match. Loops to the end of the model if needed.
      * @param searchString The string used to search. If it is a regular expression, set `isRegex` to true.
      * @param searchStart Start the searching at the specified position.
      * @param isRegex Used to indicate that `searchString` is a regular expression.
      * @param matchCase Force the matching to match lower/upper case exactly.
      * @param wordSeparators Force the matching to match entire words only. Pass null otherwise.
      * @param captureMatches The result will contain the captured groups.
      * @return The range where the previous match is. It is null if no previous match has been found.
      */
    def findPreviousMatch(
      searchString: java.lang.String,
      searchStart: monacoDashEditorLib.monacoDashEditorMod.IPosition,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: java.lang.String,
      captureMatches: scala.Boolean
    ): FindMatch | scala.Null = js.native
    def findPreviousMatch(
      searchString: java.lang.String,
      searchStart: monacoDashEditorLib.monacoDashEditorMod.IPosition,
      isRegex: scala.Boolean,
      matchCase: scala.Boolean,
      wordSeparators: scala.Null,
      captureMatches: scala.Boolean
    ): FindMatch | scala.Null = js.native
    /**
      * Gets all the decorations as an array.
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      */
    def getAllDecorations(): js.Array[IModelDecoration] = js.native
    def getAllDecorations(ownerId: scala.Double): js.Array[IModelDecoration] = js.native
    def getAllDecorations(ownerId: scala.Double, filterOutValidation: scala.Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Get the alternative version id of the model.
      * This alternative version id is not always incremented,
      * it will return the same values in the case of undo-redo.
      */
    def getAlternativeVersionId(): scala.Double = js.native
    /**
      * Get the options associated with a decoration.
      * @param id The decoration id.
      * @return The decoration options or null if the decoration was not found.
      */
    def getDecorationOptions(id: java.lang.String): IModelDecorationOptions | scala.Null = js.native
    /**
      * Get the range associated with a decoration.
      * @param id The decoration id.
      * @return The decoration range or null if the decoration was not found.
      */
    def getDecorationRange(id: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.Range | scala.Null = js.native
    /**
      * Gets all the decorations in a range as an array. Only `startLineNumber` and `endLineNumber` from `range` are used for filtering.
      * So for now it returns all the decorations on the same line as `range`.
      * @param range The range to search in
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      * @return An array with the decorations
      */
    def getDecorationsInRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange): js.Array[IModelDecoration] = js.native
    def getDecorationsInRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange, ownerId: scala.Double): js.Array[IModelDecoration] = js.native
    def getDecorationsInRange(
      range: monacoDashEditorLib.monacoDashEditorMod.IRange,
      ownerId: scala.Double,
      filterOutValidation: scala.Boolean
    ): js.Array[IModelDecoration] = js.native
    /**
      * Get the end of line sequence predominantly used in the text buffer.
      * @return EOL char sequence (e.g.: '\n' or '\r\n').
      */
    def getEOL(): java.lang.String = js.native
    /**
      * Get a range covering the entire model
      */
    def getFullModelRange(): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
    /**
      * Get the text for a certain line.
      */
    def getLineContent(lineNumber: scala.Double): java.lang.String = js.native
    /**
      * Get the number of lines in the model.
      */
    def getLineCount(): scala.Double = js.native
    /**
      * Gets all the decorations for the line `lineNumber` as an array.
      * @param lineNumber The line number
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      * @return An array with the decorations
      */
    def getLineDecorations(lineNumber: scala.Double): js.Array[IModelDecoration] = js.native
    def getLineDecorations(lineNumber: scala.Double, ownerId: scala.Double): js.Array[IModelDecoration] = js.native
    def getLineDecorations(lineNumber: scala.Double, ownerId: scala.Double, filterOutValidation: scala.Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Returns the column before the first non whitespace character for line at `lineNumber`.
      * Returns 0 if line is empty or contains only whitespace.
      */
    def getLineFirstNonWhitespaceColumn(lineNumber: scala.Double): scala.Double = js.native
    /**
      * Returns the column after the last non whitespace character for line at `lineNumber`.
      * Returns 0 if line is empty or contains only whitespace.
      */
    def getLineLastNonWhitespaceColumn(lineNumber: scala.Double): scala.Double = js.native
    /**
      * Get the text length for a certain line.
      */
    def getLineLength(lineNumber: scala.Double): scala.Double = js.native
    /**
      * Get the maximum legal column for line at `lineNumber`
      */
    def getLineMaxColumn(lineNumber: scala.Double): scala.Double = js.native
    /**
      * Get the minimum legal column for line at `lineNumber`
      */
    def getLineMinColumn(lineNumber: scala.Double): scala.Double = js.native
    /**
      * Get the text for all lines.
      */
    def getLinesContent(): js.Array[java.lang.String] = js.native
    /**
      * Gets all the decorations for the lines between `startLineNumber` and `endLineNumber` as an array.
      * @param startLineNumber The start line number
      * @param endLineNumber The end line number
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      * @return An array with the decorations
      */
    def getLinesDecorations(startLineNumber: scala.Double, endLineNumber: scala.Double): js.Array[IModelDecoration] = js.native
    def getLinesDecorations(startLineNumber: scala.Double, endLineNumber: scala.Double, ownerId: scala.Double): js.Array[IModelDecoration] = js.native
    def getLinesDecorations(
      startLineNumber: scala.Double,
      endLineNumber: scala.Double,
      ownerId: scala.Double,
      filterOutValidation: scala.Boolean
    ): js.Array[IModelDecoration] = js.native
    /**
      * Get the language associated with this model.
      */
    def getModeId(): java.lang.String = js.native
    /**
      * Converts the position to a zero-based offset.
      *
      * The position will be [adjusted](#TextDocument.validatePosition).
      *
      * @param position A position.
      * @return A valid zero-based offset.
      */
    def getOffsetAt(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): scala.Double = js.native
    /**
      * Get the resolved options for this model.
      */
    def getOptions(): TextModelResolvedOptions = js.native
    /**
      * Gets all the decorations that should be rendered in the overview ruler as an array.
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      */
    def getOverviewRulerDecorations(): js.Array[IModelDecoration] = js.native
    def getOverviewRulerDecorations(ownerId: scala.Double): js.Array[IModelDecoration] = js.native
    def getOverviewRulerDecorations(ownerId: scala.Double, filterOutValidation: scala.Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Converts a zero-based offset to a position.
      *
      * @param offset A zero-based offset.
      * @return A valid [position](#Position).
      */
    def getPositionAt(offset: scala.Double): monacoDashEditorLib.monacoDashEditorMod.Position = js.native
    /**
      * Get the text stored in this model.
      * @param eol The end of line character preference. Defaults to `EndOfLinePreference.TextDefined`.
      * @param preserverBOM Preserve a BOM character if it was detected when the model was constructed.
      * @return The text.
      */
    def getValue(): java.lang.String = js.native
    def getValue(eol: EndOfLinePreference): java.lang.String = js.native
    def getValue(eol: EndOfLinePreference, preserveBOM: scala.Boolean): java.lang.String = js.native
    /**
      * Get the text in a certain range.
      * @param range The range describing what text to get.
      * @param eol The end of line character preference. This will only be used for multiline ranges. Defaults to `EndOfLinePreference.TextDefined`.
      * @return The text.
      */
    def getValueInRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange): java.lang.String = js.native
    def getValueInRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange, eol: EndOfLinePreference): java.lang.String = js.native
    /**
      * Get the length of the text stored in this model.
      */
    def getValueLength(): scala.Double = js.native
    def getValueLength(eol: EndOfLinePreference): scala.Double = js.native
    def getValueLength(eol: EndOfLinePreference, preserveBOM: scala.Boolean): scala.Double = js.native
    /**
      * Get the length of text in a certain range.
      * @param range The range describing what text length to get.
      * @return The text length.
      */
    def getValueLengthInRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Double = js.native
    /**
      * Get the current version id of the model.
      * Anytime a change happens to the model (even undo/redo),
      * the version id is incremented.
      */
    def getVersionId(): scala.Double = js.native
    /**
      * Get the word under or besides `position`.
      * @param position The position to look for a word.
      * @return The word under or besides `position`. Might be null.
      */
    def getWordAtPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): IWordAtPosition | scala.Null = js.native
    /**
      * Get the word under or besides `position` trimmed to `position`.column
      * @param position The position to look for a word.
      * @return The word under or besides `position`. Will never be null.
      */
    def getWordUntilPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): IWordAtPosition = js.native
    /**
      * Returns if the model was disposed or not.
      */
    def isDisposed(): scala.Boolean = js.native
    /**
      * Advances the given position by the given offset (negative offsets are also accepted)
      * and returns it as a new valid position.
      *
      * If the offset and position are such that their combination goes beyond the beginning or
      * end of the model, throws an exception.
      *
      * If the offset is such that the new position would be in the middle of a multi-byte
      * line terminator, throws an exception.
      */
    def modifyPosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition, offset: scala.Double): monacoDashEditorLib.monacoDashEditorMod.Position = js.native
    /**
      * Normalize a string containing whitespace according to indentation rules (converts to spaces or to tabs).
      */
    def normalizeIndentation(str: java.lang.String): java.lang.String = js.native
    /**
      * An event emitted when the contents of the model have changed.
      * @event
      */
    def onDidChangeContent(listener: js.Function1[/* e */ IModelContentChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when decorations of the model have changed.
      * @event
      */
    def onDidChangeDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the language associated with the model has changed.
      * @event
      */
    def onDidChangeLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the language configuration associated with the model has changed.
      * @event
      */
    def onDidChangeLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted when the model options have changed.
      * @event
      */
    def onDidChangeOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * An event emitted right before disposing the model.
      * @event
      */
    def onWillDispose(listener: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
    /**
      * Change the end of line sequence. This is the preferred way of
      * changing the eol sequence. This will land on the undo stack.
      */
    def pushEOL(eol: EndOfLineSequence): scala.Unit = js.native
    /**
      * Push edit operations, basically editing the model. This is the preferred way
      * of editing the model. The edit operations will land on the undo stack.
      * @param beforeCursorState The cursor state before the edit operations. This cursor state will be returned when `undo` or `redo` are invoked.
      * @param editOperations The edit operations.
      * @param cursorStateComputer A callback that can compute the resulting cursors state after the edit operations have been executed.
      * @return The cursor state returned by the `cursorStateComputer`.
      */
    def pushEditOperations(
      beforeCursorState: js.Array[monacoDashEditorLib.monacoDashEditorMod.Selection],
      editOperations: js.Array[IIdentifiedSingleEditOperation],
      cursorStateComputer: ICursorStateComputer
    ): js.Array[monacoDashEditorLib.monacoDashEditorMod.Selection] | scala.Null = js.native
    /**
      * Push a stack element onto the undo stack. This acts as an undo/redo point.
      * The idea is to use `pushEditOperations` to edit the model and then to
      * `pushStackElement` to create an undo/redo stop point.
      */
    def pushStackElement(): scala.Unit = js.native
    /**
      * Change the end of line sequence without recording in the undo stack.
      * This can have dire consequences on the undo stack! See @pushEOL for the preferred way.
      */
    def setEOL(eol: EndOfLineSequence): scala.Unit = js.native
    /**
      * Replace the entire text buffer value contained in this model.
      */
    def setValue(newValue: java.lang.String): scala.Unit = js.native
    /**
      * Change the options of this model.
      */
    def updateOptions(newOpts: ITextModelUpdateOptions): scala.Unit = js.native
    /**
      * Create a valid position,
      */
    def validatePosition(position: monacoDashEditorLib.monacoDashEditorMod.IPosition): monacoDashEditorLib.monacoDashEditorMod.Position = js.native
    /**
      * Create a valid range.
      */
    def validateRange(range: monacoDashEditorLib.monacoDashEditorMod.IRange): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  }
  
  trait ITextModelUpdateOptions extends js.Object {
    var indentSize: js.UndefOr[scala.Double] = js.undefined
    var insertSpaces: js.UndefOr[scala.Boolean] = js.undefined
    var tabSize: js.UndefOr[scala.Double] = js.undefined
    var trimAutoWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait ITokenThemeRule extends js.Object {
    var background: js.UndefOr[java.lang.String] = js.undefined
    var fontStyle: js.UndefOr[java.lang.String] = js.undefined
    var foreground: js.UndefOr[java.lang.String] = js.undefined
    var token: java.lang.String
  }
  
  trait IViewState extends js.Object {
    var firstPosition: monacoDashEditorLib.monacoDashEditorMod.IPosition
    var firstPositionDeltaTop: scala.Double
    var scrollLeft: scala.Double
    /** written by previous versions */
    var scrollTop: js.UndefOr[scala.Double] = js.undefined
    /** written by previous versions */
    var scrollTopWithoutViewZones: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IViewZone extends js.Object {
    /**
      * The column after which this zone should appear.
      * If not set, the maxLineColumn of `afterLineNumber` will be used.
      */
    var afterColumn: js.UndefOr[scala.Double] = js.undefined
    /**
      * The line number after which this zone should appear.
      * Use 0 to place a view zone before the first line number.
      */
    var afterLineNumber: scala.Double
    /**
      * The dom node of the view zone
      */
    var domNode: stdLib.HTMLElement
    /**
      * The height in lines of the view zone.
      * If specified, `heightInPx` will be used instead of this.
      * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
      */
    var heightInLines: js.UndefOr[scala.Double] = js.undefined
    /**
      * The height in px of the view zone.
      * If this is set, the editor will give preference to it rather than `heightInLines` above.
      * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
      */
    var heightInPx: js.UndefOr[scala.Double] = js.undefined
    /**
      * An optional dom node for the view zone that will be placed in the margin area.
      */
    var marginDomNode: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
    /**
      * The minimum width in px of the view zone.
      * If this is set, the editor will ensure that the scroll width is >= than this value.
      */
    var minWidthInPx: js.UndefOr[scala.Double] = js.undefined
    /**
      * Callback which gives the height in pixels of the view zone.
      */
    var onComputedHeight: js.UndefOr[js.Function1[/* height */ scala.Double, scala.Unit]] = js.undefined
    /**
      * Callback which gives the relative top of the view zone as it appears (taking scrolling into account).
      */
    var onDomNodeTop: js.UndefOr[js.Function1[/* top */ scala.Double, scala.Unit]] = js.undefined
    /**
      * Suppress mouse down events.
      * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
      * Defaults to false
      */
    var suppressMouseDown: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IViewZoneChangeAccessor extends js.Object {
    /**
      * Create a new view zone.
      * @param zone Zone to create
      * @return A unique identifier to the view zone.
      */
    def addZone(zone: IViewZone): scala.Double
    /**
      * Change a zone's position.
      * The editor will rescan the `afterLineNumber` and `afterColumn` properties of a view zone.
      */
    def layoutZone(id: scala.Double): scala.Unit
    /**
      * Remove a zone
      * @param id A unique identifier to the view zone, as returned by the `addZone` call.
      */
    def removeZone(id: scala.Double): scala.Unit
  }
  
  trait IWebWorkerOptions extends js.Object {
    /**
      * The data to send over when calling create on the module.
      */
    var createData: js.UndefOr[js.Any] = js.undefined
    /**
      * A label to be used to identify the web worker for debugging purposes.
      */
    var label: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The AMD moduleId to load.
      * It should export a function `create` that should return the exported proxy.
      */
    var moduleId: java.lang.String
  }
  
  trait IWordAtPosition extends js.Object {
    /**
      * The column where the word ends.
      */
    val endColumn: scala.Double
    /**
      * The column where the word starts.
      */
    val startColumn: scala.Double
    /**
      * The word.
      */
    val word: java.lang.String
  }
  
  trait InternalEditorFindOptions extends js.Object {
    val addExtraSpaceOnTop: scala.Boolean
    val autoFindInSelection: scala.Boolean
    val seedSearchStringFromSelection: scala.Boolean
  }
  
  trait InternalEditorHoverOptions extends js.Object {
    val delay: scala.Double
    val enabled: scala.Boolean
    val sticky: scala.Boolean
  }
  
  trait InternalEditorMinimapOptions extends js.Object {
    val enabled: scala.Boolean
    val maxColumn: scala.Double
    val renderCharacters: scala.Boolean
    val showSlider: monacoDashEditorLib.monacoDashEditorLibStrings.always | monacoDashEditorLib.monacoDashEditorLibStrings.mouseover
    val side: monacoDashEditorLib.monacoDashEditorLibStrings.right | monacoDashEditorLib.monacoDashEditorLibStrings.left
  }
  
  @js.native
  class InternalEditorOptions () extends js.Object {
    val _internalEditorOptionsBrand: scala.Unit = js.native
    val autoClosingBrackets: EditorAutoClosingStrategy = js.native
    val autoClosingQuotes: EditorAutoClosingStrategy = js.native
    val autoIndent: scala.Boolean = js.native
    val autoSurround: EditorAutoSurroundStrategy = js.native
    val canUseLayerHinting: scala.Boolean = js.native
    val contribInfo: EditorContribOptions = js.native
    val copyWithSyntaxHighlighting: scala.Boolean = js.native
    val dragAndDrop: scala.Boolean = js.native
    val editorClassName: java.lang.String = js.native
    val emptySelectionClipboard: scala.Boolean = js.native
    val fontInfo: FontInfo = js.native
    val layoutInfo: EditorLayoutInfo = js.native
    val lineHeight: scala.Double = js.native
    val multiCursorMergeOverlapping: scala.Boolean = js.native
    val multiCursorModifier: monacoDashEditorLib.monacoDashEditorLibStrings.altKey | monacoDashEditorLib.monacoDashEditorLibStrings.ctrlKey | monacoDashEditorLib.monacoDashEditorLibStrings.metaKey = js.native
    val pixelRatio: scala.Double = js.native
    val readOnly: scala.Boolean = js.native
    val showUnused: scala.Boolean = js.native
    val tabFocusMode: scala.Boolean = js.native
    val useTabStops: scala.Boolean = js.native
    val viewInfo: InternalEditorViewOptions = js.native
    val wordSeparators: java.lang.String = js.native
    val wrappingInfo: EditorWrappingInfo = js.native
  }
  
  trait InternalEditorScrollbarOptions extends js.Object {
    val arrowSize: scala.Double
    val fastScrollSensitivity: scala.Double
    val handleMouseWheel: scala.Boolean
    val horizontal: ScrollbarVisibility
    val horizontalHasArrows: scala.Boolean
    val horizontalScrollbarSize: scala.Double
    val horizontalSliderSize: scala.Double
    val mouseWheelScrollSensitivity: scala.Double
    val useShadows: scala.Boolean
    val vertical: ScrollbarVisibility
    val verticalHasArrows: scala.Boolean
    val verticalScrollbarSize: scala.Double
    val verticalSliderSize: scala.Double
  }
  
  trait InternalEditorViewOptions extends js.Object {
    val ariaLabel: java.lang.String
    val cursorBlinking: TextEditorCursorBlinkingStyle
    val cursorSmoothCaretAnimation: scala.Boolean
    val cursorStyle: TextEditorCursorStyle
    val cursorWidth: scala.Double
    val disableMonospaceOptimizations: scala.Boolean
    val extraEditorClassName: java.lang.String
    val fixedOverflowWidgets: scala.Boolean
    val fontLigatures: scala.Boolean
    val glyphMargin: scala.Boolean
    val hideCursorInOverviewRuler: scala.Boolean
    val highlightActiveIndentGuide: scala.Boolean
    val minimap: InternalEditorMinimapOptions
    val mouseWheelZoom: scala.Boolean
    val overviewRulerBorder: scala.Boolean
    val overviewRulerLanes: scala.Double
    val renderControlCharacters: scala.Boolean
    val renderCustomLineNumbers: (js.Function1[/* lineNumber */ scala.Double, java.lang.String]) | scala.Null
    val renderFinalNewline: scala.Boolean
    val renderIndentGuides: scala.Boolean
    val renderLineHighlight: monacoDashEditorLib.monacoDashEditorLibStrings.none | monacoDashEditorLib.monacoDashEditorLibStrings.gutter | monacoDashEditorLib.monacoDashEditorLibStrings.line | monacoDashEditorLib.monacoDashEditorLibStrings.all
    val renderLineNumbers: RenderLineNumbersType
    val renderWhitespace: monacoDashEditorLib.monacoDashEditorLibStrings.none | monacoDashEditorLib.monacoDashEditorLibStrings.boundary | monacoDashEditorLib.monacoDashEditorLibStrings.all
    val revealHorizontalRightPadding: scala.Double
    val roundedSelection: scala.Boolean
    val rulers: js.Array[scala.Double]
    val scrollBeyondLastColumn: scala.Double
    val scrollBeyondLastLine: scala.Boolean
    val scrollbar: InternalEditorScrollbarOptions
    val selectOnLineNumbers: scala.Boolean
    val smoothScrolling: scala.Boolean
    val stopRenderingLineAfter: scala.Double
  }
  
  trait InternalParameterHintOptions extends js.Object {
    val cycle: scala.Boolean
    val enabled: scala.Boolean
  }
  
  trait InternalSuggestOptions extends js.Object {
    val filterGraceful: scala.Boolean
    val localityBonus: scala.Boolean
    val shareSuggestSelections: scala.Boolean
    val snippets: monacoDashEditorLib.monacoDashEditorLibStrings.top | monacoDashEditorLib.monacoDashEditorLibStrings.bottom | monacoDashEditorLib.monacoDashEditorLibStrings.`inline` | monacoDashEditorLib.monacoDashEditorLibStrings.none
    val snippetsPreventQuickSuggestions: scala.Boolean
  }
  
  trait MonacoWebWorker[T] extends js.Object {
    /**
      * Terminate the web worker, thus invalidating the returned proxy.
      */
    def dispose(): scala.Unit
    /**
      * Get a proxy to the arbitrary loaded code.
      */
    def getProxy(): js.Promise[T]
    /**
      * Synchronize (send) the models at `resources` to the web worker,
      * making them available in the monaco.worker.getMirrorModels().
      */
    def withSyncedResources(resources: js.Array[monacoDashEditorLib.monacoDashEditorMod.Uri]): js.Promise[T]
  }
  
  @js.native
  sealed trait MouseTargetType extends js.Object
  
  @js.native
  sealed trait OverlayWidgetPositionPreference extends js.Object
  
  @js.native
  sealed trait OverviewRulerLane extends js.Object
  
  trait OverviewRulerPosition extends js.Object {
    /**
      * Height of the overview ruler
      */
    val height: scala.Double
    /**
      * Right position for the overview ruler
      */
    val right: scala.Double
    /**
      * Top position for the overview ruler
      */
    val top: scala.Double
    /**
      * Width of the overview ruler
      */
    val width: scala.Double
  }
  
  @js.native
  sealed trait RenderLineNumbersType extends js.Object
  
  @js.native
  sealed trait RenderMinimap extends js.Object
  
  @js.native
  sealed trait ScrollType extends js.Object
  
  @js.native
  sealed trait ScrollbarVisibility extends js.Object
  
  @js.native
  sealed trait TextEditorCursorBlinkingStyle extends js.Object
  
  @js.native
  sealed trait TextEditorCursorStyle extends js.Object
  
  @js.native
  class TextModelResolvedOptions () extends js.Object {
    var _textModelResolvedOptionsBrand: scala.Unit = js.native
    val defaultEOL: DefaultEndOfLine = js.native
    val indentSize: scala.Double = js.native
    val insertSpaces: scala.Boolean = js.native
    val tabSize: scala.Double = js.native
    val trimAutoWhitespace: scala.Boolean = js.native
  }
  
  trait ThemeColor extends js.Object {
    var id: java.lang.String
  }
  
  @js.native
  sealed trait TrackedRangeStickiness extends js.Object
  
  @js.native
  sealed trait WrappingIndent extends js.Object
  
  val EditorType: monacoDashEditorLib.Anon_ICodeEditor = js.native
  def colorize(text: java.lang.String, languageId: java.lang.String, options: IColorizerOptions): js.Promise[java.lang.String] = js.native
  def colorizeElement(domNode: stdLib.HTMLElement, options: IColorizerElementOptions): js.Promise[scala.Unit] = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: scala.Double): java.lang.String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: scala.Double, tabSize: scala.Double): java.lang.String = js.native
  def create(domElement: stdLib.HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: stdLib.HTMLElement, options: IEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(
    domElement: stdLib.HTMLElement,
    options: IEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = js.native
  def createDiffEditor(domElement: stdLib.HTMLElement): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: stdLib.HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def createDiffEditor(
    domElement: stdLib.HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
  def createModel(value: java.lang.String): ITextModel = js.native
  def createModel(value: java.lang.String, language: java.lang.String): ITextModel = js.native
  def createModel(
    value: java.lang.String,
    language: java.lang.String,
    uri: monacoDashEditorLib.monacoDashEditorMod.Uri
  ): ITextModel = js.native
  def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
  def defineTheme(themeName: java.lang.String, themeData: IStandaloneThemeData): scala.Unit = js.native
  def getModel(uri: monacoDashEditorLib.monacoDashEditorMod.Uri): ITextModel | scala.Null = js.native
  def getModelMarkers(filter: monacoDashEditorLib.Anon_Owner): js.Array[IMarker] = js.native
  def getModels(): js.Array[ITextModel] = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ monacoDashEditorLib.Anon_Model, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def remeasureFonts(): scala.Unit = js.native
  def setModelLanguage(model: ITextModel, languageId: java.lang.String): scala.Unit = js.native
  def setModelMarkers(model: ITextModel, owner: java.lang.String, markers: js.Array[IMarkerData]): scala.Unit = js.native
  def setTheme(themeName: java.lang.String): scala.Unit = js.native
  def tokenize(text: java.lang.String, languageId: java.lang.String): js.Array[js.Array[monacoDashEditorLib.monacoDashEditorMod.Token]] = js.native
  @js.native
  object ContentWidgetPositionPreference extends js.Object {
    /**
      * Place the content widget above a position
      */
    @js.native
    sealed trait ABOVE
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference
    
    /**
      * Place the content widget below a position
      */
    @js.native
    sealed trait BELOW
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference
    
    /**
      * Place the content widget exactly at a position
      */
    @js.native
    sealed trait EXACT
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference
    
    /* 1 */ val ABOVE: ABOVE with scala.Double = js.native
    /* 2 */ val BELOW: BELOW with scala.Double = js.native
    /* 0 */ val EXACT: EXACT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference with scala.Double
      ] = js.native
  }
  
  @js.native
  object CursorChangeReason extends js.Object {
    /**
      * A `model.setValue()` was called.
      */
    @js.native
    sealed trait ContentFlush
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /**
      * There was an explicit user gesture.
      */
    @js.native
    sealed trait Explicit
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /**
      * Unknown or not set.
      */
    @js.native
    sealed trait NotSet
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /**
      * There was a Paste.
      */
    @js.native
    sealed trait Paste
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /**
      * The `model` has been changed outside of this cursor and the cursor recovers its position from associated markers.
      */
    @js.native
    sealed trait RecoverFromMarkers
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /**
      * There was a Redo.
      */
    @js.native
    sealed trait Redo
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /**
      * There was an Undo.
      */
    @js.native
    sealed trait Undo
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason
    
    /* 1 */ val ContentFlush: ContentFlush with scala.Double = js.native
    /* 3 */ val Explicit: Explicit with scala.Double = js.native
    /* 0 */ val NotSet: NotSet with scala.Double = js.native
    /* 4 */ val Paste: Paste with scala.Double = js.native
    /* 2 */ val RecoverFromMarkers: RecoverFromMarkers with scala.Double = js.native
    /* 6 */ val Redo: Redo with scala.Double = js.native
    /* 5 */ val Undo: Undo with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.CursorChangeReason with scala.Double
      ] = js.native
  }
  
  @js.native
  object DefaultEndOfLine extends js.Object {
    /**
      * Use carriage return and line feed (\r\n) as the end of line character.
      */
    @js.native
    sealed trait CRLF
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.DefaultEndOfLine
    
    /**
      * Use line feed (\n) as the end of line character.
      */
    @js.native
    sealed trait LF
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.DefaultEndOfLine
    
    /* 2 */ val CRLF: CRLF with scala.Double = js.native
    /* 1 */ val LF: LF with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.DefaultEndOfLine with scala.Double
      ] = js.native
  }
  
  @js.native
  object EndOfLinePreference extends js.Object {
    /**
      * Use carriage return and line feed (\r\n) as the end of line character.
      */
    @js.native
    sealed trait CRLF
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLinePreference
    
    /**
      * Use line feed (\n) as the end of line character.
      */
    @js.native
    sealed trait LF
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLinePreference
    
    /**
      * Use the end of line character identified in the text buffer.
      */
    @js.native
    sealed trait TextDefined
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLinePreference
    
    /* 2 */ val CRLF: CRLF with scala.Double = js.native
    /* 1 */ val LF: LF with scala.Double = js.native
    /* 0 */ val TextDefined: TextDefined with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLinePreference with scala.Double
      ] = js.native
  }
  
  @js.native
  object EndOfLineSequence extends js.Object {
    /**
      * Use carriage return and line feed (\r\n) as the end of line character.
      */
    @js.native
    sealed trait CRLF
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence
    
    /**
      * Use line feed (\n) as the end of line character.
      */
    @js.native
    sealed trait LF
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence
    
    /* 1 */ val CRLF: CRLF with scala.Double = js.native
    /* 0 */ val LF: LF with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence with scala.Double
      ] = js.native
  }
  
  @js.native
  object MouseTargetType extends js.Object {
    /**
      * Mouse is on top of empty space in the content (e.g. after line text or below last line)
      */
    @js.native
    sealed trait CONTENT_EMPTY
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of text in the content.
      */
    @js.native
    sealed trait CONTENT_TEXT
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of a view zone in the content.
      */
    @js.native
    sealed trait CONTENT_VIEW_ZONE
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of a content widget.
      */
    @js.native
    sealed trait CONTENT_WIDGET
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of the glyph margin
      */
    @js.native
    sealed trait GUTTER_GLYPH_MARGIN
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of the line decorations
      */
    @js.native
    sealed trait GUTTER_LINE_DECORATIONS
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of the line numbers
      */
    @js.native
    sealed trait GUTTER_LINE_NUMBERS
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of the whitespace left in the gutter by a view zone.
      */
    @js.native
    sealed trait GUTTER_VIEW_ZONE
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is outside of the editor.
      */
    @js.native
    sealed trait OUTSIDE_EDITOR
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of an overlay widget.
      */
    @js.native
    sealed trait OVERLAY_WIDGET
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of the decorations overview ruler.
      */
    @js.native
    sealed trait OVERVIEW_RULER
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of a scrollbar.
      */
    @js.native
    sealed trait SCROLLBAR
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of the textarea used for input.
      */
    @js.native
    sealed trait TEXTAREA
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /**
      * Mouse is on top of an unknown element.
      */
    @js.native
    sealed trait UNKNOWN
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType
    
    /* 7 */ val CONTENT_EMPTY: CONTENT_EMPTY with scala.Double = js.native
    /* 6 */ val CONTENT_TEXT: CONTENT_TEXT with scala.Double = js.native
    /* 8 */ val CONTENT_VIEW_ZONE: CONTENT_VIEW_ZONE with scala.Double = js.native
    /* 9 */ val CONTENT_WIDGET: CONTENT_WIDGET with scala.Double = js.native
    /* 2 */ val GUTTER_GLYPH_MARGIN: GUTTER_GLYPH_MARGIN with scala.Double = js.native
    /* 4 */ val GUTTER_LINE_DECORATIONS: GUTTER_LINE_DECORATIONS with scala.Double = js.native
    /* 3 */ val GUTTER_LINE_NUMBERS: GUTTER_LINE_NUMBERS with scala.Double = js.native
    /* 5 */ val GUTTER_VIEW_ZONE: GUTTER_VIEW_ZONE with scala.Double = js.native
    /* 13 */ val OUTSIDE_EDITOR: OUTSIDE_EDITOR with scala.Double = js.native
    /* 12 */ val OVERLAY_WIDGET: OVERLAY_WIDGET with scala.Double = js.native
    /* 10 */ val OVERVIEW_RULER: OVERVIEW_RULER with scala.Double = js.native
    /* 11 */ val SCROLLBAR: SCROLLBAR with scala.Double = js.native
    /* 1 */ val TEXTAREA: TEXTAREA with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.MouseTargetType with scala.Double
      ] = js.native
  }
  
  @js.native
  object OverlayWidgetPositionPreference extends js.Object {
    /**
      * Position the overlay widget in the bottom right corner
      */
    @js.native
    sealed trait BOTTOM_RIGHT_CORNER
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference
    
    /**
      * Position the overlay widget in the top center
      */
    @js.native
    sealed trait TOP_CENTER
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference
    
    /**
      * Position the overlay widget in the top right corner
      */
    @js.native
    sealed trait TOP_RIGHT_CORNER
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference
    
    /* 1 */ val BOTTOM_RIGHT_CORNER: BOTTOM_RIGHT_CORNER with scala.Double = js.native
    /* 2 */ val TOP_CENTER: TOP_CENTER with scala.Double = js.native
    /* 0 */ val TOP_RIGHT_CORNER: TOP_RIGHT_CORNER with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference with scala.Double
      ] = js.native
  }
  
  @js.native
  object OverviewRulerLane extends js.Object {
    @js.native
    sealed trait Center
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverviewRulerLane
    
    @js.native
    sealed trait Full
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverviewRulerLane
    
    @js.native
    sealed trait Left
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverviewRulerLane
    
    @js.native
    sealed trait Right
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.OverviewRulerLane
    
    /* 2 */ val Center: Center with scala.Double = js.native
    /* 7 */ val Full: Full with scala.Double = js.native
    /* 1 */ val Left: Left with scala.Double = js.native
    /* 4 */ val Right: Right with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.OverviewRulerLane with scala.Double
      ] = js.native
  }
  
  @js.native
  object RenderLineNumbersType extends js.Object {
    @js.native
    sealed trait Custom
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderLineNumbersType
    
    @js.native
    sealed trait Interval
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderLineNumbersType
    
    @js.native
    sealed trait Off
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderLineNumbersType
    
    @js.native
    sealed trait On
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderLineNumbersType
    
    @js.native
    sealed trait Relative
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderLineNumbersType
    
    /* 4 */ val Custom: Custom with scala.Double = js.native
    /* 3 */ val Interval: Interval with scala.Double = js.native
    /* 0 */ val Off: Off with scala.Double = js.native
    /* 1 */ val On: On with scala.Double = js.native
    /* 2 */ val Relative: Relative with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderLineNumbersType with scala.Double
      ] = js.native
  }
  
  @js.native
  object RenderMinimap extends js.Object {
    @js.native
    sealed trait Large
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderMinimap
    
    @js.native
    sealed trait LargeBlocks
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderMinimap
    
    @js.native
    sealed trait None
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderMinimap
    
    @js.native
    sealed trait Small
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderMinimap
    
    @js.native
    sealed trait SmallBlocks
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderMinimap
    
    /* 2 */ val Large: Large with scala.Double = js.native
    /* 4 */ val LargeBlocks: LargeBlocks with scala.Double = js.native
    /* 0 */ val None: None with scala.Double = js.native
    /* 1 */ val Small: Small with scala.Double = js.native
    /* 3 */ val SmallBlocks: SmallBlocks with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.editorNs.RenderMinimap with scala.Double] = js.native
  }
  
  @js.native
  object ScrollType extends js.Object {
    @js.native
    sealed trait Immediate
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollType
    
    @js.native
    sealed trait Smooth
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollType
    
    /* 1 */ val Immediate: Immediate with scala.Double = js.native
    /* 0 */ val Smooth: Smooth with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollType with scala.Double] = js.native
  }
  
  @js.native
  object ScrollbarVisibility extends js.Object {
    @js.native
    sealed trait Auto
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollbarVisibility
    
    @js.native
    sealed trait Hidden
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollbarVisibility
    
    @js.native
    sealed trait Visible
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollbarVisibility
    
    /* 1 */ val Auto: Auto with scala.Double = js.native
    /* 2 */ val Hidden: Hidden with scala.Double = js.native
    /* 3 */ val Visible: Visible with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.ScrollbarVisibility with scala.Double
      ] = js.native
  }
  
  @js.native
  object TextEditorCursorBlinkingStyle extends js.Object {
    /**
      * Blinking
      */
    @js.native
    sealed trait Blink
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
    
    /**
      * Expand collapse animation on the y axis
      */
    @js.native
    sealed trait Expand
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
    
    /**
      * Hidden
      */
    @js.native
    sealed trait Hidden
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
    
    /**
      * Blinking with prolonged filled state and smooth fading
      */
    @js.native
    sealed trait Phase
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
    
    /**
      * Blinking with smooth fading
      */
    @js.native
    sealed trait Smooth
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
    
    /**
      * No-Blinking
      */
    @js.native
    sealed trait Solid
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
    
    /* 1 */ val Blink: Blink with scala.Double = js.native
    /* 4 */ val Expand: Expand with scala.Double = js.native
    /* 0 */ val Hidden: Hidden with scala.Double = js.native
    /* 3 */ val Phase: Phase with scala.Double = js.native
    /* 2 */ val Smooth: Smooth with scala.Double = js.native
    /* 5 */ val Solid: Solid with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle with scala.Double
      ] = js.native
  }
  
  @js.native
  object TextEditorCursorStyle extends js.Object {
    /**
      * As a block (sitting on top of a character).
      */
    @js.native
    sealed trait Block
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle
    
    /**
      * As an outlined block (sitting on top of a character).
      */
    @js.native
    sealed trait BlockOutline
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle
    
    /**
      * As a vertical line (sitting between two characters).
      */
    @js.native
    sealed trait Line
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle
    
    /**
      * As a thin vertical line (sitting between two characters).
      */
    @js.native
    sealed trait LineThin
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle
    
    /**
      * As a horizontal line (sitting under a character).
      */
    @js.native
    sealed trait Underline
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle
    
    /**
      * As a thin horizontal line (sitting under a character).
      */
    @js.native
    sealed trait UnderlineThin
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle
    
    /* 2 */ val Block: Block with scala.Double = js.native
    /* 5 */ val BlockOutline: BlockOutline with scala.Double = js.native
    /* 1 */ val Line: Line with scala.Double = js.native
    /* 4 */ val LineThin: LineThin with scala.Double = js.native
    /* 3 */ val Underline: Underline with scala.Double = js.native
    /* 6 */ val UnderlineThin: UnderlineThin with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.TextEditorCursorStyle with scala.Double
      ] = js.native
  }
  
  @js.native
  object TrackedRangeStickiness extends js.Object {
    @js.native
    sealed trait AlwaysGrowsWhenTypingAtEdges
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TrackedRangeStickiness
    
    @js.native
    sealed trait GrowsOnlyWhenTypingAfter
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TrackedRangeStickiness
    
    @js.native
    sealed trait GrowsOnlyWhenTypingBefore
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TrackedRangeStickiness
    
    @js.native
    sealed trait NeverGrowsWhenTypingAtEdges
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.TrackedRangeStickiness
    
    /* 0 */ val AlwaysGrowsWhenTypingAtEdges: AlwaysGrowsWhenTypingAtEdges with scala.Double = js.native
    /* 3 */ val GrowsOnlyWhenTypingAfter: GrowsOnlyWhenTypingAfter with scala.Double = js.native
    /* 2 */ val GrowsOnlyWhenTypingBefore: GrowsOnlyWhenTypingBefore with scala.Double = js.native
    /* 1 */ val NeverGrowsWhenTypingAtEdges: NeverGrowsWhenTypingAtEdges with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.TrackedRangeStickiness with scala.Double
      ] = js.native
  }
  
  @js.native
  object WrappingIndent extends js.Object {
    /**
      * DeepIndent => wrapped lines get +2 indentation toward the parent.
      */
    @js.native
    sealed trait DeepIndent
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.WrappingIndent
    
    /**
      * Indent => wrapped lines get +1 indentation toward the parent.
      */
    @js.native
    sealed trait Indent
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.WrappingIndent
    
    /**
      * No indentation => wrapped lines begin at column 1.
      */
    @js.native
    sealed trait None
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.WrappingIndent
    
    /**
      * Same => wrapped lines get the same indentation as the parent.
      */
    @js.native
    sealed trait Same
      extends monacoDashEditorLib.monacoDashEditorMod.editorNs.WrappingIndent
    
    /* 3 */ val DeepIndent: DeepIndent with scala.Double = js.native
    /* 2 */ val Indent: Indent with scala.Double = js.native
    /* 0 */ val None: None with scala.Double = js.native
    /* 1 */ val Same: Same with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.editorNs.WrappingIndent with scala.Double
      ] = js.native
  }
  
  type ICommandHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[IIdentifiedSingleEditOperation], 
    js.Array[monacoDashEditorLib.monacoDashEditorMod.Selection] | scala.Null
  ]
  type IModel = ITextModel
  type IReadOnlyModel = ITextModel
}

