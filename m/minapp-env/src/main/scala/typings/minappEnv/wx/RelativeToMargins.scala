package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 用来扩展（或收缩）参照节点布局区域的边界 */
trait RelativeToMargins extends StObject {
  
  /** 节点布局区域的下边界 */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /** 节点布局区域的左边界 */
  var left: js.UndefOr[Double] = js.undefined
  
  /** 节点布局区域的右边界 */
  var right: js.UndefOr[Double] = js.undefined
  
  /** 节点布局区域的上边界 */
  var top: js.UndefOr[Double] = js.undefined
}
object RelativeToMargins {
  
  inline def apply(): RelativeToMargins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeToMargins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeToMargins] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
