package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 目标边界 */
@js.native
trait BoundingClientRectResult extends StObject {
  
  /** 下边界 */
  var bottom: Double = js.native
  
  /** 左边界 */
  var left: Double = js.native
  
  /** 右边界 */
  var right: Double = js.native
  
  /** 上边界 */
  var top: Double = js.native
}
object BoundingClientRectResult {
  
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): BoundingClientRectResult = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingClientRectResult]
  }
  
  @scala.inline
  implicit class BoundingClientRectResultMutableBuilder[Self <: BoundingClientRectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
