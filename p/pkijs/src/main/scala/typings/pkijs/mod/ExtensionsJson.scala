package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionsJson extends StObject {
  
  var extensions: js.Array[ExtensionJson]
}
object ExtensionsJson {
  
  inline def apply(extensions: js.Array[ExtensionJson]): ExtensionsJson = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionsJson]
  }
  
  extension [Self <: ExtensionsJson](x: Self) {
    
    inline def setExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "extensions", js.Array(value*))
  }
}
