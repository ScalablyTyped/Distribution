package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectType extends js.Object

/**
  * Enumeration for different Select types.
  */
@JSGlobal("sap.m.SelectType")
@js.native
object SelectType extends js.Object {
  @js.native
  sealed trait Default extends SelectType
  
  @js.native
  sealed trait IconOnly extends SelectType
  
  /* 0 */ val Default: typings.openui5.sap.m.SelectType.Default with Double = js.native
  /* 1 */ val IconOnly: typings.openui5.sap.m.SelectType.IconOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
}

