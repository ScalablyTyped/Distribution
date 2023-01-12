package typings.nivoStream

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamLayerData
import typings.nivoStream.distTypesTypesMod.Tooltip
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamLayersMod {
  
  @JSImport("@nivo/stream/dist/types/StreamLayers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamLayers[RawDatum /* <: StreamDatum */](param0: StreamLayersProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamLayers")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StreamLayersProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var borderWidth: Double
    
    var fillOpacity: Double
    
    var getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData]
    
    var isInteractive: Boolean
    
    var layers: js.Array[StreamLayerData]
    
    var tooltip: Tooltip
  }
  object StreamLayersProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](
      borderWidth: Double,
      fillOpacity: Double,
      getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData],
      isInteractive: Boolean,
      layers: js.Array[StreamLayerData],
      tooltip: Tooltip
    ): StreamLayersProps[RawDatum] = {
      val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], getBorderColor = getBorderColor.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamLayersProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamLayersProps[?], RawDatum /* <: StreamDatum */] (val x: Self & StreamLayersProps[RawDatum]) extends AnyVal {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setGetBorderColor(value: InheritedColorConfigCustomFunction[StreamLayerData]): Self = StObject.set(x, "getBorderColor", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[StreamLayerData]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: StreamLayerData*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
