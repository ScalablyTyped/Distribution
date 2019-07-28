package typings.openui5.sapNs.mNs

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
  sealed trait Down extends DeviationIndicator
  
  @js.native
  sealed trait None extends DeviationIndicator
  
  @js.native
  sealed trait Up extends DeviationIndicator
  
  /* 0 */ val Down: typings.openui5.sapNs.mNs.DeviationIndicator.Down with Double = js.native
  /* 1 */ val None: typings.openui5.sapNs.mNs.DeviationIndicator.None with Double = js.native
  /* 2 */ val Up: typings.openui5.sapNs.mNs.DeviationIndicator.Up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviationIndicator with Double] = js.native
}

