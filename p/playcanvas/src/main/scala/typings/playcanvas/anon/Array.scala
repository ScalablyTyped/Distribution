package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.asset
import typings.playcanvas.playcanvasStrings.boolean
import typings.playcanvas.playcanvasStrings.curve
import typings.playcanvas.playcanvasStrings.entity
import typings.playcanvas.playcanvasStrings.json
import typings.playcanvas.playcanvasStrings.number
import typings.playcanvas.playcanvasStrings.rgb
import typings.playcanvas.playcanvasStrings.rgba
import typings.playcanvas.playcanvasStrings.string
import typings.playcanvas.playcanvasStrings.vec2
import typings.playcanvas.playcanvasStrings.vec3
import typings.playcanvas.playcanvasStrings.vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var array: js.UndefOr[Boolean] = js.native
  var assetType: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var curves: js.UndefOr[js.Array[String]] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var enum: js.UndefOr[js.Array[js.Object]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var placeholder: js.UndefOr[String | js.Array[String]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve = js.native
}

object Array {
  @scala.inline
  def apply(
    `type`: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve
  ): Array = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
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
    def setType(value: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setAssetType(value: String): Self = this.set("assetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCurvesVarargs(value: String*): Self = this.set("curves", js.Array(value :_*))
    @scala.inline
    def setCurves(value: js.Array[String]): Self = this.set("curves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurves: Self = this.set("curves", js.undefined)
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnumVarargs(value: js.Object*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[js.Object]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPlaceholderVarargs(value: String*): Self = this.set("placeholder", js.Array(value :_*))
    @scala.inline
    def setPlaceholder(value: String | js.Array[String]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

