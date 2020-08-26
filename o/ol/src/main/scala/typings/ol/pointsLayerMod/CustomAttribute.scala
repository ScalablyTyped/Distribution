package typings.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAttribute extends js.Object {
  var name: String = js.native
  def callback(p0: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], p1: StringDictionary[js.Any]): Double = js.native
}

object CustomAttribute {
  @scala.inline
  def apply(
    callback: (typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], StringDictionary[js.Any]) => Double,
    name: String
  ): CustomAttribute = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAttribute]
  }
  @scala.inline
  implicit class CustomAttributeOps[Self <: CustomAttribute] (val x: Self) extends AnyVal {
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
    def setCallback(
      value: (typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], StringDictionary[js.Any]) => Double
    ): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

