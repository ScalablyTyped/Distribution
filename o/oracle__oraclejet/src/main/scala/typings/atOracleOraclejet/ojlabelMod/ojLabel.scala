package typings.atOracleOraclejet.ojlabelMod

import typings.atOracleOraclejet.Anon_DefinitionSource
import typings.atOracleOraclejet.Anon_TooltipHelp
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.`for`
import typings.atOracleOraclejet.atOracleOraclejetStrings.forChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.help
import typings.atOracleOraclejet.atOracleOraclejetStrings.helpChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelId
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelIdChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.showRequired
import typings.atOracleOraclejet.atOracleOraclejetStrings.showRequiredChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLabel extends baseComponent[ojLabelSettableProperties] {
  var `for`: String | Null = js.native
  var help: Anon_DefinitionSource = js.native
  var labelId: String | Null = js.native
  var onForChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onHelpChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_DefinitionSource], _]) | Null = js.native
  var onLabelIdChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onShowRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean | Null], _]) | Null = js.native
  var showRequired: Boolean | Null = js.native
  @JSName("translations")
  var translations_ojLabel: Anon_TooltipHelp = js.native
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_DefinitionSource], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_DefinitionSource], _],
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
  def getProperty_help(property: help): Anon_DefinitionSource = js.native
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
  def setProperty_help(property: help, value: Anon_DefinitionSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: labelId): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: labelId, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: showRequired): Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: showRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_TooltipHelp): Unit = js.native
}

