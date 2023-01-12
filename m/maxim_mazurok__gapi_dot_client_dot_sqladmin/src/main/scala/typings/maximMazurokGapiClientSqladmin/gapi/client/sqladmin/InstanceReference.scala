package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceReference extends StObject {
  
  /** The name of the Cloud SQL instance being referenced. This does not include the project ID. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it. */
  var project: js.UndefOr[String] = js.undefined
  
  /** The region of the Cloud SQL instance being referenced. */
  var region: js.UndefOr[String] = js.undefined
}
object InstanceReference {
  
  inline def apply(): InstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
