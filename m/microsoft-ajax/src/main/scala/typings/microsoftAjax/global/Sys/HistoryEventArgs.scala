package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used by the Sys.Application Class to hold event arguments for the navigate event.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc488008(v=vs.100).aspx}
  */
@JSGlobal("Sys.HistoryEventArgs")
@js.native
class HistoryEventArgs protected ()
  extends typings.microsoftAjax.Sys.HistoryEventArgs {
  //#region Constructors
  /**
    * For a live code example that demonstrates this event in action, and for a view of how this event is used in code, see Managing Browser History Using Client Script.
    * @param state Object. A collection of key/value pairs that represent the state data. This data will be added to the main state to form the global state of the new history point.
    */
  def this(state: js.Any) = this()
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  override var Empty: typings.microsoftAjax.Sys.EventArgs = js.native
  //#endregion
  //#region Methods
  /**
    * Object. A collection of name/value pairs that represent the state of a Web page.
    * The state object stores the data that is required in order to restore a Web page to a specified application state.
    * @return Object. A collection of name/value pairs that represent the state of a Web page.
    */
  /* CompleteClass */
  override def get_State(): js.Any = js.native
}

