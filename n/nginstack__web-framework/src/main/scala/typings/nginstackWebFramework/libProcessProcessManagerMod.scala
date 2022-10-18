package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessProcessManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/ProcessManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ProcessManager {
    
    /* private */ /* CompleteClass */
    var _environment: Any = js.native
    
    /* private */ /* CompleteClass */
    var _justToGroupEvaluator: Any = js.native
    
    /* private */ /* CompleteClass */
    var callHandlers: Any = js.native
    
    /* CompleteClass */
    override def closeProcess(id: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var controller_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var createProcess: Any = js.native
    
    /* CompleteClass */
    var ctrlChannel: typings.nginstackWebFramework.libIfpControlChannelMod.^ = js.native
    
    /* CompleteClass */
    var ctrlSessionId: Any = js.native
    
    /* private */ /* CompleteClass */
    var currentProcess_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var emitBeforeExitEvent_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var errorHandler_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var errorTreatment: Any = js.native
    
    /* private */ /* CompleteClass */
    @JSName("finalize")
    var finalize_FProcessManager: Any = js.native
    
    /* CompleteClass */
    override def getCurrentProcess(): typings.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var getDefaultProcessKeyOfClass: Any = js.native
    
    /* private */ /* CompleteClass */
    var getEntityShortcuts: Any = js.native
    
    /* private */ /* CompleteClass */
    var getFileContent: Any = js.native
    
    /* private */ /* CompleteClass */
    var getFileId: Any = js.native
    
    /* private */ /* CompleteClass */
    var getParameterFromRequestObject: Any = js.native
    
    /* CompleteClass */
    override def getProcessById(id: String): typings.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var getSessionLocked: Any = js.native
    
    /* private */ /* CompleteClass */
    var getShortcutsScript: Any = js.native
    
    /* private */ /* CompleteClass */
    var getTabIcon: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleCloseTabCall: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleExecuteAnchor: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleGetFileRequest: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleGetNavtreeChildren: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleHit: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleIfp: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleIncomingMessages_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var handleLoadNavTreeNodes_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var handleRefreshTabCall: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleRequest: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleRunActivityCall: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleRunInteractionRequest: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleSetControlSessionIdCall: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleStartup: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleUpdatePassword_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var handleUpdateTaskCounter: Any = js.native
    
    /* CompleteClass */
    var iClass: DataSet = js.native
    
    /* CompleteClass */
    var iVfs: DataSet = js.native
    
    /* private */ /* CompleteClass */
    var interface_count: Any = js.native
    
    /* private */ /* CompleteClass */
    var isEAbort: Any = js.native
    
    /* private */ /* CompleteClass */
    var isENativeError: Any = js.native
    
    /* private */ /* CompleteClass */
    var lastExpiredExportedFilesPurge_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var onAfterRun: Event = js.native
    
    /* CompleteClass */
    var onBeforeRun: Event = js.native
    
    /* private */ /* CompleteClass */
    var openedTabs_ : Any = js.native
    
    /* CompleteClass */
    var pendingTaskCounter: Any = js.native
    
    /* private */ /* CompleteClass */
    var processEventQueue_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var processWillGo: Any = js.native
    
    /* private */ /* CompleteClass */
    var purgeExpiredExportedFiles_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var requestHandlers: Any = js.native
    
    /* private */ /* CompleteClass */
    var runActivity: Any = js.native
    
    /* private */ /* CompleteClass */
    var runProcess: Any = js.native
    
    /* private */ /* CompleteClass */
    var setEvaluateCode: Any = js.native
    
    /* private */ /* CompleteClass */
    var updateTabInfo_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/ProcessManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): ProcessManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ProcessManager]
  
  inline def parseLayoutLinkContent(content: Any): typings.nginstackEngine.libDbkeyDbkeyMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLayoutLinkContent")(content.asInstanceOf[js.Any]).asInstanceOf[typings.nginstackEngine.libDbkeyDbkeyMod.^]
  
  type Controller = typings.nginstackWebFramework.libMessagingControllerMod.^
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  trait ProcessManager extends StObject {
    
    /* private */ var _environment: Any
    
    /* private */ var _justToGroupEvaluator: Any
    
    /* private */ var callHandlers: Any
    
    def closeProcess(id: Double): Unit
    
    /* private */ var controller_ : Any
    
    /* private */ var createProcess: Any
    
    var ctrlChannel: typings.nginstackWebFramework.libIfpControlChannelMod.^
    
    var ctrlSessionId: Any
    
    /* private */ var currentProcess_ : Any
    
    /* private */ var emitBeforeExitEvent_ : Any
    
    /* private */ var errorHandler_ : Any
    
    /* private */ var errorTreatment: Any
    
    /* private */ @JSName("finalize")
    var finalize_FProcessManager: Any
    
    def getCurrentProcess(): typings.nginstackWebFramework.libProcessProcessMod.^
    
    /* private */ var getDefaultProcessKeyOfClass: Any
    
    /* private */ var getEntityShortcuts: Any
    
    /* private */ var getFileContent: Any
    
    /* private */ var getFileId: Any
    
    /* private */ var getParameterFromRequestObject: Any
    
    def getProcessById(id: String): typings.nginstackWebFramework.libProcessProcessMod.^
    
    /* private */ var getSessionLocked: Any
    
    /* private */ var getShortcutsScript: Any
    
    /* private */ var getTabIcon: Any
    
    /* private */ var handleCloseTabCall: Any
    
    /* private */ var handleExecuteAnchor: Any
    
    /* private */ var handleGetFileRequest: Any
    
    /* private */ var handleGetNavtreeChildren: Any
    
    /* private */ var handleHit: Any
    
    /* private */ var handleIfp: Any
    
    /* private */ var handleIncomingMessages_ : Any
    
    /* private */ var handleLoadNavTreeNodes_ : Any
    
    /* private */ var handleRefreshTabCall: Any
    
    /* private */ var handleRequest: Any
    
    /* private */ var handleRunActivityCall: Any
    
    /* private */ var handleRunInteractionRequest: Any
    
    /* private */ var handleSetControlSessionIdCall: Any
    
    /* private */ var handleStartup: Any
    
    /* private */ var handleUpdatePassword_ : Any
    
    /* private */ var handleUpdateTaskCounter: Any
    
    var iClass: DataSet
    
    var iVfs: DataSet
    
    /* private */ var interface_count: Any
    
    /* private */ var isEAbort: Any
    
    /* private */ var isENativeError: Any
    
    /* private */ var lastExpiredExportedFilesPurge_ : Any
    
    /* private */ var logger_ : Any
    
    var onAfterRun: Event
    
    var onBeforeRun: Event
    
    /* private */ var openedTabs_ : Any
    
    var pendingTaskCounter: Any
    
    /* private */ var processEventQueue_ : Any
    
    /* private */ var processWillGo: Any
    
    /* private */ var purgeExpiredExportedFiles_ : Any
    
    /* private */ var requestHandlers: Any
    
    /* private */ var runActivity: Any
    
    /* private */ var runProcess: Any
    
    /* private */ var setEvaluateCode: Any
    
    /* private */ var updateTabInfo_ : Any
  }
  object ProcessManager {
    
    inline def apply(
      _environment: Any,
      _justToGroupEvaluator: Any,
      callHandlers: Any,
      closeProcess: Double => Unit,
      controller_ : Any,
      createProcess: Any,
      ctrlChannel: typings.nginstackWebFramework.libIfpControlChannelMod.^,
      ctrlSessionId: Any,
      currentProcess_ : Any,
      emitBeforeExitEvent_ : Any,
      errorHandler_ : Any,
      errorTreatment: Any,
      finalize_ : Any,
      getCurrentProcess: () => typings.nginstackWebFramework.libProcessProcessMod.^,
      getDefaultProcessKeyOfClass: Any,
      getEntityShortcuts: Any,
      getFileContent: Any,
      getFileId: Any,
      getParameterFromRequestObject: Any,
      getProcessById: String => typings.nginstackWebFramework.libProcessProcessMod.^,
      getSessionLocked: Any,
      getShortcutsScript: Any,
      getTabIcon: Any,
      handleCloseTabCall: Any,
      handleExecuteAnchor: Any,
      handleGetFileRequest: Any,
      handleGetNavtreeChildren: Any,
      handleHit: Any,
      handleIfp: Any,
      handleIncomingMessages_ : Any,
      handleLoadNavTreeNodes_ : Any,
      handleRefreshTabCall: Any,
      handleRequest: Any,
      handleRunActivityCall: Any,
      handleRunInteractionRequest: Any,
      handleSetControlSessionIdCall: Any,
      handleStartup: Any,
      handleUpdatePassword_ : Any,
      handleUpdateTaskCounter: Any,
      iClass: DataSet,
      iVfs: DataSet,
      interface_count: Any,
      isEAbort: Any,
      isENativeError: Any,
      lastExpiredExportedFilesPurge_ : Any,
      logger_ : Any,
      onAfterRun: Event,
      onBeforeRun: Event,
      openedTabs_ : Any,
      pendingTaskCounter: Any,
      processEventQueue_ : Any,
      processWillGo: Any,
      purgeExpiredExportedFiles_ : Any,
      requestHandlers: Any,
      runActivity: Any,
      runProcess: Any,
      setEvaluateCode: Any,
      updateTabInfo_ : Any
    ): ProcessManager = {
      val __obj = js.Dynamic.literal(_environment = _environment.asInstanceOf[js.Any], _justToGroupEvaluator = _justToGroupEvaluator.asInstanceOf[js.Any], callHandlers = callHandlers.asInstanceOf[js.Any], closeProcess = js.Any.fromFunction1(closeProcess), controller_ = controller_.asInstanceOf[js.Any], createProcess = createProcess.asInstanceOf[js.Any], ctrlChannel = ctrlChannel.asInstanceOf[js.Any], ctrlSessionId = ctrlSessionId.asInstanceOf[js.Any], currentProcess_ = currentProcess_.asInstanceOf[js.Any], emitBeforeExitEvent_ = emitBeforeExitEvent_.asInstanceOf[js.Any], errorHandler_ = errorHandler_.asInstanceOf[js.Any], errorTreatment = errorTreatment.asInstanceOf[js.Any], getCurrentProcess = js.Any.fromFunction0(getCurrentProcess), getDefaultProcessKeyOfClass = getDefaultProcessKeyOfClass.asInstanceOf[js.Any], getEntityShortcuts = getEntityShortcuts.asInstanceOf[js.Any], getFileContent = getFileContent.asInstanceOf[js.Any], getFileId = getFileId.asInstanceOf[js.Any], getParameterFromRequestObject = getParameterFromRequestObject.asInstanceOf[js.Any], getProcessById = js.Any.fromFunction1(getProcessById), getSessionLocked = getSessionLocked.asInstanceOf[js.Any], getShortcutsScript = getShortcutsScript.asInstanceOf[js.Any], getTabIcon = getTabIcon.asInstanceOf[js.Any], handleCloseTabCall = handleCloseTabCall.asInstanceOf[js.Any], handleExecuteAnchor = handleExecuteAnchor.asInstanceOf[js.Any], handleGetFileRequest = handleGetFileRequest.asInstanceOf[js.Any], handleGetNavtreeChildren = handleGetNavtreeChildren.asInstanceOf[js.Any], handleHit = handleHit.asInstanceOf[js.Any], handleIfp = handleIfp.asInstanceOf[js.Any], handleIncomingMessages_ = handleIncomingMessages_.asInstanceOf[js.Any], handleLoadNavTreeNodes_ = handleLoadNavTreeNodes_.asInstanceOf[js.Any], handleRefreshTabCall = handleRefreshTabCall.asInstanceOf[js.Any], handleRequest = handleRequest.asInstanceOf[js.Any], handleRunActivityCall = handleRunActivityCall.asInstanceOf[js.Any], handleRunInteractionRequest = handleRunInteractionRequest.asInstanceOf[js.Any], handleSetControlSessionIdCall = handleSetControlSessionIdCall.asInstanceOf[js.Any], handleStartup = handleStartup.asInstanceOf[js.Any], handleUpdatePassword_ = handleUpdatePassword_.asInstanceOf[js.Any], handleUpdateTaskCounter = handleUpdateTaskCounter.asInstanceOf[js.Any], iClass = iClass.asInstanceOf[js.Any], iVfs = iVfs.asInstanceOf[js.Any], interface_count = interface_count.asInstanceOf[js.Any], isEAbort = isEAbort.asInstanceOf[js.Any], isENativeError = isENativeError.asInstanceOf[js.Any], lastExpiredExportedFilesPurge_ = lastExpiredExportedFilesPurge_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], onAfterRun = onAfterRun.asInstanceOf[js.Any], onBeforeRun = onBeforeRun.asInstanceOf[js.Any], openedTabs_ = openedTabs_.asInstanceOf[js.Any], pendingTaskCounter = pendingTaskCounter.asInstanceOf[js.Any], processEventQueue_ = processEventQueue_.asInstanceOf[js.Any], processWillGo = processWillGo.asInstanceOf[js.Any], purgeExpiredExportedFiles_ = purgeExpiredExportedFiles_.asInstanceOf[js.Any], requestHandlers = requestHandlers.asInstanceOf[js.Any], runActivity = runActivity.asInstanceOf[js.Any], runProcess = runProcess.asInstanceOf[js.Any], setEvaluateCode = setEvaluateCode.asInstanceOf[js.Any], updateTabInfo_ = updateTabInfo_.asInstanceOf[js.Any])
      __obj.updateDynamic("finalize")(finalize_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessManager]
    }
    
    extension [Self <: ProcessManager](x: Self) {
      
      inline def setCallHandlers(value: Any): Self = StObject.set(x, "callHandlers", value.asInstanceOf[js.Any])
      
      inline def setCloseProcess(value: Double => Unit): Self = StObject.set(x, "closeProcess", js.Any.fromFunction1(value))
      
      inline def setController_(value: Any): Self = StObject.set(x, "controller_", value.asInstanceOf[js.Any])
      
      inline def setCreateProcess(value: Any): Self = StObject.set(x, "createProcess", value.asInstanceOf[js.Any])
      
      inline def setCtrlChannel(value: typings.nginstackWebFramework.libIfpControlChannelMod.^): Self = StObject.set(x, "ctrlChannel", value.asInstanceOf[js.Any])
      
      inline def setCtrlSessionId(value: Any): Self = StObject.set(x, "ctrlSessionId", value.asInstanceOf[js.Any])
      
      inline def setCurrentProcess_(value: Any): Self = StObject.set(x, "currentProcess_", value.asInstanceOf[js.Any])
      
      inline def setEmitBeforeExitEvent_(value: Any): Self = StObject.set(x, "emitBeforeExitEvent_", value.asInstanceOf[js.Any])
      
      inline def setErrorHandler_(value: Any): Self = StObject.set(x, "errorHandler_", value.asInstanceOf[js.Any])
      
      inline def setErrorTreatment(value: Any): Self = StObject.set(x, "errorTreatment", value.asInstanceOf[js.Any])
      
      inline def setFinalize_(value: Any): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentProcess(value: () => typings.nginstackWebFramework.libProcessProcessMod.^): Self = StObject.set(x, "getCurrentProcess", js.Any.fromFunction0(value))
      
      inline def setGetDefaultProcessKeyOfClass(value: Any): Self = StObject.set(x, "getDefaultProcessKeyOfClass", value.asInstanceOf[js.Any])
      
      inline def setGetEntityShortcuts(value: Any): Self = StObject.set(x, "getEntityShortcuts", value.asInstanceOf[js.Any])
      
      inline def setGetFileContent(value: Any): Self = StObject.set(x, "getFileContent", value.asInstanceOf[js.Any])
      
      inline def setGetFileId(value: Any): Self = StObject.set(x, "getFileId", value.asInstanceOf[js.Any])
      
      inline def setGetParameterFromRequestObject(value: Any): Self = StObject.set(x, "getParameterFromRequestObject", value.asInstanceOf[js.Any])
      
      inline def setGetProcessById(value: String => typings.nginstackWebFramework.libProcessProcessMod.^): Self = StObject.set(x, "getProcessById", js.Any.fromFunction1(value))
      
      inline def setGetSessionLocked(value: Any): Self = StObject.set(x, "getSessionLocked", value.asInstanceOf[js.Any])
      
      inline def setGetShortcutsScript(value: Any): Self = StObject.set(x, "getShortcutsScript", value.asInstanceOf[js.Any])
      
      inline def setGetTabIcon(value: Any): Self = StObject.set(x, "getTabIcon", value.asInstanceOf[js.Any])
      
      inline def setHandleCloseTabCall(value: Any): Self = StObject.set(x, "handleCloseTabCall", value.asInstanceOf[js.Any])
      
      inline def setHandleExecuteAnchor(value: Any): Self = StObject.set(x, "handleExecuteAnchor", value.asInstanceOf[js.Any])
      
      inline def setHandleGetFileRequest(value: Any): Self = StObject.set(x, "handleGetFileRequest", value.asInstanceOf[js.Any])
      
      inline def setHandleGetNavtreeChildren(value: Any): Self = StObject.set(x, "handleGetNavtreeChildren", value.asInstanceOf[js.Any])
      
      inline def setHandleHit(value: Any): Self = StObject.set(x, "handleHit", value.asInstanceOf[js.Any])
      
      inline def setHandleIfp(value: Any): Self = StObject.set(x, "handleIfp", value.asInstanceOf[js.Any])
      
      inline def setHandleIncomingMessages_(value: Any): Self = StObject.set(x, "handleIncomingMessages_", value.asInstanceOf[js.Any])
      
      inline def setHandleLoadNavTreeNodes_(value: Any): Self = StObject.set(x, "handleLoadNavTreeNodes_", value.asInstanceOf[js.Any])
      
      inline def setHandleRefreshTabCall(value: Any): Self = StObject.set(x, "handleRefreshTabCall", value.asInstanceOf[js.Any])
      
      inline def setHandleRequest(value: Any): Self = StObject.set(x, "handleRequest", value.asInstanceOf[js.Any])
      
      inline def setHandleRunActivityCall(value: Any): Self = StObject.set(x, "handleRunActivityCall", value.asInstanceOf[js.Any])
      
      inline def setHandleRunInteractionRequest(value: Any): Self = StObject.set(x, "handleRunInteractionRequest", value.asInstanceOf[js.Any])
      
      inline def setHandleSetControlSessionIdCall(value: Any): Self = StObject.set(x, "handleSetControlSessionIdCall", value.asInstanceOf[js.Any])
      
      inline def setHandleStartup(value: Any): Self = StObject.set(x, "handleStartup", value.asInstanceOf[js.Any])
      
      inline def setHandleUpdatePassword_(value: Any): Self = StObject.set(x, "handleUpdatePassword_", value.asInstanceOf[js.Any])
      
      inline def setHandleUpdateTaskCounter(value: Any): Self = StObject.set(x, "handleUpdateTaskCounter", value.asInstanceOf[js.Any])
      
      inline def setIClass(value: DataSet): Self = StObject.set(x, "iClass", value.asInstanceOf[js.Any])
      
      inline def setIVfs(value: DataSet): Self = StObject.set(x, "iVfs", value.asInstanceOf[js.Any])
      
      inline def setInterface_count(value: Any): Self = StObject.set(x, "interface_count", value.asInstanceOf[js.Any])
      
      inline def setIsEAbort(value: Any): Self = StObject.set(x, "isEAbort", value.asInstanceOf[js.Any])
      
      inline def setIsENativeError(value: Any): Self = StObject.set(x, "isENativeError", value.asInstanceOf[js.Any])
      
      inline def setLastExpiredExportedFilesPurge_(value: Any): Self = StObject.set(x, "lastExpiredExportedFilesPurge_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setOnAfterRun(value: Event): Self = StObject.set(x, "onAfterRun", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeRun(value: Event): Self = StObject.set(x, "onBeforeRun", value.asInstanceOf[js.Any])
      
      inline def setOpenedTabs_(value: Any): Self = StObject.set(x, "openedTabs_", value.asInstanceOf[js.Any])
      
      inline def setPendingTaskCounter(value: Any): Self = StObject.set(x, "pendingTaskCounter", value.asInstanceOf[js.Any])
      
      inline def setProcessEventQueue_(value: Any): Self = StObject.set(x, "processEventQueue_", value.asInstanceOf[js.Any])
      
      inline def setProcessWillGo(value: Any): Self = StObject.set(x, "processWillGo", value.asInstanceOf[js.Any])
      
      inline def setPurgeExpiredExportedFiles_(value: Any): Self = StObject.set(x, "purgeExpiredExportedFiles_", value.asInstanceOf[js.Any])
      
      inline def setRequestHandlers(value: Any): Self = StObject.set(x, "requestHandlers", value.asInstanceOf[js.Any])
      
      inline def setRunActivity(value: Any): Self = StObject.set(x, "runActivity", value.asInstanceOf[js.Any])
      
      inline def setRunProcess(value: Any): Self = StObject.set(x, "runProcess", value.asInstanceOf[js.Any])
      
      inline def setSetEvaluateCode(value: Any): Self = StObject.set(x, "setEvaluateCode", value.asInstanceOf[js.Any])
      
      inline def setUpdateTabInfo_(value: Any): Self = StObject.set(x, "updateTabInfo_", value.asInstanceOf[js.Any])
      
      inline def set_environment(value: Any): Self = StObject.set(x, "_environment", value.asInstanceOf[js.Any])
      
      inline def set_justToGroupEvaluator(value: Any): Self = StObject.set(x, "_justToGroupEvaluator", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabInfo extends StObject {
    
    var currentProcessId: String
    
    var processIds: js.Array[String]
  }
  object TabInfo {
    
    inline def apply(currentProcessId: String, processIds: js.Array[String]): TabInfo = {
      val __obj = js.Dynamic.literal(currentProcessId = currentProcessId.asInstanceOf[js.Any], processIds = processIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabInfo]
    }
    
    extension [Self <: TabInfo](x: Self) {
      
      inline def setCurrentProcessId(value: String): Self = StObject.set(x, "currentProcessId", value.asInstanceOf[js.Any])
      
      inline def setProcessIds(value: js.Array[String]): Self = StObject.set(x, "processIds", value.asInstanceOf[js.Any])
      
      inline def setProcessIdsVarargs(value: String*): Self = StObject.set(x, "processIds", js.Array(value*))
    }
  }
}
