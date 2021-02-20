package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSuiteOverview extends StObject {
  
  /** Elapsed time of test suite. */
  var elapsedTime: js.UndefOr[Duration] = js.native
  
  /** Number of test cases in error, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never */
  var errorCount: js.UndefOr[Double] = js.native
  
  /** Number of failed test cases, typically set by the service by parsing the xml_source. May also be set by the user. - In create/response: always set - In update request: never */
  var failureCount: js.UndefOr[Double] = js.native
  
  /**
    * Number of flaky test cases, set by the service by rolling up flaky test attempts. Present only for rollup test suite overview at environment level. A step cannot have flaky test
    * cases.
    */
  var flakyCount: js.UndefOr[Double] = js.native
  
  /** The name of the test suite. - In create/response: always set - In update request: never */
  var name: js.UndefOr[String] = js.native
  
  /** Number of test cases not run, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never */
  var skippedCount: js.UndefOr[Double] = js.native
  
  /** Number of test cases, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never */
  var totalCount: js.UndefOr[Double] = js.native
  
  /**
    * If this test suite was parsed from XML, this is the URI where the original XML file is stored. Note: Multiple test suites can share the same xml_source Returns INVALID_ARGUMENT if
    * the uri format is not supported. - In create/response: optional - In update request: never
    */
  var xmlSource: js.UndefOr[FileReference] = js.native
}
object TestSuiteOverview {
  
  @scala.inline
  def apply(): TestSuiteOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuiteOverview]
  }
  
  @scala.inline
  implicit class TestSuiteOverviewMutableBuilder[Self <: TestSuiteOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTime(value: Duration): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    @scala.inline
    def setFlakyCount(value: Double): Self = StObject.set(x, "flakyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlakyCountUndefined: Self = StObject.set(x, "flakyCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSkippedCount(value: Double): Self = StObject.set(x, "skippedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedCountUndefined: Self = StObject.set(x, "skippedCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    @scala.inline
    def setXmlSource(value: FileReference): Self = StObject.set(x, "xmlSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlSourceUndefined: Self = StObject.set(x, "xmlSource", js.undefined)
  }
}
