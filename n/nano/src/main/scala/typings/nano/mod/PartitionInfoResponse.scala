package typings.nano.mod

import typings.nano.AnonExternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://docs.couchdb.org/en/latest/partitioned-dbs/index.html
trait PartitionInfoResponse extends js.Object {
  // Database name
  var db_name: String
  // Document count
  var doc_count: Double
  // Deleted document count
  var doc_del_count: Double
  // Partition name
  var partition: String
  // Partition sizes
  var sizes: AnonExternal
}

object PartitionInfoResponse {
  @scala.inline
  def apply(db_name: String, doc_count: Double, doc_del_count: Double, partition: String, sizes: AnonExternal): PartitionInfoResponse = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], doc_del_count = doc_del_count.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionInfoResponse]
  }
}

