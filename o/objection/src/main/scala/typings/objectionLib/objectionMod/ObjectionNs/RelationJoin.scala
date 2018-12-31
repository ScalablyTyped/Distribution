package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationJoin extends js.Object {
  var from: java.lang.String | Reference | (js.Array[java.lang.String | Reference])
  var through: js.UndefOr[RelationThrough] = js.undefined
  var to: java.lang.String | Reference | (js.Array[java.lang.String | Reference])
}

