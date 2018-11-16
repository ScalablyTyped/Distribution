package typings
package officeDashJsLib.ExcelNs

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
  sealed trait local
    extends officeDashJsLib.ExcelNs.EventSource
  
  /**
           *
           * Remote means event comes from remote user session.
           *
           */
  @js.native
  sealed trait remote
    extends officeDashJsLib.ExcelNs.EventSource
  
  /* "Local" */ val local: local with java.lang.String = js.native
  /* "Remote" */ val remote: remote with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.EventSource with java.lang.String] = js.native
}

