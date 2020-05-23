package typings.oracleOraclejet.ojswipeactionsMod

import typings.oracleOraclejet.anon.AriaHideActionsDescription
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSwipeActionsSettableProperties extends baseComponentSettableProperties {
  @JSName("translations")
  var translations_ojSwipeActionsSettableProperties: AriaHideActionsDescription
}

object ojSwipeActionsSettableProperties {
  @scala.inline
  def apply(translations: AriaHideActionsDescription): ojSwipeActionsSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSwipeActionsSettableProperties]
  }
}

