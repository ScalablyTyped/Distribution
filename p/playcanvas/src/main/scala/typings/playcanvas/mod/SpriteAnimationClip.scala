package typings.playcanvas.mod

import typings.playcanvas.anon.Fps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles playing of sprite animations and loading of relevant sprite assets.
  * @property spriteAsset - The id of the sprite asset used to play the animation.
  * @property sprite - The current sprite used to play the animation.
  * @property frame - The index of the frame of the {@link pc.Sprite} currently being rendered.
  * @property time - The current time of the animation in seconds.
  * @property duration - The total duration of the animation in seconds.
  * @property isPlaying - Whether the animation is currently playing.
  * @property isPaused - Whether the animation is currently paused.
  * @param component - The sprite component managing this clip.
  * @param data - Data for the new animation clip.
  * @param [data.fps] - Frames per second for the animation clip.
  * @param [data.loop] - Whether to loop the animation clip.
  * @param [data.name] - The name of the new animation clip.
  * @param [data.spriteAsset] - The id of the sprite asset that this clip will play.
  */
@JSImport("playcanvas", "SpriteAnimationClip")
@js.native
class SpriteAnimationClip protected ()
  extends typings.playcanvas.pc.SpriteAnimationClip {
  def this(component: typings.playcanvas.pc.SpriteComponent, data: Fps) = this()
}
