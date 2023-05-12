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
       with ProcessManager
  @JSImport("@nginstack/web-framework/lib/process/ProcessManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): ProcessManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ProcessManager]
  
  inline def parseLayoutLinkContent(content: Any): typings.nginstackEngine.libDbkeyDbkeyMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLayoutLinkContent")(content.asInstanceOf[js.Any]).asInstanceOf[typings.nginstackEngine.libDbkeyDbkeyMod.^]
  
  type Controller = typings.nginstackWebFramework.libMessagingControllerMod.^
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  @js.native
  trait ProcessManager extends StObject {
    
    /* private */ var _justToGroupEvaluator: Any = js.native
    
    /* private */ var callHandlers: Any = js.native
    
    def closeProcess(id: Double): Unit = js.native
    
    /* private */ var controller_ : Any = js.native
    
    /* private */ var createProcess: Any = js.native
    
    var ctrlChannel: typings.nginstackWebFramework.libIfpControlChannelMod.^ = js.native
    
    var ctrlSessionId: Any = js.native
    
    /* private */ var currentProcess_ : Any = js.native
    
    /* private */ var debugSessionTimeouts_ : Any = js.native
    
    /* private */ var emitBeforeExitEvent_ : Any = js.native
    
    /* private */ var environment_ : Any = js.native
    
    /* private */ var errorHandler_ : Any = js.native
    
    /* private */ var errorTreatment: Any = js.native
    
    /* private */ @JSName("finalize")
    var finalize_FProcessManager: Any = js.native
    
    /* private */ var getClientAddress_ : Any = js.native
    
    def getCurrentProcess(): typings.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* private */ var getDefaultProcessKeyOfClass: Any = js.native
    
    /* private */ var getEntityShortcuts: Any = js.native
    
    /* private */ var getFileContent: Any = js.native
    
    /* private */ var getFileId: Any = js.native
    
    /* private */ var getParameterFromRequestObject: Any = js.native
    
    def getProcessById(id: String): typings.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* private */ var getShortcutsScript: Any = js.native
    
    /* private */ var getTabIcon: Any = js.native
    
    /* private */ var handleCloseTabCall: Any = js.native
    
    /* private */ var handleExecuteAnchor: Any = js.native
    
    /* private */ var handleGetFileRequest: Any = js.native
    
    /* private */ var handleGetNavtreeChildren: Any = js.native
    
    /* private */ var handleHit: Any = js.native
    
    /* private */ var handleIfp: Any = js.native
    
    /* private */ var handleIncomingMessages_ : Any = js.native
    
    /* private */ var handleLoadNavTreeNodes_ : Any = js.native
    
    /* private */ var handleRefreshTabCall: Any = js.native
    
    /* private */ var handleRequest: Any = js.native
    
    /* private */ var handleRunActivityCall: Any = js.native
    
    /* private */ var handleRunInteractionRequest: Any = js.native
    
    /* private */ var handleStartup: Any = js.native
    
    /* private */ var handleUpdatePassword_ : Any = js.native
    
    /* private */ var handleUpdateTaskCounter: Any = js.native
    
    var iClass: DataSet = js.native
    
    var iVfs: DataSet = js.native
    
    /* private */ var inactiveSessionHandling_ : Any = js.native
    
    /* private */ var inactivityTimeout_ : Any = js.native
    
    /* private */ var interface_count: Any = js.native
    
    /* private */ var isEAbort: Any = js.native
    
    /* private */ var isENativeError: Any = js.native
    
    /* private */ var isScreenLocked: Any = js.native
    
    /* private */ var lastExpiredExportedFilesPurge_ : Any = js.native
    
    /* private */ var lastUse_ : Any = js.native
    
    /* private */ var loadSessionSettings_ : Any = js.native
    
    /* private */ var lockedScreenTimeout_ : Any = js.native
    
    /* private */ var logOutDueToInactivity_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def notifyUsage(): Unit = js.native
    def notifyUsage(lastUse: Double): Unit = js.native
    
    var onAfterRun: Event = js.native
    
    var onBeforeRun: Event = js.native
    
    /* private */ var openedTabs_ : Any = js.native
    
    var pendingTaskCounter: Any = js.native
    
    /* private */ var processEventQueue_ : Any = js.native
    
    /* private */ var processWillGo: Any = js.native
    
    /* private */ var purgeExpiredExportedFiles_ : Any = js.native
    
    /* private */ var requestHandlers: Any = js.native
    
    /* private */ var runActivity: Any = js.native
    
    /* private */ var runProcess: Any = js.native
    
    /* private */ var setEvaluateCode: Any = js.native
    
    /* private */ var updateTabInfo_ : Any = js.native
    
    def verifySessionTimeouts(): SessionTimeoutsInfo = js.native
  }
  
  trait SessionTimeoutsInfo extends StObject {
    
    var inactivity: Double
    
    var lockedScreen: Double
  }
  object SessionTimeoutsInfo {
    
    inline def apply(inactivity: Double, lockedScreen: Double): SessionTimeoutsInfo = {
      val __obj = js.Dynamic.literal(inactivity = inactivity.asInstanceOf[js.Any], lockedScreen = lockedScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionTimeoutsInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionTimeoutsInfo] (val x: Self) extends AnyVal {
      
      inline def setInactivity(value: Double): Self = StObject.set(x, "inactivity", value.asInstanceOf[js.Any])
      
      inline def setLockedScreen(value: Double): Self = StObject.set(x, "lockedScreen", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabInfo] (val x: Self) extends AnyVal {
      
      inline def setCurrentProcessId(value: String): Self = StObject.set(x, "currentProcessId", value.asInstanceOf[js.Any])
      
      inline def setProcessIds(value: js.Array[String]): Self = StObject.set(x, "processIds", value.asInstanceOf[js.Any])
      
      inline def setProcessIdsVarargs(value: String*): Self = StObject.set(x, "processIds", js.Array(value*))
    }
  }
}
