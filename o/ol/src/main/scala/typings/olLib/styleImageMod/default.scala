package typings
package olLib.styleImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/Image", JSImport.Default)
@js.native
class default protected () extends ImageStyle {
  def this(options: Options) = this()
  /* CompleteClass */
  override def getAnchor(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getHitDetectionImage(pixelRatio: scala.Double): stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement = js.native
  /* CompleteClass */
  override def getHitDetectionImageSize(): olLib.sizeMod.Size = js.native
  /* CompleteClass */
  override def getImage(pixelRatio: scala.Double): stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement = js.native
  /* CompleteClass */
  override def getImageSize(): olLib.sizeMod.Size = js.native
  /* CompleteClass */
  override def getImageState(): olLib.imageStateMod.ImageState = js.native
  /* CompleteClass */
  override def getOpacity(): scala.Double = js.native
  /* CompleteClass */
  override def getOrigin(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getRotateWithView(): scala.Boolean = js.native
  /* CompleteClass */
  override def getRotation(): scala.Double = js.native
  /* CompleteClass */
  override def getScale(): scala.Double = js.native
  /* CompleteClass */
  override def getSize(): olLib.sizeMod.Size = js.native
  /* CompleteClass */
  override def getSnapToPixel(): scala.Boolean = js.native
  /* CompleteClass */
  override def listenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* param1 */ olLib.eventsEventMod.default, scala.Unit],
    thisArg: T
  ): olLib.eventsMod.EventsKey = js.native
  /* CompleteClass */
  override def load(): scala.Unit = js.native
  /* CompleteClass */
  override def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRotateWithView(rotateWithView: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setRotation(rotation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setScale(scale: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setSnapToPixel(snapToPixel: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def unlistenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* param1 */ olLib.eventsEventMod.default, scala.Unit],
    thisArg: T
  ): scala.Unit = js.native
}

