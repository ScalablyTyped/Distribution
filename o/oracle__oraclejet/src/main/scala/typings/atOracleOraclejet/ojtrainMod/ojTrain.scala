package typings.atOracleOraclejet.ojtrainMod

import typings.atOracleOraclejet.Anon_DisabledError
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectedStep
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectedStepChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.steps
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepsChanged
import typings.atOracleOraclejet.ojtrainMod.ojTrainNs.Step
import typings.atOracleOraclejet.ojtrainMod.ojTrainNs.ojBeforeDeselect
import typings.atOracleOraclejet.ojtrainMod.ojTrainNs.ojBeforeSelect
import typings.atOracleOraclejet.ojtrainMod.ojTrainNs.ojDeselect
import typings.atOracleOraclejet.ojtrainMod.ojTrainNs.ojSelect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTrain extends baseComponent[ojTrainSettableProperties] {
  var onOjBeforeDeselect: (js.Function1[/* event */ ojBeforeDeselect, _]) | Null = js.native
  var onOjBeforeSelect: (js.Function1[/* event */ ojBeforeSelect, _]) | Null = js.native
  var onOjDeselect: (js.Function1[/* event */ ojDeselect, _]) | Null = js.native
  var onOjSelect: (js.Function1[/* event */ ojSelect, _]) | Null = js.native
  var onSelectedStepChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onStepsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Step]], _]) | Null = js.native
  var selectedStep: String = js.native
  var steps: js.Array[Step] = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeDeselect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeDeselect, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeSelect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeSelect, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDeselect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDeselect, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSelect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSelect, _],
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
  def setProperties(properties: ojTrainSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedStep(property: selectedStep, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_steps(property: steps, value: js.Array[Step]): Unit = js.native
  def updateStep(id: String, stepProperties: Anon_DisabledError): Unit = js.native
}

