package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var _links: Git
  
  var content: Any
  
  /** Format: uri */
  var download_url: String | Null
  
  var encoding: Any
  
  var entries: js.UndefOr[js.Array[Downloadurl]] = js.undefined
  
  /** Format: uri */
  var git_url: String | Null
  
  /** Format: uri */
  var html_url: String | Null
  
  var name: String
  
  var path: String
  
  var sha: String
  
  var size: Double
  
  var `type`: String
  
  /** Format: uri */
  var url: String
}
object Encoding {
  
  inline def apply(
    _links: Git,
    content: Any,
    encoding: Any,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): Encoding = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], download_url = null, git_url = null, html_url = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    inline def setDownload_urlNull: Self = StObject.set(x, "download_url", null)
    
    inline def setEncoding(value: Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[Downloadurl]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: Downloadurl*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setGit_urlNull: Self = StObject.set(x, "git_url", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Git): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
