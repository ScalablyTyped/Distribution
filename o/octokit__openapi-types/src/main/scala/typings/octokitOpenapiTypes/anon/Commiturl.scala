package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commiturl extends StObject {
  
  /** Format: uri */
  var commit_url: String
  
  var repository: Branchesurl
  
  var sha: String
  
  var state: String
  
  var statuses: js.Array[Required]
  
  var total_count: Double
  
  /** Format: uri */
  var url: String
}
object Commiturl {
  
  inline def apply(
    commit_url: String,
    repository: Branchesurl,
    sha: String,
    state: String,
    statuses: js.Array[Required],
    total_count: Double,
    url: String
  ): Commiturl = {
    val __obj = js.Dynamic.literal(commit_url = commit_url.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commiturl]
  }
  
  extension [Self <: Commiturl](x: Self) {
    
    inline def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatuses(value: js.Array[Required]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesVarargs(value: Required*): Self = StObject.set(x, "statuses", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
