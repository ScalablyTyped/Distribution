package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var `0`: String = js.native
  var `1`: String = js.native
  var `2`: String = js.native
  var `3`: String = js.native
  var `4`: String = js.native
  var catchall: Double = js.native
  var disposable: Double = js.native
  var flags: Academichost = js.native
  var invalid: Double = js.native
  var unknown: Double = js.native
  var valid: Double = js.native
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
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set0(value: String): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def set2(value: String): Self = this.set("2", value.asInstanceOf[js.Any])
    @scala.inline
    def set3(value: String): Self = this.set("3", value.asInstanceOf[js.Any])
    @scala.inline
    def set4(value: String): Self = this.set("4", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatchall(value: Double): Self = this.set("catchall", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisposable(value: Double): Self = this.set("disposable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Academichost): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: Double): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Double): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

