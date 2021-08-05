package typings.parseGithubUrl

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): Result | Null = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  
  @JSImport("parse-github-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Result
    extends StObject
       with Url {
    
    var branch: String
    
    var filepath: String | Null
    
    var name: String | Null
    
    var owner: String | Null
    
    var repo: String | Null
    
    var repository: String | Null
  }
  object Result {
    
    inline def apply(branch: String, href: String): Result = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], auth = null, filepath = null, hash = null, host = null, hostname = null, name = null, owner = null, path = null, pathname = null, port = null, protocol = null, query = null, repo = null, repository = null, search = null, slashes = null)
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathNull: Self = StObject.set(x, "filepath", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setRepoNull: Self = StObject.set(x, "repo", null)
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    }
  }
}
