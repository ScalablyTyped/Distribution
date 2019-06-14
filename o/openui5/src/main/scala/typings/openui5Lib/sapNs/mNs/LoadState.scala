package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadState extends js.Object

/**
  * Enumeration of possible load statuses.
  */
@JSGlobal("sap.m.LoadState")
@js.native
object LoadState extends js.Object {
  @js.native
  sealed trait Disabled
    extends openui5Lib.sapNs.mNs.LoadState
  
  @js.native
  sealed trait Failed
    extends openui5Lib.sapNs.mNs.LoadState
  
  @js.native
  sealed trait Loaded
    extends openui5Lib.sapNs.mNs.LoadState
  
  @js.native
  sealed trait Loading
    extends openui5Lib.sapNs.mNs.LoadState
  
  /* 0 */ val Disabled: Disabled with scala.Double = js.native
  /* 1 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val Loaded: Loaded with scala.Double = js.native
  /* 3 */ val Loading: Loading with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.LoadState with scala.Double] = js.native
}

