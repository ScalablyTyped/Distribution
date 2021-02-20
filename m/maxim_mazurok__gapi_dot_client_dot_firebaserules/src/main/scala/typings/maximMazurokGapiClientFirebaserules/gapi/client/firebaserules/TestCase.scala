package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCase extends StObject {
  
  /** Test expectation. */
  var expectation: js.UndefOr[String] = js.native
  
  /** Specifies what should be included in the response. */
  var expressionReportLevel: js.UndefOr[String] = js.native
  
  /** Optional function mocks for service-defined functions. If not set, any service defined function is expected to return an error, which may or may not influence the test outcome. */
  var functionMocks: js.UndefOr[js.Array[FunctionMock]] = js.native
  
  /** Specifies whether paths (such as request.path) are encoded and how. */
  var pathEncoding: js.UndefOr[String] = js.native
  
  /**
    * Request context. The exact format of the request context is service-dependent. See the appropriate service documentation for information about the supported fields and types on the
    * request. Minimally, all services support the following fields and types: Request field | Type ---------------|----------------- auth.uid | `string` auth.token | `map` headers |
    * `map` method | `string` params | `map` path | `string` time | `google.protobuf.Timestamp` If the request value is not well-formed for the service, the request will be rejected as an
    * invalid argument.
    */
  var request: js.UndefOr[js.Any] = js.native
  
  /** Optional resource value as it appears in persistent storage before the request is fulfilled. The resource type depends on the `request.path` value. */
  var resource: js.UndefOr[js.Any] = js.native
}
object TestCase {
  
  @scala.inline
  def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  
  @scala.inline
  implicit class TestCaseMutableBuilder[Self <: TestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectation(value: String): Self = StObject.set(x, "expectation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectationUndefined: Self = StObject.set(x, "expectation", js.undefined)
    
    @scala.inline
    def setExpressionReportLevel(value: String): Self = StObject.set(x, "expressionReportLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionReportLevelUndefined: Self = StObject.set(x, "expressionReportLevel", js.undefined)
    
    @scala.inline
    def setFunctionMocks(value: js.Array[FunctionMock]): Self = StObject.set(x, "functionMocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionMocksUndefined: Self = StObject.set(x, "functionMocks", js.undefined)
    
    @scala.inline
    def setFunctionMocksVarargs(value: FunctionMock*): Self = StObject.set(x, "functionMocks", js.Array(value :_*))
    
    @scala.inline
    def setPathEncoding(value: String): Self = StObject.set(x, "pathEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathEncodingUndefined: Self = StObject.set(x, "pathEncoding", js.undefined)
    
    @scala.inline
    def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResource(value: js.Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
