package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

/**
  * Different types for a button (predefined types)
  */
@JSGlobal("sap.m.ButtonType")
@js.native
object ButtonType extends js.Object {
  @js.native
  sealed trait Accept extends ButtonType
  
  @js.native
  sealed trait Back extends ButtonType
  
  @js.native
  sealed trait Default extends ButtonType
  
  @js.native
  sealed trait Emphasized extends ButtonType
  
  @js.native
  sealed trait Reject extends ButtonType
  
  @js.native
  sealed trait Transparent extends ButtonType
  
  @js.native
  sealed trait Unstyled extends ButtonType
  
  @js.native
  sealed trait Up extends ButtonType
  
}

