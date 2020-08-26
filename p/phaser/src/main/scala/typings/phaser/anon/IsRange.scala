package typings.phaser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsRange extends js.Object {
  var isRange: Boolean = js.native
  var number: Double = js.native
  var operator: String = js.native
  var parts: js.Array[Double] = js.native
  var prerelease: String = js.native
  var range: String = js.native
  var version: String = js.native
}

object IsRange {
  @scala.inline
  def apply(
    isRange: Boolean,
    number: Double,
    operator: String,
    parts: js.Array[Double],
    prerelease: String,
    range: String,
    version: String
  ): IsRange = {
    val __obj = js.Dynamic.literal(isRange = isRange.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRange]
  }
  @scala.inline
  implicit class IsRangeOps[Self <: IsRange] (val x: Self) extends AnyVal {
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
    def setIsRange(value: Boolean): Self = this.set("isRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartsVarargs(value: Double*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[Double]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

