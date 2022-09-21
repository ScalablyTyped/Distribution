package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the propertyChanged event to indicate which property has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310957(v=vs.100).aspx}
  */
@JSGlobal("Sys.PropertyChangedEventArgs")
@js.native
open class PropertyChangedEventArgs protected ()
  extends StObject
     with typings.microsoftAjax.Sys.PropertyChangedEventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the PropertyChangedEventArgs class.
    * @param propertyName
    *           The name of the property that changed.
    */
  def this(propertyName: String) = this()
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
  
  //#endregion
  //#region Methods
  /**
    * Gets the name of the property that changed.
    * Use the propertyName property to determine the name of the property that changed.
    * @return A string that contains the name of the property that changed.
    */
  /* CompleteClass */
  override def propertyName(): String = js.native
}
