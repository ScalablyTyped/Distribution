package typings.oracleOraclejet.ojtrainMod

import typings.oracleOraclejet.anon.MessageType
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojtrainMod.ojTrain.Step
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeDeselect
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typings.oracleOraclejet.oracleOraclejetStrings.ojDeselect
import typings.oracleOraclejet.oracleOraclejetStrings.ojSelect
import typings.oracleOraclejet.oracleOraclejetStrings.selectedStep
import typings.oracleOraclejet.oracleOraclejetStrings.selectedStepChanged
import typings.oracleOraclejet.oracleOraclejetStrings.steps
import typings.oracleOraclejet.oracleOraclejetStrings.stepsChanged
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTrain_ extends baseComponent[ojTrainSettableProperties] {
  
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: ojSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: ojSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStepChanged(
    `type`: selectedStepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStepChanged(
    `type`: selectedStepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepsChanged(
    `type`: stepsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Step]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepsChanged(
    `type`: stepsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Step]], _],
    useCapture: Boolean
  ): Unit = js.native
  
  def getNextSelectableStep(): String | Null = js.native
  
  def getPreviousSelectableStep(): String | Null = js.native
  
  @JSName("getProperty")
  def getProperty_selectedStep(property: selectedStep): String = js.native
  @JSName("getProperty")
  def getProperty_steps(property: steps): js.Array[Step] = js.native
  
  def getStep(id: String): Step | Null = js.native
  
  var onOjBeforeDeselect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect, _]) | Null = js.native
  
  var onOjBeforeSelect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect, _]) | Null = js.native
  
  var onOjDeselect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect, _]) | Null = js.native
  
  var onOjSelect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect, _]) | Null = js.native
  
  var onSelectedStepChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  var onStepsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Step]], _]) | Null = js.native
  
  var selectedStep: String = js.native
  
  def setProperties(properties: ojTrainSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_selectedStep(property: selectedStep, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_steps(property: steps, value: js.Array[Step]): Unit = js.native
  
  var steps: js.Array[Step] = js.native
  
  def updateStep(id: String, stepProperties: MessageType): Unit = js.native
}
