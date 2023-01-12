package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlightedcontent extends StObject {
  
  var content: String
  
  var encoding: String
  
  var highlighted_content: js.UndefOr[String] = js.undefined
  
  var node_id: String
  
  var sha: String
  
  var size: Double | Null
  
  /** Format: uri */
  var url: String
}
object Highlightedcontent {
  
  inline def apply(content: String, encoding: String, node_id: String, sha: String, url: String): Highlightedcontent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], size = null)
    __obj.asInstanceOf[Highlightedcontent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Highlightedcontent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setHighlighted_content(value: String): Self = StObject.set(x, "highlighted_content", value.asInstanceOf[js.Any])
    
    inline def setHighlighted_contentUndefined: Self = StObject.set(x, "highlighted_content", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
