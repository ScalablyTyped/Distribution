package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.DeviationIndicator.Down
import typings.openui5.sap.m.DeviationIndicator.None
import typings.openui5.sap.m.DeviationIndicator.Up
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviationIndicator with Double] = js.native
  /* 0 */ @js.native
  object Down extends TopLevel[Down with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

