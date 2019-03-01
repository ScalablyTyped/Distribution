package typings
package atOracleOraclejetLib.ojrefresherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRefresher
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojRefresherSettableProperties] {
  var onRefreshContentChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Function0[js.Promise[_]]], 
    _
  ]) | scala.Null = js.native
  var onTargetChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[stdLib.Element], 
    _
  ]) | scala.Null = js.native
  var onTextChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onThresholdChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var target: stdLib.Element = js.native
  var text: java.lang.String = js.native
  var threshold: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_refreshContentChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.refreshContentChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Function0[js.Promise[_]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_refreshContentChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.refreshContentChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Function0[js.Promise[_]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.targetChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[stdLib.Element], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.targetChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[stdLib.Element], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.textChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.textChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_target(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.target): stdLib.Element = js.native
  @JSName("getProperty")
  def getProperty_text(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.text): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_threshold(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.threshold): scala.Double = js.native
  def refreshContent(): js.Promise[_] = js.native
  def setProperties(properties: ojRefresherSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_target(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.target, value: stdLib.Element): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_text(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.text, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_threshold(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.threshold, value: scala.Double): scala.Unit = js.native
}

