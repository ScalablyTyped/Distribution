package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClearApplyTo extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ClearApplyTo")
@js.native
object ClearApplyTo extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait all
    extends StObject
       with ClearApplyTo
  
  /**
    * Clears the contents of the range.
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait contents
    extends StObject
       with ClearApplyTo
  
  /**
    * Clears all formatting for the range.
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait formats
    extends StObject
       with ClearApplyTo
  
  /**
    * Clears all hyperlinks, but leaves all content and formatting intact.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait hyperlinks
    extends StObject
       with ClearApplyTo
  
  /**
    * Removes hyperlinks and formatting for the cell but leaves content, conditional formats, and data validation intact.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait removeHyperlinks
    extends StObject
       with ClearApplyTo
}
