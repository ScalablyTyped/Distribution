package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionCompany extends js.Object {
  var id: scala.Double
  var name: java.lang.String
}

object ProductionCompany {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String): ProductionCompany = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ProductionCompany]
  }
}

