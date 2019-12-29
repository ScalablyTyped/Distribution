package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconTabFilterDesign extends js.Object

/**
  * Available Filter Item Design.
  */
@JSGlobal("sap.m.IconTabFilterDesign")
@js.native
object IconTabFilterDesign extends js.Object {
  @js.native
  sealed trait Horizontal extends IconTabFilterDesign
  
  @js.native
  sealed trait Vertical extends IconTabFilterDesign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconTabFilterDesign with Double] = js.native
  /* 0 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

