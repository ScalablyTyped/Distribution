package typings.oracleOraclejet.ojtrainMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojtrainMod.ojTrain.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtrain.ojTrainSettableProperties> */
trait ojTrainSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var selectedStep: js.UndefOr[String] = js.undefined
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
}

object ojTrainSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    selectedStep: String = null,
    steps: js.Array[Step] = null,
    translations: js.Object = null
  ): ojTrainSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (selectedStep != null) __obj.updateDynamic("selectedStep")(selectedStep.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTrainSettablePropertiesLenient]
  }
}

