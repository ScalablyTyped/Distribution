package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component Animation
  * @class
  * @name pc.AnimationComponent
  * @augments pc.Component
  * @classdesc The Animation Component allows an Entity to playback animations on models.
  * @description Create a new AnimationComponent.
  * @param {pc.AnimationComponentSystem} system - The {@link pc.ComponentSystem} that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {number} speed Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses the animation.
  * @property {boolean} loop If true the animation will restart from the beginning when it reaches the end.
  * @property {boolean} activate If true the first animation asset will begin playing when the scene is loaded.
  * @property {pc.Asset[]|number[]} assets The array of animation assets - can also be an array of asset ids.
  * @property {number} currentTime Get or Set the current time position (in seconds) of the animation.
  * @property {number} duration Get the duration in seconds of the current animation.
  */
@JSImport("playcanvas", "AnimationComponent")
@js.native
class AnimationComponent protected ()
  extends typings.playcanvas.pc.AnimationComponent {
  def this(system: typings.playcanvas.pc.AnimationComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

