package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationThrough extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[scala.Unit] | scala.Unit]
  ] = js.undefined
  var extra: js.UndefOr[js.Array[java.lang.String] | js.Object] = js.undefined
  var from: java.lang.String | Reference | (js.Array[java.lang.String | Reference])
  var modelClass: js.UndefOr[ModelClass[_] | java.lang.String] = js.undefined
  var to: java.lang.String | Reference | (js.Array[java.lang.String | Reference])
}

object RelationThrough {
  @scala.inline
  def apply(
    from: java.lang.String | Reference | (js.Array[java.lang.String | Reference]),
    to: java.lang.String | Reference | (js.Array[java.lang.String | Reference]),
    beforeInsert: (/* model */ Model, /* context */ QueryContext) => js.Promise[scala.Unit] | scala.Unit = null,
    extra: js.Array[java.lang.String] | js.Object = null,
    modelClass: ModelClass[_] | java.lang.String = null
  ): RelationThrough = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2(beforeInsert))
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (modelClass != null) __obj.updateDynamic("modelClass")(modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationThrough]
  }
}

