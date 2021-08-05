package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadFiltersMimeTypes extends StObject {
  
  var extensions: String
  
  var title: String
}
object pluploadFiltersMimeTypes {
  
  inline def apply(extensions: String, title: String): pluploadFiltersMimeTypes = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadFiltersMimeTypes]
  }
  
  extension [Self <: pluploadFiltersMimeTypes](x: Self) {
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
