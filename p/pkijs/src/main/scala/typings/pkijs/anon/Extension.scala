package typings.pkijs.anon

import typings.pkijs.mod.ExtensionSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var `extension`: js.UndefOr[ExtensionSchema] = js.undefined
  
  var extensions: js.UndefOr[String] = js.undefined
}
object Extension {
  
  inline def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    inline def setExtension(value: ExtensionSchema): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
  }
}
