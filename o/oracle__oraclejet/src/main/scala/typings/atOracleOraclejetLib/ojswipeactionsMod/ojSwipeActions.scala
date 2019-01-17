package typings
package atOracleOraclejetLib.ojswipeactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwipeActions
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojSwipeActionsSettableProperties] {
  var onOjAction: (js.Function1[/* event */ atOracleOraclejetLib.ojswipeactionsMod.ojSwipeActionsNs.ojAction, _]) | scala.Null = js.native
  @JSName("translations")
  var translations_ojSwipeActions: atOracleOraclejetLib.Anon_AriaHideActionsDescription = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAction,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojswipeactionsMod.ojSwipeActionsNs.ojAction, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAction,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojswipeactionsMod.ojSwipeActionsNs.ojAction, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def setProperties(properties: ojSwipeActionsSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_AriaHideActionsDescription
  ): scala.Unit = js.native
}

