package typings.openui5.sapNs.uiNs.coreNs

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
  
  /* 0 */ val Critical: typings.openui5.sapNs.uiNs.coreNs.IconColor.Critical with Double = js.native
  /* 1 */ val Default: typings.openui5.sapNs.uiNs.coreNs.IconColor.Default with Double = js.native
  /* 2 */ val Negative: typings.openui5.sapNs.uiNs.coreNs.IconColor.Negative with Double = js.native
  /* 3 */ val Neutral: typings.openui5.sapNs.uiNs.coreNs.IconColor.Neutral with Double = js.native
  /* 4 */ val Positive: typings.openui5.sapNs.uiNs.coreNs.IconColor.Positive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconColor with Double] = js.native
}

