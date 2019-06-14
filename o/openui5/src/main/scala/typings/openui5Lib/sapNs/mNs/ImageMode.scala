package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Background
    extends openui5Lib.sapNs.mNs.ImageMode
  
  @js.native
  sealed trait Image
    extends openui5Lib.sapNs.mNs.ImageMode
  
  /* 0 */ val Background: Background with scala.Double = js.native
  /* 1 */ val Image: Image with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ImageMode with scala.Double] = js.native
}

