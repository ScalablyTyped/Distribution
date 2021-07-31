package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSuite extends StObject {
  
  /** Collection of test cases associated with the `TestSuite`. */
  var testCases: js.UndefOr[js.Array[TestCase]] = js.undefined
}
object TestSuite {
  
  @scala.inline
  def apply(): TestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuite]
  }
  
  @scala.inline
  implicit class TestSuiteMutableBuilder[Self <: TestSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestCases(value: js.Array[TestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = StObject.set(x, "testCases", js.Array(value :_*))
  }
}
