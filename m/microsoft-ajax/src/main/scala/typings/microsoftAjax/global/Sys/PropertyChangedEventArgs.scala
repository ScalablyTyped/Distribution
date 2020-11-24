package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the propertyChanged event to indicate which property has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310957(v=vs.100).aspx}
  */
@JSGlobal("Sys.PropertyChangedEventArgs")
@js.native
class PropertyChangedEventArgs protected ()
  extends typings.microsoftAjax.Sys.PropertyChangedEventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the PropertyChangedEventArgs class.
    * @param propertyName
    *           The name of the property that changed.
    */
  def this(propertyName: String) = this()
}
