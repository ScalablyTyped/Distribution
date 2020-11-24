package typings.ol.executorMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.canvasMod.FillState
import typings.ol.canvasMod.StrokeState
import typings.ol.canvasMod.TextState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializableInstructions extends js.Object {
  
  var coordinates: js.Array[Double] = js.native
  
  var fillStates: StringDictionary[FillState] = js.native
  
  var hitDetectionInstructions: js.Array[_] = js.native
  
  var instructions: js.Array[_] = js.native
  
  var strokeStates: StringDictionary[StrokeState] = js.native
  
  var textStates: StringDictionary[TextState] = js.native
}
object SerializableInstructions {
  
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    fillStates: StringDictionary[FillState],
    hitDetectionInstructions: js.Array[_],
    instructions: js.Array[_],
    strokeStates: StringDictionary[StrokeState],
    textStates: StringDictionary[TextState]
  ): SerializableInstructions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], fillStates = fillStates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], strokeStates = strokeStates.asInstanceOf[js.Any], textStates = textStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableInstructions]
  }
  
  @scala.inline
  implicit class SerializableInstructionsOps[Self <: SerializableInstructions] (val x: Self) extends AnyVal {
    
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
    def setCoordinatesVarargs(value: Double*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[Double]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillStates(value: StringDictionary[FillState]): Self = this.set("fillStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitDetectionInstructionsVarargs(value: js.Any*): Self = this.set("hitDetectionInstructions", js.Array(value :_*))
    
    @scala.inline
    def setHitDetectionInstructions(value: js.Array[_]): Self = this.set("hitDetectionInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsVarargs(value: js.Any*): Self = this.set("instructions", js.Array(value :_*))
    
    @scala.inline
    def setInstructions(value: js.Array[_]): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStates(value: StringDictionary[StrokeState]): Self = this.set("strokeStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStates(value: StringDictionary[TextState]): Self = this.set("textStates", value.asInstanceOf[js.Any])
  }
}
