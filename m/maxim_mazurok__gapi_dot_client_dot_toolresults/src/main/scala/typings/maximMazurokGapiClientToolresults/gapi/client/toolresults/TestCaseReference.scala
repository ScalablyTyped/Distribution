package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseReference extends StObject {
  
  /** The name of the class. */
  var className: js.UndefOr[String] = js.undefined
  
  /** The name of the test case. Required. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The name of the test suite to which this test case belongs. */
  var testSuiteName: js.UndefOr[String] = js.undefined
}
object TestCaseReference {
  
  inline def apply(): TestCaseReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseReference]
  }
  
  extension [Self <: TestCaseReference](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestSuiteName(value: String): Self = StObject.set(x, "testSuiteName", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteNameUndefined: Self = StObject.set(x, "testSuiteName", js.undefined)
  }
}
