package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDetail extends js.Object {
  var page: String
  var req: js.Array[String]
}

object PhononDetail {
  @scala.inline
  def apply(page: String, req: js.Array[String]): PhononDetail = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDetail]
  }
}

