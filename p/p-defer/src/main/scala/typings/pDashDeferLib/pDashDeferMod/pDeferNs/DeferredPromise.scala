package typings
package pDashDeferLib.pDashDeferMod.pDeferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredPromise[T] extends js.Object {
  var promise: stdLib.Promise[T] = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def resolve(value: stdLib.PromiseLike[T]): scala.Unit = js.native
}

