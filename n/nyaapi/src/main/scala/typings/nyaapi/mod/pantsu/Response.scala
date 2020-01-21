package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: js.Array[T]
  var infos: js.Array[String]
  var ok: Boolean
}

object Response {
  @scala.inline
  def apply[T](data: js.Array[T], infos: js.Array[String], ok: Boolean): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response[T]]
  }
}

