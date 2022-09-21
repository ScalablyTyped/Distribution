package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.submodule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadurlGiturl extends StObject {
  
  var _links: Git
  
  /** Format: uri */
  var download_url: String | Null
  
  /** Format: uri */
  var git_url: String | Null
  
  /** Format: uri */
  var html_url: String | Null
  
  var name: String
  
  var path: String
  
  var sha: String
  
  var size: Double
  
  /** Format: uri */
  var submodule_git_url: String
  
  /** @enum {string} */
  var `type`: submodule
  
  /** Format: uri */
  var url: String
}
object DownloadurlGiturl {
  
  inline def apply(
    _links: Git,
    name: String,
    path: String,
    sha: String,
    size: Double,
    submodule_git_url: String,
    url: String
  ): DownloadurlGiturl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], submodule_git_url = submodule_git_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], download_url = null, git_url = null, html_url = null)
    __obj.updateDynamic("type")("submodule")
    __obj.asInstanceOf[DownloadurlGiturl]
  }
  
  extension [Self <: DownloadurlGiturl](x: Self) {
    
    inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    inline def setDownload_urlNull: Self = StObject.set(x, "download_url", null)
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setGit_urlNull: Self = StObject.set(x, "git_url", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSubmodule_git_url(value: String): Self = StObject.set(x, "submodule_git_url", value.asInstanceOf[js.Any])
    
    inline def setType(value: submodule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Git): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
