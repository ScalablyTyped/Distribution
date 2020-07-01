package typings.objection.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationThrough[M /* <: Model */] extends js.Object {
  var beforeInsert: js.UndefOr[RelationMappingHook[M]] = js.undefined
  var extra: js.UndefOr[String | js.Array[String] | (Record[String, String])] = js.undefined
  var from: RelationMappingColumnRef
  var modelClass: js.UndefOr[ModelClassSpecifier] = js.undefined
  var to: RelationMappingColumnRef
}

object RelationThrough {
  @scala.inline
  def apply[/* <: typings.objection.mod.Model */ M](
    from: RelationMappingColumnRef,
    to: RelationMappingColumnRef,
    beforeInsert: (M, /* context */ QueryContext) => js.Promise[Unit] | Unit = null,
    extra: String | js.Array[String] | (Record[String, String]) = null,
    modelClass: ModelClassSpecifier = null
  ): RelationThrough[M] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2(beforeInsert))
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (modelClass != null) __obj.updateDynamic("modelClass")(modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationThrough[M]]
  }
}

