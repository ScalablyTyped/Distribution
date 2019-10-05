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
  
  /* 0 */ val Accept: typings.openui5.sap.m.ButtonType.Accept with Double = js.native
  /* 1 */ val Back: typings.openui5.sap.m.ButtonType.Back with Double = js.native
  /* 2 */ val Default: typings.openui5.sap.m.ButtonType.Default with Double = js.native
  /* 3 */ val Emphasized: typings.openui5.sap.m.ButtonType.Emphasized with Double = js.native
  /* 4 */ val Reject: typings.openui5.sap.m.ButtonType.Reject with Double = js.native
  /* 5 */ val Transparent: typings.openui5.sap.m.ButtonType.Transparent with Double = js.native
  /* 6 */ val Unstyled: typings.openui5.sap.m.ButtonType.Unstyled with Double = js.native
  /* 7 */ val Up: typings.openui5.sap.m.ButtonType.Up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
}

