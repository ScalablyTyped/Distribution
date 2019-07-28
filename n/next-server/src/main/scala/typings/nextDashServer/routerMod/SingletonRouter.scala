package typings.nextDashServer.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingletonRouter[Q] extends RouterProps[Q] {
  var readyCallbacks: js.Array[RouterCallback] = js.native
  var router: RouterProps[Q] | Null = js.native
  def ready(cb: RouterCallback): Unit = js.native
}

