package typings.meteorUniverseI18n.mod.i18n

import typings.meteorUniverseI18n.mod.TranslaterOptions
import typings.meteorUniverseI18n.mod.Translator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/universe:i18n", "i18n.createTranslator")
@js.native
object createTranslator extends js.Object {
  // translator functions
  def apply(namespace: String): Translator = js.native
  def apply(namespace: String, options: TranslaterOptions): Translator = js.native
}

