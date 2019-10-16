package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Sys.Services Namespace
/**
  * Contains types that provide script access in AJAX-enabled ASP.NET client applications to the ASP.NET authentication service, profile service, and other application services.
  * The Sys.Services namespace is part of the Microsoft Ajax Library.
  * For more information @{see Using Web Services in ASP.NET AJAX {@link http://msdn.microsoft.com/en-us/library/bb515101(v=vs.100).aspx}}
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311017(v=vs.100).aspx}
  */
@JSGlobal("Sys.Services")
@js.native
object Services extends js.Object {
  /**
    * Provides the client proxy class for the authentication service.
    * The AuthenticationService class is a singleton; it has only one instance with a global point of access.
    * It is always available to your application and you do not have to instantiate it.
    * The AuthenticationService class provides script access to user authentication.
    * It calls methods of the authentication service through the same infrastructure used to call any other Web service method.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310861(v=vs.100).aspx}
    */
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Services.AuthenticationService class.
    */
  class AuthenticationService () extends js.Object {
    //#endregion
    //#region Fields
    /**
      * Specifies the path of the default authentication service.
      */
    var DefaultWebServicePath: java.lang.String = js.native
    /**
      * Gets or sets the default succeeded callback function for the service.
      * @return A reference to the succeeded callback function for the service.
      */
    def defaultSucceededCallback(): js.Function = js.native
    /**
      * Gets or sets the default succeeded callback function for the service.
      * @param value
      *           A reference to the succeeded callback function for the service.
      */
    def defaultSucceededCallback(value: js.Function): Unit = js.native
    /**
      * Gets or sets the default user context for the service.
      * @return A reference to the user context for the service.
      */
    def defaultUserContext(): js.Object = js.native
    /**
      * Gets or sets the default user context for the service.
      * @param value
      *       A reference to the user context for the service.
      */
    def defaultUserContext(value: js.Object): Unit = js.native
    //#endregion
    //#region Properties
    /**
      * Gets or sets the name of the default failure callback function.
      */
    def get_defaultFailedCallback(): js.Function = js.native
    /**
      * Gets the authentication state of the current user.
      * The value of this property is set by the ScriptManager object during a page request.
      * @return true if the current user is logged in; otherwise, false.
      */
    def get_isLoggedIn(): Boolean = js.native
    /**
      * Gets or sets the authentication service path.
      * By default, the path property is set to an empty string. If you do not set the path property, the internal default path is used, which points to the built-in authentication service.
      */
    def get_path(): java.lang.String = js.native
    /**
      * Gets or sets the authentication service time-out value.
      * The timeout property represents the time in milliseconds that the current instance of the Sys.Net.WebRequestExecutor class should wait before timing out the request.
      * The timeout in milliseconds
      * @return
      *       The timeout
      */
    def get_timeout(): Double = js.native
    //#endregion
    //#region Methods
    /**
      * Authenticates the user's credentials.
      * @param userName (required) The user name to authenticate.
      * @param password
      *           The user's password. The default is null.
      * @param isPersistent
      *           true if the issued authentication ticket should be persistent across browser sessions; otherwise, false. The default is false.
      * @param redirctUrl
      *           The URL to redirect the browser to on successful login. The default is null.
      * @param customInfo
      *
      * @param loginCompletedCallback
      *           The function to call when the login has finished successfully. The default is null.
      * @param failedCallback
      *           The function to call if the login fails. The default is null.
      * @param userContext
      *           User context information that you are passing to the callback functions.
      * @exception Sys.ArgumentNullException - username is null.
      */
    def login(
      userName: java.lang.String,
      password: java.lang.String,
      isPersistent: Boolean,
      customInfo: js.Any,
      redirectUrl: java.lang.String,
      loginCompletedCallback: js.Function,
      failedCallback: js.Function,
      userContext: js.Any
    ): Unit = js.native
    /**
      * Logs out the currently authenticated user.
      *
      * If redirectUrl is null or is an empty string, the page is redirected to itself after the call to the authentication Web service finishes and the completed callback function is called.
      * This makes sure that any user-related data is cleared from the page. If redirectUrl is not null or is a non-empty string, the page is redirected to the specified URL after a successful call to the Web service.
      * This URL can be an absolute virtual path, a relative virtual path, or a fully qualified domain name and a path.
      * If the call to the Web service fails, the page is not redirected or refreshed. Instead, the failed callback function is called.
      *
      * @param redirectUrl
      *           The URL to redirect the browser to on successful logout. The default is null.
      * @param logoutCompletedCallback
      *           The function that is called when the logout has finished. The default is null.
      * @param failedCallback
      *           The function that is called if the logout has failed. The default is null.
      * @param userContext
      *            User context information that you are passing to the callback functions.
      */
    def logout(
      redirectUrl: java.lang.String,
      logoutCompletedCallback: js.Function,
      failedCallback: js.Function,
      userContext: js.Any
    ): Unit = js.native
    /**
      * Gets or sets the name of the default failure callback function.
      * @param value
      *           A string that contains the name of the default failure callback function.
      */
    def set_defaultFailedCallback(value: java.lang.String): Unit = js.native
    /**
      * Gets or sets the authentication service path.
      * You usually set the path property in declarative markup. This value can be an absolute virtual path, a relative virtual path, or a fully qualified domain name and a path.
      * By default, the path property is set to an empty string. If you do not set the path property, the internal default path is used, which points to the built-in authentication service.
      * @param value
      *           The authentication service path.
      */
    def set_path(value: java.lang.String): Unit = js.native
    /**
      * Gets or sets the authentication service time-out value.
      * The timeout property represents the time in milliseconds that the current instance of the Sys.Net.WebRequestExecutor class should wait before timing out the request.
      * By setting a time-out interval, you can make sure that a pending request returns based on a time interval that you specify, instead of waiting for the asynchronous communication layer to time out.
      * @param value
      *           The time-out value in milliseconds.
      */
    def set_timeout(value: Double): Unit = js.native
  }
  
  /**
    * Defines a profile group.
    * The ProfileGroup class defines the type of an element as a group in the properties collection of the Sys.Services.ProfileService class.
    * Profile group properties are accessed as subproperties of the related group, as shown in the following ECMAScript (JavaScript) example:
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310801(v=vs.100).aspx}
    */
  @js.native
  //#region Constructors
  class ProfileGroup () extends js.Object {
    /**
      * Initializes a new instance of the Sys.Services.ProfileGroup class.
      * @param properties
      *           (Optional) An object that contains the settings for this profile group. This parameter can be null.
      */
    def this(properties: js.Object) = this()
  }
  
  /**
    * Provides the client proxy class for the profile service.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb383800(v=vs.100).aspx}
    */
  @js.native
  class ProfileService () extends js.Object
  
  /**
    * Provides the client proxy class for the role service.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb513880(v=vs.100).aspx}
    */
  @js.native
  class RoleService () extends js.Object
  
  /* static members */
  @js.native
  object ProfileService extends js.Object {
    //#region Fields
    /**
      * Specifies the path of the default profile service.
      */
    var DefaultWebServicePath: java.lang.String = js.native
    /**
      * Contains the loaded profile data. You can access the loaded profile data directly from the properties field.
      * An element in the properties field can be a property group of type ProfileGroup. If it is, the related properties appear as sub-properties. For more information, see Sys.Services.ProfileGroup Class.
      */
    var properties: js.Any = js.native
    /**
      * Gets or sets the default succeeded callback function for the service.
      * @return
      *      A reference to the succeeded callback function for the service.
      */
    def defaultSucceededCallback(): js.Function = js.native
    def defaultSucceededCallback(value: js.Function): Unit = js.native
    /**
      * Gets or sets the default user context for the service.
      * @return
      *      A reference to the user context for the service.
      */
    def defaultUserContext(): js.Object = js.native
    /**
      * Gets or sets the default user context for the service.
      */
    def defaultUserContext(value: js.Object): Unit = js.native
    def get_defaultFailedCallback(): js.Function = js.native
    def get_defaultLoadCompletedCallback(): js.Function = js.native
    def get_defaultSaveCompletedCallback(): js.Function = js.native
    /**
      * Gets or sets the profile service path.
      * @return
      *      The profile path
      */
    def get_path(): java.lang.String = js.native
    /**
      * Gets or sets the profile service time-out value.
      */
    def get_timeout(): Double = js.native
    //#endregion
    //#region Methods
    /**
      * Loads the specified profile properties.
      *
      * If propertyNames is not supplied, all profile properties enabled for read access are loaded from the server.
      * The loaded profile can then be accessed directly from the properties field.
      * This enables your application to access the profile properties by using simple field syntax, as shown in the following example:
      * @example
      *      Sys.Services.ProfileService.load(null, LoadCompletedCallback, ProfileFailedCallback, null);
      *
      * @param propertyName
      *      A string array that contains the profile properties to load.
      * @param loadCompletedCallback
      *      The function that is called when loading has completed. The default is null.
      * @param failedCallback
      *      The function that is called when loading has failed. The default is null.
      * @param userContext
      *      User context information passed to the callback functions.
      */
    def load(
      propertyNames: js.Array[java.lang.String],
      loadCompletedCallback: js.Function,
      failedCallback: js.Function,
      userContext: js.Any
    ): Unit = js.native
    /**
      * @param propertyNames
      *          A string array that contains the profile properties to save.
      * @param saveCompletedCallback
      *          The function that is called when the save method has finished. The default is null.
      * @param failedCallback
      *          The function that is called if the save method has failed. The default is null.
      * @param userContext
      *      User context information passed to the callback functions.
      */
    def save(
      propertyNames: js.Array[java.lang.String],
      saveCompletedCallback: js.Function,
      failedCallback: js.Function,
      userContext: js.Any
    ): Unit = js.native
    //#endregion
    //#region Properties
    /**
      * Gets or sets the name of the default failure callback function.
      * @param value
      *      A string that contains the name of the default failure callback function.
      */
    def set_defaultFailedCallback(value: java.lang.String): Unit = js.native
    /**
      * Gets or sets the name of the default load-completed callback function.
      *
      * @param value
      *      A string that contains the name of the default load-completed callback function.
      */
    def set_defaultLoadCompletedCallback(value: java.lang.String): Unit = js.native
    /**
      * Gets or sets the name of the default save-completed callback function.
      * @param value
      *      A string that contains the name of the default save-completed callback function.
      */
    def set_defaultSaveCompletedCallback(value: java.lang.String): Unit = js.native
    /**
      * Gets or sets the profile service path.
      * @param value
      *          A string that contains the profile service path.
      */
    def set_path(value: java.lang.String): Unit = js.native
    /**
      * Gets or sets the profile service time-out value.
      * The timeout property represents the time in milliseconds that the current instance of the Sys.Net.WebRequestExecutor class should wait before timing out the request.
      * By setting a time-out interval, you can make sure that a pending request returns based on a time interval that you specify, instead of waiting for the asynchronous communication layer to time out.
      *
      * @param value
      *          The time-out value in milliseconds.
      */
    def set_timeout(value: Double): Unit = js.native
  }
  
}

