package typings.platform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Architecture extends js.Object {
  var architecture: js.UndefOr[Double] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Architecture {
  @scala.inline
  def apply(
    toString: () => String,
    architecture: Int | Double = null,
    family: String = null,
    version: String = null
  ): Anon_Architecture = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Architecture]
  }
}

