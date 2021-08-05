package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.GitHtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetContentResponseData extends StObject {
  
  var _links: GitHtml
  
  var content: String
  
  var download_url: String
  
  var encoding: String
  
  var git_url: String
  
  var html_url: String
  
  var name: String
  
  var path: String
  
  var sha: String
  
  var size: Double
  
  var submodule_git_url: String
  
  var target: String
  
  var `type`: String
  
  var url: String
}
object ReposGetContentResponseData {
  
  inline def apply(
    _links: GitHtml,
    content: String,
    download_url: String,
    encoding: String,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    submodule_git_url: String,
    target: String,
    `type`: String,
    url: String
  ): ReposGetContentResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], submodule_git_url = submodule_git_url.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetContentResponseData]
  }
  
  extension [Self <: ReposGetContentResponseData](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSubmodule_git_url(value: String): Self = StObject.set(x, "submodule_git_url", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: GitHtml): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
