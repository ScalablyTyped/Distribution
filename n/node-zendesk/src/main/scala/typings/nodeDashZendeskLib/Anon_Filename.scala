package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: java.lang.String
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Filename {
  @scala.inline
  def apply(filename: java.lang.String, token: java.lang.String = null): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Filename]
  }
}

