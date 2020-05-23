package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarColor extends js.Object

/**
  * Configuration options for the colors of a progress bar
  */
@JSGlobal("sap.ui.core.BarColor")
@js.native
object BarColor extends js.Object {
  @js.native
  sealed trait CRITICAL extends BarColor
  
  @js.native
  sealed trait NEGATIVE extends BarColor
  
  @js.native
  sealed trait NEUTRAL extends BarColor
  
  @js.native
  sealed trait POSITIVE extends BarColor
  
}

