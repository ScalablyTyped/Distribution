package typings
package platformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Architecture extends js.Object {
  var architecture: js.UndefOr[scala.Double] = js.undefined
  var family: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Architecture {
  @scala.inline
  def apply(
    toString: js.Function0[java.lang.String],
    architecture: scala.Int | scala.Double = null,
    family: java.lang.String = null,
    version: java.lang.String = null
  ): Anon_Architecture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toString")(toString)
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Architecture]
  }
}

