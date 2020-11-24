package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceParameter extends js.Object {
  
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
  implicit class DataSourceParameterOps[Self <: DataSourceParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
