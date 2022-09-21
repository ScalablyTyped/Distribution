package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTriggerSource extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.EventTriggerSource")
@js.native
object EventTriggerSource extends StObject {
  
  /**
    * The event is triggered by the Office JS API of the current add-in.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait thisLocalAddin
    extends StObject
       with EventTriggerSource
  
  /**
    * The event trigger source is unknown or currently unsupported.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with EventTriggerSource
}
