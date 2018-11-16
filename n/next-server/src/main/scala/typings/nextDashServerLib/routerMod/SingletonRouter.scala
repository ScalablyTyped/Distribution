package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingletonRouter[Q] extends RouterProps[Q] {
  var readyCallbacks: js.Array[RouterCallback] = js.native
  var router: RouterProps[Q] | scala.Null = js.native
  def ready(cb: RouterCallback): scala.Unit = js.native
}

