package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var data: js.Array[scala.Nothing]
  var meta: Count
}

object Meta {
  @scala.inline
  def apply(data: js.Array[scala.Nothing], meta: Count): Meta = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

