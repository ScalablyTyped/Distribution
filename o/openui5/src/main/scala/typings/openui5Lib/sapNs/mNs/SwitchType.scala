package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SwitchType extends js.Object

/**
     * Enumaration for different switch types.
    */
@JSGlobal("sap.m.SwitchType")
@js.native
object SwitchType extends js.Object {
  @js.native
  sealed trait AcceptReject
    extends openui5Lib.sapNs.mNs.SwitchType
  
  @js.native
  sealed trait Default
    extends openui5Lib.sapNs.mNs.SwitchType
  
  val AcceptReject: AcceptReject with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.SwitchType with java.lang.String] = js.native
}

