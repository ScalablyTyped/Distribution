package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @component
     * @name pc.AudioSourceComponent
     * @class The AudioSource Component controls playback of an audio sample. This class will be deprecated in favor of {@link pc.SoundComponent}.
     * @description Create a new AudioSource Component
     * @param {pc.AudioSourceComponentSystem} system The ComponentSystem that created this Component
     * @param {pc.Entity} entity The entity that the Component is attached to
     * @extends pc.Component
     * @property {pc.Asset[]} assets The list of audio assets - can also be an array of asset ids.
     * @property {Boolean} activate If true the audio will begin playing as soon as the Pack is loaded
     * @property {Number} volume The volume modifier to play the audio with. In range 0-1.
     * @property {Number} pitch The pitch modifier to play the audio with. Must be larger than 0.01
     * @property {Boolean} loop If true the audio will restart when it finishes playing
     * @property {Boolean} 3d If true the audio will play back at the location of the Entity in space, so the audio will be affect by the position of the {@link pc.AudioListenerComponent}
     * @property {String} distanceModel Determines which algorithm to use to reduce the volume of the audio as it moves away from the listener. Can be one of 'linear', 'inverse' or 'exponential'. Default is 'inverse'.
     * @property {Number} minDistance The minimum distance from the listener at which audio falloff begins.
     * @property {Number} maxDistance The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore
     * @property {Number} rollOffFactor The factor used in the falloff equation.
     */
@JSGlobal("pc.AudioSourceComponent")
@js.native
class AudioSourceComponent protected () extends Component {
  def this(system: AudioSourceComponentSystem, entity: Entity) = this()
  var activate: scala.Boolean = js.native
  var assets: js.Array[Asset] = js.native
  var distanceModel: java.lang.String = js.native
  var loop: scala.Boolean = js.native
  var maxDistance: scala.Double = js.native
  var minDistance: scala.Double = js.native
  var pitch: scala.Double = js.native
  var rollOffFactor: scala.Double = js.native
  var volume: scala.Double = js.native
}

