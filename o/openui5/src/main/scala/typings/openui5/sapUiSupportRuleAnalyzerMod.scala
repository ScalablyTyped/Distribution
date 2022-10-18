package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Components
import typings.openui5.sapUiSupportLibraryMod.HistoryFormats
import typings.openui5.sapUiSupportSupportRulesHistoryMod.AnalysisResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiSupportRuleAnalyzerMod extends Shortcut {
  
  @JSImport("sap/ui/support/RuleAnalyzer", JSImport.Default)
  @js.native
  val default: RuleAnalyzer = js.native
  
  /**
    * The `sap.ui.support.RuleAnalyzer` namespace is the central entry point for the Support Assistant functionality.
    *
    * Overview: `sap.ui.support.RuleAnalyzer` reveals an API for the Support Assistant which you can easily
    * work with to analyze an application.
    *
    * Usage:
    *
    *
    * 	 -  `sap.ui.support.RuleAnalyzer.addRule` method allows adding a new rule.
    * 	 -  `sap.ui.support.RuleAnalyzer.analyze` starts the analysis of the application.
    * 	 -  Then the result can be accessed with methods `sap.ui.support.RuleAnalyzer.getAnalysisHistory`, `sap.ui.support.RuleAnalyzer.getLastAnalysisHistory`
    * 			or `sap.ui.support.RuleAnalyzer.getFormattedAnalysisHistory`.
    *
    * For more information, see {@link topic:a34eb58aaf124f538a3ead23a6cab04a Support Assistant API}.
    */
  @js.native
  trait RuleAnalyzer extends StObject {
    
    /**
      * @SINCE 1.60
      *
      * Adds new temporary rule when in silent mode
      *
      * @returns Rule creation status. Possible values are "success" or description of why adding failed.
      */
    def addRule(
      /**
      * Settings for the new rule. For detailed information about its properties see {@link topic:eaeea19a991d46f29e6d8d8827317d0e
      * Rule Property Values}
      */
    oRule: js.Object
    ): String = js.native
    
    /**
      * Main method to perform analysis of a given running application.
      *
      * Allows to choose a particular execution scope - desired part of the UI to be checked and a flexible way
      * to specify the list of rules to be used.
      *
      * @returns Notifies the finished state by starting the Analyzer
      */
    def analyze(): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: String
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: String,
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Array[js.Object]
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Array[js.Object],
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Object,
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Unit,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: Unit,
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: String
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: String,
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Array[js.Object]
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Array[js.Object],
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: js.Object,
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    def analyze(
      /**
      * The execution scope of the analysis (see {@link topic:e15067d976f24b11907f4c262bd749a0 Execution Scope}).
      */
    oExecutionScope: Components,
      /**
      * This optional parameter allows for selection of subset of rules for the analysis. You can pass:
      *
      * 	 - A rule preset object containing the preset ID and the list of rules it contains.
      * 	 - A string that refers to the ID of a system preset.
      * 	 - An object array with a plain list of rules.
      */
    vPresetOrRules: Unit,
      /**
      * Metadata in custom format. Its only purpose is to be included in the analysis report.
      */
    oMetadata: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * Returns the history of all executed analyses.
      *
      * @returns Array of history objects in the order of analyses performed. The results of the last analysis
      * are contained in the last element in the array.
      */
    def getAnalysisHistory(): js.Array[AnalysisResult] = js.native
    
    /**
      * Returns the history of all executed analyses into formatted output depending on the passed format.
      *
      * @returns All analysis history objects in the correct format.
      */
    def getFormattedAnalysisHistory(): Any = js.native
    def getFormattedAnalysisHistory(
      /**
      * The format into which the history object will be converted. Possible values are listed in sap.ui.support.HistoryFormats.
      */
    sFormat: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HistoryFormats * / any */ String
    ): Any = js.native
    def getFormattedAnalysisHistory(
      /**
      * The format into which the history object will be converted. Possible values are listed in sap.ui.support.HistoryFormats.
      */
    sFormat: HistoryFormats
    ): Any = js.native
    
    /**
      * Returns the result of the last analysis performed.
      *
      * @returns Last analysis history.
      */
    def getLastAnalysisHistory(): AnalysisResult = js.native
  }
  
  type _To = RuleAnalyzer
  
  /* This means you don't have to write `default`, but can instead just say `sapUiSupportRuleAnalyzerMod.foo` */
  override def _to: RuleAnalyzer = default
}
