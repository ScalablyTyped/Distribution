package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.BarDesign.Auto
import typings.openui5.sap.m.BarDesign.Footer
import typings.openui5.sap.m.BarDesign.Header
import typings.openui5.sap.m.BarDesign.SubHeader
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BarDesign with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object Footer extends TopLevel[Footer with Double]
  
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
  /* 3 */ @js.native
  object SubHeader extends TopLevel[SubHeader with Double]
  
}

