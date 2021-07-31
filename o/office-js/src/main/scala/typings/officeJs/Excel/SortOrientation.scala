package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrientation extends StObject
/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOrientation")
@js.native
object SortOrientation extends StObject {
  
  @js.native
  sealed trait columns
    extends StObject
       with SortOrientation
  
  @js.native
  sealed trait rows
    extends StObject
       with SortOrientation
}
