package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import typings.openui5.sapUiCoreMvcViewTypeMod.ViewType
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewData extends StObject {
  
  /**
    * Whether the view source is loaded asynchronously. In asynchronous mode, the view is returned empty, and
    * the view content is loaded asynchronously.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The controller instance must be a valid controller implementation. The given controller instance overrides
    * the controller defined in the view definition.
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * Specifies an ID for the view instance. If no ID is given, an ID will be generated.
    */
  var id: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Holds a map from the specified preprocessor type (e.g. "xml") to an array of preprocessor configurations.
    * Each configuration consists of a `preprocessor` property (optional when registered as on-demand preprocessor)
    * and may contain further preprocessor-specific settings.
    */
  var preprocessors: js.UndefOr[Map[String, js.Array[js.Object]]] = js.undefined
  
  /**
    * Specifies what kind of view will be instantiated. All valid view types are listed in the enumeration
    * {@link sap.ui.core.mvc.ViewType}.
    */
  var `type`: js.UndefOr[ViewType] = js.undefined
  
  /**
    * Holds application specific data. This data is available during the whole lifecycle of the view and the
    * controller, for example in the constructor and in the {@link sap.ui.core.mvc.Controller.onInit onInit }
    * hook.
    */
  var viewData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Corresponds to an XML module that can be loaded via the module system (vView.viewName + suffix ".view.xml").
    */
  var viewName: js.UndefOr[js.Object] = js.undefined
}
object ViewData {
  
  inline def apply(): ViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewData] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setId(value: js.Object): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreprocessors(value: Map[String, js.Array[js.Object]]): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
    
    inline def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setViewData(value: js.Object): Self = StObject.set(x, "viewData", value.asInstanceOf[js.Any])
    
    inline def setViewDataUndefined: Self = StObject.set(x, "viewData", js.undefined)
    
    inline def setViewName(value: js.Object): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
