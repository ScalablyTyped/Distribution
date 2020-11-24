package typings.meteorUniverseI18n.mod.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/universe:i18n", "i18n.runWithLocale")
@js.native
object runWithLocale extends js.Object {
  
  // executes function in the locale context,
  // it means that every default locale used inside a called function will be set to a passed locale
  // keep in mind that locale must be loaded first (if it is not bundled)
  def apply[T](locale: String, func: js.Function0[T]): T = js.native
}
