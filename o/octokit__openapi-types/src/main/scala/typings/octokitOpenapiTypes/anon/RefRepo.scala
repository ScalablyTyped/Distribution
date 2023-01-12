package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefRepo extends StObject {
  
  var ref: String
  
  var repo: IdNameUrl
  
  var sha: String
}
object RefRepo {
  
  inline def apply(ref: String, repo: IdNameUrl, sha: String): RefRepo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefRepo] (val x: Self) extends AnyVal {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: IdNameUrl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
