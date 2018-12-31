package typings
package mongooseDashPaginateLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateResult[T] extends js.Object {
  var docs: js.Array[T]
  var limit: scala.Double
  var offset: js.UndefOr[scala.Double] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pages: js.UndefOr[scala.Double] = js.undefined
  var total: scala.Double
}

