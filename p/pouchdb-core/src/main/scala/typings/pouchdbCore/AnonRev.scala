package typings.pouchdbCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRev extends js.Object {
  var rev: String
}

object AnonRev {
  @scala.inline
  def apply(rev: String): AnonRev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRev]
  }
}

