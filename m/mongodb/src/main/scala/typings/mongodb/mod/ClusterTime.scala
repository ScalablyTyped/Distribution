package typings.mongodb.mod

import typings.mongodb.anon.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterTime extends StObject {
  
  var clusterTime: typings.bson.mod.Timestamp
  
  var signature: Hash
}
object ClusterTime {
  
  inline def apply(clusterTime: typings.bson.mod.Timestamp, signature: Hash): ClusterTime = {
    val __obj = js.Dynamic.literal(clusterTime = clusterTime.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterTime]
  }
  
  extension [Self <: ClusterTime](x: Self) {
    
    inline def setClusterTime(value: typings.bson.mod.Timestamp): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Hash): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
