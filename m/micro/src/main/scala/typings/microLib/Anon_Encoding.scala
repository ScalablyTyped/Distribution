package typings
package microLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: java.lang.String = null, limit: java.lang.String | scala.Double = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

