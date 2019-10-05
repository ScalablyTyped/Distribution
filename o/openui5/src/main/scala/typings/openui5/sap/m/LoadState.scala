package typings.openui5.sap.m

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
  sealed trait Disabled extends LoadState
  
  @js.native
  sealed trait Failed extends LoadState
  
  @js.native
  sealed trait Loaded extends LoadState
  
  @js.native
  sealed trait Loading extends LoadState
  
  /* 0 */ val Disabled: typings.openui5.sap.m.LoadState.Disabled with Double = js.native
  /* 1 */ val Failed: typings.openui5.sap.m.LoadState.Failed with Double = js.native
  /* 2 */ val Loaded: typings.openui5.sap.m.LoadState.Loaded with Double = js.native
  /* 3 */ val Loading: typings.openui5.sap.m.LoadState.Loading with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoadState with Double] = js.native
}

