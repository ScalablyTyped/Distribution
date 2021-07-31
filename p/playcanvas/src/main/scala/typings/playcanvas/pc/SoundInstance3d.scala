package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pc.SoundInstance3d plays a {@link pc.Sound} in 3D.
  * @property position - The position of the sound in 3D space.
  * @property velocity - The velocity of the sound.
  * @property distanceModel - Determines which algorithm to use to reduce the volume of the audio as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Default is {@link pc.DISTANCE_LINEAR}.
  * @property refDistance - The reference distance for reducing volume as the sound source moves further from the listener.
  * @property maxDistance - The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore.
  * @property rollOffFactor - The factor used in the falloff equation.
  * @param manager - The sound manager.
  * @param sound - The sound to play.
  * @param options - Options for the instance.
  * @param [options.volume = 1] - The playback volume, between 0 and 1.
  * @param [options.pitch = 1] - The relative pitch, default of 1, plays at normal pitch.
  * @param [options.loop = false] - Whether the sound should loop when it reaches the end or not.
  * @param [options.startTime = 0] - The time from which the playback will start. Default is 0 to start at the beginning.
  * @param [options.duration = null] - The total time after the startTime when playback will stop or restart if loop is true.
  * @param [options.position = null] - The position of the sound in 3D space.
  * @param [options.velocity = null] - The velocity of the sound.
  * @param [options.distanceModel = pc.DISTANCE_LINEAR] - Determines which algorithm to use to reduce the volume of the audio as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Default is {@link pc.DISTANCE_LINEAR}.
  * @param [options.refDistance = 1] - The reference distance for reducing volume as the sound source moves further from the listener.
  * @param [options.maxDistance = 10000] - The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore.
  * @param [options.rollOffFactor = 1] - The factor used in the falloff equation.
  */
@js.native
trait SoundInstance3d
  extends StObject
     with SoundInstance {
  
  /**
    * Determines which algorithm to use to reduce the volume of the audio as it moves away from the listener. Can be:
    
    * {@link pc.DISTANCE_LINEAR}
    * {@link pc.DISTANCE_INVERSE}
    * {@link pc.DISTANCE_EXPONENTIAL}
    
    Default is {@link pc.DISTANCE_LINEAR}.
    */
  var distanceModel: String = js.native
  
  /**
    * The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore.
    */
  var maxDistance: Double = js.native
  
  /**
    * The position of the sound in 3D space.
    */
  var position: Vec3 = js.native
  
  /**
    * The reference distance for reducing volume as the sound source moves further from the listener.
    */
  var refDistance: Double = js.native
  
  /**
    * The factor used in the falloff equation.
    */
  var rollOffFactor: Double = js.native
  
  /**
    * The velocity of the sound.
    */
  var velocity: Vec3 = js.native
}
