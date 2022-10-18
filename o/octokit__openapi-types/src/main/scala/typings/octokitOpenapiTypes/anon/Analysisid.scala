package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysisid extends StObject {
  
  /** The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation. */
  var analysis_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Analysisid {
  
  inline def apply(analysis_id: Double, owner: String, repo: String): Analysisid = {
    val __obj = js.Dynamic.literal(analysis_id = analysis_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysisid]
  }
  
  extension [Self <: Analysisid](x: Self) {
    
    inline def setAnalysis_id(value: Double): Self = StObject.set(x, "analysis_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
