package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsSource extends StObject {
  
  /** Required. Source data URI. For example, `gs://my_bucket/my_object`. */
  var inputUri: js.UndefOr[String] = js.undefined
}
object GcsSource {
  
  inline def apply(): GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsSource]
  }
  
  extension [Self <: GcsSource](x: Self) {
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
  }
}
