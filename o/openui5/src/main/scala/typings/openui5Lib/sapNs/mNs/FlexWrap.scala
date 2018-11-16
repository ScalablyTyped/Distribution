package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexWrap extends js.Object

/**
     * Available options for the wrapping behavior of a flex container.
    */
@JSGlobal("sap.m.FlexWrap")
@js.native
object FlexWrap extends js.Object {
  @js.native
  sealed trait NoWrap
    extends openui5Lib.sapNs.mNs.FlexWrap
  
  @js.native
  sealed trait Wrap
    extends openui5Lib.sapNs.mNs.FlexWrap
  
  @js.native
  sealed trait WrapReverse
    extends openui5Lib.sapNs.mNs.FlexWrap
  
  val NoWrap: NoWrap with java.lang.String = js.native
  val Wrap: Wrap with java.lang.String = js.native
  val WrapReverse: WrapReverse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FlexWrap with java.lang.String] = js.native
}

