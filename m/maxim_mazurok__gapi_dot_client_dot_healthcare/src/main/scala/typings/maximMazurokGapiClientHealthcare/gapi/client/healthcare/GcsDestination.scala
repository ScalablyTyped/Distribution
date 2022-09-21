package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsDestination extends StObject {
  
  /** The format of the exported HL7v2 message files. */
  var contentStructure: js.UndefOr[String] = js.undefined
  
  /** Specifies the parts of the Message resource to include in the export. If not specified, FULL is used. */
  var messageView: js.UndefOr[String] = js.undefined
  
  /**
    * URI of an existing Cloud Storage directory where the server writes result files, in the format `gs://{bucket-id}/{path/to/destination/dir}`. If there is no trailing slash, the
    * service appends one when composing the object path.
    */
  var uriPrefix: js.UndefOr[String] = js.undefined
}
object GcsDestination {
  
  inline def apply(): GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsDestination]
  }
  
  extension [Self <: GcsDestination](x: Self) {
    
    inline def setContentStructure(value: String): Self = StObject.set(x, "contentStructure", value.asInstanceOf[js.Any])
    
    inline def setContentStructureUndefined: Self = StObject.set(x, "contentStructure", js.undefined)
    
    inline def setMessageView(value: String): Self = StObject.set(x, "messageView", value.asInstanceOf[js.Any])
    
    inline def setMessageViewUndefined: Self = StObject.set(x, "messageView", js.undefined)
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
