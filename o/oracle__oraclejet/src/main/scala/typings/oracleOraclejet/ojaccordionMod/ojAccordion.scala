package typings.oracleOraclejet.ojaccordionMod

import typings.oracleOraclejet.anon.DictpropName
import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse
import typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand
import typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse
import typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.multipleChanged
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojAccordion extends baseComponent[ojAccordionSettableProperties] {
  var expanded: js.Array[Id] | Null = js.native
  var multiple: Boolean = js.native
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Id] | Null], _]) | Null = js.native
  var onMultipleChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ ojBeforeCollapse, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ ojBeforeExpand, _]) | Null = js.native
  var onOjCollapse: (js.Function1[/* event */ ojCollapse, _]) | Null = js.native
  var onOjExpand: (js.Function1[/* event */ ojExpand, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Id] | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Id] | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_multipleChanged(
    `type`: multipleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_multipleChanged(
    `type`: multipleChanged,
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
  def getProperty_expanded(property: expanded): js.Array[Id] | Null = js.native
  @JSName("getProperty")
  def getProperty_multiple(property: multiple): Boolean = js.native
  def setProperties(properties: ojAccordionSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: js.Array[Double | Id | String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_multiple(property: multiple, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojaccordion", "ojAccordion")
@js.native
object ojAccordion extends js.Object {
  type ojBeforeCollapse = CustomEvent[DictpropName]
  type ojBeforeExpand = CustomEvent[DictpropName]
  type ojCollapse = CustomEvent[DictpropName]
  type ojExpand = CustomEvent[DictpropName]
}

