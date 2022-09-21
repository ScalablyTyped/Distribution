package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalDataBarDirection extends StObject
/**
  * Represents the data bar direction within a cell.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarDirection")
@js.native
object ConditionalDataBarDirection extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait context
    extends StObject
       with ConditionalDataBarDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait leftToRight
    extends StObject
       with ConditionalDataBarDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  @js.native
  sealed trait rightToLeft
    extends StObject
       with ConditionalDataBarDirection
}
