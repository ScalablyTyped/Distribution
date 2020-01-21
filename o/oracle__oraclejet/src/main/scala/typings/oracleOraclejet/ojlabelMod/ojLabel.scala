package typings.oracleOraclejet.ojlabelMod

import typings.oracleOraclejet.AnonDefinitionSource
import typings.oracleOraclejet.AnonTooltipHelp
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.`for`
import typings.oracleOraclejet.oracleOraclejetStrings.forChanged
import typings.oracleOraclejet.oracleOraclejetStrings.help
import typings.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typings.oracleOraclejet.oracleOraclejetStrings.labelId
import typings.oracleOraclejet.oracleOraclejetStrings.labelIdChanged
import typings.oracleOraclejet.oracleOraclejetStrings.showRequired
import typings.oracleOraclejet.oracleOraclejetStrings.showRequiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLabel extends baseComponent[ojLabelSettableProperties] {
  var `for`: String | Null = js.native
  var help: AnonDefinitionSource = js.native
  var labelId: String | Null = js.native
  var onForChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onHelpChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonDefinitionSource], _]) | Null = js.native
  var onLabelIdChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onShowRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean | Null], _]) | Null = js.native
  var showRequired: Boolean | Null = js.native
  @JSName("translations")
  var translations_ojLabel: AnonTooltipHelp = js.native
  @JSName("addEventListener")
  def addEventListener_forChanged(
    `type`: forChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_forChanged(
    `type`: forChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonDefinitionSource], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonDefinitionSource], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelIdChanged(
    `type`: labelIdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelIdChanged(
    `type`: labelIdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showRequiredChanged(
    `type`: showRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showRequiredChanged(
    `type`: showRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_for(property: `for`): String | Null = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): AnonDefinitionSource = js.native
  @JSName("getProperty")
  def getProperty_labelId(property: labelId): String | Null = js.native
  @JSName("getProperty")
  def getProperty_showRequired(property: showRequired): Boolean | Null = js.native
  def setProperties(properties: ojLabelSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_for(property: `for`): Unit = js.native
  @JSName("setProperty")
  def setProperty_for(property: `for`, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: AnonDefinitionSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: labelId): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: labelId, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: showRequired): Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: showRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonTooltipHelp): Unit = js.native
}

