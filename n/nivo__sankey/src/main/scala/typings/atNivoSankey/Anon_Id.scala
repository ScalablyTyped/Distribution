package typings.atNivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var label: String | Double
}

object Anon_Id {
  @scala.inline
  def apply(label: String | Double, id: String | Double = null): Anon_Id = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

