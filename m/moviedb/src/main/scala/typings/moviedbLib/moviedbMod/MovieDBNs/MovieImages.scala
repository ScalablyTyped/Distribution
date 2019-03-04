package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieImages extends js.Object {
  var backdrops: js.Array[MovieImage]
  var id: scala.Double
  var posters: js.Array[MovieImage]
}

object MovieImages {
  @scala.inline
  def apply(backdrops: js.Array[MovieImage], id: scala.Double, posters: js.Array[MovieImage]): MovieImages = {
    val __obj = js.Dynamic.literal(backdrops = backdrops, id = id, posters = posters)
  
    __obj.asInstanceOf[MovieImages]
  }
}

