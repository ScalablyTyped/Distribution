package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Critical
    extends openui5Lib.sapNs.uiNs.coreNs.IconColor
  
  @js.native
  sealed trait Default
    extends openui5Lib.sapNs.uiNs.coreNs.IconColor
  
  @js.native
  sealed trait Negative
    extends openui5Lib.sapNs.uiNs.coreNs.IconColor
  
  @js.native
  sealed trait Neutral
    extends openui5Lib.sapNs.uiNs.coreNs.IconColor
  
  @js.native
  sealed trait Positive
    extends openui5Lib.sapNs.uiNs.coreNs.IconColor
  
  /* 0 */ val Critical: Critical with scala.Double = js.native
  /* 1 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Negative: Negative with scala.Double = js.native
  /* 3 */ val Neutral: Neutral with scala.Double = js.native
  /* 4 */ val Positive: Positive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.IconColor with scala.Double] = js.native
}

