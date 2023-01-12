package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  /**
    * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover
    * replica when the status is true.
    */
  var available: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn't include the project ID. */
  var name: js.UndefOr[String] = js.undefined
}
object Available {
  
  inline def apply(): Available = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
