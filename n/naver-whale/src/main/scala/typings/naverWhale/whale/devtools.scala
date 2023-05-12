package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtools {
  
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  object inspectedWindow {
    
    trait EvalOptions extends StObject {
      
      /** Evaluate the expression in the context of a content script of an extension that matches the specified origin. If given, contextSecurityOrigin overrides the 'true' setting on userContentScriptContext. */
      var contextSecurityOrigin: js.UndefOr[String] = js.undefined
      
      /** If specified, the expression is evaluated on the iframe whose URL matches the one specified. By default, the expression is evaluated in the top frame of the inspected page. */
      var frameURL: js.UndefOr[String] = js.undefined
      
      /** Evaluate the expression in the context of the content script of the calling extension, provided that the content script is already injected into the inspected page. If not, the expression is not evaluated and the callback is invoked with the exception parameter set to an object that has the isError field set to true and the code field set to E_NOTFOUND. */
      var useContentScriptContext: js.UndefOr[Boolean] = js.undefined
    }
    object EvalOptions {
      
      inline def apply(): EvalOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EvalOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EvalOptions] (val x: Self) extends AnyVal {
        
        inline def setContextSecurityOrigin(value: String): Self = StObject.set(x, "contextSecurityOrigin", value.asInstanceOf[js.Any])
        
        inline def setContextSecurityOriginUndefined: Self = StObject.set(x, "contextSecurityOrigin", js.undefined)
        
        inline def setFrameURL(value: String): Self = StObject.set(x, "frameURL", value.asInstanceOf[js.Any])
        
        inline def setFrameURLUndefined: Self = StObject.set(x, "frameURL", js.undefined)
        
        inline def setUseContentScriptContext(value: Boolean): Self = StObject.set(x, "useContentScriptContext", value.asInstanceOf[js.Any])
        
        inline def setUseContentScriptContextUndefined: Self = StObject.set(x, "useContentScriptContext", js.undefined)
      }
    }
    
    trait EvaluationExceptionInfo extends StObject {
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated. */
      var code: String
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated. */
      var description: String
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated, contains the array of the values that may be substituted into the description string to provide more information about the cause of the error. */
      var details: js.Array[Any]
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated. */
      var isError: Boolean
      
      /** Set if the evaluated code produces an unhandled exception. */
      var isException: Boolean
      
      /** Set if the evaluated code produces an unhandled exception. */
      var value: String
    }
    object EvaluationExceptionInfo {
      
      inline def apply(
        code: String,
        description: String,
        details: js.Array[Any],
        isError: Boolean,
        isException: Boolean,
        value: String
      ): EvaluationExceptionInfo = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isException = isException.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[EvaluationExceptionInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EvaluationExceptionInfo] (val x: Self) extends AnyVal {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: js.Array[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsVarargs(value: Any*): Self = StObject.set(x, "details", js.Array(value*))
        
        inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
        
        inline def setIsException(value: Boolean): Self = StObject.set(x, "isException", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait ReloadOptions extends StObject {
      
      /** Optional. When true, the loader will ignore the cache for all inspected page resources loaded before the load event is fired. The effect is similar to pressing Ctrl+Shift+R in the inspected window or within the Developer Tools window.  */
      var ignoreCache: js.UndefOr[Boolean] = js.undefined
      
      /** Optional. If specified, the script will be injected into every frame of the inspected page immediately upon load, before any of the frame's scripts. The script will not be injected after subsequent reloads—for example, if the user presses Ctrl+R.  */
      var injectedScript: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        * If specified, this script evaluates into a function that accepts three string arguments: the source to preprocess, the URL of the source, and a function name if the source is an DOM event handler. The preprocessorerScript function should return a string to be compiled by Chrome in place of the input source. In the case that the source is a DOM event handler, the returned source must compile to a single JS function.
        * @deprecated Deprecated since Chrome 41. Please avoid using this parameter, it will be removed soon.
        */
      var preprocessorScript: js.UndefOr[String] = js.undefined
      
      /** Optional. If specified, the string will override the value of the User-Agent HTTP header that's sent while loading the resources of the inspected page. The string will also override the value of the navigator.userAgent property that's returned to any scripts that are running within the inspected page.  */
      var userAgent: js.UndefOr[String] = js.undefined
    }
    object ReloadOptions {
      
      inline def apply(): ReloadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReloadOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ReloadOptions] (val x: Self) extends AnyVal {
        
        inline def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
        
        inline def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
        
        inline def setInjectedScript(value: String): Self = StObject.set(x, "injectedScript", value.asInstanceOf[js.Any])
        
        inline def setInjectedScriptUndefined: Self = StObject.set(x, "injectedScript", js.undefined)
        
        inline def setPreprocessorScript(value: String): Self = StObject.set(x, "preprocessorScript", value.asInstanceOf[js.Any])
        
        inline def setPreprocessorScriptUndefined: Self = StObject.set(x, "preprocessorScript", js.undefined)
        
        inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      }
    }
    
    @js.native
    trait Resource extends StObject {
      
      /**
        * Gets the content of the resource.
        * @param callback A function that receives resource content when the request completes.
        */
      def getContent(callback: js.Function2[/* content */ String, /* encoding */ String, Unit]): Unit = js.native
      
      /**
        * Sets the content of the resource.
        * @param content New content of the resource. Only resources with the text type are currently supported.
        * @param commit True if the user has finished editing the resource, and the new content of the resource should be persisted; false if this is a minor change sent in progress of the user editing the resource.
        * @param callback A function called upon request completion.
        */
      def setContent(content: String, commit: Boolean): Unit = js.native
      def setContent(content: String, commit: Boolean, callback: js.Function1[/* error */ js.UndefOr[js.Object], Unit]): Unit = js.native
      
      /** The URL of the resource. */
      var url: String = js.native
    }
    
    type ResourceAddedEvent = Event[
        js.Function1[/* resource */ typings.chrome.chrome.devtools.inspectedWindow.Resource, Unit]
      ]
    
    type ResourceContentCommittedEvent = Event[
        js.Function2[
          /* resource */ typings.chrome.chrome.devtools.inspectedWindow.Resource, 
          /* content */ String, 
          Unit
        ]
      ]
  }
  
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  object network {
    
    type HAREntry = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatEntry */ Any
    
    type HARLog = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatLog */ Any
    
    type NavigatedEvent = Event[js.Function1[/* url */ String, Unit]]
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatEntry * / any */ trait Request extends StObject {
      
      /**
        * Returns content of the response body.
        * @param callback A function that receives the response body when the request completes.
        */
      def getContent(callback: js.Function2[/* content */ String, /* encoding */ String, Unit]): Unit
    }
    object Request {
      
      inline def apply(getContent: js.Function2[/* content */ String, /* encoding */ String, Unit] => Unit): Request = {
        val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction1(getContent))
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        inline def setGetContent(value: js.Function2[/* content */ String, /* encoding */ String, Unit] => Unit): Self = StObject.set(x, "getContent", js.Any.fromFunction1(value))
      }
    }
    
    type RequestFinishedEvent = Event[js.Function1[/* request */ typings.chrome.chrome.devtools.network.Request, Unit]]
  }
  
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  object panels {
    
    @js.native
    trait Button extends StObject {
      
      /** Fired when the button is clicked. */
      var onClicked: typings.chrome.chrome.devtools.panels.ButtonClickedEvent = js.native
      
      /**
        * Updates the attributes of the button. If some of the arguments are omitted or null, the corresponding attributes are not updated.
        * @param iconPath Path to the new icon of the button.
        * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
        * @param disabled Whether the button is disabled.
        */
      def update(): Unit = js.native
      def update(iconPath: String): Unit = js.native
      def update(iconPath: String, tooltipText: String): Unit = js.native
      def update(iconPath: String, tooltipText: String, disabled: Boolean): Unit = js.native
      def update(iconPath: String, tooltipText: Null, disabled: Boolean): Unit = js.native
      def update(iconPath: String, tooltipText: Unit, disabled: Boolean): Unit = js.native
      def update(iconPath: Null, tooltipText: String): Unit = js.native
      def update(iconPath: Null, tooltipText: String, disabled: Boolean): Unit = js.native
      def update(iconPath: Null, tooltipText: Null, disabled: Boolean): Unit = js.native
      def update(iconPath: Null, tooltipText: Unit, disabled: Boolean): Unit = js.native
      def update(iconPath: Unit, tooltipText: String): Unit = js.native
      def update(iconPath: Unit, tooltipText: String, disabled: Boolean): Unit = js.native
      def update(iconPath: Unit, tooltipText: Null, disabled: Boolean): Unit = js.native
      def update(iconPath: Unit, tooltipText: Unit, disabled: Boolean): Unit = js.native
    }
    
    type ButtonClickedEvent = Event[js.Function0[Unit]]
    
    @js.native
    trait ElementsPanel extends StObject {
      
      /**
        * Creates a pane within panel's sidebar.
        * @param title Text that is displayed in sidebar caption.
        * @param callback A callback invoked when the sidebar is created.
        */
      def createSidebarPane(title: String): Unit = js.native
      def createSidebarPane(
        title: String,
        callback: js.Function1[/* result */ typings.chrome.chrome.devtools.panels.ExtensionSidebarPane, Unit]
      ): Unit = js.native
      
      /** Fired when an object is selected in the panel. */
      var onSelectionChanged: typings.chrome.chrome.devtools.panels.SelectionChangedEvent = js.native
    }
    
    trait ExtensionPanel extends StObject {
      
      /**
        * Appends a button to the status bar of the panel.
        * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
        * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
        * @param disabled Whether the button is disabled.
        */
      def createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): typings.chrome.chrome.devtools.panels.Button
      
      /** Fired when the user switches away from the panel. */
      var onHidden: typings.chrome.chrome.devtools.panels.PanelHiddenEvent
      
      /** Fired upon a search action (start of a new search, search result navigation, or search being canceled). */
      var onSearch: typings.chrome.chrome.devtools.panels.PanelSearchEvent
      
      /** Fired when the user switches to the panel. */
      var onShown: typings.chrome.chrome.devtools.panels.PanelShownEvent
    }
    object ExtensionPanel {
      
      inline def apply(
        createStatusBarButton: (String, String, Boolean) => typings.chrome.chrome.devtools.panels.Button,
        onHidden: typings.chrome.chrome.devtools.panels.PanelHiddenEvent,
        onSearch: typings.chrome.chrome.devtools.panels.PanelSearchEvent,
        onShown: typings.chrome.chrome.devtools.panels.PanelShownEvent
      ): ExtensionPanel = {
        val __obj = js.Dynamic.literal(createStatusBarButton = js.Any.fromFunction3(createStatusBarButton), onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtensionPanel]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ExtensionPanel] (val x: Self) extends AnyVal {
        
        inline def setCreateStatusBarButton(value: (String, String, Boolean) => typings.chrome.chrome.devtools.panels.Button): Self = StObject.set(x, "createStatusBarButton", js.Any.fromFunction3(value))
        
        inline def setOnHidden(value: typings.chrome.chrome.devtools.panels.PanelHiddenEvent): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
        
        inline def setOnSearch(value: typings.chrome.chrome.devtools.panels.PanelSearchEvent): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
        
        inline def setOnShown(value: typings.chrome.chrome.devtools.panels.PanelShownEvent): Self = StObject.set(x, "onShown", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ExtensionSidebarPane extends StObject {
      
      /** Fired when the sidebar pane becomes hidden as a result of the user switching away from the panel that hosts the sidebar pane. */
      var onHidden: typings.chrome.chrome.devtools.panels.ExtensionSidebarPaneHiddenEvent = js.native
      
      /** Fired when the sidebar pane becomes visible as a result of user switching to the panel that hosts it. */
      var onShown: typings.chrome.chrome.devtools.panels.ExtensionSidebarPaneShownEvent = js.native
      
      /**
        * Sets an expression that is evaluated within the inspected page. The result is displayed in the sidebar pane.
        * @param expression An expression to be evaluated in context of the inspected page. JavaScript objects and DOM nodes are displayed in an expandable tree similar to the console/watch.
        * @param rootTitle An optional title for the root of the expression tree.
        * @param callback A callback invoked after the sidebar pane is updated with the expression evaluation results.
        */
      def setExpression(expression: String): Unit = js.native
      def setExpression(expression: String, callback: js.Function0[Unit]): Unit = js.native
      def setExpression(expression: String, rootTitle: String): Unit = js.native
      def setExpression(expression: String, rootTitle: String, callback: js.Function0[Unit]): Unit = js.native
      def setExpression(expression: String, rootTitle: Unit, callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * Sets the height of the sidebar.
        * @param height A CSS-like size specification, such as '100px' or '12ex'.
        */
      def setHeight(height: String): Unit = js.native
      
      /**
        * Sets a JSON-compliant object to be displayed in the sidebar pane.
        * @param jsonObject An object to be displayed in context of the inspected page. Evaluated in the context of the caller (API client).
        * @param rootTitle An optional title for the root of the expression tree.
        * @param callback A callback invoked after the sidebar is updated with the object.
        */
      def setObject(jsonObject: js.Object): Unit = js.native
      def setObject(jsonObject: js.Object, callback: js.Function0[Unit]): Unit = js.native
      def setObject(jsonObject: js.Object, rootTitle: String): Unit = js.native
      def setObject(jsonObject: js.Object, rootTitle: String, callback: js.Function0[Unit]): Unit = js.native
      def setObject(jsonObject: js.Object, rootTitle: Unit, callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * Sets an HTML page to be displayed in the sidebar pane.
        * @param path Relative path of an extension page to display within the sidebar.
        */
      def setPage(path: String): Unit = js.native
    }
    
    type ExtensionSidebarPaneHiddenEvent = Event[js.Function0[Unit]]
    
    type ExtensionSidebarPaneShownEvent = Event[js.Function1[/* window */ Window, Unit]]
    
    type PanelHiddenEvent = Event[js.Function0[Unit]]
    
    type PanelSearchEvent = Event[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]]
    
    type PanelShownEvent = Event[js.Function1[/* window */ typings.chrome.Window, Unit]]
    
    type SelectionChangedEvent = Event[js.Function0[Unit]]
    
    @js.native
    trait SourcesPanel extends StObject {
      
      /**
        * Creates a pane within panel's sidebar.
        * @param title Text that is displayed in sidebar caption.
        * @param callback A callback invoked when the sidebar is created.
        */
      def createSidebarPane(title: String): Unit = js.native
      def createSidebarPane(
        title: String,
        callback: js.Function1[/* result */ typings.chrome.chrome.devtools.panels.ExtensionSidebarPane, Unit]
      ): Unit = js.native
      
      /** Fired when an object is selected in the panel. */
      var onSelectionChanged: typings.chrome.chrome.devtools.panels.SelectionChangedEvent = js.native
    }
  }
}
