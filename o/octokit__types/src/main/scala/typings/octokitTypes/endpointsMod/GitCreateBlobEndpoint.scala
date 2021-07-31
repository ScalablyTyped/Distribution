package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCreateBlobEndpoint extends StObject {
  
  /**
    * The new blob's content.
    */
  var content: String
  
  /**
    * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  var repo: String
}
object GitCreateBlobEndpoint {
  
  @scala.inline
  def apply(content: String, owner: String, repo: String): GitCreateBlobEndpoint = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateBlobEndpoint]
  }
  
  @scala.inline
  implicit class GitCreateBlobEndpointMutableBuilder[Self <: GitCreateBlobEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
