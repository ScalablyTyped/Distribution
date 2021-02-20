package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.GitHtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetContentResponseData extends StObject {
  
  var _links: GitHtml = js.native
  
  var content: String = js.native
  
  var download_url: String = js.native
  
  var encoding: String = js.native
  
  var git_url: String = js.native
  
  var html_url: String = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var sha: String = js.native
  
  var size: Double = js.native
  
  var submodule_git_url: String = js.native
  
  var target: String = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object ReposGetContentResponseData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ReposGetContentResponseDataMutableBuilder[Self <: ReposGetContentResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmodule_git_url(value: String): Self = StObject.set(x, "submodule_git_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: GitHtml): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
