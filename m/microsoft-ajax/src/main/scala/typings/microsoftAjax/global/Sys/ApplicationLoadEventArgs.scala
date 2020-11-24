package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Event Args
/*
  * Used by the Application class to hold event arguments for the load event.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383787(v=vs.100).aspx}
  */
@JSGlobal("Sys.ApplicationLoadEventArgs")
@js.native
class ApplicationLoadEventArgs protected ()
  extends typings.microsoftAjax.Sys.ApplicationLoadEventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the ApplicationLoadEventArgs class.
    * @param components
    *           The list of components that were created since the last time the load event was raised.
    * @param isPartialLoad
    *           true to indicate that the event is a partial-page update.
    */
  def this(components: js.Any, isPartialLoad: Boolean) = this()
}
