package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Submodulegiturl extends StObject {
  
  var _links: Git
  
  var content: String
  
  /** Format: uri */
  var download_url: String | Null
  
  var encoding: String
  
  /** Format: uri */
  var git_url: String | Null
  
  /** Format: uri */
  var html_url: String | Null
  
  var name: String
  
  var path: String
  
  var sha: String
  
  var size: Double
  
  /** @example "git://example.com/defunkt/dotjs.git" */
  var submodule_git_url: js.UndefOr[String] = js.undefined
  
  /** @example "actual/actual.md" */
  var target: js.UndefOr[String] = js.undefined
  
  /** @enum {string} */
  var `type`: file
  
  /** Format: uri */
  var url: String
}
object Submodulegiturl {
  
  inline def apply(
    _links: Git,
    content: String,
    encoding: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    url: String
  ): Submodulegiturl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], download_url = null, git_url = null, html_url = null)
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[Submodulegiturl]
  }
  
  extension [Self <: Submodulegiturl](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    inline def setDownload_urlNull: Self = StObject.set(x, "download_url", null)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setGit_urlNull: Self = StObject.set(x, "git_url", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSubmodule_git_url(value: String): Self = StObject.set(x, "submodule_git_url", value.asInstanceOf[js.Any])
    
    inline def setSubmodule_git_urlUndefined: Self = StObject.set(x, "submodule_git_url", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Git): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
