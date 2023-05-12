package typings.micro

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcLibErrorMod {
  
  @JSImport("micro/types/src/lib/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logError(message: String, errorCode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logError")(message.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
