package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  extends StObject
     with typings.microsoftAjax.Sys.EventArgs {
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
}
object EventArgs {
  
  @JSGlobal("Sys.EventArgs")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion
  //#region Fields
  /**
    * A static object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* static member */
  @JSGlobal("Sys.EventArgs.Empty")
  @js.native
  def Empty: typings.microsoftAjax.Sys.EventArgs = js.native
  @scala.inline
  def Empty_=(x: typings.microsoftAjax.Sys.EventArgs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Empty")(x.asInstanceOf[js.Any])
}
