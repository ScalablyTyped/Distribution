package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used when creating a new SODA document.
  */
trait SodaDocumentOptions extends StObject {
  
  /**
    * Must be supplied if the document in intended to be inserted into a collection with client-assigned keys. It should be undefined, otherwise.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * If the document has non-JSON content, then mediaType should be set to the desired media type. Using a MIME type is recommended.
    *
    * @default application/json
    */
  var mediaType: js.UndefOr[String] = js.undefined
}
object SodaDocumentOptions {
  
  inline def apply(): SodaDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaDocumentOptions]
  }
  
  extension [Self <: SodaDocumentOptions](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
