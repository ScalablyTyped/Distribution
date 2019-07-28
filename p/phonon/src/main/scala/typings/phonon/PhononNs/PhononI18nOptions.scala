package typings.phonon.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononI18nOptions extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var localeFallback: js.UndefOr[String] = js.undefined
  var localePreferred: js.UndefOr[String] = js.undefined
}

object PhononI18nOptions {
  @scala.inline
  def apply(directory: String = null, localeFallback: String = null, localePreferred: String = null): PhononI18nOptions = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (localeFallback != null) __obj.updateDynamic("localeFallback")(localeFallback)
    if (localePreferred != null) __obj.updateDynamic("localePreferred")(localePreferred)
    __obj.asInstanceOf[PhononI18nOptions]
  }
}

