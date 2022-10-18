package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockedErrorCellValueSubType extends StObject
/**
  * Represents types of #BLOCKED! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.BlockedErrorCellValueSubType")
@js.native
object BlockedErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by privacy settings. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait dataTypePrivacySetting
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An error caused by a service not supporting a linked data type. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait dataTypeRestrictedDomain
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An error caused by an unsupported data type. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait dataTypeUnsupportedApp
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An error caused by external links. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait externalLinksGeneric
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An error caused by a license verification failure. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait noLicense
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An error caused by disabled rich data links. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait richDataLinkDisabled
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An error caused by sign in failure. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait signInError
    extends StObject
       with BlockedErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #BLOCKED! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with BlockedErrorCellValueSubType
}
