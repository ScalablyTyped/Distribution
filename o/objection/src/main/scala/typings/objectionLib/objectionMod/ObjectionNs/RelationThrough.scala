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

