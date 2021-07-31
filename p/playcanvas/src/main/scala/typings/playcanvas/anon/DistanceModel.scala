package typings.playcanvas.anon

import typings.playcanvas.pc.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceModel extends StObject {
  
  var distanceModel: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[Vec3] = js.undefined
  
  var refDistance: js.UndefOr[Double] = js.undefined
  
  var rollOffFactor: js.UndefOr[Double] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Vec3] = js.undefined
  
  var volume: js.UndefOr[Double] = js.undefined
}
object DistanceModel {
  
  @scala.inline
  def apply(): DistanceModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceModel]
  }
  
  @scala.inline
  implicit class DistanceModelMutableBuilder[Self <: DistanceModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
    
    @scala.inline
    def setRollOffFactor(value: Double): Self = StObject.set(x, "rollOffFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollOffFactorUndefined: Self = StObject.set(x, "rollOffFactor", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setVelocity(value: Vec3): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
