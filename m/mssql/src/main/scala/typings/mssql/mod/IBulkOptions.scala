package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBulkOptions extends StObject {
  
  /** Honors constraints during bulk load, using T-SQL CHECK_CONSTRAINTS. (default: false) */
  var checkConstraints: js.UndefOr[Boolean] = js.undefined
  
  /** Honors insert triggers during bulk load, using the T-SQL FIRE_TRIGGERS. (default: false) */
  var fireTriggers: js.UndefOr[Boolean] = js.undefined
  
  /** Honors null value passed, ignores the default values set on table, using T-SQL KEEP_NULLS. (default: false) */
  var keepNulls: js.UndefOr[Boolean] = js.undefined
  
  /** Places a bulk update(BU) lock on table while performing bulk load, using T-SQL TABLOCK. (default: false) */
  var tableLock: js.UndefOr[Boolean] = js.undefined
}
object IBulkOptions {
  
  @scala.inline
  def apply(): IBulkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBulkOptions]
  }
  
  @scala.inline
  implicit class IBulkOptionsMutableBuilder[Self <: IBulkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckConstraints(value: Boolean): Self = StObject.set(x, "checkConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckConstraintsUndefined: Self = StObject.set(x, "checkConstraints", js.undefined)
    
    @scala.inline
    def setFireTriggers(value: Boolean): Self = StObject.set(x, "fireTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireTriggersUndefined: Self = StObject.set(x, "fireTriggers", js.undefined)
    
    @scala.inline
    def setKeepNulls(value: Boolean): Self = StObject.set(x, "keepNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepNullsUndefined: Self = StObject.set(x, "keepNulls", js.undefined)
    
    @scala.inline
    def setTableLock(value: Boolean): Self = StObject.set(x, "tableLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLockUndefined: Self = StObject.set(x, "tableLock", js.undefined)
  }
}
