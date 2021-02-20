package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFilterSpec extends StObject {
  
  /** The column offset of the source range. */
  var columnOffsetIndex: js.UndefOr[Double] = js.native
  
  /** The reference to the data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The criteria for the column. */
  var filterCriteria: js.UndefOr[PivotFilterCriteria] = js.native
}
object PivotFilterSpec {
  
  @scala.inline
  def apply(): PivotFilterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilterSpec]
  }
  
  @scala.inline
  implicit class PivotFilterSpecMutableBuilder[Self <: PivotFilterSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnOffsetIndex(value: Double): Self = StObject.set(x, "columnOffsetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOffsetIndexUndefined: Self = StObject.set(x, "columnOffsetIndex", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setFilterCriteria(value: PivotFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
  }
}
