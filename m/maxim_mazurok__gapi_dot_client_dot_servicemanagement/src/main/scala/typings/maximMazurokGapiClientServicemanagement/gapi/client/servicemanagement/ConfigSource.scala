package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSource extends StObject {
  
  /** Set of source configuration files that are used to generate a service configuration (`google.api.Service`). */
  var files: js.UndefOr[js.Array[ConfigFile]] = js.undefined
  
  /** A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. If empty, the server may choose to generate one instead. */
  var id: js.UndefOr[String] = js.undefined
}
object ConfigSource {
  
  inline def apply(): ConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSource]
  }
  
  extension [Self <: ConfigSource](x: Self) {
    
    inline def setFiles(value: js.Array[ConfigFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: ConfigFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
