package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotAxis extends js.Object
/**
  *
  * Represents the axis from which to get the PivotItems.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends js.Object {
  
  /**
    * The column axis.
    *
    */
  @js.native
  sealed trait column extends PivotAxis
  
  /**
    * The data axis.
    *
    */
  @js.native
  sealed trait data extends PivotAxis
  
  /**
    * The filter axis.
    *
    */
  @js.native
  sealed trait filter extends PivotAxis
  
  /**
    * The row axis.
    *
    */
  @js.native
  sealed trait row extends PivotAxis
  
  /**
    * The axis or region is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends PivotAxis
}
