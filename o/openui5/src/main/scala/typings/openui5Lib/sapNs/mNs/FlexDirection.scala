package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexDirection extends js.Object

/**
  * Available directions for flex layouts.
  */
@JSGlobal("sap.m.FlexDirection")
@js.native
object FlexDirection extends js.Object {
  @js.native
  sealed trait Column
    extends openui5Lib.sapNs.mNs.FlexDirection
  
  @js.native
  sealed trait ColumnReverse
    extends openui5Lib.sapNs.mNs.FlexDirection
  
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.mNs.FlexDirection
  
  @js.native
  sealed trait Row
    extends openui5Lib.sapNs.mNs.FlexDirection
  
  @js.native
  sealed trait RowReverse
    extends openui5Lib.sapNs.mNs.FlexDirection
  
  /* 0 */ val Column: Column with scala.Double = js.native
  /* 1 */ val ColumnReverse: ColumnReverse with scala.Double = js.native
  /* 2 */ val Inherit: Inherit with scala.Double = js.native
  /* 3 */ val Row: Row with scala.Double = js.native
  /* 4 */ val RowReverse: RowReverse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.FlexDirection with scala.Double] = js.native
}

