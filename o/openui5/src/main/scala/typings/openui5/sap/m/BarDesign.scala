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
  
  /* 0 */ val Auto: typings.openui5.sap.m.BarDesign.Auto with Double = js.native
  /* 1 */ val Footer: typings.openui5.sap.m.BarDesign.Footer with Double = js.native
  /* 2 */ val Header: typings.openui5.sap.m.BarDesign.Header with Double = js.native
  /* 3 */ val SubHeader: typings.openui5.sap.m.BarDesign.SubHeader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BarDesign with Double] = js.native
}

