package typings
package olLib.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageSourceEventType extends js.Object

@JSImport("ol/source/Image", "ImageSourceEventType")
@js.native
object ImageSourceEventType extends js.Object {
  @js.native
  sealed trait IMAGELOADEND
    extends olLib.sourceImageMod.ImageSourceEventType
  
  @js.native
  sealed trait IMAGELOADERROR
    extends olLib.sourceImageMod.ImageSourceEventType
  
  @js.native
  sealed trait IMAGELOADSTART
    extends olLib.sourceImageMod.ImageSourceEventType
  
  /* "imageloadend" */ val IMAGELOADEND: IMAGELOADEND with java.lang.String = js.native
  /* "imageloaderror" */ val IMAGELOADERROR: IMAGELOADERROR with java.lang.String = js.native
  /* "imageloadstart" */ val IMAGELOADSTART: IMAGELOADSTART with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.sourceImageMod.ImageSourceEventType with java.lang.String] = js.native
}

