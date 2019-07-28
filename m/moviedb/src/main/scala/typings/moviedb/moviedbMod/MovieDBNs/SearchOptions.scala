package typings.moviedb.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var query: String
}

object SearchOptions {
  @scala.inline
  def apply(query: String, language: String = null): SearchOptions = {
    val __obj = js.Dynamic.literal(query = query)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[SearchOptions]
  }
}

