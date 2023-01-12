package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSourceComponentData extends StObject {
  
  var `3d`: Boolean
  
  var activate: Boolean
  
  var assets: js.Array[Any]
  
  var channel: Any
  
  var currentSource: Any
  
  var distanceModel: String
  
  var enabled: Boolean
  
  var loop: Boolean
  
  var maxDistance: Double
  
  var minDistance: Double
  
  var paused: Boolean
  
  var pitch: Double
  
  var rollOffFactor: Double
  
  var volume: Double
}
object AudioSourceComponentData {
  
  inline def apply(
    `3d`: Boolean,
    activate: Boolean,
    assets: js.Array[Any],
    channel: Any,
    currentSource: Any,
    distanceModel: String,
    enabled: Boolean,
    loop: Boolean,
    maxDistance: Double,
    minDistance: Double,
    paused: Boolean,
    pitch: Double,
    rollOffFactor: Double,
    volume: Double
  ): AudioSourceComponentData = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], assets = assets.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], currentSource = currentSource.asInstanceOf[js.Any], distanceModel = distanceModel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], rollOffFactor = rollOffFactor.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.updateDynamic("3d")(`3d`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSourceComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioSourceComponentData] (val x: Self) extends AnyVal {
    
    inline def set3d(value: Boolean): Self = StObject.set(x, "3d", value.asInstanceOf[js.Any])
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setAssets(value: js.Array[Any]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: Any*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setChannel(value: Any): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCurrentSource(value: Any): Self = StObject.set(x, "currentSource", value.asInstanceOf[js.Any])
    
    inline def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setRollOffFactor(value: Double): Self = StObject.set(x, "rollOffFactor", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
