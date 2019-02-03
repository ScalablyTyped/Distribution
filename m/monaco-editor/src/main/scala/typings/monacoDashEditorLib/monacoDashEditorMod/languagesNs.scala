package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages")
@js.native
object languagesNs extends js.Object {
  trait CodeAction extends js.Object {
    var command: js.UndefOr[Command] = js.undefined
    var diagnostics: js.UndefOr[js.Array[monacoDashEditorLib.monacoDashEditorMod.editorNs.IMarkerData]] = js.undefined
    var edit: js.UndefOr[WorkspaceEdit] = js.undefined
    var kind: js.UndefOr[java.lang.String] = js.undefined
    var title: java.lang.String
  }
  
  trait CodeActionContext extends js.Object {
    /**
      * An array of diagnostics.
      *
      * @readonly
      */
    val markers: js.Array[monacoDashEditorLib.monacoDashEditorMod.editorNs.IMarkerData]
    /**
      * Requested kind of actions to return.
      */
    val only: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CodeActionProvider extends js.Object {
    /**
      * Provide commands for the given document and range.
      */
    def provideCodeActions(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      range: monacoDashEditorLib.monacoDashEditorMod.Range,
      context: CodeActionContext,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): (js.Array[Command | CodeAction]) | (monacoDashEditorLib.monacoDashEditorMod.Thenable[js.Array[Command | CodeAction]])
  }
  
  trait CodeLensProvider extends js.Object {
    var onDidChange: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.IEvent[this.type]] = js.undefined
    var resolveCodeLens: js.UndefOr[
        js.Function3[
          /* model */ monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel, 
          /* codeLens */ ICodeLensSymbol, 
          /* token */ monacoDashEditorLib.monacoDashEditorMod.CancellationToken, 
          ProviderResult[ICodeLensSymbol]
        ]
      ] = js.undefined
    def provideCodeLenses(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[ICodeLensSymbol]]
  }
  
  trait Command extends js.Object {
    var arguments: js.UndefOr[js.Array[_]] = js.undefined
    var id: java.lang.String
    var title: java.lang.String
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CommentRule extends js.Object {
    /**
      * The block comment character pair, like `/ * block comment *&#47;`
      */
    var blockComment: js.UndefOr[CharacterPair | scala.Null] = js.undefined
    /**
      * The line comment token, like `// this is a comment`
      */
    var lineComment: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  }
  
  trait CompletionContext extends js.Object {
    /**
      * Character that triggered the completion item provider.
      *
      * `undefined` if provider was not triggered by a character.
      */
    var triggerCharacter: js.UndefOr[java.lang.String] = js.undefined
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
    var additionalTextEdits: js.UndefOr[js.Array[monacoDashEditorLib.monacoDashEditorMod.editorNs.ISingleEditOperation]] = js.undefined
    /**
      * A command that should be run upon acceptance of this item.
      */
    var command: js.UndefOr[Command] = js.undefined
    /**
      * An optional set of characters that when pressed while this completion is active will accept it first and
      * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
      * characters will be ignored.
      */
    var commitCharacters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * A human-readable string with additional information
      * about this item, like type or symbol information.
      */
    var detail: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A human-readable string that represents a doc-comment.
      */
    var documentation: js.UndefOr[java.lang.String | monacoDashEditorLib.monacoDashEditorMod.IMarkdownString] = js.undefined
    /**
      * A string that should be used when filtering a set of
      * completion items. When `falsy` the [label](#CompletionItem.label)
      * is used.
      */
    var filterText: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A string or snippet that should be inserted in a document when selecting
      * this completion.
      * is used.
      */
    var insertText: java.lang.String
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
    var label: java.lang.String
    /**
      * Select this item when showing. *Note* that only one completion item can be selected and
      * that the editor decides which item that is. The rule is that the *first* item of those
      * that match best is selected.
      */
    var preselect: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A range of text that should be replaced by this completion item.
      *
      * Defaults to a range from the start of the [current word](#TextDocument.getWordRangeAtPosition) to the
      * current position.
      *
      * *Note:* The range must be a [single line](#Range.isSingleLine) and it must
      * [contain](#Range.contains) the position at which completion has been [requested](#CompletionItemProvider.provideCompletionItems).
      */
    var range: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.IRange] = js.undefined
    /**
      * A string that should be used when comparing this item
      * with other items. When `falsy` the [label](#CompletionItem.label)
      * is used.
      */
    var sortText: js.UndefOr[java.lang.String] = js.undefined
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
          /* model */ monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel, 
          /* position */ monacoDashEditorLib.monacoDashEditorMod.Position, 
          /* item */ CompletionItem, 
          /* token */ monacoDashEditorLib.monacoDashEditorMod.CancellationToken, 
          ProviderResult[CompletionItem]
        ]
      ] = js.undefined
    var triggerCharacters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * Provide completion items for the given position and document.
      */
    def provideCompletionItems(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      context: CompletionContext,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[CompletionList]
  }
  
  trait CompletionList extends js.Object {
    var dispose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var incomplete: js.UndefOr[scala.Boolean] = js.undefined
    var suggestions: js.Array[CompletionItem]
  }
  
  @js.native
  sealed trait CompletionTriggerKind extends js.Object
  
  trait DefinitionLink extends js.Object {
    var origin: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.IRange] = js.undefined
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
    var selectionRange: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.IRange] = js.undefined
    var uri: monacoDashEditorLib.monacoDashEditorMod.Uri
  }
  
  trait DefinitionProvider extends js.Object {
    /**
      * Provide the definition of the symbol at the given position and document.
      */
    def provideDefinition(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[Definition | js.Array[DefinitionLink]]
  }
  
  trait DocumentColorProvider extends js.Object {
    /**
      * Provide the string representations for a color.
      */
    def provideColorPresentations(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      colorInfo: IColorInformation,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[IColorPresentation]]
    /**
      * Provides the color ranges for a specific model.
      */
    def provideDocumentColors(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[IColorInformation]]
  }
  
  trait DocumentFormattingEditProvider extends js.Object {
    /**
      * Provide formatting edits for a whole document.
      */
    def provideDocumentFormattingEdits(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      options: FormattingOptions,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[TextEdit]]
  }
  
  trait DocumentHighlight extends js.Object {
    /**
      * The highlight kind, default is [text](#DocumentHighlightKind.Text).
      */
    var kind: DocumentHighlightKind
    /**
      * The range this highlight applies to.
      */
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
  }
  
  @js.native
  sealed trait DocumentHighlightKind extends js.Object
  
  trait DocumentHighlightProvider extends js.Object {
    /**
      * Provide a set of document highlights, like all occurrences of a variable or
      * all exit-points of a function.
      */
    def provideDocumentHighlights(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[DocumentHighlight]]
  }
  
  trait DocumentRangeFormattingEditProvider extends js.Object {
    /**
      * Provide formatting edits for a range in a document.
      *
      * The given range is a hint and providers can decide to format a smaller
      * or larger range. Often this is done by adjusting the start and end
      * of the range to full syntax nodes.
      */
    def provideDocumentRangeFormattingEdits(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      range: monacoDashEditorLib.monacoDashEditorMod.Range,
      options: FormattingOptions,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[TextEdit]]
  }
  
  trait DocumentSymbol extends js.Object {
    var children: js.UndefOr[js.Array[DocumentSymbol]] = js.undefined
    var containerName: js.UndefOr[java.lang.String] = js.undefined
    var detail: java.lang.String
    var kind: SymbolKind
    var name: java.lang.String
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
    var selectionRange: monacoDashEditorLib.monacoDashEditorMod.IRange
  }
  
  trait DocumentSymbolProvider extends js.Object {
    var displayName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Provide symbol information for the given document.
      */
    def provideDocumentSymbols(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[DocumentSymbol]]
  }
  
  trait EncodedTokensProvider extends js.Object {
    /**
      * The initial state of a language. Will be the state passed in to tokenize the first line.
      */
    def getInitialState(): IState
    /**
      * Tokenize a line given the state at the beginning of the line.
      */
    def tokenizeEncoded(line: java.lang.String, state: IState): IEncodedLineTokens
  }
  
  trait EnterAction extends js.Object {
    /**
      * Describes text to be appended after the new line and after the indentation.
      */
    var appendText: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Describe what to do with the indentation.
      */
    var indentAction: IndentAction
    /**
      * Describe whether to outdent current line.
      */
    var outdentCurrentLine: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Describes the number of characters to remove from the new line's indentation.
      */
    var removeText: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait FoldingContext extends js.Object
  
  trait FoldingMarkers extends js.Object {
    var end: stdLib.RegExp
    var start: stdLib.RegExp
  }
  
  trait FoldingRange extends js.Object {
    /**
      * The one-based end line of the range to fold. The folded area ends with the line's last character.
      */
    var end: scala.Double
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
    var start: scala.Double
  }
  
  @js.native
  class FoldingRangeKind protected () extends js.Object {
    /**
      * Creates a new [FoldingRangeKind](#FoldingRangeKind).
      *
      * @param value of the kind.
      */
    def this(value: java.lang.String) = this()
    var value: java.lang.String = js.native
  }
  
  trait FoldingRangeProvider extends js.Object {
    /**
      * Provides the color ranges for a specific model.
      */
    def provideFoldingRanges(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      context: FoldingContext,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[FoldingRange]]
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
    var offSide: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait FormattingOptions extends js.Object {
    /**
      * Prefer spaces over tabs.
      */
    var insertSpaces: scala.Boolean
    /**
      * Size of a tab in spaces.
      */
    var tabSize: scala.Double
  }
  
  trait Hover extends js.Object {
    /**
      * The contents of this hover.
      */
    var contents: js.Array[monacoDashEditorLib.monacoDashEditorMod.IMarkdownString]
    /**
      * The range to which this hover applies. When missing, the
      * editor will use the range at the current position or the
      * current position itself.
      */
    var range: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.IRange] = js.undefined
  }
  
  trait HoverProvider extends js.Object {
    /**
      * Provide a hover for the given position and document. Multiple hovers at the same
      * position will be merged by the editor. A hover can have a range which defaults
      * to the word range at the position when omitted.
      */
    def provideHover(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[Hover]
  }
  
  trait IAutoClosingPair extends js.Object {
    var close: java.lang.String
    var open: java.lang.String
  }
  
  trait IAutoClosingPairConditional extends IAutoClosingPair {
    var notIn: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  trait IBracketElectricCharacterContribution extends js.Object {
    var docComment: js.UndefOr[IDocComment] = js.undefined
  }
  
  trait ICodeLensSymbol extends js.Object {
    var command: js.UndefOr[Command] = js.undefined
    var id: js.UndefOr[java.lang.String] = js.undefined
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
  }
  
  trait IColor extends js.Object {
    /**
      * The alpha component in the range [0-1].
      */
    val alpha: scala.Double
    /**
      * The blue component in the range [0-1].
      */
    val blue: scala.Double
    /**
      * The green component in the range [0-1].
      */
    val green: scala.Double
    /**
      * The red component in the range [0-1].
      */
    val red: scala.Double
  }
  
  trait IColorInformation extends js.Object {
    /**
      * The color represented in this range.
      */
    var color: IColor
    /**
      * The range within the model.
      */
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
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
    var label: java.lang.String
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
    var close: java.lang.String
    /**
      * The string that starts a doc comment (e.g. '/ **')
      */
    var open: java.lang.String
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
    var tokens: stdLib.Uint32Array
  }
  
  trait IExpandedMonarchLanguageAction extends js.Object {
    /**
      * @open or @close
      */
    var bracket: js.UndefOr[java.lang.String] = js.undefined
    /**
      * map from string to ILanguageAction
      */
    var cases: js.UndefOr[js.Object] = js.undefined
    /**
      * go back n characters in the stream
      */
    var goBack: js.UndefOr[scala.Double] = js.undefined
    /**
      * array of actions for each parenthesized match group
      */
    var group: js.UndefOr[js.Array[IMonarchLanguageAction]] = js.undefined
    /**
      * log a message to the browser console window
      */
    var log: js.UndefOr[java.lang.String] = js.undefined
    /**
      * the next state to push, or "@push", "@pop", "@popall"
      */
    var next: js.UndefOr[java.lang.String] = js.undefined
    /**
      * switch to embedded language (using the mimetype) or get out using "@pop"
      */
    var nextEmbedded: js.UndefOr[java.lang.String] = js.undefined
    /**
      * switch to this state
      */
    var switchTo: js.UndefOr[java.lang.String] = js.undefined
    /**
      * token class (ie. css class) (or "@brackets" or "@rematch")
      */
    var token: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IExpandedMonarchLanguageRule extends js.Object {
    /**
      * action to take on match
      */
    var action: js.UndefOr[IMonarchLanguageAction] = js.undefined
    /**
      * or an include rule. include all rules from the included state
      */
    var include: js.UndefOr[java.lang.String] = js.undefined
    /**
      * match tokens
      */
    var regex: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  }
  
  trait ILanguageExtensionPoint extends js.Object {
    var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var configuration: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.Uri] = js.undefined
    var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var filenamePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var filenames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var firstLine: js.UndefOr[java.lang.String] = js.undefined
    var id: java.lang.String
    var mimetypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait IMonarchLanguage extends js.Object {
    /**
      * for example [['{','}','delimiter.curly']]
      */
    var brackets: js.UndefOr[js.Array[IMonarchLanguageBracket]] = js.undefined
    /**
      * if no match in the tokenizer assign this token class (default 'source')
      */
    var defaultToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * is the language case insensitive?
      */
    var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * start symbol in the tokenizer (by default the first entry is used)
      */
    var start: js.UndefOr[java.lang.String] = js.undefined
    /**
      * attach this to every token class (by default '.' + name)
      */
    var tokenPostfix: js.UndefOr[java.lang.String] = js.undefined
    /**
      * map from string to ILanguageRule[]
      */
    var tokenizer: org.scalablytyped.runtime.StringDictionary[js.Array[IMonarchLanguageRule]]
  }
  
  trait IMonarchLanguageBracket extends js.Object {
    /**
      * closing bracket
      */
    var close: java.lang.String
    /**
      * open bracket
      */
    var open: java.lang.String
    /**
      * token class
      */
    var token: java.lang.String
  }
  
  trait IState extends js.Object {
    def equals(other: IState): scala.Boolean
  }
  
  trait IToken extends js.Object {
    var scopes: java.lang.String
    var startIndex: scala.Double
  }
  
  trait ImplementationProvider extends js.Object {
    /**
      * Provide the implementation of the symbol at the given position and document.
      */
    def provideImplementation(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[Definition | js.Array[DefinitionLink]]
  }
  
  @js.native
  sealed trait IndentAction extends js.Object
  
  trait IndentationRule extends js.Object {
    /**
      * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
      */
    var decreaseIndentPattern: stdLib.RegExp
    /**
      * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
      */
    var increaseIndentPattern: stdLib.RegExp
    /**
      * If a line matches this pattern, then **only the next line** after it should be indented once.
      */
    var indentNextLinePattern: js.UndefOr[stdLib.RegExp] = js.undefined
    /**
      * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
      */
    var unIndentedLinePattern: js.UndefOr[stdLib.RegExp] = js.undefined
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
    var autoCloseBefore: js.UndefOr[java.lang.String] = js.undefined
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
    var wordPattern: js.UndefOr[stdLib.RegExp] = js.undefined
  }
  
  trait LinkProvider extends js.Object {
    var resolveLink: js.UndefOr[
        js.Function2[
          /* link */ ILink, 
          /* token */ monacoDashEditorLib.monacoDashEditorMod.CancellationToken, 
          ProviderResult[ILink]
        ]
      ] = js.undefined
    def provideLinks(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[ILink]]
  }
  
  trait Location extends js.Object {
    /**
      * The document range of this locations.
      */
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
    /**
      * The resource identifier of this location.
      */
    var uri: monacoDashEditorLib.monacoDashEditorMod.Uri
  }
  
  trait OnEnterRule extends js.Object {
    /**
      * The action to execute.
      */
    var action: EnterAction
    /**
      * This rule will only execute if the text after the cursor matches this regular expression.
      */
    var afterText: js.UndefOr[stdLib.RegExp] = js.undefined
    /**
      * This rule will only execute if the text before the cursor matches this regular expression.
      */
    var beforeText: stdLib.RegExp
    /**
      * This rule will only execute if the text above the this line matches this regular expression.
      */
    var oneLineAboveText: js.UndefOr[stdLib.RegExp] = js.undefined
  }
  
  trait OnTypeFormattingEditProvider extends js.Object {
    var autoFormatTriggerCharacters: js.Array[java.lang.String]
    /**
      * Provide formatting edits after a character has been typed.
      *
      * The given position and character should hint to the provider
      * what range the position to expand to, like find the matching `{`
      * when `}` has been entered.
      */
    def provideOnTypeFormattingEdits(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      ch: java.lang.String,
      options: FormattingOptions,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[TextEdit]]
  }
  
  trait ParameterInformation extends js.Object {
    /**
      * The human-readable doc-comment of this signature. Will be shown
      * in the UI but can be omitted.
      */
    var documentation: js.UndefOr[java.lang.String | monacoDashEditorLib.monacoDashEditorMod.IMarkdownString] = js.undefined
    /**
      * The label of this signature. Will be shown in
      * the UI.
      */
    var label: java.lang.String | (js.Tuple2[scala.Double, scala.Double])
  }
  
  trait ReferenceContext extends js.Object {
    /**
      * Include the declaration of the current symbol.
      */
    var includeDeclaration: scala.Boolean
  }
  
  trait ReferenceProvider extends js.Object {
    /**
      * Provide a set of project-wide references for the given position and document.
      */
    def provideReferences(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      context: ReferenceContext,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[js.Array[Location]]
  }
  
  trait Rejection extends js.Object {
    var rejectReason: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RenameLocation extends js.Object {
    var range: monacoDashEditorLib.monacoDashEditorMod.IRange
    var text: java.lang.String
  }
  
  trait RenameProvider extends js.Object {
    var resolveRenameLocation: js.UndefOr[
        js.Function3[
          /* model */ monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel, 
          /* position */ monacoDashEditorLib.monacoDashEditorMod.Position, 
          /* token */ monacoDashEditorLib.monacoDashEditorMod.CancellationToken, 
          ProviderResult[RenameLocation with Rejection]
        ]
      ] = js.undefined
    def provideRenameEdits(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      newName: java.lang.String,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[WorkspaceEdit with Rejection]
  }
  
  trait ResourceFileEdit extends js.Object {
    var newUri: monacoDashEditorLib.monacoDashEditorMod.Uri
    var oldUri: monacoDashEditorLib.monacoDashEditorMod.Uri
    var options: monacoDashEditorLib.Anon_IgnoreIfExists
  }
  
  trait ResourceTextEdit extends js.Object {
    var edits: js.Array[TextEdit]
    var modelVersionId: js.UndefOr[scala.Double] = js.undefined
    var resource: monacoDashEditorLib.monacoDashEditorMod.Uri
  }
  
  trait SignatureHelp extends js.Object {
    /**
      * The active parameter of the active signature.
      */
    var activeParameter: scala.Double
    /**
      * The active signature.
      */
    var activeSignature: scala.Double
    /**
      * One or more signatures.
      */
    var signatures: js.Array[SignatureInformation]
  }
  
  trait SignatureHelpContext extends js.Object {
    val isRetrigger: scala.Boolean
    val triggerCharacter: js.UndefOr[java.lang.String] = js.undefined
    val triggerReason: SignatureHelpTriggerReason
  }
  
  trait SignatureHelpProvider extends js.Object {
    val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    val signatureHelpTriggerCharacters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * Provide help for the signature at the given position and document.
      */
    def provideSignatureHelp(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken,
      context: SignatureHelpContext
    ): ProviderResult[SignatureHelp]
  }
  
  @js.native
  sealed trait SignatureHelpTriggerReason extends js.Object
  
  trait SignatureInformation extends js.Object {
    /**
      * The human-readable doc-comment of this signature. Will be shown
      * in the UI but can be omitted.
      */
    var documentation: js.UndefOr[java.lang.String | monacoDashEditorLib.monacoDashEditorMod.IMarkdownString] = js.undefined
    /**
      * The label of this signature. Will be shown in
      * the UI.
      */
    var label: java.lang.String
    /**
      * The parameters of this signature.
      */
    var parameters: js.Array[ParameterInformation]
  }
  
  @js.native
  sealed trait SymbolKind extends js.Object
  
  trait TokensProvider extends js.Object {
    /**
      * The initial state of a language. Will be the state passed in to tokenize the first line.
      */
    def getInitialState(): IState
    /**
      * Tokenize a line given the state at the beginning of the line.
      */
    def tokenize(line: java.lang.String, state: IState): ILineTokens
  }
  
  trait TypeDefinitionProvider extends js.Object {
    /**
      * Provide the type definition of the symbol at the given position and document.
      */
    def provideTypeDefinition(
      model: monacoDashEditorLib.monacoDashEditorMod.editorNs.ITextModel,
      position: monacoDashEditorLib.monacoDashEditorMod.Position,
      token: monacoDashEditorLib.monacoDashEditorMod.CancellationToken
    ): ProviderResult[Definition | js.Array[DefinitionLink]]
  }
  
  trait WorkspaceEdit extends js.Object {
    var edits: js.UndefOr[js.Array[ResourceTextEdit | ResourceFileEdit]] = js.undefined
  }
  
  def getEncodedLanguageId(languageId: java.lang.String): scala.Double = js.native
  def getLanguages(): js.Array[ILanguageExtensionPoint] = js.native
  def onLanguage(languageId: java.lang.String, callback: js.Function0[scala.Unit]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def register(language: ILanguageExtensionPoint): scala.Unit = js.native
  def registerCodeActionProvider(languageId: java.lang.String, provider: CodeActionProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerCodeLensProvider(languageId: java.lang.String, provider: CodeLensProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerColorProvider(languageId: java.lang.String, provider: DocumentColorProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerCompletionItemProvider(languageId: java.lang.String, provider: CompletionItemProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerDefinitionProvider(languageId: java.lang.String, provider: DefinitionProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerDocumentFormattingEditProvider(languageId: java.lang.String, provider: DocumentFormattingEditProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerDocumentHighlightProvider(languageId: java.lang.String, provider: DocumentHighlightProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerDocumentRangeFormattingEditProvider(languageId: java.lang.String, provider: DocumentRangeFormattingEditProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerDocumentSymbolProvider(languageId: java.lang.String, provider: DocumentSymbolProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerFoldingRangeProvider(languageId: java.lang.String, provider: FoldingRangeProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerHoverProvider(languageId: java.lang.String, provider: HoverProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerImplementationProvider(languageId: java.lang.String, provider: ImplementationProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerLinkProvider(languageId: java.lang.String, provider: LinkProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerOnTypeFormattingEditProvider(languageId: java.lang.String, provider: OnTypeFormattingEditProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerReferenceProvider(languageId: java.lang.String, provider: ReferenceProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerRenameProvider(languageId: java.lang.String, provider: RenameProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerSignatureHelpProvider(languageId: java.lang.String, provider: SignatureHelpProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def registerTypeDefinitionProvider(languageId: java.lang.String, provider: TypeDefinitionProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def setLanguageConfiguration(languageId: java.lang.String, configuration: LanguageConfiguration): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def setMonarchTokensProvider(languageId: java.lang.String, languageDef: IMonarchLanguage): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def setTokensProvider(languageId: java.lang.String, provider: EncodedTokensProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  def setTokensProvider(languageId: java.lang.String, provider: TokensProvider): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
  @js.native
  object CompletionItemInsertTextRule extends js.Object {
    /**
      * `insertText` is a snippet.
      */
    @js.native
    sealed trait InsertAsSnippet
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemInsertTextRule
    
    /**
      * Adjust whitespace/indentation of multiline insert texts to
      * match the current line indentation.
      */
    @js.native
    sealed trait KeepWhitespace
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemInsertTextRule
    
    /* 4 */ val InsertAsSnippet: InsertAsSnippet with scala.Double = js.native
    /* 1 */ val KeepWhitespace: KeepWhitespace with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemInsertTextRule with scala.Double
      ] = js.native
  }
  
  @js.native
  object CompletionItemKind extends js.Object {
    @js.native
    sealed trait Class
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Color
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Constant
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Constructor
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Customcolor
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Enum
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait EnumMember
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Event
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Field
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait File
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Folder
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Function
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Interface
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Keyword
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Method
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Module
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Operator
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Property
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Reference
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Snippet
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Struct
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Text
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait TypeParameter
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Unit
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Value
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    @js.native
    sealed trait Variable
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind
    
    /* 5 */ val Class: Class with scala.Double = js.native
    /* 19 */ val Color: Color with scala.Double = js.native
    /* 14 */ val Constant: Constant with scala.Double = js.native
    /* 2 */ val Constructor: Constructor with scala.Double = js.native
    /* 22 */ val Customcolor: Customcolor with scala.Double = js.native
    /* 15 */ val Enum: Enum with scala.Double = js.native
    /* 16 */ val EnumMember: EnumMember with scala.Double = js.native
    /* 10 */ val Event: Event with scala.Double = js.native
    /* 3 */ val Field: Field with scala.Double = js.native
    /* 20 */ val File: File with scala.Double = js.native
    /* 23 */ val Folder: Folder with scala.Double = js.native
    /* 1 */ val Function: Function with scala.Double = js.native
    /* 7 */ val Interface: Interface with scala.Double = js.native
    /* 17 */ val Keyword: Keyword with scala.Double = js.native
    /* 0 */ val Method: Method with scala.Double = js.native
    /* 8 */ val Module: Module with scala.Double = js.native
    /* 11 */ val Operator: Operator with scala.Double = js.native
    /* 9 */ val Property: Property with scala.Double = js.native
    /* 21 */ val Reference: Reference with scala.Double = js.native
    /* 25 */ val Snippet: Snippet with scala.Double = js.native
    /* 6 */ val Struct: Struct with scala.Double = js.native
    /* 18 */ val Text: Text with scala.Double = js.native
    /* 24 */ val TypeParameter: TypeParameter with scala.Double = js.native
    /* 12 */ val Unit: Unit with scala.Double = js.native
    /* 13 */ val Value: Value with scala.Double = js.native
    /* 4 */ val Variable: Variable with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionItemKind with scala.Double
      ] = js.native
  }
  
  @js.native
  object CompletionTriggerKind extends js.Object {
    @js.native
    sealed trait Invoke
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionTriggerKind
    
    @js.native
    sealed trait TriggerCharacter
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionTriggerKind
    
    @js.native
    sealed trait TriggerForIncompleteCompletions
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionTriggerKind
    
    /* 0 */ val Invoke: Invoke with scala.Double = js.native
    /* 1 */ val TriggerCharacter: TriggerCharacter with scala.Double = js.native
    /* 2 */ val TriggerForIncompleteCompletions: TriggerForIncompleteCompletions with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.languagesNs.CompletionTriggerKind with scala.Double
      ] = js.native
  }
  
  @js.native
  object DocumentHighlightKind extends js.Object {
    /**
      * Read-access of a symbol, like reading a variable.
      */
    @js.native
    sealed trait Read
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.DocumentHighlightKind
    
    /**
      * A textual occurrence.
      */
    @js.native
    sealed trait Text
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.DocumentHighlightKind
    
    /**
      * Write-access of a symbol, like writing to a variable.
      */
    @js.native
    sealed trait Write
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.DocumentHighlightKind
    
    /* 1 */ val Read: Read with scala.Double = js.native
    /* 0 */ val Text: Text with scala.Double = js.native
    /* 2 */ val Write: Write with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.languagesNs.DocumentHighlightKind with scala.Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object FoldingRangeKind extends js.Object {
    /**
      * Kind for folding range representing a comment. The value of the kind is 'comment'.
      */
    val Comment: monacoDashEditorLib.monacoDashEditorMod.languagesNs.FoldingRangeKind = js.native
    /**
      * Kind for folding range representing a import. The value of the kind is 'imports'.
      */
    val Imports: monacoDashEditorLib.monacoDashEditorMod.languagesNs.FoldingRangeKind = js.native
    /**
      * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
      * The value of the kind is 'region'.
      */
    val Region: monacoDashEditorLib.monacoDashEditorMod.languagesNs.FoldingRangeKind = js.native
  }
  
  @js.native
  object IndentAction extends js.Object {
    /**
      * Insert new line and indent once (relative to the previous line's indentation).
      */
    @js.native
    sealed trait Indent
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.IndentAction
    
    /**
      * Insert two new lines:
      *  - the first one indented which will hold the cursor
      *  - the second one at the same indentation level
      */
    @js.native
    sealed trait IndentOutdent
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.IndentAction
    
    /**
      * Insert new line and copy the previous line's indentation.
      */
    @js.native
    sealed trait None
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.IndentAction
    
    /**
      * Insert new line and outdent once (relative to the previous line's indentation).
      */
    @js.native
    sealed trait Outdent
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.IndentAction
    
    /* 1 */ val Indent: Indent with scala.Double = js.native
    /* 2 */ val IndentOutdent: IndentOutdent with scala.Double = js.native
    /* 0 */ val None: None with scala.Double = js.native
    /* 3 */ val Outdent: Outdent with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.languagesNs.IndentAction with scala.Double
      ] = js.native
  }
  
  @js.native
  object SignatureHelpTriggerReason extends js.Object {
    @js.native
    sealed trait ContentChange
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SignatureHelpTriggerReason
    
    @js.native
    sealed trait Invoke
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SignatureHelpTriggerReason
    
    @js.native
    sealed trait TriggerCharacter
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SignatureHelpTriggerReason
    
    /* 3 */ val ContentChange: ContentChange with scala.Double = js.native
    /* 1 */ val Invoke: Invoke with scala.Double = js.native
    /* 2 */ val TriggerCharacter: TriggerCharacter with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        monacoDashEditorLib.monacoDashEditorMod.languagesNs.SignatureHelpTriggerReason with scala.Double
      ] = js.native
  }
  
  @js.native
  object SymbolKind extends js.Object {
    @js.native
    sealed trait Array
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Boolean
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Class
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Constant
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Constructor
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Enum
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait EnumMember
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Event
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Field
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait File
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Function
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Interface
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Key
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Method
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Module
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Namespace
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Null
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Number
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Object
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Operator
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Package
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Property
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait String
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Struct
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait TypeParameter
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    @js.native
    sealed trait Variable
      extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind
    
    /* 17 */ val Array: Array with scala.Double = js.native
    /* 16 */ val Boolean: Boolean with scala.Double = js.native
    /* 4 */ val Class: Class with scala.Double = js.native
    /* 13 */ val Constant: Constant with scala.Double = js.native
    /* 8 */ val Constructor: Constructor with scala.Double = js.native
    /* 9 */ val Enum: Enum with scala.Double = js.native
    /* 21 */ val EnumMember: EnumMember with scala.Double = js.native
    /* 23 */ val Event: Event with scala.Double = js.native
    /* 7 */ val Field: Field with scala.Double = js.native
    /* 0 */ val File: File with scala.Double = js.native
    /* 11 */ val Function: Function with scala.Double = js.native
    /* 10 */ val Interface: Interface with scala.Double = js.native
    /* 19 */ val Key: Key with scala.Double = js.native
    /* 5 */ val Method: Method with scala.Double = js.native
    /* 1 */ val Module: Module with scala.Double = js.native
    /* 2 */ val Namespace: Namespace with scala.Double = js.native
    /* 20 */ val Null: Null with scala.Double = js.native
    /* 15 */ val Number: Number with scala.Double = js.native
    /* 18 */ val Object: Object with scala.Double = js.native
    /* 24 */ val Operator: Operator with scala.Double = js.native
    /* 3 */ val Package: Package with scala.Double = js.native
    /* 6 */ val Property: Property with scala.Double = js.native
    /* 14 */ val String: String with scala.Double = js.native
    /* 22 */ val Struct: Struct with scala.Double = js.native
    /* 25 */ val TypeParameter: TypeParameter with scala.Double = js.native
    /* 12 */ val Variable: Variable with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.languagesNs.SymbolKind with scala.Double] = js.native
  }
  
  @JSName("css")
  @js.native
  object cssNs extends js.Object {
    trait DiagnosticsOptions extends js.Object {
      val lint: js.UndefOr[monacoDashEditorLib.Anon_ArgumentsInColorFunction] = js.undefined
      val validate: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      val diagnosticsOptions: DiagnosticsOptions = js.native
      def onDidChange(listener: js.Function1[/* e */ this.type, _]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def onDidChange(listener: js.Function1[/* e */ this.type, _], thisArg: js.Any): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def setDiagnosticsOptions(options: DiagnosticsOptions): scala.Unit = js.native
    }
    
    var cssDefaults: LanguageServiceDefaults = js.native
    var lessDefaults: LanguageServiceDefaults = js.native
    var scssDefaults: LanguageServiceDefaults = js.native
  }
  
  @JSName("html")
  @js.native
  object htmlNs extends js.Object {
    trait CompletionConfiguration
      extends /* provider */ org.scalablytyped.runtime.StringDictionary[scala.Boolean]
    
    trait HTMLFormatConfiguration extends js.Object {
      val contentUnformatted: java.lang.String
      val endWithNewline: scala.Boolean
      val extraLiners: java.lang.String
      val indentHandlebars: scala.Boolean
      val indentInnerHtml: scala.Boolean
      val insertSpaces: scala.Boolean
      val maxPreserveNewLines: scala.Double
      val preserveNewLines: scala.Boolean
      val tabSize: scala.Double
      val unformatted: java.lang.String
      val wrapAttributes: monacoDashEditorLib.monacoDashEditorLibStrings.auto | monacoDashEditorLib.monacoDashEditorLibStrings.force | monacoDashEditorLib.monacoDashEditorLibStrings.`force-aligned` | monacoDashEditorLib.monacoDashEditorLibStrings.`force-expand-multiline`
      val wrapLineLength: scala.Double
    }
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      val options: Options = js.native
      def onDidChange(listener: js.Function1[/* e */ this.type, _]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def onDidChange(listener: js.Function1[/* e */ this.type, _], thisArg: js.Any): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def setOptions(options: Options): scala.Unit = js.native
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
    
    var handlebarDefaults: LanguageServiceDefaults = js.native
    var htmlDefaults: LanguageServiceDefaults = js.native
    var razorDefaults: LanguageServiceDefaults = js.native
  }
  
  @JSName("json")
  @js.native
  object jsonNs extends js.Object {
    trait DiagnosticsOptions extends js.Object {
      /**
        * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
        */
      val allowComments: js.UndefOr[scala.Boolean] = js.undefined
      /**
        *  If set, the schema service would load schema content on-demand with 'fetch' if available
        */
      val enableSchemaRequest: js.UndefOr[scala.Boolean] = js.undefined
      /**
        * A list of known schemas and/or associations of schemas to file names.
        */
      val schemas: js.UndefOr[js.Array[monacoDashEditorLib.Anon_FileMatch]] = js.undefined
      /**
        * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
        */
      val validate: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    @js.native
    trait LanguageServiceDefaults extends js.Object {
      val diagnosticsOptions: DiagnosticsOptions = js.native
      def onDidChange(listener: js.Function1[/* e */ this.type, _]): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def onDidChange(listener: js.Function1[/* e */ this.type, _], thisArg: js.Any): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def setDiagnosticsOptions(options: DiagnosticsOptions): scala.Unit = js.native
    }
    
    var jsonDefaults: LanguageServiceDefaults = js.native
  }
  
  @JSName("typescript")
  @js.native
  object typescriptNs extends js.Object {
    trait CompilerOptions
      extends /* option */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[CompilerOptionsValue]] {
      var allowJs: js.UndefOr[scala.Boolean] = js.undefined
      var allowSyntheticDefaultImports: js.UndefOr[scala.Boolean] = js.undefined
      var allowUnreachableCode: js.UndefOr[scala.Boolean] = js.undefined
      var allowUnusedLabels: js.UndefOr[scala.Boolean] = js.undefined
      var alwaysStrict: js.UndefOr[scala.Boolean] = js.undefined
      var baseUrl: js.UndefOr[java.lang.String] = js.undefined
      var charset: js.UndefOr[java.lang.String] = js.undefined
      var checkJs: js.UndefOr[scala.Boolean] = js.undefined
      var composite: js.UndefOr[scala.Boolean] = js.undefined
      var declaration: js.UndefOr[scala.Boolean] = js.undefined
      var declarationDir: js.UndefOr[java.lang.String] = js.undefined
      var declarationMap: js.UndefOr[scala.Boolean] = js.undefined
      var disableSizeLimit: js.UndefOr[scala.Boolean] = js.undefined
      var downlevelIteration: js.UndefOr[scala.Boolean] = js.undefined
      var emitBOM: js.UndefOr[scala.Boolean] = js.undefined
      var emitDeclarationOnly: js.UndefOr[scala.Boolean] = js.undefined
      var emitDecoratorMetadata: js.UndefOr[scala.Boolean] = js.undefined
      var esModuleInterop: js.UndefOr[scala.Boolean] = js.undefined
      var experimentalDecorators: js.UndefOr[scala.Boolean] = js.undefined
      var forceConsistentCasingInFileNames: js.UndefOr[scala.Boolean] = js.undefined
      var importHelpers: js.UndefOr[scala.Boolean] = js.undefined
      var inlineSourceMap: js.UndefOr[scala.Boolean] = js.undefined
      var inlineSources: js.UndefOr[scala.Boolean] = js.undefined
      var isolatedModules: js.UndefOr[scala.Boolean] = js.undefined
      var jsx: js.UndefOr[JsxEmit] = js.undefined
      var jsxFactory: js.UndefOr[java.lang.String] = js.undefined
      var keyofStringsOnly: js.UndefOr[scala.Boolean] = js.undefined
      var lib: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var locale: js.UndefOr[java.lang.String] = js.undefined
      var mapRoot: js.UndefOr[java.lang.String] = js.undefined
      var maxNodeModuleJsDepth: js.UndefOr[scala.Double] = js.undefined
      var module: js.UndefOr[ModuleKind] = js.undefined
      var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.undefined
      var newLine: js.UndefOr[NewLineKind] = js.undefined
      var noEmit: js.UndefOr[scala.Boolean] = js.undefined
      var noEmitHelpers: js.UndefOr[scala.Boolean] = js.undefined
      var noEmitOnError: js.UndefOr[scala.Boolean] = js.undefined
      var noErrorTruncation: js.UndefOr[scala.Boolean] = js.undefined
      var noFallthroughCasesInSwitch: js.UndefOr[scala.Boolean] = js.undefined
      var noImplicitAny: js.UndefOr[scala.Boolean] = js.undefined
      var noImplicitReturns: js.UndefOr[scala.Boolean] = js.undefined
      var noImplicitThis: js.UndefOr[scala.Boolean] = js.undefined
      var noImplicitUseStrict: js.UndefOr[scala.Boolean] = js.undefined
      var noLib: js.UndefOr[scala.Boolean] = js.undefined
      var noResolve: js.UndefOr[scala.Boolean] = js.undefined
      var noStrictGenericChecks: js.UndefOr[scala.Boolean] = js.undefined
      var noUnusedLocals: js.UndefOr[scala.Boolean] = js.undefined
      var noUnusedParameters: js.UndefOr[scala.Boolean] = js.undefined
      var out: js.UndefOr[java.lang.String] = js.undefined
      var outDir: js.UndefOr[java.lang.String] = js.undefined
      var outFile: js.UndefOr[java.lang.String] = js.undefined
      var paths: js.UndefOr[MapLike[js.Array[java.lang.String]]] = js.undefined
      var preserveConstEnums: js.UndefOr[scala.Boolean] = js.undefined
      var preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
      var project: js.UndefOr[java.lang.String] = js.undefined
      var reactNamespace: js.UndefOr[java.lang.String] = js.undefined
      var removeComments: js.UndefOr[scala.Boolean] = js.undefined
      var resolveJsonModule: js.UndefOr[scala.Boolean] = js.undefined
      var rootDir: js.UndefOr[java.lang.String] = js.undefined
      var rootDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var skipDefaultLibCheck: js.UndefOr[scala.Boolean] = js.undefined
      var skipLibCheck: js.UndefOr[scala.Boolean] = js.undefined
      var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
      var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
      var strict: js.UndefOr[scala.Boolean] = js.undefined
      var strictFunctionTypes: js.UndefOr[scala.Boolean] = js.undefined
      var strictNullChecks: js.UndefOr[scala.Boolean] = js.undefined
      var strictPropertyInitialization: js.UndefOr[scala.Boolean] = js.undefined
      var suppressExcessPropertyErrors: js.UndefOr[scala.Boolean] = js.undefined
      var suppressImplicitAnyIndexErrors: js.UndefOr[scala.Boolean] = js.undefined
      var target: js.UndefOr[ScriptTarget] = js.undefined
      var traceResolution: js.UndefOr[scala.Boolean] = js.undefined
      /** Paths used to compute primary types search locations */
      var typeRoots: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    }
    
    trait DiagnosticsOptions extends js.Object {
      var noSemanticValidation: js.UndefOr[scala.Boolean] = js.undefined
      var noSyntaxValidation: js.UndefOr[scala.Boolean] = js.undefined
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
      def addExtraLib(content: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      def addExtraLib(content: java.lang.String, filePath: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.IDisposable = js.native
      /**
        * Set TypeScript compiler options.
        */
      def setCompilerOptions(options: CompilerOptions): scala.Unit = js.native
      /**
        * Configure whether syntactic and/or semantic validation should
        * be performed
        */
      def setDiagnosticsOptions(options: DiagnosticsOptions): scala.Unit = js.native
      /**
        * Configure if all existing models should be eagerly sync'd
        * to the worker on start or restart.
        */
      def setEagerModelSync(value: scala.Boolean): scala.Unit = js.native
      /**
        * Configure when the worker shuts down. By default that is 2mins.
        *
        * @param value The maximum idle time in milliseconds. Values less than one
        * mean never shut down.
        */
      def setMaximumWorkerIdleTime(value: scala.Double): scala.Unit = js.native
    }
    
    trait MapLike[T]
      extends /* index */ org.scalablytyped.runtime.StringDictionary[T]
    
    @js.native
    sealed trait ModuleKind extends js.Object
    
    @js.native
    sealed trait ModuleResolutionKind extends js.Object
    
    @js.native
    sealed trait NewLineKind extends js.Object
    
    @js.native
    sealed trait ScriptTarget extends js.Object
    
    var getJavaScriptWorker: js.Function0[monacoDashEditorLib.monacoDashEditorMod.Promise[js.Any]] = js.native
    var getTypeScriptWorker: js.Function0[monacoDashEditorLib.monacoDashEditorMod.Promise[js.Any]] = js.native
    var javascriptDefaults: LanguageServiceDefaults = js.native
    var typescriptDefaults: LanguageServiceDefaults = js.native
    @js.native
    object JsxEmit extends js.Object {
      @js.native
      sealed trait None
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit
      
      @js.native
      sealed trait Preserve
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit
      
      @js.native
      sealed trait React
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit
      
      @js.native
      sealed trait ReactNative
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit
      
      /* 0 */ val None: None with scala.Double = js.native
      /* 1 */ val Preserve: Preserve with scala.Double = js.native
      /* 2 */ val React: React with scala.Double = js.native
      /* 3 */ val ReactNative: ReactNative with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.JsxEmit with scala.Double
          ] = js.native
    }
    
    @js.native
    object ModuleKind extends js.Object {
      @js.native
      sealed trait AMD
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      @js.native
      sealed trait CommonJS
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      @js.native
      sealed trait ES2015
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      @js.native
      sealed trait ESNext
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      @js.native
      sealed trait None
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      @js.native
      sealed trait System
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      @js.native
      sealed trait UMD
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind
      
      /* 2 */ val AMD: AMD with scala.Double = js.native
      /* 1 */ val CommonJS: CommonJS with scala.Double = js.native
      /* 5 */ val ES2015: ES2015 with scala.Double = js.native
      /* 6 */ val ESNext: ESNext with scala.Double = js.native
      /* 0 */ val None: None with scala.Double = js.native
      /* 4 */ val System: System with scala.Double = js.native
      /* 3 */ val UMD: UMD with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleKind with scala.Double
          ] = js.native
    }
    
    @js.native
    object ModuleResolutionKind extends js.Object {
      @js.native
      sealed trait Classic
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleResolutionKind
      
      @js.native
      sealed trait NodeJs
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleResolutionKind
      
      /* 1 */ val Classic: Classic with scala.Double = js.native
      /* 2 */ val NodeJs: NodeJs with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ModuleResolutionKind with scala.Double
          ] = js.native
    }
    
    @js.native
    object NewLineKind extends js.Object {
      @js.native
      sealed trait CarriageReturnLineFeed
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.NewLineKind
      
      @js.native
      sealed trait LineFeed
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.NewLineKind
      
      /* 0 */ val CarriageReturnLineFeed: CarriageReturnLineFeed with scala.Double = js.native
      /* 1 */ val LineFeed: LineFeed with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.NewLineKind with scala.Double
          ] = js.native
    }
    
    @js.native
    object ScriptTarget extends js.Object {
      @js.native
      sealed trait ES2015
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait ES2016
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait ES2017
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait ES2018
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait ES3
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait ES5
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait ESNext
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait JSON
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      @js.native
      sealed trait Latest
        extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget
      
      /* 2 */ val ES2015: ES2015 with scala.Double = js.native
      /* 3 */ val ES2016: ES2016 with scala.Double = js.native
      /* 4 */ val ES2017: ES2017 with scala.Double = js.native
      /* 5 */ val ES2018: ES2018 with scala.Double = js.native
      /* 0 */ val ES3: ES3 with scala.Double = js.native
      /* 1 */ val ES5: ES5 with scala.Double = js.native
      /* 6 */ val ESNext: ESNext with scala.Double = js.native
      /* 100 */ val JSON: JSON with scala.Double = js.native
      /* 6 */ val Latest: Latest with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            monacoDashEditorLib.monacoDashEditorMod.languagesNs.typescriptNs.ScriptTarget with scala.Double
          ] = js.native
    }
    
    type CompilerOptionsValue = js.UndefOr[
        java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double]) | js.Array[java.lang.String] | MapLike[js.Array[java.lang.String]] | scala.Null
      ]
  }
  
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type Definition = Location | js.Array[Location]
  type IMonarchLanguageAction = IShortMonarchLanguageAction | IExpandedMonarchLanguageAction | js.Array[IShortMonarchLanguageAction] | js.Array[IExpandedMonarchLanguageAction]
  type IMonarchLanguageRule = IShortMonarchLanguageRule1 | IShortMonarchLanguageRule2 | IExpandedMonarchLanguageRule
  type IShortMonarchLanguageAction = java.lang.String
  type IShortMonarchLanguageRule1 = js.Tuple2[stdLib.RegExp, IMonarchLanguageAction]
  type IShortMonarchLanguageRule2 = js.Tuple3[stdLib.RegExp, IMonarchLanguageAction, java.lang.String]
  type ProviderResult[T] = js.UndefOr[
    T | scala.Null | (monacoDashEditorLib.monacoDashEditorMod.Thenable[js.UndefOr[T | scala.Null]])
  ]
  type TextEdit = monacoDashEditorLib.Anon_Eol | monacoDashEditorLib.Anon_EolRange
}

