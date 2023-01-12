package typings.pdfmake.interfacesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDefinition extends StObject {
  
  /**
    * HTTP headers to include in the image request, if {@link url} is a remote URL.
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Image URL.
    *
    * Available options:
    * - Data URLs
    * - Remote URLs via http:// or https://
    *
    * Supported image formats: JPEG, PNG
    *
    * SVG images can only be used in the document content using the `svg` property.
    */
  var url: String
}
object ImageDefinition {
  
  inline def apply(url: String): ImageDefinition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDefinition] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
