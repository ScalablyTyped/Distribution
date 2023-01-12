package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRankingInfo extends StObject {
  
  /** Required. Controls over how important the score of CustomRankingInfo.ranking_expression gets applied to job's final ranking position. An error is thrown if not specified. */
  var importanceLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Controls over how job documents get ranked on top of existing relevance score (determined by API algorithm). A combination of the ranking expression and relevance score is
    * used to determine job's final ranking position. The syntax for this expression is a subset of Google SQL syntax. Supported operators are: +, -, *, /, where the left and right side
    * of the operator is either a numeric Job.custom_attributes key, integer/double value or an expression that can be evaluated to a number. Parenthesis are supported to adjust
    * calculation precedence. The expression must be < 200 characters in length. The expression is considered invalid for a job if the expression references custom attributes that are not
    * populated on the job or if the expression results in a divide by zero. If an expression is invalid for a job, that job is demoted to the end of the results. Sample ranking
    * expression (year + 25) * 0.25 - (freshness / 0.5)
    */
  var rankingExpression: js.UndefOr[String] = js.undefined
}
object CustomRankingInfo {
  
  inline def apply(): CustomRankingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRankingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRankingInfo] (val x: Self) extends AnyVal {
    
    inline def setImportanceLevel(value: String): Self = StObject.set(x, "importanceLevel", value.asInstanceOf[js.Any])
    
    inline def setImportanceLevelUndefined: Self = StObject.set(x, "importanceLevel", js.undefined)
    
    inline def setRankingExpression(value: String): Self = StObject.set(x, "rankingExpression", value.asInstanceOf[js.Any])
    
    inline def setRankingExpressionUndefined: Self = StObject.set(x, "rankingExpression", js.undefined)
  }
}
