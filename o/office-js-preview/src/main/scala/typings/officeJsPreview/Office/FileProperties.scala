package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileProperties extends StObject {
  
  /**
    * File's URL
    */
  var url: String
}
object FileProperties {
  
  inline def apply(url: String): FileProperties = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileProperties] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
