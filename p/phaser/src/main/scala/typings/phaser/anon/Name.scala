package typings.phaser.anon

import typings.phaser.MatterJS._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends _Dependency {
  var name: String
  var range: String
}

object Name {
  @scala.inline
  def apply(name: String, range: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

