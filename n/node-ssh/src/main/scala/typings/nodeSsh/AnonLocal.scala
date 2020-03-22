package typings.nodeSsh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocal extends js.Object {
  var local: String
  var remote: String
}

object AnonLocal {
  @scala.inline
  def apply(local: String, remote: String): AnonLocal = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocal]
  }
}

