package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var `for`: js.UndefOr[String] = js.undefined
  var name: String
  var version: String
  def install(): Unit
}

object Plugin {
  @scala.inline
  def apply(install: () => Unit, name: String, version: String, `for`: String = null): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction0(install), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

