package typings.atOracleOraclejet.ojrefresherMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.refreshContentChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.target
import typings.atOracleOraclejet.atOracleOraclejetStrings.targetChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.text
import typings.atOracleOraclejet.atOracleOraclejetStrings.textChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.threshold
import typings.atOracleOraclejet.atOracleOraclejetStrings.thresholdChanged
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRefresher extends baseComponent[ojRefresherSettableProperties] {
  var onRefreshContentChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Function0[js.Promise[_]]], _]) | Null = js.native
  var onTargetChanged: (js.Function1[/* event */ JetElementCustomEvent[Element], _]) | Null = js.native
  var onTextChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var target: Element = js.native
  var text: String = js.native
  var threshold: Double = js.native
  @JSName("addEventListener")
  def addEventListener_refreshContentChanged(
    `type`: refreshContentChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function0[js.Promise[_]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_refreshContentChanged(
    `type`: refreshContentChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function0[js.Promise[_]]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetChanged(
    `type`: targetChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Element], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetChanged(
    `type`: targetChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Element], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(
    `type`: textChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(
    `type`: textChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdChanged(
    `type`: thresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdChanged(
    `type`: thresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_target(property: target): Element = js.native
  @JSName("getProperty")
  def getProperty_text(property: text): String = js.native
  @JSName("getProperty")
  def getProperty_threshold(property: threshold): Double = js.native
  def refreshContent(): js.Promise[_] = js.native
  def setProperties(properties: ojRefresherSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_target(property: target, value: Element): Unit = js.native
  @JSName("setProperty")
  def setProperty_text(property: text, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_threshold(property: threshold, value: Double): Unit = js.native
}

