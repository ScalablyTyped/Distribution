package typings.playcanvas.global.pc

import typings.playcanvas.anon.Fps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles playing of sprite animations and loading of relevant sprite assets.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.SpriteAnimationClip")
@js.native
open class SpriteAnimationClip protected ()
  extends typings.playcanvas.mod.SpriteAnimationClip {
  /**
    * Create a new SpriteAnimationClip instance.
    *
    * @param {import('./component.js').SpriteComponent} component - The sprite component managing
    * this clip.
    * @param {object} data - Data for the new animation clip.
    * @param {number} [data.fps] - Frames per second for the animation clip.
    * @param {boolean} [data.loop] - Whether to loop the animation clip.
    * @param {string} [data.name] - The name of the new animation clip.
    * @param {number} [data.spriteAsset] - The id of the sprite asset that this clip will play.
    */
  def this(component: typings.playcanvas.mod.SpriteComponent, data: Fps) = this()
}
