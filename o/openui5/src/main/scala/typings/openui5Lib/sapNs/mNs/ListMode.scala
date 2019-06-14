package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Delete
    extends openui5Lib.sapNs.mNs.ListMode
  
  @js.native
  sealed trait MultiSelect
    extends openui5Lib.sapNs.mNs.ListMode
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.mNs.ListMode
  
  @js.native
  sealed trait SingleSelect
    extends openui5Lib.sapNs.mNs.ListMode
  
  @js.native
  sealed trait SingleSelectLeft
    extends openui5Lib.sapNs.mNs.ListMode
  
  @js.native
  sealed trait SingleSelectMaster
    extends openui5Lib.sapNs.mNs.ListMode
  
  /* 0 */ val Delete: Delete with scala.Double = js.native
  /* 1 */ val MultiSelect: MultiSelect with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 3 */ val SingleSelect: SingleSelect with scala.Double = js.native
  /* 4 */ val SingleSelectLeft: SingleSelectLeft with scala.Double = js.native
  /* 5 */ val SingleSelectMaster: SingleSelectMaster with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ListMode with scala.Double] = js.native
}

