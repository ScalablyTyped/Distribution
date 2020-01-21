package typings.pouchdbMapreduce.PouchDB.Query

import typings.pouchdbMapreduce.AnonDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[Content /* <: js.Object */] extends js.Object {
  var offset: Double
  var rows: js.Array[AnonDoc[Content]]
  var total_rows: Double
}

object Response {
  @scala.inline
  def apply[Content /* <: js.Object */](offset: Double, rows: js.Array[AnonDoc[Content]], total_rows: Double): Response[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response[Content]]
  }
}

