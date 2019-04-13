package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationJoin extends js.Object {
  var from: java.lang.String | Reference | (js.Array[java.lang.String | Reference])
  var through: js.UndefOr[RelationThrough] = js.undefined
  var to: java.lang.String | Reference | (js.Array[java.lang.String | Reference])
}

object RelationJoin {
  @scala.inline
  def apply(
    from: java.lang.String | Reference | (js.Array[java.lang.String | Reference]),
    to: java.lang.String | Reference | (js.Array[java.lang.String | Reference]),
    through: RelationThrough = null
  ): RelationJoin = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (through != null) __obj.updateDynamic("through")(through)
    __obj.asInstanceOf[RelationJoin]
  }
}

