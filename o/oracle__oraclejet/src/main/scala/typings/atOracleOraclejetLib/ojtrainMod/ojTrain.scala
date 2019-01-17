package typings
package atOracleOraclejetLib.ojtrainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTrain
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojTrainSettableProperties] {
  var onOjBeforeDeselect: (js.Function1[/* event */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojBeforeDeselect, _]) | scala.Null = js.native
  var onOjBeforeSelect: (js.Function1[/* event */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojBeforeSelect, _]) | scala.Null = js.native
  var onOjDeselect: (js.Function1[/* event */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojDeselect, _]) | scala.Null = js.native
  var onOjSelect: (js.Function1[/* event */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojSelect, _]) | scala.Null = js.native
  var onSelectedStepChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['selectedStep'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onStepsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['steps'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var selectedStep: java.lang.String = js.native
  var steps: js.Array[atOracleOraclejetLib.ojtrainMod.ojTrainNs.Step] = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedStepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['selectedStep'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedStepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['selectedStep'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['steps'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['steps'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeDeselect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojBeforeDeselect, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeDeselect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojBeforeDeselect, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojBeforeSelect, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojBeforeSelect, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojDeselect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojDeselect, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojDeselect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojDeselect, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSelect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojSelect, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSelect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtrainMod.ojTrainNs.ojSelect, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getNextSelectableStep(): java.lang.String | scala.Null = js.native
  def getPreviousSelectableStep(): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_selectedStep(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedStep): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_steps(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.steps): js.Array[atOracleOraclejetLib.ojtrainMod.ojTrainNs.Step] = js.native
  def getStep(id: java.lang.String): atOracleOraclejetLib.ojtrainMod.ojTrainNs.Step | scala.Null = js.native
  def setProperties(properties: ojTrainSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedStep(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedStep, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_steps(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.steps,
    value: js.Array[atOracleOraclejetLib.ojtrainMod.ojTrainNs.Step]
  ): scala.Unit = js.native
  def updateStep(id: java.lang.String, stepProperties: atOracleOraclejetLib.Anon_DisabledError): scala.Unit = js.native
}

