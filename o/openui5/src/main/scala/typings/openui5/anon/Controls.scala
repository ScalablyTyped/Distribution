package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Controls extends StObject {
  
  /**
    * Names of control types that this library provides; names are in dot notation (e.g. "sap.ui.core.ComponentContainer")
    */
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of libraries that this library depends on; names are in dot notation (e.g. "sap.ui.core")
    */
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Names of element types that this library provides (excluding controls); names are in dot notation (e.g.
    * "sap.ui.core.Item")
    */
  var elements: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Potential extensions of the library metadata; structure not defined by the UI5 core framework.
    */
  var extensions: js.UndefOr[js.Object] = js.undefined
  
  /**
    * List of names of interface types that this library provides; names are in dot notation (e.g. "sap.ui.core.PopupInterface")
    */
  var interfaces: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name of the library; when given it must match the name by which the library has been loaded
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the library doesn't provide / use theming. When set to true, no library.css will be
    * loaded for this library
    */
  var noLibraryCSS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of names of types that this library provides; names are in dot notation (e.g. "sap.ui.core.CSSSize")
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Version of the library
    */
  var version: String
}
object Controls {
  
  inline def apply(version: String): Controls = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Controls] (val x: Self) extends AnyVal {
    
    inline def setControls(value: js.Array[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: String*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setExtensions(value: js.Object): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setInterfaces(value: js.Array[String]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    inline def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
    
    inline def setInterfacesVarargs(value: String*): Self = StObject.set(x, "interfaces", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoLibraryCSS(value: Boolean): Self = StObject.set(x, "noLibraryCSS", value.asInstanceOf[js.Any])
    
    inline def setNoLibraryCSSUndefined: Self = StObject.set(x, "noLibraryCSS", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
