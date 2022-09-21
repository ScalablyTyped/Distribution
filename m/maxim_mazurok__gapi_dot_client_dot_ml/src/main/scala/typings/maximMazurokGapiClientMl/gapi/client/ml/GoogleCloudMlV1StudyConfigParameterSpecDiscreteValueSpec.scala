package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec extends StObject {
  
  /**
    * Must be specified if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of
    * 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec {
  
  inline def apply(): GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec]
  }
  
  extension [Self <: GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec](x: Self) {
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
