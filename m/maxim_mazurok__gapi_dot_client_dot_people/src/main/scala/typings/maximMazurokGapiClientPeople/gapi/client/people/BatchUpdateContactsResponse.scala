package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateContactsResponse extends StObject {
  
  /** A map of resource names to the contacts that were updated, unless the request `read_mask` is empty. */
  var updateResult: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.people.gapi.client.people.PersonResponse}
    */ typings.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.BatchUpdateContactsResponse & TopLevel[Any]
  ] = js.undefined
}
object BatchUpdateContactsResponse {
  
  inline def apply(): BatchUpdateContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateContactsResponse]
  }
  
  extension [Self <: BatchUpdateContactsResponse](x: Self) {
    
    inline def setUpdateResult(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.people.gapi.client.people.PersonResponse}
      */ typings.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.BatchUpdateContactsResponse & TopLevel[Any]
    ): Self = StObject.set(x, "updateResult", value.asInstanceOf[js.Any])
    
    inline def setUpdateResultUndefined: Self = StObject.set(x, "updateResult", js.undefined)
  }
}
