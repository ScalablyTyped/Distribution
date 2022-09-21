package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryNoncustodialDataSource
  extends StObject
     with DataSourceContainer {
  
  // User source or SharePoint site data source as non-custodial data source.
  var dataSource: js.UndefOr[NullableOption[DataSource]] = js.undefined
  
  // Operation entity that represents the latest indexing for the non-custodial data source.
  var lastIndexOperation: js.UndefOr[NullableOption[EdiscoveryIndexOperation]] = js.undefined
}
object EdiscoveryNoncustodialDataSource {
  
  inline def apply(): EdiscoveryNoncustodialDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryNoncustodialDataSource]
  }
  
  extension [Self <: EdiscoveryNoncustodialDataSource](x: Self) {
    
    inline def setDataSource(value: NullableOption[DataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setLastIndexOperation(value: NullableOption[EdiscoveryIndexOperation]): Self = StObject.set(x, "lastIndexOperation", value.asInstanceOf[js.Any])
    
    inline def setLastIndexOperationNull: Self = StObject.set(x, "lastIndexOperation", null)
    
    inline def setLastIndexOperationUndefined: Self = StObject.set(x, "lastIndexOperation", js.undefined)
  }
}
