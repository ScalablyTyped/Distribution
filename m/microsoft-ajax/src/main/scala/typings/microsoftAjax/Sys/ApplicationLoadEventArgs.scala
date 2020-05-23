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
trait ApplicationLoadEventArgs extends js.Object {
  //#endregion
  //#region Properties
  /**
    * Gets an array of all the components that were created since the last time the load event was raised.
    * @return An array of all the components that were created since the last time the load event was raised.
    */
  def get_components(): js.Array[Component]
  /**
    * Returns a value that indicates whether the page is engaged in a partial-page update.
    * @return true if the page is engaged in a partial-page update; otherwise, false.
    */
  def get_isPartialLoad(): Boolean
}

object ApplicationLoadEventArgs {
  @scala.inline
  def apply(get_components: () => js.Array[Component], get_isPartialLoad: () => Boolean): ApplicationLoadEventArgs = {
    val __obj = js.Dynamic.literal(get_components = js.Any.fromFunction0(get_components), get_isPartialLoad = js.Any.fromFunction0(get_isPartialLoad))
    __obj.asInstanceOf[ApplicationLoadEventArgs]
  }
}

