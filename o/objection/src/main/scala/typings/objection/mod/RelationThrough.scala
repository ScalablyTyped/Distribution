package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationThrough extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[Unit] | Unit]
  ] = js.undefined
  var extra: js.UndefOr[js.Array[String] | js.Object] = js.undefined
  var from: String | Reference | (js.Array[String | Reference])
  var modelClass: js.UndefOr[ModelClass[_] | String] = js.undefined
  var to: String | Reference | (js.Array[String | Reference])
}

object RelationThrough {
  @scala.inline
  def apply(
    from: String | Reference | (js.Array[String | Reference]),
    to: String | Reference | (js.Array[String | Reference]),
    beforeInsert: (/* model */ Model, /* context */ QueryContext) => js.Promise[Unit] | Unit = null,
    extra: js.Array[String] | js.Object = null,
    modelClass: ModelClass[_] | String = null
  ): RelationThrough = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2(beforeInsert))
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (modelClass != null) __obj.updateDynamic("modelClass")(modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationThrough]
  }
}

