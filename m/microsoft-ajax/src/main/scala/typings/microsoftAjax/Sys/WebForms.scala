package typings.microsoftAjax.Sys

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
  trait BeginRequestEventArgs
    extends StObject
       with EventArgs {
    
    //#endregion
    //#region Properties
    /**
      * Gets the postback element that initiated the asynchronous postback. This property is read-only.
      * @return An HTML DOM element.
      */
    def get_postBackElement(): HTMLElement
    
    /**
      * Gets the request object that represents the current postback.
      * @return An instance of the Sys.Net.WebRequest class.
      */
    def get_request(): WebRequest
    
    /**
      * Gets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
      * Server-side processing might update additional UpdatePanel controls.
      * @return An array of UniqueID values for UpdatePanel controls.
      */
    def get_updatePanelsToUpdate(): js.Array[String]
  }
  object BeginRequestEventArgs {
    
    inline def apply(
      Empty: EventArgs,
      get_postBackElement: () => HTMLElement,
      get_request: () => WebRequest,
      get_updatePanelsToUpdate: () => js.Array[String]
    ): BeginRequestEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_postBackElement = js.Any.fromFunction0(get_postBackElement), get_request = js.Any.fromFunction0(get_request), get_updatePanelsToUpdate = js.Any.fromFunction0(get_updatePanelsToUpdate))
      __obj.asInstanceOf[BeginRequestEventArgs]
    }
    
    extension [Self <: BeginRequestEventArgs](x: Self) {
      
      inline def setGet_postBackElement(value: () => HTMLElement): Self = StObject.set(x, "get_postBackElement", js.Any.fromFunction0(value))
      
      inline def setGet_request(value: () => WebRequest): Self = StObject.set(x, "get_request", js.Any.fromFunction0(value))
      
      inline def setGet_updatePanelsToUpdate(value: () => js.Array[String]): Self = StObject.set(x, "get_updatePanelsToUpdate", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Used by the endRequest event of the PageRequestManager class to pass argument information to event handlers.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397499.aspx}
    */
  trait EndRequestEventArgs
    extends StObject
       with EventArgs {
    
    //#endregion
    //#region Properties
    /**
      * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
      * The JavaScript Error object exposes several properties that define the error. The Microsoft Ajax Library provides additional functions for the Error object.
      * @return A JSON data structure that contains name/value pairs that were registered as data items by using the RegisterDataItem method of the ScriptManager class.
      */
    def get_dataItems(): Any
    
    /**
      * Gets the Error object.
      * @return A base ECMAScript (JavaScript) Error object.
      */
    def get_error(): js.Error
    
    /**
      * Get or sets a value that indicates whether the error has been handled.
      * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
      * @return true if the error has been handled; otherwise false.
      */
    def get_errorHandled(): Boolean
    
    /**
      * Gets a response object that is represented by the Sys.Net.WebRequestExecutor class.
      * @return A response object that is represented by the WebRequestExecutor class.
      */
    def get_response(): WebRequestExecutor
    
    /**
      * Get or sets a value that indicates whether the error has been handled.
      * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
      * @param value
      *         true or false.
      */
    def set_errorHandled(value: Boolean): Unit
  }
  object EndRequestEventArgs {
    
    inline def apply(
      Empty: EventArgs,
      get_dataItems: () => Any,
      get_error: () => js.Error,
      get_errorHandled: () => Boolean,
      get_response: () => WebRequestExecutor,
      set_errorHandled: Boolean => Unit
    ): EndRequestEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_dataItems = js.Any.fromFunction0(get_dataItems), get_error = js.Any.fromFunction0(get_error), get_errorHandled = js.Any.fromFunction0(get_errorHandled), get_response = js.Any.fromFunction0(get_response), set_errorHandled = js.Any.fromFunction1(set_errorHandled))
      __obj.asInstanceOf[EndRequestEventArgs]
    }
    
    extension [Self <: EndRequestEventArgs](x: Self) {
      
      inline def setGet_dataItems(value: () => Any): Self = StObject.set(x, "get_dataItems", js.Any.fromFunction0(value))
      
      inline def setGet_error(value: () => js.Error): Self = StObject.set(x, "get_error", js.Any.fromFunction0(value))
      
      inline def setGet_errorHandled(value: () => Boolean): Self = StObject.set(x, "get_errorHandled", js.Any.fromFunction0(value))
      
      inline def setGet_response(value: () => WebRequestExecutor): Self = StObject.set(x, "get_response", js.Any.fromFunction0(value))
      
      inline def setSet_errorHandled(value: Boolean => Unit): Self = StObject.set(x, "set_errorHandled", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Used by the initializeRequest event of the PageRequestManager class to pass argument information to event handlers.
    * This class contains private members that support the client-script infrastructure and are not intended to be used directly from your code. Names of private members begin with an underscore ( _ ).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311030(v=vs.100).aspx}
    */
  trait InitializeRequestEventArgs
    extends StObject
       with EventArgs {
    
    //#endregion
    //#region Properties
    /**
      * Gets the postback element that initiated the asynchronous postback.
      * @return An HTML DOM element.
      */
    def get_postBackElement(): HTMLElement
    
    /**
      * Gets the request object that represents the current postback.
      * @return A request object that is represented by the Sys.Net.WebRequestExecutor class.
      */
    def get_request(): WebRequestExecutor
    
    /**
      * Gets or sets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
      * The returned array can be modified by a client event handler to add or remove UpdatePanel controls that should re-render their content dynamically. Server processing can also modify the array.
      * @return An array of UniqueID values for UpdatePanel controls.
      */
    def get_updatePanelsToUpdate(): js.Array[String]
  }
  object InitializeRequestEventArgs {
    
    inline def apply(
      Empty: EventArgs,
      get_postBackElement: () => HTMLElement,
      get_request: () => WebRequestExecutor,
      get_updatePanelsToUpdate: () => js.Array[String]
    ): InitializeRequestEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_postBackElement = js.Any.fromFunction0(get_postBackElement), get_request = js.Any.fromFunction0(get_request), get_updatePanelsToUpdate = js.Any.fromFunction0(get_updatePanelsToUpdate))
      __obj.asInstanceOf[InitializeRequestEventArgs]
    }
    
    extension [Self <: InitializeRequestEventArgs](x: Self) {
      
      inline def setGet_postBackElement(value: () => HTMLElement): Self = StObject.set(x, "get_postBackElement", js.Any.fromFunction0(value))
      
      inline def setGet_request(value: () => WebRequestExecutor): Self = StObject.set(x, "get_request", js.Any.fromFunction0(value))
      
      inline def setGet_updatePanelsToUpdate(value: () => js.Array[String]): Self = StObject.set(x, "get_updatePanelsToUpdate", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Used by the pageLoaded event of the PageRequestManager class to send event data that represents the UpdatePanel controls that were updated and created in the most recent postback.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397476(v=vs.100).aspx}
    */
  trait PageLoadedEventArgs
    extends StObject
       with EventArgs {
    
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
    def get_dataItems(): Any
    
    /**
      * Gets an array of HTML div elements that represent UpdatePanel controls that were created when the DOM was updated during the last asynchronous postback.
      * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsCreated property of the PageLoadedEventArgs class contains a reference to the corresponding div element.
      * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
      * @return An array of div elements that were created during the DOM manipulation that was caused by the last asynchronous postback. If no elements were created, the property returns null.
      */
    def get_panelsCreated(): js.Array[HTMLDivElement]
    
    /**
      * Gets an array of HTML <div> elements that represent UpdatePanel controls that were updated when the DOM was updated during the last asynchronous postback.
      * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsUpdated property of the PageLoadedEventArgs class contains a reference to the corresponding <div> element.
      * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
      * @return An array of <div> elements that were updated during the DOM manipulation that was the result of the last asynchronous postback. If no elements were created, the property returns null.
      */
    def get_panelsUpdated(): js.Array[HTMLDivElement]
  }
  object PageLoadedEventArgs {
    
    inline def apply(
      Empty: EventArgs,
      get_dataItems: () => Any,
      get_panelsCreated: () => js.Array[HTMLDivElement],
      get_panelsUpdated: () => js.Array[HTMLDivElement]
    ): PageLoadedEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_dataItems = js.Any.fromFunction0(get_dataItems), get_panelsCreated = js.Any.fromFunction0(get_panelsCreated), get_panelsUpdated = js.Any.fromFunction0(get_panelsUpdated))
      __obj.asInstanceOf[PageLoadedEventArgs]
    }
    
    extension [Self <: PageLoadedEventArgs](x: Self) {
      
      inline def setGet_dataItems(value: () => Any): Self = StObject.set(x, "get_dataItems", js.Any.fromFunction0(value))
      
      inline def setGet_panelsCreated(value: () => js.Array[HTMLDivElement]): Self = StObject.set(x, "get_panelsCreated", js.Any.fromFunction0(value))
      
      inline def setGet_panelsUpdated(value: () => js.Array[HTMLDivElement]): Self = StObject.set(x, "get_panelsUpdated", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Used by the pageLoading event of the PageRequestManager class to send event data that represents the UpdatePanel controls that are being updated and deleted as a result of the most recent postback.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310960(v=vs.100).aspx}
    */
  trait PageLoadingEventArgs
    extends StObject
       with EventArgs {
    
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
    def get_dataItems(): Any
    
    /**
      * Gets an array of HTML <div> elements that represent UpdatePanel controls that will be deleted from the DOM as a result of the current asynchronous postback.
      * If the contents of an UpdatePanel control will be deleted as the result of a partial-page update, the array that is referenced in the panelsDeleting property of the PageLoadingEventArgs class contains a reference to the corresponding <div> element.
      * The pageLoading event of the Sys.WebForms.PageRequestManager class uses a PageLoadingEventArgs object to return its event data.
      * @return An array of <div> elements that will be deleted from the DOM. If no elements will be deleted, the property returns null.
      */
    def get_panelsDeleting(): js.Array[HTMLDivElement]
    
    /**
      * Gets an array of HTML <div> elements that represent UpdatePanel controls that will be updated in the DOM as a result of the current asynchronous postback.
      * If the contents of any UpdatePanel controls will be updated as the result of a partial-page update, the panelsUpdating property contains an array that references the corresponding <div> elements.
      * The pageLoading event of the Sys.WebForms.PageRequestManager class uses a PageLoadingEventArgs object to return its event data.
      * @return An array of <div> elements that will be updated in the DOM. If no elements will be updated, the property returns null.
      */
    def get_panelsUpdating(): js.Array[HTMLDivElement]
  }
  object PageLoadingEventArgs {
    
    inline def apply(
      Empty: EventArgs,
      get_dataItems: () => Any,
      get_panelsDeleting: () => js.Array[HTMLDivElement],
      get_panelsUpdating: () => js.Array[HTMLDivElement]
    ): PageLoadingEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_dataItems = js.Any.fromFunction0(get_dataItems), get_panelsDeleting = js.Any.fromFunction0(get_panelsDeleting), get_panelsUpdating = js.Any.fromFunction0(get_panelsUpdating))
      __obj.asInstanceOf[PageLoadingEventArgs]
    }
    
    extension [Self <: PageLoadingEventArgs](x: Self) {
      
      inline def setGet_dataItems(value: () => Any): Self = StObject.set(x, "get_dataItems", js.Any.fromFunction0(value))
      
      inline def setGet_panelsDeleting(value: () => js.Array[HTMLDivElement]): Self = StObject.set(x, "get_panelsDeleting", js.Any.fromFunction0(value))
      
      inline def setGet_panelsUpdating(value: () => js.Array[HTMLDivElement]): Self = StObject.set(x, "get_panelsUpdating", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Manages client partial-page updates of server UpdatePanel controls. In addition, defines properties, events, and methods that can be used to customize a Web page with client script.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311028(v=vs.100).aspx}
    */
  @js.native
  trait PageRequestManager extends StObject {
    
    /**
      * Stops all updates that would occur as a result of an asynchronous postback.
      * The abortPostBack method stops the currently executing postback. To cancel a new postback, provide an event handler for the initializeRequest event and use the cancel event of the Sys.CancelEventArgs class.
      */
    def abortPostBack(): Unit = js.native
    
    //#endregion
    //#region Events
    /**
      * Raised before the processing of an asynchronous postback starts and the postback request is sent to the server.
      * @param beginRequestHandler
      *               The name of the handler method that will be called.
      */
    def add_beginRequest(beginRequestHandler: js.Function2[/* sender */ Any, /* args */ BeginRequestEventArgs, Unit]): Unit = js.native
    
    /**
      * Raised after an asynchronous postback is finished and control has been returned to the browser.
      * @param endRequestHandler
      *               The name of the handler method that will be called.
      */
    def add_endRequest(endRequestHandler: js.Function2[/* sender */ Any, /* args */ EndRequestEventArgs, Unit]): Unit = js.native
    
    /**
      * Raised during the initialization of the asynchronous postback.
      * @param initializeRequestHandler
      *               The name of the handler method that will be called.
      */
    def add_initializeRequest(
      initializeRequestHandler: js.Function2[/* sender */ Any, /* args */ InitializeRequestEventArgs, Unit]
    ): Unit = js.native
    
    /**
      * Raised after all content on the page is refreshed as a result of either a synchronous or an asynchronous postback.
      * @param pageLoadedHandler
      *               The name of the handler method that will be called.
      */
    def add_pageLoaded(pageLoadedHandler: js.Function2[/* sender */ Any, /* args */ PageLoadedEventArgs, Unit]): Unit = js.native
    
    /**
      * Raised after the response from the server to an asynchronous postback is received but before any content on the page is updated.
      * @param pageLoadedHandler
      *               The name of the handler method that will be called.
      */
    def add_pageLoading(pageLoadingHandler: js.Function2[/* sender */ Any, /* args */ PageLoadingEventArgs, Unit]): Unit = js.native
    
    /**
      * Begins an asynchronous postback.
      * @param updatePanelsToUpdate
      *                   (Optional) An array of UniqueID values or ClientID values for UpdatePanel controls that must be re-rendered.
      * @param eventTarget
      *                   (Optional) A string that contains the target of the event.
      * @param eventArgument
      *                   (Optional) A string that contains an argument for the event.
      * @param causesValidation
      *                   (Optional) true to cause validation.
      * @param validationGroup
      *                   (Optional) A string that contains the name of the validation group.
      */
    def beginAsyncPostBack(): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: js.Array[String]): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: js.Array[String], eventTarget: String): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: js.Array[String], eventTarget: String, eventArgument: String): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: String,
      eventArgument: String,
      causesValidation: Boolean
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: String,
      eventArgument: String,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: String,
      eventArgument: String,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: String,
      eventArgument: Unit,
      causesValidation: Boolean
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: String,
      eventArgument: Unit,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: String,
      eventArgument: Unit,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: js.Array[String], eventTarget: Unit, eventArgument: String): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: Unit,
      eventArgument: String,
      causesValidation: Boolean
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: Unit,
      eventArgument: String,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: Unit,
      eventArgument: String,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: Unit,
      eventArgument: Unit,
      causesValidation: Boolean
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: Unit,
      eventArgument: Unit,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: js.Array[String],
      eventTarget: Unit,
      eventArgument: Unit,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: String): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: String, eventArgument: String): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: String, eventArgument: String, causesValidation: Boolean): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: String,
      eventArgument: String,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: String,
      eventArgument: String,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: String, eventArgument: Unit, causesValidation: Boolean): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: String,
      eventArgument: Unit,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: String,
      eventArgument: Unit,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: Unit, eventArgument: String): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: Unit, eventArgument: String, causesValidation: Boolean): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: Unit,
      eventArgument: String,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: Unit,
      eventArgument: String,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(updatePanelsToUpdate: Unit, eventTarget: Unit, eventArgument: Unit, causesValidation: Boolean): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: Unit,
      eventArgument: Unit,
      causesValidation: Boolean,
      validationGroup: String
    ): Unit = js.native
    def beginAsyncPostBack(
      updatePanelsToUpdate: Unit,
      eventTarget: Unit,
      eventArgument: Unit,
      causesValidation: Unit,
      validationGroup: String
    ): Unit = js.native
    
    /**
      * Releases ECMAScript (JavaScript) resources and detaches events.
      * the dispose method to free client resources. The PageRequestManager instance calls the dispose method during the window.unload event of the browser.
      * If you call the dispose method and then reference members of the PageRequestManager class, an error occurs. In typical page developer scenarios, you do not have to call the dispose method.
      */
    def dispose(): Unit = js.native
    
    //#endregion
    //#region Properties
    def get_isInAsyncPostBack(): Boolean = js.native
    
    /**
      * Raised before the processing of an asynchronous postback starts and the postback request is sent to the server.
      *  @param beginRequestHandler
      *               The handler method that will be removed.
      */
    def remove_beginRequest(beginRequestHandler: js.Function): Unit = js.native
    
    /**
      * Raised after an asynchronous postback is finished and control has been returned to the browser.
      * @param endRequestHandler
      *               The name of the handler method that will be removed.
      */
    def remove_endRequest(endRequestHandler: js.Function2[/* sender */ Any, /* args */ EndRequestEventArgs, Unit]): Unit = js.native
    
    /**
      * Raised during the initialization of the asynchronous postback.
      * @param initializeRequestHandler
      *               The name of the handler method that will be called.
      */
    def remove_initializeRequest(
      initializeRequestHandler: js.Function2[/* sender */ Any, /* args */ InitializeRequestEventArgs, Unit]
    ): Unit = js.native
    
    /**
      * Raised after all content on the page is refreshed as a result of either a synchronous or an asynchronous postback.
      * @param pageLoadedHandler
      *               The name of the handler method that will be called.
      */
    def remove_pageLoaded(pageLoadedHandler: js.Function2[/* sender */ Any, /* args */ PageLoadedEventArgs, Unit]): Unit = js.native
    
    /**
      * Raised after the response from the server to an asynchronous postback is received but before any content on the page is updated.
      * @param pageLoadedHandler
      *               The name of the handler method that will be called.
      */
    def remove_pageLoading(pageLoadingHandler: js.Function2[/* sender */ Any, /* args */ PageLoadingEventArgs, Unit]): Unit = js.native
  }
  
  //#region Exceptions: Defines exceptions that can occur during partial-page updates.
  /**
    * Raised when an error occurs while processing the response from the server.
    * If the response to an asynchronous postback returns without an error but there is an error processing the response in the client, the Sys.WebForms.PageRequestManagerParserErrorException is raised.
    * For information about how to handle this error condition, see Debugging and Tracing Ajax Applications Overview.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}
    */
  trait PageRequestManagerParserErrorException extends StObject
  
  /**
    * Raised when an error occurs on the server.
    * If an error occurs on the server while the request is being processed, an error response is returned to the browser and the Sys.WebForms.PageRequestManagerServerErrorException exception is raised.
    * To customize error handling and to display more information about the server error, handle the AsyncPostBackError event and use the AsyncPostBackErrorMessage and AllowCustomErrorsRedirect properties.
    * For an example of how to provide custom error handling during partial-page updates, see Customizing Error Handling for ASP.NET UpdatePanel Controls.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}        *
    */
  trait PageRequestManagerServerErrorException extends StObject
  
  /**
    * Raised when the request times out.
    * A partial-page update is initiated by a client request (an asynchronous postback) to the server. The server processes the request and returns a response to the client.
    * If the browser does not receive a response in a specified time, the Sys.WebForms.PageRequestManagerTimeoutException is raised.
    * To change the interval that elapses before asynchronous postbacks time out, set the AsyncPostBackTimeout property of the ScriptManager control.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}
    */
  trait PageRequestManagerTimeoutException extends StObject
}
