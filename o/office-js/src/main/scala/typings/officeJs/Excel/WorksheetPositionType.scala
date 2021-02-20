package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorksheetPositionType extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetPositionType")
@js.native
object WorksheetPositionType extends StObject {
  
  @js.native
  sealed trait after extends WorksheetPositionType
  
  @js.native
  sealed trait before extends WorksheetPositionType
  
  @js.native
  sealed trait beginning extends WorksheetPositionType
  
  @js.native
  sealed trait end extends WorksheetPositionType
  
  @js.native
  sealed trait none extends WorksheetPositionType
}
