package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardDirection extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.13]
  */
@JSGlobal("Excel.KeyboardDirection")
@js.native
object KeyboardDirection extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  @js.native
  sealed trait down
    extends StObject
       with KeyboardDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  @js.native
  sealed trait left
    extends StObject
       with KeyboardDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  @js.native
  sealed trait right
    extends StObject
       with KeyboardDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  @js.native
  sealed trait up
    extends StObject
       with KeyboardDirection
}
