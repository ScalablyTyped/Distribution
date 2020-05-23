package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarDesign extends js.Object

/**
  * Types of the Bar design
  */
@JSGlobal("sap.m.BarDesign")
@js.native
object BarDesign extends js.Object {
  @js.native
  sealed trait Auto extends BarDesign
  
  @js.native
  sealed trait Footer extends BarDesign
  
  @js.native
  sealed trait Header extends BarDesign
  
  @js.native
  sealed trait SubHeader extends BarDesign
  
}

