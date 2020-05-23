package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconColor extends js.Object

/**
  * Semantic Colors of an icon.
  */
@JSGlobal("sap.ui.core.IconColor")
@js.native
object IconColor extends js.Object {
  @js.native
  sealed trait Critical extends IconColor
  
  @js.native
  sealed trait Default extends IconColor
  
  @js.native
  sealed trait Negative extends IconColor
  
  @js.native
  sealed trait Neutral extends IconColor
  
  @js.native
  sealed trait Positive extends IconColor
  
}

