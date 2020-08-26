package typings.poseCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoserConfig[V]
  extends /* key */ StringDictionary[js.Any] {
  var ancestorValues: js.UndefOr[AncestorValueList[V]] = js.native
  var initialPose: js.UndefOr[String | js.Array[String]] = js.native
  var label: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[OnChangeCallbacks] = js.native
  var parentValues: js.UndefOr[ValueMap[V]] = js.native
  var passive: js.UndefOr[PassiveValueMap] = js.native
  var props: js.UndefOr[Props] = js.native
  var values: js.UndefOr[StringDictionary[V]] = js.native
}

object PoserConfig {
  @scala.inline
  def apply[V](): PoserConfig[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoserConfig[V]]
  }
  @scala.inline
  implicit class PoserConfigOps[Self <: PoserConfig[_], V] (val x: Self with PoserConfig[V]) extends AnyVal {
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
    def setAncestorValuesVarargs(value: AncestorValue[V]*): Self = this.set("ancestorValues", js.Array(value :_*))
    @scala.inline
    def setAncestorValues(value: AncestorValueList[V]): Self = this.set("ancestorValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAncestorValues: Self = this.set("ancestorValues", js.undefined)
    @scala.inline
    def setInitialPoseVarargs(value: String*): Self = this.set("initialPose", js.Array(value :_*))
    @scala.inline
    def setInitialPose(value: String | js.Array[String]): Self = this.set("initialPose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPose: Self = this.set("initialPose", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnChange(value: OnChangeCallbacks): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setParentValues(value: ValueMap[V]): Self = this.set("parentValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentValues: Self = this.set("parentValues", js.undefined)
    @scala.inline
    def setPassive(value: PassiveValueMap): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setValues(value: StringDictionary[V]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

