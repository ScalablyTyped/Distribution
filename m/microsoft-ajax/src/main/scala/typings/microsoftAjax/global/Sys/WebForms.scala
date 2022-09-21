package typings.microsoftAjax.global.Sys

import typings.microsoftAjax.Sys.Net.WebRequest
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sys.WebForms Namespace
/**
  * The Sys.WebForms namespace contains classes related to partial-page rendering in the Microsoft Ajax Library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397566(v=vs.100).aspx}
  */
object WebForms {
  
  /**
    * Used by the beginRequest event of the PageRequestManager class to pass argument information to event handlers.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb384003(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.BeginRequestEventArgs")
  @js.native
  open class BeginRequestEventArgs protected ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.BeginRequestEventArgs {
    //#region Constructors
    /**
      * Initializes a new instance of the BeginRequestEventArgs class.
      * @param request
      *           A Sys.Net.WebRequest representing the web request for the EventArgs.
      * @param postBackElement
      *           The postback element that initiated the async postback.
      * @param updatePanelsToUpdate
      *           (Optional) A list of UniqueIDs for UpdatePanel controls that are requested to update their rendering by the client. Server-side processing may update additional UpdatePanels.
      */
    def this(request: WebRequest, postBackElement: Any, updatePanelsToUpdate: js.Array[String]) = this()
    
    /**
      * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
      */
    /* CompleteClass */
    var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets the postback element that initiated the asynchronous postback. This property is read-only.
      * @return An HTML DOM element.
      */
    /* CompleteClass */
    override def get_postBackElement(): HTMLElement = js.native
    
    /**
      * Gets the request object that represents the current postback.
      * @return An instance of the Sys.Net.WebRequest class.
      */
    /* CompleteClass */
    override def get_request(): WebRequest = js.native
    
    /**
      * Gets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
      * Server-side processing might update additional UpdatePanel controls.
      * @return An array of UniqueID values for UpdatePanel controls.
      */
    /* CompleteClass */
    override def get_updatePanelsToUpdate(): js.Array[String] = js.native
  }
  
  /**
    * Used by the endRequest event of the PageRequestManager class to pass argument information to event handlers.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397499.aspx}
    */
  @JSGlobal("Sys.WebForms.EndRequestEventArgs")
  @js.native
  open class EndRequestEventArgs protected ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.EndRequestEventArgs {
    //#region Constructors
    /**
      * Initializes a new instance of the EndRequestEventArgs class.
      * @param error
      *           An error object.
      * @param dataItems
      *           An object containing data items.
      * @param response
      *           An object of type Sys.Net.WebRequestExecutor.
      */
    def this(error: js.Error, dataItems: Any, response: WebRequestExecutor) = this()
    
    /**
      * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
      */
    /* CompleteClass */
    var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
      * The JavaScript Error object exposes several properties that define the error. The Microsoft Ajax Library provides additional functions for the Error object.
      * @return A JSON data structure that contains name/value pairs that were registered as data items by using the RegisterDataItem method of the ScriptManager class.
      */
    /* CompleteClass */
    override def get_dataItems(): Any = js.native
    
    /**
      * Gets the Error object.
      * @return A base ECMAScript (JavaScript) Error object.
      */
    /* CompleteClass */
    override def get_error(): js.Error = js.native
    
    /**
      * Get or sets a value that indicates whether the error has been handled.
      * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
      * @return true if the error has been handled; otherwise false.
      */
    /* CompleteClass */
    override def get_errorHandled(): Boolean = js.native
    
    /**
      * Gets a response object that is represented by the Sys.Net.WebRequestExecutor class.
      * @return A response object that is represented by the WebRequestExecutor class.
      */
    /* CompleteClass */
    override def get_response(): WebRequestExecutor = js.native
    
    /**
      * Get or sets a value that indicates whether the error has been handled.
      * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
      * @param value
      *         true or false.
      */
    /* CompleteClass */
    override def set_errorHandled(value: Boolean): Unit = js.native
  }
  
  /**
    * Used by the initializeRequest event of the PageRequestManager class to pass argument information to event handlers.
    * This class contains private members that support the client-script infrastructure and are not intended to be used directly from your code. Names of private members begin with an underscore ( _ ).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311030(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.InitializeRequestEventArgs")
  @js.native
  open class InitializeRequestEventArgs protected ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.InitializeRequestEventArgs {
    //#region Constructors
    /**
      * Initializes a new instance of the EndRequestEventArgs class.
      * @param request
      *           A Sys.Net.WebRequest object that represents the Web request for the EventArgs object.
      * @param datapostBackElementItems
      *           The postback element that initiated the asynchronous postback.
      * @param updatePanelsToUpdate
      *           (Optional) A list of UniqueID values for UpdatePanel controls that are being requested to update their rendering by the client. Server-side processing might update additional UpdatePanel controls.
      */
    def this(request: WebRequest, postBackElement: Any, updatePanelsToUpdate: js.Array[String]) = this()
    
    /**
      * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
      */
    /* CompleteClass */
    var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets the postback element that initiated the asynchronous postback.
      * @return An HTML DOM element.
      */
    /* CompleteClass */
    override def get_postBackElement(): HTMLElement = js.native
    
    /**
      * Gets the request object that represents the current postback.
      * @return A request object that is represented by the Sys.Net.WebRequestExecutor class.
      */
    /* CompleteClass */
    override def get_request(): WebRequestExecutor = js.native
    
    /**
      * Gets or sets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
      * The returned array can be modified by a client event handler to add or remove UpdatePanel controls that should re-render their content dynamically. Server processing can also modify the array.
      * @return An array of UniqueID values for UpdatePanel controls.
      */
    /* CompleteClass */
    override def get_updatePanelsToUpdate(): js.Array[String] = js.native
  }
  
  /**
    * Used by the pageLoaded event of the PageRequestManager class to send event data that represents the UpdatePanel controls that were updated and created in the most recent postback.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397476(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.PageLoadedEventArgs")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the PageLoadedEventArgs class.
    */
  open class PageLoadedEventArgs ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.PageLoadedEventArgs {
    
    /**
      * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
      */
    /* CompleteClass */
    var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
      * A page or control must be in partial-page rendering mode to register data items that use the RegisterDataItem method of the ScriptManager class
      * Use the IsInAsyncPostBack property to check whether the page is in partial-page rendering mode.The dataItems property returns a JSON data structure that contains name/value pairs.
      * The name is the unique ID of the control that is used in the control parameter of the RegisterDataItem method. The value is the dataItem parameter of the RegisterDataItem method.
      *
      * @return A JSON data structure that contains name/value pairs that were registered as data items that use the RegisterDataItem method of the ScriptManager class.
      */
    /* CompleteClass */
    override def get_dataItems(): Any = js.native
    
    /**
      * Gets an array of HTML div elements that represent UpdatePanel controls that were created when the DOM was updated during the last asynchronous postback.
      * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsCreated property of the PageLoadedEventArgs class contains a reference to the corresponding div element.
      * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
      * @return An array of div elements that were created during the DOM manipulation that was caused by the last asynchronous postback. If no elements were created, the property returns null.
      */
    /* CompleteClass */
    override def get_panelsCreated(): js.Array[HTMLDivElement] = js.native
    
    /**
      * Gets an array of HTML <div> elements that represent UpdatePanel controls that were updated when the DOM was updated during the last asynchronous postback.
      * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsUpdated property of the PageLoadedEventArgs class contains a reference to the corresponding <div> element.
      * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
      * @return An array of <div> elements that were updated during the DOM manipulation that was the result of the last asynchronous postback. If no elements were created, the property returns null.
      */
    /* CompleteClass */
    override def get_panelsUpdated(): js.Array[HTMLDivElement] = js.native
  }
  
  /**
    * Used by the pageLoading event of the PageRequestManager class to send event data that represents the UpdatePanel controls that are being updated and deleted as a result of the most recent postback.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310960(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.PageLoadingEventArgs")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the PageLoadingEventArgs class.
    */
  open class PageLoadingEventArgs ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.PageLoadingEventArgs {
    
    /**
      * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
      */
    /* CompleteClass */
    var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
      * page or control must be in partial-page rendering mode to register data items that use the RegisterDataItem method of the ScriptManager class.
      * Use the IsInAsyncPostBack property to check whether the page is in partial-page rendering mode.
      * The dataItems property returns a JSON data structure that contains name/value pairs.
      * The name is the unique ID of the control that is used in the control parameter of the RegisterDataItem method. The value is the dataItem parameter of the RegisterDataItem method.
      * @return A JSON data structure that contains name/value pairs that were registered as data items by using the RegisterDataItem method of the ScriptManager class.
      */
    /* CompleteClass */
    override def get_dataItems(): Any = js.native
    
    /**
      * Gets an array of HTML <div> elements that represent UpdatePanel controls that will be deleted from the DOM as a result of the current asynchronous postback.
      * If the contents of an UpdatePanel control will be deleted as the result of a partial-page update, the array that is referenced in the panelsDeleting property of the PageLoadingEventArgs class contains a reference to the corresponding <div> element.
      * The pageLoading event of the Sys.WebForms.PageRequestManager class uses a PageLoadingEventArgs object to return its event data.
      * @return An array of <div> elements that will be deleted from the DOM. If no elements will be deleted, the property returns null.
      */
    /* CompleteClass */
    override def get_panelsDeleting(): js.Array[HTMLDivElement] = js.native
    
    /**
      * Gets an array of HTML <div> elements that represent UpdatePanel controls that will be updated in the DOM as a result of the current asynchronous postback.
      * If the contents of any UpdatePanel controls will be updated as the result of a partial-page update, the panelsUpdating property contains an array that references the corresponding <div> elements.
      * The pageLoading event of the Sys.WebForms.PageRequestManager class uses a PageLoadingEventArgs object to return its event data.
      * @return An array of <div> elements that will be updated in the DOM. If no elements will be updated, the property returns null.
      */
    /* CompleteClass */
    override def get_panelsUpdating(): js.Array[HTMLDivElement] = js.native
  }
  
  /**
    * Manages client partial-page updates of server UpdatePanel controls. In addition, defines properties, events, and methods that can be used to customize a Web page with client script.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311028(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.PageRequestManager")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.WebForms.PageRequestManager Class.
    */
  open class PageRequestManager ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.PageRequestManager
  object PageRequestManager {
    
    @JSGlobal("Sys.WebForms.PageRequestManager")
    @js.native
    val ^ : js.Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Returns the instance of the PageRequestManager class for the page.
      * @return The current instance of the PageRequestManager class. You do not create a new instance of the PageRequestManager class directly. Instead, an instance is available when partial-page rendering is enabled.
      */
    /* static member */
    inline def getInstance(): typings.microsoftAjax.Sys.WebForms.PageRequestManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.microsoftAjax.Sys.WebForms.PageRequestManager]
  }
  
  //#region Exceptions: Defines exceptions that can occur during partial-page updates.
  /**
    * Raised when an error occurs while processing the response from the server.
    * If the response to an asynchronous postback returns without an error but there is an error processing the response in the client, the Sys.WebForms.PageRequestManagerParserErrorException is raised.
    * For information about how to handle this error condition, see Debugging and Tracing Ajax Applications Overview.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.PageRequestManagerParserErrorException")
  @js.native
  open class PageRequestManagerParserErrorException ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.PageRequestManagerParserErrorException
  
  /**
    * Raised when an error occurs on the server.
    * If an error occurs on the server while the request is being processed, an error response is returned to the browser and the Sys.WebForms.PageRequestManagerServerErrorException exception is raised.
    * To customize error handling and to display more information about the server error, handle the AsyncPostBackError event and use the AsyncPostBackErrorMessage and AllowCustomErrorsRedirect properties.
    * For an example of how to provide custom error handling during partial-page updates, see Customizing Error Handling for ASP.NET UpdatePanel Controls.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}        *
    */
  @JSGlobal("Sys.WebForms.PageRequestManagerServerErrorException")
  @js.native
  open class PageRequestManagerServerErrorException ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.PageRequestManagerServerErrorException
  
  /**
    * Raised when the request times out.
    * A partial-page update is initiated by a client request (an asynchronous postback) to the server. The server processes the request and returns a response to the client.
    * If the browser does not receive a response in a specified time, the Sys.WebForms.PageRequestManagerTimeoutException is raised.
    * To change the interval that elapses before asynchronous postbacks time out, set the AsyncPostBackTimeout property of the ScriptManager control.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.PageRequestManagerTimeoutException")
  @js.native
  open class PageRequestManagerTimeoutException ()
    extends StObject
       with typings.microsoftAjax.Sys.WebForms.PageRequestManagerTimeoutException
}
