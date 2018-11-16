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
  
  val Critical: Critical with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Negative: Negative with java.lang.String = js.native
  val Neutral: Neutral with java.lang.String = js.native
  val Positive: Positive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.IconColor with java.lang.String] = js.native
}

