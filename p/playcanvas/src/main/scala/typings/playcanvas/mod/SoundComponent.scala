package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Sound Component.
  * @property volume - The volume modifier to play the audio with. In range 0-1.
  * Defaults to 1.
  * @property pitch - The pitch modifier to play the audio with. Must be larger
  * than 0.01. Defaults to 1.
  * @property positional - If true the audio will play back at the location
  * of the Entity in space, so the audio will be affected by the position of the
  * {@link pc.AudioListenerComponent}. Defaults to true.
  * @property distanceModel - Determines which algorithm to use to reduce the
  * volume of the sound as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Defaults to {@link pc.DISTANCE_LINEAR}.
  * @property refDistance - The reference distance for reducing volume as the
  * sound source moves further from the listener. Defaults to 1.
  * @property maxDistance - The maximum distance from the listener at which audio
  * falloff stops. Note the volume of the audio is not 0 after this distance, but just
  * doesn't fall off anymore. Defaults to 10000.
  * @property rollOffFactor - The factor used in the falloff equation. Defaults to 1.
  * @property slots - A dictionary that contains the {@link pc.SoundSlot}s managed
  * by this SoundComponent.
  * @param system - The ComponentSystem that created this
  * component.
  * @param entity - The entity that the Component is attached to.
  */
@JSImport("playcanvas", "SoundComponent")
@js.native
class SoundComponent protected ()
  extends typings.playcanvas.pc.SoundComponent {
  def this(system: typings.playcanvas.pc.SoundComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

