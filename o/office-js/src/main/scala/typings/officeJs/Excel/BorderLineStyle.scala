package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderLineStyle extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderLineStyle")
@js.native
object BorderLineStyle extends StObject {
  
  @js.native
  sealed trait continuous extends BorderLineStyle
  
  @js.native
  sealed trait dash extends BorderLineStyle
  
  @js.native
  sealed trait dashDot extends BorderLineStyle
  
  @js.native
  sealed trait dashDotDot extends BorderLineStyle
  
  @js.native
  sealed trait dot extends BorderLineStyle
  
  @js.native
  sealed trait double extends BorderLineStyle
  
  @js.native
  sealed trait none extends BorderLineStyle
  
  @js.native
  sealed trait slantDashDot extends BorderLineStyle
}
