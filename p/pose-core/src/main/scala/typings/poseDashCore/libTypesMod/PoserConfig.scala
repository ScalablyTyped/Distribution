package typings.poseDashCore.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoserConfig[V]
  extends /* key */ StringDictionary[js.Any] {
  var ancestorValues: js.UndefOr[AncestorValueList[V]] = js.undefined
  var initialPose: js.UndefOr[String | js.Array[String]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[OnChangeCallbacks] = js.undefined
  var parentValues: js.UndefOr[ValueMap[V]] = js.undefined
  var passive: js.UndefOr[PassiveValueMap] = js.undefined
  var props: js.UndefOr[Props] = js.undefined
  var values: js.UndefOr[StringDictionary[V]] = js.undefined
}

object PoserConfig {
  @scala.inline
  def apply[V](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    ancestorValues: AncestorValueList[V] = null,
    initialPose: String | js.Array[String] = null,
    label: String = null,
    onChange: OnChangeCallbacks = null,
    parentValues: ValueMap[V] = null,
    passive: PassiveValueMap = null,
    props: Props = null,
    values: StringDictionary[V] = null
  ): PoserConfig[V] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ancestorValues != null) __obj.updateDynamic("ancestorValues")(ancestorValues.asInstanceOf[js.Any])
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (parentValues != null) __obj.updateDynamic("parentValues")(parentValues.asInstanceOf[js.Any])
    if (passive != null) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoserConfig[V]]
  }
}

