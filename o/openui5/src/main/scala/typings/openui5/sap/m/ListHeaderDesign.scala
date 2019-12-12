package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ListHeaderDesign.Plain
import typings.openui5.sap.m.ListHeaderDesign.Standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListHeaderDesign extends js.Object

/**
  * Defines the different header styles.
  */
@JSGlobal("sap.m.ListHeaderDesign")
@js.native
object ListHeaderDesign extends js.Object {
  @js.native
  sealed trait Plain extends ListHeaderDesign
  
  @js.native
  sealed trait Standard extends ListHeaderDesign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListHeaderDesign with Double] = js.native
  /* 0 */ @js.native
  object Plain extends TopLevel[Plain with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

