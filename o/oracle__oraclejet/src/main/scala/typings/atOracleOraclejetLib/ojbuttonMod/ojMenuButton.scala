package typings
package atOracleOraclejetLib.ojbuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenuButton extends ojButton[ojMenuButtonSettableProperties] {
  @JSName("onChromingChanged")
  var onChromingChanged_ojMenuButton: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['chroming'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onDisabledChanged")
  var onDisabledChanged_ojMenuButton: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['disabled'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onDisplayChanged")
  var onDisplayChanged_ojMenuButton: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['display'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAction")
  var onOjAction_ojMenuButton: (js.Function1[/* event */ atOracleOraclejetLib.ojbuttonMod.ojMenuButtonNs.ojAction, _]) | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabledChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['disabled'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabledChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['disabled'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def setProperties(properties: ojMenuButtonSettablePropertiesLenient): scala.Unit = js.native
}

