package typings.ol.sourceImageMod

import org.scalablytyped.runtime.TopLevel
import typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADEND
import typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADERROR
import typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADSTART
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageSourceEventType with String] = js.native
  /* "imageloadend" */ @js.native
  object IMAGELOADEND extends TopLevel[IMAGELOADEND with String]
  
  /* "imageloaderror" */ @js.native
  object IMAGELOADERROR extends TopLevel[IMAGELOADERROR with String]
  
  /* "imageloadstart" */ @js.native
  object IMAGELOADSTART extends TopLevel[IMAGELOADSTART with String]
  
}

