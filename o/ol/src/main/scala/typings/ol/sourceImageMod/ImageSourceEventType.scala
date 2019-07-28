package typings.ol.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageSourceEventType extends js.Object

@JSImport("ol/source/Image", "ImageSourceEventType")
@js.native
object ImageSourceEventType extends js.Object {
  @js.native
  sealed trait IMAGELOADEND extends ImageSourceEventType
  
  @js.native
  sealed trait IMAGELOADERROR extends ImageSourceEventType
  
  @js.native
  sealed trait IMAGELOADSTART extends ImageSourceEventType
  
  /* "imageloadend" */ val IMAGELOADEND: typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADEND with String = js.native
  /* "imageloaderror" */ val IMAGELOADERROR: typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADERROR with String = js.native
  /* "imageloadstart" */ val IMAGELOADSTART: typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADSTART with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageSourceEventType with String] = js.native
}

