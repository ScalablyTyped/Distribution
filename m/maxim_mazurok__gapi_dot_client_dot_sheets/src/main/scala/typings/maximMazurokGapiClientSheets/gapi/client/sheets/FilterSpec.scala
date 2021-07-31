package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterSpec extends StObject {
  
  /** The column index. */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /** Reference to a data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.undefined
  
  /** The criteria for the column. */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.undefined
}
object FilterSpec {
  
  @scala.inline
  def apply(): FilterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSpec]
  }
  
  @scala.inline
  implicit class FilterSpecMutableBuilder[Self <: FilterSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
  }
}
