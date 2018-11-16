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
  
  val Active: Active with java.lang.String = js.native
  val Detail: Detail with java.lang.String = js.native
  val DetailAndActive: DetailAndActive with java.lang.String = js.native
  val Inactive: Inactive with java.lang.String = js.native
  val Navigation: Navigation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ListType with java.lang.String] = js.native
}

