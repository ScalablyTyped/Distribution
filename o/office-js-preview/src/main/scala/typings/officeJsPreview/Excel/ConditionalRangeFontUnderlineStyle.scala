package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalRangeFontUnderlineStyle extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeFontUnderlineStyle")
@js.native
object ConditionalRangeFontUnderlineStyle extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait double
    extends StObject
       with ConditionalRangeFontUnderlineStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait none
    extends StObject
       with ConditionalRangeFontUnderlineStyle
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait single
    extends StObject
       with ConditionalRangeFontUnderlineStyle
}
