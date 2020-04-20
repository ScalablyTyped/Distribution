package typings.ol.styleImageMod

import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStyle extends js.Object {
  def getAnchor(): js.Array[Double]
  def getDisplacement(): js.Array[Double]
  def getHitDetectionImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement
  def getHitDetectionImageSize(): Size
  def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement
  def getImageSize(): Size
  def getImageState(): ImageState
  def getOpacity(): Double
  def getOrigin(): js.Array[Double]
  def getRotateWithView(): Boolean
  def getRotation(): Double
  def getScale(): Double
  def getSize(): Size
  def listenImageChange[T](listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]): Unit
  def load(): Unit
  def setOpacity(opacity: Double): Unit
  def setRotateWithView(rotateWithView: Boolean): Unit
  def setRotation(rotation: Double): Unit
  def setScale(scale: Double): Unit
  def unlistenImageChange[T](listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]): Unit
}

object ImageStyle {
  @scala.inline
  def apply(
    getAnchor: () => js.Array[Double],
    getDisplacement: () => js.Array[Double],
    getHitDetectionImage: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement,
    getHitDetectionImageSize: () => Size,
    getImage: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement,
    getImageSize: () => Size,
    getImageState: () => ImageState,
    getOpacity: () => Double,
    getOrigin: () => js.Array[Double],
    getRotateWithView: () => Boolean,
    getRotation: () => Double,
    getScale: () => Double,
    getSize: () => Size,
    listenImageChange: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit] => Unit,
    load: () => Unit,
    setOpacity: Double => Unit,
    setRotateWithView: Boolean => Unit,
    setRotation: Double => Unit,
    setScale: Double => Unit,
    unlistenImageChange: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit] => Unit
  ): ImageStyle = {
    val __obj = js.Dynamic.literal(getAnchor = js.Any.fromFunction0(getAnchor), getDisplacement = js.Any.fromFunction0(getDisplacement), getHitDetectionImage = js.Any.fromFunction1(getHitDetectionImage), getHitDetectionImageSize = js.Any.fromFunction0(getHitDetectionImageSize), getImage = js.Any.fromFunction1(getImage), getImageSize = js.Any.fromFunction0(getImageSize), getImageState = js.Any.fromFunction0(getImageState), getOpacity = js.Any.fromFunction0(getOpacity), getOrigin = js.Any.fromFunction0(getOrigin), getRotateWithView = js.Any.fromFunction0(getRotateWithView), getRotation = js.Any.fromFunction0(getRotation), getScale = js.Any.fromFunction0(getScale), getSize = js.Any.fromFunction0(getSize), listenImageChange = js.Any.fromFunction1(listenImageChange), load = js.Any.fromFunction0(load), setOpacity = js.Any.fromFunction1(setOpacity), setRotateWithView = js.Any.fromFunction1(setRotateWithView), setRotation = js.Any.fromFunction1(setRotation), setScale = js.Any.fromFunction1(setScale), unlistenImageChange = js.Any.fromFunction1(unlistenImageChange))
    __obj.asInstanceOf[ImageStyle]
  }
}

