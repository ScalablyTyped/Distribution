package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.Animation
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.TextureCrop
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Sprite Game Object.
  * 
  * A Sprite Game Object is used for the display of both static and animated images in your game.
  * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
  * and animated.
  * 
  * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
  * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
  * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
  */
@js.native
trait Sprite
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Size
     with TextureCrop
     with Tint
     with Transform
     with Visible {
  
  /**
    * The Animation Controller of this Sprite.
    */
  var anims: Animation = js.native
  
  /**
    * Start playing the given animation.
    * @param key The string-based key of the animation to play.
    * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def play(key: String): this.type = js.native
  def play(key: String, ignoreIfPlaying: js.UndefOr[scala.Nothing], startFrame: integer): this.type = js.native
  def play(key: String, ignoreIfPlaying: Boolean): this.type = js.native
  def play(key: String, ignoreIfPlaying: Boolean, startFrame: integer): this.type = js.native
  
  /**
    * Update this Sprite's animations.
    * @param time The current timestamp.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def preUpdate(time: Double, delta: Double): Unit = js.native
}
