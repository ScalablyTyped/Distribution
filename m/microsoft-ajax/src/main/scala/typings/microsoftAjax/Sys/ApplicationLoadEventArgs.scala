package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Event Args
/*
  * Used by the Application class to hold event arguments for the load event.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383787(v=vs.100).aspx}
  */
@JSGlobal("Sys.ApplicationLoadEventArgs")
@js.native
class ApplicationLoadEventArgs protected () extends js.Object {
  //#region Constructors
  /**
    * Initializes a new instance of the ApplicationLoadEventArgs class.
    * @param components
    *           The list of components that were created since the last time the load event was raised.
    * @param isPartialLoad
    *           true to indicate that the event is a partial-page update.
    */
  def this(components: js.Any, isPartialLoad: Boolean) = this()
  //#endregion
  //#region Properties
  /**
    * Gets an array of all the components that were created since the last time the load event was raised.
    * @return An array of all the components that were created since the last time the load event was raised.
    */
  def get_components(): js.Array[Component] = js.native
  /**
    * Returns a value that indicates whether the page is engaged in a partial-page update.
    * @return true if the page is engaged in a partial-page update; otherwise, false.
    */
  def get_isPartialLoad(): Boolean = js.native
}

