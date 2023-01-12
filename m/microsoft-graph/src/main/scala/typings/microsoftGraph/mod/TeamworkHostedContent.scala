package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkHostedContent
  extends StObject
     with Entity {
  
  // Write only. Bytes for the hosted content (such as images).
  var contentBytes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Write only. Content type. sicj as image/png, image/jpg.
  var contentType: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamworkHostedContent {
  
  inline def apply(): TeamworkHostedContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkHostedContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamworkHostedContent] (val x: Self) extends AnyVal {
    
    inline def setContentBytes(value: NullableOption[String]): Self = StObject.set(x, "contentBytes", value.asInstanceOf[js.Any])
    
    inline def setContentBytesNull: Self = StObject.set(x, "contentBytes", null)
    
    inline def setContentBytesUndefined: Self = StObject.set(x, "contentBytes", js.undefined)
    
    inline def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
  }
}
