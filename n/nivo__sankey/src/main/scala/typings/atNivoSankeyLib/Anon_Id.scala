package typings
package atNivoSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var label: java.lang.String | scala.Double
}

object Anon_Id {
  @scala.inline
  def apply(label: java.lang.String | scala.Double, id: java.lang.String | scala.Double = null): Anon_Id = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

