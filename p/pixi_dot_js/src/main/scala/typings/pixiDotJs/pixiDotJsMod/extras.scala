package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXI.extras.AnimatedSpriteTextureTimeObject
import typings.pixiDotJs.PIXI.extras.BitmapTextStyle
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////EXTRAS////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "extras")
@js.native
object extras extends js.Object {
  @js.native
  class AnimatedSprite protected ()
    extends typings.pixiDotJs.PIXI.extras.AnimatedSprite {
    def this(textures: js.Array[AnimatedSpriteTextureTimeObject | typings.pixiDotJs.PIXI.Texture]) = this()
    def this(
      textures: js.Array[AnimatedSpriteTextureTimeObject | typings.pixiDotJs.PIXI.Texture],
      autoUpdate: Boolean
    ) = this()
  }
  
  @js.native
  class BitmapText protected ()
    extends typings.pixiDotJs.PIXI.extras.BitmapText {
    def this(text: String) = this()
    def this(text: String, style: BitmapTextStyle) = this()
  }
  
  @js.native
  class TextureMatrix protected ()
    extends typings.pixiDotJs.PIXI.extras.TextureMatrix {
    def this(texture: typings.pixiDotJs.PIXI.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXI.Texture, clampMargin: Double) = this()
  }
  
  @js.native
  class TilingSprite protected ()
    extends typings.pixiDotJs.PIXI.extras.TilingSprite {
    def this(texture: typings.pixiDotJs.PIXI.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXI.Texture, width: Double) = this()
    def this(texture: typings.pixiDotJs.PIXI.Texture, width: Double, height: Double) = this()
  }
  
  @js.native
  class TilingSpriteRenderer protected ()
    extends typings.pixiDotJs.PIXI.extras.TilingSpriteRenderer {
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer) = this()
  }
  
  /* static members */
  @js.native
  object AnimatedSprite extends js.Object {
    def fromFrames(frame: js.Array[String]): typings.pixiDotJs.PIXI.extras.AnimatedSprite = js.native
    def fromImages(images: js.Array[String]): typings.pixiDotJs.PIXI.extras.AnimatedSprite = js.native
  }
  
  /* static members */
  @js.native
  object BitmapText extends js.Object {
    var fonts: js.Any = js.native
    def registerFont(xml: XMLDocument, textures: js.Array[typings.pixiDotJs.PIXI.Texture]): js.Any = js.native
    def registerFont(xml: XMLDocument, textures: StringDictionary[typings.pixiDotJs.PIXI.Texture]): js.Any = js.native
    def registerFont(xml: XMLDocument, textures: typings.pixiDotJs.PIXI.Texture): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TilingSprite extends js.Object {
    def from(source: String): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: String, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: String, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: Double, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: Double, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: typings.pixiDotJs.PIXI.BaseTexture): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: typings.pixiDotJs.PIXI.BaseTexture, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: typings.pixiDotJs.PIXI.BaseTexture, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: HTMLCanvasElement): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: HTMLCanvasElement, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: HTMLCanvasElement, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: HTMLVideoElement): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: HTMLVideoElement, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def from(source: HTMLVideoElement, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromFrame(frameId: String): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromFrame(frameId: String, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromFrame(frameId: String, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromImage(imageId: String): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromImage(imageId: String, crossorigin: Boolean): typings.pixiDotJs.PIXI.Sprite = js.native
    def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXI.Sprite = js.native
    def fromImage(imageId: String, width: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromImage(imageId: String, width: Double, height: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXI.extras.TilingSprite = js.native
    // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
    @JSName("fromImage")
    def fromImage_Sprite(imageId: String): typings.pixiDotJs.PIXI.Sprite = js.native
  }
  
}

