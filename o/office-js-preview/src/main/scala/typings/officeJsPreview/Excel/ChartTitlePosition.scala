package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTitlePosition extends StObject
/**
  *
  * Represents the position of chart title.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTitlePosition")
@js.native
object ChartTitlePosition extends StObject {
  
  @js.native
  sealed trait automatic extends ChartTitlePosition
  
  @js.native
  sealed trait bottom extends ChartTitlePosition
  
  @js.native
  sealed trait left extends ChartTitlePosition
  
  @js.native
  sealed trait right extends ChartTitlePosition
  
  @js.native
  sealed trait top extends ChartTitlePosition
}
