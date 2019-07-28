package typings.atNivoVoronoi.atNivoVoronoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiDatum extends js.Object {
  var id: String | Double
  var x: Double
  var y: Double
}

object VoronoiDatum {
  @scala.inline
  def apply(id: String | Double, x: Double, y: Double): VoronoiDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], x = x, y = y)
  
    __obj.asInstanceOf[VoronoiDatum]
  }
}

