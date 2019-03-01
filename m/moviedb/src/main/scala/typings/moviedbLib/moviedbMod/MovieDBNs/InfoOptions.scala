package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoOptions extends js.Object {
  var id: scala.Double
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object InfoOptions {
  @scala.inline
  def apply(id: scala.Double, language: java.lang.String = null): InfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[InfoOptions]
  }
}

