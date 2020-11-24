package typings.ol.sourceImageMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageSourceEventType extends js.Object
@JSImport("ol/source/Image", "ImageSourceEventType")
@js.native
object ImageSourceEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageSourceEventType with String] = js.native
  
  @js.native
  sealed trait IMAGELOADEND extends ImageSourceEventType
  /* "imageloadend" */ @js.native
  object IMAGELOADEND extends TopLevel[IMAGELOADEND with String]
  
  @js.native
  sealed trait IMAGELOADERROR extends ImageSourceEventType
  /* "imageloaderror" */ @js.native
  object IMAGELOADERROR extends TopLevel[IMAGELOADERROR with String]
  
  @js.native
  sealed trait IMAGELOADSTART extends ImageSourceEventType
  /* "imageloadstart" */ @js.native
  object IMAGELOADSTART extends TopLevel[IMAGELOADSTART with String]
}
