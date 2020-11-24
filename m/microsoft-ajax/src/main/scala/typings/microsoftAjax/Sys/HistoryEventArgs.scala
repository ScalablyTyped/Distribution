package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is used by the Sys.Application Class to hold event arguments for the navigate event.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc488008(v=vs.100).aspx}
  */
@js.native
trait HistoryEventArgs extends EventArgs {
  
  //#endregion
  //#region Methods
  /**
    * Object. A collection of name/value pairs that represent the state of a Web page.
    * The state object stores the data that is required in order to restore a Web page to a specified application state.
    * @return Object. A collection of name/value pairs that represent the state of a Web page.
    */
  def get_State(): js.Any = js.native
}
object HistoryEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_State: () => js.Any): HistoryEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_State = js.Any.fromFunction0(get_State))
    __obj.asInstanceOf[HistoryEventArgs]
  }
  
  @scala.inline
  implicit class HistoryEventArgsOps[Self <: HistoryEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_State(value: () => js.Any): Self = this.set("get_State", js.Any.fromFunction0(value))
  }
}
