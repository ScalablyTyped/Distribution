package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBulkOptions extends js.Object {
  
  /** Honors constraints during bulk load, using T-SQL CHECK_CONSTRAINTS. (default: false) */
  var checkConstraints: js.UndefOr[Boolean] = js.native
  
  /** Honors insert triggers during bulk load, using the T-SQL FIRE_TRIGGERS. (default: false) */
  var fireTriggers: js.UndefOr[Boolean] = js.native
  
  /** Honors null value passed, ignores the default values set on table, using T-SQL KEEP_NULLS. (default: false) */
  var keepNulls: js.UndefOr[Boolean] = js.native
  
  /** Places a bulk update(BU) lock on table while performing bulk load, using T-SQL TABLOCK. (default: false) */
  var tableLock: js.UndefOr[Boolean] = js.native
}
object IBulkOptions {
  
  @scala.inline
  def apply(): IBulkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBulkOptions]
  }
  
  @scala.inline
  implicit class IBulkOptionsOps[Self <: IBulkOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckConstraints(value: Boolean): Self = this.set("checkConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckConstraints: Self = this.set("checkConstraints", js.undefined)
    
    @scala.inline
    def setFireTriggers(value: Boolean): Self = this.set("fireTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFireTriggers: Self = this.set("fireTriggers", js.undefined)
    
    @scala.inline
    def setKeepNulls(value: Boolean): Self = this.set("keepNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepNulls: Self = this.set("keepNulls", js.undefined)
    
    @scala.inline
    def setTableLock(value: Boolean): Self = this.set("tableLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLock: Self = this.set("tableLock", js.undefined)
  }
}
