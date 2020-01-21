package typings.platform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchitecture extends js.Object {
  var architecture: js.UndefOr[Double] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object AnonArchitecture {
  @scala.inline
  def apply(architecture: Int | Double = null, family: String = null, version: String = null): AnonArchitecture = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArchitecture]
  }
}

