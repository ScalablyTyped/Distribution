package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterOn extends StObject
/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOn")
@js.native
object FilterOn extends StObject {
  
  @js.native
  sealed trait bottomItems
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait bottomPercent
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait cellColor
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait custom
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait dynamic
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait fontColor
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait icon
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait topItems
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait topPercent
    extends StObject
       with FilterOn
  
  @js.native
  sealed trait values
    extends StObject
       with FilterOn
}
