package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserveCallbackResult extends StObject {
  
  /** 目标边界 */
  var boundingClientRect: BoundingClientRectResult
  
  /** 相交比例 */
  var intersectionRatio: Double
  
  /** 相交区域的边界 */
  var intersectionRect: IntersectionRectResult
  
  /** 参照区域的边界 */
  var relativeRect: RelativeRectResult
  
  /** 相交检测时的时间戳 */
  var time: Double
}
object ObserveCallbackResult {
  
  @scala.inline
  def apply(
    boundingClientRect: BoundingClientRectResult,
    intersectionRatio: Double,
    intersectionRect: IntersectionRectResult,
    relativeRect: RelativeRectResult,
    time: Double
  ): ObserveCallbackResult = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveCallbackResult]
  }
  
  @scala.inline
  implicit class ObserveCallbackResultMutableBuilder[Self <: ObserveCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingClientRect(value: BoundingClientRectResult): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRect(value: IntersectionRectResult): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeRect(value: RelativeRectResult): Self = StObject.set(x, "relativeRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
