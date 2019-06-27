package typings
package olLib.styleImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStyle extends js.Object {
  def getAnchor(): js.Array[scala.Double]
  def getHitDetectionImage(pixelRatio: scala.Double): stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement
  def getHitDetectionImageSize(): olLib.sizeMod.Size
  def getImage(pixelRatio: scala.Double): stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement
  def getImageSize(): olLib.sizeMod.Size
  def getImageState(): olLib.imageStateMod.ImageState
  def getOpacity(): scala.Double
  def getOrigin(): js.Array[scala.Double]
  def getRotateWithView(): scala.Boolean
  def getRotation(): scala.Double
  def getScale(): scala.Double
  def getSize(): olLib.sizeMod.Size
  def getSnapToPixel(): scala.Boolean
  def listenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* p1 */ olLib.eventsEventMod.default, scala.Unit],
    thisArg: T
  ): olLib.eventsMod.EventsKey
  def load(): scala.Unit
  def setOpacity(opacity: scala.Double): scala.Unit
  def setRotateWithView(rotateWithView: scala.Boolean): scala.Unit
  def setRotation(rotation: scala.Double): scala.Unit
  def setScale(scale: scala.Double): scala.Unit
  def setSnapToPixel(snapToPixel: scala.Boolean): scala.Unit
  def unlistenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* p1 */ olLib.eventsEventMod.default, scala.Unit],
    thisArg: T
  ): scala.Unit
}

object ImageStyle {
  @scala.inline
  def apply(
    clone: () => ImageStyle,
    getAnchor: () => js.Array[scala.Double],
    getHitDetectionImage: scala.Double => stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement,
    getHitDetectionImageSize: () => olLib.sizeMod.Size,
    getImage: scala.Double => stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement,
    getImageSize: () => olLib.sizeMod.Size,
    getImageState: () => olLib.imageStateMod.ImageState,
    getOpacity: () => scala.Double,
    getOrigin: () => js.Array[scala.Double],
    getRotateWithView: () => scala.Boolean,
    getRotation: () => scala.Double,
    getScale: () => scala.Double,
    getSize: () => olLib.sizeMod.Size,
    getSnapToPixel: () => scala.Boolean,
    listenImageChange: (js.ThisFunction1[js.Any, /* p1 */ olLib.eventsEventMod.default, scala.Unit], js.Any) => olLib.eventsMod.EventsKey,
    load: () => scala.Unit,
    setOpacity: scala.Double => scala.Unit,
    setRotateWithView: scala.Boolean => scala.Unit,
    setRotation: scala.Double => scala.Unit,
    setScale: scala.Double => scala.Unit,
    setSnapToPixel: scala.Boolean => scala.Unit,
    unlistenImageChange: (js.ThisFunction1[js.Any, /* p1 */ olLib.eventsEventMod.default, scala.Unit], js.Any) => scala.Unit
  ): ImageStyle = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), getAnchor = js.Any.fromFunction0(getAnchor), getHitDetectionImage = js.Any.fromFunction1(getHitDetectionImage), getHitDetectionImageSize = js.Any.fromFunction0(getHitDetectionImageSize), getImage = js.Any.fromFunction1(getImage), getImageSize = js.Any.fromFunction0(getImageSize), getImageState = js.Any.fromFunction0(getImageState), getOpacity = js.Any.fromFunction0(getOpacity), getOrigin = js.Any.fromFunction0(getOrigin), getRotateWithView = js.Any.fromFunction0(getRotateWithView), getRotation = js.Any.fromFunction0(getRotation), getScale = js.Any.fromFunction0(getScale), getSize = js.Any.fromFunction0(getSize), getSnapToPixel = js.Any.fromFunction0(getSnapToPixel), listenImageChange = js.Any.fromFunction2(listenImageChange), load = js.Any.fromFunction0(load), setOpacity = js.Any.fromFunction1(setOpacity), setRotateWithView = js.Any.fromFunction1(setRotateWithView), setRotation = js.Any.fromFunction1(setRotation), setScale = js.Any.fromFunction1(setScale), setSnapToPixel = js.Any.fromFunction1(setSnapToPixel), unlistenImageChange = js.Any.fromFunction2(unlistenImageChange))
  
    __obj.asInstanceOf[ImageStyle]
  }
}

