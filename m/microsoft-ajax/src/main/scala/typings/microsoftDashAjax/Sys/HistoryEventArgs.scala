package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used by the Sys.Application Class to hold event arguments for the navigate event.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc488008(v=vs.100).aspx}
  */
@JSGlobal("Sys.HistoryEventArgs")
@js.native
class HistoryEventArgs protected () extends EventArgs {
  //#region Constructors
  /**
    * For a live code example that demonstrates this event in action, and for a view of how this event is used in code, see Managing Browser History Using Client Script.
    * @param state Object. A collection of key/value pairs that represent the state data. This data will be added to the main state to form the global state of the new history point.
    */
  def this(state: js.Any) = this()
  //#endregion
  //#region Methods
  /**
    * Object. A collection of name/value pairs that represent the state of a Web page.
    * The state object stores the data that is required in order to restore a Web page to a specified application state.
    * @return Object. A collection of name/value pairs that represent the state of a Web page.
    */
  def get_State(): js.Any = js.native
}

