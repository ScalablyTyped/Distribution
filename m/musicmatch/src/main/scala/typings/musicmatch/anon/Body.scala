package typings.musicmatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: Tracklist
  var header: Available
}

object Body {
  @scala.inline
  def apply(body: Tracklist, header: Available): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

