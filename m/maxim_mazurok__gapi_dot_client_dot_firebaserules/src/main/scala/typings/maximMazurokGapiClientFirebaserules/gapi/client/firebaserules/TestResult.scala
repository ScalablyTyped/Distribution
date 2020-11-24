package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResult extends js.Object {
  
  /**
    * Debug messages related to test execution issues encountered during evaluation. Debug messages may be related to too many or too few invocations of function mocks or to runtime
    * errors that occur during evaluation. For example: ```Unable to read variable [name: "resource"]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error occurs. Evaluation of an expression may result in an error. Rules are deny by default, so a `DENY`
    * expectation when an error is generated is valid. When there is a `DENY` with an error, the `SourcePosition` is returned. E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[SourcePosition] = js.native
  
  /**
    * The mapping from expression in the ruleset AST to the values they were evaluated to. Partially-nested to mirror AST structure. Note that this field is actually tracking expressions
    * and not permission statements in contrast to the "visited_expressions" field above. Literal expressions are omitted.
    */
  var expressionReports: js.UndefOr[js.Array[ExpressionReport]] = js.native
  
  /**
    * The set of function calls made to service-defined methods. Function calls are included in the order in which they are encountered during evaluation, are provided for both mocked and
    * unmocked functions, and included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[FunctionCall]] = js.native
  
  /** State of the test. */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The set of visited permission expressions for a given test. This returns the positions and evaluation results of all visited permission expressions which were relevant to the test
    * case, e.g. ``` match /path { allow read if: } ``` For a detailed report of the intermediate evaluation states, see the `expression_reports` field
    */
  var visitedExpressions: js.UndefOr[js.Array[VisitedExpression]] = js.native
}
object TestResult {
  
  @scala.inline
  def apply(): TestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestResult]
  }
  
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebugMessagesVarargs(value: String*): Self = this.set("debugMessages", js.Array(value :_*))
    
    @scala.inline
    def setDebugMessages(value: js.Array[String]): Self = this.set("debugMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMessages: Self = this.set("debugMessages", js.undefined)
    
    @scala.inline
    def setErrorPosition(value: SourcePosition): Self = this.set("errorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorPosition: Self = this.set("errorPosition", js.undefined)
    
    @scala.inline
    def setExpressionReportsVarargs(value: ExpressionReport*): Self = this.set("expressionReports", js.Array(value :_*))
    
    @scala.inline
    def setExpressionReports(value: js.Array[ExpressionReport]): Self = this.set("expressionReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionReports: Self = this.set("expressionReports", js.undefined)
    
    @scala.inline
    def setFunctionCallsVarargs(value: FunctionCall*): Self = this.set("functionCalls", js.Array(value :_*))
    
    @scala.inline
    def setFunctionCalls(value: js.Array[FunctionCall]): Self = this.set("functionCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionCalls: Self = this.set("functionCalls", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setVisitedExpressionsVarargs(value: VisitedExpression*): Self = this.set("visitedExpressions", js.Array(value :_*))
    
    @scala.inline
    def setVisitedExpressions(value: js.Array[VisitedExpression]): Self = this.set("visitedExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitedExpressions: Self = this.set("visitedExpressions", js.undefined)
  }
}
