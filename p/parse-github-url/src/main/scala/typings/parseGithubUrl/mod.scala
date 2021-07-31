package typings.parseGithubUrl

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: String): Result | Null = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  
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
    
    @scala.inline
    def apply(branch: String, href: String): Result = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], auth = null, filepath = null, hash = null, host = null, hostname = null, name = null, owner = null, path = null, pathname = null, port = null, protocol = null, query = null, repo = null, repository = null, search = null, slashes = null)
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepathNull: Self = StObject.set(x, "filepath", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      @scala.inline
      def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepoNull: Self = StObject.set(x, "repo", null)
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNull: Self = StObject.set(x, "repository", null)
    }
  }
}
