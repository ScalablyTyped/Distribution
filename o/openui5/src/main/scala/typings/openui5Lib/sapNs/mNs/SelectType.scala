package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectType extends js.Object

/**
     * Enumeration for different Select types.
    */
@JSGlobal("sap.m.SelectType")
@js.native
object SelectType extends js.Object {
  @js.native
  sealed trait Default
    extends openui5Lib.sapNs.mNs.SelectType
  
  @js.native
  sealed trait IconOnly
    extends openui5Lib.sapNs.mNs.SelectType
  
  val Default: Default with java.lang.String = js.native
  val IconOnly: IconOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.SelectType with java.lang.String] = js.native
}

