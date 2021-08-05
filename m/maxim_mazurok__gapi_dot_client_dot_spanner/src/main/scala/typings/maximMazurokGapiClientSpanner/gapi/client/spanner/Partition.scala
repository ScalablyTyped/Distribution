package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partition extends StObject {
  
  /** This token can be passed to Read, StreamingRead, ExecuteSql, or ExecuteStreamingSql requests to restrict the results to those identified by this partition token. */
  var partitionToken: js.UndefOr[String] = js.undefined
}
object Partition {
  
  inline def apply(): Partition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partition]
  }
  
  extension [Self <: Partition](x: Self) {
    
    inline def setPartitionToken(value: String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
  }
}
