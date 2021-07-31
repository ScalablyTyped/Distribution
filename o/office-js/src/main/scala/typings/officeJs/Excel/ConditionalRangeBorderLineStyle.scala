package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalRangeBorderLineStyle extends StObject
/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeBorderLineStyle")
@js.native
object ConditionalRangeBorderLineStyle extends StObject {
  
  @js.native
  sealed trait continuous
    extends StObject
       with ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dash
    extends StObject
       with ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dashDot
    extends StObject
       with ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dashDotDot
    extends StObject
       with ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dot
    extends StObject
       with ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait none
    extends StObject
       with ConditionalRangeBorderLineStyle
}
