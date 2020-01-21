package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationJoin extends js.Object {
  var from: String | Reference | (js.Array[String | Reference])
  var through: js.UndefOr[RelationThrough] = js.undefined
  var to: String | Reference | (js.Array[String | Reference])
}

object RelationJoin {
  @scala.inline
  def apply(
    from: String | Reference | (js.Array[String | Reference]),
    to: String | Reference | (js.Array[String | Reference]),
    through: RelationThrough = null
  ): RelationJoin = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (through != null) __obj.updateDynamic("through")(through.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationJoin]
  }
}

