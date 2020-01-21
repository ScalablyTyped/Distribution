package typings.phaser

import typings.phaser.MatterJS._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameVersion extends _Dependency {
  var name: String
  var version: String
}

object AnonNameVersion {
  @scala.inline
  def apply(name: String, version: String): AnonNameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameVersion]
  }
}

