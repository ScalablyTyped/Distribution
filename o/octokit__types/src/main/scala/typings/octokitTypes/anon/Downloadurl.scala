package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Downloadurl extends StObject {
  
  var _links: Git
  
  var download_url: String
  
  var git_url: String
  
  var html_url: String
  
  var name: String
  
  var path: String
  
  var sha: String
  
  var size: Double
  
  var `type`: String
  
  var url: String
}
object Downloadurl {
  
  @scala.inline
  def apply(
    _links: Git,
    download_url: String,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): Downloadurl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadurl]
  }
  
  @scala.inline
  implicit class DownloadurlMutableBuilder[Self <: Downloadurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
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
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: Git): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
