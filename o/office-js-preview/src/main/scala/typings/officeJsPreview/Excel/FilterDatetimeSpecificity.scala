package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterDatetimeSpecificity extends StObject
/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterDatetimeSpecificity")
@js.native
object FilterDatetimeSpecificity extends StObject {
  
  @js.native
  sealed trait day
    extends StObject
       with FilterDatetimeSpecificity
  
  @js.native
  sealed trait hour
    extends StObject
       with FilterDatetimeSpecificity
  
  @js.native
  sealed trait minute
    extends StObject
       with FilterDatetimeSpecificity
  
  @js.native
  sealed trait month
    extends StObject
       with FilterDatetimeSpecificity
  
  @js.native
  sealed trait second
    extends StObject
       with FilterDatetimeSpecificity
  
  @js.native
  sealed trait year
    extends StObject
       with FilterDatetimeSpecificity
}
