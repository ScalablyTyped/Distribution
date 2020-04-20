package typings.phaser

import typings.phaser.MatterJS._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends _Dependency {
  var name: String
  var range: String
}

object AnonName {
  @scala.inline
  def apply(name: String, range: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

