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
  
  val Background: Background with java.lang.String = js.native
  val Image: Image with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ImageMode with java.lang.String] = js.native
}

