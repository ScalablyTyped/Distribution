package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component Animation
  * @constructor
  * @name pc.AnimationComponent
  * @extends pc.Component
  * @classdesc The Animation Component allows an Entity to playback animations on models
  * @description Create a new AnimationComponent
  * @param {pc.AnimationComponentSystem} system The {@link pc.ComponentSystem} that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to
  * @property {Number} speed Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses the animation
  * @property {Boolean} loop If true the animation will restart from the beginning when it reaches the end
  * @property {Boolean} activate If true the first animation asset will begin playing when the scene is loaded
  * @property {pc.Asset[]} assets The array of animation assets - can also be an array of asset ids.
  * @property {Number} currentTime Get or Set the current time position (in seconds) of the animation
  * @property {Number} duration Get the duration in seconds of the current animation.
  */
@JSGlobal("pc.AnimationComponent")
@js.native
class AnimationComponent protected () extends Component {
  def this(system: AnimationComponentSystem, entity: Entity) = this()
  /**
    * If true the first animation asset will begin playing when the scene is loaded
    */
  var activate: Boolean = js.native
  /**
    * The array of animation assets - can also be an array of asset ids.
    */
  var assets: js.Array[Asset] = js.native
  /**
    * Get or Set the current time position (in seconds) of the animation
    */
  var currentTime: Double = js.native
  /**
    * Get the duration in seconds of the current animation.
    */
  var duration: Double = js.native
  /**
    * If true the animation will restart from the beginning when it reaches the end
    */
  var loop: Boolean = js.native
  /**
    * Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses the animation
    */
  var speed: Double = js.native
  /**
    * @function
    * @name pc.AnimationComponent#getAnimation
    * @description Return an animation
    * @param {String} name The name of the animation asset
    * @returns {pc.Animation} An Animation
    */
  def getAnimation(name: String): Animation = js.native
  /**
    * @function
    * @name pc.AnimationComponent#play
    * @description Start playing an animation
    * @param {String} name The name of the animation asset to begin playing.
    * @param {Number} [blendTime] The time in seconds to blend from the current
    * animation state to the start of the animation being set.
    */
  def play(name: String): Unit = js.native
  def play(name: String, blendTime: Double): Unit = js.native
}

