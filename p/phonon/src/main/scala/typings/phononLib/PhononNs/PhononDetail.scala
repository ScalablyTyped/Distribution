package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDetail extends js.Object {
  var page: java.lang.String
  var req: js.Array[java.lang.String]
}

object PhononDetail {
  @scala.inline
  def apply(page: java.lang.String, req: js.Array[java.lang.String]): PhononDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("req")(req)
    __obj.asInstanceOf[PhononDetail]
  }
}

