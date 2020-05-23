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
  
}

