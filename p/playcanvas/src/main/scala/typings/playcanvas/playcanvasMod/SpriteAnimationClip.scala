package typings.playcanvas.playcanvasMod

import typings.playcanvas.Anon_Fps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SpriteAnimationClip
  * @classdesc Handles playing of sprite animations and loading of relevant sprite assets.
  * @param {pc.SpriteComponent} component The sprite component managing this clip.
  * @param {Object} data Data for the new animation clip.
  * @param {Number} [data.fps] Frames per second for the animation clip.
  * @param {Object} [data.loop] Whether to loop the animation clip.
  * @param {String} [data.name] The name of the new animation clip.
  * @param {Number} [data.spriteAsset] The id of the sprite asset that this clip will play.
  * @property {Number} spriteAsset The id of the sprite asset used to play the animation.
  * @property {pc.Sprite} sprite The current sprite used to play the animation.
  * @property {Number} frame The index of the frame of the {@link pc.Sprite} currently being rendered.
  * @property {Number} time The current time of the animation in seconds.
  * @property {Number} duration The total duration of the animation in seconds.
  * @property {Boolean} isPlaying Whether the animation is currently playing.
  * @property {Boolean} isPaused Whether the animation is currently paused.
  */
@JSImport("playcanvas", "SpriteAnimationClip")
@js.native
class SpriteAnimationClip protected ()
  extends typings.playcanvas.pcNs.SpriteAnimationClip {
  def this(component: typings.playcanvas.pcNs.SpriteComponent, data: Anon_Fps) = this()
}

