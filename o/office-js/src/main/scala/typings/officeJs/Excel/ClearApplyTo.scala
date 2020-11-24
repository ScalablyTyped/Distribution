package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Clears the contents of the range.
    *
    */
  @js.native
  sealed trait contents extends ClearApplyTo
  
  /**
    * Clears all formatting for the range.
    *
    */
  @js.native
  sealed trait formats extends ClearApplyTo
  
  /**
    * Clears all hyperlinks, but leaves all content and formatting intact.
    *
    */
  @js.native
  sealed trait hyperlinks extends ClearApplyTo
  
  /**
    * Removes hyperlinks and formatting for the cell but leaves content, conditional formats, and data validation intact.
    *
    */
  @js.native
  sealed trait removeHyperlinks extends ClearApplyTo
}
