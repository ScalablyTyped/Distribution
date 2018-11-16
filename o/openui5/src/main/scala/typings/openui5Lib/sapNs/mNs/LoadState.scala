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
  
  val Disabled: Disabled with java.lang.String = js.native
  val Failed: Failed with java.lang.String = js.native
  val Loaded: Loaded with java.lang.String = js.native
  val Loading: Loading with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.LoadState with java.lang.String] = js.native
}

