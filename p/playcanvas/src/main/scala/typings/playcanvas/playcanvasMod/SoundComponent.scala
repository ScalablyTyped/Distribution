package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.SoundComponent
  * @extends pc.Component
  * @classdesc The Sound Component controls playback of {@link pc.Sound}s.
  * @description Create a new Sound Component.
  * @param {pc.SoundComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The entity that the Component is attached to
  * @property {Number} volume The volume modifier to play the audio with. In range 0-1.
  * @property {Number} pitch The pitch modifier to play the audio with. Must be larger than 0.01
  * @property {Boolean} positional If true the audio will play back at the location of the Entity in space, so the audio will be affect by the position of the {@link pc.AudioListenerComponent}.
  * @property {String} distanceModel Determines which algorithm to use to reduce the volume of the sound as it moves away from the listener. Can be one of {@link pc.DISTANCE_LINEAR}, {@link pc.DISTANCE_INVERSE} or {@link pc.DISTANCE_EXPONENTIAL}. Default is {@link pc.DISTANCE_LINEAR}.
  * @property {Number} refDistance The reference distance for reducing volume as the sound source moves further from the listener.
  * @property {Number} maxDistance The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore.
  * @property {Number} rollOffFactor The factor used in the falloff equation.
  * @property {Object} slots A dictionary that contains the {@link pc.SoundSlot}s managed by this Component.
  */
@JSImport("playcanvas", "SoundComponent")
@js.native
class SoundComponent protected ()
  extends typings.playcanvas.pcNs.SoundComponent {
  def this(system: typings.playcanvas.pcNs.SoundComponentSystem, entity: typings.playcanvas.pcNs.Entity) = this()
}

