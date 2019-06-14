package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

/**
  * Different types for a button (predefined types)
  */
@JSGlobal("sap.m.ButtonType")
@js.native
object ButtonType extends js.Object {
  @js.native
  sealed trait Accept
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Back
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Default
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Emphasized
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Reject
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Transparent
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Unstyled
    extends openui5Lib.sapNs.mNs.ButtonType
  
  @js.native
  sealed trait Up
    extends openui5Lib.sapNs.mNs.ButtonType
  
  /* 0 */ val Accept: Accept with scala.Double = js.native
  /* 1 */ val Back: Back with scala.Double = js.native
  /* 2 */ val Default: Default with scala.Double = js.native
  /* 3 */ val Emphasized: Emphasized with scala.Double = js.native
  /* 4 */ val Reject: Reject with scala.Double = js.native
  /* 5 */ val Transparent: Transparent with scala.Double = js.native
  /* 6 */ val Unstyled: Unstyled with scala.Double = js.native
  /* 7 */ val Up: Up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ButtonType with scala.Double] = js.native
}

