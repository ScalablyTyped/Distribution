package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IContentInfo> */
trait ContentInfoParameters extends StObject {
  
  var content: js.UndefOr[Any] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object ContentInfoParameters {
  
  inline def apply(): ContentInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
