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
  
}

