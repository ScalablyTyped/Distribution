package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var query: java.lang.String
}

object SearchOptions {
  @scala.inline
  def apply(query: java.lang.String, language: java.lang.String = null): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[SearchOptions]
  }
}

