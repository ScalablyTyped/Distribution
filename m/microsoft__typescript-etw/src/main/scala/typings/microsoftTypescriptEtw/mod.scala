package typings.microsoftTypescriptEtw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@microsoft/typescript-etw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logErrEvent(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logErrEvent")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logEvent(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logInfoEvent(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logInfoEvent")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logPerfEvent(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logPerfEvent")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStartBindFile(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartBindFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStartCommand(command: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logStartCommand")(command.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logStartParseSourceFile(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartParseSourceFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStartReadFile(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartReadFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStartResolveModule(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartResolveModule")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStartScheduledOperation(operationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartScheduledOperation")(operationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStartUpdateGraph(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartUpdateGraph")().asInstanceOf[Unit]
  
  inline def logStartUpdateProgram(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStartUpdateProgram")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStopBindFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopBindFile")().asInstanceOf[Unit]
  
  inline def logStopCommand(command: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logStopCommand")(command.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logStopParseSourceFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopParseSourceFile")().asInstanceOf[Unit]
  
  inline def logStopReadFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopReadFile")().asInstanceOf[Unit]
  
  inline def logStopResolveModule(success: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopResolveModule")(success.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logStopScheduledOperation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopScheduledOperation")().asInstanceOf[Unit]
  
  inline def logStopUpdateGraph(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopUpdateGraph")().asInstanceOf[Unit]
  
  inline def logStopUpdateProgram(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logStopUpdateProgram")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
