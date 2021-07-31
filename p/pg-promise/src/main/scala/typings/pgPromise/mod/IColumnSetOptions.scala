package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnSetOptions extends StObject {
  
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  var table: js.UndefOr[String | ITable | TableName] = js.undefined
}
object IColumnSetOptions {
  
  @scala.inline
  def apply(): IColumnSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnSetOptions]
  }
  
  @scala.inline
  implicit class IColumnSetOptionsMutableBuilder[Self <: IColumnSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setTable(value: String | ITable | TableName): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
