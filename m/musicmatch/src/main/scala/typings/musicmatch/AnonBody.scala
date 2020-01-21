package typings.musicmatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: AnonTracklist
  var header: AnonAvailable
}

object AnonBody {
  @scala.inline
  def apply(body: AnonTracklist, header: AnonAvailable): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

