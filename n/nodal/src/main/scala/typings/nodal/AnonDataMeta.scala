package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataMeta extends js.Object {
  var data: js.Array[scala.Nothing]
  var meta: AnonCount
}

object AnonDataMeta {
  @scala.inline
  def apply(data: js.Array[scala.Nothing], meta: AnonCount): AnonDataMeta = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataMeta]
  }
}

