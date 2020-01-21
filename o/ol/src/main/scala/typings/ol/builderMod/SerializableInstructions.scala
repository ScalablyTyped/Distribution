package typings.ol.builderMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.canvasMod.FillState
import typings.ol.canvasMod.StrokeState
import typings.ol.canvasMod.TextState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableInstructions extends js.Object {
  var coordinates: js.Array[Double]
  var fillStates: js.UndefOr[StringDictionary[FillState]] = js.undefined
  var hitDetectionInstructions: js.Array[_]
  var instructions: js.Array[_]
  var strokeStates: js.UndefOr[StringDictionary[StrokeState]] = js.undefined
  var textStates: js.UndefOr[StringDictionary[TextState]] = js.undefined
}

object SerializableInstructions {
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    hitDetectionInstructions: js.Array[_],
    instructions: js.Array[_],
    fillStates: StringDictionary[FillState] = null,
    strokeStates: StringDictionary[StrokeState] = null,
    textStates: StringDictionary[TextState] = null
  ): SerializableInstructions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
    if (fillStates != null) __obj.updateDynamic("fillStates")(fillStates.asInstanceOf[js.Any])
    if (strokeStates != null) __obj.updateDynamic("strokeStates")(strokeStates.asInstanceOf[js.Any])
    if (textStates != null) __obj.updateDynamic("textStates")(textStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableInstructions]
  }
}

