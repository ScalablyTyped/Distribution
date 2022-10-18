package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var extensions: js.Array[String]
  
  var keepIndex: js.UndefOr[Boolean] = js.undefined
  
  var pagesDir: String
}
object Extensions {
  
  inline def apply(extensions: js.Array[String], pagesDir: String): Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], pagesDir = pagesDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setKeepIndex(value: Boolean): Self = StObject.set(x, "keepIndex", value.asInstanceOf[js.Any])
    
    inline def setKeepIndexUndefined: Self = StObject.set(x, "keepIndex", js.undefined)
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
  }
}
