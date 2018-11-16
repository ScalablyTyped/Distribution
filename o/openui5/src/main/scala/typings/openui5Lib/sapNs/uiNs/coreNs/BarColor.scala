package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarColor extends js.Object

/**
       * Configuration options for the colors of a progress bar
      */
@JSGlobal("sap.ui.core.BarColor")
@js.native
object BarColor extends js.Object {
  @js.native
  sealed trait CRITICAL
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  @js.native
  sealed trait NEGATIVE
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  @js.native
  sealed trait NEUTRAL
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  @js.native
  sealed trait POSITIVE
    extends openui5Lib.sapNs.uiNs.coreNs.BarColor
  
  val CRITICAL: CRITICAL with java.lang.String = js.native
  val NEGATIVE: NEGATIVE with java.lang.String = js.native
  val NEUTRAL: NEUTRAL with java.lang.String = js.native
  val POSITIVE: POSITIVE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.BarColor with java.lang.String] = js.native
}

