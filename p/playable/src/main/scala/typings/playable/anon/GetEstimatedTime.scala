package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEstimatedTime extends StObject {
  
  def getEstimatedTime(): Double
}
object GetEstimatedTime {
  
  @scala.inline
  def apply(getEstimatedTime: () => Double): GetEstimatedTime = {
    val __obj = js.Dynamic.literal(getEstimatedTime = js.Any.fromFunction0(getEstimatedTime))
    __obj.asInstanceOf[GetEstimatedTime]
  }
  
  @scala.inline
  implicit class GetEstimatedTimeMutableBuilder[Self <: GetEstimatedTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEstimatedTime(value: () => Double): Self = StObject.set(x, "getEstimatedTime", js.Any.fromFunction0(value))
  }
}
