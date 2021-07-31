package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatType extends StObject
/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatType")
@js.native
object ConditionalFormatType extends StObject {
  
  @js.native
  sealed trait cellValue
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait colorScale
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait containsText
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait custom
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait dataBar
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait iconSet
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait presetCriteria
    extends StObject
       with ConditionalFormatType
  
  @js.native
  sealed trait topBottom
    extends StObject
       with ConditionalFormatType
}
