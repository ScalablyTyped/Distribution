package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesDefaultImagesMod {
  
  trait exports extends StObject {
    
    var cssClass: String
    
    var fileKey: Double
  }
  object exports {
    
    inline def apply(cssClass: String, fileKey: Double): exports = {
      val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[exports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: exports] (val x: Self) extends AnyVal {
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setFileKey(value: Double): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    }
  }
}
