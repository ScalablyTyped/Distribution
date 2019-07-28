package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListMode extends js.Object

/**
  * Defines the mode of the list.
  */
@JSGlobal("sap.m.ListMode")
@js.native
object ListMode extends js.Object {
  @js.native
  sealed trait Delete extends ListMode
  
  @js.native
  sealed trait MultiSelect extends ListMode
  
  @js.native
  sealed trait None extends ListMode
  
  @js.native
  sealed trait SingleSelect extends ListMode
  
  @js.native
  sealed trait SingleSelectLeft extends ListMode
  
  @js.native
  sealed trait SingleSelectMaster extends ListMode
  
  /* 0 */ val Delete: typings.openui5.sapNs.mNs.ListMode.Delete with Double = js.native
  /* 1 */ val MultiSelect: typings.openui5.sapNs.mNs.ListMode.MultiSelect with Double = js.native
  /* 2 */ val None: typings.openui5.sapNs.mNs.ListMode.None with Double = js.native
  /* 3 */ val SingleSelect: typings.openui5.sapNs.mNs.ListMode.SingleSelect with Double = js.native
  /* 4 */ val SingleSelectLeft: typings.openui5.sapNs.mNs.ListMode.SingleSelectLeft with Double = js.native
  /* 5 */ val SingleSelectMaster: typings.openui5.sapNs.mNs.ListMode.SingleSelectMaster with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListMode with Double] = js.native
}

