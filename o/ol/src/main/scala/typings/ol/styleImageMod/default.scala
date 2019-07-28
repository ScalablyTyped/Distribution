package typings.ol.styleImageMod

import typings.ol.eventsMod.EventsKey
import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/Image", JSImport.Default)
@js.native
class default protected () extends ImageStyle {
  def this(options: Options) = this()
  /* CompleteClass */
  override def getAnchor(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getHitDetectionImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  /* CompleteClass */
  override def getHitDetectionImageSize(): Size = js.native
  /* CompleteClass */
  override def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  /* CompleteClass */
  override def getImageSize(): Size = js.native
  /* CompleteClass */
  override def getImageState(): ImageState = js.native
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  /* CompleteClass */
  override def getOrigin(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getRotateWithView(): Boolean = js.native
  /* CompleteClass */
  override def getRotation(): Double = js.native
  /* CompleteClass */
  override def getScale(): Double = js.native
  /* CompleteClass */
  override def getSize(): Size = js.native
  /* CompleteClass */
  override def getSnapToPixel(): Boolean = js.native
  /* CompleteClass */
  override def listenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* p0 */ typings.ol.eventsEventMod.default, Unit],
    thisArg: T
  ): EventsKey = js.native
  /* CompleteClass */
  override def load(): Unit = js.native
  /* CompleteClass */
  override def setOpacity(opacity: Double): Unit = js.native
  /* CompleteClass */
  override def setRotateWithView(rotateWithView: Boolean): Unit = js.native
  /* CompleteClass */
  override def setRotation(rotation: Double): Unit = js.native
  /* CompleteClass */
  override def setScale(scale: Double): Unit = js.native
  /* CompleteClass */
  override def setSnapToPixel(snapToPixel: Boolean): Unit = js.native
  /* CompleteClass */
  override def unlistenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* p0 */ typings.ol.eventsEventMod.default, Unit],
    thisArg: T
  ): Unit = js.native
}

