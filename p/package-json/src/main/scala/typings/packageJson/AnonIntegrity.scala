package typings.packageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntegrity extends js.Object {
  val integrity: js.UndefOr[String] = js.undefined
  val shasum: String
  val tarball: String
}

object AnonIntegrity {
  @scala.inline
  def apply(shasum: String, tarball: String, integrity: String = null): AnonIntegrity = {
    val __obj = js.Dynamic.literal(shasum = shasum.asInstanceOf[js.Any], tarball = tarball.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntegrity]
  }
}

