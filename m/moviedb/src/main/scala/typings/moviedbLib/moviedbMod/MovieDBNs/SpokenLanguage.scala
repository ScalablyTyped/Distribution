package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpokenLanguage extends js.Object {
  var iso_639_1: scala.Double
  var name: java.lang.String
}

object SpokenLanguage {
  @scala.inline
  def apply(iso_639_1: scala.Double, name: java.lang.String): SpokenLanguage = {
    val __obj = js.Dynamic.literal(iso_639_1 = iso_639_1, name = name)
  
    __obj.asInstanceOf[SpokenLanguage]
  }
}

