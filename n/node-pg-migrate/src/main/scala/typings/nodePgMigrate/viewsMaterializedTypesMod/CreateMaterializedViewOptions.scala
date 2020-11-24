package typings.nodePgMigrate.viewsMaterializedTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMaterializedViewOptions extends IfNotExistsOption {
  
  var columns: js.UndefOr[String | js.Array[String]] = js.native
  
  var data: js.UndefOr[Boolean] = js.native
  
  var storageParameters: js.UndefOr[StorageParameters] = js.native
  
  var tablespace: js.UndefOr[String] = js.native
}
object CreateMaterializedViewOptions {
  
  @scala.inline
  def apply(): CreateMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMaterializedViewOptions]
  }
  
  @scala.inline
  implicit class CreateMaterializedViewOptionsOps[Self <: CreateMaterializedViewOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: String | js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setStorageParameters(value: StorageParameters): Self = this.set("storageParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageParameters: Self = this.set("storageParameters", js.undefined)
    
    @scala.inline
    def setTablespace(value: String): Self = this.set("tablespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablespace: Self = this.set("tablespace", js.undefined)
  }
}
