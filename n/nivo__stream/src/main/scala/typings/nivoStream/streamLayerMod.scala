package typings.nivoStream

import typings.nivoColors.inheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoStream.typesMod.StreamDatum
import typings.nivoStream.typesMod.StreamLayerData
import typings.nivoStream.typesMod.Tooltip
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamLayerMod {
  
  @JSImport("@nivo/stream/dist/types/StreamLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamLayer[RawDatum /* <: StreamDatum */](hasLayerFillOpacityBorderWidthGetBorderColorIsInteractiveTooltip: StreamLayerProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamLayer")(hasLayerFillOpacityBorderWidthGetBorderColorIsInteractiveTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StreamLayerProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var borderWidth: Double
    
    var fillOpacity: Double
    
    var getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData]
    
    var isInteractive: Boolean
    
    var layer: StreamLayerData
    
    var tooltip: Tooltip
  }
  object StreamLayerProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](
      borderWidth: Double,
      fillOpacity: Double,
      getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData],
      isInteractive: Boolean,
      layer: StreamLayerData,
      tooltip: Tooltip
    ): StreamLayerProps[RawDatum] = {
      val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], getBorderColor = getBorderColor.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamLayerProps[RawDatum]]
    }
    
    extension [Self <: StreamLayerProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamLayerProps[RawDatum]) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setGetBorderColor(value: InheritedColorConfigCustomFunction[StreamLayerData]): Self = StObject.set(x, "getBorderColor", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: StreamLayerData): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
