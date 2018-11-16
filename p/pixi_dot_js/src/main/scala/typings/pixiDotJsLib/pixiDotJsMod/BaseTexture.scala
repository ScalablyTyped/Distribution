package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "BaseTexture")
@js.native
class BaseTexture ()
  extends pixiDotJsLib.PIXINs.BaseTexture {
  def this(source: stdLib.HTMLCanvasElement) = this()
  def this(source: stdLib.HTMLImageElement) = this()
  def this(source: stdLib.HTMLVideoElement) = this()
  def this(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLImageElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double, resolution: scala.Double) = this()
  def this(source: stdLib.HTMLImageElement, scaleMode: scala.Double, resolution: scala.Double) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double, resolution: scala.Double) = this()
}

@JSImport("pixi.js", "BaseTexture")
@js.native
object BaseTexture extends js.Object {
  def addToCache(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, id: java.lang.String): scala.Unit = js.native
  def from(source: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: java.lang.String, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: java.lang.String, scaleMode: scala.Double, sourceScale: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double, sourceScale: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLImageElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLImageElement, scaleMode: scala.Double, sourceScale: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement, scaleMode: scala.Double, origin: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(imageUrl: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(imageUrl: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(imageUrl: java.lang.String, crossorigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(
    imageUrl: java.lang.String,
    crossorigin: scala.Boolean,
    scaleMode: scala.Double,
    sourceScale: scala.Double
  ): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def removeFromCache(baseTexture: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def removeFromCache(baseTexture: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.BaseTexture = js.native
}

