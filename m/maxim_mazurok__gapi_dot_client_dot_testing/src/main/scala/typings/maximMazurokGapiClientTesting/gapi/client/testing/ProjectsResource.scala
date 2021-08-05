package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var testMatrices: TestMatricesResource
}
object ProjectsResource {
  
  inline def apply(testMatrices: TestMatricesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(testMatrices = testMatrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setTestMatrices(value: TestMatricesResource): Self = StObject.set(x, "testMatrices", value.asInstanceOf[js.Any])
  }
}
