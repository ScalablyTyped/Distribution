package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Database _replicate options.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate} */
trait DatabaseReplicateOptions extends StObject {
  
  /** Cancels the replication */
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /** Configure the replication to be continuous */
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  /** Creates the target database. Required administrator’s privileges on target server. */
  var create_target: js.UndefOr[Boolean] = js.undefined
  
  /** Array of document IDs to be synchronized */
  var doc_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of a filter function. */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Address of a proxy server through which replication should occur (protocol can be “http” or “socks5”) */
  var proxy: js.UndefOr[String] = js.undefined
  
  /** Source database name or URL */
  var source: js.UndefOr[String] = js.undefined
  
  /** Target database name or URL */
  var target: js.UndefOr[String] = js.undefined
}
object DatabaseReplicateOptions {
  
  inline def apply(): DatabaseReplicateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseReplicateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseReplicateOptions] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setCreate_target(value: Boolean): Self = StObject.set(x, "create_target", value.asInstanceOf[js.Any])
    
    inline def setCreate_targetUndefined: Self = StObject.set(x, "create_target", js.undefined)
    
    inline def setDoc_ids(value: js.Array[String]): Self = StObject.set(x, "doc_ids", value.asInstanceOf[js.Any])
    
    inline def setDoc_idsUndefined: Self = StObject.set(x, "doc_ids", js.undefined)
    
    inline def setDoc_idsVarargs(value: String*): Self = StObject.set(x, "doc_ids", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
