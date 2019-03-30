package typings
package atNivoVoronoiLib.atNivoVoronoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiDatum extends js.Object {
  var id: java.lang.String | scala.Double
  var x: scala.Double
  var y: scala.Double
}

object VoronoiDatum {
  @scala.inline
  def apply(id: java.lang.String | scala.Double, x: scala.Double, y: scala.Double): VoronoiDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], x = x, y = y)
  
    __obj.asInstanceOf[VoronoiDatum]
  }
}

