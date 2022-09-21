package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurgeBySubject
  extends StObject
     with PurgeOpts {
  
  var filter: String
}
object PurgeBySubject {
  
  inline def apply(filter: String): PurgeBySubject = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeBySubject]
  }
  
  extension [Self <: PurgeBySubject](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
