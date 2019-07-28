package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXINs.extrasNs.AnimatedSpriteTextureTimeObject
import typings.pixiDotJs.PIXINs.extrasNs.BitmapTextStyle
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
object extrasNs extends js.Object {
  @js.native
  class AnimatedSprite protected ()
    extends typings.pixiDotJs.PIXINs.extrasNs.AnimatedSprite {
    def this(textures: js.Array[AnimatedSpriteTextureTimeObject | typings.pixiDotJs.PIXINs.Texture]) = this()
    def this(
      textures: js.Array[AnimatedSpriteTextureTimeObject | typings.pixiDotJs.PIXINs.Texture],
      autoUpdate: Boolean
    ) = this()
  }
  
  @js.native
  class BitmapText protected ()
    extends typings.pixiDotJs.PIXINs.extrasNs.BitmapText {
    def this(text: String) = this()
    def this(text: String, style: BitmapTextStyle) = this()
  }
  
  @js.native
  class TextureMatrix protected ()
    extends typings.pixiDotJs.PIXINs.extrasNs.TextureMatrix {
    def this(texture: typings.pixiDotJs.PIXINs.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, clampMargin: Double) = this()
  }
  
  @js.native
  class TilingSprite protected ()
    extends typings.pixiDotJs.PIXINs.extrasNs.TilingSprite {
    def this(texture: typings.pixiDotJs.PIXINs.Texture) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, width: Double) = this()
    def this(texture: typings.pixiDotJs.PIXINs.Texture, width: Double, height: Double) = this()
  }
  
  @js.native
  class TilingSpriteRenderer protected ()
    extends typings.pixiDotJs.PIXINs.extrasNs.TilingSpriteRenderer {
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
  }
  
  /* static members */
  @js.native
  object AnimatedSprite extends js.Object {
    def fromFrames(frame: js.Array[String]): typings.pixiDotJs.PIXINs.extrasNs.AnimatedSprite = js.native
    def fromImages(images: js.Array[String]): typings.pixiDotJs.PIXINs.extrasNs.AnimatedSprite = js.native
  }
  
  /* static members */
  @js.native
  object BitmapText extends js.Object {
    var fonts: js.Any = js.native
    def registerFont(xml: XMLDocument, textures: js.Array[typings.pixiDotJs.PIXINs.Texture]): js.Any = js.native
    def registerFont(xml: XMLDocument, textures: StringDictionary[typings.pixiDotJs.PIXINs.Texture]): js.Any = js.native
    def registerFont(xml: XMLDocument, textures: typings.pixiDotJs.PIXINs.Texture): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TilingSprite extends js.Object {
    def from(source: String): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: String, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: String, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: Double, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: Double, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: typings.pixiDotJs.PIXINs.BaseTexture): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: typings.pixiDotJs.PIXINs.BaseTexture, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: typings.pixiDotJs.PIXINs.BaseTexture, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: HTMLCanvasElement): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: HTMLCanvasElement, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: HTMLCanvasElement, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: HTMLVideoElement): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: HTMLVideoElement, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: HTMLVideoElement, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromFrame(frameId: String): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromFrame(frameId: String, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromFrame(frameId: String, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: String): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: String, crossorigin: Boolean): typings.pixiDotJs.PIXINs.Sprite = js.native
    def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXINs.Sprite = js.native
    def fromImage(imageId: String, width: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: String, width: Double, height: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXINs.extrasNs.TilingSprite = js.native
    // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
    @JSName("fromImage")
    def fromImage_Sprite(imageId: String): typings.pixiDotJs.PIXINs.Sprite = js.native
  }
  
}

