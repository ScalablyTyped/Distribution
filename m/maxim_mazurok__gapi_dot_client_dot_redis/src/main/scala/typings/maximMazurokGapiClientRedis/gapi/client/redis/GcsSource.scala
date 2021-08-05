package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsSource extends StObject {
  
  /** Required. Source data URI. (e.g. 'gs://my_bucket/my_object'). */
  var uri: js.UndefOr[String] = js.undefined
}
object GcsSource {
  
  inline def apply(): GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsSource]
  }
  
  extension [Self <: GcsSource](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
