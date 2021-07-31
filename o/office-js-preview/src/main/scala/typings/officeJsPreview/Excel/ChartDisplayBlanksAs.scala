package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartDisplayBlanksAs extends StObject
/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartDisplayBlanksAs")
@js.native
object ChartDisplayBlanksAs extends StObject {
  
  @js.native
  sealed trait interplotted
    extends StObject
       with ChartDisplayBlanksAs
  
  @js.native
  sealed trait notPlotted
    extends StObject
       with ChartDisplayBlanksAs
  
  @js.native
  sealed trait zero
    extends StObject
       with ChartDisplayBlanksAs
}
