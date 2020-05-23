package typings.openui5.sap.m

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
  
}

