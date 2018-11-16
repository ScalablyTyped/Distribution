package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

/**
       * Configuration options for the direction of texts.
      */
@JSGlobal("sap.ui.core.TextDirection")
@js.native
object TextDirection extends js.Object {
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.uiNs.coreNs.TextDirection
  
  @js.native
  sealed trait LTR
    extends openui5Lib.sapNs.uiNs.coreNs.TextDirection
  
  @js.native
  sealed trait RTL
    extends openui5Lib.sapNs.uiNs.coreNs.TextDirection
  
  val Inherit: Inherit with java.lang.String = js.native
  val LTR: LTR with java.lang.String = js.native
  val RTL: RTL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.TextDirection with java.lang.String] = js.native
}

