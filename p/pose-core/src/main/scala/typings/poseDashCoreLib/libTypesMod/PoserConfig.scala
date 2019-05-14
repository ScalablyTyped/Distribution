package typings
package poseDashCoreLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoserConfig[V]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ancestorValues: js.UndefOr[AncestorValueList[V]] = js.undefined
  var initialPose: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[OnChangeCallbacks] = js.undefined
  var parentValues: js.UndefOr[ValueMap[V]] = js.undefined
  var passive: js.UndefOr[PassiveValueMap] = js.undefined
  var props: js.UndefOr[Props] = js.undefined
  var values: js.UndefOr[org.scalablytyped.runtime.StringDictionary[V]] = js.undefined
}

object PoserConfig {
  @scala.inline
  def apply[V](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ancestorValues: AncestorValueList[V] = null,
    initialPose: java.lang.String | js.Array[java.lang.String] = null,
    label: java.lang.String = null,
    onChange: OnChangeCallbacks = null,
    parentValues: ValueMap[V] = null,
    passive: PassiveValueMap = null,
    props: Props = null,
    values: org.scalablytyped.runtime.StringDictionary[V] = null
  ): PoserConfig[V] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ancestorValues != null) __obj.updateDynamic("ancestorValues")(ancestorValues)
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (parentValues != null) __obj.updateDynamic("parentValues")(parentValues)
    if (passive != null) __obj.updateDynamic("passive")(passive)
    if (props != null) __obj.updateDynamic("props")(props)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[PoserConfig[V]]
  }
}

