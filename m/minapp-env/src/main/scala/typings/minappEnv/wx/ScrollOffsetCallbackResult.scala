package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollOffsetCallbackResult extends StObject {
  
  /** 节点的 dataset */
  var dataset: js.Object
  
  /** 节点的 ID */
  var id: String
  
  /** 节点的水平滚动位置 */
  var scrollLeft: Double
  
  /** 节点的竖直滚动位置 */
  var scrollTop: Double
}
object ScrollOffsetCallbackResult {
  
  inline def apply(dataset: js.Object, id: String, scrollLeft: Double, scrollTop: Double): ScrollOffsetCallbackResult = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOffsetCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollOffsetCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setDataset(value: js.Object): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
