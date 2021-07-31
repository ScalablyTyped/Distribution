package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def getEncodedLanguageId(languageId: java.lang.String): scala.Double = typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("getEncodedLanguageId")(languageId.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

@scala.inline
def getLanguages(): js.Array[typings.monacoEditor.mod.languages.ILanguageExtensionPoint] = typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Array[typings.monacoEditor.mod.languages.ILanguageExtensionPoint]]

@scala.inline
def onLanguage(languageId: java.lang.String, callback: js.Function0[scala.Unit]): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("onLanguage")(languageId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def register(language: typings.monacoEditor.mod.languages.ILanguageExtensionPoint): scala.Unit = typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("register")(language.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def registerCodeActionProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.CodeActionProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerCodeLensProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.CodeLensProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerColorProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.DocumentColorProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerCompletionItemProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.CompletionItemProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDeclarationProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.DeclarationProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDefinitionProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.DefinitionProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDocumentFormattingEditProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.languages.DocumentFormattingEditProvider
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDocumentHighlightProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.languages.DocumentHighlightProvider
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDocumentRangeFormattingEditProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.languages.DocumentRangeFormattingEditProvider
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDocumentRangeSemanticTokensProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.languages.DocumentRangeSemanticTokensProvider
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDocumentSemanticTokensProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.languages.DocumentSemanticTokensProvider
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerDocumentSymbolProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.DocumentSymbolProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerFoldingRangeProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.FoldingRangeProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerHoverProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.HoverProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerImplementationProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.ImplementationProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerLinkProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.LinkProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerOnTypeFormattingEditProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.languages.OnTypeFormattingEditProvider
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerOnTypeRenameProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.OnTypeRenameProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeRenameProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerReferenceProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.ReferenceProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerRenameProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.RenameProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerSelectionRangeProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.SelectionRangeProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerSignatureHelpProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.SignatureHelpProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def registerTypeDefinitionProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.TypeDefinitionProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def setLanguageConfiguration(
  languageId: java.lang.String,
  configuration: typings.monacoEditor.mod.languages.LanguageConfiguration
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(languageId.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def setMonarchTokensProvider(
  languageId: java.lang.String,
  languageDef: typings.monacoEditor.mod.Thenable[typings.monacoEditor.mod.languages.IMonarchLanguage]
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]
@scala.inline
def setMonarchTokensProvider(languageId: java.lang.String, languageDef: typings.monacoEditor.mod.languages.IMonarchLanguage): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

@scala.inline
def setTokensProvider(
  languageId: java.lang.String,
  provider: typings.monacoEditor.mod.Thenable[
  typings.monacoEditor.mod.languages.TokensProvider | typings.monacoEditor.mod.languages.EncodedTokensProvider
]
): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]
@scala.inline
def setTokensProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.EncodedTokensProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]
@scala.inline
def setTokensProvider(languageId: java.lang.String, provider: typings.monacoEditor.mod.languages.TokensProvider): typings.monacoEditor.mod.IDisposable = (typings.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.IDisposable]

type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]

type Definition = typings.monacoEditor.mod.languages.Location | (js.Array[
typings.monacoEditor.mod.languages.Location | typings.monacoEditor.mod.languages.LocationLink])

type IMonarchLanguageAction = typings.monacoEditor.mod.languages.IShortMonarchLanguageAction | typings.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | (js.Array[
typings.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | typings.monacoEditor.mod.languages.IShortMonarchLanguageAction])

type IMonarchLanguageRule = typings.monacoEditor.mod.languages.IShortMonarchLanguageRule1 | typings.monacoEditor.mod.languages.IShortMonarchLanguageRule2 | typings.monacoEditor.mod.languages.IExpandedMonarchLanguageRule

type IShortMonarchLanguageAction = java.lang.String

type IShortMonarchLanguageRule1 = js.Tuple2[
java.lang.String | typings.std.RegExp, 
typings.monacoEditor.mod.languages.IMonarchLanguageAction]

type IShortMonarchLanguageRule2 = js.Tuple3[
java.lang.String | typings.std.RegExp, 
typings.monacoEditor.mod.languages.IMonarchLanguageAction, 
java.lang.String]

type ProviderResult[T] = js.UndefOr[T | scala.Null | (typings.monacoEditor.mod.Thenable[js.UndefOr[T | scala.Null]])]
