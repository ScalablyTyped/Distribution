package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TopBottomSelectionType extends StObject
/**
  *
  * A simple enum for Top/Bottom filters to select whether to filter by the top N or bottom N percent, number, or sum of values.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.TopBottomSelectionType")
@js.native
object TopBottomSelectionType extends StObject {
  
  /**
    * Filter the top/bottom N number of items as measured by the chosen value.
    *
    */
  @js.native
  sealed trait items
    extends StObject
       with TopBottomSelectionType
  
  /**
    * Filter the top/bottom N percent of items as measured by the chosen value.
    *
    */
  @js.native
  sealed trait percent
    extends StObject
       with TopBottomSelectionType
  
  /**
    * Filter the top/bottom N sum as measured by the chosen value.
    *
    */
  @js.native
  sealed trait sum
    extends StObject
       with TopBottomSelectionType
}
