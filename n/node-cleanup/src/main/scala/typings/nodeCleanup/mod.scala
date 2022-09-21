package typings.nodeCleanup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(cleanupHandler: Unit, stderrMessages: StderrMessages): Unit = (^.asInstanceOf[js.Dynamic].apply(cleanupHandler.asInstanceOf[js.Any], stderrMessages.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(cleanupHandler: Handler): Unit = ^.asInstanceOf[js.Dynamic].apply(cleanupHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(cleanupHandler: Handler, stderrMessages: StderrMessages): Unit = (^.asInstanceOf[js.Dynamic].apply(cleanupHandler.asInstanceOf[js.Any], stderrMessages.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node-cleanup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uninstall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Unit]
  
  type Handler = js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]]
  
  trait StderrMessages extends StObject {
    
    var ctrl_C: js.UndefOr[String] = js.undefined
    
    var uncaughtException: js.UndefOr[String] = js.undefined
  }
  object StderrMessages {
    
    inline def apply(): StderrMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StderrMessages]
    }
    
    extension [Self <: StderrMessages](x: Self) {
      
      inline def setCtrl_C(value: String): Self = StObject.set(x, "ctrl_C", value.asInstanceOf[js.Any])
      
      inline def setCtrl_CUndefined: Self = StObject.set(x, "ctrl_C", js.undefined)
      
      inline def setUncaughtException(value: String): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
      
      inline def setUncaughtExceptionUndefined: Self = StObject.set(x, "uncaughtException", js.undefined)
    }
  }
}
