package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Errors
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildOutputMod {
  
  @JSImport("next/dist/build/output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ampValidation(page: String, errors: js.Array[AmpStatus], warnings: js.Array[AmpStatus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ampValidation")(page.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def formatAmpMessages(amp: AmpPageStatus): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAmpMessages")(amp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def reportTrigger(trigger: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportTrigger")(trigger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startedDevelopmentServer(appUrl: String, bindAddr: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startedDevelopmentServer")(appUrl.asInstanceOf[js.Any], bindAddr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watchCompilers(client: Compiler, server: Compiler, edgeServer: Compiler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchCompilers")(client.asInstanceOf[js.Any], server.asInstanceOf[js.Any], edgeServer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AmpPageStatus = StringDictionary[Errors]
  
  trait AmpStatus extends StObject {
    
    var code: String
    
    var col: Double
    
    var line: Double
    
    var message: String
    
    var specUrl: String | Null
  }
  object AmpStatus {
    
    inline def apply(code: String, col: Double, line: Double, message: String): AmpStatus = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], specUrl = null)
      __obj.asInstanceOf[AmpStatus]
    }
    
    extension [Self <: AmpStatus](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSpecUrl(value: String): Self = StObject.set(x, "specUrl", value.asInstanceOf[js.Any])
      
      inline def setSpecUrlNull: Self = StObject.set(x, "specUrl", null)
    }
  }
}
