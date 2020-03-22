package typings.oracleOraclejet.ojcollapsibleMod

import typings.oracleOraclejet.AnonHeader
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse
import typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand
import typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse
import typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typings.oracleOraclejet.oracleOraclejetStrings.expandArea
import typings.oracleOraclejet.oracleOraclejetStrings.expandAreaChanged
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.header
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCollapsible extends baseComponent[ojCollapsibleSettableProperties] {
  var disabled: Boolean = js.native
  var expandArea: header | disclosureIcon = js.native
  var expanded: Boolean = js.native
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onExpandAreaChanged: (js.Function1[/* event */ JetElementCustomEvent[header | disclosureIcon], _]) | Null = js.native
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ ojBeforeCollapse, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ ojBeforeExpand, _]) | Null = js.native
  var onOjCollapse: (js.Function1[/* event */ ojCollapse, _]) | Null = js.native
  var onOjExpand: (js.Function1[/* event */ ojExpand, _]) | Null = js.native
  def addEventListener(
    `type`: expandAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[header | disclosureIcon], _]
  ): Unit = js.native
  def addEventListener(
    `type`: expandAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[header | disclosureIcon], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_expandArea(property: expandArea): header | disclosureIcon = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): Boolean = js.native
  def setProperties(properties: ojCollapsibleSettablePropertiesLenient): Unit = js.native
  def setProperty(property: expandArea, value: disclosureIcon): Unit = js.native
  def setProperty(property: expandArea, value: header): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcollapsible", "ojCollapsible")
@js.native
object ojCollapsible extends js.Object {
  type ojBeforeCollapse = CustomEvent[AnonHeader]
  type ojBeforeExpand = CustomEvent[AnonHeader]
  type ojCollapse = CustomEvent[AnonHeader]
  type ojExpand = CustomEvent[AnonHeader]
}

