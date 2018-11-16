package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[T] extends js.Object {
  var filter: js.UndefOr[pDashEventLib.FilterFn[T]] = js.undefined
  var multiArgs: js.UndefOr[scala.Boolean] = js.undefined
  var rejectionEvents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

