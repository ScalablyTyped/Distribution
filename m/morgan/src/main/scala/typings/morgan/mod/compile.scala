package typings.morgan.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("morgan", "compile")
@js.native
object compile extends js.Object {
  
  /**
    * Compile a format string in token notation into a format function.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: String): FormatFn[Request, Response] = js.native
}
