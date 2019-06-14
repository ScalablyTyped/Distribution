package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListType extends js.Object

/**
  * Defines the visual indication and behaviour of the list items.
  */
@JSGlobal("sap.m.ListType")
@js.native
object ListType extends js.Object {
  @js.native
  sealed trait Active
    extends openui5Lib.sapNs.mNs.ListType
  
  @js.native
  sealed trait Detail
    extends openui5Lib.sapNs.mNs.ListType
  
  @js.native
  sealed trait DetailAndActive
    extends openui5Lib.sapNs.mNs.ListType
  
  @js.native
  sealed trait Inactive
    extends openui5Lib.sapNs.mNs.ListType
  
  @js.native
  sealed trait Navigation
    extends openui5Lib.sapNs.mNs.ListType
  
  /* 0 */ val Active: Active with scala.Double = js.native
  /* 1 */ val Detail: Detail with scala.Double = js.native
  /* 2 */ val DetailAndActive: DetailAndActive with scala.Double = js.native
  /* 3 */ val Inactive: Inactive with scala.Double = js.native
  /* 4 */ val Navigation: Navigation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ListType with scala.Double] = js.native
}

