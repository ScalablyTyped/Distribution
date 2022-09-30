package typings.pixiJs.mod

import typings.pixiSpriteAnimated.mod.FrameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "AnimatedSprite")
@js.native
open class AnimatedSprite protected ()
  extends typings.pixiSpriteAnimated.mod.AnimatedSprite {
  /**
    * @param textures - An array of {@link PIXI.Texture} or frame
    *  objects that make up the animation.
    * @param {boolean} [autoUpdate=true] - Whether to use PIXI.Ticker.shared to auto update animation time.
    */
  def this(textures: js.Array[FrameObject | typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]]) = this()
  def this(
    textures: js.Array[FrameObject | typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]],
    autoUpdate: Boolean
  ) = this()
}
/* static members */
object AnimatedSprite {
  
  @JSImport("pixi.js", "AnimatedSprite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand way of creating an AnimatedSprite from an array of frame ids.
    * @param frames - The array of frames ids the AnimatedSprite will use as its texture frames.
    * @returns - The new animated sprite with the specified frames.
    */
  inline def fromFrames(frames: js.Array[String]): typings.pixiSpriteAnimated.mod.AnimatedSprite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrames")(frames.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpriteAnimated.mod.AnimatedSprite]
  
  /**
    * A short hand way of creating an AnimatedSprite from an array of image ids.
    * @param images - The array of image urls the AnimatedSprite will use as its texture frames.
    * @returns The new animate sprite with the specified images as frames.
    */
  inline def fromImages(images: js.Array[String]): typings.pixiSpriteAnimated.mod.AnimatedSprite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImages")(images.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpriteAnimated.mod.AnimatedSprite]
}
