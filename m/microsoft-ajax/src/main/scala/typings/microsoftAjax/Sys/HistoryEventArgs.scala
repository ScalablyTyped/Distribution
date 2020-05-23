package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used by the Sys.Application Class to hold event arguments for the navigate event.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc488008(v=vs.100).aspx}
  */
trait HistoryEventArgs extends EventArgs {
  //#endregion
  //#region Methods
  /**
    * Object. A collection of name/value pairs that represent the state of a Web page.
    * The state object stores the data that is required in order to restore a Web page to a specified application state.
    * @return Object. A collection of name/value pairs that represent the state of a Web page.
    */
  def get_State(): js.Any
}

object HistoryEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_State: () => js.Any): HistoryEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_State = js.Any.fromFunction0(get_State))
    __obj.asInstanceOf[HistoryEventArgs]
  }
}

