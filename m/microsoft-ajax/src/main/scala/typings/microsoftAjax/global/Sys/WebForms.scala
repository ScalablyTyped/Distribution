package typings.microsoftAjax.global.Sys

import typings.microsoftAjax.Sys.Net.WebRequest
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class BeginRequestEventArgs protected ()
    extends typings.microsoftAjax.Sys.WebForms.BeginRequestEventArgs {
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
    def this(request: WebRequest, postBackElement: js.Any, updatePanelsToUpdate: js.Array[String]) = this()
  }
  
  /**
    * Used by the endRequest event of the PageRequestManager class to pass argument information to event handlers.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397499.aspx}
    */
  @JSGlobal("Sys.WebForms.EndRequestEventArgs")
  @js.native
  class EndRequestEventArgs protected ()
    extends typings.microsoftAjax.Sys.WebForms.EndRequestEventArgs {
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
    def this(error: Error, dataItems: js.Any, response: WebRequestExecutor) = this()
  }
  
  /**
    * Used by the initializeRequest event of the PageRequestManager class to pass argument information to event handlers.
    * This class contains private members that support the client-script infrastructure and are not intended to be used directly from your code. Names of private members begin with an underscore ( _ ).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311030(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.InitializeRequestEventArgs")
  @js.native
  class InitializeRequestEventArgs protected ()
    extends typings.microsoftAjax.Sys.WebForms.InitializeRequestEventArgs {
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
    def this(request: WebRequest, postBackElement: js.Any, updatePanelsToUpdate: js.Array[String]) = this()
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
  class PageLoadedEventArgs ()
    extends typings.microsoftAjax.Sys.WebForms.PageLoadedEventArgs
  
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
  class PageLoadingEventArgs ()
    extends typings.microsoftAjax.Sys.WebForms.PageLoadingEventArgs
  
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
  class PageRequestManager ()
    extends typings.microsoftAjax.Sys.WebForms.PageRequestManager
  object PageRequestManager {
    
    //#endregion
    //#region Methods
    /**
      * Returns the instance of the PageRequestManager class for the page.
      * @return The current instance of the PageRequestManager class. You do not create a new instance of the PageRequestManager class directly. Instead, an instance is available when partial-page rendering is enabled.
      */
    /* static member */
    @JSGlobal("Sys.WebForms.PageRequestManager.getInstance")
    @js.native
    def getInstance(): typings.microsoftAjax.Sys.WebForms.PageRequestManager = js.native
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
  class PageRequestManagerParserErrorException ()
    extends typings.microsoftAjax.Sys.WebForms.PageRequestManagerParserErrorException
  
  /**
    * Raised when an error occurs on the server.
    * If an error occurs on the server while the request is being processed, an error response is returned to the browser and the Sys.WebForms.PageRequestManagerServerErrorException exception is raised.
    * To customize error handling and to display more information about the server error, handle the AsyncPostBackError event and use the AsyncPostBackErrorMessage and AllowCustomErrorsRedirect properties.
    * For an example of how to provide custom error handling during partial-page updates, see Customizing Error Handling for ASP.NET UpdatePanel Controls.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}        *
    */
  @JSGlobal("Sys.WebForms.PageRequestManagerServerErrorException")
  @js.native
  class PageRequestManagerServerErrorException ()
    extends typings.microsoftAjax.Sys.WebForms.PageRequestManagerServerErrorException
  
  /**
    * Raised when the request times out.
    * A partial-page update is initiated by a client request (an asynchronous postback) to the server. The server processes the request and returns a response to the client.
    * If the browser does not receive a response in a specified time, the Sys.WebForms.PageRequestManagerTimeoutException is raised.
    * To change the interval that elapses before asynchronous postbacks time out, set the AsyncPostBackTimeout property of the ScriptManager control.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}
    */
  @JSGlobal("Sys.WebForms.PageRequestManagerTimeoutException")
  @js.native
  class PageRequestManagerTimeoutException ()
    extends typings.microsoftAjax.Sys.WebForms.PageRequestManagerTimeoutException
}
