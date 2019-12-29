package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/TextureReplay", JSImport.Namespace)
@js.native
object renderWebglTextureReplayMod extends js.Object {
  @js.native
  trait WebGLTextureReplay
    extends typings.ol.renderWebglReplayMod.default {
    var anchorX: Double = js.native
    var anchorY: Double = js.native
    var defaultLocations: typings.ol.renderWebglTexturereplayDefaultshaderLocationsMod.default = js.native
    var groupIndices: js.Array[Double] = js.native
    var height: Double = js.native
    var hitDetectionGroupIndices: js.Array[Double] = js.native
    var imageHeight: Double = js.native
    var imageWidth: Double = js.native
    var opacity: Double = js.native
    var originX: Double = js.native
    var originY: Double = js.native
    var rotateWithView: Boolean = js.native
    var rotation: Double = js.native
    var scale: Double = js.native
    var width: Double = js.native
    /* protected */ def createTextures(
      textures: js.Array[WebGLTexture],
      images: js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement],
      texturePerImage: StringDictionary[WebGLTexture],
      gl: WebGLRenderingContext
    ): Unit = js.native
    /* protected */ def drawCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
    /* protected */ def drawReplaySkipping(
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      textures: js.Array[WebGLTexture],
      groupIndices: js.Array[Double]
    ): Unit = js.native
    /* protected */ def getHitDetectionTextures(): js.Array[WebGLTexture] = js.native
    /* protected */ def getTextures(): js.Array[WebGLTexture] = js.native
    /* protected */ def getTextures(opt_all: Boolean): js.Array[WebGLTexture] = js.native
  }
  
  @js.native
  class default protected () extends WebGLTextureReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

