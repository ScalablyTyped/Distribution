package typings.phaser.Phaser.GameObjects.Components

import typings.phaser.Phaser.BlendModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the blend mode of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait BlendMode extends js.Object {
  /**
    * Sets the Blend Mode being used by this Game Object.
    * 
    * This can be a const, such as `Phaser.BlendModes.SCREEN`, or an integer, such as 4 (for Overlay)
    * 
    * Under WebGL only the following Blend Modes are available:
    * 
    * * ADD
    * * MULTIPLY
    * * SCREEN
    * * ERASE
    * 
    * Canvas has more available depending on browser support.
    * 
    * You can also create your own custom Blend Modes in WebGL.
    * 
    * Blend modes have different effects under Canvas and WebGL, and from browser to browser, depending
    * on support. Blend Modes also cause a WebGL batch flush should it encounter a new blend mode. For these
    * reasons try to be careful about the construction of your Scene and the frequency of which blend modes
    * are used.
    */
  var blendMode: BlendModes | String = js.native
  /**
    * Sets the Blend Mode being used by this Game Object.
    * 
    * This can be a const, such as `Phaser.BlendModes.SCREEN`, or an integer, such as 4 (for Overlay)
    * 
    * Under WebGL only the following Blend Modes are available:
    * 
    * * ADD
    * * MULTIPLY
    * * SCREEN
    * * ERASE (only works when rendering to a framebuffer, like a Render Texture)
    * 
    * Canvas has more available depending on browser support.
    * 
    * You can also create your own custom Blend Modes in WebGL.
    * 
    * Blend modes have different effects under Canvas and WebGL, and from browser to browser, depending
    * on support. Blend Modes also cause a WebGL batch flush should it encounter a new blend mode. For these
    * reasons try to be careful about the construction of your Scene and the frequency in which blend modes
    * are used.
    * @param value The BlendMode value. Either a string or a CONST.
    */
  def setBlendMode(value: String): this.type = js.native
  def setBlendMode(value: BlendModes): this.type = js.native
}

