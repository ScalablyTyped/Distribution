package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectErrorCellValueSubType extends StObject
/**
  * Represents types of #CONNECT! errors.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ConnectErrorCellValueSubType")
@js.native
object ConnectErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by no service connection for linked data types. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait dataTypeNoConnection
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an issue in the service for linked data types. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait dataTypeServiceError
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an issue with the external links. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinks
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by a failure to access external links. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksAccessFailed
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by external links failing to refresh. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksFailedToRefresh
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an external link to a file which exceeds file size capacity. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksFileTooLarge
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an invalid request while resolving an external link. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksInvalidRequest
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an external link to a non-cloud location, such as a link to an Excel file that is saved to a local computer instead of to a cloud location. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksNonCloudLocation
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by a server error while resolving an external link. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksServerError
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by throttling from an external link host. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksThrottledByHost
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by a lack of authentication for external links. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksUnAuthenticated
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an error returned from the server. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait genericServerError
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by missing content. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait missingContent
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by an outdated linked entity. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait outdatedLinkedEntity
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by request throttling. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait requestThrottle
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An error caused by a problem with the service. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait serviceError
    extends StObject
       with ConnectErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #CONNECT! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ConnectErrorCellValueSubType
}
