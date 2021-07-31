package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeScriptWorker extends StObject {
  
  /**
    * Get other occurrences which should be updated when renaming the item at the given file and position.
    * @returns `Promise<readonly typescript.RenameLocation[] | undefined>`
    */
  def findRenameLocations(
    fileName: String,
    positon: Double,
    findInStrings: Boolean,
    findInComments: Boolean,
    providePrefixAndSuffixTextForRename: Boolean
  ): js.Promise[js.UndefOr[js.Array[js.Any]]]
  
  /**
    * Get possible code fixes at the given position in the file.
    * @param formatOptions `typescript.FormatCodeOptions`
    * @returns `Promise<ReadonlyArray<typescript.CodeFixAction>>`
    */
  def getCodeFixesAtPosition(fileName: String, start: Double, end: Double, errorCodes: js.Array[Double], formatOptions: js.Any): js.Promise[js.Array[js.Any]]
  
  /**
    * Get diagnostic messages related to the current compiler options.
    * @param fileName Not used
    */
  def getCompilerOptionsDiagnostics(fileName: String): js.Promise[js.Array[Diagnostic]]
  
  /**
    * Get code completion details for the given file, position, and entry.
    * @returns `Promise<typescript.CompletionEntryDetails | undefined>`
    */
  def getCompletionEntryDetails(fileName: String, position: Double, entry: String): js.Promise[js.UndefOr[js.Any]]
  
  /**
    * Get code completions for the given file and position.
    * @returns `Promise<typescript.CompletionInfo | undefined>`
    */
  def getCompletionsAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Any]]
  
  /**
    * Get the definition of the item at the given position in the file.
    * @returns `Promise<ReadonlyArray<typescript.DefinitionInfo> | undefined>`
    */
  def getDefinitionAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Array[js.Any]]]
  
  /**
    * Get transpiled output for the given file.
    * @returns `typescript.EmitOutput`
    */
  def getEmitOutput(fileName: String): js.Promise[EmitOutput]
  
  /**
    * Get formatting changes which should be applied after the given keystroke.
    * @param options `typescript.FormatCodeOptions`
    * @returns `Promise<typescript.TextChange[]>`
    */
  def getFormattingEditsAfterKeystroke(fileName: String, postion: Double, ch: String, options: js.Any): js.Promise[js.Array[js.Any]]
  
  /**
    * Get changes which should be applied to format the given file.
    * @param options `typescript.FormatCodeOptions`
    * @returns `Promise<typescript.TextChange[]>`
    */
  def getFormattingEditsForDocument(fileName: String, options: js.Any): js.Promise[js.Array[js.Any]]
  
  /**
    * Get changes which should be applied to format the given range in the file.
    * @param options `typescript.FormatCodeOptions`
    * @returns `Promise<typescript.TextChange[]>`
    */
  def getFormattingEditsForRange(fileName: String, start: Double, end: Double, options: js.Any): js.Promise[js.Array[js.Any]]
  
  /**
    * Get outline entries for the item at the given position in the file.
    * @returns `Promise<typescript.NavigationBarItem[]>`
    */
  def getNavigationBarItems(fileName: String): js.Promise[js.Array[js.Any]]
  
  /**
    * Get other ranges which are related to the item at the given position in the file (often used for highlighting).
    * @returns `Promise<ReadonlyArray<typescript.ReferenceEntry> | undefined>`
    */
  def getOccurrencesAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Array[js.Any]]]
  
  /**
    * Get quick info for the item at the given position in the file.
    * @returns `Promise<typescript.QuickInfo | undefined>`
    */
  def getQuickInfoAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Any]]
  
  /**
    * Get references to the item at the given position in the file.
    * @returns `Promise<typescript.ReferenceEntry[] | undefined>`
    */
  def getReferencesAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Array[js.Any]]]
  
  /**
    * Get edits which should be applied to rename the item at the given file and position (or a failure reason).
    * @param options `typescript.RenameInfoOptions`
    * @returns `Promise<typescript.RenameInfo>`
    */
  def getRenameInfo(fileName: String, positon: Double, options: js.Any): js.Promise[js.Any]
  
  /**
    * Get the content of a given file.
    */
  def getScriptText(fileName: String): js.Promise[js.UndefOr[String]]
  
  /**
    * Get diagnostic messages for any semantic issues in the given file.
    */
  def getSemanticDiagnostics(fileName: String): js.Promise[js.Array[Diagnostic]]
  
  /**
    * Get signature help items for the item at the given file and position.
    * @returns `Promise<typescript.SignatureHelpItems | undefined>`
    */
  def getSignatureHelpItems(fileName: String, position: Double): js.Promise[js.UndefOr[js.Any]]
  
  /**
    * Get diagnostic messages for any suggestions related to the given file.
    */
  def getSuggestionDiagnostics(fileName: String): js.Promise[js.Array[Diagnostic]]
  
  /**
    * Get diagnostic messages for any syntax issues in the given file.
    */
  def getSyntacticDiagnostics(fileName: String): js.Promise[js.Array[Diagnostic]]
}
object TypeScriptWorker {
  
  @scala.inline
  def apply(
    findRenameLocations: (String, Double, Boolean, Boolean, Boolean) => js.Promise[js.UndefOr[js.Array[js.Any]]],
    getCodeFixesAtPosition: (String, Double, Double, js.Array[Double], js.Any) => js.Promise[js.Array[js.Any]],
    getCompilerOptionsDiagnostics: String => js.Promise[js.Array[Diagnostic]],
    getCompletionEntryDetails: (String, Double, String) => js.Promise[js.UndefOr[js.Any]],
    getCompletionsAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Any]],
    getDefinitionAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Array[js.Any]]],
    getEmitOutput: String => js.Promise[EmitOutput],
    getFormattingEditsAfterKeystroke: (String, Double, String, js.Any) => js.Promise[js.Array[js.Any]],
    getFormattingEditsForDocument: (String, js.Any) => js.Promise[js.Array[js.Any]],
    getFormattingEditsForRange: (String, Double, Double, js.Any) => js.Promise[js.Array[js.Any]],
    getNavigationBarItems: String => js.Promise[js.Array[js.Any]],
    getOccurrencesAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Array[js.Any]]],
    getQuickInfoAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Any]],
    getReferencesAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Array[js.Any]]],
    getRenameInfo: (String, Double, js.Any) => js.Promise[js.Any],
    getScriptText: String => js.Promise[js.UndefOr[String]],
    getSemanticDiagnostics: String => js.Promise[js.Array[Diagnostic]],
    getSignatureHelpItems: (String, Double) => js.Promise[js.UndefOr[js.Any]],
    getSuggestionDiagnostics: String => js.Promise[js.Array[Diagnostic]],
    getSyntacticDiagnostics: String => js.Promise[js.Array[Diagnostic]]
  ): TypeScriptWorker = {
    val __obj = js.Dynamic.literal(findRenameLocations = js.Any.fromFunction5(findRenameLocations), getCodeFixesAtPosition = js.Any.fromFunction5(getCodeFixesAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction1(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction2(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction2(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getNavigationBarItems = js.Any.fromFunction1(getNavigationBarItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getQuickInfoAtPosition = js.Any.fromFunction2(getQuickInfoAtPosition), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getRenameInfo = js.Any.fromFunction3(getRenameInfo), getScriptText = js.Any.fromFunction1(getScriptText), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureHelpItems = js.Any.fromFunction2(getSignatureHelpItems), getSuggestionDiagnostics = js.Any.fromFunction1(getSuggestionDiagnostics), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics))
    __obj.asInstanceOf[TypeScriptWorker]
  }
  
  @scala.inline
  implicit class TypeScriptWorkerMutableBuilder[Self <: TypeScriptWorker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindRenameLocations(value: (String, Double, Boolean, Boolean, Boolean) => js.Promise[js.UndefOr[js.Array[js.Any]]]): Self = StObject.set(x, "findRenameLocations", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetCodeFixesAtPosition(value: (String, Double, Double, js.Array[Double], js.Any) => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "getCodeFixesAtPosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetCompilerOptionsDiagnostics(value: String => js.Promise[js.Array[Diagnostic]]): Self = StObject.set(x, "getCompilerOptionsDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCompletionEntryDetails(value: (String, Double, String) => js.Promise[js.UndefOr[js.Any]]): Self = StObject.set(x, "getCompletionEntryDetails", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCompletionsAtPosition(value: (String, Double) => js.Promise[js.UndefOr[js.Any]]): Self = StObject.set(x, "getCompletionsAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDefinitionAtPosition(value: (String, Double) => js.Promise[js.UndefOr[js.Array[js.Any]]]): Self = StObject.set(x, "getDefinitionAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEmitOutput(value: String => js.Promise[EmitOutput]): Self = StObject.set(x, "getEmitOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormattingEditsAfterKeystroke(value: (String, Double, String, js.Any) => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "getFormattingEditsAfterKeystroke", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsForDocument(value: (String, js.Any) => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "getFormattingEditsForDocument", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFormattingEditsForRange(value: (String, Double, Double, js.Any) => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "getFormattingEditsForRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetNavigationBarItems(value: String => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "getNavigationBarItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOccurrencesAtPosition(value: (String, Double) => js.Promise[js.UndefOr[js.Array[js.Any]]]): Self = StObject.set(x, "getOccurrencesAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetQuickInfoAtPosition(value: (String, Double) => js.Promise[js.UndefOr[js.Any]]): Self = StObject.set(x, "getQuickInfoAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetReferencesAtPosition(value: (String, Double) => js.Promise[js.UndefOr[js.Array[js.Any]]]): Self = StObject.set(x, "getReferencesAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRenameInfo(value: (String, Double, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "getRenameInfo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetScriptText(value: String => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "getScriptText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSemanticDiagnostics(value: String => js.Promise[js.Array[Diagnostic]]): Self = StObject.set(x, "getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSignatureHelpItems(value: (String, Double) => js.Promise[js.UndefOr[js.Any]]): Self = StObject.set(x, "getSignatureHelpItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSuggestionDiagnostics(value: String => js.Promise[js.Array[Diagnostic]]): Self = StObject.set(x, "getSuggestionDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSyntacticDiagnostics(value: String => js.Promise[js.Array[Diagnostic]]): Self = StObject.set(x, "getSyntacticDiagnostics", js.Any.fromFunction1(value))
  }
}
