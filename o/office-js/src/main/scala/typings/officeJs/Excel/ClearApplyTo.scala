package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClearApplyTo extends StObject
/**
  * [Api set: ExcelApi 1.1 for All/Formats/Contents, 1.7 for Hyperlinks & HyperlinksAndFormats.]
  */
@JSGlobal("Excel.ClearApplyTo")
@js.native
object ClearApplyTo extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with ClearApplyTo
  
  /**
    * Clears the contents of the range.
    *
    */
  @js.native
  sealed trait contents
    extends StObject
       with ClearApplyTo
  
  /**
    * Clears all formatting for the range.
    *
    */
  @js.native
  sealed trait formats
    extends StObject
       with ClearApplyTo
  
  /**
    * Clears all hyperlinks, but leaves all content and formatting intact.
    *
    */
  @js.native
  sealed trait hyperlinks
    extends StObject
       with ClearApplyTo
  
  /**
    * Removes hyperlinks and formatting for the cell but leaves content, conditional formats, and data validation intact.
    *
    */
  @js.native
  sealed trait removeHyperlinks
    extends StObject
       with ClearApplyTo
}
