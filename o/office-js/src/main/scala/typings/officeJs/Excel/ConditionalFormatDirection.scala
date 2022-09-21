package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatDirection extends StObject
/**
  * Represents the direction for a selection.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatDirection")
@js.native
object ConditionalFormatDirection extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait bottom
    extends StObject
       with ConditionalFormatDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait top
    extends StObject
       with ConditionalFormatDirection
}
