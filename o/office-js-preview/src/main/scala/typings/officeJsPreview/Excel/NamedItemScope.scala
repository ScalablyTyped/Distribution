package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NamedItemScope extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.NamedItemScope")
@js.native
object NamedItemScope extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  @js.native
  sealed trait workbook
    extends StObject
       with NamedItemScope
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  @js.native
  sealed trait worksheet
    extends StObject
       with NamedItemScope
}
