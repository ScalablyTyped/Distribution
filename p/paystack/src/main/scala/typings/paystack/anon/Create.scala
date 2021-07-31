package typings.paystack.anon

import typings.paystack.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends StObject {
  
  def create(params: Email): js.Promise[Response] = js.native
  
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  
  def list(): js.Promise[ResponsedataArrayanyundef] = js.native
  
  def update(id: String, params: Firstname): js.Promise[Response] = js.native
  def update(id: Double, params: Firstname): js.Promise[Response] = js.native
}
