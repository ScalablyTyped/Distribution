package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the base class for events that can be canceled.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311009(v=vs.100).aspx}
  */
@JSGlobal("Sys.CancelEventArgs")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the CancelEventArgs class.
  */
class CancelEventArgs ()
  extends StObject
     with typings.microsoftAjax.Sys.CancelEventArgs {
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
  
  /*
    * true to request that the event be canceled; otherwise, false. The default is false.
    * @return if the event is to be canceled; otherwise, false.
    */
  /* CompleteClass */
  override def get_cancel(): Boolean = js.native
  
  //#endregion
  //#region Properties
  /**
    * true to request that the event be canceled; otherwise, false. The default is false.
    */
  /* CompleteClass */
  override def set_cancel(value: Boolean): Unit = js.native
}
