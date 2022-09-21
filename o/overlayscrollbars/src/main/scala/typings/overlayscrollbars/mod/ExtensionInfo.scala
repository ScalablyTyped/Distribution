package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionInfo extends StObject {
  
  var defaultOptions: js.UndefOr[js.Object] = js.undefined
  
  def extensionFactory(defaultOptions: js.Object, compatibility: Compatibility, framework: Any): Extension
  
  var name: String
}
object ExtensionInfo {
  
  inline def apply(extensionFactory: (js.Object, Compatibility, Any) => Extension, name: String): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = js.Any.fromFunction3(extensionFactory), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  
  extension [Self <: ExtensionInfo](x: Self) {
    
    inline def setDefaultOptions(value: js.Object): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    inline def setExtensionFactory(value: (js.Object, Compatibility, Any) => Extension): Self = StObject.set(x, "extensionFactory", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
