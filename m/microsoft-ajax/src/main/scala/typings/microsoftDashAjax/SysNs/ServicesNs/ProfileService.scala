package typings.microsoftDashAjax.SysNs.ServicesNs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the client proxy class for the profile service.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383800(v=vs.100).aspx}
  */
@JSGlobal("Sys.Services.ProfileService")
@js.native
class ProfileService () extends Instantiable0[ProfileService]

/* static members */
@JSGlobal("Sys.Services.ProfileService")
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

