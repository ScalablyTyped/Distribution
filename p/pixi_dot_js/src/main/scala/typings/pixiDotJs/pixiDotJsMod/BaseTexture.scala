package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "BaseTexture")
@js.native
class BaseTexture ()
  extends typings.pixiDotJs.PIXI.BaseTexture {
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: HTMLCanvasElement, scaleMode: Double) = this()
  def this(source: HTMLImageElement, scaleMode: Double) = this()
  def this(source: HTMLVideoElement, scaleMode: Double) = this()
  def this(source: HTMLCanvasElement, scaleMode: Double, resolution: Double) = this()
  def this(source: HTMLImageElement, scaleMode: Double, resolution: Double) = this()
  def this(source: HTMLVideoElement, scaleMode: Double, resolution: Double) = this()
}

/* static members */
@JSImport("pixi.js", "BaseTexture")
@js.native
object BaseTexture extends js.Object {
  def addToCache(baseTexture: typings.pixiDotJs.PIXI.BaseTexture, id: String): Unit = js.native
  def from(source: String): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: String, scaleMode: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: String, scaleMode: Double, sourceScale: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: HTMLCanvasElement): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: HTMLCanvasElement, scaleMode: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: HTMLCanvasElement, scaleMode: Double, sourceScale: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: HTMLImageElement): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: HTMLImageElement, scaleMode: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def from(source: HTMLImageElement, scaleMode: Double, sourceScale: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double, origin: String): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromImage(imageUrl: String): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean, scaleMode: Double, sourceScale: Double): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def removeFromCache(baseTexture: String): typings.pixiDotJs.PIXI.BaseTexture = js.native
  def removeFromCache(baseTexture: typings.pixiDotJs.PIXI.BaseTexture): typings.pixiDotJs.PIXI.BaseTexture = js.native
}

