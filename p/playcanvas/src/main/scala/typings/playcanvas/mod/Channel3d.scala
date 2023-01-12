package typings.playcanvas.mod

import typings.std.DistanceModelType
import typings.std.GainNode
import typings.std.PannerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 3D audio channel.
  *
  * @ignore
  */
trait Channel3d
  extends StObject
     with Channel {
  
  var distanceModel: String
  
  def getDistanceModel(): DistanceModelType
  
  def getMaxDistance(): Double
  
  def getMinDistance(): Double
  
  def getPosition(): Vec3
  
  def getRollOffFactor(): Double
  
  def getVelocity(): Vec3
  
  var maxDistance: Double
  
  var minDistance: Double
  
  var panner: PannerNode
  
  var position: Vec3
  
  var rollOffFactor: Double
  
  def setDistanceModel(distanceModel: Any): Unit
  
  def setMaxDistance(max: Any): Unit
  
  def setMinDistance(min: Any): Unit
  
  def setPosition(position: Any): Unit
  
  def setRollOffFactor(factor: Any): Unit
  
  def setVelocity(velocity: Any): Unit
  
  var velocity: Vec3
}
object Channel3d {
  
  inline def apply(
    _createSource: () => Unit,
    distanceModel: String,
    gain: GainNode,
    getDistanceModel: () => DistanceModelType,
    getDuration: () => Any,
    getLoop: () => Boolean,
    getMaxDistance: () => Double,
    getMinDistance: () => Double,
    getPitch: () => Double,
    getPosition: () => Vec3,
    getRollOffFactor: () => Double,
    getVelocity: () => Vec3,
    getVolume: () => Double,
    isPlaying: () => Boolean,
    loop: Boolean,
    manager: SoundManager,
    maxDistance: Double,
    minDistance: Double,
    onManagerResume: () => Unit,
    onManagerSuspend: () => Unit,
    onManagerVolumeChange: () => Unit,
    panner: PannerNode,
    pause: () => Unit,
    paused: Boolean,
    pitch: Double,
    play: () => Unit,
    position: Vec3,
    rollOffFactor: Double,
    setDistanceModel: Any => Unit,
    setLoop: Boolean => Unit,
    setMaxDistance: Any => Unit,
    setMinDistance: Any => Unit,
    setPitch: Any => Unit,
    setPosition: Any => Unit,
    setRollOffFactor: Any => Unit,
    setVelocity: Any => Unit,
    setVolume: Double => Unit,
    sound: Sound,
    source: typings.std.Node,
    startOffset: Double,
    startTime: Double,
    stop: () => Unit,
    suspended: Boolean,
    unpause: () => Unit,
    velocity: Vec3,
    volume: Double
  ): Channel3d = {
    val __obj = js.Dynamic.literal(_createSource = js.Any.fromFunction0(_createSource), distanceModel = distanceModel.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any], getDistanceModel = js.Any.fromFunction0(getDistanceModel), getDuration = js.Any.fromFunction0(getDuration), getLoop = js.Any.fromFunction0(getLoop), getMaxDistance = js.Any.fromFunction0(getMaxDistance), getMinDistance = js.Any.fromFunction0(getMinDistance), getPitch = js.Any.fromFunction0(getPitch), getPosition = js.Any.fromFunction0(getPosition), getRollOffFactor = js.Any.fromFunction0(getRollOffFactor), getVelocity = js.Any.fromFunction0(getVelocity), getVolume = js.Any.fromFunction0(getVolume), isPlaying = js.Any.fromFunction0(isPlaying), loop = loop.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], onManagerResume = js.Any.fromFunction0(onManagerResume), onManagerSuspend = js.Any.fromFunction0(onManagerSuspend), onManagerVolumeChange = js.Any.fromFunction0(onManagerVolumeChange), panner = panner.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), position = position.asInstanceOf[js.Any], rollOffFactor = rollOffFactor.asInstanceOf[js.Any], setDistanceModel = js.Any.fromFunction1(setDistanceModel), setLoop = js.Any.fromFunction1(setLoop), setMaxDistance = js.Any.fromFunction1(setMaxDistance), setMinDistance = js.Any.fromFunction1(setMinDistance), setPitch = js.Any.fromFunction1(setPitch), setPosition = js.Any.fromFunction1(setPosition), setRollOffFactor = js.Any.fromFunction1(setRollOffFactor), setVelocity = js.Any.fromFunction1(setVelocity), setVolume = js.Any.fromFunction1(setVolume), sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), suspended = suspended.asInstanceOf[js.Any], unpause = js.Any.fromFunction0(unpause), velocity = velocity.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel3d]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channel3d] (val x: Self) extends AnyVal {
    
    inline def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    inline def setGetDistanceModel(value: () => DistanceModelType): Self = StObject.set(x, "getDistanceModel", js.Any.fromFunction0(value))
    
    inline def setGetMaxDistance(value: () => Double): Self = StObject.set(x, "getMaxDistance", js.Any.fromFunction0(value))
    
    inline def setGetMinDistance(value: () => Double): Self = StObject.set(x, "getMinDistance", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Vec3): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetRollOffFactor(value: () => Double): Self = StObject.set(x, "getRollOffFactor", js.Any.fromFunction0(value))
    
    inline def setGetVelocity(value: () => Vec3): Self = StObject.set(x, "getVelocity", js.Any.fromFunction0(value))
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setPanner(value: PannerNode): Self = StObject.set(x, "panner", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRollOffFactor(value: Double): Self = StObject.set(x, "rollOffFactor", value.asInstanceOf[js.Any])
    
    inline def setSetDistanceModel(value: Any => Unit): Self = StObject.set(x, "setDistanceModel", js.Any.fromFunction1(value))
    
    inline def setSetMaxDistance(value: Any => Unit): Self = StObject.set(x, "setMaxDistance", js.Any.fromFunction1(value))
    
    inline def setSetMinDistance(value: Any => Unit): Self = StObject.set(x, "setMinDistance", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Any => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetRollOffFactor(value: Any => Unit): Self = StObject.set(x, "setRollOffFactor", js.Any.fromFunction1(value))
    
    inline def setSetVelocity(value: Any => Unit): Self = StObject.set(x, "setVelocity", js.Any.fromFunction1(value))
    
    inline def setVelocity(value: Vec3): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
