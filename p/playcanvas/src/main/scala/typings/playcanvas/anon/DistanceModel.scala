package typings.playcanvas.anon

import typings.playcanvas.mod.Vec3
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
  
  var volume: js.UndefOr[Double] = js.undefined
}
object DistanceModel {
  
  inline def apply(): DistanceModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceModel]
  }
  
  extension [Self <: DistanceModel](x: Self) {
    
    inline def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    inline def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
    
    inline def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
    
    inline def setRollOffFactor(value: Double): Self = StObject.set(x, "rollOffFactor", value.asInstanceOf[js.Any])
    
    inline def setRollOffFactorUndefined: Self = StObject.set(x, "rollOffFactor", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
