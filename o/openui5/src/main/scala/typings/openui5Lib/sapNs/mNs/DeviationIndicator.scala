package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviationIndicator extends js.Object

/**
  * Enum of the available deviation markers for the NumericContent control.
  */
@JSGlobal("sap.m.DeviationIndicator")
@js.native
object DeviationIndicator extends js.Object {
  @js.native
  sealed trait Down
    extends openui5Lib.sapNs.mNs.DeviationIndicator
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.mNs.DeviationIndicator
  
  @js.native
  sealed trait Up
    extends openui5Lib.sapNs.mNs.DeviationIndicator
  
  /* 0 */ val Down: Down with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 2 */ val Up: Up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.DeviationIndicator with scala.Double] = js.native
}

