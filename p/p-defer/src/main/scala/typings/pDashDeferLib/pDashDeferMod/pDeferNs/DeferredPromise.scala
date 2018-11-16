package typings
package pDashDeferLib.pDashDeferMod.pDeferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredPromise[T] extends js.Object {
  var promise: stdLib.Promise[T] = js.native
  def reject(reason: js.Any): stdLib.Promise[scala.Nothing] = js.native
  def resolve[U](): stdLib.Promise[U] = js.native
  def resolve[U](value: U): stdLib.Promise[U] = js.native
  def resolve[U](value: stdLib.PromiseLike[U]): stdLib.Promise[U] = js.native
}

