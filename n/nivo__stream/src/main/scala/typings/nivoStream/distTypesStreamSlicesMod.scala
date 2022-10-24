package typings.nivoStream

import typings.nivoStream.distTypesTypesMod.StackTooltip
import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamSliceData
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamSlicesMod {
  
  @JSImport("@nivo/stream/dist/types/StreamSlices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamSlices[RawDatum /* <: StreamDatum */](param0: StreamSlicesProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamSlices")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StreamSlicesProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var height: Double
    
    var slices: js.Array[StreamSliceData]
    
    var tooltip: StackTooltip
  }
  object StreamSlicesProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](height: Double, slices: js.Array[StreamSliceData], tooltip: StackTooltip): StreamSlicesProps[RawDatum] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], slices = slices.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSlicesProps[RawDatum]]
    }
    
    extension [Self <: StreamSlicesProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamSlicesProps[RawDatum]) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSlices(value: js.Array[StreamSliceData]): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      inline def setSlicesVarargs(value: StreamSliceData*): Self = StObject.set(x, "slices", js.Array(value*))
      
      inline def setTooltip(value: StackTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
