package typings.msportalfxMock

import typings.msportalfxMock.mockFxMod.MockFx.TargetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlugin(targets: js.Array[TargetDefinition], runId: String, testId: String, port: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(targets.asInstanceOf[js.Any], runId.asInstanceOf[js.Any], testId.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PluginConfiguration extends StObject {
    
    var hosts: js.Array[String]
    
    var port: Double
    
    var runId: String
    
    var testId: String
  }
  object PluginConfiguration {
    
    inline def apply(hosts: js.Array[String], port: Double, runId: String, testId: String): PluginConfiguration = {
      val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], runId = runId.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginConfiguration]
    }
    
    extension [Self <: PluginConfiguration](x: Self) {
      
      inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRunId(value: String): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    }
  }
}
