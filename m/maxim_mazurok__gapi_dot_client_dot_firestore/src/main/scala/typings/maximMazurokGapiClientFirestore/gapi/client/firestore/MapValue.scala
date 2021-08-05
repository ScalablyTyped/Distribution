package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValue extends StObject {
  
  /**
    * The map's fields. The map keys represent field names. Field names matching the regular expression `__.*__` are reserved. Reserved field names are forbidden except in certain
    * documented contexts. The map keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.firestore.gapi.client.firestore.Value}
    */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.MapValue & TopLevel[js.Any]
  ] = js.undefined
}
object MapValue {
  
  inline def apply(): MapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapValue]
  }
  
  extension [Self <: MapValue](x: Self) {
    
    inline def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.firestore.gapi.client.firestore.Value}
      */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.MapValue & TopLevel[js.Any]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
