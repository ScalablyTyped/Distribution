package typings.playcanvas.pc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait AnimationComponent
  extends StObject
     with Component {
  
  /**
    * If true the first animation asset will begin playing when the scene is loaded.
    */
  var activate: Boolean = js.native
  
  /**
    * Get or Set dictionary of animations by name.
    */
  var animations: StringDictionary[Animation] = js.native
  
  /**
    * The array of animation assets - can also be an array of asset ids.
    */
  var assets: js.Array[Asset | Double] = js.native
  
  /**
    * Get or Set the current time position (in seconds) of the animation.
    */
  var currentTime: Double = js.native
  
  /**
    * Get the duration in seconds of the current animation. [read only]
    */
  var duration: Double = js.native
  
  /**
    * Return an animation.
    * @param name - The name of the animation asset.
    * @returns An Animation.
    */
  def getAnimation(name: String): Animation = js.native
  
  /**
    * If true the animation will restart from the beginning when it reaches the end.
    */
  var loop: Boolean = js.native
  
  /**
    * Start playing an animation.
    * @param name - The name of the animation asset to begin playing.
    * @param [blendTime] - The time in seconds to blend from the current
    animation state to the start of the animation being set.
    */
  def play(name: String): Unit = js.native
  def play(name: String, blendTime: Double): Unit = js.native
  
  /**
    * Get the skeleton for the current model; unless model is from glTF/glb, then skeleton is null. [read only]
    */
  var skeleton: Skeleton | Null = js.native
  
  /**
    * Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses the animation.
    */
  var speed: Double = js.native
}
