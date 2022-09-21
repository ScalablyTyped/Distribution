package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').AudioSourceComponentSystem} AudioSourceComponentSystem */
/** @typedef {import('../../entity.js').Entity} Entity */
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
@JSImport("playcanvas", "AudioSourceComponent")
@js.native
open class AudioSourceComponent protected () extends Component {
  /**
    * Create a new AudioSource Component instance.
    *
    * @param {AudioSourceComponentSystem} system - The ComponentSystem that created
    * this component.
    * @param {Entity} entity - The entity that the Component is attached to.
    */
  def this(system: AudioSourceComponentSystem, entity: Entity) = this()
  
  var channel: Any = js.native
  
  def loadAudioSourceAssets(ids: Any): Unit = js.native
  
  def onAssetChanged(asset: Any, attribute: Any, newValue: Any, oldValue: Any): Unit = js.native
  
  def onAssetRemoved(asset: Any): Unit = js.native
  
  def onSet3d(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetAssets(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetDistanceModel(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetLoop(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetMaxDistance(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetMinDistance(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetPitch(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetRollOffFactor(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetVolume(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  /**
    * Pause playback of the audio that is playing on the Entity. Playback can be resumed by
    * calling {@link AudioSourceComponent#unpause}.
    */
  def pause(): Unit = js.native
  
  /**
    * Begin playback of an audio asset in the component attached to an entity.
    *
    * @param {string} name - The name of the Asset to play.
    */
  def play(name: String): Unit = js.native
  
  /**
    * Stop playback on an Entity. Playback can not be resumed after being stopped.
    */
  def stop(): Unit = js.native
  
  /**
    * Resume playback of the audio if paused. Playback is resumed at the time it was paused.
    */
  def unpause(): Unit = js.native
}
