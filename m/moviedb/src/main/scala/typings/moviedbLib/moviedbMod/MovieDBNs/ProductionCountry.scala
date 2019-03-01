package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionCountry extends js.Object {
  var iso_3166_1: scala.Double
  var name: java.lang.String
}

object ProductionCountry {
  @scala.inline
  def apply(iso_3166_1: scala.Double, name: java.lang.String): ProductionCountry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iso_3166_1")(iso_3166_1)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ProductionCountry]
  }
}

