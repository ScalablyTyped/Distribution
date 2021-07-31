package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeCopyType extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RangeCopyType")
@js.native
object RangeCopyType extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with RangeCopyType
  
  @js.native
  sealed trait formats
    extends StObject
       with RangeCopyType
  
  @js.native
  sealed trait formulas
    extends StObject
       with RangeCopyType
  
  @js.native
  sealed trait values
    extends StObject
       with RangeCopyType
}
