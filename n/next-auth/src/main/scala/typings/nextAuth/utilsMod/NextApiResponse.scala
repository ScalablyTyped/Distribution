package typings.nextAuth.utilsMod

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextApiResponse[T]
  extends ServerResponse
     with GenericObject {
  
  var json: Send[T] = js.native
  
  var send: Send[T] = js.native
  
  def status(statusCode: Double): NextApiResponse[T] = js.native
}
