package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
    * Local means event comes from local user session.
    *
    */
  @js.native
  sealed trait local extends EventSource
  
  /**
    * Remote means event comes from remote user session.
    *
    */
  @js.native
  sealed trait remote extends EventSource
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventSource with String] = js.native
  /* "Local" */ @js.native
  object local extends TopLevel[local with String]
  
  /* "Remote" */ @js.native
  object remote extends TopLevel[remote with String]
  
}

