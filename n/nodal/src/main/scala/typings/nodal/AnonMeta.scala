package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeta extends js.Object {
  var data: js.Array[scala.Nothing]
  var meta: AnonCount
}

object AnonMeta {
  @scala.inline
  def apply(data: js.Array[scala.Nothing], meta: AnonCount): AnonMeta = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMeta]
  }
}

