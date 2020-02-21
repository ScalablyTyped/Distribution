package typings.playcanvas.mod

import typings.playcanvas.AnonFpsLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SpriteAnimationClip
  * @augments pc.EventHandler
  * @classdesc Handles playing of sprite animations and loading of relevant sprite assets.
  * @param {pc.SpriteComponent} component - The sprite component managing this clip.
  * @param {object} data - Data for the new animation clip.
  * @param {number} [data.fps] - Frames per second for the animation clip.
  * @param {object} [data.loop] - Whether to loop the animation clip.
  * @param {string} [data.name] - The name of the new animation clip.
  * @param {number} [data.spriteAsset] - The id of the sprite asset that this clip will play.
  * @property {number} spriteAsset The id of the sprite asset used to play the animation.
  * @property {pc.Sprite} sprite The current sprite used to play the animation.
  * @property {number} frame The index of the frame of the {@link pc.Sprite} currently being rendered.
  * @property {number} time The current time of the animation in seconds.
  * @property {number} duration The total duration of the animation in seconds.
  * @property {boolean} isPlaying Whether the animation is currently playing.
  * @property {boolean} isPaused Whether the animation is currently paused.
  */
@JSImport("playcanvas", "SpriteAnimationClip")
@js.native
class SpriteAnimationClip protected ()
  extends typings.playcanvas.pc.SpriteAnimationClip {
  def this(component: typings.playcanvas.pc.SpriteComponent, data: AnonFpsLoop) = this()
}

