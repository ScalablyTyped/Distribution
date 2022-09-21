package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZoneServiceDirectoryConfigNamespace extends StObject {
  
  /** The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only. */
  var deletionTime: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URL of the namespace associated with the zone. Format must be
    * https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace}
    */
  var namespaceUrl: js.UndefOr[String] = js.undefined
}
object ManagedZoneServiceDirectoryConfigNamespace {
  
  inline def apply(): ManagedZoneServiceDirectoryConfigNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneServiceDirectoryConfigNamespace]
  }
  
  extension [Self <: ManagedZoneServiceDirectoryConfigNamespace](x: Self) {
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNamespaceUrl(value: String): Self = StObject.set(x, "namespaceUrl", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUrlUndefined: Self = StObject.set(x, "namespaceUrl", js.undefined)
  }
}
