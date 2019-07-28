package typings.atOracleOraclejet.ojswipeactionsMod

import typings.atOracleOraclejet.Anon_AriaHideActionsDescription
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojswipeactionsMod.ojSwipeActionsNs.ojAction
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwipeActions extends baseComponent[ojSwipeActionsSettableProperties] {
  var onOjAction: (js.Function1[/* event */ ojAction, _]) | Null = js.native
  @JSName("translations")
  var translations_ojSwipeActions: Anon_AriaHideActionsDescription = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAction, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAction, _],
    useCapture: Boolean
  ): Unit = js.native
  def setProperties(properties: ojSwipeActionsSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AriaHideActionsDescription): Unit = js.native
}

