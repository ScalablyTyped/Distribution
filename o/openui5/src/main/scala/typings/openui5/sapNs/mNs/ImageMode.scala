package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val Background: typings.openui5.sapNs.mNs.ImageMode.Background with Double = js.native
  /* 1 */ val Image: typings.openui5.sapNs.mNs.ImageMode.Image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageMode with Double] = js.native
}

