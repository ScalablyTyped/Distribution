package typings.naudiodon

import typings.naudiodon.mod.AudioOptions
import typings.naudiodon.mod.HostAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DefaultHostAPI extends StObject {
    
    var HostAPIs: js.Array[HostAPI] = js.native
    
    var defaultHostAPI: Double = js.native
  }
  object DefaultHostAPI {
    
    @scala.inline
    def apply(HostAPIs: js.Array[HostAPI], defaultHostAPI: Double): DefaultHostAPI = {
      val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultHostAPI]
    }
    
    @scala.inline
    implicit class DefaultHostAPIMutableBuilder[Self <: DefaultHostAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultHostAPI(value: Double): Self = StObject.set(x, "defaultHostAPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostAPIs(value: js.Array[HostAPI]): Self = StObject.set(x, "HostAPIs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostAPIsVarargs(value: HostAPI*): Self = StObject.set(x, "HostAPIs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InOptions extends StObject {
    
    var inOptions: AudioOptions = js.native
  }
  object InOptions {
    
    @scala.inline
    def apply(inOptions: AudioOptions): InOptions = {
      val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[InOptions]
    }
    
    @scala.inline
    implicit class InOptionsMutableBuilder[Self <: InOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInOptions(value: AudioOptions): Self = StObject.set(x, "inOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InOptionsOutOptions extends StObject {
    
    var inOptions: AudioOptions = js.native
    
    var outOptions: AudioOptions = js.native
  }
  object InOptionsOutOptions {
    
    @scala.inline
    def apply(inOptions: AudioOptions, outOptions: AudioOptions): InOptionsOutOptions = {
      val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[InOptionsOutOptions]
    }
    
    @scala.inline
    implicit class InOptionsOutOptionsMutableBuilder[Self <: InOptionsOutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInOptions(value: AudioOptions): Self = StObject.set(x, "inOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutOptions(value: AudioOptions): Self = StObject.set(x, "outOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutOptions extends StObject {
    
    var outOptions: AudioOptions = js.native
  }
  object OutOptions {
    
    @scala.inline
    def apply(outOptions: AudioOptions): OutOptions = {
      val __obj = js.Dynamic.literal(outOptions = outOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutOptions]
    }
    
    @scala.inline
    implicit class OutOptionsMutableBuilder[Self <: OutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutOptions(value: AudioOptions): Self = StObject.set(x, "outOptions", value.asInstanceOf[js.Any])
    }
  }
}
