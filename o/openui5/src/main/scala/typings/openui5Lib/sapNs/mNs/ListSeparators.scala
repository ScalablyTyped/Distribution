package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListSeparators extends js.Object

/**
  * Defines which separator style will be applied for the items.
  */
@JSGlobal("sap.m.ListSeparators")
@js.native
object ListSeparators extends js.Object {
  @js.native
  sealed trait All
    extends openui5Lib.sapNs.mNs.ListSeparators
  
  @js.native
  sealed trait Inner
    extends openui5Lib.sapNs.mNs.ListSeparators
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.mNs.ListSeparators
  
  val All: All with java.lang.String = js.native
  val Inner: Inner with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ListSeparators with java.lang.String] = js.native
}

