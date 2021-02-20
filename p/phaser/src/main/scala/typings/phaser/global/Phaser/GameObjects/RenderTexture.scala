package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Render Texture.
  * 
  * A Render Texture is a special texture that allows any number of Game Objects to be drawn to it. You can take many complex objects and
  * draw them all to this one texture, which can they be used as the texture for other Game Object's. It's a way to generate dynamic
  * textures at run-time that are WebGL friendly and don't invoke expensive GPU uploads.
  * 
  * Note that under WebGL a FrameBuffer, which is what the Render Texture uses internally, cannot be anti-aliased. This means
  * that when drawing objects such as Shapes to a Render Texture they will appear to be drawn with no aliasing, however this
  * is a technical limitation of WebGL. To get around it, create your shape as a texture in an art package, then draw that
  * to the Render Texture.
  */
@JSGlobal("Phaser.GameObjects.RenderTexture")
@js.native
class RenderTexture protected ()
  extends typings.phaser.Phaser.GameObjects.RenderTexture {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the Render Texture. Default 32.
    * @param height The height of the Render Texture. Default 32.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: integer) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double, width: integer) = this()
  def this(scene: Scene, x: Double, y: js.UndefOr[scala.Nothing], width: integer) = this()
  def this(scene: Scene, x: Double, y: Double, width: integer) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: integer,
    height: integer
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    width: js.UndefOr[scala.Nothing],
    height: integer
  ) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double, width: integer, height: integer) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer
  ) = this()
  def this(scene: Scene, x: Double, y: js.UndefOr[scala.Nothing], width: integer, height: integer) = this()
  def this(scene: Scene, x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: integer) = this()
  def this(scene: Scene, x: Double, y: Double, width: integer, height: integer) = this()
}
