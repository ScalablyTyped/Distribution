package typings.moviedb.moviedbMod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoOptions extends js.Object {
  var id: Double
  var language: js.UndefOr[String] = js.undefined
}

object InfoOptions {
  @scala.inline
  def apply(id: Double, language: String = null): InfoOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoOptions]
  }
}

