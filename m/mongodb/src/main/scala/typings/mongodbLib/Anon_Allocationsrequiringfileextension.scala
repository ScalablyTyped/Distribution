package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allocationsrequiringfileextension extends js.Object {
  var `allocations requiring file extension`: scala.Double
  var `blocks allocated`: scala.Double
  var `blocks freed`: scala.Double
  var `checkpoint size`: scala.Double
  var `file allocation unit size`: scala.Double
  var `file bytes available for reuse`: scala.Double
  var `file magic number`: scala.Double
  var `file major version number`: scala.Double
  var `file size in bytes`: scala.Double
  var `minor version number`: scala.Double
}

object Anon_Allocationsrequiringfileextension {
  @scala.inline
  def apply(
    `allocations requiring file extension`: scala.Double,
    `blocks allocated`: scala.Double,
    `blocks freed`: scala.Double,
    `checkpoint size`: scala.Double,
    `file allocation unit size`: scala.Double,
    `file bytes available for reuse`: scala.Double,
    `file magic number`: scala.Double,
    `file major version number`: scala.Double,
    `file size in bytes`: scala.Double,
    `minor version number`: scala.Double
  ): Anon_Allocationsrequiringfileextension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allocations requiring file extension")(`allocations requiring file extension`)
    __obj.updateDynamic("blocks allocated")(`blocks allocated`)
    __obj.updateDynamic("blocks freed")(`blocks freed`)
    __obj.updateDynamic("checkpoint size")(`checkpoint size`)
    __obj.updateDynamic("file allocation unit size")(`file allocation unit size`)
    __obj.updateDynamic("file bytes available for reuse")(`file bytes available for reuse`)
    __obj.updateDynamic("file magic number")(`file magic number`)
    __obj.updateDynamic("file major version number")(`file major version number`)
    __obj.updateDynamic("file size in bytes")(`file size in bytes`)
    __obj.updateDynamic("minor version number")(`minor version number`)
    __obj.asInstanceOf[Anon_Allocationsrequiringfileextension]
  }
}

