package typings.packageDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Integrity extends js.Object {
  val integrity: js.UndefOr[String] = js.undefined
  val shasum: String
  val tarball: String
}

object Anon_Integrity {
  @scala.inline
  def apply(shasum: String, tarball: String, integrity: String = null): Anon_Integrity = {
    val __obj = js.Dynamic.literal(shasum = shasum, tarball = tarball)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    __obj.asInstanceOf[Anon_Integrity]
  }
}

