package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.StackTrace
import typings.nginstackWebFramework.nginstackWebFrameworkStrings.`ctrlColonstopColon-1`
import typings.nginstackWebFramework.nginstackWebFrameworkStrings.ctrlColoncontinue
import typings.nginstackWebFramework.nginstackWebFrameworkStrings.ctrlColonsetok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIfpControlChannelMod {
  
  inline def apply(sid: String): Unit = ^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/ifp/ControlChannel", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ControlChannel {
    def this(sid: String) = this()
  }
  @JSImport("@nginstack/web-framework/lib/ifp/ControlChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatErrorPayload(error: Any, info: StackTrace): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrorPayload")(error.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getInstance(): ControlChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ControlChannel]
  
  @js.native
  trait ControlChannel extends StObject {
    
    /* private */ var _bus: Any = js.native
    
    /* private */ var _cid: Any = js.native
    
    /* private */ var _serializeTaskProgressStackUpdate: Any = js.native
    
    /* private */ var _throwError: Any = js.native
    
    /* private */ var _waitForCondition: Any = js.native
    
    def abortRunningSequence(): Unit = js.native
    
    def ctrlChannelIsInactive(): Boolean = js.native
    
    var ctrlChannelTimeout: Double = js.native
    
    def finishRunningSequence(): Unit = js.native
    
    def getDataChannelSequence(): Double = js.native
    
    def getLastMessage(): Any = js.native
    
    def getMessageForNavigator(sequenceToListen: Any, retry: Any, disableContinueOptimization: Any): Any = js.native
    
    def getSessionLocked(): Boolean = js.native
    
    def getSyncStatus(): Double = js.native
    
    def handleNavigatorResponse(ctrlMessage: Any): ctrlColoncontinue | `ctrlColonstopColon-1` | ctrlColonsetok = js.native
    
    def lockSessionByNavigator(): String = js.native
    
    def setCtrlMessage(message: Any): Unit = js.native
    
    def setDataChannelSequence(seq: Double): Unit = js.native
    
    def setEvaluateCode(code: Any): Any = js.native
    
    def setFinalMessageWithAcknowledgment(msg: Any): Unit = js.native
    
    def setStatusMessage(message: Any, lastProcessPercent: Any): Unit = js.native
    
    def setSyncStatus(syncStatus: Double): Unit = js.native
    def setSyncStatus(syncStatus: Double, message: String): Unit = js.native
    
    var sid: String = js.native
    
    def touch(): Unit = js.native
    
    def unlockSessionByNavigator(userName: String, password: String): String = js.native
    def unlockSessionByNavigator(userName: String, password: String, newPassword: String): String = js.native
    
    def updateMessage(message: Any): Unit = js.native
    
    def waitForOtherState(unexpectedState: Double, timeout: Double): Boolean = js.native
    
    def waitForState(expectedState: Double, timeout: Double): Boolean = js.native
  }
}
