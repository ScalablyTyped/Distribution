package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends js.Object {
  
  def create(params: Amount): js.Promise[Response] = js.native
  
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  
  def list(): js.Promise[Response] = js.native
  
  def update(id: String, params: js.Any): js.Promise[Response] = js.native
  def update(id: Double, params: js.Any): js.Promise[Response] = js.native
}
