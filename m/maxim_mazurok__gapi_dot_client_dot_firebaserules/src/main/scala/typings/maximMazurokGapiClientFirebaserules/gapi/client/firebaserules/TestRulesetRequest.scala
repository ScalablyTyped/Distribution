package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRulesetRequest extends StObject {
  
  /** Optional `Source` to be checked for correctness. This field must not be set when the resource name refers to a `Ruleset`. */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The tests to execute against the `Source`. When `Source` is provided inline, the test cases will only be run if the `Source` is syntactically and semantically valid. Inline
    * `TestSuite` to run.
    */
  var testSuite: js.UndefOr[TestSuite] = js.undefined
}
object TestRulesetRequest {
  
  inline def apply(): TestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRulesetRequest]
  }
  
  extension [Self <: TestRulesetRequest](x: Self) {
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTestSuite(value: TestSuite): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteUndefined: Self = StObject.set(x, "testSuite", js.undefined)
  }
}
