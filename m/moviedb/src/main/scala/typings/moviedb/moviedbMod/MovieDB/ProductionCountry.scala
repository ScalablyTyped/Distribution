package typings.moviedb.moviedbMod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionCountry extends js.Object {
  var iso_3166_1: Double
  var name: String
}

object ProductionCountry {
  @scala.inline
  def apply(iso_3166_1: Double, name: String): ProductionCountry = {
    val __obj = js.Dynamic.literal(iso_3166_1 = iso_3166_1, name = name)
  
    __obj.asInstanceOf[ProductionCountry]
  }
}

