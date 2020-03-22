package typings.meteorUniverseI18n.mod.i18n

import typings.meteorUniverseI18n.mod.LocateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/universe:i18n", "i18n.setLocale")
@js.native
object setLocale extends js.Object {
  // locale setter / getter
  def apply(locale: String): js.Promise[Unit] = js.native
  def apply(locale: String, params: LocateParams): js.Promise[Unit] = js.native
}

