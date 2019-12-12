package typings.mongodb.mongodbMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayOperator[Type] extends js.Object {
  @JSName("$each")
  var $each: Type = js.native
  @JSName("$position")
  var $position: js.UndefOr[scala.Double] = js.native
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double] = js.native
  @JSName("$sort")
  var $sort: js.UndefOr[SortValues | (Record[String, SortValues])] = js.native
}

