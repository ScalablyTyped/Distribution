package typings.openui5.anon

import typings.openui5.sapUiCoreMvcViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainingView extends StObject {
  
  /**
    * The view containing the Fragment content. If the Fragment content contains ExtensionPoints this parameter
    * must be given.
    */
  var containingView: js.UndefOr[default] = js.undefined
  
  /**
    * the Controller or Object which should be used by the controls in the Fragment. Note that some Fragments
    * may not need a Controller while others may need one and certain methods to be implemented by it.
    */
  var controller: js.UndefOr[typings.openui5.sapUiCoreMvcControllerMod.default | js.Object] = js.undefined
  
  /**
    * definition of the Fragment content. When this property is supplied, the "name" parameter must not be
    * used. If both are supplied, the definition has priority. Please see the above example on how to use the
    * 'definition' parameter.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * the ID of the Fragment
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * must be supplied if no "definition" parameter is given. The Fragment name must correspond to an XML Fragment
    * which can be loaded via the module system (fragmentName + suffix ".fragment.[typeextension]") and which
    * contains the Fragment definition. If "mOptions.controller" is supplied, the (event handler-) methods
    * referenced in the Fragment will be called on this Controller. Note that Fragments may require a Controller
    * to be given and certain methods to be implemented by it.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * the Fragment type, e.g. "XML", "JS", or "HTML" (see above). Default is "XML"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ContainingView {
  
  inline def apply(): ContainingView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainingView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainingView] (val x: Self) extends AnyVal {
    
    inline def setContainingView(value: default): Self = StObject.set(x, "containingView", value.asInstanceOf[js.Any])
    
    inline def setContainingViewUndefined: Self = StObject.set(x, "containingView", js.undefined)
    
    inline def setController(value: typings.openui5.sapUiCoreMvcControllerMod.default | js.Object): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
