package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateContactsResponse extends StObject {
  
  /** A map of resource names to the contacts that were updated, unless the request `read_mask` is empty. */
  var updateResult: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.people.gapi.client.people.PersonResponse} */ js.Any
  ] = js.undefined
}
object BatchUpdateContactsResponse {
  
  inline def apply(): BatchUpdateContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateContactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateContactsResponse] (val x: Self) extends AnyVal {
    
    inline def setUpdateResult(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.people.gapi.client.people.PersonResponse} */ js.Any
    ): Self = StObject.set(x, "updateResult", value.asInstanceOf[js.Any])
    
    inline def setUpdateResultUndefined: Self = StObject.set(x, "updateResult", js.undefined)
  }
}
