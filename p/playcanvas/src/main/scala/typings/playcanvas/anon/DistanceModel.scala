package typings.playcanvas.anon

import typings.playcanvas.pc.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceModel extends js.Object {
  
  var distanceModel: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var maxDistance: js.UndefOr[Double] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Vec3] = js.native
  
  var refDistance: js.UndefOr[Double] = js.native
  
  var rollOffFactor: js.UndefOr[Double] = js.native
  
  var startTime: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[Vec3] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object DistanceModel {
  
  @scala.inline
  def apply(): DistanceModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceModel]
  }
  
  @scala.inline
  implicit class DistanceModelOps[Self <: DistanceModel] (val x: Self) extends AnyVal {
    
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
    def setDistanceModel(value: String): Self = this.set("distanceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceModel: Self = this.set("distanceModel", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setPosition(value: Vec3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRefDistance(value: Double): Self = this.set("refDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefDistance: Self = this.set("refDistance", js.undefined)
    
    @scala.inline
    def setRollOffFactor(value: Double): Self = this.set("rollOffFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollOffFactor: Self = this.set("rollOffFactor", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setVelocity(value: Vec3): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
