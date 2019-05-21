package typings
package nodemailerLib.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveHostnameValue extends js.Object {
  var _cached: js.UndefOr[nodemailerLib.nodemailerLibNumbers.`true`] = js.undefined
  var host: java.lang.String
  var servername: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`
}

object ResolveHostnameValue {
  @scala.inline
  def apply(
    host: java.lang.String,
    servername: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`,
    _cached: nodemailerLib.nodemailerLibNumbers.`true` = null
  ): ResolveHostnameValue = {
    val __obj = js.Dynamic.literal(host = host, servername = servername.asInstanceOf[js.Any])
    if (_cached != null) __obj.updateDynamic("_cached")(_cached)
    __obj.asInstanceOf[ResolveHostnameValue]
  }
}

