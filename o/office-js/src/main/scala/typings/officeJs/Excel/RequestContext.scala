package typings.officeJs.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RequestContext object facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the request context is required to get access to the Excel object model from the add-in.
  */
@js.native
trait RequestContext
  extends StObject
     with ClientRequestContext {
  
  val application: Application = js.native
  
  /**
    * [Api set: ExcelApi 1.5]
    */
  val runtime: Runtime = js.native
  
  val workbook: Workbook = js.native
}
