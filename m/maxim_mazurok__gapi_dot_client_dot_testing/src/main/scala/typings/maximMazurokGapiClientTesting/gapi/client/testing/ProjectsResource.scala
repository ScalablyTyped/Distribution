package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var testMatrices: TestMatricesResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(testMatrices: TestMatricesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(testMatrices = testMatrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestMatrices(value: TestMatricesResource): Self = StObject.set(x, "testMatrices", value.asInstanceOf[js.Any])
  }
}
