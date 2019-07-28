package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POptions extends js.Object {
  var cidr: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[js.Array[String]] = js.undefined
}

object POptions {
  @scala.inline
  def apply(cidr: String = null, version: js.Array[String] = null): POptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[POptions]
  }
}

