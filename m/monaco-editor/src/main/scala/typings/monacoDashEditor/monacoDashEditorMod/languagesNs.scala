package typings.monacoDashEditor.monacoDashEditorMod

import org.scalablytyped.runtime.StringDictionary
import typings.monacoDashEditor.Anon_ArgumentsInColorFunction
import typings.monacoDashEditor.Anon_FileMatch
import typings.monacoDashEditor.Anon_IgnoreIfExists
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.EndOfLineSequence
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.IMarkerData
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ISingleEditOperation
import typings.monacoDashEditor.monacoDashEditorMod.editorNs.ITextModel
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CharacterPair
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CodeAction
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CodeActionContext
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CodeActionProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CodeLensProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.Command
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CommentRule
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionContext
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItem
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemInsertTextRule
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionList
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionTriggerKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.Definition
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DefinitionProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentColorProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentFormattingEditProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentHighlight
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentHighlightKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentHighlightProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentRangeFormattingEditProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentSymbol
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentSymbolProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.EncodedTokensProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.EnterAction
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FoldingContext
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FoldingMarkers
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FoldingRange
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FoldingRangeKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FoldingRangeProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FoldingRules
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.FormattingOptions
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.Hover
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.HoverProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IAutoClosingPair
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IAutoClosingPairConditional
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IBracketElectricCharacterContribution
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ICodeLensSymbol
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IColor
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IColorInformation
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IColorPresentation
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IDocComment
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IEncodedLineTokens
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IExpandedMonarchLanguageAction
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IExpandedMonarchLanguageRule
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ILanguageExtensionPoint
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ILineTokens
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ILink
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ILinksList
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IMonarchLanguage
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IMonarchLanguageAction
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IMonarchLanguageBracket
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IMonarchLanguageRule
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IShortMonarchLanguageAction
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IShortMonarchLanguageRule1
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IShortMonarchLanguageRule2
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IState
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IToken
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ImplementationProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IndentAction
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IndentationRule
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.LanguageConfiguration
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.LinkProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.Location
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.LocationLink
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.OnEnterRule
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.OnTypeFormattingEditProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ParameterInformation
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ProviderResult
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ReferenceContext
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ReferenceProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.Rejection
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.RenameLocation
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.RenameProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ResourceFileEdit
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.ResourceTextEdit
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SelectionRange
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelp
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelpContext
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelpProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelpTriggerKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureInformation
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.TextEdit
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.TokensProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.TypeDefinitionProvider
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.WorkspaceEdit
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.cssNs.DiagnosticsOptions
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.cssNs.LanguageServiceDefaults
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.CompletionConfiguration
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.HTMLFormatConfiguration
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.Options
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.CompilerOptions
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.CompilerOptionsValue
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.MapLike
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleResolutionKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.NewLineKind
import typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
import typings.monacoDashEditor.monacoDashEditorStrings.`force-aligned`
import typings.monacoDashEditor.monacoDashEditorStrings.`force-expand-multiline`
import typings.monacoDashEditor.monacoDashEditorStrings.auto
import typings.monacoDashEditor.monacoDashEditorStrings.force
import typings.std.RegExp
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages")
@js.native
object languagesNs extends js.Object {
  trait CodeAction extends js.Object {
    var command: js.UndefOr[Command] = js.undefined
    var diagnostics: js.UndefOr[js.Array[IMarkerData]] = js.undefined
    var edit: js.UndefOr[WorkspaceEdit] = js.undefined
    var isPreferred: js.UndefOr[Boolean] = js.undefined
    var kind: js.UndefOr[String] = js.undefined
    var title: String
  }
  
  trait CodeActionContext extends js.Object {
    /**
      * An array of diagnostics.
      */
    val markers: js.Array[IMarkerData]
    /**
      * Requested kind of actions to return.
      */
    val only: js.UndefOr[String] = js.undefined
  }
  
  trait CodeActionProvider extends js.Object {
    /**
      * Provide commands for the given document and range.
      */
    def provideCodeActions(model: ITextModel, range: Range, context: CodeActionContext, token: CancellationToken): (js.Array[Command | CodeAction]) | (js.Promise[js.Array[Command | CodeAction]])
  }
  
  trait CodeLensProvider extends js.Object {
    var onDidChange: js.UndefOr[IEvent[this.type]] = js.undefined
    var resolveCodeLens: js.UndefOr[
        js.Function3[
          /* model */ ITextModel, 
          /* codeLens */ ICodeLensSymbol, 
          /* token */ CancellationToken, 
          ProviderResult[ICodeLensSymbol]
        ]
      ] = js.undefined
    def provideCodeLenses(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[ICodeLensSymbol]]
  }
  
  trait Command extends js.Object {
    var arguments: js.UndefOr[js.Array[_]] = js.undefined
    var id: String
    var title: String
    var tooltip: js.UndefOr[String] = js.undefined
  }
  
  trait CommentRule extends js.Object {
    /**
      * The block comment character pair, like `/ * block comment *&#47;`
      */
    var blockComment: js.UndefOr[CharacterPair | Null] = js.undefined
    /**
      * The line comment token, like `// this is a comment`
      */
    var lineComment: js.UndefOr[String | Null] = js.undefined
  }
  
  trait CompletionContext extends js.Object {
    /**
      * Character that triggered the completion item provider.
      *
      * `undefined` if provider was not triggered by a character.
      */
    var triggerCharacter: js.UndefOr[String] = js.undefined
    /**
      * How the completion was triggered.
      */
    var triggerKind: CompletionTriggerKind
  }
  
  trait CompletionItem extends js.Object {
    /**
      * An optional array of additional text edits that are applied when
      * selecting this completion. Edits must not overlap with the main edit
      * nor with themselves.
      */
    var additionalTextEdits: js.UndefOr[js.Array[ISingleEditOperation]] = js.undefined
    /**
      * A command that should be run upon acceptance of this item.
      */
    var command: js.UndefOr[Command] = js.undefined
    /**
      * An optional set of characters that when pressed while this completion is active will accept it first and
      * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
      * characters will be ignored.
      */
    var commitCharacters: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * A human-readable string with additional information
      * about this item, like type or symbol information.
      */
    var detail: js.UndefOr[String] = js.undefined
    /**
      * A human-readable string that represents a doc-comment.
      */
    var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
    /**
      * A string that should be used when filtering a set of
      * completion items. When `falsy` the [label](#CompletionItem.label)
      * is used.
      */
    var filterText: js.UndefOr[String] = js.undefined
    /**
      * A string or snippet that should be inserted in a document when selecting
      * this completion.
      * is used.
      */
    var insertText: String
    /**
      * Addition rules (as bitmask) that should be applied when inserting
      * this completion.
      */
    var insertTextRules: js.UndefOr[CompletionItemInsertTextRule] = js.undefined
    /**
      * The kind of this completion item. Based on the kind
      * an icon is chosen by the editor.
      */
    var kind: CompletionItemKind
    /**
      * The label of this completion item. By default
      * this is also the text that is inserted when selecting
      * this completion.
      */
    var label: String
    /**
      * Select this item when showing. *Note* that only one completion item can be selected and
      * that the editor decides which item that is. The rule is that the *first* item of those
      * that match best is selected.
      */
    var preselect: js.UndefOr[Boolean] = js.undefined
    /**
      * A range of text that should be replaced by this completion item.
      *
      * Defaults to a range from the start of the [current word](#TextDocument.getWordRangeAtPosition) to the
      * current position.
      *
      * *Note:* The range must be a [single line](#Range.isSingleLine) and it must
      * [contain](#Range.contains) the position at which completion has been [requested](#CompletionItemProvider.provideCompletionItems).
      */
    var range: IRange
    /**
      * A string that should be used when comparing this item
      * with other items. When `falsy` the [label](#CompletionItem.label)
      * is used.
      */
    var sortText: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  sealed trait CompletionItemInsertTextRule extends js.Object
  
  @js.native
  sealed trait CompletionItemKind extends js.Object
  
  trait CompletionItemProvider extends js.Object {
    /**
      * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
      * or [details](#CompletionItem.detail).
      *
      * The editor will only resolve a completion item once.
      */
    var resolveCompletionItem: js.UndefOr[
        js.Function4[
          /* model */ ITextModel, 
          /* position */ Position, 
          /* item */ CompletionItem, 
          /* token */ CancellationToken, 
          ProviderResult[CompletionItem]
        ]
      ] = js.undefined
    var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * Provide completion items for the given position and document.
      */
    def provideCompletionItems(model: ITextModel, position: Position, context: CompletionContext, token: CancellationToken): ProviderResult[CompletionList]
  }
  
  trait CompletionList extends js.Object {
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
    var incomplete: js.UndefOr[Boolean] = js.undefined
    var suggestions: js.Array[CompletionItem]
  }
  
  @js.native
  sealed trait CompletionTriggerKind extends js.Object
  
  trait DeclarationProvider extends js.Object {
    /**
      * Provide the declaration of the symbol at the given position and document.
      */
    def provideDeclaration(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
  }
  
  trait DefinitionProvider extends js.Object {
    /**
      * Provide the definition of the symbol at the given position and document.
      */
    def provideDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
  }
  
  trait DocumentColorProvider extends js.Object {
    /**
      * Provide the string representations for a color.
      */
    def provideColorPresentations(model: ITextModel, colorInfo: IColorInformation, token: CancellationToken): ProviderResult[js.Array[IColorPresentation]]
    /**
      * Provides the color ranges for a specific model.
      */
    def provideDocumentColors(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[IColorInformation]]
  }
  
  trait DocumentFormattingEditProvider extends js.Object {
    val displayName: js.UndefOr[String] = js.undefined
    /**
      * Provide formatting edits for a whole document.
      */
    def provideDocumentFormattingEdits(model: ITextModel, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
  }
  
  trait DocumentHighlight extends js.Object {
    /**
      * The highlight kind, default is [text](#DocumentHighlightKind.Text).
      */
    var kind: js.UndefOr[DocumentHighlightKind] = js.undefined
    /**
      * The range this highlight applies to.
      */
    var range: IRange
  }
  
  @js.native
  sealed trait DocumentHighlightKind extends js.Object
  
  trait DocumentHighlightProvider extends js.Object {
    /**
      * Provide a set of document highlights, like all occurrences of a variable or
      * all exit-points of a function.
      */
    def provideDocumentHighlights(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]]
  }
  
  trait DocumentRangeFormattingEditProvider extends js.Object {
    val displayName: js.UndefOr[String] = js.undefined
    /**
      * Provide formatting edits for a range in a document.
      *
      * The given range is a hint and providers can decide to format a smaller
      * or larger range. Often this is done by adjusting the start and end
      * of the range to full syntax nodes.
      */
    def provideDocumentRangeFormattingEdits(model: ITextModel, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
  }
  
  trait DocumentSymbol extends js.Object {
    var children: js.UndefOr[js.Array[DocumentSymbol]] = js.undefined
    var containerName: js.UndefOr[String] = js.undefined
    var detail: String
    var kind: SymbolKind
    var name: String
    var range: IRange
    var selectionRange: IRange
  }
  
  trait DocumentSymbolProvider extends js.Object {
    var displayName: js.UndefOr[String] = js.undefined
    /**
      * Provide symbol information for the given document.
      */
    def provideDocumentSymbols(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol]]
  }
  
  trait EncodedTokensProvider extends js.Object {
    /**
      * The initial state of a language. Will be the state passed in to tokenize the first line.
      */
    def getInitialState(): IState
    /**
      * Tokenize a line given the state at the beginning of the line.
      */
    def tokenizeEncoded(line: String, state: IState): IEncodedLineTokens
  }
  
  trait EnterAction extends js.Object {
    /**
      * Describes text to be appended after the new line and after the indentation.
      */
    var appendText: js.UndefOr[String] = js.undefined
    /**
      * Describe what to do with the indentation.
      */
    var indentAction: IndentAction
    /**
      * Describes the number of characters to remove from the new line's indentation.
      */
    var removeText: js.UndefOr[Double] = js.undefined
  }
  
  trait FoldingContext extends js.Object
  
  trait FoldingMarkers extends js.Object {
    var end: RegExp
    var start: RegExp
  }
  
  trait FoldingRange extends js.Object {
    /**
      * The one-based end line of the range to fold. The folded area ends with the line's last character.
      */
    var end: Double
    /**
      * Describes the [Kind](#FoldingRangeKind) of the folding range such as [Comment](#FoldingRangeKind.Comment) or
      * [Region](#FoldingRangeKind.Region). The kind is used to categorize folding ranges and used by commands
      * like 'Fold all comments'. See
      * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
      */
    var kind: js.UndefOr[FoldingRangeKind] = js.undefined
    /**
      * The one-based start line of the range to fold. The folded area starts after the line's last character.
      */
    var start: Double
  }
  
  @js.native
  class FoldingRangeKind protected () extends js.Object {
    /**
      * Creates a new [FoldingRangeKind](#FoldingRangeKind).
      *
      * @param value of the kind.
      */
    def this(value: String) = this()
    var value: String = js.native
  }
  
  trait FoldingRangeProvider extends js.Object {
    /**
      * Provides the color ranges for a specific model.
      */
    def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
  }
  
  trait FoldingRules extends js.Object {
    /**
      * Region markers used by the language.
      */
    var markers: js.UndefOr[FoldingMarkers] = js.undefined
    /**
      * Used by the indentation based strategy to decide whether empty lines belong to the previous or the next block.
      * A language adheres to the off-side rule if blocks in that language are expressed by their indentation.
      * See [wikipedia](https://en.wikipedia.org/wiki/Off-side_rule) for more information.
      * If not set, `false` is used and empty lines belong to the previous block.
      */
    var offSide: js.UndefOr[Boolean] = js.undefined
  }
  
  trait FormattingOptions extends js.Object {
    /**
      * Prefer spaces over tabs.
      */
    var insertSpaces: Boolean
    /**
      * Size of a tab in spaces.
      */
    var tabSize: Double
  }
  
  trait Hover extends js.Object {
    /**
      * The contents of this hover.
      */
    var contents: js.Array[IMarkdownString]
    /**
      * The range to which this hover applies. When missing, the
      * editor will use the range at the current position or the
      * current position itself.
      */
    var range: js.UndefOr[IRange] = js.undefined
  }
  
  trait HoverProvider extends js.Object {
    /**
      * Provide a hover for the given position and document. Multiple hovers at the same
      * position will be merged by the editor. A hover can have a range which defaults
      * to the word range at the position when omitted.
      */
    def provideHover(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Hover]
  }
  
  trait IAutoClosingPair extends js.Object {
    var close: String
    var open: String
  }
  
  trait IAutoClosingPairConditional extends IAutoClosingPair {
    var notIn: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait IBracketElectricCharacterContribution extends js.Object {
    var docComment: js.UndefOr[IDocComment] = js.undefined
  }
  
  trait ICodeLensSymbol extends js.Object {
    var command: js.UndefOr[Command] = js.undefined
    var id: js.UndefOr[String] = js.undefined
    var range: IRange
  }
  
  trait IColor extends js.Object {
    /**
      * The alpha component in the range [0-1].
      */
    val alpha: Double
    /**
      * The blue component in the range [0-1].
      */
    val blue: Double
    /**
      * The green component in the range [0-1].
      */
    val green: Double
    /**
      * The red component in the range [0-1].
      */
    val red: Double
  }
  
  trait IColorInformation extends js.Object {
    /**
      * The color represented in this range.
      */
    var color: IColor
    /**
      * The range within the model.
      */
    var range: IRange
  }
  
  trait IColorPresentation extends js.Object {
    /**
      * An optional array of additional [text edits](#TextEdit) that are applied when
      * selecting this color presentation.
      */
    var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
    /**
      * The label of this color presentation. It will be shown on the color
      * picker header. By default this is also the text that is inserted when selecting
      * this color presentation.
      */
    var label: String
    /**
      * An [edit](#TextEdit) which is applied to a document when selecting
      * this presentation for the color.
      */
    var textEdit: js.UndefOr[TextEdit] = js.undefined
  }
  
  trait IDocComment extends js.Object {
    /**
      * The string that appears on the last line and closes the doc comment (e.g. ' * /').
      */
    var close: js.UndefOr[String] = js.undefined
    /**
      * The string that starts a doc comment (e.g. '/ **')
      */
    var open: String
  }
  
  trait IEncodedLineTokens extends js.Object {
    /**
      * The tokenization end state.
      * A pointer will be held to this and the object should not be modified by the tokenizer after the pointer is returned.
      */
    var endState: IState
    /**
      * The tokens on the line in a binary, encoded format. Each token occupies two array indices. For token i:
      *  - at offset 2*i => startIndex
      *  - at offset 2*i + 1 => metadata
      * Meta data is in binary format:
      * - -------------------------------------------
      *     3322 2222 2222 1111 1111 1100 0000 0000
      *     1098 7654 3210 9876 5432 1098 7654 3210
      * - -------------------------------------------
      *     bbbb bbbb bfff ffff ffFF FTTT LLLL LLLL
      * - -------------------------------------------
      *  - L = EncodedLanguageId (8 bits): Use `getEncodedLanguageId` to get the encoded ID of a language.
      *  - T = StandardTokenType (3 bits): Other = 0, Comment = 1, String = 2, RegEx = 4.
      *  - F = FontStyle (3 bits): None = 0, Italic = 1, Bold = 2, Underline = 4.
      *  - f = foreground ColorId (9 bits)
      *  - b = background ColorId (9 bits)
      *  - The color value for each colorId is defined in IStandaloneThemeData.customTokenColors:
      * e.g colorId = 1 is stored in IStandaloneThemeData.customTokenColors[1]. Color id = 0 means no color,
      * id = 1 is for the default foreground color, id = 2 for the default background.
      */
    var tokens: Uint32Array
  }
  
  trait IExpandedMonarchLanguageAction extends js.Object {
    /**
      * @open or @close
      */
    var bracket: js.UndefOr[String] = js.undefined
    /**
      * map from string to ILanguageAction
      */
    var cases: js.UndefOr[js.Object] = js.undefined
    /**
      * go back n characters in the stream
      */
    var goBack: js.UndefOr[Double] = js.undefined
    /**
      * array of actions for each parenthesized match group
      */
    var group: js.UndefOr[js.Array[IMonarchLanguageAction]] = js.undefined
    /**
      * log a message to the browser console window
      */
    var log: js.UndefOr[String] = js.undefined
    /**
      * the next state to push, or "@push", "@pop", "@popall"
      */
    var next: js.UndefOr[String] = js.undefined
    /**
      * switch to embedded language (using the mimetype) or get out using "@pop"
      */
    var nextEmbedded: js.UndefOr[String] = js.undefined
    /**
      * switch to this state
      */
    var switchTo: js.UndefOr[String] = js.undefined
    /**
      * token class (ie. css class) (or "@brackets" or "@rematch")
      */
    var token: js.UndefOr[String] = js.undefined
  }
  
  trait IExpandedMonarchLanguageRule extends js.Object {
    /**
      * action to take on match
      */
    var action: js.UndefOr[IMonarchLanguageAction] = js.undefined
    /**
      * or an include rule. include all rules from the included state
      */
    var include: js.UndefOr[String] = js.undefined
    /**
      * match tokens
      */
    var regex: js.UndefOr[String | RegExp] = js.undefined
  }
  
  trait ILanguageExtensionPoint extends js.Object {
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    var configuration: js.UndefOr[Uri] = js.undefined
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    var filenamePatterns: js.UndefOr[js.Array[String]] = js.undefined
    var filenames: js.UndefOr[js.Array[String]] = js.undefined
    var firstLine: js.UndefOr[String] = js.undefined
    var id: String
    var mimetypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait ILineTokens extends js.Object {
    /**
      * The tokenization end state.
      * A pointer will be held to this and the object should not be modified by the tokenizer after the pointer is returned.
      */
    var endState: IState
    /**
      * The list of tokens on the line.
      */
    var tokens: js.Array[IToken]
  }
  
  trait ILink extends js.Object {
    var range: IRange
    var url: js.UndefOr[Uri | String] = js.undefined
  }
  
  trait ILinksList extends js.Object {
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
    var links: js.Array[ILink]
  }
  
  trait IMonarchLanguage extends js.Object {
    /**
      * for example [['{','}','delimiter.curly']]
      */
    var brackets: js.UndefOr[js.Array[IMonarchLanguageBracket]] = js.undefined
    /**
      * if no match in the tokenizer assign this token class (default 'source')
      */
    var defaultToken: js.UndefOr[String] = js.undefined
    /**
      * is the language case insensitive?
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    /**
      * start symbol in the tokenizer (by default the first entry is used)
      */
    var start: js.UndefOr[String] = js.undefined
    /**
      * attach this to every token class (by default '.' + name)
      */
    var tokenPostfix: js.UndefOr[String] = js.undefined
    /**
      * map from string to ILanguageRule[]
      */
    var tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]]
  }
  
  trait IMonarchLanguageBracket extends js.Object {
    /**
      * closing bracket
      */
    var close: String
    /**
      * open bracket
      */
    var open: String
    /**
      * token class
      */
    var token: String
  }
  
  trait IState extends js.Object {
    def equals(other: IState): Boolean
  }
  
  trait IToken extends js.Object {
    var scopes: String
    var startIndex: Double
  }
  
  trait ImplementationProvider extends js.Object {
    /**
      * Provide the implementation of the symbol at the given position and document.
      */
    def provideImplementation(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
  }
  
  @js.native
  sealed trait IndentAction extends js.Object
  
  trait IndentationRule extends js.Object {
    /**
      * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
      */
    var decreaseIndentPattern: RegExp
    /**
      * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
      */
    var increaseIndentPattern: RegExp
    /**
      * If a line matches this pattern, then **only the next line** after it should be indented once.
      */
    var indentNextLinePattern: js.UndefOr[RegExp | Null] = js.undefined
    /**
      * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
      */
    var unIndentedLinePattern: js.UndefOr[RegExp | Null] = js.undefined
  }
  
  trait LanguageConfiguration extends js.Object {
    /**
      * **Deprecated** Do not use.
      *
      * @deprecated Will be replaced by a better API soon.
      */
    var __electricCharacterSupport: js.UndefOr[IBracketElectricCharacterContribution] = js.undefined
    /**
      * Defines what characters must be after the cursor for bracket or quote autoclosing to occur when using the \'languageDefined\' autoclosing setting.
      *
      * This is typically the set of characters which can not start an expression, such as whitespace, closing brackets, non-unary operators, etc.
      */
    var autoCloseBefore: js.UndefOr[String] = js.undefined
    /**
      * The language's auto closing pairs. The 'close' character is automatically inserted with the
      * 'open' character is typed. If not set, the configured brackets will be used.
      */
    var autoClosingPairs: js.UndefOr[js.Array[IAutoClosingPairConditional]] = js.undefined
    /**
      * The language's brackets.
      * This configuration implicitly affects pressing Enter around these brackets.
      */
    var brackets: js.UndefOr[js.Array[CharacterPair]] = js.undefined
    /**
      * The language's comment settings.
      */
    var comments: js.UndefOr[CommentRule] = js.undefined
    /**
      * The language's folding rules.
      */
    var folding: js.UndefOr[FoldingRules] = js.undefined
    /**
      * The language's indentation settings.
      */
    var indentationRules: js.UndefOr[IndentationRule] = js.undefined
    /**
      * The language's rules to be evaluated when pressing Enter.
      */
    var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.undefined
    /**
      * The language's surrounding pairs. When the 'open' character is typed on a selection, the
      * selected string is surrounded by the open and close characters. If not set, the autoclosing pairs
      * settings will be used.
      */
    var surroundingPairs: js.UndefOr[js.Array[IAutoClosingPair]] = js.undefined
    /**
      * The language's word definition.
      * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
      * to provide a word definition that uses exclusion of known separators.
      * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
      *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
      */
    var wordPattern: js.UndefOr[RegExp] = js.undefined
  }
  
  trait LinkProvider extends js.Object {
    var resolveLink: js.UndefOr[
        js.Function2[/* link */ ILink, /* token */ CancellationToken, ProviderResult[ILink]]
      ] = js.undefined
    def provideLinks(model: ITextModel, token: CancellationToken): ProviderResult[ILinksList]
  }
  
  trait Location extends js.Object {
    /**
      * The document range of this locations.
      */
    var range: IRange
    /**
      * The resource identifier of this location.
      */
    var uri: Uri
  }
  
  trait LocationLink extends js.Object {
    /**
      * A range to select where this link originates from.
      */
    var originSelectionRange: js.UndefOr[IRange] = js.undefined
    /**
      * The full range this link points to.
      */
    var range: IRange
    /**
      * A range to select this link points to. Must be contained
      * in `LocationLink.range`.
      */
    var targetSelectionRange: js.UndefOr[IRange] = js.undefined
    /**
      * The target uri this link points to.
      */
    var uri: Uri
  }
  
  trait OnEnterRule extends js.Object {
    /**
      * The action to execute.
      */
    var action: EnterAction
    /**
      * This rule will only execute if the text after the cursor matches this regular expression.
      */
    var afterText: js.UndefOr[RegExp] = js.undefined
    /**
      * This rule will only execute if the text before the cursor matches this regular expression.
      */
    var beforeText: RegExp
    /**
      * This rule will only execute if the text above the this line matches this regular expression.
      */
    var oneLineAboveText: js.UndefOr[RegExp] = js.undefined
  }
  
  trait OnTypeFormattingEditProvider extends js.Object {
    var autoFormatTriggerCharacters: js.Array[String]
    /**
      * Provide formatting edits after a character has been typed.
      *
      * The given position and character should hint to the provider
      * what range the position to expand to, like find the matching `{`
      * when `}` has been entered.
      */
    def provideOnTypeFormattingEdits(
      model: ITextModel,
      position: Position,
      ch: String,
      options: FormattingOptions,
      token: CancellationToken
    ): ProviderResult[js.Array[TextEdit]]
  }
  
  trait ParameterInformation extends js.Object {
    /**
      * The human-readable doc-comment of this signature. Will be shown
      * in the UI but can be omitted.
      */
    var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
    /**
      * The label of this signature. Will be shown in
      * the UI.
      */
    var label: String | (js.Tuple2[Double, Double])
  }
  
  trait ReferenceContext extends js.Object {
    /**
      * Include the declaration of the current symbol.
      */
    var includeDeclaration: Boolean
  }
  
  trait ReferenceProvider extends js.Object {
    /**
      * Provide a set of project-wide references for the given position and document.
      */
    def provideReferences(model: ITextModel, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]]
  }
  
  trait Rejection extends js.Object {
    var rejectReason: js.UndefOr[String] = js.undefined
  }
  
  trait RenameLocation extends js.Object {
    var range: IRange
    var text: String
  }
  
  trait RenameProvider extends js.Object {
    var resolveRenameLocation: js.UndefOr[
        js.Function3[
          /* model */ ITextModel, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          ProviderResult[RenameLocation with Rejection]
        ]
      ] = js.undefined
    def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit with Rejection]
  }
  
  trait ResourceFileEdit extends js.Object {
    var newUri: Uri
    var oldUri: Uri
    var options: Anon_IgnoreIfExists
  }
  
  trait ResourceTextEdit extends js.Object {
    var edits: js.Array[TextEdit]
    var modelVersionId: js.UndefOr[Double] = js.undefined
    var resource: Uri
  }
  
  trait SelectionRange extends js.Object {
    var kind: String
    var range: IRange
  }
  
  trait SelectionRangeProvider extends js.Object {
    /**
      * Provide ranges that should be selected from the given position.
      */
    def provideSelectionRanges(model: ITextModel, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[js.Array[SelectionRange]]]
  }
  
  trait SignatureHelp extends js.Object {
    /**
      * The active parameter of the active signature.
      */
    var activeParameter: Double
    /**
      * The active signature.
      */
    var activeSignature: Double
    /**
      * One or more signatures.
      */
    var signatures: js.Array[SignatureInformation]
  }
  
  trait SignatureHelpContext extends js.Object {
    val activeSignatureHelp: js.UndefOr[SignatureHelp] = js.undefined
    val isRetrigger: Boolean
    val triggerCharacter: js.UndefOr[String] = js.undefined
    val triggerKind: SignatureHelpTriggerKind
  }
  
  trait SignatureHelpProvider extends js.Object {
    val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
    val signatureHelpTriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * Provide help for the signature at the given position and document.
      */
    def provideSignatureHelp(model: ITextModel, position: Position, token: CancellationToken, context: SignatureHelpContext): ProviderResult[SignatureHelp]
  }
  
  @js.native
  sealed trait SignatureHelpTriggerKind extends js.Object
  
  trait SignatureInformation extends js.Object {
    /**
      * The human-readable doc-comment of this signature. Will be shown
      * in the UI but can be omitted.
      */
    var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
    /**
      * The label of this signature. Will be shown in
      * the UI.
      */
    var label: String
    /**
      * The parameters of this signature.
      */
    var parameters: js.Array[ParameterInformation]
  }
  
  @js.native
  sealed trait SymbolKind extends js.Object
  
  trait TextEdit extends js.Object {
    var eol: js.UndefOr[EndOfLineSequence] = js.undefined
    var range: IRange
    var text: String
  }
  
  trait TokensProvider extends js.Object {
    /**
      * The initial state of a language. Will be the state passed in to tokenize the first line.
      */
    def getInitialState(): IState
    /**
      * Tokenize a line given the state at the beginning of the line.
      */
    def tokenize(line: String, state: IState): ILineTokens
  }
  
  trait TypeDefinitionProvider extends js.Object {
    /**
      * Provide the type definition of the symbol at the given position and document.
      */
    def provideTypeDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
  }
  
  trait WorkspaceEdit extends js.Object {
    var edits: js.Array[ResourceTextEdit | ResourceFileEdit]
  }
  
  def getEncodedLanguageId(languageId: String): Double = js.native
  def getLanguages(): js.Array[ILanguageExtensionPoint] = js.native
  def onLanguage(languageId: String, callback: js.Function0[Unit]): IDisposable = js.native
  def register(language: ILanguageExtensionPoint): Unit = js.native
  def registerCodeActionProvider(languageId: String, provider: CodeActionProvider): IDisposable = js.native
  def registerCodeLensProvider(languageId: String, provider: CodeLensProvider): IDisposable = js.native
  def registerColorProvider(languageId: String, provider: DocumentColorProvider): IDisposable = js.native
  def registerCompletionItemProvider(languageId: String, provider: CompletionItemProvider): IDisposable = js.native
  def registerDefinitionProvider(languageId: String, provider: DefinitionProvider): IDisposable = js.native
  def registerDocumentFormattingEditProvider(languageId: String, provider: DocumentFormattingEditProvider): IDisposable = js.native
  def registerDocumentHighlightProvider(languageId: String, provider: DocumentHighlightProvider): IDisposable = js.native
  def registerDocumentRangeFormattingEditProvider(languageId: String, provider: DocumentRangeFormattingEditProvider): IDisposable = js.native
  def registerDocumentSymbolProvider(languageId: String, provider: DocumentSymbolProvider): IDisposable = js.native
  def registerFoldingRangeProvider(languageId: String, provider: FoldingRangeProvider): IDisposable = js.native
  def registerHoverProvider(languageId: String, provider: HoverProvider): IDisposable = js.native
  def registerImplementationProvider(languageId: String, provider: ImplementationProvider): IDisposable = js.native
  def registerLinkProvider(languageId: String, provider: LinkProvider): IDisposable = js.native
  def registerOnTypeFormattingEditProvider(languageId: String, provider: OnTypeFormattingEditProvider): IDisposable = js.native
  def registerReferenceProvider(languageId: String, provider: ReferenceProvider): IDisposable = js.native
  def registerRenameProvider(languageId: String, provider: RenameProvider): IDisposable = js.native
  def registerSignatureHelpProvider(languageId: String, provider: SignatureHelpProvider): IDisposable = js.native
  def registerTypeDefinitionProvider(languageId: String, provider: TypeDefinitionProvider): IDisposable = js.native
  def setLanguageConfiguration(languageId: String, configuration: LanguageConfiguration): IDisposable = js.native
  def setMonarchTokensProvider(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
  def setMonarchTokensProvider(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: EncodedTokensProvider): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: TokensProvider): IDisposable = js.native
  @js.native
  object CompletionItemInsertTextRule extends js.Object {
    /**
      * `insertText` is a snippet.
      */
    @js.native
    sealed trait InsertAsSnippet extends CompletionItemInsertTextRule
    
    /**
      * Adjust whitespace/indentation of multiline insert texts to
      * match the current line indentation.
      */
    @js.native
    sealed trait KeepWhitespace extends CompletionItemInsertTextRule
    
    /* 4 */ val InsertAsSnippet: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemInsertTextRule.InsertAsSnippet with Double = js.native
    /* 1 */ val KeepWhitespace: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemInsertTextRule.KeepWhitespace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompletionItemInsertTextRule with Double] = js.native
  }
  
  @js.native
  object CompletionItemKind extends js.Object {
    @js.native
    sealed trait Class extends CompletionItemKind
    
    @js.native
    sealed trait Color extends CompletionItemKind
    
    @js.native
    sealed trait Constant extends CompletionItemKind
    
    @js.native
    sealed trait Constructor extends CompletionItemKind
    
    @js.native
    sealed trait Customcolor extends CompletionItemKind
    
    @js.native
    sealed trait Enum extends CompletionItemKind
    
    @js.native
    sealed trait EnumMember extends CompletionItemKind
    
    @js.native
    sealed trait Event extends CompletionItemKind
    
    @js.native
    sealed trait Field extends CompletionItemKind
    
    @js.native
    sealed trait File extends CompletionItemKind
    
    @js.native
    sealed trait Folder extends CompletionItemKind
    
    @js.native
    sealed trait Function extends CompletionItemKind
    
    @js.native
    sealed trait Interface extends CompletionItemKind
    
    @js.native
    sealed trait Keyword extends CompletionItemKind
    
    @js.native
    sealed trait Method extends CompletionItemKind
    
    @js.native
    sealed trait Module extends CompletionItemKind
    
    @js.native
    sealed trait Operator extends CompletionItemKind
    
    @js.native
    sealed trait Property extends CompletionItemKind
    
    @js.native
    sealed trait Reference extends CompletionItemKind
    
    @js.native
    sealed trait Snippet extends CompletionItemKind
    
    @js.native
    sealed trait Struct extends CompletionItemKind
    
    @js.native
    sealed trait Text extends CompletionItemKind
    
    @js.native
    sealed trait TypeParameter extends CompletionItemKind
    
    @js.native
    sealed trait Unit extends CompletionItemKind
    
    @js.native
    sealed trait Value extends CompletionItemKind
    
    @js.native
    sealed trait Variable extends CompletionItemKind
    
    /* 5 */ val Class: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Class with Double = js.native
    /* 19 */ val Color: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Color with Double = js.native
    /* 14 */ val Constant: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Constant with Double = js.native
    /* 2 */ val Constructor: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Constructor with Double = js.native
    /* 22 */ val Customcolor: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Customcolor with Double = js.native
    /* 15 */ val Enum: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Enum with Double = js.native
    /* 16 */ val EnumMember: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.EnumMember with Double = js.native
    /* 10 */ val Event: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Event with Double = js.native
    /* 3 */ val Field: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Field with Double = js.native
    /* 20 */ val File: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.File with Double = js.native
    /* 23 */ val Folder: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Folder with Double = js.native
    /* 1 */ val Function: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Function with Double = js.native
    /* 7 */ val Interface: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Interface with Double = js.native
    /* 17 */ val Keyword: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Keyword with Double = js.native
    /* 0 */ val Method: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Method with Double = js.native
    /* 8 */ val Module: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Module with Double = js.native
    /* 11 */ val Operator: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Operator with Double = js.native
    /* 9 */ val Property: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Property with Double = js.native
    /* 21 */ val Reference: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Reference with Double = js.native
    /* 25 */ val Snippet: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Snippet with Double = js.native
    /* 6 */ val Struct: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Struct with Double = js.native
    /* 18 */ val Text: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Text with Double = js.native
    /* 24 */ val TypeParameter: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.TypeParameter with Double = js.native
    /* 12 */ val Unit: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Unit with Double = js.native
    /* 13 */ val Value: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Value with Double = js.native
    /* 4 */ val Variable: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionItemKind.Variable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompletionItemKind with Double] = js.native
  }
  
  @js.native
  object CompletionTriggerKind extends js.Object {
    @js.native
    sealed trait Invoke extends CompletionTriggerKind
    
    @js.native
    sealed trait TriggerCharacter extends CompletionTriggerKind
    
    @js.native
    sealed trait TriggerForIncompleteCompletions extends CompletionTriggerKind
    
    /* 0 */ val Invoke: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionTriggerKind.Invoke with Double = js.native
    /* 1 */ val TriggerCharacter: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionTriggerKind.TriggerCharacter with Double = js.native
    /* 2 */ val TriggerForIncompleteCompletions: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.CompletionTriggerKind.TriggerForIncompleteCompletions with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
  }
  
  @js.native
  object DocumentHighlightKind extends js.Object {
    /**
      * Read-access of a symbol, like reading a variable.
      */
    @js.native
    sealed trait Read extends DocumentHighlightKind
    
    /**
      * A textual occurrence.
      */
    @js.native
    sealed trait Text extends DocumentHighlightKind
    
    /**
      * Write-access of a symbol, like writing to a variable.
      */
    @js.native
    sealed trait Write extends DocumentHighlightKind
    
    /* 1 */ val Read: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentHighlightKind.Read with Double = js.native
    /* 0 */ val Text: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentHighlightKind.Text with Double = js.native
    /* 2 */ val Write: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.DocumentHighlightKind.Write with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DocumentHighlightKind with Double] = js.native
  }
  
  /* static members */
  @js.native
  object FoldingRangeKind extends js.Object {
    /**
      * Kind for folding range representing a comment. The value of the kind is 'comment'.
      */
    val Comment: FoldingRangeKind = js.native
    /**
      * Kind for folding range representing a import. The value of the kind is 'imports'.
      */
    val Imports: FoldingRangeKind = js.native
    /**
      * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
      * The value of the kind is 'region'.
      */
    val Region: FoldingRangeKind = js.native
  }
  
  @js.native
  object IndentAction extends js.Object {
    /**
      * Insert new line and indent once (relative to the previous line's indentation).
      */
    @js.native
    sealed trait Indent extends IndentAction
    
    /**
      * Insert two new lines:
      *  - the first one indented which will hold the cursor
      *  - the second one at the same indentation level
      */
    @js.native
    sealed trait IndentOutdent extends IndentAction
    
    /**
      * Insert new line and copy the previous line's indentation.
      */
    @js.native
    sealed trait None extends IndentAction
    
    /**
      * Insert new line and outdent once (relative to the previous line's indentation).
      */
    @js.native
    sealed trait Outdent extends IndentAction
    
    /* 1 */ val Indent: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IndentAction.Indent with Double = js.native
    /* 2 */ val IndentOutdent: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IndentAction.IndentOutdent with Double = js.native
    /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IndentAction.None with Double = js.native
    /* 3 */ val Outdent: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.IndentAction.Outdent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IndentAction with Double] = js.native
  }
  
  @js.native
  object SignatureHelpTriggerKind extends js.Object {
    @js.native
    sealed trait ContentChange extends SignatureHelpTriggerKind
    
    @js.native
    sealed trait Invoke extends SignatureHelpTriggerKind
    
    @js.native
    sealed trait TriggerCharacter extends SignatureHelpTriggerKind
    
    /* 3 */ val ContentChange: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelpTriggerKind.ContentChange with Double = js.native
    /* 1 */ val Invoke: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelpTriggerKind.Invoke with Double = js.native
    /* 2 */ val TriggerCharacter: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SignatureHelpTriggerKind.TriggerCharacter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
  }
  
  @js.native
  object SymbolKind extends js.Object {
    @js.native
    sealed trait Array extends SymbolKind
    
    @js.native
    sealed trait Boolean extends SymbolKind
    
    @js.native
    sealed trait Class extends SymbolKind
    
    @js.native
    sealed trait Constant extends SymbolKind
    
    @js.native
    sealed trait Constructor extends SymbolKind
    
    @js.native
    sealed trait Enum extends SymbolKind
    
    @js.native
    sealed trait EnumMember extends SymbolKind
    
    @js.native
    sealed trait Event extends SymbolKind
    
    @js.native
    sealed trait Field extends SymbolKind
    
    @js.native
    sealed trait File extends SymbolKind
    
    @js.native
    sealed trait Function extends SymbolKind
    
    @js.native
    sealed trait Interface extends SymbolKind
    
    @js.native
    sealed trait Key extends SymbolKind
    
    @js.native
    sealed trait Method extends SymbolKind
    
    @js.native
    sealed trait Module extends SymbolKind
    
    @js.native
    sealed trait Namespace extends SymbolKind
    
    @js.native
    sealed trait Null extends SymbolKind
    
    @js.native
    sealed trait Number extends SymbolKind
    
    @js.native
    sealed trait Object extends SymbolKind
    
    @js.native
    sealed trait Operator extends SymbolKind
    
    @js.native
    sealed trait Package extends SymbolKind
    
    @js.native
    sealed trait Property extends SymbolKind
    
    @js.native
    sealed trait String extends SymbolKind
    
    @js.native
    sealed trait Struct extends SymbolKind
    
    @js.native
    sealed trait TypeParameter extends SymbolKind
    
    @js.native
    sealed trait Variable extends SymbolKind
    
    /* 17 */ val Array: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Array with Double = js.native
    /* 16 */ val Boolean: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Boolean with Double = js.native
    /* 4 */ val Class: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Class with Double = js.native
    /* 13 */ val Constant: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Constant with Double = js.native
    /* 8 */ val Constructor: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Constructor with Double = js.native
    /* 9 */ val Enum: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Enum with Double = js.native
    /* 21 */ val EnumMember: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.EnumMember with Double = js.native
    /* 23 */ val Event: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Event with Double = js.native
    /* 7 */ val Field: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Field with Double = js.native
    /* 0 */ val File: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.File with Double = js.native
    /* 11 */ val Function: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Function with Double = js.native
    /* 10 */ val Interface: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Interface with Double = js.native
    /* 19 */ val Key: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Key with Double = js.native
    /* 5 */ val Method: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Method with Double = js.native
    /* 1 */ val Module: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Module with Double = js.native
    /* 2 */ val Namespace: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Namespace with Double = js.native
    /* 20 */ val Null: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Null with Double = js.native
    /* 15 */ val Number: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Number with Double = js.native
    /* 18 */ val Object: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Object with Double = js.native
    /* 24 */ val Operator: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Operator with Double = js.native
    /* 3 */ val Package: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Package with Double = js.native
    /* 6 */ val Property: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Property with Double = js.native
    /* 14 */ val String: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.String with Double = js.native
    /* 22 */ val Struct: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Struct with Double = js.native
    /* 25 */ val TypeParameter: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.TypeParameter with Double = js.native
    /* 12 */ val Variable: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.SymbolKind.Variable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
  }
  
  @JSName("css")
  @js.native
  object cssNs extends js.Object {
    trait DiagnosticsOptions extends js.Object {
      val lint: js.UndefOr[Anon_ArgumentsInColorFunction] = js.undefined
      val validate: js.UndefOr[Boolean] = js.undefined
    }
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      val diagnosticsOptions: DiagnosticsOptions = js.native
      def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _]): IDisposable = js.native
      def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _], thisArg: js.Any): IDisposable = js.native
      def setDiagnosticsOptions(options: DiagnosticsOptions): Unit = js.native
    }
    
    var cssDefaults: LanguageServiceDefaults = js.native
    var lessDefaults: LanguageServiceDefaults = js.native
    var scssDefaults: LanguageServiceDefaults = js.native
  }
  
  @JSName("html")
  @js.native
  object htmlNs extends js.Object {
    trait HTMLFormatConfiguration extends js.Object {
      val contentUnformatted: String
      val endWithNewline: Boolean
      val extraLiners: String
      val indentHandlebars: Boolean
      val indentInnerHtml: Boolean
      val insertSpaces: Boolean
      val maxPreserveNewLines: Double
      val preserveNewLines: Boolean
      val tabSize: Double
      val unformatted: String
      val wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`
      val wrapLineLength: Double
    }
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      val options: Options = js.native
      def onDidChange(
        listener: js.Function1[
              /* e */ typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.LanguageServiceDefaults, 
              _
            ]
      ): IDisposable = js.native
      def onDidChange(
        listener: js.Function1[
              /* e */ typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.LanguageServiceDefaults, 
              _
            ],
        thisArg: js.Any
      ): IDisposable = js.native
      def setOptions(options: Options): Unit = js.native
    }
    
    trait Options extends js.Object {
      /**
        * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
        */
      val format: js.UndefOr[HTMLFormatConfiguration] = js.undefined
      /**
        * A list of known schemas and/or associations of schemas to file names.
        */
      val suggest: js.UndefOr[CompletionConfiguration] = js.undefined
    }
    
    var handlebarDefaults: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.LanguageServiceDefaults = js.native
    var htmlDefaults: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.LanguageServiceDefaults = js.native
    var razorDefaults: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.htmlNs.LanguageServiceDefaults = js.native
    type CompletionConfiguration = StringDictionary[Boolean]
  }
  
  @JSName("json")
  @js.native
  object jsonNs extends js.Object {
    trait DiagnosticsOptions extends js.Object {
      /**
        * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
        */
      val allowComments: js.UndefOr[Boolean] = js.undefined
      /**
        *  If set, the schema service would load schema content on-demand with 'fetch' if available
        */
      val enableSchemaRequest: js.UndefOr[Boolean] = js.undefined
      /**
        * A list of known schemas and/or associations of schemas to file names.
        */
      val schemas: js.UndefOr[js.Array[Anon_FileMatch]] = js.undefined
      /**
        * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
        */
      val validate: js.UndefOr[Boolean] = js.undefined
    }
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      val diagnosticsOptions: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.jsonNs.DiagnosticsOptions = js.native
      def onDidChange(
        listener: js.Function1[
              /* e */ typings.monacoDashEditor.monacoDashEditorMod.languagesNs.jsonNs.LanguageServiceDefaults, 
              _
            ]
      ): IDisposable = js.native
      def onDidChange(
        listener: js.Function1[
              /* e */ typings.monacoDashEditor.monacoDashEditorMod.languagesNs.jsonNs.LanguageServiceDefaults, 
              _
            ],
        thisArg: js.Any
      ): IDisposable = js.native
      def setDiagnosticsOptions(options: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.jsonNs.DiagnosticsOptions): Unit = js.native
    }
    
    var jsonDefaults: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.jsonNs.LanguageServiceDefaults = js.native
  }
  
  @JSName("typescript")
  @js.native
  object typescriptNs extends js.Object {
    trait CompilerOptions
      extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
      var allowJs: js.UndefOr[Boolean] = js.undefined
      var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.undefined
      var allowUnreachableCode: js.UndefOr[Boolean] = js.undefined
      var allowUnusedLabels: js.UndefOr[Boolean] = js.undefined
      var alwaysStrict: js.UndefOr[Boolean] = js.undefined
      var baseUrl: js.UndefOr[String] = js.undefined
      var charset: js.UndefOr[String] = js.undefined
      var checkJs: js.UndefOr[Boolean] = js.undefined
      var composite: js.UndefOr[Boolean] = js.undefined
      var declaration: js.UndefOr[Boolean] = js.undefined
      var declarationDir: js.UndefOr[String] = js.undefined
      var declarationMap: js.UndefOr[Boolean] = js.undefined
      var disableSizeLimit: js.UndefOr[Boolean] = js.undefined
      var downlevelIteration: js.UndefOr[Boolean] = js.undefined
      var emitBOM: js.UndefOr[Boolean] = js.undefined
      var emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined
      var emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined
      var esModuleInterop: js.UndefOr[Boolean] = js.undefined
      var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
      var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.undefined
      var importHelpers: js.UndefOr[Boolean] = js.undefined
      var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
      var inlineSources: js.UndefOr[Boolean] = js.undefined
      var isolatedModules: js.UndefOr[Boolean] = js.undefined
      var jsx: js.UndefOr[JsxEmit] = js.undefined
      var jsxFactory: js.UndefOr[String] = js.undefined
      var keyofStringsOnly: js.UndefOr[Boolean] = js.undefined
      var lib: js.UndefOr[js.Array[String]] = js.undefined
      var locale: js.UndefOr[String] = js.undefined
      var mapRoot: js.UndefOr[String] = js.undefined
      var maxNodeModuleJsDepth: js.UndefOr[Double] = js.undefined
      var module: js.UndefOr[ModuleKind] = js.undefined
      var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.undefined
      var newLine: js.UndefOr[NewLineKind] = js.undefined
      var noEmit: js.UndefOr[Boolean] = js.undefined
      var noEmitHelpers: js.UndefOr[Boolean] = js.undefined
      var noEmitOnError: js.UndefOr[Boolean] = js.undefined
      var noErrorTruncation: js.UndefOr[Boolean] = js.undefined
      var noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.undefined
      var noImplicitAny: js.UndefOr[Boolean] = js.undefined
      var noImplicitReturns: js.UndefOr[Boolean] = js.undefined
      var noImplicitThis: js.UndefOr[Boolean] = js.undefined
      var noImplicitUseStrict: js.UndefOr[Boolean] = js.undefined
      var noLib: js.UndefOr[Boolean] = js.undefined
      var noResolve: js.UndefOr[Boolean] = js.undefined
      var noStrictGenericChecks: js.UndefOr[Boolean] = js.undefined
      var noUnusedLocals: js.UndefOr[Boolean] = js.undefined
      var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
      var out: js.UndefOr[String] = js.undefined
      var outDir: js.UndefOr[String] = js.undefined
      var outFile: js.UndefOr[String] = js.undefined
      var paths: js.UndefOr[MapLike[js.Array[String]]] = js.undefined
      var preserveConstEnums: js.UndefOr[Boolean] = js.undefined
      var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
      var project: js.UndefOr[String] = js.undefined
      var reactNamespace: js.UndefOr[String] = js.undefined
      var removeComments: js.UndefOr[Boolean] = js.undefined
      var resolveJsonModule: js.UndefOr[Boolean] = js.undefined
      var rootDir: js.UndefOr[String] = js.undefined
      var rootDirs: js.UndefOr[js.Array[String]] = js.undefined
      var skipDefaultLibCheck: js.UndefOr[Boolean] = js.undefined
      var skipLibCheck: js.UndefOr[Boolean] = js.undefined
      var sourceMap: js.UndefOr[Boolean] = js.undefined
      var sourceRoot: js.UndefOr[String] = js.undefined
      var strict: js.UndefOr[Boolean] = js.undefined
      var strictFunctionTypes: js.UndefOr[Boolean] = js.undefined
      var strictNullChecks: js.UndefOr[Boolean] = js.undefined
      var strictPropertyInitialization: js.UndefOr[Boolean] = js.undefined
      var suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.undefined
      var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined
      var target: js.UndefOr[ScriptTarget] = js.undefined
      var traceResolution: js.UndefOr[Boolean] = js.undefined
      /** Paths used to compute primary types search locations */
      var typeRoots: js.UndefOr[js.Array[String]] = js.undefined
      var types: js.UndefOr[js.Array[String]] = js.undefined
    }
    
    trait DiagnosticsOptions extends js.Object {
      var noSemanticValidation: js.UndefOr[Boolean] = js.undefined
      var noSyntaxValidation: js.UndefOr[Boolean] = js.undefined
    }
    
    @js.native
    sealed trait JsxEmit extends js.Object
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      /**
        * Add an additional source file to the language service. Use this
        * for typescript (definition) files that won't be loaded as editor
        * document, like `jquery.d.ts`.
        *
        * @param content The file content
        * @param filePath An optional file path
        * @returns A disposable which will remove the file from the
        * language service upon disposal.
        */
      def addExtraLib(content: String): IDisposable = js.native
      def addExtraLib(content: String, filePath: String): IDisposable = js.native
      /**
        * Set TypeScript compiler options.
        */
      def setCompilerOptions(options: CompilerOptions): Unit = js.native
      /**
        * Configure whether syntactic and/or semantic validation should
        * be performed
        */
      def setDiagnosticsOptions(options: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.DiagnosticsOptions): Unit = js.native
      /**
        * Configure if all existing models should be eagerly sync'd
        * to the worker on start or restart.
        */
      def setEagerModelSync(value: Boolean): Unit = js.native
      /**
        * Configure when the worker shuts down. By default that is 2mins.
        *
        * @param value The maximum idle time in milliseconds. Values less than one
        * mean never shut down.
        */
      def setMaximumWorkerIdleTime(value: Double): Unit = js.native
    }
    
    @js.native
    sealed trait ModuleKind extends js.Object
    
    @js.native
    sealed trait ModuleResolutionKind extends js.Object
    
    @js.native
    sealed trait NewLineKind extends js.Object
    
    @js.native
    sealed trait ScriptTarget extends js.Object
    
    var getJavaScriptWorker: js.Function0[js.Promise[js.Any]] = js.native
    var getTypeScriptWorker: js.Function0[js.Promise[js.Any]] = js.native
    var javascriptDefaults: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.LanguageServiceDefaults = js.native
    var typescriptDefaults: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.LanguageServiceDefaults = js.native
    @js.native
    object JsxEmit extends js.Object {
      @js.native
      sealed trait None extends JsxEmit
      
      @js.native
      sealed trait Preserve extends JsxEmit
      
      @js.native
      sealed trait React extends JsxEmit
      
      @js.native
      sealed trait ReactNative extends JsxEmit
      
      /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit.None with Double = js.native
      /* 1 */ val Preserve: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit.Preserve with Double = js.native
      /* 2 */ val React: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit.React with Double = js.native
      /* 3 */ val ReactNative: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit.ReactNative with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
    }
    
    @js.native
    object ModuleKind extends js.Object {
      @js.native
      sealed trait AMD extends ModuleKind
      
      @js.native
      sealed trait CommonJS extends ModuleKind
      
      @js.native
      sealed trait ES2015 extends ModuleKind
      
      @js.native
      sealed trait ESNext extends ModuleKind
      
      @js.native
      sealed trait None extends ModuleKind
      
      @js.native
      sealed trait System extends ModuleKind
      
      @js.native
      sealed trait UMD extends ModuleKind
      
      /* 2 */ val AMD: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.AMD with Double = js.native
      /* 1 */ val CommonJS: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.CommonJS with Double = js.native
      /* 5 */ val ES2015: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.ES2015 with Double = js.native
      /* 6 */ val ESNext: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.ESNext with Double = js.native
      /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.None with Double = js.native
      /* 4 */ val System: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.System with Double = js.native
      /* 3 */ val UMD: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind.UMD with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[ModuleKind with Double] = js.native
    }
    
    @js.native
    object ModuleResolutionKind extends js.Object {
      @js.native
      sealed trait Classic extends ModuleResolutionKind
      
      @js.native
      sealed trait NodeJs extends ModuleResolutionKind
      
      /* 1 */ val Classic: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleResolutionKind.Classic with Double = js.native
      /* 2 */ val NodeJs: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ModuleResolutionKind.NodeJs with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[ModuleResolutionKind with Double] = js.native
    }
    
    @js.native
    object NewLineKind extends js.Object {
      @js.native
      sealed trait CarriageReturnLineFeed extends NewLineKind
      
      @js.native
      sealed trait LineFeed extends NewLineKind
      
      /* 0 */ val CarriageReturnLineFeed: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.NewLineKind.CarriageReturnLineFeed with Double = js.native
      /* 1 */ val LineFeed: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.NewLineKind.LineFeed with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
    }
    
    @js.native
    object ScriptTarget extends js.Object {
      @js.native
      sealed trait ES2015 extends ScriptTarget
      
      @js.native
      sealed trait ES2016 extends ScriptTarget
      
      @js.native
      sealed trait ES2017 extends ScriptTarget
      
      @js.native
      sealed trait ES2018 extends ScriptTarget
      
      @js.native
      sealed trait ES3 extends ScriptTarget
      
      @js.native
      sealed trait ES5 extends ScriptTarget
      
      @js.native
      sealed trait ESNext extends ScriptTarget
      
      @js.native
      sealed trait JSON extends ScriptTarget
      
      @js.native
      sealed trait Latest extends ScriptTarget
      
      /* 2 */ val ES2015: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ES2015 with Double = js.native
      /* 3 */ val ES2016: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ES2016 with Double = js.native
      /* 4 */ val ES2017: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ES2017 with Double = js.native
      /* 5 */ val ES2018: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ES2018 with Double = js.native
      /* 0 */ val ES3: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ES3 with Double = js.native
      /* 1 */ val ES5: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ES5 with Double = js.native
      /* 6 */ val ESNext: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.ESNext with Double = js.native
      /* 100 */ val JSON: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.JSON with Double = js.native
      /* 6 */ val Latest: typings.monacoDashEditor.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget.Latest with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[ScriptTarget with Double] = js.native
    }
    
    type CompilerOptionsValue = js.UndefOr[
        String | Double | Boolean | (js.Array[Double | String]) | MapLike[js.Array[String]] | Null
      ]
    type MapLike[T] = StringDictionary[T]
  }
  
  type CharacterPair = js.Tuple2[String, String]
  type Definition = Location | (js.Array[Location | LocationLink])
  type IMonarchLanguageAction = IShortMonarchLanguageAction | IExpandedMonarchLanguageAction | (js.Array[IExpandedMonarchLanguageAction | IShortMonarchLanguageAction])
  type IMonarchLanguageRule = IShortMonarchLanguageRule1 | IShortMonarchLanguageRule2 | IExpandedMonarchLanguageRule
  type IShortMonarchLanguageAction = String
  type IShortMonarchLanguageRule1 = js.Tuple2[RegExp, IMonarchLanguageAction]
  type IShortMonarchLanguageRule2 = js.Tuple3[RegExp, IMonarchLanguageAction, String]
  type ProviderResult[T] = js.UndefOr[T | Null | (Thenable[js.UndefOr[T | Null]])]
}

