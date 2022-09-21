package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.Thenable
import typings.monacoEditor.mod.languages.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getEncodedLanguageId(languageId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodedLanguageId")(languageId.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getLanguages(): js.Array[ILanguageExtensionPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Array[ILanguageExtensionPoint]]

inline def onLanguage(languageId: String, callback: js.Function0[Unit]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("onLanguage")(languageId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def register(language: ILanguageExtensionPoint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerCodeActionProvider(languageSelector: LanguageSelector, provider: CodeActionProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
inline def registerCodeActionProvider(
  languageSelector: LanguageSelector,
  provider: CodeActionProvider,
  metadata: CodeActionProviderMetadata
): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerCodeLensProvider(languageSelector: LanguageSelector, provider: CodeLensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerColorProvider(languageSelector: LanguageSelector, provider: DocumentColorProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerCompletionItemProvider(languageSelector: LanguageSelector, provider: CompletionItemProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDeclarationProvider(languageSelector: LanguageSelector, provider: DeclarationProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDefinitionProvider(languageSelector: LanguageSelector, provider: DefinitionProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDocumentFormattingEditProvider(languageSelector: LanguageSelector, provider: DocumentFormattingEditProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDocumentHighlightProvider(languageSelector: LanguageSelector, provider: DocumentHighlightProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDocumentRangeFormattingEditProvider(languageSelector: LanguageSelector, provider: DocumentRangeFormattingEditProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDocumentRangeSemanticTokensProvider(languageSelector: LanguageSelector, provider: DocumentRangeSemanticTokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDocumentSemanticTokensProvider(languageSelector: LanguageSelector, provider: DocumentSemanticTokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerDocumentSymbolProvider(languageSelector: LanguageSelector, provider: DocumentSymbolProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerFoldingRangeProvider(languageSelector: LanguageSelector, provider: FoldingRangeProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerHoverProvider(languageSelector: LanguageSelector, provider: HoverProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerImplementationProvider(languageSelector: LanguageSelector, provider: ImplementationProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerInlayHintsProvider(languageSelector: LanguageSelector, provider: InlayHintsProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlayHintsProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerInlineCompletionsProvider(
  languageSelector: LanguageSelector,
  provider: InlineCompletionsProvider[InlineCompletions[InlineCompletion]]
): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineCompletionsProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerLinkProvider(languageSelector: LanguageSelector, provider: LinkProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerLinkedEditingRangeProvider(languageSelector: LanguageSelector, provider: LinkedEditingRangeProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkedEditingRangeProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerOnTypeFormattingEditProvider(languageSelector: LanguageSelector, provider: OnTypeFormattingEditProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerReferenceProvider(languageSelector: LanguageSelector, provider: ReferenceProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerRenameProvider(languageSelector: LanguageSelector, provider: RenameProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerSelectionRangeProvider(languageSelector: LanguageSelector, provider: SelectionRangeProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerSignatureHelpProvider(languageSelector: LanguageSelector, provider: SignatureHelpProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerTokensProviderFactory(languageId: String, factory: TokensProviderFactory): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTokensProviderFactory")(languageId.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def registerTypeDefinitionProvider(languageSelector: LanguageSelector, provider: TypeDefinitionProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def setColorMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setColorMap")().asInstanceOf[Unit]
inline def setColorMap(colorMap: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setColorMap")(colorMap.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLanguageConfiguration(languageId: String, configuration: LanguageConfiguration): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(languageId.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def setMonarchTokensProvider(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
inline def setMonarchTokensProvider(languageId: String, languageDef: IMonarchLanguage): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

inline def setTokensProvider(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
inline def setTokensProvider(languageId: String, provider: EncodedTokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
inline def setTokensProvider(languageId: String, provider: TokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]

type CharacterPair = js.Tuple2[String, String]

type Definition = Location | (js.Array[Location | LocationLink])

type IMonarchLanguageAction = IShortMonarchLanguageAction | IExpandedMonarchLanguageAction | (js.Array[IExpandedMonarchLanguageAction | IShortMonarchLanguageAction])

type IMonarchLanguageRule = IShortMonarchLanguageRule1 | IShortMonarchLanguageRule2 | IExpandedMonarchLanguageRule

type IShortMonarchLanguageAction = String

type IShortMonarchLanguageRule1 = js.Tuple2[String | js.RegExp, IMonarchLanguageAction]

type IShortMonarchLanguageRule2 = js.Tuple3[String | js.RegExp, IMonarchLanguageAction, String]

type LanguageSelector = String | LanguageFilter | (js.Array[String | LanguageFilter])

type ProviderResult[T] = js.UndefOr[T | Null | (Thenable[js.UndefOr[T | Null]])]
