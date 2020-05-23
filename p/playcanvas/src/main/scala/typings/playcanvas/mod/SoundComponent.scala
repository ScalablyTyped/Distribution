package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Sound Component.
  * @property volume - The volume modifier to play the audio with. In range 0-1.
  * @property pitch - The pitch modifier to play the audio with. Must be larger
  than 0.01.
  * @property positional - If true the audio will play back at the location
  of the Entity in space, so the audio will be affected by the position of the
  {@link pc.AudioListenerComponent}.
  * @property distanceModel - Determines which algorithm to use to reduce the
  volume of the sound as it moves away from the listener. Can be:
  
  * {@link pc.DISTANCE_LINEAR}
  * {@link pc.DISTANCE_INVERSE}
  * {@link pc.DISTANCE_EXPONENTIAL}
  
  Default is {@link pc.DISTANCE_LINEAR}.
  * @property refDistance - The reference distance for reducing volume as the
  sound source moves further from the listener.
  * @property maxDistance - The maximum distance from the listener at which audio
  falloff stops. Note the volume of the audio is not 0 after this distance, but just
  doesn't fall off anymore.
  * @property rollOffFactor - The factor used in the falloff equation.
  * @property slots - A dictionary that contains the {@link pc.SoundSlot}s managed
  by this Component.
  * @param system - The ComponentSystem that created this
  component.
  * @param entity - The entity that the Component is attached to.
  */
@JSImport("playcanvas", "SoundComponent")
@js.native
class SoundComponent protected ()
  extends typings.playcanvas.pc.SoundComponent {
  def this(system: typings.playcanvas.pc.SoundComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

