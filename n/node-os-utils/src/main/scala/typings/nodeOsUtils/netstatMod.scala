package typings.nodeOsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.nodeOsUtils.anon.InputMb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netstatMod {
  
  @JSImport("node-os-utils/lib/netstat", JSImport.Default)
  @js.native
  class default ()
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
    
    @scala.inline
    def apply(inputBytes: String, interface: String, outputBytes: String): NetStatInfo = {
      val __obj = js.Dynamic.literal(inputBytes = inputBytes.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], outputBytes = outputBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetStatInfo]
    }
    
    @scala.inline
    implicit class NetStatInfoMutableBuilder[Self <: NetStatInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputBytes(value: String): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputBytes(value: String): Self = StObject.set(x, "outputBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetStatMetrics
    extends StObject
       with /* key */ StringDictionary[InputMb] {
    
    var total: InputMb
  }
  object NetStatMetrics {
    
    @scala.inline
    def apply(total: InputMb): NetStatMetrics = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetStatMetrics]
    }
    
    @scala.inline
    implicit class NetStatMetricsMutableBuilder[Self <: NetStatMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotal(value: InputMb): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
