package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Publishedat extends StObject {
  
  /** User */
  var author: Deleted | Null
  
  var created_at: String
  
  var draft: Boolean
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var prerelease: Boolean
  
  var published_at: String
  
  var tag_name: String
  
  var target_commitish: String
  
  /** Format: uri */
  var url: String
}
object Publishedat {
  
  inline def apply(
    created_at: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    name: String,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    target_commitish: String,
    url: String
  ): Publishedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null)
    __obj.asInstanceOf[Publishedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Publishedat] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Deleted): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
