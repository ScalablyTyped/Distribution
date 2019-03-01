package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Genre extends js.Object {
  var id: scala.Double
  var name: java.lang.String
}

object Genre {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String): Genre = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Genre]
  }
}

