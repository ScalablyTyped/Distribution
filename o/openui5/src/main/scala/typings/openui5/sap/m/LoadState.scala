package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.LoadState.Disabled
import typings.openui5.sap.m.LoadState.Failed
import typings.openui5.sap.m.LoadState.Loaded
import typings.openui5.sap.m.LoadState.Loading
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoadState with Double] = js.native
  /* 0 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 1 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object Loaded extends TopLevel[Loaded with Double]
  
  /* 3 */ @js.native
  object Loading extends TopLevel[Loading with Double]
  
}

