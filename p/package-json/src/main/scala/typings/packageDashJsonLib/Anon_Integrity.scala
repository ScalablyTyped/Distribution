package typings
package packageDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Integrity extends js.Object {
  val integrity: js.UndefOr[java.lang.String] = js.undefined
  val shasum: java.lang.String
  val tarball: java.lang.String
}

object Anon_Integrity {
  @scala.inline
  def apply(shasum: java.lang.String, tarball: java.lang.String, integrity: java.lang.String = null): Anon_Integrity = {
    val __obj = js.Dynamic.literal(shasum = shasum, tarball = tarball)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    __obj.asInstanceOf[Anon_Integrity]
  }
}

