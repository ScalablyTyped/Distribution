package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait all
    extends officeDashJsDashPreviewLib.ExcelNs.ClearApplyTo
  
  /**
           *
           * Clears the contents of the range.
           *
           */
  @js.native
  sealed trait contents
    extends officeDashJsDashPreviewLib.ExcelNs.ClearApplyTo
  
  /**
           *
           * Clears all formatting for the range.
           *
           */
  @js.native
  sealed trait formats
    extends officeDashJsDashPreviewLib.ExcelNs.ClearApplyTo
  
  /**
           *
           * Clears all hyperlinks, but leaves all content and formatting intact.
           *
           */
  @js.native
  sealed trait hyperlinks
    extends officeDashJsDashPreviewLib.ExcelNs.ClearApplyTo
  
  /**
           *
           * Removes hyperlinks and formatting for the cell but leaves content, conditional formats, and data validation intact.
           *
           */
  @js.native
  sealed trait removeHyperlinks
    extends officeDashJsDashPreviewLib.ExcelNs.ClearApplyTo
  
  /* "All" */ val all: all with java.lang.String = js.native
  /* "Contents" */ val contents: contents with java.lang.String = js.native
  /* "Formats" */ val formats: formats with java.lang.String = js.native
  /* "Hyperlinks" */ val hyperlinks: hyperlinks with java.lang.String = js.native
  /* "RemoveHyperlinks" */ val removeHyperlinks: removeHyperlinks with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ClearApplyTo with java.lang.String] = js.native
}

