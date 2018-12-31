package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ContentType")
@js.native
object ContentType extends js.Object {
  /**
    *
    * Indicates plain format type of the comment content.
    *
    */
  @js.native
  sealed trait plain
    extends officeDashJsDashPreviewLib.ExcelNs.ContentType
  
  /* "Plain" */ val plain: plain with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ContentType with java.lang.String] = js.native
}

