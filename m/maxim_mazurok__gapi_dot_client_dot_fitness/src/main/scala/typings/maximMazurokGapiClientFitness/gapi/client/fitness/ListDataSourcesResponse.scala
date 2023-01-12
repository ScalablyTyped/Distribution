package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSourcesResponse extends StObject {
  
  /** A previously created data source. */
  var dataSource: js.UndefOr[js.Array[DataSource]] = js.undefined
}
object ListDataSourcesResponse {
  
  inline def apply(): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: js.Array[DataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: DataSource*): Self = StObject.set(x, "dataSource", js.Array(value*))
  }
}
