package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val Plain: typings.openui5.sapNs.mNs.ListHeaderDesign.Plain with Double = js.native
  /* 1 */ val Standard: typings.openui5.sapNs.mNs.ListHeaderDesign.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListHeaderDesign with Double] = js.native
}

