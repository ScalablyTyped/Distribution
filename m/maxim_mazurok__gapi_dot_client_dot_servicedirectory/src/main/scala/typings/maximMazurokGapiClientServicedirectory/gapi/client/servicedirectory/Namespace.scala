package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  /**
    * Optional. Resource labels associated with this Namespace. No more than 64 user labels can be associated with a given resource. Label keys and values can be no longer than 63
    * characters.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Namespace & TopLevel[js.Any]
  ] = js.undefined
  
  /** Immutable. The resource name for the namespace in the format 'projects/∗/locations/∗/namespaces/ *'. */
  var name: js.UndefOr[String] = js.undefined
}
object Namespace {
  
  inline def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.Namespace & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
