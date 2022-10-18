package typings.nano.mod

import typings.nano.anon.External
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Partitioned database info response.
  * @see Docs: {@link https://docs.couchdb.org/en/latest/partitioned-dbs/index.html} */
trait PartitionInfoResponse extends StObject {
  
  /** Database name */
  var db_name: String
  
  /** Document count */
  var doc_count: Double
  
  /** Deleted document count */
  var doc_del_count: Double
  
  /** Partition name */
  var partition: String
  
  /** Partition sizes */
  var sizes: External
}
object PartitionInfoResponse {
  
  inline def apply(db_name: String, doc_count: Double, doc_del_count: Double, partition: String, sizes: External): PartitionInfoResponse = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], doc_del_count = doc_del_count.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionInfoResponse]
  }
  
  extension [Self <: PartitionInfoResponse](x: Self) {
    
    inline def setDb_name(value: String): Self = StObject.set(x, "db_name", value.asInstanceOf[js.Any])
    
    inline def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setDoc_del_count(value: Double): Self = StObject.set(x, "doc_del_count", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: External): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
  }
}
