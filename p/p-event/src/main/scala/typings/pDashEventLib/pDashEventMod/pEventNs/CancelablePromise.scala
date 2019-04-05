package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelablePromise[ResolveType]
  extends stdLib.Promise[ResolveType] {
  def cancel(): scala.Unit = js.native
}

