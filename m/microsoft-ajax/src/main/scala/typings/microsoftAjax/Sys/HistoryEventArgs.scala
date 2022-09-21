package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is used by the Sys.Application Class to hold event arguments for the navigate event.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc488008(v=vs.100).aspx}
  */
trait HistoryEventArgs
  extends StObject
     with EventArgs {
  
  //#endregion
  //#region Methods
  /**
    * Object. A collection of name/value pairs that represent the state of a Web page.
    * The state object stores the data that is required in order to restore a Web page to a specified application state.
    * @return Object. A collection of name/value pairs that represent the state of a Web page.
    */
  def get_State(): Any
}
object HistoryEventArgs {
  
  inline def apply(Empty: EventArgs, get_State: () => Any): HistoryEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_State = js.Any.fromFunction0(get_State))
    __obj.asInstanceOf[HistoryEventArgs]
  }
  
  extension [Self <: HistoryEventArgs](x: Self) {
    
    inline def setGet_State(value: () => Any): Self = StObject.set(x, "get_State", js.Any.fromFunction0(value))
  }
}
