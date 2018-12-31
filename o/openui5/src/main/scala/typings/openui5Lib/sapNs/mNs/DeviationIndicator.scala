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
  
  val Down: Down with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Up: Up with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.DeviationIndicator with java.lang.String] = js.native
}

