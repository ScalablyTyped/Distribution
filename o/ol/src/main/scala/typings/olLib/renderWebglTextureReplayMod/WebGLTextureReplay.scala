package typings
package olLib.renderWebglTextureReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLTextureReplay
  extends olLib.renderWebglReplayMod.default {
  var anchorX: scala.Double = js.native
  var anchorY: scala.Double = js.native
  var defaultLocations: olLib.renderWebglTexturereplayDefaultshaderLocationsMod.default = js.native
  var groupIndices: js.Array[scala.Double] = js.native
  var height: scala.Double = js.native
  var hitDetectionGroupIndices: js.Array[scala.Double] = js.native
  var imageHeight: scala.Double = js.native
  var imageWidth: scala.Double = js.native
  var opacity: scala.Double = js.native
  var originX: scala.Double = js.native
  var originY: scala.Double = js.native
  var rotateWithView: scala.Boolean = js.native
  var rotation: scala.Double = js.native
  var scale: scala.Double = js.native
  var width: scala.Double = js.native
  /* protected */ def createTextures(
    textures: js.Array[stdLib.WebGLTexture],
    images: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement],
    texturePerImage: org.scalablytyped.runtime.StringDictionary[stdLib.WebGLTexture],
    gl: stdLib.WebGLRenderingContext
  ): scala.Unit = js.native
  /* protected */ def drawCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): scala.Double = js.native
  /* protected */ def drawReplaySkipping(
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    textures: js.Array[stdLib.WebGLTexture],
    groupIndices: js.Array[scala.Double]
  ): scala.Unit = js.native
  /* protected */ def getHitDetectionTextures(): js.Array[stdLib.WebGLTexture] = js.native
  /* protected */ def getTextures(): js.Array[stdLib.WebGLTexture] = js.native
  /* protected */ def getTextures(opt_all: scala.Boolean): js.Array[stdLib.WebGLTexture] = js.native
}

