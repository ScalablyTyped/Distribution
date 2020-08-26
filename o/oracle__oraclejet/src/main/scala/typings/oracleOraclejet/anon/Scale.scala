package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.oracleOraclejet.oracleOraclejetStrings.days
import typings.oracleOraclejet.oracleOraclejetStrings.hours
import typings.oracleOraclejet.oracleOraclejetStrings.minutes
import typings.oracleOraclejet.oracleOraclejetStrings.months
import typings.oracleOraclejet.oracleOraclejetStrings.quarters
import typings.oracleOraclejet.oracleOraclejetStrings.seconds
import typings.oracleOraclejet.oracleOraclejetStrings.weeks
import typings.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale extends js.Object {
  var converter: js.UndefOr[Converters | typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  var zoomOrder: js.UndefOr[js.Array[String]] = js.native
}

object Scale {
  @scala.inline
  def apply(scale: seconds | minutes | hours | days | weeks | months | quarters | years): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
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
    def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setConverter(value: Converters | typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setZoomOrderVarargs(value: String*): Self = this.set("zoomOrder", js.Array(value :_*))
    @scala.inline
    def setZoomOrder(value: js.Array[String]): Self = this.set("zoomOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOrder: Self = this.set("zoomOrder", js.undefined)
  }
  
}

