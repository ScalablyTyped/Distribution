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
  
  val Block: Block with java.lang.String = js.native
  val Inline: Inline with java.lang.String = js.native
  val WithoutHeader: WithoutHeader with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.PopinDisplay with java.lang.String] = js.native
}

