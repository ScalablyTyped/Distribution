package typings.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RequestContext object facilitates requests to the Word application. Since the Office add-in and the Word application run in two different processes, the request context is required to get access to the Word object model from the add-in.
  */
@JSGlobal("Word.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeJsPreview.Word.RequestContext {
  def this(url: String) = this()
}
