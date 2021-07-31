package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTextHorizontalAlignment extends StObject
/**
  *
  * Represents the horizontal alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextHorizontalAlignment")
@js.native
object ChartTextHorizontalAlignment extends StObject {
  
  @js.native
  sealed trait center
    extends StObject
       with ChartTextHorizontalAlignment
  
  @js.native
  sealed trait distributed
    extends StObject
       with ChartTextHorizontalAlignment
  
  @js.native
  sealed trait justify
    extends StObject
       with ChartTextHorizontalAlignment
  
  @js.native
  sealed trait left
    extends StObject
       with ChartTextHorizontalAlignment
  
  @js.native
  sealed trait right
    extends StObject
       with ChartTextHorizontalAlignment
}
