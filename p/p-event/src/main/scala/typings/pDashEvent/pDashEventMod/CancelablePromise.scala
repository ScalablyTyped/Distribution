package typings.pDashEvent.pDashEventMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelablePromise[ResolveType] extends Promise[ResolveType] {
  def cancel(): Unit = js.native
}

