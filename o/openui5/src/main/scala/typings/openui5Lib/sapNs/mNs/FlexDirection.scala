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
  
  val Column: Column with java.lang.String = js.native
  val ColumnReverse: ColumnReverse with java.lang.String = js.native
  val Inherit: Inherit with java.lang.String = js.native
  val Row: Row with java.lang.String = js.native
  val RowReverse: RowReverse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.FlexDirection with java.lang.String] = js.native
}

