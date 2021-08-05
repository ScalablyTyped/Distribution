package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoClientCommonOption extends StObject {
  
  /** Do not make the db an event listener to the original connection. */
  var noListener: js.UndefOr[Boolean] = js.undefined
  
  /** Control if you want to return a cached instance or have a new one created */
  var returnNonCachedInstance: js.UndefOr[Boolean] = js.undefined
}
object MongoClientCommonOption {
  
  inline def apply(): MongoClientCommonOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientCommonOption]
  }
  
  extension [Self <: MongoClientCommonOption](x: Self) {
    
    inline def setNoListener(value: Boolean): Self = StObject.set(x, "noListener", value.asInstanceOf[js.Any])
    
    inline def setNoListenerUndefined: Self = StObject.set(x, "noListener", js.undefined)
    
    inline def setReturnNonCachedInstance(value: Boolean): Self = StObject.set(x, "returnNonCachedInstance", value.asInstanceOf[js.Any])
    
    inline def setReturnNonCachedInstanceUndefined: Self = StObject.set(x, "returnNonCachedInstance", js.undefined)
  }
}
