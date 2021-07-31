package typings.paystack.anon

import typings.paystack.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Charge extends StObject {
  
  def charge(params: Authorizationcode): js.Promise[Response] = js.native
  
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  
  def initialize(params: Name): js.Promise[Response] = js.native
  
  def list(): js.Promise[ResponsedataArrayanyundef] = js.native
  
  def totals(): js.Promise[Response] = js.native
  
  def verify(transReference: String): js.Promise[Response] = js.native
}
