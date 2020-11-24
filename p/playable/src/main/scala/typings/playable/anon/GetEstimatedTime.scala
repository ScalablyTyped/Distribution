package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEstimatedTime extends js.Object {
  
  def getEstimatedTime(): Double = js.native
}
object GetEstimatedTime {
  
  @scala.inline
  def apply(getEstimatedTime: () => Double): GetEstimatedTime = {
    val __obj = js.Dynamic.literal(getEstimatedTime = js.Any.fromFunction0(getEstimatedTime))
    __obj.asInstanceOf[GetEstimatedTime]
  }
  
  @scala.inline
  implicit class GetEstimatedTimeOps[Self <: GetEstimatedTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEstimatedTime(value: () => Double): Self = this.set("getEstimatedTime", js.Any.fromFunction0(value))
  }
}
