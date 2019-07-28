package typings.moviedb.moviedbMod.MovieDBNs

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
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[Genre]
  }
}

