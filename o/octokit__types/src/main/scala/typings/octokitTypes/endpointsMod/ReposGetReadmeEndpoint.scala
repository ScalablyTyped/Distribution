package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetReadmeEndpoint extends StObject {
  
  var owner: String
  
  /**
    * The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`)
    */
  var ref: js.UndefOr[String] = js.undefined
  
  var repo: String
}
object ReposGetReadmeEndpoint {
  
  inline def apply(owner: String, repo: String): ReposGetReadmeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetReadmeEndpoint]
  }
  
  extension [Self <: ReposGetReadmeEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
