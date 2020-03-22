package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationJoin extends js.Object {
  var from: RelationMappingColumnRef
  var through: js.UndefOr[RelationThrough[_]] = js.undefined
  var to: RelationMappingColumnRef
}

object RelationJoin {
  @scala.inline
  def apply(from: RelationMappingColumnRef, to: RelationMappingColumnRef, through: RelationThrough[_] = null): RelationJoin = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (through != null) __obj.updateDynamic("through")(through.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationJoin]
  }
}

