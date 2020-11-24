package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pollyjs/core", "PollyServer")
@js.native
class PollyServer () extends js.Object {
  
  def any(): RouteHandler = js.native
  def any(routes: String): RouteHandler = js.native
  def any(routes: js.Array[String]): RouteHandler = js.native
  
  def delete(): RouteHandler = js.native
  def delete(routes: String): RouteHandler = js.native
  def delete(routes: js.Array[String]): RouteHandler = js.native
  
  def get(): RouteHandler = js.native
  def get(routes: String): RouteHandler = js.native
  def get(routes: js.Array[String]): RouteHandler = js.native
  
  def head(): RouteHandler = js.native
  def head(routes: String): RouteHandler = js.native
  def head(routes: js.Array[String]): RouteHandler = js.native
  
  def host(host: String, callback: js.Function0[Unit]): Unit = js.native
  
  def merge(): RouteHandler = js.native
  def merge(routes: String): RouteHandler = js.native
  def merge(routes: js.Array[String]): RouteHandler = js.native
  
  def namespace(path: String, callback: js.Function0[Unit]): Unit = js.native
  
  def options(): RouteHandler = js.native
  def options(routes: String): RouteHandler = js.native
  def options(routes: js.Array[String]): RouteHandler = js.native
  
  def patch(): RouteHandler = js.native
  def patch(routes: String): RouteHandler = js.native
  def patch(routes: js.Array[String]): RouteHandler = js.native
  
  def post(): RouteHandler = js.native
  def post(routes: String): RouteHandler = js.native
  def post(routes: js.Array[String]): RouteHandler = js.native
  
  def put(): RouteHandler = js.native
  def put(routes: String): RouteHandler = js.native
  def put(routes: js.Array[String]): RouteHandler = js.native
  
  def timeout(ms: Double): js.Promise[Unit] = js.native
}
