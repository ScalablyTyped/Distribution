package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ButtonType.Accept
import typings.openui5.sap.m.ButtonType.Back
import typings.openui5.sap.m.ButtonType.Default
import typings.openui5.sap.m.ButtonType.Emphasized
import typings.openui5.sap.m.ButtonType.Reject
import typings.openui5.sap.m.ButtonType.Transparent
import typings.openui5.sap.m.ButtonType.Unstyled
import typings.openui5.sap.m.ButtonType.Up
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
  /* 0 */ @js.native
  object Accept extends TopLevel[Accept with Double]
  
  /* 1 */ @js.native
  object Back extends TopLevel[Back with Double]
  
  /* 2 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 3 */ @js.native
  object Emphasized extends TopLevel[Emphasized with Double]
  
  /* 4 */ @js.native
  object Reject extends TopLevel[Reject with Double]
  
  /* 5 */ @js.native
  object Transparent extends TopLevel[Transparent with Double]
  
  /* 6 */ @js.native
  object Unstyled extends TopLevel[Unstyled with Double]
  
  /* 7 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

