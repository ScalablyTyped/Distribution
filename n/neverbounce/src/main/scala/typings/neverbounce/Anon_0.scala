package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var `0`: String
  var `1`: String
  var `2`: String
  var `3`: String
  var `4`: String
  var catchall: Double
  var disposable: Double
  var flags: Anon_Academichost
  var invalid: Double
  var unknown: Double
  var valid: Double
}

object Anon_0 {
  @scala.inline
  def apply(
    `0`: String,
    `1`: String,
    `2`: String,
    `3`: String,
    `4`: String,
    catchall: Double,
    disposable: Double,
    flags: Anon_Academichost,
    invalid: Double,
    unknown: Double,
    valid: Double
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(catchall = catchall, disposable = disposable, flags = flags, invalid = invalid, unknown = unknown, valid = valid)
    __obj.updateDynamic("0")(`0`)
    __obj.updateDynamic("1")(`1`)
    __obj.updateDynamic("2")(`2`)
    __obj.updateDynamic("3")(`3`)
    __obj.updateDynamic("4")(`4`)
    __obj.asInstanceOf[Anon_0]
  }
}

