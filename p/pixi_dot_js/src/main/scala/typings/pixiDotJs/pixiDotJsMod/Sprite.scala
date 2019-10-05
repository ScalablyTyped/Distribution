package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sprites
/**
  * The Sprite object is the base for all textured objects that are rendered to the screen
  *
  * A sprite can be created directly from an image like this:
  *
  * ```js
  * let sprite = new PIXI.Sprite.fromImage("assets/image.png");
  * ```
  *
  * The more efficient way to create sprites is using a {@link PIXI.Spritesheet}:
  *
  * ```js
  * PIXI.loader.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.loader.resources["assets/spritesheet.json"].spritesheet;
  *   let sprite = new PIXI.Sprite(sheet.textures["image.png"]);
  *   ...
  * }
  * ```
  */
@JSImport("pixi.js", "Sprite")
@js.native
class Sprite ()
  extends typings.pixiDotJs.PIXI.Sprite {
  def this(texture: typings.pixiDotJs.PIXI.Texture) = this()
}

/* static members */
@JSImport("pixi.js", "Sprite")
@js.native
object Sprite extends js.Object {
  def from(source: String): typings.pixiDotJs.PIXI.Sprite = js.native
  def from(source: Double): typings.pixiDotJs.PIXI.Sprite = js.native
  def from(source: typings.pixiDotJs.PIXI.BaseTexture): typings.pixiDotJs.PIXI.Sprite = js.native
  def from(source: HTMLCanvasElement): typings.pixiDotJs.PIXI.Sprite = js.native
  def from(source: HTMLImageElement): typings.pixiDotJs.PIXI.Sprite = js.native
  def from(source: HTMLVideoElement): typings.pixiDotJs.PIXI.Sprite = js.native
  def fromFrame(frameId: String): typings.pixiDotJs.PIXI.Sprite = js.native
  def fromImage(imageId: String): typings.pixiDotJs.PIXI.Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean): typings.pixiDotJs.PIXI.Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXI.Sprite = js.native
}

