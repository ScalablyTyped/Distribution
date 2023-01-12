package typings.naudiodon

import typings.naudiodon.mod.AudioOptions
import typings.naudiodon.mod.HostInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultHostAPI extends StObject {
    
    /** Array of HostInfo objects containing information about a specific host API. */
    var HostAPIs: js.Array[HostInfo]
    
    /**
      * The index of the default host API. The default host API will be the lowest common
      * denominator host API on the current platform and is unlikely to provide the best performance.
      * Will be a non-negative value ranging from 0 to (HostAPIs.length-1) indicating the default
      * host API index or a negative value if PortAudio is not initialized or an error is encountered.
      */
    var defaultHostAPI: Double
  }
  object DefaultHostAPI {
    
    inline def apply(HostAPIs: js.Array[HostInfo], defaultHostAPI: Double): DefaultHostAPI = {
      val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultHostAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultHostAPI] (val x: Self) extends AnyVal {
      
      inline def setDefaultHostAPI(value: Double): Self = StObject.set(x, "defaultHostAPI", value.asInstanceOf[js.Any])
      
      inline def setHostAPIs(value: js.Array[HostInfo]): Self = StObject.set(x, "HostAPIs", value.asInstanceOf[js.Any])
      
      inline def setHostAPIsVarargs(value: HostInfo*): Self = StObject.set(x, "HostAPIs", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InOptionsOutOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutOptions] (val x: Self) extends AnyVal {
      
      inline def setOutOptions(value: AudioOptions): Self = StObject.set(x, "outOptions", value.asInstanceOf[js.Any])
    }
  }
}
