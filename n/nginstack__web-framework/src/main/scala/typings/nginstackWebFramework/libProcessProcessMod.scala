package typings.nginstackWebFramework

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessProcessMod {
  
  inline def apply(key: Double, id: String, responseObject: Any, sourceClass: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], responseObject.asInstanceOf[js.Any], sourceClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    key: Double,
    id: String,
    responseObject: Any,
    sourceClass: typings.nginstackEngine.libDbkeyDbkeyMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], responseObject.asInstanceOf[js.Any], sourceClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/Process", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Process {
    def this(key: Double, id: String, responseObject: Any, sourceClass: Double) = this()
    def this(
      key: Double,
      id: String,
      responseObject: Any,
      sourceClass: typings.nginstackEngine.libDbkeyDbkeyMod.^
    ) = this()
  }
  @JSImport("@nginstack/web-framework/lib/process/Process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(keyOrUrl: Any, sourceClassKey: Any): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(keyOrUrl.asInstanceOf[js.Any], sourceClassKey.asInstanceOf[js.Any])).asInstanceOf[Process]
  
  inline def getProcessTitle(key: Double, processName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcessTitle")(key.asInstanceOf[js.Any], processName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSourceAndInclude(key: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceAndInclude")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  type Button = typings.nginstackWebFramework.libButtonButtonMod.^
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  type GridField = typings.nginstackWebFramework.libGridGridFieldMod.^
  
  type Link = typings.nginstackWebFramework.libAnchorLinkMod.^
  
  @js.native
  trait Process extends StObject {
    
    /* private */ var _backButton: Any = js.native
    
    /* private */ var _changes: Any = js.native
    
    /* private */ var _checkGridsAndConfirmCancel: Any = js.native
    
    /* private */ var _createButtonAndLinkIt: Any = js.native
    
    /* private */ var _ctrlChannel: Any = js.native
    
    /* private */ var _declareDefaultButtons: Any = js.native
    
    /* private */ var _forwardButton: Any = js.native
    
    /* private */ var _getChanges: Any = js.native
    
    /* private */ var _hasPermissionToInteraction: Any = js.native
    
    /* private */ var _insensitiveCompare: Any = js.native
    
    /* private */ var _pendingOperations: Any = js.native
    
    /* private */ var _prepareConnection: Any = js.native
    
    /* private */ var _prepareLookupGrid: Any = js.native
    
    /* private */ var _priorConnectionParams: Any = js.native
    
    /* private */ var _simpleLayouts: Any = js.native
    
    /* private */ var _unprepareConnection: Any = js.native
    
    /* private */ var act_preserveScrollPosition_ : Any = js.native
    
    /* private */ var act_showHelp_ : Any = js.native
    
    def action(name: Any, target: Any, order: Any, processKey: Any, newTab: Any): typings.nginstackWebFramework.libButtonButtonMod.^ = js.native
    
    /* private */ var actions: Any = js.native
    
    /* private */ var activities: Any = js.native
    
    def activity(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: String,
      opt_exitFunc: js.Function1[/* arg0 */ Any, Any],
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    def activity(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: String,
      opt_exitFunc: Unit,
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    def activity(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: Unit,
      opt_exitFunc: js.Function1[/* arg0 */ Any, Any],
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    def activity(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: Unit,
      opt_exitFunc: Unit,
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    
    /* private */ var addGridToWriteOnCurrentInteraction: Any = js.native
    
    def alert(message: String, title: Any): Any = js.native
    
    /* private */ var alreadyFocusOnGrid: Any = js.native
    
    /* private */ var anchorsChanged: Any = js.native
    
    /* private */ var arActivities: Any = js.native
    
    /* private */ var arButtons: Any = js.native
    
    def authenticateUser(label: String): Double | Null = js.native
    
    def beep(): Unit = js.native
    
    var bodyClassName: String = js.native
    
    def button(name: String, target: String): Button = js.native
    def button(name: String, target: String, order: Double): Button = js.native
    def button(name: String, target: String, order: Double, processKey: Double): Button = js.native
    def button(name: String, target: String, order: Double, processKey: Double, newTab: Boolean): Button = js.native
    def button(name: String, target: String, order: Double, processKey: Unit, newTab: Boolean): Button = js.native
    def button(name: String, target: String, order: Unit, processKey: Double): Button = js.native
    def button(name: String, target: String, order: Unit, processKey: Double, newTab: Boolean): Button = js.native
    def button(name: String, target: String, order: Unit, processKey: Unit, newTab: Boolean): Button = js.native
    def button(name: String, target: js.Function1[/* arg0 */ Any, Any]): Button = js.native
    def button(name: String, target: js.Function1[/* arg0 */ Any, Any], order: Double): Button = js.native
    def button(name: String, target: js.Function1[/* arg0 */ Any, Any], order: Double, processKey: Double): Button = js.native
    def button(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      order: Double,
      processKey: Double,
      newTab: Boolean
    ): Button = js.native
    def button(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      order: Double,
      processKey: Unit,
      newTab: Boolean
    ): Button = js.native
    def button(name: String, target: js.Function1[/* arg0 */ Any, Any], order: Unit, processKey: Double): Button = js.native
    def button(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      order: Unit,
      processKey: Double,
      newTab: Boolean
    ): Button = js.native
    def button(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      order: Unit,
      processKey: Unit,
      newTab: Boolean
    ): Button = js.native
    
    /* private */ var buttons: Any = js.native
    
    var canDoHistory: Boolean = js.native
    
    var canExport: Boolean = js.native
    
    /* private */ var canRun: Any = js.native
    
    var canWriteScripts: Boolean = js.native
    
    /* private */ var checkWordAvailability: Any = js.native
    
    def clearActions(): Unit = js.native
    
    def clearButtons(): Unit = js.native
    
    def clearHistory(): Unit = js.native
    
    /* private */ var clearHistoryFlag: Any = js.native
    
    /* private */ var clearNextInteractionInfo: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ var closeLookupGrid: Any = js.native
    
    def closeTab(): Unit = js.native
    def closeTab(opt_targetTabId: Double): Unit = js.native
    
    /* private */ var componentFactoryResolver_ : Any = js.native
    
    def confirm(msg: String): Boolean = js.native
    def confirm(msg: String, opt_noAsDefault: Boolean): Boolean = js.native
    
    var cssFiles: js.Array[Any] = js.native
    
    var currentInteraction: typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    
    var currentTabId: Double = js.native
    
    var dbkey: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* private */ var defineAllGrids: Any = js.native
    
    /* private */ var defineGrids: Any = js.native
    
    def deleteGrid(name: String): Boolean = js.native
    
    var disableSaveInputAsDefault: Boolean = js.native
    
    def download(files: String): Unit = js.native
    def download(files: String, options: typings.nginstackWebFramework.libFileLoaderDownloadOptionsMod.^): Unit = js.native
    def download(files: String, options: Record[Any, Any]): Unit = js.native
    def download(files: js.Array[String | Double | typings.nginstackEngine.libDbkeyDbkeyMod.^]): Unit = js.native
    def download(
      files: js.Array[String | Double | typings.nginstackEngine.libDbkeyDbkeyMod.^],
      options: typings.nginstackWebFramework.libFileLoaderDownloadOptionsMod.^
    ): Unit = js.native
    def download(
      files: js.Array[String | Double | typings.nginstackEngine.libDbkeyDbkeyMod.^],
      options: Record[Any, Any]
    ): Unit = js.native
    def download(files: Double): Unit = js.native
    def download(files: Double, options: typings.nginstackWebFramework.libFileLoaderDownloadOptionsMod.^): Unit = js.native
    def download(files: Double, options: Record[Any, Any]): Unit = js.native
    def download(files: typings.nginstackEngine.libDbkeyDbkeyMod.^): Unit = js.native
    def download(
      files: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      options: typings.nginstackWebFramework.libFileLoaderDownloadOptionsMod.^
    ): Unit = js.native
    def download(files: typings.nginstackEngine.libDbkeyDbkeyMod.^, options: Record[Any, Any]): Unit = js.native
    
    /* private */ var dsLookup: Any = js.native
    
    def dsvLink(name: String, dsvKey: Double): Any = js.native
    def dsvLink(name: String, dsvKey: Double, opt_newTab: Boolean): Any = js.native
    
    var enabledActions: Any = js.native
    
    var enabledButtons: js.Array[Button | String] = js.native
    
    var environment: typings.nginstackWebFramework.libEnvironmentEnvironmentMod.^ = js.native
    
    /* private */ var fileLoader_ : Any = js.native
    
    /* private */ var getButtonsChanges: Any = js.native
    
    /* private */ var getChildrenJustToGroup: Any = js.native
    
    def getFileId(filePathOrVfsKey: Any, displayFileName: Any): String = js.native
    
    /* private */ var getGridCount: Any = js.native
    
    /* private */ var getLabelChanges: Any = js.native
    
    def getLinks(): Record[String, typings.nginstackWebFramework.libAnchorLinkMod.^] = js.native
    
    /* private */ var getLinksChanges: Any = js.native
    
    /* private */ var getSelectedKeysOfLookup: Any = js.native
    
    def getSimpleLayout(skinScriptKeyOrUrl: Any): typings.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^ = js.native
    
    def grid(name: String): Grid = js.native
    def grid(name: String, opt_ds: Unit, opt_classKey: Double): Grid = js.native
    def grid(name: String, opt_ds: Unit, opt_classKey: Double, opt_masterGrid: Grid): Grid = js.native
    def grid(name: String, opt_ds: Unit, opt_classKey: Unit, opt_masterGrid: Grid): Grid = js.native
    def grid(name: String, opt_ds: typings.nginstackEngine.libDatasetDataSetMod.^): Grid = js.native
    def grid(name: String, opt_ds: typings.nginstackEngine.libDatasetDataSetMod.^, opt_classKey: Double): Grid = js.native
    def grid(
      name: String,
      opt_ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      opt_classKey: Double,
      opt_masterGrid: Grid
    ): Grid = js.native
    def grid(
      name: String,
      opt_ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      opt_classKey: Unit,
      opt_masterGrid: Grid
    ): Grid = js.native
    
    var gridToFocus: Grid = js.native
    
    /* private */ var grids: Any = js.native
    
    /* private */ var handleExecuteAnchor: Any = js.native
    
    /* private */ var handleGetLinkFieldNameParamsAndGo: Any = js.native
    
    /* private */ var handleGridAction: Any = js.native
    
    /* private */ var handleGridSynchronize: Any = js.native
    
    /* private */ var handleIfp: Any = js.native
    
    /* private */ var handleIfpFunctions: Any = js.native
    
    /* private */ var handleIfpFunctionsLength: Any = js.native
    
    def hasButton(name: String): Boolean = js.native
    
    /* private */ var hasFieldToFocus: Any = js.native
    
    def hasPermission(permissionKeyWord: String): Boolean = js.native
    
    /* private */ var haveNextActivity: Any = js.native
    
    var help: (Record[Any, Any]) | String = js.native
    
    /* private */ var hideProgress: Any = js.native
    
    /* private */ var historyEnabled: Any = js.native
    
    var id: String = js.native
    
    /* private */ var idsvKey: Any = js.native
    
    var immediateRedirectEnabled: Boolean = js.native
    
    /* private */ var inConstructor: Any = js.native
    
    /* private */ var initializingDocument_ : Any = js.native
    
    def interaction(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: String,
      opt_exitFunc: js.Function1[/* arg0 */ Any, Any],
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    def interaction(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: String,
      opt_exitFunc: Unit,
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    def interaction(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: Unit,
      opt_exitFunc: js.Function1[/* arg0 */ Any, Any],
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    def interaction(
      name: String,
      func: js.ThisFunction0[/* this */ this.type, Any],
      opt_permKeyWord: Unit,
      opt_exitFunc: Unit,
      args: Any*
    ): typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    
    /* private */ var interactionWasWritten_ : Any = js.native
    
    /* private */ var isLayout: Any = js.native
    
    var key: Double = js.native
    
    def label(name: String): typings.nginstackWebFramework.libLabelLabelMod.^ = js.native
    def label(name: String, opt_text: String): typings.nginstackWebFramework.libLabelLabelMod.^ = js.native
    
    /* private */ var labels: Any = js.native
    
    /* private */ var labelsChanged: Any = js.native
    
    var lastInteraction: typings.nginstackWebFramework.libProcessInteractionMod.^ = js.native
    
    /* private */ var lastLabelProgress: Any = js.native
    
    /* private */ var lastMaxStep: Any = js.native
    
    /* private */ var lastPercentProgress: Any = js.native
    
    var lastRunParameters: Any = js.native
    
    var layoutManager: typings.nginstackWebFramework.libProcessLayoutManagerMod.^ = js.native
    
    var layoutResponseObject: typings.nginstackEngine.libIoFileMod.^ | typings.nginstackEngine.libPrintSpoolMod.^ = js.native
    
    /* private */ var letFetchProcessInfo: Any = js.native
    
    def link(name: String): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: String): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: String, processKey: Double): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: String, processKey: Double, newTab: Boolean): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: String, processKey: Unit, newTab: Boolean): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: js.Function1[/* arg0 */ Any, Any]): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: js.Function1[/* arg0 */ Any, Any], processKey: Double): Link = js.native
    def link(
      name: String,
      nextInteractionNameOrFunction: js.Function1[/* arg0 */ Any, Any],
      processKey: Double,
      newTab: Boolean
    ): Link = js.native
    def link(
      name: String,
      nextInteractionNameOrFunction: js.Function1[/* arg0 */ Any, Any],
      processKey: Unit,
      newTab: Boolean
    ): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: Unit, processKey: Double): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: Unit, processKey: Double, newTab: Boolean): Link = js.native
    def link(name: String, nextInteractionNameOrFunction: Unit, processKey: Unit, newTab: Boolean): Link = js.native
    
    /* private */ var links_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def lookup(field: GridField): Unit = js.native
    
    var name: String = js.native
    
    /* private */ var nextActivityName: Any = js.native
    
    /* private */ var nextActivityParameters: Any = js.native
    
    /* private */ var nextCreateNewTab: Any = js.native
    
    /* private */ var nextProcessId: Any = js.native
    
    /* private */ var nextProcessKey: Any = js.native
    
    var pId: String = js.native
    
    /* private */ var pairName_ : Any = js.native
    
    var permissionKeyWords: js.Array[Any] = js.native
    
    /* private */ var ping: Any = js.native
    
    /* private */ var postAllWrittenGridDataSetsInCurrentInteraction_ : Any = js.native
    
    /* private */ var prepare: Any = js.native
    
    /* private */ var progressStarted: Any = js.native
    
    def prompt(label: String, answers: js.Array[js.Array[Any]]): Any = js.native
    def prompt(label: String, answers: js.Array[js.Array[Any]], opt_verticalAlign: Double): Any = js.native
    def prompt(
      label: String,
      answers: js.Array[js.Array[Any]],
      opt_verticalAlign: Double,
      opt_defaultOptionIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      answers: js.Array[js.Array[Any]],
      opt_verticalAlign: Double,
      opt_defaultOptionIndex: Double,
      opt_escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      answers: js.Array[js.Array[Any]],
      opt_verticalAlign: Double,
      opt_defaultOptionIndex: Unit,
      opt_escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      answers: js.Array[js.Array[Any]],
      opt_verticalAlign: Unit,
      opt_defaultOptionIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      answers: js.Array[js.Array[Any]],
      opt_verticalAlign: Unit,
      opt_defaultOptionIndex: Double,
      opt_escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      answers: js.Array[js.Array[Any]],
      opt_verticalAlign: Unit,
      opt_defaultOptionIndex: Unit,
      opt_escapeIndex: Double
    ): Any = js.native
    
    /* private */ var realTitle: Any = js.native
    
    /* private */ var recentlyCreated: Any = js.native
    
    /* private */ var redirectIfInteractionWasChanged: Any = js.native
    
    /* private */ var removeDetailGridsFromWriteOnCurrentInteraction: Any = js.native
    
    /* private */ var requiredFiles_ : Any = js.native
    
    def requires(uri: String): Unit = js.native
    
    /* private */ var resendUiObjectsChanges: Any = js.native
    
    /* private */ var reservedWords: Any = js.native
    
    /* private */ var resetNextState: Any = js.native
    
    /* private */ var resetUiObjectsProperties: Any = js.native
    
    var response: Any = js.native
    
    /* private */ var run: Any = js.native
    
    /* private */ var scrollX_ : Any = js.native
    
    /* private */ var scrollY_ : Any = js.native
    
    /* private */ var setButtonsProperty: Any = js.native
    
    /* private */ var setButtonsStateByArray: Any = js.native
    
    /* private */ var setCtrlMessage: Any = js.native
    
    /* private */ var setEvaluateCode: Any = js.native
    
    /* private */ var setNextActivity: Any = js.native
    
    def setNextInteraction(activityName: String): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: js.Array[Any]): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: js.Array[Any], opt_processKey: Double): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: js.Array[Any], opt_processKey: Double, opt_processId: Double): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: js.Array[Any],
      opt_processKey: Double,
      opt_processId: Double,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: js.Array[Any],
      opt_processKey: Double,
      opt_processId: Unit,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: js.Array[Any], opt_processKey: Unit, opt_processId: Double): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: js.Array[Any],
      opt_processKey: Unit,
      opt_processId: Double,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: js.Array[Any],
      opt_processKey: Unit,
      opt_processId: Unit,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: Unit, opt_processKey: Double): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: Unit, opt_processKey: Double, opt_processId: Double): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: Unit,
      opt_processKey: Double,
      opt_processId: Double,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: Unit,
      opt_processKey: Double,
      opt_processId: Unit,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(activityName: String, opt_params: Unit, opt_processKey: Unit, opt_processId: Double): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: Unit,
      opt_processKey: Unit,
      opt_processId: Double,
      opt_newTab: Boolean
    ): Unit = js.native
    def setNextInteraction(
      activityName: String,
      opt_params: Unit,
      opt_processKey: Unit,
      opt_processId: Unit,
      opt_newTab: Boolean
    ): Unit = js.native
    
    /* private */ var setParameters: Any = js.native
    
    /* private */ var setStatusMessage: Any = js.native
    
    /* private */ var setVisibleButtonsByButtonsArray: Any = js.native
    
    def showProgress(currentStep: Double, maxStep: Double, label: String): Unit = js.native
    
    var simpleLayoutOutputHandler: Any = js.native
    
    /* private */ var sortButtons: Any = js.native
    
    var sourceClass: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    var status: String = js.native
    
    /* private */ var syncButtons: Any = js.native
    
    /* private */ var syncInteractionName: Any = js.native
    
    var title: String = js.native
    
    /* private */ @JSName("toString")
    var toString_FProcess: Any = js.native
    
    /* private */ var translateButtonList: Any = js.native
    
    /* private */ var updateConnectionReferrer: Any = js.native
    
    /* private */ var updateTaskCounter: Any = js.native
    
    def upload(): Any = js.native
    def upload(options: typings.nginstackWebFramework.libFileLoaderUploadOptionsMod.^): Any = js.native
    
    /* private */ var uploadDialog_ : Any = js.native
    
    var uri: String = js.native
    
    var useLayoutManager: Boolean = js.native
    
    var userKeyToValidatePermissions: Double = js.native
    
    /* private */ var validateRequiredInputOfLastInteraction: Any = js.native
    
    var version: Double = js.native
    
    var visibleActions: js.Array[Button | String] = js.native
    
    var visibleButtons: js.Array[Button | String] = js.native
    
    var workloadType: String = js.native
    
    def write(content: Any): Unit = js.native
    
    /* private */ var writeRequiredFiles: Any = js.native
    
    /* private */ var writtenGridsInCurrentInteraction_ : Any = js.native
  }
  
  type UploadedFile = typings.nginstackWebFramework.libFileLoaderUploadedFileMod.^
}
