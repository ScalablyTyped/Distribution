package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkedDataTypeState extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.LinkedDataTypeState")
@js.native
object LinkedDataTypeState extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait brokenLinkedData
    extends StObject
       with LinkedDataTypeState
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait disambiguationNeeded
    extends StObject
       with LinkedDataTypeState
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fetchingData
    extends StObject
       with LinkedDataTypeState
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait none
    extends StObject
       with LinkedDataTypeState
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait validLinkedData
    extends StObject
       with LinkedDataTypeState
}
