package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionInfo extends StObject {
  
  var defaultOptions: js.UndefOr[js.Object] = js.undefined
  
  def extensionFactory(defaultOptions: js.Object, compatibility: Compatibility, framework: js.Any): Extension
  
  var name: String
}
object ExtensionInfo {
  
  @scala.inline
  def apply(extensionFactory: (js.Object, Compatibility, js.Any) => Extension, name: String): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = js.Any.fromFunction3(extensionFactory), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  
  @scala.inline
  implicit class ExtensionInfoMutableBuilder[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultOptions(value: js.Object): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    @scala.inline
    def setExtensionFactory(value: (js.Object, Compatibility, js.Any) => Extension): Self = StObject.set(x, "extensionFactory", js.Any.fromFunction3(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
