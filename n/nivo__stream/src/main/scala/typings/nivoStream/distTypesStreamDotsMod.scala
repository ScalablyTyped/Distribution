package typings.nivoStream

import typings.nivoStream.distTypesTypesMod.DotComponent
import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamLayerDatum
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.start
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamDotsMod {
  
  @JSImport("@nivo/stream/dist/types/StreamDots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamDots[RawDatum /* <: StreamDatum */](hasDataDotComponentPositionGetSizeGetColorGetBorderWidthGetBorderColor: StreamDotsProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamDots")(hasDataDotComponentPositionGetSizeGetColorGetBorderWidthGetBorderColor.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StreamDotsProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var color: String
    
    var data: js.Array[StreamLayerDatum]
    
    var dotComponent: Exclude[js.UndefOr[DotComponent], Unit]
    
    def getBorderColor(datum: StreamLayerDatum): String
    
    def getBorderWidth(datum: StreamLayerDatum): Double
    
    def getColor(datum: StreamLayerDatum): String
    
    def getSize(datum: StreamLayerDatum): Double
    
    var id: String | Double
    
    var position: start | center | end
  }
  object StreamDotsProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](
      color: String,
      data: js.Array[StreamLayerDatum],
      dotComponent: Exclude[js.UndefOr[DotComponent], Unit],
      getBorderColor: StreamLayerDatum => String,
      getBorderWidth: StreamLayerDatum => Double,
      getColor: StreamLayerDatum => String,
      getSize: StreamLayerDatum => Double,
      id: String | Double,
      position: start | center | end
    ): StreamDotsProps[RawDatum] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dotComponent = dotComponent.asInstanceOf[js.Any], getBorderColor = js.Any.fromFunction1(getBorderColor), getBorderWidth = js.Any.fromFunction1(getBorderWidth), getColor = js.Any.fromFunction1(getColor), getSize = js.Any.fromFunction1(getSize), id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDotsProps[RawDatum]]
    }
    
    extension [Self <: StreamDotsProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamDotsProps[RawDatum]) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[StreamLayerDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: StreamLayerDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDotComponent(value: Exclude[js.UndefOr[DotComponent], Unit]): Self = StObject.set(x, "dotComponent", value.asInstanceOf[js.Any])
      
      inline def setGetBorderColor(value: StreamLayerDatum => String): Self = StObject.set(x, "getBorderColor", js.Any.fromFunction1(value))
      
      inline def setGetBorderWidth(value: StreamLayerDatum => Double): Self = StObject.set(x, "getBorderWidth", js.Any.fromFunction1(value))
      
      inline def setGetColor(value: StreamLayerDatum => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
      
      inline def setGetSize(value: StreamLayerDatum => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: start | center | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
