package typings.nodeOsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.nodeOsUtils.anon.InputMb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetstatMod {
  
  @JSImport("node-os-utils/lib/netstat", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NetStat
  
  @js.native
  trait NetStat extends StObject {
    
    def inOut(): js.Promise[NetStatMetrics | String] = js.native
    def inOut(interval: Double): js.Promise[NetStatMetrics | String] = js.native
    
    def stats(): js.Promise[js.Array[NetStatInfo]] = js.native
  }
  
  trait NetStatInfo extends StObject {
    
    var inputBytes: String
    
    var interface: String
    
    var outputBytes: String
  }
  object NetStatInfo {
    
    inline def apply(inputBytes: String, interface: String, outputBytes: String): NetStatInfo = {
      val __obj = js.Dynamic.literal(inputBytes = inputBytes.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], outputBytes = outputBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetStatInfo]
    }
    
    extension [Self <: NetStatInfo](x: Self) {
      
      inline def setInputBytes(value: String): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
      
      inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      inline def setOutputBytes(value: String): Self = StObject.set(x, "outputBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetStatMetrics
    extends StObject
       with /* key */ StringDictionary[InputMb] {
    
    var total: InputMb
  }
  object NetStatMetrics {
    
    inline def apply(total: InputMb): NetStatMetrics = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetStatMetrics]
    }
    
    extension [Self <: NetStatMetrics](x: Self) {
      
      inline def setTotal(value: InputMb): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
