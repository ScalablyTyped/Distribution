package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editable extends StObject {
  
  /**
    * @since 1.40 match all controls of a certain type It is usually combined with viewName or searchOpenDialogs.
    * If no control matches the type, an empty array will be returned. Examples:
    * ```javascript
    *
    *         // will return an array of all visible buttons
    *         new OpaPlugin().getMatchingControls({
    *             controlType: "sap.m.Button"
    *         });
    *
    *         // control type will also return controls that extend the control type
    *         // this will return an array of visible sap.m.List and sap.m.Table since both extend List base
    *         new OpaPlugin().getMatchingControls({
    *             controlType: "sap.m.ListBase"
    *         });
    *
    *         // control type is often combined with viewName - only controls that are inside of the view
    *         // and have the correct type will be returned
    *         // here all sap.m.Inputs inside of a view called 'my.View' will be returned
    *         new OpaPlugin().getMatchingControls({
    *             viewName: "my.View"
    *             controlType: "sap.m.Input"
    *         });
    * ```
    */
  var controlType: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * @since 1.80 should the control be editable.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.66 should the control be enabled. If interactable is true, enabled will also be true, unless
    * declared otherwise.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of one or multiple controls. This can be a global ID or an ID used together with viewName. See
    * the documentation of this parameter.
    */
  var id: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @since 1.34 should the control be interactable and enabled. When true, only interactable and enabled
    * controls will be matched. For details, see the {@link sap.ui.test.matchers.Interactable} matcher.
    */
  var interactable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only controls in the static UI area of UI5 are searched.
    */
  var searchOpenDialogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.62 Controls will only be searched inside this view (ie: the view (as a control) has to be an
    * ancestor of the control) If a control ID is given, the control will be found using the byId function
    * of the view.
    */
  var viewId: js.UndefOr[String] = js.undefined
  
  /**
    * Controls will only be searched inside this view (ie: the view (as a control) has to be an ancestor of
    * the control) If a control ID is given, the control will be found using the byId function of the view.
    */
  var viewName: js.UndefOr[String] = js.undefined
  
  /**
    * should the control have a visible DOM reference
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Editable {
  
  inline def apply(): Editable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Editable]
  }
  
  extension [Self <: Editable](x: Self) {
    
    inline def setControlType(value: String | js.Function): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String | js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setInteractable(value: Boolean): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setInteractableUndefined: Self = StObject.set(x, "interactable", js.undefined)
    
    inline def setSearchOpenDialogs(value: Boolean): Self = StObject.set(x, "searchOpenDialogs", value.asInstanceOf[js.Any])
    
    inline def setSearchOpenDialogsUndefined: Self = StObject.set(x, "searchOpenDialogs", js.undefined)
    
    inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
    
    inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
