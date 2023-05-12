package typings.playcanvas.global.pc

import typings.playcanvas.anon.DistanceModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SoundInstance3d plays a {@link Sound} in 3D.
  *
  * @augments SoundInstance
  */
@JSGlobal("pc.SoundInstance3d")
@js.native
open class SoundInstance3d protected ()
  extends typings.playcanvas.mod.SoundInstance3d {
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
  def this(manager: typings.playcanvas.mod.SoundManager, sound: typings.playcanvas.mod.Sound) = this()
  def this(
    manager: typings.playcanvas.mod.SoundManager,
    sound: typings.playcanvas.mod.Sound,
    options: DistanceModel
  ) = this()
}
