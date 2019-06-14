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
  
  /* 0 */ val NoWrap: NoWrap with scala.Double = js.native
  /* 1 */ val Wrap: Wrap with scala.Double = js.native
  /* 2 */ val WrapReverse: WrapReverse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexWrap with scala.Double] = js.native
}

