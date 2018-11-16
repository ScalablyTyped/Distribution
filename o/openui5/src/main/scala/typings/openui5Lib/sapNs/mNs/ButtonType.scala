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
  
  val Accept: Accept with java.lang.String = js.native
  val Back: Back with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Emphasized: Emphasized with java.lang.String = js.native
  val Reject: Reject with java.lang.String = js.native
  val Transparent: Transparent with java.lang.String = js.native
  val Unstyled: Unstyled with java.lang.String = js.native
  val Up: Up with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ButtonType with java.lang.String] = js.native
}

