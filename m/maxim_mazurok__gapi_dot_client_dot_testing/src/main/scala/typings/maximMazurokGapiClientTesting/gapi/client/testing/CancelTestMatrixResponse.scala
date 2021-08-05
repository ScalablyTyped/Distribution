package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTestMatrixResponse extends StObject {
  
  /** The current rolled-up state of the test matrix. If this state is already final, then the cancelation request will have no effect. */
  var testState: js.UndefOr[String] = js.undefined
}
object CancelTestMatrixResponse {
  
  inline def apply(): CancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelTestMatrixResponse]
  }
  
  extension [Self <: CancelTestMatrixResponse](x: Self) {
    
    inline def setTestState(value: String): Self = StObject.set(x, "testState", value.asInstanceOf[js.Any])
    
    inline def setTestStateUndefined: Self = StObject.set(x, "testState", js.undefined)
  }
}
