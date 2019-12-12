package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ClearApplyTo.all
import typings.officeDashJsDashPreview.Excel.ClearApplyTo.contents
import typings.officeDashJsDashPreview.Excel.ClearApplyTo.formats
import typings.officeDashJsDashPreview.Excel.ClearApplyTo.hyperlinks
import typings.officeDashJsDashPreview.Excel.ClearApplyTo.removeHyperlinks
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ClearApplyTo with String] = js.native
  /* "All" */ @js.native
  object all extends TopLevel[all with String]
  
  /* "Contents" */ @js.native
  object contents extends TopLevel[contents with String]
  
  /* "Formats" */ @js.native
  object formats extends TopLevel[formats with String]
  
  /* "Hyperlinks" */ @js.native
  object hyperlinks extends TopLevel[hyperlinks with String]
  
  /* "RemoveHyperlinks" */ @js.native
  object removeHyperlinks extends TopLevel[removeHyperlinks with String]
  
}

