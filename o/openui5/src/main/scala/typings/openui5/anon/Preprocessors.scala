package typings.openui5.anon

import typings.openui5.sapUiCoreMvcControllerMod.default
import typings.openui5.sapUiCoreMvcViewTypeMod.ViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preprocessors extends StObject {
  
  /**
    * Controller instance to be used for this view. The given controller instance overrides the controller
    * defined in the view definition. Sharing a controller instance between multiple views is not supported.
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * The view definition. Only supported for XML and HTML views. See also {@link sap.ui.core.mvc.XMLView.create}
    * and {@link sap.ui.core.mvc.HTMLView.create} (deprecated) for more information.
    */
  var definition: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies an ID for the View instance. If no ID is given, one will be generated
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Can hold a map from the specified preprocessor type (e.g. "xml") to an array of preprocessor configurations;
    * each configuration consists of a `preprocessor` property (optional when registered as on-demand preprocessor)
    * and may contain further preprocessor-specific settings. The preprocessor can be either a module name
    * as string implementation of {@link sap.ui.core.mvc.View.Preprocessor} or a function according to {@link
    * sap.ui.core.mvc.View.Preprocessor.process}. Do not set properties starting with underscore like `_sProperty`
    * property, these are reserved for internal purposes. When several preprocessors are provided for one hook,
    * it has to be made sure that they do not conflict when being processed serially.
    *
    * **Note**: These preprocessors are only available to this instance. For global or on-demand availability
    * use {@link sap.ui.core.mvc.XMLView.registerPreprocessor}. **Note**: Please note that preprocessors in
    * general are currently only available to XMLViews
    */
  var preprocessors: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Specifies what kind of view will be instantiated. All valid view types are listed in the enumeration
    * {@link sap.ui.core.mvc.ViewType}.
    */
  var `type`: js.UndefOr[
    ViewType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewType * / any */ String)
  ] = js.undefined
  
  /**
    * A general purpose data bag, which is under full control of the caller. It can be retrieved with the {@link
    * sap.ui.core.mvc.View#getViewData} method during the whole lifecycle of the view and controller. In contrast
    * to data propagated from the parent control (e.g. models, binding contexts), `viewData` can already be
    * accessed at construction time, e.g. in the `onInit` hook of the controller. Propagated data can only
    * be accessed after the view has been added to the control hierarchy.
    */
  var viewData: js.UndefOr[Any] = js.undefined
  
  /**
    * Name of the view resource in module name notation (dot-separated, without suffix); either `viewName`
    * or `definition` must be given. A `viewName` can be given in the form `module:my/views/Main` to load a
    * typed view.
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object Preprocessors {
  
  inline def apply(): Preprocessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preprocessors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Preprocessors] (val x: Self) extends AnyVal {
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDefinition(value: Any): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreprocessors(value: js.Object): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
    
    inline def setType(
      value: ViewType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setViewData(value: Any): Self = StObject.set(x, "viewData", value.asInstanceOf[js.Any])
    
    inline def setViewDataUndefined: Self = StObject.set(x, "viewData", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
