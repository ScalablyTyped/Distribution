package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait P13nPanelType extends js.Object

/**
  * Type of panels used in the personalization dialog.
  */
@JSGlobal("sap.m.P13nPanelType")
@js.native
object P13nPanelType extends js.Object {
  @js.native
  sealed trait columns
    extends openui5Lib.sapNs.mNs.P13nPanelType
  
  @js.native
  sealed trait dimeasure
    extends openui5Lib.sapNs.mNs.P13nPanelType
  
  @js.native
  sealed trait filter
    extends openui5Lib.sapNs.mNs.P13nPanelType
  
  @js.native
  sealed trait group
    extends openui5Lib.sapNs.mNs.P13nPanelType
  
  @js.native
  sealed trait sort
    extends openui5Lib.sapNs.mNs.P13nPanelType
  
  val columns: columns with java.lang.String = js.native
  val dimeasure: dimeasure with java.lang.String = js.native
  val filter: filter with java.lang.String = js.native
  val group: group with java.lang.String = js.native
  val sort: sort with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.P13nPanelType with java.lang.String] = js.native
}

