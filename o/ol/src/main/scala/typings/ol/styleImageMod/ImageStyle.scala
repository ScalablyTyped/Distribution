package typings.ol.styleImageMod

import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageStyle extends js.Object {
  def getAnchor(): js.Array[Double] = js.native
  def getDisplacement(): js.Array[Double] = js.native
  def getHitDetectionImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  def getHitDetectionImageSize(): Size = js.native
  def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  def getImageSize(): Size = js.native
  def getImageState(): ImageState = js.native
  def getOpacity(): Double = js.native
  def getOrigin(): js.Array[Double] = js.native
  def getRotateWithView(): Boolean = js.native
  def getRotation(): Double = js.native
  def getScale(): Double = js.native
  def getSize(): Size = js.native
  def listenImageChange[T](listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]): Unit = js.native
  def load(): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def unlistenImageChange[T](listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]): Unit = js.native
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
  @scala.inline
  implicit class ImageStyleOps[Self <: ImageStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAnchor(value: () => js.Array[Double]): Self = this.set("getAnchor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDisplacement(value: () => js.Array[Double]): Self = this.set("getDisplacement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHitDetectionImage(value: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement): Self = this.set("getHitDetectionImage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHitDetectionImageSize(value: () => Size): Self = this.set("getHitDetectionImageSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImage(value: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement): Self = this.set("getImage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetImageSize(value: () => Size): Self = this.set("getImageSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImageState(value: () => ImageState): Self = this.set("getImageState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOpacity(value: () => Double): Self = this.set("getOpacity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOrigin(value: () => js.Array[Double]): Self = this.set("getOrigin", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRotateWithView(value: () => Boolean): Self = this.set("getRotateWithView", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRotation(value: () => Double): Self = this.set("getRotation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScale(value: () => Double): Self = this.set("getScale", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Size): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setListenImageChange(value: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit] => Unit): Self = this.set("listenImageChange", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOpacity(value: Double => Unit): Self = this.set("setOpacity", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRotateWithView(value: Boolean => Unit): Self = this.set("setRotateWithView", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRotation(value: Double => Unit): Self = this.set("setRotation", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScale(value: Double => Unit): Self = this.set("setScale", js.Any.fromFunction1(value))
    @scala.inline
    def setUnlistenImageChange(value: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit] => Unit): Self = this.set("unlistenImageChange", js.Any.fromFunction1(value))
  }
  
}

