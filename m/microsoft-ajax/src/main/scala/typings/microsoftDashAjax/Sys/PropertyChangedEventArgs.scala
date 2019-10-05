package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the propertyChanged event to indicate which property has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310957(v=vs.100).aspx}
  */
@JSGlobal("Sys.PropertyChangedEventArgs")
@js.native
class PropertyChangedEventArgs protected () extends EventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the PropertyChangedEventArgs class.
    * @param propertyName
    *           The name of the property that changed.
    */
  def this(propertyName: java.lang.String) = this()
  //#endregion
  //#region Methods
  /**
    * Gets the name of the property that changed.
    * Use the propertyName property to determine the name of the property that changed.
    * @return A string that contains the name of the property that changed.
    */
  def propertyName(): java.lang.String = js.native
}

