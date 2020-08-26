package typings.nodegit.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/config", "ConfigEntry")
@js.native
class ConfigEntry () extends js.Object {
  // the documentation says those are variables,
  // but in reality they are functions
  def level(): Double = js.native
  def name(): Double = js.native
  def value(): String = js.native
}

