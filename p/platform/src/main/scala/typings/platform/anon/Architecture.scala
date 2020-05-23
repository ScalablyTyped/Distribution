package typings.platform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Architecture extends js.Object {
  var architecture: js.UndefOr[Double] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Architecture {
  @scala.inline
  def apply(architecture: js.UndefOr[Double] = js.undefined, family: String = null, version: String = null): Architecture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(architecture)) __obj.updateDynamic("architecture")(architecture.get.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
}

