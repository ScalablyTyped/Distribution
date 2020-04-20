package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Genre extends js.Object {
  var id: Double
  var name: String
}

object Genre {
  @scala.inline
  def apply(id: Double, name: String): Genre = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
}

