package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtensions extends StObject {
  
  /**
    * List of extensions
    */
  var extensions: js.Array[Extension]
}
object IExtensions {
  
  inline def apply(extensions: js.Array[Extension]): IExtensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensions]
  }
  
  extension [Self <: IExtensions](x: Self) {
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
  }
}
