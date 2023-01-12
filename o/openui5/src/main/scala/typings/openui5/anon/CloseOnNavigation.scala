package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOnNavigation extends StObject {
  
  /**
    * Either a single action, or an array of actions. If no action(s) are given, the single action MessageBox.Action.OK
    * is taken as a default for the parameter. Custom action(s) string or an array can be provided, and then
    * the translation of custom actions needs to be done by the application.
    */
  var actions: js.UndefOr[
    typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String) | (js.Array[
      typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String)
    ])
  ] = js.undefined
  
  /**
    * Added since version 1.72.0. Whether the MessageBox will be closed automatically when a routing navigation
    * occurs.
    */
  var closeOnNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The width of the MessageBox
    */
  var contentWidth: js.UndefOr[CSSSize] = js.undefined
  
  /**
    * Added since version 1.28.0. If 'details' is set, a link to view details is added. When the user clicks
    * the link, the text area containing 'details' information is displayed. The initial visibility is not
    * configurable and the details are hidden by default.
    *  If object is given, it will be serialized using `JSON.stringify`.
    *  Since version 1.103, a callback function can be used. It should return a promise, that resolves with
    * a `string` value or a JSON object, which will be stringified, or rejects - in this case a default error
    * message will be displayed.
    */
  var details: js.UndefOr[String | js.Object | (js.Function0[js.Promise[String | js.Object]])] = js.undefined
  
  /**
    * Added since version 1.75.0. Specifies which action of the created dialog will be emphasized. EmphasizedAction
    * will apply only if the property `actions` is provided.
    */
  var emphasizedAction: js.UndefOr[
    typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String)
  ] = js.undefined
  
  /**
    * horizontalScrolling is deprecated since version 1.30.4. HorizontalScrolling, this option indicates if
    * the user can scroll horizontally inside the MessageBox when the content is larger than the content area.
    */
  var horizontalScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon to be displayed.
    */
  var icon: js.UndefOr[typings.openui5.sapMMessageBoxMod.Icon] = js.undefined
  
  /**
    * ID to be used for the dialog. Intended for test scenarios, not recommended for productive apps
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Added since version 1.28.0. initialFocus, this option sets the action name, the text of the button or
    * the control that gets the focus as first focusable element after the MessageBox is opened. The usage
    * of sap.ui.core.Control to set initialFocus is deprecated since version 1.30.4.
    */
  var initialFocus: js.UndefOr[String | typings.openui5.sapMMessageBoxMod.Action] = js.undefined
  
  /**
    * Function to be called when the user taps a button or closes the message box.
    */
  var onClose: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Added since version 1.21.2. CSS style class which is added to the dialog's root DOM node. The compact
    * design can be activated by setting this to "sapUiSizeCompact"
    */
  var styleClass: js.UndefOr[String] = js.undefined
  
  /**
    * Added since version 1.28. Specifies the element's text directionality with enumerated options. By default,
    * the control inherits text direction from the DOM.
    */
  var textDirection: js.UndefOr[
    TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String)
  ] = js.undefined
  
  /**
    * The title of the message box.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * verticalScrolling is deprecated since version 1.30.4. VerticalScrolling, this option indicates if the
    * user can scroll vertically inside the MessageBox when the content is larger than the content area.
    */
  var verticalScrolling: js.UndefOr[Boolean] = js.undefined
}
object CloseOnNavigation {
  
  inline def apply(): CloseOnNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseOnNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseOnNavigation] (val x: Self) extends AnyVal {
    
    inline def setActions(
      value: typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String) | (js.Array[
          typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String)
        ])
    ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(
      value: (typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String))*
    ): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCloseOnNavigation(value: Boolean): Self = StObject.set(x, "closeOnNavigation", value.asInstanceOf[js.Any])
    
    inline def setCloseOnNavigationUndefined: Self = StObject.set(x, "closeOnNavigation", js.undefined)
    
    inline def setContentWidth(value: CSSSize): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    inline def setDetails(value: String | js.Object | (js.Function0[js.Promise[String | js.Object]])): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsFunction0(value: () => js.Promise[String | js.Object]): Self = StObject.set(x, "details", js.Any.fromFunction0(value))
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setEmphasizedAction(
      value: typings.openui5.sapMMessageBoxMod.Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String)
    ): Self = StObject.set(x, "emphasizedAction", value.asInstanceOf[js.Any])
    
    inline def setEmphasizedActionUndefined: Self = StObject.set(x, "emphasizedAction", js.undefined)
    
    inline def setHorizontalScrolling(value: Boolean): Self = StObject.set(x, "horizontalScrolling", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScrollingUndefined: Self = StObject.set(x, "horizontalScrolling", js.undefined)
    
    inline def setIcon(value: typings.openui5.sapMMessageBoxMod.Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialFocus(value: String | typings.openui5.sapMMessageBoxMod.Action): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
    
    inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
    
    inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setStyleClass(value: String): Self = StObject.set(x, "styleClass", value.asInstanceOf[js.Any])
    
    inline def setStyleClassUndefined: Self = StObject.set(x, "styleClass", js.undefined)
    
    inline def setTextDirection(
      value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String)
    ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVerticalScrolling(value: Boolean): Self = StObject.set(x, "verticalScrolling", value.asInstanceOf[js.Any])
    
    inline def setVerticalScrollingUndefined: Self = StObject.set(x, "verticalScrolling", js.undefined)
  }
}
