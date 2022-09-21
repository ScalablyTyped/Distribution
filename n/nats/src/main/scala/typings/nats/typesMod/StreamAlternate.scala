package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamAlternate extends StObject {
  
  var cluster: String
  
  var name: String
}
object StreamAlternate {
  
  inline def apply(cluster: String, name: String): StreamAlternate = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamAlternate]
  }
  
  extension [Self <: StreamAlternate](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
