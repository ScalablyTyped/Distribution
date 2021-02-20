package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sys.Services Namespace
/**
  * Contains types that provide script access in AJAX-enabled ASP.NET client applications to the ASP.NET authentication service, profile service, and other application services.
  * The Sys.Services namespace is part of the Microsoft Ajax Library.
  * For more information @{see Using Web Services in ASP.NET AJAX {@link http://msdn.microsoft.com/en-us/library/bb515101(v=vs.100).aspx}}
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311017(v=vs.100).aspx}
  */
object Services {
  
  /**
    * Provides the client proxy class for the authentication service.
    * The AuthenticationService class is a singleton; it has only one instance with a global point of access.
    * It is always available to your application and you do not have to instantiate it.
    * The AuthenticationService class provides script access to user authentication.
    * It calls methods of the authentication service through the same infrastructure used to call any other Web service method.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310861(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Services.AuthenticationService")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Services.AuthenticationService class.
    */
  class AuthenticationService ()
    extends typings.microsoftAjax.Sys.Services.AuthenticationService
  
  /**
    * Defines a profile group.
    * The ProfileGroup class defines the type of an element as a group in the properties collection of the Sys.Services.ProfileService class.
    * Profile group properties are accessed as subproperties of the related group, as shown in the following ECMAScript (JavaScript) example:
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310801(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Services.ProfileGroup")
  @js.native
  //#region Constructors
  class ProfileGroup ()
    extends typings.microsoftAjax.Sys.Services.ProfileGroup {
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
  @JSGlobal("Sys.Services.ProfileService")
  @js.native
  class ProfileService ()
    extends typings.microsoftAjax.Sys.Services.ProfileService
  object ProfileService {
    
    @JSGlobal("Sys.Services.ProfileService")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Fields
    /**
      * Specifies the path of the default profile service.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.DefaultWebServicePath")
    @js.native
    def DefaultWebServicePath: String = js.native
    @scala.inline
    def DefaultWebServicePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultWebServicePath")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default succeeded callback function for the service.
      * @return
      *      A reference to the succeeded callback function for the service.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.defaultSucceededCallback")
    @js.native
    def defaultSucceededCallback(): js.Function = js.native
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.defaultSucceededCallback")
    @js.native
    def defaultSucceededCallback(value: js.Function): Unit = js.native
    
    /**
      * Gets or sets the default user context for the service.
      * @return
      *      A reference to the user context for the service.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.defaultUserContext")
    @js.native
    def defaultUserContext(): js.Object = js.native
    /**
      * Gets or sets the default user context for the service.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.defaultUserContext")
    @js.native
    def defaultUserContext(value: js.Object): Unit = js.native
    
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.get_defaultFailedCallback")
    @js.native
    def getDefaultFailedCallback(): js.Function = js.native
    
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.get_defaultLoadCompletedCallback")
    @js.native
    def getDefaultLoadCompletedCallback(): js.Function = js.native
    
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.get_defaultSaveCompletedCallback")
    @js.native
    def getDefaultSaveCompletedCallback(): js.Function = js.native
    
    /**
      * Gets or sets the profile service path.
      * @return
      *      The profile path
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.get_path")
    @js.native
    def getPath(): String = js.native
    
    /**
      * Gets or sets the profile service time-out value.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.get_timeout")
    @js.native
    def getTimeout(): Double = js.native
    
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
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.load")
    @js.native
    def load(
      propertyNames: js.Array[String],
      loadCompletedCallback: js.Function,
      failedCallback: js.Function,
      userContext: js.Any
    ): Unit = js.native
    
    /**
      * Contains the loaded profile data. You can access the loaded profile data directly from the properties field.
      * An element in the properties field can be a property group of type ProfileGroup. If it is, the related properties appear as sub-properties. For more information, see Sys.Services.ProfileGroup Class.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.properties")
    @js.native
    def properties: js.Any = js.native
    @scala.inline
    def properties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
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
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.save")
    @js.native
    def save(
      propertyNames: js.Array[String],
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
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.set_defaultFailedCallback")
    @js.native
    def setDefaultFailedCallback(value: String): Unit = js.native
    
    /**
      * Gets or sets the name of the default load-completed callback function.
      *
      * @param value
      *      A string that contains the name of the default load-completed callback function.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.set_defaultLoadCompletedCallback")
    @js.native
    def setDefaultLoadCompletedCallback(value: String): Unit = js.native
    
    /**
      * Gets or sets the name of the default save-completed callback function.
      * @param value
      *      A string that contains the name of the default save-completed callback function.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.set_defaultSaveCompletedCallback")
    @js.native
    def setDefaultSaveCompletedCallback(value: String): Unit = js.native
    
    /**
      * Gets or sets the profile service path.
      * @param value
      *          A string that contains the profile service path.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.set_path")
    @js.native
    def setPath(value: String): Unit = js.native
    
    /**
      * Gets or sets the profile service time-out value.
      * The timeout property represents the time in milliseconds that the current instance of the Sys.Net.WebRequestExecutor class should wait before timing out the request.
      * By setting a time-out interval, you can make sure that a pending request returns based on a time interval that you specify, instead of waiting for the asynchronous communication layer to time out.
      *
      * @param value
      *          The time-out value in milliseconds.
      */
    /* static member */
    @JSGlobal("Sys.Services.ProfileService.set_timeout")
    @js.native
    def setTimeout(value: Double): Unit = js.native
  }
  
  /**
    * Provides the client proxy class for the role service.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb513880(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Services.RoleService")
  @js.native
  class RoleService ()
    extends typings.microsoftAjax.Sys.Services.RoleService
}
