package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used when creating a new SODA document.
  */
@js.native
trait SodaDocumentOptions extends StObject {
  
  /**
    * Must be supplied if the document in intended to be inserted into a collection with client-assigned keys. It should be undefined, otherwise.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * If the document has non-JSON content, then mediaType should be set to the desired media type. Using a MIME type is recommended.
    *
    * @default application/json
    */
  var mediaType: js.UndefOr[String] = js.native
}
object SodaDocumentOptions {
  
  @scala.inline
  def apply(): SodaDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaDocumentOptions]
  }
  
  @scala.inline
  implicit class SodaDocumentOptionsMutableBuilder[Self <: SodaDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
