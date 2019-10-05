package typings.atOracleOraclejet.ojaccordionMod

import typings.atOracleOraclejet.Anon_FromCollapsible
import typings.atOracleOraclejet.Anon_Id
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.expanded
import typings.atOracleOraclejet.atOracleOraclejetStrings.expandedChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.multipleChanged
import typings.atOracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse
import typings.atOracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand
import typings.atOracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse
import typings.atOracleOraclejet.ojaccordionMod.ojAccordion.ojExpand
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojAccordion extends baseComponent[ojAccordionSettableProperties] {
  var expanded: js.Array[Anon_Id] | Null = js.native
  var multiple: Boolean = js.native
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Anon_Id] | Null], _]) | Null = js.native
  var onMultipleChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ ojBeforeCollapse, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ ojBeforeExpand, _]) | Null = js.native
  var onOjCollapse: (js.Function1[/* event */ ojCollapse, _]) | Null = js.native
  var onOjExpand: (js.Function1[/* event */ ojExpand, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Anon_Id] | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Anon_Id] | Null], _],
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
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): js.Array[Anon_Id] | Null = js.native
  @JSName("getProperty")
  def getProperty_multiple(property: multiple): Boolean = js.native
  def setProperties(properties: ojAccordionSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: js.Array[Anon_Id | Double | String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_multiple(property: multiple, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojaccordion", "ojAccordion")
@js.native
object ojAccordion extends js.Object {
  type ojBeforeCollapse = CustomEvent[Anon_FromCollapsible]
  type ojBeforeExpand = CustomEvent[Anon_FromCollapsible]
  type ojCollapse = CustomEvent[Anon_FromCollapsible]
  type ojExpand = CustomEvent[Anon_FromCollapsible]
}

