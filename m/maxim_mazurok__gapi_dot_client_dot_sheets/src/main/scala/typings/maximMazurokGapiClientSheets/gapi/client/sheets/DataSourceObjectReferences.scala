package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceObjectReferences extends js.Object {
  
  /** The references. */
  var references: js.UndefOr[js.Array[DataSourceObjectReference]] = js.native
}
object DataSourceObjectReferences {
  
  @scala.inline
  def apply(): DataSourceObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceObjectReferences]
  }
  
  @scala.inline
  implicit class DataSourceObjectReferencesOps[Self <: DataSourceObjectReferences] (val x: Self) extends AnyVal {
    
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
    def setReferencesVarargs(value: DataSourceObjectReference*): Self = this.set("references", js.Array(value :_*))
    
    @scala.inline
    def setReferences(value: js.Array[DataSourceObjectReference]): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
}
