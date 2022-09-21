package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExfilResource extends StObject {
  
  /**
    * Subcomponents of the asset that is exfiltrated - these could be URIs used during exfiltration, table names, databases, filenames, etc. For example, multiple tables may be
    * exfiltrated from the same CloudSQL instance, or multiple files from the same Cloud Storage bucket.
    */
  var components: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Resource's URI (https://google.aip.dev/122#full-resource-names) */
  var name: js.UndefOr[String] = js.undefined
}
object ExfilResource {
  
  inline def apply(): ExfilResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExfilResource]
  }
  
  extension [Self <: ExfilResource](x: Self) {
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
