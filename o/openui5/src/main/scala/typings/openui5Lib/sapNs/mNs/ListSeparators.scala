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
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 1 */ val Inner: Inner with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ListSeparators with scala.Double] = js.native
}

