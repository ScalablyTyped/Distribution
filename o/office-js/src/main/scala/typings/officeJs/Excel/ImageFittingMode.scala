package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageFittingMode extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.ImageFittingMode")
@js.native
object ImageFittingMode extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait fill
    extends StObject
       with ImageFittingMode
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait fit
    extends StObject
       with ImageFittingMode
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait fitAndCenter
    extends StObject
       with ImageFittingMode
}
