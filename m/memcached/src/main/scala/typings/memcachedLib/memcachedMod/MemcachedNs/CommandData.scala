package typings
package memcachedLib.memcachedMod.MemcachedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandData extends js.Object {
  var cas: js.UndefOr[java.lang.String] = js.undefined
  var command: java.lang.String
  var execution: scala.Double
  var key: js.UndefOr[java.lang.String] = js.undefined
  var lifetime: js.UndefOr[scala.Double] = js.undefined
  var redundancyEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var start: scala.Double
  var `type`: java.lang.String
  var validate: js.Array[js.Tuple2[java.lang.String, js.Function1[/* repeated */_, _]]]
  var value: js.UndefOr[js.Any] = js.undefined
  def callback(args: js.Any*): js.Any
}

