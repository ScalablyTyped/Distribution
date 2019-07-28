package typings.nconf.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormat extends js.Object {
  def parse(str: String): js.Any = js.native
  def stringify(obj: js.Any, replacer: js.Any): String = js.native
  def stringify(obj: js.Any, replacer: js.Any, spacing: js.Any): String = js.native
}

