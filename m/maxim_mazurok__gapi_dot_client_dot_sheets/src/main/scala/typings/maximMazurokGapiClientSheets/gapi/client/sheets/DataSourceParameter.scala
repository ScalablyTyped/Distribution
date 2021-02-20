package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceParameter extends StObject {
  
  /**
    * Named parameter. Must be a legitimate identifier for the DataSource that supports it. For example, [BigQuery
    * identifier](https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical#identifiers).
    */
  var name: js.UndefOr[String] = js.native
  
  /** ID of a NamedRange. Its size must be 1x1. */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /** A range that contains the value of the parameter. Its size must be 1x1. */
  var range: js.UndefOr[GridRange] = js.native
}
object DataSourceParameter {
  
  @scala.inline
  def apply(): DataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameter]
  }
  
  @scala.inline
  implicit class DataSourceParameterMutableBuilder[Self <: DataSourceParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
