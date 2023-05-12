package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AudioSource Component controls playback of an audio sample. This class will be deprecated
  * in favor of {@link SoundComponent}.
  *
  * @property {Asset[]} assets The list of audio assets - can also be an array of asset ids.
  * @property {boolean} activate If true the audio will begin playing as soon as the scene is
  * loaded.
  * @property {number} volume The volume modifier to play the audio with. In range 0-1.
  * @property {number} pitch The pitch modifier to play the audio with. Must be larger than 0.01.
  * @property {boolean} loop If true the audio will restart when it finishes playing.
  * @property {boolean} 3d If true the audio will play back at the location of the entity in space,
  * so the audio will be affect by the position of the {@link AudioListenerComponent}.
  * @property {string} distanceModel Determines which algorithm to use to reduce the volume of the
  * audio as it moves away from the listener. Can be:
  *
  * - "linear"
  * - "inverse"
  * - "exponential"
  *
  * Default is "inverse".
  * @property {number} minDistance The minimum distance from the listener at which audio falloff
  * begins.
  * @property {number} maxDistance The maximum distance from the listener at which audio falloff
  * stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off
  * anymore.
  * @property {number} rollOffFactor The factor used in the falloff equation.
  * @augments Component
  * @ignore
  */
@JSGlobal("pc.AudioSourceComponent")
@js.native
open class AudioSourceComponent protected ()
  extends typings.playcanvas.mod.AudioSourceComponent {
  /**
    * Create a new AudioSource Component instance.
    *
    * @param {import('./system.js').AudioSourceComponentSystem} system - The ComponentSystem that
    * created this component.
    * @param {import('../../entity.js').Entity} entity - The entity that the Component is attached
    * to.
    */
  def this(system: typings.playcanvas.mod.AudioSourceComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
