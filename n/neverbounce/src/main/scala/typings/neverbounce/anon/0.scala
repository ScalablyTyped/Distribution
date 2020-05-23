package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var `0`: String
  var `1`: String
  var `2`: String
  var `3`: String
  var `4`: String
  var catchall: Double
  var disposable: Double
  var flags: Academichost
  var invalid: Double
  var unknown: Double
  var valid: Double
}

object `0` {
  @scala.inline
  def apply(
    `0`: String,
    `1`: String,
    `2`: String,
    `3`: String,
    `4`: String,
    catchall: Double,
    disposable: Double,
    flags: Academichost,
    invalid: Double,
    unknown: Double,
    valid: Double
  ): `0` = {
    val __obj = js.Dynamic.literal(catchall = catchall.asInstanceOf[js.Any], disposable = disposable.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

