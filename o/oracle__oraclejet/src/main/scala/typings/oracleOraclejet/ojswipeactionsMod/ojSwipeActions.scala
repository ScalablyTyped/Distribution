package typings.oracleOraclejet.ojswipeactionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaHideActionsDescription
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.ojAction
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSwipeActions extends baseComponent[ojSwipeActionsSettableProperties] {
  
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: ojAction,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojswipeactionsMod.ojSwipeActions.ojAction, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: ojAction,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojswipeactionsMod.ojSwipeActions.ojAction, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  
  var onOjAction: (js.Function1[/* event */ typings.oracleOraclejet.ojswipeactionsMod.ojSwipeActions.ojAction, _]) | Null = js.native
  
  def setProperties(properties: ojSwipeActionsSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AriaHideActionsDescription): Unit = js.native
  
  @JSName("translations")
  var translations_ojSwipeActions: AriaHideActionsDescription = js.native
}
@JSImport("@oracle/oraclejet/ojswipeactions", "ojSwipeActions")
@js.native
object ojSwipeActions extends js.Object {
  
  type ojAction = CustomEvent[StringDictionary[js.Any]]
}
