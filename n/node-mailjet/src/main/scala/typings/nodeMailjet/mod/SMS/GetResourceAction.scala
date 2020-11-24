package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceAction extends js.Object {
  
  def id(value: String): GetResourceActionId = js.native
  
  def request(): js.Promise[GetResponseAction] = js.native
  def request(params: GetParams): js.Promise[GetResponseAction] = js.native
}
