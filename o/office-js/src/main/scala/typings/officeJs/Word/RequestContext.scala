package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RequestContext object facilitates requests to the Word application. Since the Office add-in and the Word application run in two different processes, the request context is required to get access to the Word object model from the add-in.
  */
@js.native
trait RequestContext
  extends StObject
     with ClientRequestContext {
  
  val application: Application = js.native
  
  val document: Document = js.native
}
