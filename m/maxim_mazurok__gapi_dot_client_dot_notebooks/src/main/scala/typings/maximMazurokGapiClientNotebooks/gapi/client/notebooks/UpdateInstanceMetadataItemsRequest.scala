package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceMetadataItemsRequest extends StObject {
  
  /** Metadata items to add/update for the instance. */
  var items: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object UpdateInstanceMetadataItemsRequest {
  
  inline def apply(): UpdateInstanceMetadataItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceMetadataItemsRequest]
  }
  
  extension [Self <: UpdateInstanceMetadataItemsRequest](x: Self) {
    
    inline def setItems(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
