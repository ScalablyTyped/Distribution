package typings.naudiodon

import typings.naudiodon.mod.AudioOptions
import typings.naudiodon.mod.HostAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultHostAPI extends StObject {
    
    var HostAPIs: js.Array[HostAPI]
    
    var defaultHostAPI: Double
  }
  object DefaultHostAPI {
    
    inline def apply(HostAPIs: js.Array[HostAPI], defaultHostAPI: Double): DefaultHostAPI = {
      val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultHostAPI]
    }
    
    extension [Self <: DefaultHostAPI](x: Self) {
      
      inline def setDefaultHostAPI(value: Double): Self = StObject.set(x, "defaultHostAPI", value.asInstanceOf[js.Any])
      
      inline def setHostAPIs(value: js.Array[HostAPI]): Self = StObject.set(x, "HostAPIs", value.asInstanceOf[js.Any])
      
      inline def setHostAPIsVarargs(value: HostAPI*): Self = StObject.set(x, "HostAPIs", js.Array(value :_*))
    }
  }
  
  trait InOptions extends StObject {
    
    var inOptions: AudioOptions
  }
  object InOptions {
    
    inline def apply(inOptions: AudioOptions): InOptions = {
      val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[InOptions]
    }
    
    extension [Self <: InOptions](x: Self) {
      
      inline def setInOptions(value: AudioOptions): Self = StObject.set(x, "inOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait InOptionsOutOptions extends StObject {
    
    var inOptions: AudioOptions
    
    var outOptions: AudioOptions
  }
  object InOptionsOutOptions {
    
    inline def apply(inOptions: AudioOptions, outOptions: AudioOptions): InOptionsOutOptions = {
      val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[InOptionsOutOptions]
    }
    
    extension [Self <: InOptionsOutOptions](x: Self) {
      
      inline def setInOptions(value: AudioOptions): Self = StObject.set(x, "inOptions", value.asInstanceOf[js.Any])
      
      inline def setOutOptions(value: AudioOptions): Self = StObject.set(x, "outOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutOptions extends StObject {
    
    var outOptions: AudioOptions
  }
  object OutOptions {
    
    inline def apply(outOptions: AudioOptions): OutOptions = {
      val __obj = js.Dynamic.literal(outOptions = outOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutOptions]
    }
    
    extension [Self <: OutOptions](x: Self) {
      
      inline def setOutOptions(value: AudioOptions): Self = StObject.set(x, "outOptions", value.asInstanceOf[js.Any])
    }
  }
}
