package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefRepoSha extends StObject {
  
  var ref: String
  
  /** Repo Ref */
  var repo: IdName
  
  var sha: String
}
object RefRepoSha {
  
  inline def apply(ref: String, repo: IdName, sha: String): RefRepoSha = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefRepoSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefRepoSha] (val x: Self) extends AnyVal {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: IdName): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
