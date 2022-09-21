package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Placement extends StObject
/**
  * Specifies the way that an object is attached to its underlying cells.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends StObject {
  
  /**
    * The object is free floating.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait absolute
    extends StObject
       with Placement
  
  /**
    * The object is moved and sized with the cells.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait oneCell
    extends StObject
       with Placement
  
  /**
    * The object is moved with the cells.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait twoCell
    extends StObject
       with Placement
}
