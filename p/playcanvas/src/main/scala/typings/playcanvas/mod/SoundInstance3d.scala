package typings.playcanvas.mod

import typings.playcanvas.anon.DistanceModel
import typings.std.DistanceModelType
import typings.std.PannerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SoundInstance3d plays a {@link Sound} in 3D.
  *
  * @augments SoundInstance
  */
@JSImport("playcanvas", "SoundInstance3d")
@js.native
open class SoundInstance3d protected () extends SoundInstance {
  /**
    * Create a new SoundInstance3d instance.
    *
    * @param {import('./manager.js').SoundManager} manager - The sound manager.
    * @param {import('./sound.js').Sound} sound - The sound to play.
    * @param {object} options - Options for the instance.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - Whether the sound should loop when it reaches the
    * end or not.
    * @param {number} [options.startTime=0] - The time from which the playback will start. Default
    * is 0 to start at the beginning.
    * @param {number} [options.duration=null] - The total time after the startTime when playback
    * will stop or restart if loop is true.
    * @param {Vec3} [options.position=null] - The position of the sound in 3D space.
    * @param {string} [options.distanceModel=DISTANCE_LINEAR] - Determines which algorithm to use
    * to reduce the volume of the audio as it moves away from the listener. Can be:
    *
    * - {@link DISTANCE_LINEAR}
    * - {@link DISTANCE_INVERSE}
    * - {@link DISTANCE_EXPONENTIAL}
    *
    * Default is {@link DISTANCE_LINEAR}.
    * @param {number} [options.refDistance=1] - The reference distance for reducing volume as the
    * sound source moves further from the listener.
    * @param {number} [options.maxDistance=10000] - The maximum distance from the listener at which
    * audio falloff stops. Note the volume of the audio is not 0 after this distance, but just
    * doesn't fall off anymore.
    * @param {number} [options.rollOffFactor=1] - The factor used in the falloff equation.
    */
  def this(manager: SoundManager, sound: Sound) = this()
  def this(manager: SoundManager, sound: Sound, options: DistanceModel) = this()
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _position: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _velocity: Any = js.native
  
  def distanceModel: DistanceModelType = js.native
  /**
    * Determines which algorithm to use to reduce the volume of the audio as it moves away from
    * the listener. Can be:
    *
    * - {@link DISTANCE_LINEAR}
    * - {@link DISTANCE_INVERSE}
    * - {@link DISTANCE_EXPONENTIAL}
    *
    * Default is {@link DISTANCE_LINEAR}.
    *
    * @type {string}
    */
  def distanceModel_=(arg: DistanceModelType): Unit = js.native
  
  def maxDistance: Double = js.native
  /**
    * The maximum distance from the listener at which audio falloff stops. Note the volume of the
    * audio is not 0 after this distance, but just doesn't fall off anymore.
    *
    * @type {number}
    */
  def maxDistance_=(arg: Double): Unit = js.native
  
  var panner: PannerNode = js.native
  
  def position: Vec3 = js.native
  /**
    * The position of the sound in 3D space.
    *
    * @type {Vec3}
    */
  def position_=(arg: Vec3): Unit = js.native
  
  def refDistance: Double = js.native
  /**
    * The reference distance for reducing volume as the sound source moves further from the
    * listener.
    *
    * @type {number}
    */
  def refDistance_=(arg: Double): Unit = js.native
  
  def rollOffFactor: Double = js.native
  /**
    * The factor used in the falloff equation.
    *
    * @type {number}
    */
  def rollOffFactor_=(arg: Double): Unit = js.native
  
  def velocity: Vec3 = js.native
  /**
    * The velocity of the sound.
    *
    * @type {Vec3}
    * @deprecated
    * @ignore
    */
  def velocity_=(arg: Vec3): Unit = js.native
}
