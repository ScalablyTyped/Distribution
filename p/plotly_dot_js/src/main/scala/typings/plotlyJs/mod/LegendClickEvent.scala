package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialConfig
import typings.plotlyJs.anon.PartialLayout
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendClickEvent extends StObject {
  
  var config: PartialConfig
  
  var curveNumber: Double
  
  var data: js.Array[Data]
  
  var event: MouseEvent
  
  var expandedIndex: Double
  
  var frames: js.Array[Frame]
  
  var fullData: js.Array[Data]
  
  var fullLayout: PartialLayout
  
  var layout: PartialLayout
  
  var node: PlotlyHTMLElement
}
object LegendClickEvent {
  
  inline def apply(
    config: PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: PartialLayout,
    layout: PartialLayout,
    node: PlotlyHTMLElement
  ): LegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendClickEvent] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setExpandedIndex(value: Double): Self = StObject.set(x, "expandedIndex", value.asInstanceOf[js.Any])
    
    inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setFullData(value: js.Array[Data]): Self = StObject.set(x, "fullData", value.asInstanceOf[js.Any])
    
    inline def setFullDataVarargs(value: Data*): Self = StObject.set(x, "fullData", js.Array(value*))
    
    inline def setFullLayout(value: PartialLayout): Self = StObject.set(x, "fullLayout", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setNode(value: PlotlyHTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
