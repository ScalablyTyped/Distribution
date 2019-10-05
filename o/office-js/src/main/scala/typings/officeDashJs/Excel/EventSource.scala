package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventSource extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.EventSource")
@js.native
object EventSource extends js.Object {
  /**
    *
    * Local means event comes from local user session.
    *
    */
  @js.native
  sealed trait local extends EventSource
  
  /**
    *
    * Remote means event comes from remote user session.
    *
    */
  @js.native
  sealed trait remote extends EventSource
  
  /* "Local" */ val local: typings.officeDashJs.Excel.EventSource.local with String = js.native
  /* "Remote" */ val remote: typings.officeDashJs.Excel.EventSource.remote with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventSource with String] = js.native
}

