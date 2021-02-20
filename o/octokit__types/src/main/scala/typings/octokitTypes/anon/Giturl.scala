package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Giturl extends StObject {
  
  var git_url: String = js.native
  
  var html_url: String = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var repository: Blobsurl = js.native
  
  var score: Double = js.native
  
  var sha: String = js.native
  
  var url: String = js.native
}
object Giturl {
  
  @scala.inline
  def apply(
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    repository: Blobsurl,
    score: Double,
    sha: String,
    url: String
  ): Giturl = {
    val __obj = js.Dynamic.literal(git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Giturl]
  }
  
  @scala.inline
  implicit class GiturlMutableBuilder[Self <: Giturl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Blobsurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
