package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Event Args
/*
  * Used by the Application class to hold event arguments for the load event.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383787(v=vs.100).aspx}
  */
@JSGlobal("Sys.ApplicationLoadEventArgs")
@js.native
open class ApplicationLoadEventArgs protected ()
  extends StObject
     with typings.microsoftAjax.Sys.ApplicationLoadEventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the ApplicationLoadEventArgs class.
    * @param components
    *           The list of components that were created since the last time the load event was raised.
    * @param isPartialLoad
    *           true to indicate that the event is a partial-page update.
    */
  def this(components: Any, isPartialLoad: Boolean) = this()
  
  //#endregion
  //#region Properties
  /**
    * Gets an array of all the components that were created since the last time the load event was raised.
    * @return An array of all the components that were created since the last time the load event was raised.
    */
  /* CompleteClass */
  override def get_components(): js.Array[typings.microsoftAjax.Sys.Component] = js.native
  
  /**
    * Returns a value that indicates whether the page is engaged in a partial-page update.
    * @return true if the page is engaged in a partial-page update; otherwise, false.
    */
  /* CompleteClass */
  override def get_isPartialLoad(): Boolean = js.native
}
