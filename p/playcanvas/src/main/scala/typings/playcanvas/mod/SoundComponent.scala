package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.SoundComponent
  * @augments pc.Component
  * @classdesc The Sound Component controls playback of {@link pc.Sound}s.
  * @description Create a new Sound Component.
  * @param {pc.SoundComponentSystem} system - The ComponentSystem that created this
  * component.
  * @param {pc.Entity} entity - The entity that the Component is attached to.
  * @property {number} volume The volume modifier to play the audio with. In range 0-1.
  * @property {number} pitch The pitch modifier to play the audio with. Must be larger
  * than 0.01.
  * @property {boolean} positional If true the audio will play back at the location
  * of the Entity in space, so the audio will be affected by the position of the
  * {@link pc.AudioListenerComponent}.
  * @property {string} distanceModel Determines which algorithm to use to reduce the
  * volume of the sound as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Default is {@link pc.DISTANCE_LINEAR}.
  * @property {number} refDistance The reference distance for reducing volume as the
  * sound source moves further from the listener.
  * @property {number} maxDistance The maximum distance from the listener at which audio
  * falloff stops. Note the volume of the audio is not 0 after this distance, but just
  * doesn't fall off anymore.
  * @property {number} rollOffFactor The factor used in the falloff equation.
  * @property {object} slots A dictionary that contains the {@link pc.SoundSlot}s managed
  * by this Component.
  */
@JSImport("playcanvas", "SoundComponent")
@js.native
class SoundComponent protected ()
  extends typings.playcanvas.pc.SoundComponent {
  def this(system: typings.playcanvas.pc.SoundComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

