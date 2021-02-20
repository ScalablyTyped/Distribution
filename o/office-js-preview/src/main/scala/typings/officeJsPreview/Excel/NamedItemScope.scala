package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NamedItemScope extends StObject
/**
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.NamedItemScope")
@js.native
object NamedItemScope extends StObject {
  
  @js.native
  sealed trait workbook extends NamedItemScope
  
  @js.native
  sealed trait worksheet extends NamedItemScope
}
