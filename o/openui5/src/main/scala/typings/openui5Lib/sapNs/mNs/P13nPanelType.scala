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
  
  /* 0 */ val columns: columns with scala.Double = js.native
  /* 1 */ val dimeasure: dimeasure with scala.Double = js.native
  /* 2 */ val filter: filter with scala.Double = js.native
  /* 3 */ val group: group with scala.Double = js.native
  /* 4 */ val sort: sort with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.P13nPanelType with scala.Double] = js.native
}

