package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RequestContext object facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the request context is required to get access to the PowerPoint object model from the add-in.
  */
@js.native
trait RequestContext
  extends StObject
     with ClientRequestContext {
  
  val application: Application = js.native
  
  val presentation: Presentation = js.native
}
