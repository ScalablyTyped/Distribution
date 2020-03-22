package typings.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptWorker extends js.Object {
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
  ): js.Promise[js.UndefOr[js.Array[_]]]
  /**
    * Get possible code fixes at the given position in the file.
    * @param formatOptions `typescript.FormatCodeOptions`
    * @returns `Promise<ReadonlyArray<typescript.CodeFixAction>>`
    */
  def getCodeFixesAtPosition(fileName: String, start: Double, end: Double, errorCodes: js.Array[Double], formatOptions: js.Any): js.Promise[js.Array[_]]
  /**
    * Get diagnostic messages related to the current compiler options.
    * @param fileName Not used
    */
  def getCompilerOptionsDiagnostics(fileName: String): js.Promise[js.Array[Diagnostic]]
  /**
    * Get code completion details for the given file, position, and entry.
    * @returns `Promise<typescript.CompletionEntryDetails | undefined>`
    */
  def getCompletionEntryDetails(fileName: String, position: Double, entry: String): js.Promise[js.UndefOr[_]]
  /**
    * Get code completions for the given file and position.
    * @returns `Promise<typescript.CompletionInfo | undefined>`
    */
  def getCompletionsAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[_]]
  /**
    * Get the definition of the item at the given position in the file.
    * @returns `Promise<ReadonlyArray<typescript.DefinitionInfo> | undefined>`
    */
  def getDefinitionAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Array[_]]]
  /**
    * Get transpiled output for the given file.
    * @returns `typescript.EmitOutput`
    */
  def getEmitOutput(fileName: String): js.Promise[_]
  /**
    * Get formatting changes which should be applied after the given keystroke.
    * @param options `typescript.FormatCodeOptions`
    * @returns `Promise<typescript.TextChange[]>`
    */
  def getFormattingEditsAfterKeystroke(fileName: String, postion: Double, ch: String, options: js.Any): js.Promise[js.Array[_]]
  /**
    * Get changes which should be applied to format the given file.
    * @param options `typescript.FormatCodeOptions`
    * @returns `Promise<typescript.TextChange[]>`
    */
  def getFormattingEditsForDocument(fileName: String, options: js.Any): js.Promise[js.Array[_]]
  /**
    * Get changes which should be applied to format the given range in the file.
    * @param options `typescript.FormatCodeOptions`
    * @returns `Promise<typescript.TextChange[]>`
    */
  def getFormattingEditsForRange(fileName: String, start: Double, end: Double, options: js.Any): js.Promise[js.Array[_]]
  /**
    * Get outline entries for the item at the given position in the file.
    * @returns `Promise<typescript.NavigationBarItem[]>`
    */
  def getNavigationBarItems(fileName: String): js.Promise[js.Array[_]]
  /**
    * Get other ranges which are related to the item at the given position in the file (often used for highlighting).
    * @returns `Promise<ReadonlyArray<typescript.ReferenceEntry> | undefined>`
    */
  def getOccurrencesAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Array[_]]]
  /**
    * Get quick info for the item at the given position in the file.
    * @returns `Promise<typescript.QuickInfo | undefined>`
    */
  def getQuickInfoAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[_]]
  /**
    * Get references to the item at the given position in the file.
    * @returns `Promise<typescript.ReferenceEntry[] | undefined>`
    */
  def getReferencesAtPosition(fileName: String, position: Double): js.Promise[js.UndefOr[js.Array[_]]]
  /**
    * Get edits which should be applied to rename the item at the given file and position (or a failure reason).
    * @param options `typescript.RenameInfoOptions`
    * @returns `Promise<typescript.RenameInfo>`
    */
  def getRenameInfo(fileName: String, positon: Double, options: js.Any): js.Promise[_]
  /**
    * Get diagnostic messages for any semantic issues in the given file.
    */
  def getSemanticDiagnostics(fileName: String): js.Promise[js.Array[Diagnostic]]
  /**
    * Get signature help items for the item at the given file and position.
    * @returns `Promise<typescript.SignatureHelpItems | undefined>`
    */
  def getSignatureHelpItems(fileName: String, position: Double): js.Promise[js.UndefOr[_]]
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
    findRenameLocations: (String, Double, Boolean, Boolean, Boolean) => js.Promise[js.UndefOr[js.Array[_]]],
    getCodeFixesAtPosition: (String, Double, Double, js.Array[Double], js.Any) => js.Promise[js.Array[_]],
    getCompilerOptionsDiagnostics: String => js.Promise[js.Array[Diagnostic]],
    getCompletionEntryDetails: (String, Double, String) => js.Promise[js.UndefOr[_]],
    getCompletionsAtPosition: (String, Double) => js.Promise[js.UndefOr[_]],
    getDefinitionAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Array[_]]],
    getEmitOutput: String => js.Promise[_],
    getFormattingEditsAfterKeystroke: (String, Double, String, js.Any) => js.Promise[js.Array[_]],
    getFormattingEditsForDocument: (String, js.Any) => js.Promise[js.Array[_]],
    getFormattingEditsForRange: (String, Double, Double, js.Any) => js.Promise[js.Array[_]],
    getNavigationBarItems: String => js.Promise[js.Array[_]],
    getOccurrencesAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Array[_]]],
    getQuickInfoAtPosition: (String, Double) => js.Promise[js.UndefOr[_]],
    getReferencesAtPosition: (String, Double) => js.Promise[js.UndefOr[js.Array[_]]],
    getRenameInfo: (String, Double, js.Any) => js.Promise[_],
    getSemanticDiagnostics: String => js.Promise[js.Array[Diagnostic]],
    getSignatureHelpItems: (String, Double) => js.Promise[js.UndefOr[_]],
    getSuggestionDiagnostics: String => js.Promise[js.Array[Diagnostic]],
    getSyntacticDiagnostics: String => js.Promise[js.Array[Diagnostic]]
  ): TypeScriptWorker = {
    val __obj = js.Dynamic.literal(findRenameLocations = js.Any.fromFunction5(findRenameLocations), getCodeFixesAtPosition = js.Any.fromFunction5(getCodeFixesAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction1(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction2(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction2(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getNavigationBarItems = js.Any.fromFunction1(getNavigationBarItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getQuickInfoAtPosition = js.Any.fromFunction2(getQuickInfoAtPosition), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getRenameInfo = js.Any.fromFunction3(getRenameInfo), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureHelpItems = js.Any.fromFunction2(getSignatureHelpItems), getSuggestionDiagnostics = js.Any.fromFunction1(getSuggestionDiagnostics), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics))
  
    __obj.asInstanceOf[TypeScriptWorker]
  }
}

