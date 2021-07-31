package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTickLabelAlignment extends StObject
/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTickLabelAlignment")
@js.native
object ChartTickLabelAlignment extends StObject {
  
  @js.native
  sealed trait center
    extends StObject
       with ChartTickLabelAlignment
  
  @js.native
  sealed trait left
    extends StObject
       with ChartTickLabelAlignment
  
  @js.native
  sealed trait right
    extends StObject
       with ChartTickLabelAlignment
}
