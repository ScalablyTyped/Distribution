package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopinDisplay extends js.Object

/**
  * Defines the display of table pop-ins
  */
@JSGlobal("sap.m.PopinDisplay")
@js.native
object PopinDisplay extends js.Object {
  @js.native
  sealed trait Block extends PopinDisplay
  
  @js.native
  sealed trait Inline extends PopinDisplay
  
  @js.native
  sealed trait WithoutHeader extends PopinDisplay
  
}

