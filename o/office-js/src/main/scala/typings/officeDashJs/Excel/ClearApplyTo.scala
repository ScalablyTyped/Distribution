package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClearApplyTo extends js.Object

/**
  * [Api set: ExcelApi 1.1 for All/Formats/Contents, 1.7 for Hyperlinks & HyperlinksAndFormats.]
  */
@JSGlobal("Excel.ClearApplyTo")
@js.native
object ClearApplyTo extends js.Object {
  @js.native
  sealed trait all extends ClearApplyTo
  
  /**
    *
    * Clears the contents of the range.
    *
    */
  @js.native
  sealed trait contents extends ClearApplyTo
  
  /**
    *
    * Clears all formatting for the range.
    *
    */
  @js.native
  sealed trait formats extends ClearApplyTo
  
  /**
    *
    * Clears all hyperlinks, but leaves all content and formatting intact.
    *
    */
  @js.native
  sealed trait hyperlinks extends ClearApplyTo
  
  /**
    *
    * Removes hyperlinks and formatting for the cell but leaves content, conditional formats, and data validation intact.
    *
    */
  @js.native
  sealed trait removeHyperlinks extends ClearApplyTo
  
  /* "All" */ val all: typings.officeDashJs.Excel.ClearApplyTo.all with String = js.native
  /* "Contents" */ val contents: typings.officeDashJs.Excel.ClearApplyTo.contents with String = js.native
  /* "Formats" */ val formats: typings.officeDashJs.Excel.ClearApplyTo.formats with String = js.native
  /* "Hyperlinks" */ val hyperlinks: typings.officeDashJs.Excel.ClearApplyTo.hyperlinks with String = js.native
  /* "RemoveHyperlinks" */ val removeHyperlinks: typings.officeDashJs.Excel.ClearApplyTo.removeHyperlinks with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ClearApplyTo with String] = js.native
}

