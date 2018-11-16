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
  
  val Delete: Delete with java.lang.String = js.native
  val MultiSelect: MultiSelect with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val SingleSelect: SingleSelect with java.lang.String = js.native
  val SingleSelectLeft: SingleSelectLeft with java.lang.String = js.native
  val SingleSelectMaster: SingleSelectMaster with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ListMode with java.lang.String] = js.native
}

