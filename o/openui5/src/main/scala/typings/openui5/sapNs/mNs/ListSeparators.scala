package typings.openui5.sapNs.mNs

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
  sealed trait All extends ListSeparators
  
  @js.native
  sealed trait Inner extends ListSeparators
  
  @js.native
  sealed trait None extends ListSeparators
  
  /* 0 */ val All: typings.openui5.sapNs.mNs.ListSeparators.All with Double = js.native
  /* 1 */ val Inner: typings.openui5.sapNs.mNs.ListSeparators.Inner with Double = js.native
  /* 2 */ val None: typings.openui5.sapNs.mNs.ListSeparators.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListSeparators with Double] = js.native
}

