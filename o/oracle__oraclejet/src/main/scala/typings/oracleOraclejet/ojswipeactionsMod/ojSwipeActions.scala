package typings.oracleOraclejet.ojswipeactionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonAriaHideActionsDescription
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojswipeactionsMod.ojSwipeActions.ojAction
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwipeActions extends baseComponent[ojSwipeActionsSettableProperties] {
  var onOjAction: (js.Function1[/* event */ ojAction, _]) | Null = js.native
  @JSName("translations")
  var translations_ojSwipeActions: AnonAriaHideActionsDescription = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAction, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAction, _],
    useCapture: Boolean
  ): Unit = js.native
  def setProperties(properties: ojSwipeActionsSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAriaHideActionsDescription): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojswipeactions", "ojSwipeActions")
@js.native
object ojSwipeActions extends js.Object {
  type ojAction = CustomEvent[StringDictionary[js.Any]]
}

