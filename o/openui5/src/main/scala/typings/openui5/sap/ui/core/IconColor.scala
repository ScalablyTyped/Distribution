package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.IconColor.Critical
import typings.openui5.sap.ui.core.IconColor.Default
import typings.openui5.sap.ui.core.IconColor.Negative
import typings.openui5.sap.ui.core.IconColor.Neutral
import typings.openui5.sap.ui.core.IconColor.Positive
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconColor with Double] = js.native
  /* 0 */ @js.native
  object Critical extends TopLevel[Critical with Double]
  
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Negative extends TopLevel[Negative with Double]
  
  /* 3 */ @js.native
  object Neutral extends TopLevel[Neutral with Double]
  
  /* 4 */ @js.native
  object Positive extends TopLevel[Positive with Double]
  
}

