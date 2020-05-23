package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the propertyChanged event to indicate which property has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310957(v=vs.100).aspx}
  */
trait PropertyChangedEventArgs extends EventArgs {
  //#endregion
  //#region Methods
  /**
    * Gets the name of the property that changed.
    * Use the propertyName property to determine the name of the property that changed.
    * @return A string that contains the name of the property that changed.
    */
  def propertyName(): String
}

object PropertyChangedEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, propertyName: () => String): PropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], propertyName = js.Any.fromFunction0(propertyName))
    __obj.asInstanceOf[PropertyChangedEventArgs]
  }
}

