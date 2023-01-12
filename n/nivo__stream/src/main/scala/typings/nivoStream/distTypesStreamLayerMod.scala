package typings.nivoStream

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamLayerData
import typings.nivoStream.distTypesTypesMod.Tooltip
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamLayerMod {
  
  @JSImport("@nivo/stream/dist/types/StreamLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamLayer[RawDatum /* <: StreamDatum */](param0: StreamLayerProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamLayerProps[?], RawDatum /* <: StreamDatum */] (val x: Self & StreamLayerProps[RawDatum]) extends AnyVal {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setGetBorderColor(value: InheritedColorConfigCustomFunction[StreamLayerData]): Self = StObject.set(x, "getBorderColor", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: StreamLayerData): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
