package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Wrapping extends js.Object

/**
  * Configuration options for text wrapping.
  */
@JSGlobal("sap.ui.core.Wrapping")
@js.native
object Wrapping extends js.Object {
  @js.native
  sealed trait Hard extends Wrapping
  
  @js.native
  sealed trait None extends Wrapping
  
  @js.native
  sealed trait Off extends Wrapping
  
  @js.native
  sealed trait Soft extends Wrapping
  
}

