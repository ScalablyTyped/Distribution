package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopinDisplay extends js.Object

/**
  * Defines the display of table pop-ins
  */
@JSGlobal("sap.m.PopinDisplay")
@js.native
object PopinDisplay extends js.Object {
  @js.native
  sealed trait Block
    extends openui5Lib.sapNs.mNs.PopinDisplay
  
  @js.native
  sealed trait Inline
    extends openui5Lib.sapNs.mNs.PopinDisplay
  
  @js.native
  sealed trait WithoutHeader
    extends openui5Lib.sapNs.mNs.PopinDisplay
  
  /* 0 */ val Block: Block with scala.Double = js.native
  /* 1 */ val Inline: Inline with scala.Double = js.native
  /* 2 */ val WithoutHeader: WithoutHeader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.PopinDisplay with scala.Double] = js.native
}

