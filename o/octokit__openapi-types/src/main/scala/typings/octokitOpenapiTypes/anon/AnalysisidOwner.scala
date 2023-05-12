package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisidOwner extends StObject {
  
  /** @description The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation. */
  var analysis_id: Double
  
  var owner: String
  
  var repo: String
}
object AnalysisidOwner {
  
  inline def apply(analysis_id: Double, owner: String, repo: String): AnalysisidOwner = {
    val __obj = js.Dynamic.literal(analysis_id = analysis_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisidOwner] (val x: Self) extends AnyVal {
    
    inline def setAnalysis_id(value: Double): Self = StObject.set(x, "analysis_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
