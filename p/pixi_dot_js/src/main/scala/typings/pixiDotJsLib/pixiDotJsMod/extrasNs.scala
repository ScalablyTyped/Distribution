package typings
package pixiDotJsLib.pixiDotJsMod

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
    extends pixiDotJsLib.PIXINs.extrasNs.AnimatedSprite {
    def this(textures: js.Array[
          pixiDotJsLib.PIXINs.Texture | pixiDotJsLib.PIXINs.extrasNs.AnimatedSpriteTextureTimeObject
        ]) = this()
    def this(textures: js.Array[
          pixiDotJsLib.PIXINs.Texture | pixiDotJsLib.PIXINs.extrasNs.AnimatedSpriteTextureTimeObject
        ], autoUpdate: scala.Boolean) = this()
  }
  
  @js.native
  class BitmapText protected ()
    extends pixiDotJsLib.PIXINs.extrasNs.BitmapText {
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, style: pixiDotJsLib.PIXINs.extrasNs.BitmapTextStyle) = this()
  }
  
  @js.native
  class TextureMatrix protected ()
    extends pixiDotJsLib.PIXINs.extrasNs.TextureMatrix {
    def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, clampMargin: scala.Double) = this()
  }
  
  @js.native
  class TilingSprite protected ()
    extends pixiDotJsLib.PIXINs.extrasNs.TilingSprite {
    def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, width: scala.Double) = this()
    def this(texture: pixiDotJsLib.PIXINs.Texture, width: scala.Double, height: scala.Double) = this()
  }
  
  @js.native
  class TilingSpriteRenderer protected ()
    extends pixiDotJsLib.PIXINs.extrasNs.TilingSpriteRenderer {
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  }
  
  @js.native
  object AnimatedSprite extends js.Object {
    def fromFrames(frame: js.Array[java.lang.String]): pixiDotJsLib.PIXINs.extrasNs.AnimatedSprite = js.native
    def fromImages(images: js.Array[java.lang.String]): pixiDotJsLib.PIXINs.extrasNs.AnimatedSprite = js.native
  }
  
  @js.native
  object BitmapText extends js.Object {
    var fonts: js.Any = js.native
    def registerFont(xml: stdLib.XMLDocument, textures: js.Array[pixiDotJsLib.PIXINs.Texture]): js.Any = js.native
    def registerFont(
      xml: stdLib.XMLDocument,
      textures: org.scalablytyped.runtime.StringDictionary[pixiDotJsLib.PIXINs.Texture]
    ): js.Any = js.native
    def registerFont(xml: stdLib.XMLDocument, textures: pixiDotJsLib.PIXINs.Texture): js.Any = js.native
  }
  
  @js.native
  object TilingSprite extends js.Object {
    def from(source: java.lang.String): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: java.lang.String, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: java.lang.String, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: pixiDotJsLib.PIXINs.BaseTexture, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: pixiDotJsLib.PIXINs.BaseTexture, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: scala.Double, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: scala.Double, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: stdLib.HTMLCanvasElement, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: stdLib.HTMLCanvasElement, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: stdLib.HTMLVideoElement, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def from(source: stdLib.HTMLVideoElement, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromFrame(frameId: java.lang.String): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromFrame(frameId: java.lang.String, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromFrame(frameId: java.lang.String, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: java.lang.String): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
    def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Sprite = js.native
    // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
    def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Sprite = js.native
    def fromImage(imageId: java.lang.String, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: java.lang.String, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(imageId: java.lang.String, width: scala.Double, height: scala.Double, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    def fromImage(
      imageId: java.lang.String,
      width: scala.Double,
      height: scala.Double,
      crossorigin: scala.Boolean,
      scaleMode: scala.Double
    ): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
    // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
    @JSName("fromImage")
    def fromImage_Sprite(imageId: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  }
  
}

