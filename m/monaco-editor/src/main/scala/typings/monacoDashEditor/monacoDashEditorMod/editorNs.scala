package typings.monacoDashEditor.monacoDashEditorMod

import org.scalablytyped.runtime.StringDictionary
import typings.monacoDashEditor.Anon_Comments
import typings.monacoDashEditor.Anon_FromLineNumber
import typings.monacoDashEditor.Anon_Height
import typings.monacoDashEditor.Anon_LineEnding
import typings.monacoDashEditor.Anon_Model
import typings.monacoDashEditor.Anon_Owner
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.BareFontInfo
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.BuiltinTheme
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.DefaultEndOfLine
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EditorAutoClosingStrategy
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EditorAutoSurroundStrategy
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EditorContribOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EditorLayoutInfo
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EditorWrappingInfo
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLinePreference
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLineSequence
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.FindMatch
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.FontInfo
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IActionDescriptor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IChange
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICharChange
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICodeActionsOnSaveOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICodeEditor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICodeEditorViewState
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IColorizerElementOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IColorizerOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IColors
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICommand
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICommandHandler
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IConfigurationChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IContentWidget
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IContentWidgetPosition
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IContextKey
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICursorPositionChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICursorSelectionChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICursorState
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICursorStateComputer
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICursorStateComputerData
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditorConstructionOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditorModel
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditorOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditorViewState
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffLineInformation
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffNavigator
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffNavigatorOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDimension
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditOperationBuilder
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorAction
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorConstructionOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorContribution
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorFindOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorHoverOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorLightbulbOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorMinimapOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorModel
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorMouseEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorOverrideServices
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorParameterHintOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorScrollbarOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IEditorViewState
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IGotoLocationOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IIdentifiedSingleEditOperation
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ILineChange
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IMarker
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IMarkerData
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelContentChange
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelContentChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelDecoration
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelDecorationOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelDecorationOverviewRulerOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelDecorationsChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelDeltaDecoration
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelLanguageChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelLanguageConfigurationChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IModelOptionsChangedEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IMouseTarget
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.INewScrollPosition
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IOverlayWidget
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IOverlayWidgetPosition
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IPartialEditorMouseEvent
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IRelatedInformation
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IStandaloneCodeEditor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IStandaloneDiffEditor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IStandaloneThemeData
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ISuggestOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ITextModel
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ITextModelUpdateOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ITokenThemeRule
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IViewState
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IViewZone
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IViewZoneChangeAccessor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IWebWorkerOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IWordAtPosition
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalEditorFindOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalEditorHoverOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalEditorMinimapOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalEditorOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalEditorScrollbarOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalEditorViewOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalGoToLocationOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalParameterHintOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.InternalSuggestOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.MonacoWebWorker
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverviewRulerLane
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverviewRulerPosition
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderLineNumbersType
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderMinimap
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollType
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollbarVisibility
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextModelResolvedOptions
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ThemeColor
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.TrackedRangeStickiness
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.WrappingIndent
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
import typings.monacoDashEditor.monacoDashEditorStrings.altKey
import typings.monacoDashEditor.monacoDashEditorStrings.always
import typings.monacoDashEditor.monacoDashEditorStrings.auto
import typings.monacoDashEditor.monacoDashEditorStrings.bold
import typings.monacoDashEditor.monacoDashEditorStrings.bolder
import typings.monacoDashEditor.monacoDashEditorStrings.bottom
import typings.monacoDashEditor.monacoDashEditorStrings.boundary
import typings.monacoDashEditor.monacoDashEditorStrings.bounded
import typings.monacoDashEditor.monacoDashEditorStrings.ctrlCmd
import typings.monacoDashEditor.monacoDashEditorStrings.ctrlKey
import typings.monacoDashEditor.monacoDashEditorStrings.first
import typings.monacoDashEditor.monacoDashEditorStrings.goto
import typings.monacoDashEditor.monacoDashEditorStrings.gotoAndPeek
import typings.monacoDashEditor.monacoDashEditorStrings.gutter
import typings.monacoDashEditor.monacoDashEditorStrings.hidden
import typings.monacoDashEditor.monacoDashEditorStrings.indentation
import typings.monacoDashEditor.monacoDashEditorStrings.inherit
import typings.monacoDashEditor.monacoDashEditorStrings.initial
import typings.monacoDashEditor.monacoDashEditorStrings.interval
import typings.monacoDashEditor.monacoDashEditorStrings.left
import typings.monacoDashEditor.monacoDashEditorStrings.lighter
import typings.monacoDashEditor.monacoDashEditorStrings.line
import typings.monacoDashEditor.monacoDashEditorStrings.metaKey
import typings.monacoDashEditor.monacoDashEditorStrings.mouseover
import typings.monacoDashEditor.monacoDashEditorStrings.none
import typings.monacoDashEditor.monacoDashEditorStrings.normal
import typings.monacoDashEditor.monacoDashEditorStrings.off
import typings.monacoDashEditor.monacoDashEditorStrings.on
import typings.monacoDashEditor.monacoDashEditorStrings.onlySnippets
import typings.monacoDashEditor.monacoDashEditorStrings.peek
import typings.monacoDashEditor.monacoDashEditorStrings.recentlyUsed
import typings.monacoDashEditor.monacoDashEditorStrings.recentlyUsedByPrefix
import typings.monacoDashEditor.monacoDashEditorStrings.relative
import typings.monacoDashEditor.monacoDashEditorStrings.right
import typings.monacoDashEditor.monacoDashEditorStrings.smart
import typings.monacoDashEditor.monacoDashEditorStrings.top
import typings.monacoDashEditor.monacoDashEditorStrings.visible
import typings.monacoDashEditor.monacoDashEditorStrings.wordWrapColumn
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor")
@js.native
object editorNs extends js.Object {
  @js.native
  class BareFontInfo () extends js.Object {
    val _bareFontInfoBrand: Unit = js.native
    val fontFamily: String = js.native
    val fontSize: Double = js.native
    val fontWeight: String = js.native
    val letterSpacing: Double = js.native
    val lineHeight: Double = js.native
    val zoomLevel: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoDashEditor.monacoDashEditorStrings.vs
    - typings.monacoDashEditor.monacoDashEditorStrings.`vs-dark`
    - typings.monacoDashEditor.monacoDashEditorStrings.`hc-black`
  */
  trait BuiltinTheme extends js.Object
  
  @js.native
  sealed trait ContentWidgetPositionPreference extends js.Object
  
  @js.native
  sealed trait CursorChangeReason extends js.Object
  
  @js.native
  sealed trait DefaultEndOfLine extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoDashEditor.monacoDashEditorStrings.always
    - typings.monacoDashEditor.monacoDashEditorStrings.languageDefined
    - typings.monacoDashEditor.monacoDashEditorStrings.beforeWhitespace
    - typings.monacoDashEditor.monacoDashEditorStrings.never
  */
  trait EditorAutoClosingStrategy extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoDashEditor.monacoDashEditorStrings.languageDefined
    - typings.monacoDashEditor.monacoDashEditorStrings.quotes
    - typings.monacoDashEditor.monacoDashEditorStrings.brackets
    - typings.monacoDashEditor.monacoDashEditorStrings.never
  */
  trait EditorAutoSurroundStrategy extends js.Object
  
  trait EditorContribOptions extends js.Object {
    val acceptSuggestionOnCommitCharacter: Boolean
    val acceptSuggestionOnEnter: on | smart | off
    val codeActionsOnSave: ICodeActionsOnSaveOptions
    val codeActionsOnSaveTimeout: Double
    val codeLens: Boolean
    val colorDecorators: Boolean
    val contextmenu: Boolean
    val find: InternalEditorFindOptions
    val folding: Boolean
    val foldingStrategy: auto | indentation
    val formatOnPaste: Boolean
    val formatOnType: Boolean
    val gotoLocation: InternalGoToLocationOptions
    val hover: InternalEditorHoverOptions
    val lightbulbEnabled: Boolean
    val links: Boolean
    val matchBrackets: Boolean
    val occurrencesHighlight: Boolean
    val parameterHints: InternalParameterHintOptions
    val quickSuggestions: Boolean | Anon_Comments
    val quickSuggestionsDelay: Double
    val selectionClipboard: Boolean
    val selectionHighlight: Boolean
    val showFoldingControls: always | mouseover
    val suggest: InternalSuggestOptions
    val suggestFontSize: Double
    val suggestLineHeight: Double
    val suggestOnTriggerCharacters: Boolean
    val suggestSelection: first | recentlyUsed | recentlyUsedByPrefix
    val tabCompletion: on | off | onlySnippets
    val wordBasedSuggestions: Boolean
  }
  
  trait EditorLayoutInfo extends js.Object {
    /**
      * The height of the content (actual height)
      */
    val contentHeight: Double
    /**
      * Left position for the content (actual text)
      */
    val contentLeft: Double
    /**
      * The width of the content (actual text)
      */
    val contentWidth: Double
    /**
      * The height of the line decorations.
      */
    val decorationsHeight: Double
    /**
      * Left position for the line decorations.
      */
    val decorationsLeft: Double
    /**
      * The width of the line decorations.
      */
    val decorationsWidth: Double
    /**
      * The height of the glyph margin.
      */
    val glyphMarginHeight: Double
    /**
      * Left position for the glyph margin.
      */
    val glyphMarginLeft: Double
    /**
      * The width of the glyph margin.
      */
    val glyphMarginWidth: Double
    /**
      * Full editor height.
      */
    val height: Double
    /**
      * The height of the horizontal scrollbar.
      */
    val horizontalScrollbarHeight: Double
    /**
      * The height of the line numbers.
      */
    val lineNumbersHeight: Double
    /**
      * Left position for the line numbers.
      */
    val lineNumbersLeft: Double
    /**
      * The width of the line numbers.
      */
    val lineNumbersWidth: Double
    /**
      * The position for the minimap
      */
    val minimapLeft: Double
    /**
      * The width of the minimap
      */
    val minimapWidth: Double
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
    val verticalScrollbarWidth: Double
    /**
      * The number of columns (of typical characters) fitting on a viewport line.
      */
    val viewportColumn: Double
    /**
      * Full editor width.
      */
    val width: Double
  }
  
  trait EditorWrappingInfo extends js.Object {
    val inDiffEditor: Boolean
    val isDominatedByLongLines: Boolean
    val isViewportWrapping: Boolean
    val isWordWrapMinified: Boolean
    val wordWrapBreakAfterCharacters: String
    val wordWrapBreakBeforeCharacters: String
    val wordWrapBreakObtrusiveCharacters: String
    val wrappingColumn: Double
    val wrappingIndent: WrappingIndent
  }
  
  @js.native
  sealed trait EndOfLinePreference extends js.Object
  
  @js.native
  sealed trait EndOfLineSequence extends js.Object
  
  @js.native
  class FindMatch () extends js.Object {
    var _findMatchBrand: Unit = js.native
    val matches: js.Array[String] | Null = js.native
    val range: Range = js.native
  }
  
  @js.native
  class FontInfo () extends BareFontInfo {
    val _editorStylingBrand: Unit = js.native
    val canUseHalfwidthRightwardsArrow: Boolean = js.native
    val isMonospace: Boolean = js.native
    val isTrusted: Boolean = js.native
    val maxDigitWidth: Double = js.native
    val spaceWidth: Double = js.native
    val typicalFullwidthCharacterWidth: Double = js.native
    val typicalHalfwidthCharacterWidth: Double = js.native
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
    var contextMenuGroupId: js.UndefOr[String] = js.undefined
    /**
      * Control the order in the context menu group.
      */
    var contextMenuOrder: js.UndefOr[Double] = js.undefined
    /**
      * An unique identifier of the contributed action.
      */
    var id: String
    /**
      * The keybinding rule (condition on top of precondition).
      */
    var keybindingContext: js.UndefOr[String] = js.undefined
    /**
      * An array of keybindings for the action.
      */
    var keybindings: js.UndefOr[js.Array[Double]] = js.undefined
    /**
      * A label of the action that will be presented to the user.
      */
    var label: String
    /**
      * Precondition rule.
      */
    var precondition: js.UndefOr[String] = js.undefined
    /**
      * Method that will be executed when the action is triggered.
      * @param editor The editor instance is passed in as a convenience
      */
    def run(editor: ICodeEditor): Unit | js.Promise[Unit]
  }
  
  trait IChange extends js.Object {
    val modifiedEndLineNumber: Double
    val modifiedStartLineNumber: Double
    val originalEndLineNumber: Double
    val originalStartLineNumber: Double
  }
  
  trait ICharChange extends IChange {
    val modifiedEndColumn: Double
    val modifiedStartColumn: Double
    val originalEndColumn: Double
    val originalStartColumn: Double
  }
  
  @js.native
  trait ICodeEditor extends IEditor {
    /**
      * Add a content widget. Widgets must have unique ids, otherwise they will be overwritten.
      */
    def addContentWidget(widget: IContentWidget): Unit = js.native
    /**
      * Add an overlay widget. Widgets must have unique ids, otherwise they will be overwritten.
      */
    def addOverlayWidget(widget: IOverlayWidget): Unit = js.native
    /**
      * Apply the same font settings as the editor to `target`.
      */
    def applyFontInfo(target: HTMLElement): Unit = js.native
    /**
      * Change the view zones. View zones are lost when a new model is attached to the editor.
      */
    def changeViewZones(callback: js.Function1[/* accessor */ IViewZoneChangeAccessor, Unit]): Unit = js.native
    /**
      * All decorations added through this call will get the ownerId of this editor.
      * @see `ITextModel.deltaDecorations`
      */
    def deltaDecorations(oldDecorations: js.Array[String], newDecorations: js.Array[IModelDeltaDecoration]): js.Array[String] = js.native
    /**
      * Execute a command on the editor.
      * The edits will land on the undo-redo stack, but no "undo stop" will be pushed.
      * @param source The source of the call.
      * @param command The command to execute
      */
    def executeCommand(source: String, command: ICommand): Unit = js.native
    /**
      * Execute multiple (concomitant) commands on the editor.
      * @param source The source of the call.
      * @param command The commands to execute
      */
    def executeCommands(source: String, commands: js.Array[ICommand | Null]): Unit = js.native
    /**
      * Execute edits on the editor.
      * The edits will land on the undo-redo stack, but no "undo stop" will be pushed.
      * @param source The source of the call.
      * @param edits The edits to execute.
      * @param endCursorState Cursor state after the edits were applied.
      */
    def executeEdits(source: String, edits: js.Array[IIdentifiedSingleEditOperation]): Boolean = js.native
    def executeEdits(
      source: String,
      edits: js.Array[IIdentifiedSingleEditOperation],
      endCursorState: js.Array[Selection]
    ): Boolean = js.native
    /**
      * Get an action that is a contribution to this editor.
      * @id Unique identifier of the contribution.
      * @return The action or null if action not found.
      */
    def getAction(id: String): IEditorAction = js.native
    /**
      * Returns the current editor's configuration
      */
    def getConfiguration(): InternalEditorOptions = js.native
    /**
      * Get a contribution of this editor.
      * @id Unique identifier of the contribution.
      * @return The contribution or null if contribution not found.
      */
    def getContribution[T /* <: IEditorContribution */](id: String): T = js.native
    /**
      * Returns the editor's dom node
      */
    def getDomNode(): HTMLElement | Null = js.native
    /**
      * Get the layout info for the editor.
      */
    def getLayoutInfo(): EditorLayoutInfo = js.native
    /**
      * Get all the decorations on a line (filtering out decorations from other editors).
      */
    def getLineDecorations(lineNumber: Double): js.Array[IModelDecoration] | Null = js.native
    /**
      * Get the horizontal position (left offset) for the column w.r.t to the beginning of the line.
      * This method works only if the line `lineNumber` is currently rendered (in the editor's viewport).
      * Use this method with caution.
      */
    def getOffsetForColumn(lineNumber: Double, column: Double): Double = js.native
    /**
      * Get the scrollHeight of the editor's viewport.
      */
    def getScrollHeight(): Double = js.native
    /**
      * Get the scrollLeft of the editor's viewport.
      */
    def getScrollLeft(): Double = js.native
    /**
      * Get the scrollTop of the editor's viewport.
      */
    def getScrollTop(): Double = js.native
    /**
      * Get the scrollWidth of the editor's viewport.
      */
    def getScrollWidth(): Double = js.native
    /**
      * Get the visible position for `position`.
      * The result position takes scrolling into account and is relative to the top left corner of the editor.
      * Explanation 1: the results of this method will change for the same `position` if the user scrolls the editor.
      * Explanation 2: the results of this method will not change if the container of the editor gets repositioned.
      * Warning: the results of this method are inaccurate for positions that are outside the current editor viewport.
      */
    def getScrolledVisiblePosition(position: IPosition): Anon_Height | Null = js.native
    /**
      * Get the hit test target at coordinates `clientX` and `clientY`.
      * The coordinates are relative to the top-left of the viewport.
      *
      * @returns Hit test target or null if the coordinates fall outside the editor or the editor has no model.
      */
    def getTargetAtClientPoint(clientX: Double, clientY: Double): IMouseTarget | Null = js.native
    /**
      * Get the vertical position (top offset) for the line w.r.t. to the first line.
      */
    def getTopForLineNumber(lineNumber: Double): Double = js.native
    /**
      * Get the vertical position (top offset) for the position w.r.t. to the first line.
      */
    def getTopForPosition(lineNumber: Double, column: Double): Double = js.native
    /**
      * Get value of the current model attached to this editor.
      * @see `ITextModel.getValue`
      */
    def getValue(): String = js.native
    def getValue(options: Anon_LineEnding): String = js.native
    /**
      * Returns the ranges that are currently visible.
      * Does not account for horizontal scrolling.
      */
    def getVisibleRanges(): js.Array[Range] = js.native
    /**
      * Returns true if the text inside this editor or an editor widget has focus.
      */
    def hasWidgetFocus(): Boolean = js.native
    /**
      * Layout/Reposition a content widget. This is a ping to the editor to call widget.getPosition()
      * and update appropriately.
      */
    def layoutContentWidget(widget: IContentWidget): Unit = js.native
    /**
      * Layout/Reposition an overlay widget. This is a ping to the editor to call widget.getPosition()
      * and update appropriately.
      */
    def layoutOverlayWidget(widget: IOverlayWidget): Unit = js.native
    /**
      * An event emitted after composition has ended.
      */
    def onCompositionEnd(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * An event emitted after composition has started.
      */
    def onCompositionStart(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * An event emitted on a "contextmenu".
      * @event
      */
    def onContextMenu(listener: js.Function1[/* e */ IEditorMouseEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the text inside this editor lost focus (i.e. cursor stops blinking).
      * @event
      */
    def onDidBlurEditorText(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * An event emitted when the text inside this editor or an editor widget lost focus.
      * @event
      */
    def onDidBlurEditorWidget(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * An event emitted when the configuration of the editor has changed. (e.g. `editor.updateOptions()`)
      * @event
      */
    def onDidChangeConfiguration(listener: js.Function1[/* e */ IConfigurationChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the cursor position has changed.
      * @event
      */
    def onDidChangeCursorPosition(listener: js.Function1[/* e */ ICursorPositionChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the cursor selection has changed.
      * @event
      */
    def onDidChangeCursorSelection(listener: js.Function1[/* e */ ICursorSelectionChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the model of this editor has changed (e.g. `editor.setModel()`).
      * @event
      */
    def onDidChangeModel(listener: js.Function1[/* e */ IModelChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the content of the current model has changed.
      * @event
      */
    def onDidChangeModelContent(listener: js.Function1[/* e */ IModelContentChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the decorations of the current model have changed.
      * @event
      */
    def onDidChangeModelDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the language of the current model has changed.
      * @event
      */
    def onDidChangeModelLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the language configuration of the current model has changed.
      * @event
      */
    def onDidChangeModelLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the options of the current model has changed.
      * @event
      */
    def onDidChangeModelOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the text inside this editor gained focus (i.e. cursor starts blinking).
      * @event
      */
    def onDidFocusEditorText(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * An event emitted when the text inside this editor or an editor widget gained focus.
      * @event
      */
    def onDidFocusEditorWidget(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * An event emitted when the layout of the editor has changed.
      * @event
      */
    def onDidLayoutChange(listener: js.Function1[/* e */ EditorLayoutInfo, Unit]): IDisposable = js.native
    /**
      * An event emitted when the scroll in the editor has changed.
      * @event
      */
    def onDidScrollChange(listener: js.Function1[/* e */ IScrollEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted on a "keydown".
      * @event
      */
    def onKeyDown(listener: js.Function1[/* e */ IKeyboardEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted on a "keyup".
      * @event
      */
    def onKeyUp(listener: js.Function1[/* e */ IKeyboardEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted on a "mousedown".
      * @event
      */
    def onMouseDown(listener: js.Function1[/* e */ IEditorMouseEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted on a "mouseleave".
      * @event
      */
    def onMouseLeave(listener: js.Function1[/* e */ IPartialEditorMouseEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted on a "mousemove".
      * @event
      */
    def onMouseMove(listener: js.Function1[/* e */ IEditorMouseEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted on a "mouseup".
      * @event
      */
    def onMouseUp(listener: js.Function1[/* e */ IEditorMouseEvent, Unit]): IDisposable = js.native
    /**
      * Push an "undo stop" in the undo-redo stack.
      */
    def pushUndoStop(): Boolean = js.native
    /**
      * Remove a content widget.
      */
    def removeContentWidget(widget: IContentWidget): Unit = js.native
    /**
      * Remove an overlay widget.
      */
    def removeOverlayWidget(widget: IOverlayWidget): Unit = js.native
    /**
      * Force an editor render now.
      */
    def render(): Unit = js.native
    def render(forceRedraw: Boolean): Unit = js.native
    /**
      * Restores the view state of the editor from a serializable object generated by `saveViewState`.
      */
    def restoreViewState(state: ICodeEditorViewState): Unit = js.native
    /**
      * Sets the current model attached to this editor.
      * If the previous model was created by the editor via the value key in the options
      * literal object, it will be destroyed. Otherwise, if the previous model was set
      * via setModel, or the model key in the options literal object, the previous model
      * will not be destroyed.
      * It is safe to call setModel(null) to simply detach the current model from the editor.
      */
    def setModel(model: ITextModel): Unit = js.native
    /**
      * Change the scrollLeft of the editor's viewport.
      */
    def setScrollLeft(newScrollLeft: Double): Unit = js.native
    /**
      * Change the scroll position of the editor's viewport.
      */
    def setScrollPosition(position: INewScrollPosition): Unit = js.native
    /**
      * Change the scrollTop of the editor's viewport.
      */
    def setScrollTop(newScrollTop: Double): Unit = js.native
    /**
      * Set the value of the current model attached to this editor.
      * @see `ITextModel.setValue`
      */
    def setValue(newValue: String): Unit = js.native
  }
  
  trait ICodeEditorViewState extends IEditorViewState {
    var contributionsState: StringDictionary[js.Any]
    var cursorState: js.Array[ICursorState]
    var viewState: IViewState
  }
  
  trait IColorizerElementOptions extends IColorizerOptions {
    var mimeType: js.UndefOr[String] = js.undefined
    var theme: js.UndefOr[String] = js.undefined
  }
  
  trait IColorizerOptions extends js.Object {
    var tabSize: js.UndefOr[Double] = js.undefined
  }
  
  trait ICommand extends js.Object {
    /**
      * Compute the cursor state after the edit operations were applied.
      * @param model The model the command has executed on.
      * @param helper A helper to get inverse edit operations and to get previously tracked selections.
      * @return The cursor state after the command executed.
      */
    def computeCursorState(model: ITextModel, helper: ICursorStateComputerData): Selection
    /**
      * Get the edit operations needed to execute this command.
      * @param model The model the command will execute on.
      * @param builder A helper to collect the needed edit operations and to track selections.
      */
    def getEditOperations(model: ITextModel, builder: IEditOperationBuilder): Unit
  }
  
  trait IConfigurationChangedEvent extends js.Object {
    val accessibilitySupport: Boolean
    val autoClosingBrackets: Boolean
    val autoClosingQuotes: Boolean
    val autoIndent: Boolean
    val autoSurround: Boolean
    val canUseLayerHinting: Boolean
    val contribInfo: Boolean
    val copyWithSyntaxHighlighting: Boolean
    val dragAndDrop: Boolean
    val editorClassName: Boolean
    val emptySelectionClipboard: Boolean
    val fontInfo: Boolean
    val layoutInfo: Boolean
    val lineHeight: Boolean
    val multiCursorMergeOverlapping: Boolean
    val multiCursorModifier: Boolean
    val pixelRatio: Boolean
    val readOnly: Boolean
    val tabFocusMode: Boolean
    val useTabStops: Boolean
    val viewInfo: Boolean
    val wordSeparators: Boolean
    val wrappingInfo: Boolean
  }
  
  trait IContentWidget extends js.Object {
    /**
      * Render this content widget in a location where it could overflow the editor's view dom node.
      */
    var allowEditorOverflow: js.UndefOr[Boolean] = js.undefined
    var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
    /**
      * Get the dom node of the content widget.
      */
    def getDomNode(): HTMLElement
    /**
      * Get a unique identifier of the content widget.
      */
    def getId(): String
    /**
      * Get the placement of the content widget.
      * If null is returned, the content widget will be placed off screen.
      */
    def getPosition(): IContentWidgetPosition | Null
  }
  
  trait IContentWidgetPosition extends js.Object {
    /**
      * Desired position for the content widget.
      * `preference` will also affect the placement.
      */
    var position: IPosition | Null
    /**
      * Placement preference for position, in order of preference.
      */
    var preference: js.Array[ContentWidgetPositionPreference]
    /**
      * Optionally, a range can be provided to further
      * define the position of the content widget.
      */
    var range: js.UndefOr[IRange | Null] = js.undefined
  }
  
  trait IContextKey[T] extends js.Object {
    def get(): js.UndefOr[T]
    def reset(): Unit
    def set(value: T): Unit
  }
  
  trait ICursorPositionChangedEvent extends js.Object {
    /**
      * Primary cursor's position.
      */
    val position: Position
    /**
      * Reason.
      */
    val reason: CursorChangeReason
    /**
      * Secondary cursors' position.
      */
    val secondaryPositions: js.Array[Position]
    /**
      * Source of the call that caused the event.
      */
    val source: String
  }
  
  trait ICursorSelectionChangedEvent extends js.Object {
    /**
      * Reason.
      */
    val reason: CursorChangeReason
    /**
      * The secondary selections.
      */
    val secondarySelections: js.Array[Selection]
    /**
      * The primary selection.
      */
    val selection: Selection
    /**
      * Source of the call that caused the event.
      */
    val source: String
  }
  
  trait ICursorState extends js.Object {
    var inSelectionMode: Boolean
    var position: IPosition
    var selectionStart: IPosition
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
    def getTrackedSelection(id: String): Selection
  }
  
  @js.native
  trait IDiffEditor extends IEditor {
    /**
      * Get information based on computed diff about a line number from the modified model.
      * If the diff computation is not finished or the model is missing, will return null.
      */
    def getDiffLineInformationForModified(lineNumber: Double): IDiffLineInformation | Null = js.native
    /**
      * Get information based on computed diff about a line number from the original model.
      * If the diff computation is not finished or the model is missing, will return null.
      */
    def getDiffLineInformationForOriginal(lineNumber: Double): IDiffLineInformation | Null = js.native
    /**
      * @see ICodeEditor.getDomNode
      */
    def getDomNode(): HTMLElement = js.native
    /**
      * Get the computed diff information.
      */
    def getLineChanges(): js.Array[ILineChange] | Null = js.native
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
    def onDidUpdateDiff(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * Restores the view state of the editor from a serializable object generated by `saveViewState`.
      */
    def restoreViewState(state: IDiffEditorViewState): Unit = js.native
    /**
      * Sets the current model attached to this editor.
      * If the previous model was created by the editor via the value key in the options
      * literal object, it will be destroyed. Otherwise, if the previous model was set
      * via setModel, or the model key in the options literal object, the previous model
      * will not be destroyed.
      * It is safe to call setModel(null) to simply detach the current model from the editor.
      */
    def setModel(model: IDiffEditorModel): Unit = js.native
  }
  
  trait IDiffEditorConstructionOptions extends IDiffEditorOptions {
    /**
      * Initial theme to be used for rendering.
      * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
      * You can create custom themes via `monaco.editor.defineTheme`.
      * To switch a theme, use `monaco.editor.setTheme`
      */
    var theme: js.UndefOr[String] = js.undefined
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
    var enableSplitViewResizing: js.UndefOr[Boolean] = js.undefined
    /**
      * Compute the diff by ignoring leading/trailing whitespace
      * Defaults to true.
      */
    var ignoreTrimWhitespace: js.UndefOr[Boolean] = js.undefined
    /**
      * Original model should be editable?
      * Defaults to false.
      */
    var originalEditable: js.UndefOr[Boolean] = js.undefined
    /**
      * Render +/- indicators for added/deleted changes.
      * Defaults to true.
      */
    var renderIndicators: js.UndefOr[Boolean] = js.undefined
    /**
      * Render the differences in two side-by-side editors.
      * Defaults to true.
      */
    var renderSideBySide: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IDiffEditorViewState extends IEditorViewState {
    var modified: ICodeEditorViewState | Null
    var original: ICodeEditorViewState | Null
  }
  
  trait IDiffLineInformation extends js.Object {
    val equivalentLineNumber: Double
  }
  
  trait IDiffNavigator extends js.Object {
    def canNavigate(): Boolean
    def dispose(): Unit
    def next(): Unit
    def previous(): Unit
  }
  
  trait IDiffNavigatorOptions extends js.Object {
    val alwaysRevealFirst: js.UndefOr[Boolean] = js.undefined
    val followsCaret: js.UndefOr[Boolean] = js.undefined
    val ignoreCharChanges: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IDimension extends js.Object {
    var height: Double
    var width: Double
  }
  
  @js.native
  trait IEditOperationBuilder extends js.Object {
    def addEditOperation(range: Range): Unit = js.native
    /**
      * Add a new edit operation (a replace operation).
      * @param range The range to replace (delete). May be empty to represent a simple insert.
      * @param text The text to replace with. May be null to represent a simple delete.
      */
    def addEditOperation(range: Range, text: String): Unit = js.native
    def addTrackedEditOperation(range: Range): Unit = js.native
    /**
      * Add a new edit operation (a replace operation).
      * The inverse edits will be accessible in `ICursorStateComputerData.getInverseEditOperations()`
      * @param range The range to replace (delete). May be empty to represent a simple insert.
      * @param text The text to replace with. May be null to represent a simple delete.
      */
    def addTrackedEditOperation(range: Range, text: String): Unit = js.native
    /**
      * Track `selection` when applying edit operations.
      * A best effort will be made to not grow/expand the selection.
      * An empty selection will clamp to a nearby character.
      * @param selection The selection to track.
      * @param trackPreviousOnEmpty If set, and the selection is empty, indicates whether the selection
      *           should clamp to the previous or the next character.
      * @return A unique identifier.
      */
    def trackSelection(selection: Selection): String = js.native
    def trackSelection(selection: Selection, trackPreviousOnEmpty: Boolean): String = js.native
  }
  
  @js.native
  trait IEditor extends js.Object {
    /**
      * Dispose the editor.
      */
    def dispose(): Unit = js.native
    /**
      * Brings browser focus to the editor text
      */
    def focus(): Unit = js.native
    /**
      * Get the editor type. Please see `EditorType`.
      * This is to avoid an instanceof check
      */
    def getEditorType(): String = js.native
    /**
      * Get a unique id for this editor instance.
      */
    def getId(): String = js.native
    /**
      * Gets the current model attached to this editor.
      */
    def getModel(): IEditorModel | Null = js.native
    /**
      * Returns the primary position of the cursor.
      */
    def getPosition(): Position | Null = js.native
    /**
      * Returns the primary selection of the editor.
      */
    def getSelection(): Selection | Null = js.native
    /**
      * Returns all the selections of the editor.
      */
    def getSelections(): js.Array[Selection] | Null = js.native
    /**
      * Returns all actions associated with this editor.
      */
    def getSupportedActions(): js.Array[IEditorAction] = js.native
    /**
      * Given a position, returns a column number that takes tab-widths into account.
      */
    def getVisibleColumnFromPosition(position: IPosition): Double = js.native
    /**
      * Returns true if the text inside this editor is focused (i.e. cursor is blinking).
      */
    def hasTextFocus(): Boolean = js.native
    /**
      * Instructs the editor to remeasure its container. This method should
      * be called when the container of the editor gets resized.
      */
    def layout(): Unit = js.native
    def layout(dimension: IDimension): Unit = js.native
    /**
      * An event emitted when the editor has been disposed.
      * @event
      */
    def onDidDispose(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * Restores the view state of the editor from a serializable object generated by `saveViewState`.
      */
    def restoreViewState(state: IEditorViewState): Unit = js.native
    /**
      * Scroll vertically as necessary and reveal a line.
      */
    def revealLine(lineNumber: Double): Unit = js.native
    def revealLine(lineNumber: Double, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically as necessary and reveal a line centered vertically.
      */
    def revealLineInCenter(lineNumber: Double): Unit = js.native
    def revealLineInCenter(lineNumber: Double, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically as necessary and reveal a line centered vertically only if it lies outside the viewport.
      */
    def revealLineInCenterIfOutsideViewport(lineNumber: Double): Unit = js.native
    def revealLineInCenterIfOutsideViewport(lineNumber: Double, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically as necessary and reveal lines.
      */
    def revealLines(startLineNumber: Double, endLineNumber: Double): Unit = js.native
    def revealLines(startLineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically as necessary and reveal lines centered vertically.
      */
    def revealLinesInCenter(lineNumber: Double, endLineNumber: Double): Unit = js.native
    def revealLinesInCenter(lineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically as necessary and reveal lines centered vertically only if it lies outside the viewport.
      */
    def revealLinesInCenterIfOutsideViewport(lineNumber: Double, endLineNumber: Double): Unit = js.native
    def revealLinesInCenterIfOutsideViewport(lineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a position.
      */
    def revealPosition(position: IPosition): Unit = js.native
    def revealPosition(position: IPosition, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a position centered vertically.
      */
    def revealPositionInCenter(position: IPosition): Unit = js.native
    def revealPositionInCenter(position: IPosition, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a position centered vertically only if it lies outside the viewport.
      */
    def revealPositionInCenterIfOutsideViewport(position: IPosition): Unit = js.native
    def revealPositionInCenterIfOutsideViewport(position: IPosition, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range.
      */
    def revealRange(range: IRange): Unit = js.native
    def revealRange(range: IRange, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range at the top of the viewport.
      */
    def revealRangeAtTop(range: IRange): Unit = js.native
    def revealRangeAtTop(range: IRange, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range centered vertically.
      */
    def revealRangeInCenter(range: IRange): Unit = js.native
    def revealRangeInCenter(range: IRange, scrollType: ScrollType): Unit = js.native
    /**
      * Scroll vertically or horizontally as necessary and reveal a range centered vertically only if it lies outside the viewport.
      */
    def revealRangeInCenterIfOutsideViewport(range: IRange): Unit = js.native
    def revealRangeInCenterIfOutsideViewport(range: IRange, scrollType: ScrollType): Unit = js.native
    /**
      * Saves current view state of the editor in a serializable object.
      */
    def saveViewState(): IEditorViewState | Null = js.native
    def setModel(): Unit = js.native
    /**
      * Sets the current model attached to this editor.
      * If the previous model was created by the editor via the value key in the options
      * literal object, it will be destroyed. Otherwise, if the previous model was set
      * via setModel, or the model key in the options literal object, the previous model
      * will not be destroyed.
      * It is safe to call setModel(null) to simply detach the current model from the editor.
      */
    def setModel(model: IEditorModel): Unit = js.native
    /**
      * Set the primary position of the cursor. This will remove any secondary cursors.
      * @param position New primary cursor's position
      */
    def setPosition(position: IPosition): Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: IRange): Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: ISelection): Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: Range): Unit = js.native
    /**
      * Set the primary selection of the editor. This will remove any secondary cursors.
      * @param selection The new selection
      */
    def setSelection(selection: Selection): Unit = js.native
    /**
      * Set the selections for all the cursors of the editor.
      * Cursors will be removed or added, as necessary.
      */
    def setSelections(selections: js.Array[ISelection]): Unit = js.native
    /**
      * Directly trigger a handler or an editor action.
      * @param source The source of the call.
      * @param handlerId The id of the handler or the id of a contribution.
      * @param payload Extra data to be sent to the handler.
      */
    def trigger(source: String, handlerId: String, payload: js.Any): Unit = js.native
    /**
      * Update the editor's options after the editor has been created.
      */
    def updateOptions(newOptions: IEditorOptions): Unit = js.native
  }
  
  trait IEditorAction extends js.Object {
    val alias: String
    val id: String
    val label: String
    def isSupported(): Boolean
    def run(): js.Promise[Unit]
  }
  
  trait IEditorConstructionOptions extends IEditorOptions {
    /**
      * An URL to open when Ctrl+H (Windows and Linux) or Cmd+H (OSX) is pressed in
      * the accessibility help dialog in the editor.
      *
      * Defaults to "https://go.microsoft.com/fwlink/?linkid=852450"
      */
    var accessibilityHelpUrl: js.UndefOr[String] = js.undefined
    /**
      * The initial language of the auto created model in the editor.
      * To not create automatically a model, use `model: null`.
      */
    var language: js.UndefOr[String] = js.undefined
    /**
      * The initial model associated with this code editor.
      */
    var model: js.UndefOr[ITextModel | Null] = js.undefined
    /**
      * Initial theme to be used for rendering.
      * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
      * You can create custom themes via `monaco.editor.defineTheme`.
      * To switch a theme, use `monaco.editor.setTheme`
      */
    var theme: js.UndefOr[String] = js.undefined
    /**
      * The initial value of the auto created model in the editor.
      * To not create automatically a model, use `model: null`.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  
  trait IEditorContribution extends js.Object {
    /**
      * Restore view state.
      */
    var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
    /**
      * Store view state.
      */
    var saveViewState: js.UndefOr[js.Function0[_]] = js.undefined
    /**
      * Dispose this contribution.
      */
    def dispose(): Unit
    /**
      * Get a unique identifier for this contribution.
      */
    def getId(): String
  }
  
  trait IEditorFindOptions extends js.Object {
    var addExtraSpaceOnTop: js.UndefOr[Boolean] = js.undefined
    /**
      * Controls if Find in Selection flag is turned on when multiple lines of text are selected in the editor.
      */
    var autoFindInSelection: Boolean
    /**
      * Controls if we seed search string in the Find Widget with editor selection.
      */
    var seedSearchStringFromSelection: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IEditorHoverOptions extends js.Object {
    /**
      * Delay for showing the hover.
      * Defaults to 300.
      */
    var delay: js.UndefOr[Double] = js.undefined
    /**
      * Enable the hover.
      * Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Is the hover sticky such that it can be clicked and its contents selected?
      * Defaults to true.
      */
    var sticky: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IEditorLightbulbOptions extends js.Object {
    /**
      * Enable the lightbulb code action.
      * Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IEditorMinimapOptions extends js.Object {
    /**
      * Enable the rendering of the minimap.
      * Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Limit the width of the minimap to render at most a certain number of columns.
      * Defaults to 120.
      */
    var maxColumn: js.UndefOr[Double] = js.undefined
    /**
      * Render the actual text on a line (as opposed to color blocks).
      * Defaults to true.
      */
    var renderCharacters: js.UndefOr[Boolean] = js.undefined
    /**
      * Control the rendering of the minimap slider.
      * Defaults to 'mouseover'.
      */
    var showSlider: js.UndefOr[always | mouseover] = js.undefined
    /**
      * Control the side of the minimap in editor.
      * Defaults to 'right'.
      */
    var side: js.UndefOr[right | left] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoDashEditor.monacoDashEditorMod.editorNs.ITextModel
    - typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditorModel
  */
  trait IEditorModel extends js.Object
  
  trait IEditorMouseEvent extends js.Object {
    val event: IMouseEvent
    val target: IMouseTarget
  }
  
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
    var renderWhitespace: js.UndefOr[none | boundary | all] = js.undefined
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
  
  trait IEditorParameterHintOptions extends js.Object {
    /**
      * Enable cycling of parameter hints.
      * Defaults to false.
      */
    var cycle: js.UndefOr[Boolean] = js.undefined
    /**
      * Enable parameter hints.
      * Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IEditorScrollbarOptions extends js.Object {
    /**
      * The size of arrows (if displayed).
      * Defaults to 11.
      */
    var arrowSize: js.UndefOr[Double] = js.undefined
    /**
      * Listen to mouse wheel events and react to them by scrolling.
      * Defaults to true.
      */
    var handleMouseWheel: js.UndefOr[Boolean] = js.undefined
    /**
      * Render horizontal scrollbar.
      * Defaults to 'auto'.
      */
    var horizontal: js.UndefOr[auto | visible | hidden] = js.undefined
    /**
      * Render arrows at the left and right of the horizontal scrollbar.
      * Defaults to false.
      */
    var horizontalHasArrows: js.UndefOr[Boolean] = js.undefined
    /**
      * Height in pixels for the horizontal scrollbar.
      * Defaults to 10 (px).
      */
    var horizontalScrollbarSize: js.UndefOr[Double] = js.undefined
    /**
      * Height in pixels for the horizontal slider.
      * Defaults to `horizontalScrollbarSize`.
      */
    var horizontalSliderSize: js.UndefOr[Double] = js.undefined
    /**
      * Cast horizontal and vertical shadows when the content is scrolled.
      * Defaults to true.
      */
    var useShadows: js.UndefOr[Boolean] = js.undefined
    /**
      * Render vertical scrollbar.
      * Defaults to 'auto'.
      */
    var vertical: js.UndefOr[auto | visible | hidden] = js.undefined
    /**
      * Render arrows at the top and bottom of the vertical scrollbar.
      * Defaults to false.
      */
    var verticalHasArrows: js.UndefOr[Boolean] = js.undefined
    /**
      * Width in pixels for the vertical scrollbar.
      * Defaults to 10 (px).
      */
    var verticalScrollbarSize: js.UndefOr[Double] = js.undefined
    /**
      * Width in pixels for the vertical slider.
      * Defaults to `verticalScrollbarSize`.
      */
    var verticalSliderSize: js.UndefOr[Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoDashEditor.monacoDashEditorMod.editorNs.ICodeEditorViewState
    - typings.monacoDashEditor.monacoDashEditorMod.editorNs.IDiffEditorViewState
  */
  trait IEditorViewState extends js.Object
  
  trait IGotoLocationOptions extends js.Object {
    /**
      * Control how goto-command work when having multiple results.
      */
    var multiple: js.UndefOr[peek | gotoAndPeek | goto] = js.undefined
  }
  
  trait IIdentifiedSingleEditOperation extends js.Object {
    /**
      * This indicates that this operation has "insert" semantics.
      * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
      */
    var forceMoveMarkers: js.UndefOr[Boolean] = js.undefined
    /**
      * The range to replace. This can be empty to emulate a simple insert.
      */
    var range: Range
    /**
      * The text to replace with. This can be null to emulate a simple delete.
      */
    var text: String | Null
  }
  
  trait ILineChange extends IChange {
    val charChanges: js.UndefOr[js.Array[ICharChange]] = js.undefined
  }
  
  trait IMarker extends js.Object {
    var code: js.UndefOr[String] = js.undefined
    var endColumn: Double
    var endLineNumber: Double
    var message: String
    var owner: String
    var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.undefined
    var resource: Uri
    var severity: MarkerSeverity
    var source: js.UndefOr[String] = js.undefined
    var startColumn: Double
    var startLineNumber: Double
    var tags: js.UndefOr[js.Array[MarkerTag]] = js.undefined
  }
  
  trait IMarkerData extends js.Object {
    var code: js.UndefOr[String] = js.undefined
    var endColumn: Double
    var endLineNumber: Double
    var message: String
    var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.undefined
    var severity: MarkerSeverity
    var source: js.UndefOr[String] = js.undefined
    var startColumn: Double
    var startLineNumber: Double
    var tags: js.UndefOr[js.Array[MarkerTag]] = js.undefined
  }
  
  trait IModelChangedEvent extends js.Object {
    /**
      * The `uri` of the new model or null.
      */
    val newModelUrl: Uri | Null
    /**
      * The `uri` of the previous model or null.
      */
    val oldModelUrl: Uri | Null
  }
  
  trait IModelContentChange extends js.Object {
    /**
      * The range that got replaced.
      */
    val range: IRange
    /**
      * The length of the range that got replaced.
      */
    val rangeLength: Double
    /**
      * The offset of the range that got replaced.
      */
    val rangeOffset: Double
    /**
      * The new text for the range.
      */
    val text: String
  }
  
  trait IModelContentChangedEvent extends js.Object {
    val changes: js.Array[IModelContentChange]
    /**
      * The (new) end-of-line character.
      */
    val eol: String
    /**
      * Flag that indicates that all decorations were lost with this edit.
      * The model has been reset to a new value.
      */
    val isFlush: Boolean
    /**
      * Flag that indicates that this event was generated while redoing.
      */
    val isRedoing: Boolean
    /**
      * Flag that indicates that this event was generated while undoing.
      */
    val isUndoing: Boolean
    /**
      * The new version id the model has transitioned to.
      */
    val versionId: Double
  }
  
  trait IModelDecoration extends js.Object {
    /**
      * Identifier for a decoration.
      */
    val id: String
    /**
      * Options associated with this decoration.
      */
    val options: IModelDecorationOptions
    /**
      * Identifier for a decoration's owner.
      */
    val ownerId: Double
    /**
      * Range that this decoration covers.
      */
    val range: Range
  }
  
  trait IModelDecorationOptions extends js.Object {
    /**
      * If set, the decoration will be rendered after the text with this CSS class name.
      */
    var afterContentClassName: js.UndefOr[String | Null] = js.undefined
    /**
      * If set, the decoration will be rendered before the text with this CSS class name.
      */
    var beforeContentClassName: js.UndefOr[String | Null] = js.undefined
    /**
      * CSS class name describing the decoration.
      */
    var className: js.UndefOr[String | Null] = js.undefined
    /**
      * If set, the decoration will be rendered in the glyph margin with this CSS class name.
      */
    var glyphMarginClassName: js.UndefOr[String | Null] = js.undefined
    /**
      * Message to be rendered when hovering over the glyph margin decoration.
      */
    var glyphMarginHoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.undefined
    /**
      * Array of MarkdownString to render as the decoration message.
      */
    var hoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.undefined
    /**
      * If set, the decoration will be rendered inline with the text with this CSS class name.
      * Please use this only for CSS rules that must impact the text. For example, use `className`
      * to have a background color decoration.
      */
    var inlineClassName: js.UndefOr[String | Null] = js.undefined
    /**
      * If there is an `inlineClassName` which affects letter spacing.
      */
    var inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.undefined
    /**
      * Should the decoration expand to encompass a whole line.
      */
    var isWholeLine: js.UndefOr[Boolean] = js.undefined
    /**
      * If set, the decoration will be rendered in the lines decorations with this CSS class name.
      */
    var linesDecorationsClassName: js.UndefOr[String | Null] = js.undefined
    /**
      * If set, the decoration will be rendered in the margin (covering its full width) with this CSS class name.
      */
    var marginClassName: js.UndefOr[String | Null] = js.undefined
    /**
      * If set, render this decoration in the overview ruler.
      */
    var overviewRuler: js.UndefOr[IModelDecorationOverviewRulerOptions | Null] = js.undefined
    /**
      * Customize the growing behavior of the decoration when typing at the edges of the decoration.
      * Defaults to TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges
      */
    var stickiness: js.UndefOr[TrackedRangeStickiness] = js.undefined
    /**
      * Specifies the stack order of a decoration.
      * A decoration with greater stack order is always in front of a decoration with a lower stack order.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  
  trait IModelDecorationOverviewRulerOptions extends js.Object {
    /**
      * CSS color to render in the overview ruler.
      * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
      */
    var color: js.UndefOr[String | ThemeColor] = js.undefined
    /**
      * CSS color to render in the overview ruler.
      * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
      */
    var darkColor: js.UndefOr[String | ThemeColor] = js.undefined
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
    var range: IRange
  }
  
  trait IModelLanguageChangedEvent extends js.Object {
    /**
      * New language
      */
    val newLanguage: String
    /**
      * Previous language
      */
    val oldLanguage: String
  }
  
  trait IModelLanguageConfigurationChangedEvent extends js.Object
  
  trait IModelOptionsChangedEvent extends js.Object {
    val indentSize: Boolean
    val insertSpaces: Boolean
    val tabSize: Boolean
    val trimAutoWhitespace: Boolean
  }
  
  trait IModelTokensChangedEvent extends js.Object {
    val ranges: js.Array[Anon_FromLineNumber]
    val tokenizationSupportChanged: Boolean
  }
  
  trait IMouseTarget extends js.Object {
    /**
      * Some extra detail.
      */
    val detail: js.Any
    /**
      * The target element
      */
    val element: Element | Null
    /**
      * Desired mouse column (e.g. when position.column gets clamped to text length -- clicking after text on a line).
      */
    val mouseColumn: Double
    /**
      * The 'approximate' editor position
      */
    val position: Position | Null
    /**
      * The 'approximate' editor range
      */
    val range: Range | Null
    /**
      * The target type
      */
    val `type`: MouseTargetType
  }
  
  trait INewScrollPosition extends js.Object {
    var scrollLeft: js.UndefOr[Double] = js.undefined
    var scrollTop: js.UndefOr[Double] = js.undefined
  }
  
  trait IOverlayWidget extends js.Object {
    /**
      * Get the dom node of the overlay widget.
      */
    def getDomNode(): HTMLElement
    /**
      * Get a unique identifier of the overlay widget.
      */
    def getId(): String
    /**
      * Get the placement of the overlay widget.
      * If null is returned, the overlay widget is responsible to place itself.
      */
    def getPosition(): IOverlayWidgetPosition | Null
  }
  
  trait IOverlayWidgetPosition extends js.Object {
    /**
      * The position preference for the overlay widget.
      */
    var preference: OverlayWidgetPositionPreference | Null
  }
  
  trait IPartialEditorMouseEvent extends js.Object {
    val event: IMouseEvent
    val target: IMouseTarget | Null
  }
  
  trait IRelatedInformation extends js.Object {
    var endColumn: Double
    var endLineNumber: Double
    var message: String
    var resource: Uri
    var startColumn: Double
    var startLineNumber: Double
  }
  
  trait ISingleEditOperation extends js.Object {
    /**
      * This indicates that this operation has "insert" semantics.
      * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
      */
    var forceMoveMarkers: js.UndefOr[Boolean] = js.undefined
    /**
      * The range to replace. This can be empty to emulate a simple insert.
      */
    var range: IRange
    /**
      * The text to replace with. This can be null to emulate a simple delete.
      */
    var text: String | Null
  }
  
  trait ISingleEditOperationIdentifier extends js.Object {
    /**
      * Identifier major
      */
    var major: Double
    /**
      * Identifier minor
      */
    var minor: Double
  }
  
  @js.native
  trait IStandaloneCodeEditor extends ICodeEditor {
    def addAction(descriptor: IActionDescriptor): IDisposable = js.native
    def addCommand(keybinding: Double, handler: ICommandHandler): String | Null = js.native
    def addCommand(keybinding: Double, handler: ICommandHandler, context: String): String | Null = js.native
    def createContextKey[T](key: String, defaultValue: T): IContextKey[T] = js.native
  }
  
  @js.native
  trait IStandaloneDiffEditor extends IDiffEditor {
    def addAction(descriptor: IActionDescriptor): IDisposable = js.native
    def addCommand(keybinding: Double, handler: ICommandHandler): String | Null = js.native
    def addCommand(keybinding: Double, handler: ICommandHandler, context: String): String | Null = js.native
    def createContextKey[T](key: String, defaultValue: T): IContextKey[T] = js.native
  }
  
  trait IStandaloneThemeData extends js.Object {
    var base: BuiltinTheme
    var colors: IColors
    var encodedTokensColors: js.UndefOr[js.Array[String]] = js.undefined
    var inherit: Boolean
    var rules: js.Array[ITokenThemeRule]
  }
  
  trait ISuggestOptions extends js.Object {
    /**
      * Enable graceful matching. Defaults to true.
      */
    var filterGraceful: js.UndefOr[Boolean] = js.undefined
    /**
      * Names of suggestion types to filter.
      */
    var filteredTypes: js.UndefOr[Record[String, Boolean]] = js.undefined
    /**
      * Favours words that appear close to the cursor.
      */
    var localityBonus: js.UndefOr[Boolean] = js.undefined
    /**
      * Max suggestions to show in suggestions. Defaults to 12.
      */
    var maxVisibleSuggestions: js.UndefOr[Boolean] = js.undefined
    /**
      * Enable using global storage for remembering suggestions.
      */
    var shareSuggestSelections: js.UndefOr[Boolean] = js.undefined
    /**
      * Enable or disable icons in suggestions. Defaults to true.
      */
    var showIcons: js.UndefOr[Boolean] = js.undefined
    /**
      * Prevent quick suggestions when a snippet is active. Defaults to true.
      */
    var snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  trait ITextModel extends IEditorModel {
    /**
      * A unique identifier associated with this model.
      */
    val id: String = js.native
    /**
      * Gets the resource associated with this editor model.
      */
    val uri: Uri = js.native
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
    def deltaDecorations(oldDecorations: js.Array[String], newDecorations: js.Array[IModelDeltaDecoration]): js.Array[String] = js.native
    def deltaDecorations(oldDecorations: js.Array[String], newDecorations: js.Array[IModelDeltaDecoration], ownerId: Double): js.Array[String] = js.native
    /**
      * Detect the indentation options for this model from its content.
      */
    def detectIndentation(defaultInsertSpaces: Boolean, defaultTabSize: Double): Unit = js.native
    /**
      * Destroy this model. This will unbind the model from the mode
      * and make all necessary clean-up to release this object to the GC.
      */
    def dispose(): Unit = js.native
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
      searchString: String,
      searchOnlyEditableRange: Boolean,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: String,
      captureMatches: Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: String,
      searchOnlyEditableRange: Boolean,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: String,
      captureMatches: Boolean,
      limitResultCount: Double
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: String,
      searchOnlyEditableRange: Boolean,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: Null,
      captureMatches: Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: String,
      searchOnlyEditableRange: Boolean,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: Null,
      captureMatches: Boolean,
      limitResultCount: Double
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
      searchString: String,
      searchScope: IRange,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: String,
      captureMatches: Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: String,
      searchScope: IRange,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: String,
      captureMatches: Boolean,
      limitResultCount: Double
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: String,
      searchScope: IRange,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: Null,
      captureMatches: Boolean
    ): js.Array[FindMatch] = js.native
    def findMatches(
      searchString: String,
      searchScope: IRange,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: Null,
      captureMatches: Boolean,
      limitResultCount: Double
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
      searchString: String,
      searchStart: IPosition,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: String,
      captureMatches: Boolean
    ): FindMatch | Null = js.native
    def findNextMatch(
      searchString: String,
      searchStart: IPosition,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: Null,
      captureMatches: Boolean
    ): FindMatch | Null = js.native
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
      searchString: String,
      searchStart: IPosition,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: String,
      captureMatches: Boolean
    ): FindMatch | Null = js.native
    def findPreviousMatch(
      searchString: String,
      searchStart: IPosition,
      isRegex: Boolean,
      matchCase: Boolean,
      wordSeparators: Null,
      captureMatches: Boolean
    ): FindMatch | Null = js.native
    /**
      * Gets all the decorations as an array.
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      */
    def getAllDecorations(): js.Array[IModelDecoration] = js.native
    def getAllDecorations(ownerId: Double): js.Array[IModelDecoration] = js.native
    def getAllDecorations(ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Get the alternative version id of the model.
      * This alternative version id is not always incremented,
      * it will return the same values in the case of undo-redo.
      */
    def getAlternativeVersionId(): Double = js.native
    /**
      * Get the options associated with a decoration.
      * @param id The decoration id.
      * @return The decoration options or null if the decoration was not found.
      */
    def getDecorationOptions(id: String): IModelDecorationOptions | Null = js.native
    /**
      * Get the range associated with a decoration.
      * @param id The decoration id.
      * @return The decoration range or null if the decoration was not found.
      */
    def getDecorationRange(id: String): Range | Null = js.native
    /**
      * Gets all the decorations in a range as an array. Only `startLineNumber` and `endLineNumber` from `range` are used for filtering.
      * So for now it returns all the decorations on the same line as `range`.
      * @param range The range to search in
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      * @return An array with the decorations
      */
    def getDecorationsInRange(range: IRange): js.Array[IModelDecoration] = js.native
    def getDecorationsInRange(range: IRange, ownerId: Double): js.Array[IModelDecoration] = js.native
    def getDecorationsInRange(range: IRange, ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Get the end of line sequence predominantly used in the text buffer.
      * @return EOL char sequence (e.g.: '\n' or '\r\n').
      */
    def getEOL(): String = js.native
    /**
      * Get a range covering the entire model
      */
    def getFullModelRange(): Range = js.native
    /**
      * Get the text for a certain line.
      */
    def getLineContent(lineNumber: Double): String = js.native
    /**
      * Get the number of lines in the model.
      */
    def getLineCount(): Double = js.native
    /**
      * Gets all the decorations for the line `lineNumber` as an array.
      * @param lineNumber The line number
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      * @return An array with the decorations
      */
    def getLineDecorations(lineNumber: Double): js.Array[IModelDecoration] = js.native
    def getLineDecorations(lineNumber: Double, ownerId: Double): js.Array[IModelDecoration] = js.native
    def getLineDecorations(lineNumber: Double, ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Returns the column before the first non whitespace character for line at `lineNumber`.
      * Returns 0 if line is empty or contains only whitespace.
      */
    def getLineFirstNonWhitespaceColumn(lineNumber: Double): Double = js.native
    /**
      * Returns the column after the last non whitespace character for line at `lineNumber`.
      * Returns 0 if line is empty or contains only whitespace.
      */
    def getLineLastNonWhitespaceColumn(lineNumber: Double): Double = js.native
    /**
      * Get the text length for a certain line.
      */
    def getLineLength(lineNumber: Double): Double = js.native
    /**
      * Get the maximum legal column for line at `lineNumber`
      */
    def getLineMaxColumn(lineNumber: Double): Double = js.native
    /**
      * Get the minimum legal column for line at `lineNumber`
      */
    def getLineMinColumn(lineNumber: Double): Double = js.native
    /**
      * Get the text for all lines.
      */
    def getLinesContent(): js.Array[String] = js.native
    /**
      * Gets all the decorations for the lines between `startLineNumber` and `endLineNumber` as an array.
      * @param startLineNumber The start line number
      * @param endLineNumber The end line number
      * @param ownerId If set, it will ignore decorations belonging to other owners.
      * @param filterOutValidation If set, it will ignore decorations specific to validation (i.e. warnings, errors).
      * @return An array with the decorations
      */
    def getLinesDecorations(startLineNumber: Double, endLineNumber: Double): js.Array[IModelDecoration] = js.native
    def getLinesDecorations(startLineNumber: Double, endLineNumber: Double, ownerId: Double): js.Array[IModelDecoration] = js.native
    def getLinesDecorations(startLineNumber: Double, endLineNumber: Double, ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Get the language associated with this model.
      */
    def getModeId(): String = js.native
    /**
      * Converts the position to a zero-based offset.
      *
      * The position will be [adjusted](#TextDocument.validatePosition).
      *
      * @param position A position.
      * @return A valid zero-based offset.
      */
    def getOffsetAt(position: IPosition): Double = js.native
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
    def getOverviewRulerDecorations(ownerId: Double): js.Array[IModelDecoration] = js.native
    def getOverviewRulerDecorations(ownerId: Double, filterOutValidation: Boolean): js.Array[IModelDecoration] = js.native
    /**
      * Converts a zero-based offset to a position.
      *
      * @param offset A zero-based offset.
      * @return A valid [position](#Position).
      */
    def getPositionAt(offset: Double): Position = js.native
    /**
      * Get the text stored in this model.
      * @param eol The end of line character preference. Defaults to `EndOfLinePreference.TextDefined`.
      * @param preserverBOM Preserve a BOM character if it was detected when the model was constructed.
      * @return The text.
      */
    def getValue(): String = js.native
    def getValue(eol: EndOfLinePreference): String = js.native
    def getValue(eol: EndOfLinePreference, preserveBOM: Boolean): String = js.native
    /**
      * Get the text in a certain range.
      * @param range The range describing what text to get.
      * @param eol The end of line character preference. This will only be used for multiline ranges. Defaults to `EndOfLinePreference.TextDefined`.
      * @return The text.
      */
    def getValueInRange(range: IRange): String = js.native
    def getValueInRange(range: IRange, eol: EndOfLinePreference): String = js.native
    /**
      * Get the length of the text stored in this model.
      */
    def getValueLength(): Double = js.native
    def getValueLength(eol: EndOfLinePreference): Double = js.native
    def getValueLength(eol: EndOfLinePreference, preserveBOM: Boolean): Double = js.native
    /**
      * Get the length of text in a certain range.
      * @param range The range describing what text length to get.
      * @return The text length.
      */
    def getValueLengthInRange(range: IRange): Double = js.native
    /**
      * Get the current version id of the model.
      * Anytime a change happens to the model (even undo/redo),
      * the version id is incremented.
      */
    def getVersionId(): Double = js.native
    /**
      * Get the word under or besides `position`.
      * @param position The position to look for a word.
      * @return The word under or besides `position`. Might be null.
      */
    def getWordAtPosition(position: IPosition): IWordAtPosition | Null = js.native
    /**
      * Get the word under or besides `position` trimmed to `position`.column
      * @param position The position to look for a word.
      * @return The word under or besides `position`. Will never be null.
      */
    def getWordUntilPosition(position: IPosition): IWordAtPosition = js.native
    /**
      * Returns if the model was disposed or not.
      */
    def isDisposed(): Boolean = js.native
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
    def modifyPosition(position: IPosition, offset: Double): Position = js.native
    /**
      * Normalize a string containing whitespace according to indentation rules (converts to spaces or to tabs).
      */
    def normalizeIndentation(str: String): String = js.native
    /**
      * An event emitted when the contents of the model have changed.
      * @event
      */
    def onDidChangeContent(listener: js.Function1[/* e */ IModelContentChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when decorations of the model have changed.
      * @event
      */
    def onDidChangeDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the language associated with the model has changed.
      * @event
      */
    def onDidChangeLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the language configuration associated with the model has changed.
      * @event
      */
    def onDidChangeLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted when the model options have changed.
      * @event
      */
    def onDidChangeOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, Unit]): IDisposable = js.native
    /**
      * An event emitted right before disposing the model.
      * @event
      */
    def onWillDispose(listener: js.Function0[Unit]): IDisposable = js.native
    /**
      * Change the end of line sequence. This is the preferred way of
      * changing the eol sequence. This will land on the undo stack.
      */
    def pushEOL(eol: EndOfLineSequence): Unit = js.native
    /**
      * Push edit operations, basically editing the model. This is the preferred way
      * of editing the model. The edit operations will land on the undo stack.
      * @param beforeCursorState The cursor state before the edit operations. This cursor state will be returned when `undo` or `redo` are invoked.
      * @param editOperations The edit operations.
      * @param cursorStateComputer A callback that can compute the resulting cursors state after the edit operations have been executed.
      * @return The cursor state returned by the `cursorStateComputer`.
      */
    def pushEditOperations(
      beforeCursorState: js.Array[Selection],
      editOperations: js.Array[IIdentifiedSingleEditOperation],
      cursorStateComputer: ICursorStateComputer
    ): js.Array[Selection] | Null = js.native
    /**
      * Push a stack element onto the undo stack. This acts as an undo/redo point.
      * The idea is to use `pushEditOperations` to edit the model and then to
      * `pushStackElement` to create an undo/redo stop point.
      */
    def pushStackElement(): Unit = js.native
    /**
      * Change the end of line sequence without recording in the undo stack.
      * This can have dire consequences on the undo stack! See @pushEOL for the preferred way.
      */
    def setEOL(eol: EndOfLineSequence): Unit = js.native
    /**
      * Replace the entire text buffer value contained in this model.
      */
    def setValue(newValue: String): Unit = js.native
    /**
      * Change the options of this model.
      */
    def updateOptions(newOpts: ITextModelUpdateOptions): Unit = js.native
    /**
      * Create a valid position,
      */
    def validatePosition(position: IPosition): Position = js.native
    /**
      * Create a valid range.
      */
    def validateRange(range: IRange): Range = js.native
  }
  
  trait ITextModelUpdateOptions extends js.Object {
    var indentSize: js.UndefOr[Double] = js.undefined
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    var tabSize: js.UndefOr[Double] = js.undefined
    var trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ITokenThemeRule extends js.Object {
    var background: js.UndefOr[String] = js.undefined
    var fontStyle: js.UndefOr[String] = js.undefined
    var foreground: js.UndefOr[String] = js.undefined
    var token: String
  }
  
  trait IViewState extends js.Object {
    var firstPosition: IPosition
    var firstPositionDeltaTop: Double
    var scrollLeft: Double
    /** written by previous versions */
    var scrollTop: js.UndefOr[Double] = js.undefined
    /** written by previous versions */
    var scrollTopWithoutViewZones: js.UndefOr[Double] = js.undefined
  }
  
  trait IViewZone extends js.Object {
    /**
      * The column after which this zone should appear.
      * If not set, the maxLineColumn of `afterLineNumber` will be used.
      */
    var afterColumn: js.UndefOr[Double] = js.undefined
    /**
      * The line number after which this zone should appear.
      * Use 0 to place a view zone before the first line number.
      */
    var afterLineNumber: Double
    /**
      * The dom node of the view zone
      */
    var domNode: HTMLElement
    /**
      * The height in lines of the view zone.
      * If specified, `heightInPx` will be used instead of this.
      * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
      */
    var heightInLines: js.UndefOr[Double] = js.undefined
    /**
      * The height in px of the view zone.
      * If this is set, the editor will give preference to it rather than `heightInLines` above.
      * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
      */
    var heightInPx: js.UndefOr[Double] = js.undefined
    /**
      * An optional dom node for the view zone that will be placed in the margin area.
      */
    var marginDomNode: js.UndefOr[HTMLElement | Null] = js.undefined
    /**
      * The minimum width in px of the view zone.
      * If this is set, the editor will ensure that the scroll width is >= than this value.
      */
    var minWidthInPx: js.UndefOr[Double] = js.undefined
    /**
      * Callback which gives the height in pixels of the view zone.
      */
    var onComputedHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
    /**
      * Callback which gives the relative top of the view zone as it appears (taking scrolling into account).
      */
    var onDomNodeTop: js.UndefOr[js.Function1[/* top */ Double, Unit]] = js.undefined
    /**
      * Suppress mouse down events.
      * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
      * Defaults to false
      */
    var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IViewZoneChangeAccessor extends js.Object {
    /**
      * Create a new view zone.
      * @param zone Zone to create
      * @return A unique identifier to the view zone.
      */
    def addZone(zone: IViewZone): Double
    /**
      * Change a zone's position.
      * The editor will rescan the `afterLineNumber` and `afterColumn` properties of a view zone.
      */
    def layoutZone(id: Double): Unit
    /**
      * Remove a zone
      * @param id A unique identifier to the view zone, as returned by the `addZone` call.
      */
    def removeZone(id: Double): Unit
  }
  
  trait IWebWorkerOptions extends js.Object {
    /**
      * The data to send over when calling create on the module.
      */
    var createData: js.UndefOr[js.Any] = js.undefined
    /**
      * A label to be used to identify the web worker for debugging purposes.
      */
    var label: js.UndefOr[String] = js.undefined
    /**
      * The AMD moduleId to load.
      * It should export a function `create` that should return the exported proxy.
      */
    var moduleId: String
  }
  
  trait IWordAtPosition extends js.Object {
    /**
      * The column where the word ends.
      */
    val endColumn: Double
    /**
      * The column where the word starts.
      */
    val startColumn: Double
    /**
      * The word.
      */
    val word: String
  }
  
  trait InternalEditorFindOptions extends js.Object {
    val addExtraSpaceOnTop: Boolean
    val autoFindInSelection: Boolean
    val seedSearchStringFromSelection: Boolean
  }
  
  trait InternalEditorHoverOptions extends js.Object {
    val delay: Double
    val enabled: Boolean
    val sticky: Boolean
  }
  
  trait InternalEditorMinimapOptions extends js.Object {
    val enabled: Boolean
    val maxColumn: Double
    val renderCharacters: Boolean
    val showSlider: always | mouseover
    val side: right | left
  }
  
  @js.native
  class InternalEditorOptions () extends js.Object {
    val _internalEditorOptionsBrand: Unit = js.native
    val autoClosingBrackets: EditorAutoClosingStrategy = js.native
    val autoClosingQuotes: EditorAutoClosingStrategy = js.native
    val autoIndent: Boolean = js.native
    val autoSurround: EditorAutoSurroundStrategy = js.native
    val canUseLayerHinting: Boolean = js.native
    val contribInfo: EditorContribOptions = js.native
    val copyWithSyntaxHighlighting: Boolean = js.native
    val dragAndDrop: Boolean = js.native
    val editorClassName: String = js.native
    val emptySelectionClipboard: Boolean = js.native
    val fontInfo: FontInfo = js.native
    val layoutInfo: EditorLayoutInfo = js.native
    val lineHeight: Double = js.native
    val multiCursorMergeOverlapping: Boolean = js.native
    val multiCursorModifier: altKey | ctrlKey | metaKey = js.native
    val pixelRatio: Double = js.native
    val readOnly: Boolean = js.native
    val showUnused: Boolean = js.native
    val tabFocusMode: Boolean = js.native
    val useTabStops: Boolean = js.native
    val viewInfo: InternalEditorViewOptions = js.native
    val wordSeparators: String = js.native
    val wrappingInfo: EditorWrappingInfo = js.native
  }
  
  trait InternalEditorScrollbarOptions extends js.Object {
    val arrowSize: Double
    val fastScrollSensitivity: Double
    val handleMouseWheel: Boolean
    val horizontal: ScrollbarVisibility
    val horizontalHasArrows: Boolean
    val horizontalScrollbarSize: Double
    val horizontalSliderSize: Double
    val mouseWheelScrollSensitivity: Double
    val useShadows: Boolean
    val vertical: ScrollbarVisibility
    val verticalHasArrows: Boolean
    val verticalScrollbarSize: Double
    val verticalSliderSize: Double
  }
  
  trait InternalEditorViewOptions extends js.Object {
    val ariaLabel: String
    val cursorBlinking: TextEditorCursorBlinkingStyle
    val cursorSmoothCaretAnimation: Boolean
    val cursorStyle: TextEditorCursorStyle
    val cursorWidth: Double
    val disableMonospaceOptimizations: Boolean
    val extraEditorClassName: String
    val fixedOverflowWidgets: Boolean
    val fontLigatures: Boolean
    val glyphMargin: Boolean
    val hideCursorInOverviewRuler: Boolean
    val highlightActiveIndentGuide: Boolean
    val minimap: InternalEditorMinimapOptions
    val mouseWheelZoom: Boolean
    val overviewRulerBorder: Boolean
    val overviewRulerLanes: Double
    val renderControlCharacters: Boolean
    val renderCustomLineNumbers: (js.Function1[/* lineNumber */ Double, String]) | Null
    val renderFinalNewline: Boolean
    val renderIndentGuides: Boolean
    val renderLineHighlight: none | gutter | line | all
    val renderLineNumbers: RenderLineNumbersType
    val renderWhitespace: none | boundary | all
    val revealHorizontalRightPadding: Double
    val roundedSelection: Boolean
    val rulers: js.Array[Double]
    val scrollBeyondLastColumn: Double
    val scrollBeyondLastLine: Boolean
    val scrollbar: InternalEditorScrollbarOptions
    val selectOnLineNumbers: Boolean
    val smoothScrolling: Boolean
    val stopRenderingLineAfter: Double
  }
  
  trait InternalGoToLocationOptions extends js.Object {
    val multiple: peek | gotoAndPeek | goto
  }
  
  trait InternalParameterHintOptions extends js.Object {
    val cycle: Boolean
    val enabled: Boolean
  }
  
  trait InternalSuggestOptions extends js.Object {
    val filterGraceful: Boolean
    val filteredTypes: Record[String, Boolean]
    val localityBonus: Boolean
    val maxVisibleSuggestions: Double
    val shareSuggestSelections: Boolean
    val showIcons: Boolean
    val snippets: top | bottom | `inline` | none
    val snippetsPreventQuickSuggestions: Boolean
  }
  
  trait MonacoWebWorker[T] extends js.Object {
    /**
      * Terminate the web worker, thus invalidating the returned proxy.
      */
    def dispose(): Unit
    /**
      * Get a proxy to the arbitrary loaded code.
      */
    def getProxy(): js.Promise[T]
    /**
      * Synchronize (send) the models at `resources` to the web worker,
      * making them available in the monaco.worker.getMirrorModels().
      */
    def withSyncedResources(resources: js.Array[Uri]): js.Promise[T]
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
    val height: Double
    /**
      * Right position for the overview ruler
      */
    val right: Double
    /**
      * Top position for the overview ruler
      */
    val top: Double
    /**
      * Width of the overview ruler
      */
    val width: Double
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
    var _textModelResolvedOptionsBrand: Unit = js.native
    val defaultEOL: DefaultEndOfLine = js.native
    val indentSize: Double = js.native
    val insertSpaces: Boolean = js.native
    val tabSize: Double = js.native
    val trimAutoWhitespace: Boolean = js.native
  }
  
  trait ThemeColor extends js.Object {
    var id: String
  }
  
  @js.native
  sealed trait TrackedRangeStickiness extends js.Object
  
  @js.native
  sealed trait WrappingIndent extends js.Object
  
  def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
  def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
  def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
  def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def createDiffEditor(
    domElement: HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
  def createModel(value: String): ITextModel = js.native
  def createModel(value: String, language: String): ITextModel = js.native
  def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
  def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
  def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
  def getModel(uri: Uri): ITextModel | Null = js.native
  def getModelMarkers(filter: Anon_Owner): js.Array[IMarker] = js.native
  def getModels(): js.Array[ITextModel] = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ Anon_Model, Unit]): IDisposable = js.native
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def remeasureFonts(): Unit = js.native
  def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
  def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
  def setTheme(themeName: String): Unit = js.native
  def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
  @js.native
  object ContentWidgetPositionPreference extends js.Object {
    /**
      * Place the content widget above a position
      */
    @js.native
    sealed trait ABOVE extends ContentWidgetPositionPreference
    
    /**
      * Place the content widget below a position
      */
    @js.native
    sealed trait BELOW extends ContentWidgetPositionPreference
    
    /**
      * Place the content widget exactly at a position
      */
    @js.native
    sealed trait EXACT extends ContentWidgetPositionPreference
    
    /* 1 */ val ABOVE: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference.ABOVE with Double = js.native
    /* 2 */ val BELOW: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference.BELOW with Double = js.native
    /* 0 */ val EXACT: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ContentWidgetPositionPreference.EXACT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentWidgetPositionPreference with Double] = js.native
  }
  
  @js.native
  object CursorChangeReason extends js.Object {
    /**
      * A `model.setValue()` was called.
      */
    @js.native
    sealed trait ContentFlush extends CursorChangeReason
    
    /**
      * There was an explicit user gesture.
      */
    @js.native
    sealed trait Explicit extends CursorChangeReason
    
    /**
      * Unknown or not set.
      */
    @js.native
    sealed trait NotSet extends CursorChangeReason
    
    /**
      * There was a Paste.
      */
    @js.native
    sealed trait Paste extends CursorChangeReason
    
    /**
      * The `model` has been changed outside of this cursor and the cursor recovers its position from associated markers.
      */
    @js.native
    sealed trait RecoverFromMarkers extends CursorChangeReason
    
    /**
      * There was a Redo.
      */
    @js.native
    sealed trait Redo extends CursorChangeReason
    
    /**
      * There was an Undo.
      */
    @js.native
    sealed trait Undo extends CursorChangeReason
    
    /* 1 */ val ContentFlush: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.ContentFlush with Double = js.native
    /* 3 */ val Explicit: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.Explicit with Double = js.native
    /* 0 */ val NotSet: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.NotSet with Double = js.native
    /* 4 */ val Paste: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.Paste with Double = js.native
    /* 2 */ val RecoverFromMarkers: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.RecoverFromMarkers with Double = js.native
    /* 6 */ val Redo: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.Redo with Double = js.native
    /* 5 */ val Undo: typings.monacoDashEditor.monacoDashEditorMod.editorNs.CursorChangeReason.Undo with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CursorChangeReason with Double] = js.native
  }
  
  @js.native
  object DefaultEndOfLine extends js.Object {
    /**
      * Use carriage return and line feed (\r\n) as the end of line character.
      */
    @js.native
    sealed trait CRLF extends DefaultEndOfLine
    
    /**
      * Use line feed (\n) as the end of line character.
      */
    @js.native
    sealed trait LF extends DefaultEndOfLine
    
    /* 2 */ val CRLF: typings.monacoDashEditor.monacoDashEditorMod.editorNs.DefaultEndOfLine.CRLF with Double = js.native
    /* 1 */ val LF: typings.monacoDashEditor.monacoDashEditorMod.editorNs.DefaultEndOfLine.LF with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DefaultEndOfLine with Double] = js.native
  }
  
  @js.native
  object EditorType extends js.Object {
    var ICodeEditor: String = js.native
    var IDiffEditor: String = js.native
  }
  
  @js.native
  object EndOfLinePreference extends js.Object {
    /**
      * Use carriage return and line feed (\r\n) as the end of line character.
      */
    @js.native
    sealed trait CRLF extends EndOfLinePreference
    
    /**
      * Use line feed (\n) as the end of line character.
      */
    @js.native
    sealed trait LF extends EndOfLinePreference
    
    /**
      * Use the end of line character identified in the text buffer.
      */
    @js.native
    sealed trait TextDefined extends EndOfLinePreference
    
    /* 2 */ val CRLF: typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLinePreference.CRLF with Double = js.native
    /* 1 */ val LF: typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLinePreference.LF with Double = js.native
    /* 0 */ val TextDefined: typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLinePreference.TextDefined with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EndOfLinePreference with Double] = js.native
  }
  
  @js.native
  object EndOfLineSequence extends js.Object {
    /**
      * Use carriage return and line feed (\r\n) as the end of line character.
      */
    @js.native
    sealed trait CRLF extends EndOfLineSequence
    
    /**
      * Use line feed (\n) as the end of line character.
      */
    @js.native
    sealed trait LF extends EndOfLineSequence
    
    /* 1 */ val CRLF: typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLineSequence.CRLF with Double = js.native
    /* 0 */ val LF: typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLineSequence.LF with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EndOfLineSequence with Double] = js.native
  }
  
  @js.native
  object MouseTargetType extends js.Object {
    /**
      * Mouse is on top of empty space in the content (e.g. after line text or below last line)
      */
    @js.native
    sealed trait CONTENT_EMPTY extends MouseTargetType
    
    /**
      * Mouse is on top of text in the content.
      */
    @js.native
    sealed trait CONTENT_TEXT extends MouseTargetType
    
    /**
      * Mouse is on top of a view zone in the content.
      */
    @js.native
    sealed trait CONTENT_VIEW_ZONE extends MouseTargetType
    
    /**
      * Mouse is on top of a content widget.
      */
    @js.native
    sealed trait CONTENT_WIDGET extends MouseTargetType
    
    /**
      * Mouse is on top of the glyph margin
      */
    @js.native
    sealed trait GUTTER_GLYPH_MARGIN extends MouseTargetType
    
    /**
      * Mouse is on top of the line decorations
      */
    @js.native
    sealed trait GUTTER_LINE_DECORATIONS extends MouseTargetType
    
    /**
      * Mouse is on top of the line numbers
      */
    @js.native
    sealed trait GUTTER_LINE_NUMBERS extends MouseTargetType
    
    /**
      * Mouse is on top of the whitespace left in the gutter by a view zone.
      */
    @js.native
    sealed trait GUTTER_VIEW_ZONE extends MouseTargetType
    
    /**
      * Mouse is outside of the editor.
      */
    @js.native
    sealed trait OUTSIDE_EDITOR extends MouseTargetType
    
    /**
      * Mouse is on top of an overlay widget.
      */
    @js.native
    sealed trait OVERLAY_WIDGET extends MouseTargetType
    
    /**
      * Mouse is on top of the decorations overview ruler.
      */
    @js.native
    sealed trait OVERVIEW_RULER extends MouseTargetType
    
    /**
      * Mouse is on top of a scrollbar.
      */
    @js.native
    sealed trait SCROLLBAR extends MouseTargetType
    
    /**
      * Mouse is on top of the textarea used for input.
      */
    @js.native
    sealed trait TEXTAREA extends MouseTargetType
    
    /**
      * Mouse is on top of an unknown element.
      */
    @js.native
    sealed trait UNKNOWN extends MouseTargetType
    
    /* 7 */ val CONTENT_EMPTY: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.CONTENT_EMPTY with Double = js.native
    /* 6 */ val CONTENT_TEXT: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.CONTENT_TEXT with Double = js.native
    /* 8 */ val CONTENT_VIEW_ZONE: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.CONTENT_VIEW_ZONE with Double = js.native
    /* 9 */ val CONTENT_WIDGET: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.CONTENT_WIDGET with Double = js.native
    /* 2 */ val GUTTER_GLYPH_MARGIN: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.GUTTER_GLYPH_MARGIN with Double = js.native
    /* 4 */ val GUTTER_LINE_DECORATIONS: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.GUTTER_LINE_DECORATIONS with Double = js.native
    /* 3 */ val GUTTER_LINE_NUMBERS: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.GUTTER_LINE_NUMBERS with Double = js.native
    /* 5 */ val GUTTER_VIEW_ZONE: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.GUTTER_VIEW_ZONE with Double = js.native
    /* 13 */ val OUTSIDE_EDITOR: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.OUTSIDE_EDITOR with Double = js.native
    /* 12 */ val OVERLAY_WIDGET: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.OVERLAY_WIDGET with Double = js.native
    /* 10 */ val OVERVIEW_RULER: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.OVERVIEW_RULER with Double = js.native
    /* 11 */ val SCROLLBAR: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.SCROLLBAR with Double = js.native
    /* 1 */ val TEXTAREA: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.TEXTAREA with Double = js.native
    /* 0 */ val UNKNOWN: typings.monacoDashEditor.monacoDashEditorMod.editorNs.MouseTargetType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MouseTargetType with Double] = js.native
  }
  
  @js.native
  object OverlayWidgetPositionPreference extends js.Object {
    /**
      * Position the overlay widget in the bottom right corner
      */
    @js.native
    sealed trait BOTTOM_RIGHT_CORNER extends OverlayWidgetPositionPreference
    
    /**
      * Position the overlay widget in the top center
      */
    @js.native
    sealed trait TOP_CENTER extends OverlayWidgetPositionPreference
    
    /**
      * Position the overlay widget in the top right corner
      */
    @js.native
    sealed trait TOP_RIGHT_CORNER extends OverlayWidgetPositionPreference
    
    /* 1 */ val BOTTOM_RIGHT_CORNER: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference.BOTTOM_RIGHT_CORNER with Double = js.native
    /* 2 */ val TOP_CENTER: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference.TOP_CENTER with Double = js.native
    /* 0 */ val TOP_RIGHT_CORNER: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverlayWidgetPositionPreference.TOP_RIGHT_CORNER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OverlayWidgetPositionPreference with Double] = js.native
  }
  
  @js.native
  object OverviewRulerLane extends js.Object {
    @js.native
    sealed trait Center extends OverviewRulerLane
    
    @js.native
    sealed trait Full extends OverviewRulerLane
    
    @js.native
    sealed trait Left extends OverviewRulerLane
    
    @js.native
    sealed trait Right extends OverviewRulerLane
    
    /* 2 */ val Center: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverviewRulerLane.Center with Double = js.native
    /* 7 */ val Full: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverviewRulerLane.Full with Double = js.native
    /* 1 */ val Left: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverviewRulerLane.Left with Double = js.native
    /* 4 */ val Right: typings.monacoDashEditor.monacoDashEditorMod.editorNs.OverviewRulerLane.Right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OverviewRulerLane with Double] = js.native
  }
  
  @js.native
  object RenderLineNumbersType extends js.Object {
    @js.native
    sealed trait Custom extends RenderLineNumbersType
    
    @js.native
    sealed trait Interval extends RenderLineNumbersType
    
    @js.native
    sealed trait Off extends RenderLineNumbersType
    
    @js.native
    sealed trait On extends RenderLineNumbersType
    
    @js.native
    sealed trait Relative extends RenderLineNumbersType
    
    /* 4 */ val Custom: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderLineNumbersType.Custom with Double = js.native
    /* 3 */ val Interval: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderLineNumbersType.Interval with Double = js.native
    /* 0 */ val Off: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderLineNumbersType.Off with Double = js.native
    /* 1 */ val On: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderLineNumbersType.On with Double = js.native
    /* 2 */ val Relative: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderLineNumbersType.Relative with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RenderLineNumbersType with Double] = js.native
  }
  
  @js.native
  object RenderMinimap extends js.Object {
    @js.native
    sealed trait Large extends RenderMinimap
    
    @js.native
    sealed trait LargeBlocks extends RenderMinimap
    
    @js.native
    sealed trait None extends RenderMinimap
    
    @js.native
    sealed trait Small extends RenderMinimap
    
    @js.native
    sealed trait SmallBlocks extends RenderMinimap
    
    /* 2 */ val Large: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderMinimap.Large with Double = js.native
    /* 4 */ val LargeBlocks: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderMinimap.LargeBlocks with Double = js.native
    /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderMinimap.None with Double = js.native
    /* 1 */ val Small: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderMinimap.Small with Double = js.native
    /* 3 */ val SmallBlocks: typings.monacoDashEditor.monacoDashEditorMod.editorNs.RenderMinimap.SmallBlocks with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RenderMinimap with Double] = js.native
  }
  
  @js.native
  object ScrollType extends js.Object {
    @js.native
    sealed trait Immediate extends ScrollType
    
    @js.native
    sealed trait Smooth extends ScrollType
    
    /* 1 */ val Immediate: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollType.Immediate with Double = js.native
    /* 0 */ val Smooth: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollType.Smooth with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ScrollType with Double] = js.native
  }
  
  @js.native
  object ScrollbarVisibility extends js.Object {
    @js.native
    sealed trait Auto extends ScrollbarVisibility
    
    @js.native
    sealed trait Hidden extends ScrollbarVisibility
    
    @js.native
    sealed trait Visible extends ScrollbarVisibility
    
    /* 1 */ val Auto: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollbarVisibility.Auto with Double = js.native
    /* 2 */ val Hidden: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollbarVisibility.Hidden with Double = js.native
    /* 3 */ val Visible: typings.monacoDashEditor.monacoDashEditorMod.editorNs.ScrollbarVisibility.Visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ScrollbarVisibility with Double] = js.native
  }
  
  @js.native
  object TextEditorCursorBlinkingStyle extends js.Object {
    /**
      * Blinking
      */
    @js.native
    sealed trait Blink extends TextEditorCursorBlinkingStyle
    
    /**
      * Expand collapse animation on the y axis
      */
    @js.native
    sealed trait Expand extends TextEditorCursorBlinkingStyle
    
    /**
      * Hidden
      */
    @js.native
    sealed trait Hidden extends TextEditorCursorBlinkingStyle
    
    /**
      * Blinking with prolonged filled state and smooth fading
      */
    @js.native
    sealed trait Phase extends TextEditorCursorBlinkingStyle
    
    /**
      * Blinking with smooth fading
      */
    @js.native
    sealed trait Smooth extends TextEditorCursorBlinkingStyle
    
    /**
      * No-Blinking
      */
    @js.native
    sealed trait Solid extends TextEditorCursorBlinkingStyle
    
    /* 1 */ val Blink: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle.Blink with Double = js.native
    /* 4 */ val Expand: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle.Expand with Double = js.native
    /* 0 */ val Hidden: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle.Hidden with Double = js.native
    /* 3 */ val Phase: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle.Phase with Double = js.native
    /* 2 */ val Smooth: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle.Smooth with Double = js.native
    /* 5 */ val Solid: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorBlinkingStyle.Solid with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TextEditorCursorBlinkingStyle with Double] = js.native
  }
  
  @js.native
  object TextEditorCursorStyle extends js.Object {
    /**
      * As a block (sitting on top of a character).
      */
    @js.native
    sealed trait Block extends TextEditorCursorStyle
    
    /**
      * As an outlined block (sitting on top of a character).
      */
    @js.native
    sealed trait BlockOutline extends TextEditorCursorStyle
    
    /**
      * As a vertical line (sitting between two characters).
      */
    @js.native
    sealed trait Line extends TextEditorCursorStyle
    
    /**
      * As a thin vertical line (sitting between two characters).
      */
    @js.native
    sealed trait LineThin extends TextEditorCursorStyle
    
    /**
      * As a horizontal line (sitting under a character).
      */
    @js.native
    sealed trait Underline extends TextEditorCursorStyle
    
    /**
      * As a thin horizontal line (sitting under a character).
      */
    @js.native
    sealed trait UnderlineThin extends TextEditorCursorStyle
    
    /* 2 */ val Block: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle.Block with Double = js.native
    /* 5 */ val BlockOutline: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle.BlockOutline with Double = js.native
    /* 1 */ val Line: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle.Line with Double = js.native
    /* 4 */ val LineThin: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle.LineThin with Double = js.native
    /* 3 */ val Underline: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle.Underline with Double = js.native
    /* 6 */ val UnderlineThin: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TextEditorCursorStyle.UnderlineThin with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
  }
  
  @js.native
  object TrackedRangeStickiness extends js.Object {
    @js.native
    sealed trait AlwaysGrowsWhenTypingAtEdges extends TrackedRangeStickiness
    
    @js.native
    sealed trait GrowsOnlyWhenTypingAfter extends TrackedRangeStickiness
    
    @js.native
    sealed trait GrowsOnlyWhenTypingBefore extends TrackedRangeStickiness
    
    @js.native
    sealed trait NeverGrowsWhenTypingAtEdges extends TrackedRangeStickiness
    
    /* 0 */ val AlwaysGrowsWhenTypingAtEdges: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges with Double = js.native
    /* 3 */ val GrowsOnlyWhenTypingAfter: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TrackedRangeStickiness.GrowsOnlyWhenTypingAfter with Double = js.native
    /* 2 */ val GrowsOnlyWhenTypingBefore: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TrackedRangeStickiness.GrowsOnlyWhenTypingBefore with Double = js.native
    /* 1 */ val NeverGrowsWhenTypingAtEdges: typings.monacoDashEditor.monacoDashEditorMod.editorNs.TrackedRangeStickiness.NeverGrowsWhenTypingAtEdges with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TrackedRangeStickiness with Double] = js.native
  }
  
  @js.native
  object WrappingIndent extends js.Object {
    /**
      * DeepIndent => wrapped lines get +2 indentation toward the parent.
      */
    @js.native
    sealed trait DeepIndent extends WrappingIndent
    
    /**
      * Indent => wrapped lines get +1 indentation toward the parent.
      */
    @js.native
    sealed trait Indent extends WrappingIndent
    
    /**
      * No indentation => wrapped lines begin at column 1.
      */
    @js.native
    sealed trait None extends WrappingIndent
    
    /**
      * Same => wrapped lines get the same indentation as the parent.
      */
    @js.native
    sealed trait Same extends WrappingIndent
    
    /* 3 */ val DeepIndent: typings.monacoDashEditor.monacoDashEditorMod.editorNs.WrappingIndent.DeepIndent with Double = js.native
    /* 2 */ val Indent: typings.monacoDashEditor.monacoDashEditorMod.editorNs.WrappingIndent.Indent with Double = js.native
    /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.editorNs.WrappingIndent.None with Double = js.native
    /* 1 */ val Same: typings.monacoDashEditor.monacoDashEditorMod.editorNs.WrappingIndent.Same with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WrappingIndent with Double] = js.native
  }
  
  type ICodeActionsOnSaveOptions = StringDictionary[Boolean]
  type IColors = StringDictionary[String]
  type ICommandHandler = js.Function1[/* repeated */ js.Any, Unit]
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[IIdentifiedSingleEditOperation], 
    js.Array[Selection] | Null
  ]
  type IEditorOverrideServices = StringDictionary[js.Any]
  type IModel = ITextModel
  type IReadOnlyModel = ITextModel
}

