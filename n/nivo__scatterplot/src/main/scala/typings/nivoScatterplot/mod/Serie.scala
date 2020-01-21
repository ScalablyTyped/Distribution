package typings.nivoScatterplot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serie extends js.Object {
  var data: js.Array[Datum]
  var id: String
}

object Serie {
  @scala.inline
  def apply(data: js.Array[Datum], id: String): Serie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Serie]
  }
}

