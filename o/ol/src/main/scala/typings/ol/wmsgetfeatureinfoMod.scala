package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmsgetfeatureinfoMod {
  
  @JSImport("ol/format/WMSGetFeatureInfo", JSImport.Default)
  @js.native
  class default () extends WMSGetFeatureInfo {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WMSGetFeatureInfo
    extends typings.ol.xmlfeatureMod.default {
    
    def getLayers(): js.Array[String] = js.native
    
    def setLayers(layers: js.Array[String]): Unit = js.native
  }
}
