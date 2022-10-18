package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: String
  
  var repo: IdName
  
  var sha: String
}
object Ref {
  
  inline def apply(ref: String, repo: IdName, sha: String): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: IdName): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
