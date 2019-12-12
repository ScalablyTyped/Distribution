package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ImageMode.Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageMode extends js.Object

/**
  * Determines how the source image is used on the output DOM element.
  */
@JSGlobal("sap.m.ImageMode")
@js.native
object ImageMode extends js.Object {
  @js.native
  sealed trait Background extends ImageMode
  
  @js.native
  sealed trait Image extends ImageMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageMode with Double] = js.native
  /* 0 */ @js.native
  object Background extends TopLevel[Background with Double]
  
  /* 1 */ @js.native
  object Image
    extends TopLevel[typings.openui5.sap.m.ImageMode.Image with Double]
  
}

