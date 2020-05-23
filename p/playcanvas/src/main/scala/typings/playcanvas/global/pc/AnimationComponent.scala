package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new AnimationComponent.
  * @property speed - Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses the animation.
  * @property loop - If true the animation will restart from the beginning when it reaches the end.
  * @property activate - If true the first animation asset will begin playing when the scene is loaded.
  * @property assets - The array of animation assets - can also be an array of asset ids.
  * @property currentTime - Get or Set the current time position (in seconds) of the animation.
  * @property duration - Get the duration in seconds of the current animation. [read only]
  * @property skeleton - Get the skeleton for the current model; unless model is from glTF/glb, then skeleton is null. [read only]
  * @property animations - Get or Set dictionary of animations by name.
  * @param system - The {@link pc.ComponentSystem} that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.AnimationComponent")
@js.native
class AnimationComponent protected ()
  extends typings.playcanvas.pc.AnimationComponent {
  def this(system: typings.playcanvas.pc.AnimationComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

