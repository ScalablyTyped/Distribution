package typings
package mongooseDashPaginateDashV2Lib.mongooseDashPaginateDashV2Mod.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateResult[T]
  extends /* customLabel */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[T] | scala.Double]] {
  var docs: js.Array[T]
  var limit: scala.Double
  var offset: js.UndefOr[scala.Double] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pages: js.UndefOr[scala.Double] = js.undefined
  var total: scala.Double
}

