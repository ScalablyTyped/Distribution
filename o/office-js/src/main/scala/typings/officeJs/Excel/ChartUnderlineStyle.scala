package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartUnderlineStyle extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartUnderlineStyle")
@js.native
object ChartUnderlineStyle extends StObject {
  
  @js.native
  sealed trait none
    extends StObject
       with ChartUnderlineStyle
  
  @js.native
  sealed trait single
    extends StObject
       with ChartUnderlineStyle
}
