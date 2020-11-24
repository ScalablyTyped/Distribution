package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a base class for classes that are used by event sources to pass event argument information.
  * The EventArgs class is a base class and not intended to be used directly. Override this constructor to provide specific functionality.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383795(v=vs.100).aspx}
  */
@JSGlobal("Sys.EventArgs")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the EventArgs class.
  */
class EventArgs ()
  extends typings.microsoftAjax.Sys.EventArgs
/* static members */
@JSGlobal("Sys.EventArgs")
@js.native
object EventArgs extends js.Object {
  
  //#endregion
  //#region Fields
  /**
    * A static object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
}
