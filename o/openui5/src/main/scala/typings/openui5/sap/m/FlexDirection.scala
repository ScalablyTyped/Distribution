package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Column extends FlexDirection
  
  @js.native
  sealed trait ColumnReverse extends FlexDirection
  
  @js.native
  sealed trait Inherit extends FlexDirection
  
  @js.native
  sealed trait Row extends FlexDirection
  
  @js.native
  sealed trait RowReverse extends FlexDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexDirection with Double] = js.native
  /* 0 */ @js.native
  object Column
    extends TopLevel[typings.openui5.sap.m.FlexDirection.Column with Double]
  
  /* 1 */ @js.native
  object ColumnReverse extends TopLevel[ColumnReverse with Double]
  
  /* 2 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 3 */ @js.native
  object Row extends TopLevel[Row with Double]
  
  /* 4 */ @js.native
  object RowReverse extends TopLevel[RowReverse with Double]
  
}

