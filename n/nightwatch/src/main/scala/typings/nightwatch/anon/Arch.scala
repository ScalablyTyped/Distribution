package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arch extends js.Object {
  var arch: String
  var name: String
  var version: String
}

object Arch {
  @scala.inline
  def apply(arch: String, name: String, version: String): Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arch]
  }
}

