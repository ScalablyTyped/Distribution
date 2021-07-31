package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostResource extends StObject {
  
  def action(action: String): PostResource = js.native
  
  def request(): js.Promise[ExportResponse] = js.native
  def request(params: ExportParams): js.Promise[ExportResponse] = js.native
  def request(params: SendParams): js.Promise[SendResponse] = js.native
}
