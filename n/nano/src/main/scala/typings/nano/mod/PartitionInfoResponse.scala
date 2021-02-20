package typings.nano.mod

import typings.nano.anon.External
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://docs.couchdb.org/en/latest/partitioned-dbs/index.html
@js.native
trait PartitionInfoResponse extends StObject {
  
  // Database name
  var db_name: String = js.native
  
  // Document count
  var doc_count: Double = js.native
  
  // Deleted document count
  var doc_del_count: Double = js.native
  
  // Partition name
  var partition: String = js.native
  
  // Partition sizes
  var sizes: External = js.native
}
object PartitionInfoResponse {
  
  @scala.inline
  def apply(db_name: String, doc_count: Double, doc_del_count: Double, partition: String, sizes: External): PartitionInfoResponse = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], doc_del_count = doc_del_count.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionInfoResponse]
  }
  
  @scala.inline
  implicit class PartitionInfoResponseMutableBuilder[Self <: PartitionInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb_name(value: String): Self = StObject.set(x, "db_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_del_count(value: Double): Self = StObject.set(x, "doc_del_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: External): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
  }
}
