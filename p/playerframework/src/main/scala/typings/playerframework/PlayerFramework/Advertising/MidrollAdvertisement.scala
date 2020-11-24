package typings.playerframework.PlayerFramework.Advertising

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MidrollAdvertisement extends AdvertisementBase {
  
  var time: Double = js.native
  
  var timePercentage: Double = js.native
}
object MidrollAdvertisement {
  
  @scala.inline
  def apply(source: js.Any, time: Double, timePercentage: Double): MidrollAdvertisement = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timePercentage = timePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidrollAdvertisement]
  }
  
  @scala.inline
  implicit class MidrollAdvertisementOps[Self <: MidrollAdvertisement] (val x: Self) extends AnyVal {
    
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
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePercentage(value: Double): Self = this.set("timePercentage", value.asInstanceOf[js.Any])
  }
}
