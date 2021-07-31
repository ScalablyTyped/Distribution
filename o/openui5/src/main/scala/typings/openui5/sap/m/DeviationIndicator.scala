package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviationIndicator extends StObject
/**
  * Enum of the available deviation markers for the NumericContent control.
  */
@JSGlobal("sap.m.DeviationIndicator")
@js.native
object DeviationIndicator extends StObject {
  
  @js.native
  sealed trait Down
    extends StObject
       with DeviationIndicator
  
  @js.native
  sealed trait None
    extends StObject
       with DeviationIndicator
  
  @js.native
  sealed trait Up
    extends StObject
       with DeviationIndicator
}
