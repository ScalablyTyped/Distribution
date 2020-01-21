package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowHiddenChangeType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.RowHiddenChangeType")
@js.native
object RowHiddenChangeType extends js.Object {
  /**
    *
    * Hidden indicates the row is hidden.
    *
    */
  @js.native
  sealed trait hidden extends RowHiddenChangeType
  
  /**
    *
    * Unhidden indicates the row is not hidden.
    *
    */
  @js.native
  sealed trait unhidden extends RowHiddenChangeType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowHiddenChangeType with String] = js.native
  /* "Hidden" */ @js.native
  object hidden extends TopLevel[hidden with String]
  
  /* "Unhidden" */ @js.native
  object unhidden extends TopLevel[unhidden with String]
  
}

