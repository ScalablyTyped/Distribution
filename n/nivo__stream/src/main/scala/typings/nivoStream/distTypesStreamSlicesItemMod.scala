package typings.nivoStream

import typings.nivoStream.distTypesTypesMod.StackTooltip
import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamSliceData
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamSlicesItemMod {
  
  @JSImport("@nivo/stream/dist/types/StreamSlicesItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamSlicesItem[RawDatum /* <: StreamDatum */](hasSliceHeightTooltip: StreamSlicesItemProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamSlicesItem")(hasSliceHeightTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StreamSlicesItemProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var height: Double
    
    var slice: StreamSliceData
    
    var tooltip: StackTooltip
  }
  object StreamSlicesItemProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](height: Double, slice: StreamSliceData, tooltip: StackTooltip): StreamSlicesItemProps[RawDatum] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSlicesItemProps[RawDatum]]
    }
    
    extension [Self <: StreamSlicesItemProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamSlicesItemProps[RawDatum]) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: StreamSliceData): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: StackTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
