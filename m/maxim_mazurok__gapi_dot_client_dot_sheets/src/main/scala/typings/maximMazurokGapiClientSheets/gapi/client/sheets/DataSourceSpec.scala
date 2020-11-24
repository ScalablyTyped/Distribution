package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSpec extends js.Object {
  
  /** A BigQueryDataSourceSpec. */
  var bigQuery: js.UndefOr[BigQueryDataSourceSpec] = js.native
  
  /** The parameters of the data source, used when querying the data source. */
  var parameters: js.UndefOr[js.Array[DataSourceParameter]] = js.native
}
object DataSourceSpec {
  
  @scala.inline
  def apply(): DataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSpec]
  }
  
  @scala.inline
  implicit class DataSourceSpecOps[Self <: DataSourceSpec] (val x: Self) extends AnyVal {
    
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
    def setBigQuery(value: BigQueryDataSourceSpec): Self = this.set("bigQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigQuery: Self = this.set("bigQuery", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DataSourceParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[DataSourceParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
