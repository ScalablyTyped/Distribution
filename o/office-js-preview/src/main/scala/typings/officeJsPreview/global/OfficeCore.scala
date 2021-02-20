package typings.officeJsPreview.global

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import typings.officeJsPreview.OfficeExtension.RequestUrlAndHeaderInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
///////////////// End OfficeExtension runtime //////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////// Begin OfficeCore ////////////////////////
////////////////////////////////////////////////////////////////
object OfficeCore {
  
  @JSGlobal("OfficeCore.RequestContext")
  @js.native
  class RequestContext () extends ClientRequestContext {
    def this(url: String) = this()
    def this(url: js.Any) = this()
    def this(url: RequestUrlAndHeaderInfo) = this()
  }
}
