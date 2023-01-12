package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryStep extends StObject {
  
  /** Step Id and outcome of each individual step. */
  var individualOutcome: js.UndefOr[js.Array[IndividualOutcome]] = js.undefined
  
  /** Rollup test status of multiple steps that were run with the same configuration as a group. */
  var rollUp: js.UndefOr[String] = js.undefined
}
object PrimaryStep {
  
  inline def apply(): PrimaryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrimaryStep] (val x: Self) extends AnyVal {
    
    inline def setIndividualOutcome(value: js.Array[IndividualOutcome]): Self = StObject.set(x, "individualOutcome", value.asInstanceOf[js.Any])
    
    inline def setIndividualOutcomeUndefined: Self = StObject.set(x, "individualOutcome", js.undefined)
    
    inline def setIndividualOutcomeVarargs(value: IndividualOutcome*): Self = StObject.set(x, "individualOutcome", js.Array(value*))
    
    inline def setRollUp(value: String): Self = StObject.set(x, "rollUp", value.asInstanceOf[js.Any])
    
    inline def setRollUpUndefined: Self = StObject.set(x, "rollUp", js.undefined)
  }
}
