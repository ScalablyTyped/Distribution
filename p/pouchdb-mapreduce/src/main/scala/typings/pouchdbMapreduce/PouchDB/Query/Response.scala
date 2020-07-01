package typings.pouchdbMapreduce.PouchDB.Query

import typings.pouchdbMapreduce.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[Content /* <: js.Object */] extends js.Object {
  var offset: Double
  var rows: js.Array[Doc[Content]]
  var total_rows: Double
}

object Response {
  @scala.inline
  def apply[/* <: js.Object */ Content](offset: Double, rows: js.Array[Doc[Content]], total_rows: Double): Response[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[Content]]
  }
}

