package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component Animation
  * @name pc.AnimationComponent
  * @description Create a new AnimationComponent
  * @class The Animation Component allows an Entity to playback animations on models
  * @param {pc.AnimationComponentSystem} system The {@link pc.ComponentSystem} that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to
  * @extends pc.Component
  * @property {Number} speed Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses the animation
  * @property {Boolean} loop If true the animation will restart from the beginning when it reaches the end
  * @property {Boolean} activate If true the first animation asset will begin playing when the Pack is loaded
  * @property {pc.Asset[]} assets The array of animation assets - can also be an array of asset ids.
  * @property {Number} currentTime Get or Set the current time position (in seconds) of the animation
  * @property {Number} duration Get the duration in seconds of the current animation.
  */
@JSGlobal("pc.AnimationComponent")
@js.native
class AnimationComponent protected () extends Component {
  def this(system: AnimationComponentSystem, entity: Entity) = this()
  var activate: scala.Boolean = js.native
  var animations: js.Any = js.native
  var animationsIndex: js.Any = js.native
  var assets: js.Array[scala.Double] = js.native
  var currAnim: java.lang.String = js.native
  var currentTime: scala.Double = js.native
  var duration: scala.Double = js.native
  var loop: scala.Boolean = js.native
  var playing: scala.Boolean = js.native
  var speed: scala.Double = js.native
  /**
    * @function
    * @name pc.AnimationComponent#getAnimation
    * @description Return an animation
    * @param {String} name The name of the animation asset
    * @returns {pc.Animation} An Animation
    */
  def getAnimation(name: java.lang.String): Animation = js.native
  /**
    * @function
    * @name pc.AnimationComponent#play
    * @description Start playing an animation
    * @param {String} name The name of the animation asset to begin playing.
    * @param {Number} [blendTime] The time in seconds to blend from the current
    * animation state to the start of the animation being set.
    */
  def play(name: java.lang.String): scala.Unit = js.native
  def play(name: java.lang.String, blendTime: scala.Double): scala.Unit = js.native
}

