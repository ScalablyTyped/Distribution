package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Achievement extends js.Object {
  var achieved: Boolean
  var name: String
}

object Achievement {
  @scala.inline
  def apply(achieved: Boolean, name: String): Achievement = {
    val __obj = js.Dynamic.literal(achieved = achieved.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Achievement]
  }
}

