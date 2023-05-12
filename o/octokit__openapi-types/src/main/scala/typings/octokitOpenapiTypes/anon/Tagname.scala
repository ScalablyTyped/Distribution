package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tagname extends StObject {
  
  var author: js.UndefOr[Gravatarid] = js.undefined
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var html_url: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var prerelease: js.UndefOr[Boolean] = js.undefined
  
  var published_at: js.UndefOr[String] = js.undefined
  
  var tag_name: js.UndefOr[String] = js.undefined
  
  var target_commitish: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Tagname {
  
  inline def apply(): Tagname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tagname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tagname] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Gravatarid): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_atUndefined: Self = StObject.set(x, "published_at", js.undefined)
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitishUndefined: Self = StObject.set(x, "target_commitish", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
