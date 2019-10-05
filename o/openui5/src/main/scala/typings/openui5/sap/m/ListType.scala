package typings.openui5.sap.m

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
  sealed trait Active extends ListType
  
  @js.native
  sealed trait Detail extends ListType
  
  @js.native
  sealed trait DetailAndActive extends ListType
  
  @js.native
  sealed trait Inactive extends ListType
  
  @js.native
  sealed trait Navigation extends ListType
  
  /* 0 */ val Active: typings.openui5.sap.m.ListType.Active with Double = js.native
  /* 1 */ val Detail: typings.openui5.sap.m.ListType.Detail with Double = js.native
  /* 2 */ val DetailAndActive: typings.openui5.sap.m.ListType.DetailAndActive with Double = js.native
  /* 3 */ val Inactive: typings.openui5.sap.m.ListType.Inactive with Double = js.native
  /* 4 */ val Navigation: typings.openui5.sap.m.ListType.Navigation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListType with Double] = js.native
}

