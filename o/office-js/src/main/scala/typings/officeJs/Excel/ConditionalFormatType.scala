package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  sealed trait cellValue extends ConditionalFormatType
  
  @js.native
  sealed trait colorScale extends ConditionalFormatType
  
  @js.native
  sealed trait containsText extends ConditionalFormatType
  
  @js.native
  sealed trait custom extends ConditionalFormatType
  
  @js.native
  sealed trait dataBar extends ConditionalFormatType
  
  @js.native
  sealed trait iconSet extends ConditionalFormatType
  
  @js.native
  sealed trait presetCriteria extends ConditionalFormatType
  
  @js.native
  sealed trait topBottom extends ConditionalFormatType
}
