package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Giturl extends StObject {
  
  var git_url: String
  
  var html_url: String
  
  var name: String
  
  var path: String
  
  var repository: Blobsurl
  
  var score: Double
  
  var sha: String
  
  var url: String
}
object Giturl {
  
  inline def apply(
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
  
  extension [Self <: Giturl](x: Self) {
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Blobsurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
