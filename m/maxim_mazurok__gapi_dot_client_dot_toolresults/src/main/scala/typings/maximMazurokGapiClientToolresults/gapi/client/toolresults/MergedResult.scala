package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergedResult extends StObject {
  
  /** Outcome of the resource */
  var outcome: js.UndefOr[Outcome] = js.undefined
  
  /** State of the resource */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The combined and rolled-up result of each test suite that was run as part of this environment. Combining: When the test cases from a suite are run in different steps (sharding), the
    * results are added back together in one overview. (e.g., if shard1 has 2 failures and shard2 has 1 failure than the overview failure_count = 3). Rollup: When test cases from the same
    * suite are run multiple times (flaky), the results are combined (e.g., if testcase1.run1 fails, testcase1.run2 passes, and both testcase2.run1 and testcase2.run2 fail then the
    * overview flaky_count = 1 and failure_count = 1).
    */
  var testSuiteOverviews: js.UndefOr[js.Array[TestSuiteOverview]] = js.undefined
}
object MergedResult {
  
  inline def apply(): MergedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergedResult]
  }
  
  extension [Self <: MergedResult](x: Self) {
    
    inline def setOutcome(value: Outcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTestSuiteOverviews(value: js.Array[TestSuiteOverview]): Self = StObject.set(x, "testSuiteOverviews", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteOverviewsUndefined: Self = StObject.set(x, "testSuiteOverviews", js.undefined)
    
    inline def setTestSuiteOverviewsVarargs(value: TestSuiteOverview*): Self = StObject.set(x, "testSuiteOverviews", js.Array(value :_*))
  }
}
